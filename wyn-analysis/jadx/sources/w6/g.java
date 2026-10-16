package w6;

import android.opengl.GLES20;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import u6.C4261f;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f47322i = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f47323j = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public static final float[] k = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f47324a;

    /* renamed from: b, reason: collision with root package name */
    public M2.d f47325b;

    /* renamed from: c, reason: collision with root package name */
    public N2.j f47326c;

    /* renamed from: d, reason: collision with root package name */
    public int f47327d;

    /* renamed from: e, reason: collision with root package name */
    public int f47328e;

    /* renamed from: f, reason: collision with root package name */
    public int f47329f;

    /* renamed from: g, reason: collision with root package name */
    public int f47330g;

    /* renamed from: h, reason: collision with root package name */
    public int f47331h;

    public static boolean b(C4372f c4372f) {
        M2.d[] dVarArr = c4372f.f47318a.f47317a;
        if (dVarArr.length == 1 && dVarArr[0].f7301b == 0) {
            M2.d[] dVarArr2 = c4372f.f47319b.f47317a;
            if (dVarArr2.length == 1 && dVarArr2[0].f7301b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            N2.j jVar = new N2.j("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f47326c = jVar;
            this.f47327d = GLES20.glGetUniformLocation(jVar.f8379b, "uMvpMatrix");
            this.f47328e = GLES20.glGetUniformLocation(this.f47326c.f8379b, "uTexMatrix");
            this.f47329f = this.f47326c.h("aPosition");
            this.f47330g = this.f47326c.h("aTexCoords");
            this.f47331h = GLES20.glGetUniformLocation(this.f47326c.f8379b, "uTexture");
        } catch (C4261f e7) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e7);
        }
    }
}
