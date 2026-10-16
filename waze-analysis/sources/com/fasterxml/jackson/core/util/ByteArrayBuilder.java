package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ByteArrayBuilder extends OutputStream implements BufferRecycler.Gettable {
    public static final byte[] NO_BYTES = new byte[0];
    private final BufferRecycler _bufferRecycler;
    private byte[] _currBlock;
    private int _currBlockPtr;
    private final LinkedList<byte[]> _pastBlocks;
    private int _pastLen;

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i2) {
        byte[] bArrAllocByteBuffer;
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = bufferRecycler;
        if (bufferRecycler == null) {
            bArrAllocByteBuffer = new byte[i2 > 131072 ? 131072 : i2];
        } else {
            bArrAllocByteBuffer = bufferRecycler.allocByteBuffer(2);
        }
        this._currBlock = bArrAllocByteBuffer;
    }

    private void _allocMore() {
        int length = this._pastLen + this._currBlock.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this._pastLen = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this._pastBlocks.add(this._currBlock);
        this._currBlock = new byte[iMax];
        this._currBlockPtr = 0;
    }

    public static ByteArrayBuilder fromInitial(byte[] bArr, int i2) {
        return new ByteArrayBuilder(null, bArr, i2);
    }

    public void append(int i2) {
        if (this._currBlockPtr >= this._currBlock.length) {
            _allocMore();
        }
        byte[] bArr = this._currBlock;
        int i3 = this._currBlockPtr;
        this._currBlockPtr = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    public void appendThreeBytes(int i2) {
        int i3 = this._currBlockPtr;
        int i4 = i3 + 2;
        byte[] bArr = this._currBlock;
        int i5 = i2 >> 16;
        int i6 = i2 >> 8;
        if (i4 >= bArr.length) {
            append(i5);
            append(i6);
            append(i2);
            return;
        }
        int i7 = i3 + 1;
        this._currBlockPtr = i7;
        bArr[i3] = (byte) i5;
        int i8 = i3 + 2;
        this._currBlockPtr = i8;
        bArr[i7] = (byte) i6;
        this._currBlockPtr = i3 + 3;
        bArr[i8] = (byte) i2;
    }

    public void appendTwoBytes(int i2) {
        int i3 = this._currBlockPtr;
        int i4 = i3 + 1;
        byte[] bArr = this._currBlock;
        int i5 = i2 >> 8;
        if (i4 >= bArr.length) {
            append(i5);
            append(i2);
        } else {
            this._currBlockPtr = i4;
            bArr[i3] = (byte) i5;
            this._currBlockPtr = i3 + 2;
            bArr[i4] = (byte) i2;
        }
    }

    @Override // com.fasterxml.jackson.core.util.BufferRecycler.Gettable
    public BufferRecycler bufferRecycler() {
        return this._bufferRecycler;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public byte[] completeAndCoalesce(int i2) {
        this._currBlockPtr = i2;
        return toByteArray();
    }

    public byte[] finishCurrentSegment() {
        _allocMore();
        return this._currBlock;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public byte[] getClearAndRelease() {
        byte[] byteArray = toByteArray();
        release();
        return byteArray;
    }

    public byte[] getCurrentSegment() {
        return this._currBlock;
    }

    public int getCurrentSegmentLength() {
        return this._currBlockPtr;
    }

    public void release() {
        byte[] bArr;
        reset();
        BufferRecycler bufferRecycler = this._bufferRecycler;
        if (bufferRecycler == null || (bArr = this._currBlock) == null) {
            return;
        }
        bufferRecycler.releaseByteBuffer(2, bArr);
        this._currBlock = null;
    }

    public void reset() {
        this._pastLen = 0;
        this._currBlockPtr = 0;
        if (this._pastBlocks.isEmpty()) {
            return;
        }
        this._pastBlocks.clear();
    }

    public byte[] resetAndGetFirstSegment() {
        reset();
        return this._currBlock;
    }

    public void setCurrentSegmentLength(int i2) {
        this._currBlockPtr = i2;
    }

    public byte[] toByteArray() {
        int i2 = this._pastLen + this._currBlockPtr;
        if (i2 == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i2];
        Iterator<byte[]> it = this._pastBlocks.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i3, length);
            i3 += length;
        }
        System.arraycopy(this._currBlock, 0, bArr, i3, this._currBlockPtr);
        int i4 = i3 + this._currBlockPtr;
        if (i4 == i2) {
            if (!this._pastBlocks.isEmpty()) {
                reset();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i2 + ", copied " + i4 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        while (true) {
            int iMin = Math.min(this._currBlock.length - this._currBlockPtr, i3);
            if (iMin > 0) {
                System.arraycopy(bArr, i2, this._currBlock, this._currBlockPtr, iMin);
                i2 += iMin;
                this._currBlockPtr += iMin;
                i3 -= iMin;
            }
            if (i3 <= 0) {
                return;
            } else {
                _allocMore();
            }
        }
    }

    public ByteArrayBuilder(int i2) {
        this(null, i2);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    private ByteArrayBuilder(BufferRecycler bufferRecycler, byte[] bArr, int i2) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = null;
        this._currBlock = bArr;
        this._currBlockPtr = i2;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        append(i2);
    }
}
