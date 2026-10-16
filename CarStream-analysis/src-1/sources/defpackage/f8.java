package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class f8 implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture a;
    public Surface b;
    public final Object c = new Object();
    public rb d;

    public f8() {
        rb rbVar = new rb();
        this.d = rbVar;
        int iA = rb.a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform vec4 uMask;\nuniform float uMaskR;\nvoid main() {\n  vec4 c = texture2D(sTexture, vTextureCoord);\n  if (uMaskR > 0.0) {\n    vec2 p = gl_FragCoord.xy;\n    vec2 q = clamp(p, uMask.xy + uMaskR, uMask.zw - uMaskR);\n    float d = distance(p, q) - uMaskR;\n    c.a = c.a * clamp(0.7 - d, 0.0, 1.0);\n  }\n  gl_FragColor = c;\n}\n");
        rbVar.d = iA;
        rbVar.h = GLES20.glGetAttribLocation(iA, "aPosition");
        rbVar.i = GLES20.glGetAttribLocation(rbVar.d, "aTextureCoord");
        rbVar.f = GLES20.glGetUniformLocation(rbVar.d, "uMVPMatrix");
        rbVar.g = GLES20.glGetUniformLocation(rbVar.d, "uSTMatrix");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        rbVar.e = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        int iA2 = rb.a("attribute vec4 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord;\nvoid main() { gl_Position = aPosition; vTexCoord = aTexCoord; }\n", "precision mediump float;\nvarying vec2 vTexCoord;\nuniform sampler2D sTexture;\nuniform float uAlpha;\nvoid main() { vec4 c = texture2D(sTexture, vTexCoord); gl_FragColor = vec4(c.rgb, c.a * uAlpha); }\n");
        rbVar.j = iA2;
        GLES20.glGetAttribLocation(iA2, "aPosition");
        GLES20.glGetAttribLocation(rbVar.j, "aTexCoord");
        GLES20.glGetUniformLocation(rbVar.j, "uAlpha");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.d.e);
        this.a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.b = new Surface(this.a);
    }

    public final void a() {
        this.d.b(this.a);
    }

    public final void b() {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.a = null;
        this.b = null;
        this.d = null;
    }

    public final void c(int i, int i2) {
        SurfaceTexture surfaceTexture = this.a;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }
}
