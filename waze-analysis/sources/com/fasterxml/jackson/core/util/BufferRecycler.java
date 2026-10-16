package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.RecyclerPool;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class BufferRecycler implements RecyclerPool.WithPool<BufferRecycler> {
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, 200, 200};
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;
    private RecyclerPool<BufferRecycler> _pool;

    /* compiled from: WazeSource */
    public interface Gettable {
        BufferRecycler bufferRecycler();
    }

    protected BufferRecycler(int i2, int i3) {
        this._byteBuffers = new AtomicReferenceArray<>(4);
        this._charBuffers = new AtomicReferenceArray<>(4);
    }

    public byte[] allocByteBuffer(int i2, int i3) {
        int iByteBufferLength = byteBufferLength(i2);
        if (iByteBufferLength <= 0) {
            iByteBufferLength = 0;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i2, null);
        return (andSet == null || andSet.length < iByteBufferLength) ? balloc(iByteBufferLength) : andSet;
    }

    public char[] allocCharBuffer(int i2, int i3) {
        int iCharBufferLength = charBufferLength(i2);
        if (i3 < iCharBufferLength) {
            i3 = iCharBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i2, null);
        return (andSet == null || andSet.length < i3) ? calloc(i3) : andSet;
    }

    protected byte[] balloc(int i2) {
        return new byte[i2];
    }

    protected int byteBufferLength(int i2) {
        return BYTE_BUFFER_LENGTHS[i2];
    }

    protected char[] calloc(int i2) {
        return new char[i2];
    }

    protected int charBufferLength(int i2) {
        return CHAR_BUFFER_LENGTHS[i2];
    }

    public void releaseByteBuffer(int i2, byte[] bArr) {
        byte[] bArr2 = this._byteBuffers.get(i2);
        if (bArr2 == null || bArr.length > bArr2.length) {
            this._byteBuffers.set(i2, bArr);
        }
    }

    public void releaseCharBuffer(int i2, char[] cArr) {
        char[] cArr2 = this._charBuffers.get(i2);
        if (cArr2 == null || cArr.length > cArr2.length) {
            this._charBuffers.set(i2, cArr);
        }
    }

    public void releaseToPool() {
        if (this._pool != null) {
            this._pool = null;
        }
    }

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i2) {
        return allocByteBuffer(i2, 0);
    }

    public final char[] allocCharBuffer(int i2) {
        return allocCharBuffer(i2, 0);
    }
}
