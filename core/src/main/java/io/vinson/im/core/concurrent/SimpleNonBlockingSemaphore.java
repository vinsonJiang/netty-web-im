package io.vinson.im.core.concurrent;

public class SimpleNonBlockingSemaphore implements NonBlockingSemaphore {

    String name;
    int maxResources;
    int acquiredResources;

    public SimpleNonBlockingSemaphore(String name, int maxResources) {
        this.name = name;
        this.maxResources = maxResources;
        this.acquiredResources = 0;
    }

    @Override
    public boolean acquire() {
        return acquire(1);
    }

    @Override
    public boolean acquire(int resources) {
        if (acquiredResources + resources <= maxResources) {
            acquiredResources += resources;
            return true;
        }
        return false;
    }

    @Override
    public boolean release() {
        return release(1);
    }

    @Override
    public boolean release(int resources) {
        if (acquiredResources - resources >= 0) {
            acquiredResources -= resources;
            return true;
        }
        return false;
    }

    /**
     *
     */
    public static class Factory implements NonBlockingSemaphore.Factory {
        public Factory() {
        }

        @Override
        public NonBlockingSemaphore createSemaphore(String name, int maxResources) {
            return new SimpleNonBlockingSemaphore(name, maxResources);
        }
    }

}
