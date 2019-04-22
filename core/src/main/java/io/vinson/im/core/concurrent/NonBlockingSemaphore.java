package io.vinson.im.core.concurrent;

public interface NonBlockingSemaphore {

    public boolean acquire();

    public boolean acquire(int resources);

    public boolean release();

    public boolean release(int resources);

    public interface Factory {

        public NonBlockingSemaphore createSemaphore(String name, int maxResources);
    }
}
