package u3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import b1.C1496e;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import x.C4412e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f46610p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f46611a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f46612b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f46613c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f46614d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f46615e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f46616f;

    /* renamed from: g, reason: collision with root package name */
    public final C4248j f46617g;

    /* renamed from: h, reason: collision with root package name */
    public float f46618h;

    /* renamed from: i, reason: collision with root package name */
    public float f46619i;

    /* renamed from: j, reason: collision with root package name */
    public float f46620j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public int f46621l;

    /* renamed from: m, reason: collision with root package name */
    public String f46622m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f46623n;

    /* renamed from: o, reason: collision with root package name */
    public final C4412e f46624o;

    public m() {
        this.f46613c = new Matrix();
        this.f46618h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46619i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46620j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46621l = 255;
        this.f46622m = null;
        this.f46623n = null;
        this.f46624o = new C4412e(0);
        this.f46617g = new C4248j();
        this.f46611a = new Path();
        this.f46612b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(C4248j c4248j, Matrix matrix, Canvas canvas, int i5, int i10) {
        char c10;
        float f10;
        float f11;
        int i11;
        C4248j c4248j2 = c4248j;
        char c11 = 1;
        c4248j2.f46597a.set(matrix);
        Matrix matrix2 = c4248j2.f46606j;
        Matrix matrix3 = c4248j2.f46597a;
        matrix3.preConcat(matrix2);
        canvas.save();
        char c12 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = c4248j2.f46598b;
            if (i12 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i12);
            if (kVar instanceof C4248j) {
                a((C4248j) kVar, matrix3, canvas, i5, i10);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i5 / this.f46620j;
                float f13 = i10 / this.k;
                float fMin = Math.min(f12, f13);
                Matrix matrix4 = this.f46613c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c12], fArr[c11]);
                boolean z2 = c11;
                boolean z10 = c12;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[z2 ? 1 : 0] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.abs(f14) / fMax : 0.0f;
                if (fAbs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    lVar.getClass();
                    Path path = this.f46611a;
                    path.reset();
                    C1496e[] c1496eArr = lVar.f46607a;
                    if (c1496eArr != null) {
                        C1496e.b(c1496eArr, path);
                    }
                    Path path2 = this.f46612b;
                    path2.reset();
                    if (lVar instanceof C4246h) {
                        path2.setFillType(lVar.f46609c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C4247i c4247i = (C4247i) lVar;
                        float f15 = c4247i.f46592i;
                        if (f15 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || c4247i.f46593j != 1.0f) {
                            float f16 = c4247i.k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (c4247i.f46593j + f16) % 1.0f;
                            if (this.f46616f == null) {
                                this.f46616f = new PathMeasure();
                            }
                            this.f46616f.setPath(path, z10);
                            float length = this.f46616f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f46616f.getSegment(f19, length, path, z2);
                                f10 = 0.0f;
                                this.f46616f.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f20, path, z2);
                            } else {
                                f10 = 0.0f;
                                this.f46616f.getSegment(f19, f20, path, z2);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        E4.n nVar = c4247i.f46589f;
                        if ((((Shader) nVar.f2939c) == null && nVar.f2938b == 0) ? false : true) {
                            if (this.f46615e == null) {
                                i11 = 16777215;
                                Paint paint = new Paint(1);
                                this.f46615e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i11 = 16777215;
                            }
                            Paint paint2 = this.f46615e;
                            Shader shader = (Shader) nVar.f2939c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c4247i.f46591h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i13 = nVar.f2938b;
                                float f21 = c4247i.f46591h;
                                PorterDuff.Mode mode = p.f46637j;
                                f11 = 255.0f;
                                paint2.setColor((i13 & i11) | (((int) (Color.alpha(i13) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c4247i.f46609c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f11 = 255.0f;
                            i11 = 16777215;
                        }
                        E4.n nVar2 = c4247i.f46587d;
                        if (((Shader) nVar2.f2939c) != null || nVar2.f2938b != 0) {
                            if (this.f46614d == null) {
                                Paint paint3 = new Paint(1);
                                this.f46614d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f46614d;
                            Paint.Join join = c4247i.f46595m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c4247i.f46594l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c4247i.f46596n);
                            Shader shader2 = (Shader) nVar2.f2939c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c4247i.f46590g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i14 = nVar2.f2938b;
                                float f22 = c4247i.f46590g;
                                PorterDuff.Mode mode2 = p.f46637j;
                                paint4.setColor((i14 & i11) | (((int) (Color.alpha(i14) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c4247i.f46588e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c10 = 1;
                i12++;
                c4248j2 = c4248j;
                c11 = c10;
                c12 = 0;
            }
            c10 = c11;
            i12++;
            c4248j2 = c4248j;
            c11 = c10;
            c12 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f46621l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i5) {
        this.f46621l = i5;
    }

    public m(m mVar) {
        this.f46613c = new Matrix();
        this.f46618h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46619i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46620j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46621l = 255;
        this.f46622m = null;
        this.f46623n = null;
        C4412e c4412e = new C4412e(0);
        this.f46624o = c4412e;
        this.f46617g = new C4248j(mVar.f46617g, c4412e);
        this.f46611a = new Path(mVar.f46611a);
        this.f46612b = new Path(mVar.f46612b);
        this.f46618h = mVar.f46618h;
        this.f46619i = mVar.f46619i;
        this.f46620j = mVar.f46620j;
        this.k = mVar.k;
        this.f46621l = mVar.f46621l;
        this.f46622m = mVar.f46622m;
        String str = mVar.f46622m;
        if (str != null) {
            c4412e.put(str, this);
        }
        this.f46623n = mVar.f46623n;
    }
}
