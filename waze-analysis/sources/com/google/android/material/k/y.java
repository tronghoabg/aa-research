package com.google.android.material.k;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class y extends z {

    /* renamed from: a, reason: collision with root package name */
    private float f6733a;

    /* renamed from: b, reason: collision with root package name */
    private float f6734b;

    @Override // com.google.android.material.k.z
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6735g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f6733a, this.f6734b);
        path.transform(matrix);
    }
}
