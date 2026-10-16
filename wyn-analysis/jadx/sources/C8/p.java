package c8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public final class p extends r {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f19780h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f19781b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19782c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19783d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19784e;

    /* renamed from: f, reason: collision with root package name */
    public float f19785f;

    /* renamed from: g, reason: collision with root package name */
    public float f19786g;

    public p(float f10, float f11, float f12, float f13) {
        this.f19781b = f10;
        this.f19782c = f11;
        this.f19783d = f12;
        this.f19784e = f13;
    }

    @Override // c8.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f19789a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f19780h;
        rectF.set(this.f19781b, this.f19782c, this.f19783d, this.f19784e);
        path.arcTo(rectF, this.f19785f, this.f19786g, false);
        path.transform(matrix);
    }
}
