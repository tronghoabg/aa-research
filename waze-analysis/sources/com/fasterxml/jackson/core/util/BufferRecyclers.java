package com.fasterxml.jackson.core.util;

import androidx.credentials.provider.CredentialEntry;
import java.lang.ref.SoftReference;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class BufferRecyclers {
    private static final ThreadLocalBufferManager _bufferRecyclerTracker;
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef;

    static {
        ThreadLocalBufferManager threadLocalBufferManagerInstance = null;
        try {
            if (CredentialEntry.TRUE_STRING.equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"))) {
                threadLocalBufferManagerInstance = ThreadLocalBufferManager.instance();
            }
        } catch (SecurityException unused) {
        }
        _bufferRecyclerTracker = threadLocalBufferManagerInstance;
        _recyclerRef = new ThreadLocal<>();
    }

    @Deprecated
    public static BufferRecycler getBufferRecycler() {
        ThreadLocal<SoftReference<BufferRecycler>> threadLocal = _recyclerRef;
        SoftReference<BufferRecycler> softReference = threadLocal.get();
        BufferRecycler bufferRecycler = softReference == null ? null : softReference.get();
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            ThreadLocalBufferManager threadLocalBufferManager = _bufferRecyclerTracker;
            threadLocal.set(threadLocalBufferManager != null ? threadLocalBufferManager.wrapAndTrack(bufferRecycler) : new SoftReference<>(bufferRecycler));
        }
        return bufferRecycler;
    }
}
