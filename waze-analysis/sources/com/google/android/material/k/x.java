package com.google.android.material.k;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x extends z {

    /* renamed from: h, reason: collision with root package name */
    private static final RectF f6726h = new RectF();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public final float f6727a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final float f6728b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final float f6729c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public final float f6730d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f6731e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f6732f;

    public x(float f2, float f3, float f4, float f5) {
        this.f6727a = f2;
        this.f6728b = f3;
        this.f6729c = f4;
        this.f6730d = f5;
    }

    @Override // com.google.android.material.k.z
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6735g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f6726h;
        rectF.set(this.f6727a, this.f6728b, this.f6729c, this.f6730d);
        path.arcTo(rectF, this.f6731e, this.f6732f, false);
        path.transform(matrix);
    }
}
