package com.google.android.libraries.vision.visionkit.pipeline.alt;

import A.C0230x;
import H7.E;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes4.dex */
class NativePipelineImpl implements a {

    /* renamed from: a, reason: collision with root package name */
    public zbtp f26748a;

    /* renamed from: b, reason: collision with root package name */
    public b f26749b;

    /* renamed from: c, reason: collision with root package name */
    public b f26750c;

    /* renamed from: d, reason: collision with root package name */
    public b f26751d;

    public NativePipelineImpl(b bVar, b bVar2, b bVar3, zbtp zbtpVar) {
        this.f26749b = bVar;
        this.f26750c = bVar2;
        this.f26751d = bVar3;
        this.f26748a = zbtpVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void close(long j8, long j10, long j11, long j12, long j13);

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void closeFileDescriptor(int i5) {
        this.f26751d.getClass();
        Log.w("VKP", "closeFileDescriptor called but is not available for this pipeline. Ignoring call.");
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initialize(byte[] bArr, long j8, long j10, long j11, long j12, long j13);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeFrameBufferReleaseCallback(long j8);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeFrameManager();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeIsolationCallback();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeResultsCallback();

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onReleaseAtTimestampUs(long j8) {
        C0230x c0230x = this.f26749b.f26752a;
        synchronized (c0230x) {
            ((HashMap) c0230x.f188c).remove(Long.valueOf(j8));
        }
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onResult(byte[] bArr) {
        try {
            E eB = E.b(bArr, this.f26748a);
            b bVar = this.f26750c;
            bVar.getClass();
            zbcq.zba.zbb(bVar, "Pipeline received results: ".concat(String.valueOf(eB)), new Object[0]);
        } catch (zbuq e7) {
            zbcq.zba.zba(e7, "Error in result from JNI layer", new Object[0]);
        }
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public int openFileDescriptor(String str) {
        this.f26751d.getClass();
        Log.w("VKP", "openFileDescriptor called but is not available for this pipeline. Ignoring call.");
        return -1;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] process(long j8, long j10, long j11, byte[] bArr, int i5, int i10, int i11, int i12);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] processBitmap(long j8, long j10, Bitmap bitmap, int i5, int i10, int i11, int i12);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] processYuvFrame(long j8, long j10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i5, int i10, int i11, int i12, int i13, int i14);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void start(long j8) throws PipelineException;

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native boolean stop(long j8);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void waitUntilIdle(long j8) throws PipelineException;

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void zba() {
        this.f26748a = null;
        this.f26749b = null;
        this.f26750c = null;
        this.f26751d = null;
    }
}
