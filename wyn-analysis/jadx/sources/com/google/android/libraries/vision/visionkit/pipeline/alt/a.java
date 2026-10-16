package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface a {
    void close(long j8, long j10, long j11, long j12, long j13);

    long initialize(byte[] bArr, long j8, long j10, long j11, long j12, long j13);

    long initializeFrameBufferReleaseCallback(long j8);

    long initializeFrameManager();

    long initializeIsolationCallback();

    long initializeResultsCallback();

    byte[] process(long j8, long j10, long j11, byte[] bArr, int i5, int i10, int i11, int i12);

    byte[] processBitmap(long j8, long j10, Bitmap bitmap, int i5, int i10, int i11, int i12);

    byte[] processYuvFrame(long j8, long j10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i5, int i10, int i11, int i12, int i13, int i14);

    void start(long j8);

    boolean stop(long j8);

    void waitUntilIdle(long j8);

    void zba();
}
