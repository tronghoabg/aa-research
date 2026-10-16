package e0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import c7.C1576l;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2450b implements InterfaceC2463o {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f34357a = AbstractC2451c.f34360a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f34358b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f34359c = new Rect();

    @Override // e0.InterfaceC2463o
    public final void a(float f10, float f11, float f12, float f13, C1576l paint) {
        AbstractC3340k.e(paint, "paint");
        this.f34357a.drawRect(f10, f11, f12, f13, (Paint) paint.f19706b);
    }

    @Override // e0.InterfaceC2463o
    public final void b(C2452d image, long j8, long j10, long j11, long j12, C1576l c1576l) {
        AbstractC3340k.e(image, "image");
        Canvas canvas = this.f34357a;
        Bitmap bitmapF = z.f(image);
        int i5 = L0.g.f6803c;
        int i10 = (int) (j8 >> 32);
        Rect rect = this.f34358b;
        rect.left = i10;
        int i11 = (int) (j8 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j10 >> 32));
        rect.bottom = i11 + ((int) (j10 & 4294967295L));
        int i12 = (int) (j11 >> 32);
        Rect rect2 = this.f34359c;
        rect2.left = i12;
        int i13 = (int) (j11 & 4294967295L);
        rect2.top = i13;
        rect2.right = i12 + ((int) (j12 >> 32));
        rect2.bottom = i13 + ((int) (j12 & 4294967295L));
        canvas.drawBitmap(bitmapF, rect, rect2, (Paint) c1576l.f19706b);
    }

    @Override // e0.InterfaceC2463o
    public final void c(C2454f path, C1576l c1576l) {
        AbstractC3340k.e(path, "path");
        this.f34357a.drawPath(path.f34364a, (Paint) c1576l.f19706b);
    }

    @Override // e0.InterfaceC2463o
    public final void d() {
        this.f34357a.scale(-1.0f, 1.0f);
    }

    @Override // e0.InterfaceC2463o
    public final void e(float f10, float f11, float f12, float f13, int i5) {
        this.f34357a.clipRect(f10, f11, f12, f13, i5 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // e0.InterfaceC2463o
    public final void f(float f10, float f11) {
        this.f34357a.translate(f10, f11);
    }

    @Override // e0.InterfaceC2463o
    public final void g(d0.d dVar, C1576l paint) {
        AbstractC3340k.e(paint, "paint");
        a(dVar.f33937a, dVar.f33938b, dVar.f33939c, dVar.f33940d, paint);
    }

    @Override // e0.InterfaceC2463o
    public final void h(C2452d c2452d, long j8, C1576l c1576l) {
        this.f34357a.drawBitmap(z.f(c2452d), C2384c.b(j8), C2384c.c(j8), (Paint) c1576l.f19706b);
    }

    @Override // e0.InterfaceC2463o
    public final void i() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z.i(this.f34357a, true);
    }

    @Override // e0.InterfaceC2463o
    public final void j(d0.d dVar) {
        e(dVar.f33937a, dVar.f33938b, dVar.f33939c, dVar.f33940d, 1);
    }

    @Override // e0.InterfaceC2463o
    public final void k(float f10, long j8, C1576l c1576l) {
        this.f34357a.drawCircle(C2384c.b(j8), C2384c.c(j8), f10, (Paint) c1576l.f19706b);
    }

    @Override // e0.InterfaceC2463o
    public final void l(x path) {
        AbstractC3340k.e(path, "path");
        Canvas canvas = this.f34357a;
        if (!(path instanceof C2454f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C2454f) path).f34364a, Region.Op.INTERSECT);
    }

    @Override // e0.InterfaceC2463o
    public final void m() {
        this.f34357a.save();
    }

    @Override // e0.InterfaceC2463o
    public final void n(float f10, float f11, float f12, float f13, float f14, float f15, C1576l c1576l) {
        this.f34357a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) c1576l.f19706b);
    }

    @Override // e0.InterfaceC2463o
    public final void o() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z.i(this.f34357a, false);
    }

    @Override // e0.InterfaceC2463o
    public final void p(float[] matrix) {
        AbstractC3340k.e(matrix, "matrix");
        int i5 = 0;
        while (i5 < 4) {
            int i10 = 0;
            while (i10 < 4) {
                if (matrix[(i5 * 4) + i10] != (i5 == i10 ? 1.0f : 0.0f)) {
                    Matrix matrix2 = new Matrix();
                    float f10 = matrix[2];
                    if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f11 = matrix[6];
                        if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && matrix[10] == 1.0f && matrix[14] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f12 = matrix[8];
                            if (f12 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && matrix[9] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && matrix[11] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f13 = matrix[0];
                                float f14 = matrix[1];
                                float f15 = matrix[3];
                                float f16 = matrix[4];
                                float f17 = matrix[5];
                                float f18 = matrix[7];
                                float f19 = matrix[12];
                                float f20 = matrix[13];
                                float f21 = matrix[15];
                                matrix[0] = f13;
                                matrix[1] = f16;
                                matrix[2] = f19;
                                matrix[3] = f14;
                                matrix[4] = f17;
                                matrix[5] = f20;
                                matrix[6] = f15;
                                matrix[7] = f18;
                                matrix[8] = f21;
                                matrix2.setValues(matrix);
                                matrix[0] = f13;
                                matrix[1] = f14;
                                matrix[2] = f10;
                                matrix[3] = f15;
                                matrix[4] = f16;
                                matrix[5] = f17;
                                matrix[6] = f11;
                                matrix[7] = f18;
                                matrix[8] = f12;
                                this.f34357a.concat(matrix2);
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Android does not support arbitrary transforms");
                }
                i10++;
            }
            i5++;
        }
    }

    @Override // e0.InterfaceC2463o
    public final void q(d0.d dVar, C1576l c1576l) {
        Canvas canvas = this.f34357a;
        Paint paint = (Paint) c1576l.f19706b;
        canvas.saveLayer(dVar.f33937a, dVar.f33938b, dVar.f33939c, dVar.f33940d, paint, 31);
    }

    @Override // e0.InterfaceC2463o
    public final void r(float f10, float f11, float f12, float f13, float f14, float f15, C1576l c1576l) {
        this.f34357a.drawArc(f10, f11, f12, f13, f14, f15, false, (Paint) c1576l.f19706b);
    }

    @Override // e0.InterfaceC2463o
    public final void restore() {
        this.f34357a.restore();
    }
}
