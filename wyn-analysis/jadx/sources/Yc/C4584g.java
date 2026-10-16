package yc;

import A.AbstractC0213f;
import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import a9.C1342b;
import ac.C1346a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kd.RunnableC3307c;
import md.J;
import o1.C3641c;
import od.A0;
import pb.RunnableC3790a;
import u0.w0;
import zc.AbstractC4660a;

/* renamed from: yc.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4584g implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public J3.g f48112a;

    /* renamed from: b, reason: collision with root package name */
    public int f48113b;

    /* renamed from: c, reason: collision with root package name */
    public C4577G f48114c;

    /* renamed from: d, reason: collision with root package name */
    public int f48115d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f48116e;

    /* renamed from: f, reason: collision with root package name */
    public final Lc.b f48117f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f48118g;

    /* renamed from: h, reason: collision with root package name */
    public final J f48119h;

    /* renamed from: i, reason: collision with root package name */
    public t6.q f48120i;

    /* renamed from: j, reason: collision with root package name */
    public final C1342b f48121j;
    public final Activity k;

    /* renamed from: l, reason: collision with root package name */
    public final C4585h f48122l;

    /* renamed from: m, reason: collision with root package name */
    public Handler f48123m;

    /* renamed from: n, reason: collision with root package name */
    public HandlerThread f48124n;

    /* renamed from: o, reason: collision with root package name */
    public w0 f48125o;

    /* renamed from: p, reason: collision with root package name */
    public CameraCaptureSession f48126p;

    /* renamed from: q, reason: collision with root package name */
    public ImageReader f48127q;

    /* renamed from: r, reason: collision with root package name */
    public E4.n f48128r;

    /* renamed from: s, reason: collision with root package name */
    public CaptureRequest.Builder f48129s;

    /* renamed from: t, reason: collision with root package name */
    public MediaRecorder f48130t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f48131u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f48132v;

    /* renamed from: w, reason: collision with root package name */
    public File f48133w;

    /* renamed from: x, reason: collision with root package name */
    public final S3.s f48134x;

    /* renamed from: y, reason: collision with root package name */
    public final b7.k f48135y;

    /* renamed from: z, reason: collision with root package name */
    public C0801q f48136z;

    public C4584g(Activity activity, io.flutter.embedding.engine.renderer.i iVar, C1342b c1342b, J j8, t6.q qVar, Lc.b bVar) {
        if (activity == null) {
            throw new IllegalStateException("No activity available!");
        }
        this.k = activity;
        this.f48116e = iVar;
        this.f48119h = j8;
        this.f48118g = activity.getApplicationContext();
        this.f48120i = qVar;
        this.f48121j = c1342b;
        this.f48117f = bVar;
        this.f48112a = J3.g.h(c1342b, qVar, activity, j8, bVar.f7075b);
        S3.s sVar = new S3.s(13, (char) 0);
        sVar.f11009b = new J5.n(2);
        sVar.f11010c = new J5.n(2);
        this.f48134x = sVar;
        b7.k kVar = new b7.k(9, false);
        this.f48135y = kVar;
        this.f48122l = new C4585h(this, sVar, kVar);
        if (this.f48124n != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f48124n = handlerThread;
        try {
            handlerThread.start();
        } catch (IllegalThreadStateException unused) {
        }
        this.f48123m = new Handler(this.f48124n.getLooper());
    }

    public final void a() {
        Log.i("Camera", "close");
        w0 w0Var = this.f48125o;
        if (w0Var != null) {
            ((CameraDevice) w0Var.f46405a).close();
            this.f48125o = null;
            this.f48126p = null;
        } else if (this.f48126p != null) {
            Log.i("Camera", "closeCaptureSession");
            this.f48126p.close();
            this.f48126p = null;
        }
        ImageReader imageReader = this.f48127q;
        if (imageReader != null) {
            imageReader.close();
            this.f48127q = null;
        }
        E4.n nVar = this.f48128r;
        if (nVar != null) {
            ((ImageReader) nVar.f2939c).close();
            this.f48128r = null;
        }
        MediaRecorder mediaRecorder = this.f48130t;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f48130t.release();
            this.f48130t = null;
        }
        HandlerThread handlerThread = this.f48124n;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f48124n = null;
        this.f48123m = null;
    }

    public final void b() {
        C4577G c4577g = this.f48114c;
        if (c4577g != null) {
            c4577g.f48090m.interrupt();
            c4577g.f48094q.quitSafely();
            GLES20.glDeleteBuffers(2, c4577g.f48084f, 0);
            GLES20.glDeleteTextures(1, c4577g.f48079a, 0);
            EGL14.eglDestroyContext(c4577g.f48088j, c4577g.k);
            EGL14.eglDestroySurface(c4577g.f48088j, c4577g.f48089l);
            GLES20.glDeleteProgram(c4577g.f48082d);
            c4577g.f48092o.release();
            this.f48114c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r9, java.lang.Runnable r10, android.view.Surface... r11) throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.C4584g.c(int, java.lang.Runnable, android.view.Surface[]):void");
    }

    public final void d() {
        Log.i("Camera", "lockAutoFocus");
        if (this.f48126p == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        this.f48129s.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.f48126p.capture(this.f48129s.build(), null, this.f48123m);
        } catch (CameraAccessException e7) {
            this.f48119h.w(e7.getMessage() == null ? "CameraAccessException occurred while locking autofocus." : e7.getMessage());
        }
    }

    public final void e() throws CameraAccessException {
        int iA;
        J j8 = this.f48119h;
        Log.i("Camera", "captureStillPicture");
        this.f48122l.f48138b = 5;
        w0 w0Var = this.f48125o;
        if (w0Var == null) {
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = ((CameraDevice) w0Var.f46405a).createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f48127q.getSurface());
            CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
            builderCreateCaptureRequest.set(key, (Rect) this.f48129s.get(key));
            Iterator it = this.f48112a.f5569a.values().iterator();
            while (it.hasNext()) {
                ((AbstractC4660a) it.next()).a(builderCreateCaptureRequest);
            }
            int i5 = this.f48112a.f().f6006d;
            CaptureRequest.Key key2 = CaptureRequest.JPEG_ORIENTATION;
            if (i5 == 0) {
                Jc.a aVar = this.f48112a.f().f6005c;
                iA = aVar.a(aVar.f6002e);
            } else {
                iA = this.f48112a.f().f6005c.a(i5);
            }
            builderCreateCaptureRequest.set(key2, Integer.valueOf(iA));
            C4583f c4583f = new C4583f(this);
            try {
                Log.i("Camera", "sending capture request");
                this.f48126p.capture(builderCreateCaptureRequest.build(), c4583f, this.f48123m);
            } catch (CameraAccessException e7) {
                j8.l(this.f48136z, "cameraAccess", e7.getMessage());
            }
        } catch (CameraAccessException e10) {
            j8.l(this.f48136z, "cameraAccess", e10.getMessage());
        }
    }

    public final void f(Integer num) {
        this.f48113b = num.intValue();
        Ic.a aVarE = this.f48112a.e();
        if (aVarE.f5442f < 0) {
            this.f48119h.w(wg.b.c(new StringBuilder("Camera with name \""), (String) this.f48120i.f45907b, "\" is not supported by this plugin."));
        } else {
            this.f48127q = ImageReader.newInstance(aVarE.f5438b.getWidth(), aVarE.f5438b.getHeight(), 256, 1);
            this.f48128r = new E4.n(aVarE.f5439c.getWidth(), aVarE.f5439c.getHeight(), this.f48113b);
            ((CameraManager) this.k.getSystemService("camera")).openCamera((String) this.f48120i.f45907b, new C4581d(this, aVarE), this.f48123m);
        }
    }

    public final void g(String str) {
        Lc.b bVar;
        int iC;
        EncoderProfiles encoderProfiles;
        Log.i("Camera", "prepareMediaRecorder");
        MediaRecorder mediaRecorder = this.f48130t;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        b();
        int i5 = this.f48112a.f().f6006d;
        boolean z2 = AbstractC4575E.f48077a >= 31;
        Lc.b bVar2 = this.f48117f;
        if (!z2 || this.f48112a.e().f5441e == null) {
            CamcorderProfile camcorderProfile = this.f48112a.e().f5440d;
            S3.i iVar = new S3.i(str, (Integer) bVar2.f7076c, (Integer) bVar2.f7077d, (Integer) bVar2.f7078e);
            bVar = new Lc.b();
            bVar.f7076c = camcorderProfile;
            bVar.f7077d = null;
            bVar.f7078e = iVar;
        } else {
            EncoderProfiles encoderProfiles2 = this.f48112a.e().f5441e;
            S3.i iVar2 = new S3.i(str, (Integer) bVar2.f7076c, (Integer) bVar2.f7077d, (Integer) bVar2.f7078e);
            bVar = new Lc.b();
            bVar.f7077d = encoderProfiles2;
            bVar.f7076c = null;
            bVar.f7078e = iVar2;
        }
        bVar.f7074a = bVar2.f7074a;
        if (i5 == 0) {
            Jc.a aVar = this.f48112a.f().f6005c;
            iC = aVar.c(aVar.f6002e);
        } else {
            iC = this.f48112a.f().f6005c.c(i5);
        }
        bVar.f7075b = iC;
        MediaRecorder mediaRecorder2 = new MediaRecorder();
        if (bVar.f7074a) {
            mediaRecorder2.setAudioSource(1);
        }
        mediaRecorder2.setVideoSource(2);
        boolean z10 = AbstractC4575E.f48077a >= 31;
        S3.i iVar3 = (S3.i) bVar.f7078e;
        Integer num = (Integer) iVar3.f10962b;
        Integer num2 = (Integer) iVar3.f10963c;
        Integer num3 = (Integer) iVar3.f10964d;
        if (!z10 || (encoderProfiles = (EncoderProfiles) bVar.f7077d) == null) {
            CamcorderProfile camcorderProfile2 = (CamcorderProfile) bVar.f7076c;
            if (camcorderProfile2 != null) {
                mediaRecorder2.setOutputFormat(camcorderProfile2.fileFormat);
                if (bVar.f7074a) {
                    mediaRecorder2.setAudioEncoder(camcorderProfile2.audioCodec);
                    mediaRecorder2.setAudioEncodingBitRate((num3 == null || num3.intValue() <= 0) ? camcorderProfile2.audioBitRate : num3.intValue());
                    mediaRecorder2.setAudioSamplingRate(camcorderProfile2.audioSampleRate);
                }
                mediaRecorder2.setVideoEncoder(camcorderProfile2.videoCodec);
                mediaRecorder2.setVideoEncodingBitRate((num2 == null || num2.intValue() <= 0) ? camcorderProfile2.videoBitRate : num2.intValue());
                mediaRecorder2.setVideoFrameRate((num == null || num.intValue() <= 0) ? camcorderProfile2.videoFrameRate : num.intValue());
                mediaRecorder2.setVideoSize(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
            }
        } else {
            mediaRecorder2.setOutputFormat(encoderProfiles.getRecommendedFileFormat());
            EncoderProfiles.VideoProfile videoProfileE = e1.c.e(((EncoderProfiles) bVar.f7077d).getVideoProfiles().get(0));
            if (bVar.f7074a) {
                EncoderProfiles.AudioProfile audioProfileE = F5.i.e(((EncoderProfiles) bVar.f7077d).getAudioProfiles().get(0));
                mediaRecorder2.setAudioEncoder(audioProfileE.getCodec());
                mediaRecorder2.setAudioEncodingBitRate((num3 == null || num3.intValue() <= 0) ? audioProfileE.getBitrate() : num3.intValue());
                mediaRecorder2.setAudioSamplingRate(audioProfileE.getSampleRate());
            }
            mediaRecorder2.setVideoEncoder(videoProfileE.getCodec());
            mediaRecorder2.setVideoEncodingBitRate((num2 == null || num2.intValue() <= 0) ? videoProfileE.getBitrate() : num2.intValue());
            mediaRecorder2.setVideoFrameRate((num == null || num.intValue() <= 0) ? videoProfileE.getFrameRate() : num.intValue());
            mediaRecorder2.setVideoSize(videoProfileE.getWidth(), videoProfileE.getHeight());
        }
        mediaRecorder2.setOutputFile((String) iVar3.f10961a);
        mediaRecorder2.setOrientationHint(bVar.f7075b);
        mediaRecorder2.prepare();
        this.f48130t = mediaRecorder2;
    }

    public final void h(Runnable runnable, InterfaceC4590m interfaceC4590m) {
        Log.i("Camera", "refreshPreviewCaptureSession");
        CameraCaptureSession cameraCaptureSession = this.f48126p;
        if (cameraCaptureSession == null) {
            Log.i("Camera", "refreshPreviewCaptureSession: captureSession not yet initialized, skipping preview capture session refresh.");
            return;
        }
        try {
            if (!this.f48132v) {
                cameraCaptureSession.setRepeatingRequest(this.f48129s.build(), this.f48122l, this.f48123m);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (CameraAccessException e7) {
            interfaceC4590m.onError(e7.getMessage());
        } catch (IllegalStateException e10) {
            interfaceC4590m.onError("Camera is closed: " + e10.getMessage());
        }
    }

    public final void i() {
        C4585h c4585h = this.f48122l;
        Log.i("Camera", "runPrecaptureSequence");
        try {
            CaptureRequest.Builder builder = this.f48129s;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder.set(key, 0);
            this.f48126p.capture(this.f48129s.build(), c4585h, this.f48123m);
            h(null, new C4580c(this, 1));
            c4585h.f48138b = 3;
            this.f48129s.set(key, 1);
            this.f48126p.capture(this.f48129s.build(), c4585h, this.f48123m);
        } catch (CameraAccessException e7) {
            e7.printStackTrace();
        }
    }

    public final void j(t6.q qVar) throws NumberFormatException {
        if (!this.f48131u) {
            throw new C4592o("setDescriptionWhileRecordingFailed", "Device was not recording", null);
        }
        if (AbstractC4575E.f48077a < 26) {
            throw new C4592o("setDescriptionWhileRecordingFailed", "Device does not support switching the camera while recording", null);
        }
        w0 w0Var = this.f48125o;
        if (w0Var != null) {
            ((CameraDevice) w0Var.f46405a).close();
            this.f48125o = null;
            this.f48126p = null;
        } else if (this.f48126p != null) {
            Log.i("Camera", "closeCaptureSession");
            this.f48126p.close();
            this.f48126p = null;
        }
        if (this.f48114c == null) {
            Ic.a aVarE = this.f48112a.e();
            this.f48114c = new C4577G(this.f48130t.getSurface(), aVarE.f5438b.getWidth(), aVarE.f5438b.getHeight(), new A0(this, 1));
        }
        this.f48120i = qVar;
        int i5 = this.f48117f.f7075b;
        J3.g gVarH = J3.g.h(this.f48121j, qVar, this.k, this.f48119h, i5);
        this.f48112a = gVarH;
        gVarH.f5569a.put("AUTO_FOCUS", new Ac.a(this.f48120i, true));
        n(this.f48120i);
        try {
            f(Integer.valueOf(this.f48113b));
        } catch (CameraAccessException e7) {
            throw new C4592o("setDescriptionWhileRecordingFailed", e7.getMessage(), null);
        }
    }

    public final void k(C0799o c0799o, int i5) {
        AbstractC4660a abstractC4660a = (AbstractC4660a) this.f48112a.f5569a.get("FLASH");
        Objects.requireNonNull(abstractC4660a);
        Ec.a aVar = (Ec.a) abstractC4660a;
        aVar.f3643b = i5;
        aVar.a(this.f48129s);
        h(new RunnableC3307c(c0799o, 27), new C3641c(c0799o, 19));
    }

    public final void l(int i5) throws CameraAccessException {
        Ac.a aVar = (Ac.a) this.f48112a.f5569a.get("AUTO_FOCUS");
        aVar.f1257b = i5;
        aVar.a(this.f48129s);
        if (this.f48132v) {
            return;
        }
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            q();
            return;
        }
        if (iF != 1) {
            return;
        }
        if (this.f48126p == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        d();
        this.f48129s.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        try {
            this.f48126p.setRepeatingRequest(this.f48129s.build(), null, this.f48123m);
        } catch (CameraAccessException e7) {
            throw new C4592o("setFocusModeFailed", "Error setting focus mode: " + e7.getMessage(), null);
        }
    }

    public final void m(C0800p c0800p, w0 w0Var) {
        Fc.a aVarD = this.f48112a.d();
        if (w0Var == null || ((Double) w0Var.f46405a) == null || ((Double) w0Var.f46406b) == null) {
            w0Var = null;
        }
        aVarD.f4037c = w0Var;
        aVarD.b();
        aVarD.a(this.f48129s);
        h(new RunnableC3307c(c0800p, 25), new C3641c(c0800p, 16));
        l(((Ac.a) this.f48112a.f5569a.get("AUTO_FOCUS")).f1257b);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(t6.q r5) {
        /*
            r4 = this;
            Lc.b r0 = r4.f48117f
            java.lang.Object r1 = r0.f7076c
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L13
            int r1 = r1.intValue()
            if (r1 <= 0) goto L13
            java.lang.Object r0 = r0.f7076c
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L5b
        L13:
            int r0 = yc.AbstractC4575E.f48077a
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r1 = 0
            if (r0 == 0) goto L4b
            J3.g r0 = r4.f48112a
            Ic.a r0 = r0.e()
            android.media.EncoderProfiles r0 = r0.f5441e
            if (r0 == 0) goto L49
            java.util.List r3 = e1.c.m(r0)
            int r3 = r3.size()
            if (r3 <= 0) goto L49
            java.util.List r0 = e1.c.m(r0)
            java.lang.Object r0 = r0.get(r2)
            android.media.EncoderProfiles$VideoProfile r0 = e1.c.e(r0)
            int r0 = yc.AbstractC4578a.a(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L5b
        L49:
            r0 = r1
            goto L5b
        L4b:
            J3.g r0 = r4.f48112a
            Ic.a r0 = r0.e()
            android.media.CamcorderProfile r0 = r0.f5440d
            if (r0 == 0) goto L49
            int r0 = r0.videoFrameRate
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L5b:
            if (r0 == 0) goto L78
            int r1 = r0.intValue()
            if (r1 <= 0) goto L78
            Gc.a r1 = new Gc.a
            r1.<init>(r5)
            android.util.Range r5 = new android.util.Range
            r5.<init>(r0, r0)
            r1.f4702b = r5
            J3.g r5 = r4.f48112a
            java.util.HashMap r5 = r5.f5569a
            java.lang.String r0 = "FPS_RANGE"
            r5.put(r0, r1)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.C4584g.n(t6.q):void");
    }

    public final void o(boolean z2, boolean z10) {
        RunnableC3307c runnableC3307c;
        E4.n nVar;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(this.f48130t.getSurface());
            runnableC3307c = new RunnableC3307c(this, 24);
        } else {
            runnableC3307c = null;
        }
        if (z10 && (nVar = this.f48128r) != null) {
            arrayList.add(((ImageReader) nVar.f2939c).getSurface());
        }
        arrayList.add(this.f48127q.getSurface());
        c(3, runnableC3307c, (Surface[]) arrayList.toArray(new Surface[0]));
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Log.i("Camera", "onImageAvailable");
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        if (imageAcquireNextImage == null) {
            return;
        }
        this.f48123m.post(new RunnableC3790a(8, imageAcquireNextImage, this.f48133w, new C1346a(this, 26), false));
        this.f48122l.f48138b = 1;
    }

    public final void p(RunnableC4579b runnableC4579b) {
        Surface surface;
        if (!this.f48131u) {
            ImageReader imageReader = this.f48127q;
            if (imageReader != null && imageReader.getSurface() != null) {
                Log.i("Camera", "startPreview");
                c(1, runnableC4579b, this.f48127q.getSurface());
                return;
            } else {
                if (runnableC4579b != null) {
                    runnableC4579b.run();
                    return;
                }
                return;
            }
        }
        if (this.f48114c == null) {
            if (runnableC4579b != null) {
                runnableC4579b.run();
                return;
            }
            return;
        }
        int i5 = this.f48112a.f().f6006d;
        Jc.a aVar = this.f48112a.f().f6005c;
        int iC = aVar != null ? i5 == 0 ? aVar.c(aVar.f6002e) : aVar.c(i5) : 0;
        if (((Integer) ((CameraCharacteristics) this.f48120i.f45906a).get(CameraCharacteristics.LENS_FACING)).intValue() != this.f48115d) {
            iC = (iC + 180) % 360;
        }
        C4577G c4577g = this.f48114c;
        c4577g.f48099v = iC;
        synchronized (c4577g.f48100w) {
            while (true) {
                try {
                    surface = c4577g.f48093p;
                    if (surface == null) {
                        c4577g.f48100w.wait();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(3, runnableC4579b, surface);
    }

    public final void q() throws CameraAccessException {
        Log.i("Camera", "unlockAutoFocus");
        if (this.f48126p == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        try {
            CaptureRequest.Builder builder = this.f48129s;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 2);
            this.f48126p.capture(this.f48129s.build(), null, this.f48123m);
            this.f48129s.set(key, 0);
            this.f48126p.capture(this.f48129s.build(), null, this.f48123m);
            h(null, new C4580c(this, 2));
        } catch (CameraAccessException e7) {
            this.f48119h.w(e7.getMessage() == null ? "CameraAccessException occurred while unlocking autofocus." : e7.getMessage());
        }
    }
}
