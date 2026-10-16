package c8;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes4.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    public float f19787b;

    /* renamed from: c, reason: collision with root package name */
    public float f19788c;

    @Override // c8.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f19789a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f19787b, this.f19788c);
        path.transform(matrix);
    }
}
