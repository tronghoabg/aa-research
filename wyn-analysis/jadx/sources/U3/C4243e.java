package u3;

import android.animation.TypeEvaluator;
import b1.C1496e;
import p7.AbstractC3772b;

/* renamed from: u3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4243e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public C1496e[] f46584a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        C1496e[] c1496eArr = (C1496e[]) obj;
        C1496e[] c1496eArr2 = (C1496e[]) obj2;
        if (!AbstractC3772b.h(c1496eArr, c1496eArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC3772b.h(this.f46584a, c1496eArr)) {
            this.f46584a = AbstractC3772b.p(c1496eArr);
        }
        for (int i5 = 0; i5 < c1496eArr.length; i5++) {
            C1496e c1496e = this.f46584a[i5];
            C1496e c1496e2 = c1496eArr[i5];
            C1496e c1496e3 = c1496eArr2[i5];
            c1496e.getClass();
            c1496e.f19126a = c1496e2.f19126a;
            int i10 = 0;
            while (true) {
                float[] fArr = c1496e2.f19127b;
                if (i10 < fArr.length) {
                    c1496e.f19127b[i10] = (c1496e3.f19127b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                    i10++;
                }
            }
        }
        return this.f46584a;
    }
}
