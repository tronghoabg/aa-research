package w6;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class j implements GLSurfaceView.Renderer, InterfaceC4369c {

    /* renamed from: a, reason: collision with root package name */
    public final i f47345a;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f47348d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f47349e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f47350f;

    /* renamed from: g, reason: collision with root package name */
    public float f47351g;

    /* renamed from: h, reason: collision with root package name */
    public float f47352h;
    public final /* synthetic */ k k;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f47346b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f47347c = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f47353i = new float[16];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f47354j = new float[16];

    public j(k kVar, i iVar) {
        this.k = kVar;
        float[] fArr = new float[16];
        this.f47348d = fArr;
        float[] fArr2 = new float[16];
        this.f47349e = fArr2;
        float[] fArr3 = new float[16];
        this.f47350f = fArr3;
        this.f47345a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f47352h = 3.1415927f;
    }

    @Override // w6.InterfaceC4369c
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f47348d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f47352h = f11;
        Matrix.setRotateM(this.f47349e, 0, -this.f47351g, (float) Math.cos(f11), (float) Math.sin(this.f47352h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f47354j, 0, this.f47348d, 0, this.f47350f, 0);
            Matrix.multiplyMM(this.f47353i, 0, this.f47349e, 0, this.f47354j, 0);
        }
        Matrix.multiplyMM(this.f47347c, 0, this.f47346b, 0, this.f47353i, 0);
        this.f47345a.c(this.f47347c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i5, int i10) {
        GLES20.glViewport(0, 0, i5, i10);
        float f10 = i5 / i10;
        Matrix.perspectiveM(this.f47346b, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.k;
        kVar.f47359e.post(new ng.a(24, kVar, this.f47345a.e()));
    }
}
