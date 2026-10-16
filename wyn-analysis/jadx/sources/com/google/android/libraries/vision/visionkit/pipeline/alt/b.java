package com.google.android.libraries.vision.visionkit.pipeline.alt;

import A.C0230x;
import H7.C0575n;
import H7.C0581u;
import H7.E;
import android.graphics.Bitmap;
import androidx.fragment.app.X;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0230x f26752a;

    /* renamed from: b, reason: collision with root package name */
    public final a f26753b;

    /* renamed from: c, reason: collision with root package name */
    public long f26754c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26755d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26756e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26757f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26758g;

    /* renamed from: h, reason: collision with root package name */
    public final zbtp f26759h;

    public b(C0581u c0581u) {
        zbtp zbtpVarZbb = zbtp.zbb();
        zbtpVarZbb = zbtpVarZbb == null ? zbtp.zba() : zbtpVarZbb;
        if (c0581u.f()) {
            this.f26753b = new X(2);
        } else if (c0581u.e()) {
            this.f26753b = new NativePipelineImpl(this, this, this, zbtpVarZbb);
        } else {
            NativePipelineImpl nativePipelineImpl = new NativePipelineImpl(this, this, this, zbtpVarZbb);
            System.loadLibrary("mlkit_google_ocr_pipeline");
            this.f26753b = nativePipelineImpl;
        }
        if (c0581u.zbi()) {
            this.f26752a = new C0230x(c0581u.a());
        } else {
            this.f26752a = new C0230x(10);
        }
        this.f26759h = zbtpVarZbb;
        long jInitializeFrameManager = this.f26753b.initializeFrameManager();
        this.f26755d = jInitializeFrameManager;
        long jInitializeFrameBufferReleaseCallback = this.f26753b.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
        this.f26756e = jInitializeFrameBufferReleaseCallback;
        long jInitializeResultsCallback = this.f26753b.initializeResultsCallback();
        this.f26757f = jInitializeResultsCallback;
        long jInitializeIsolationCallback = this.f26753b.initializeIsolationCallback();
        this.f26758g = jInitializeIsolationCallback;
        this.f26754c = this.f26753b.initialize(c0581u.zbl(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, jInitializeIsolationCallback, 0L, 0L);
    }

    public final zbki a(C0575n c0575n) {
        if (this.f26754c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        C0230x c0230x = this.f26752a;
        long j8 = c0575n.f4981b;
        synchronized (c0230x) {
            if (((HashMap) c0230x.f188c).size() == c0230x.f187b) {
                zbcq.zba.zbc(c0230x, "Buffer is full. Drop frame " + j8, new Object[0]);
            } else {
                ((HashMap) c0230x.f188c).put(Long.valueOf(j8), c0575n);
                byte[] bArrProcess = this.f26753b.process(this.f26754c, this.f26755d, c0575n.f4981b, c0575n.f4980a, c0575n.f4982c.zbb(), c0575n.f4982c.zba(), 1, c0575n.f4983d - 1);
                if (bArrProcess != null) {
                    try {
                        return zbki.zbe(E.b(bArrProcess, this.f26759h));
                    } catch (zbuq e7) {
                        throw new IllegalStateException("Could not parse results", e7);
                    }
                }
            }
        }
        return zbki.zbd();
    }

    public final zbki b(long j8, Bitmap bitmap, int i5) {
        if (this.f26754c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
        }
        byte[] bArrProcessBitmap = this.f26753b.processBitmap(this.f26754c, j8, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i5 - 1);
        if (bArrProcessBitmap == null) {
            return zbki.zbd();
        }
        try {
            return zbki.zbe(E.b(bArrProcessBitmap, this.f26759h));
        } catch (zbuq e7) {
            throw new IllegalStateException("Could not parse results", e7);
        }
    }

    public final zbki c(long j8, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i5, int i10, int i11, int i12, int i13, int i14) {
        if (this.f26754c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalStateException("Byte buffers are not direct.");
        }
        byte[] bArrProcessYuvFrame = this.f26753b.processYuvFrame(this.f26754c, j8, byteBuffer, byteBuffer2, byteBuffer3, i5, i10, i11, i12, i13, i14 - 1);
        if (bArrProcessYuvFrame == null) {
            return zbki.zbd();
        }
        try {
            return zbki.zbe(E.b(bArrProcessYuvFrame, this.f26759h));
        } catch (zbuq e7) {
            throw new IllegalStateException("Could not parse results", e7);
        }
    }
}
