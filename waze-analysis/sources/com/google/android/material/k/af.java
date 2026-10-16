package com.google.android.material.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af extends f {

    /* renamed from: a, reason: collision with root package name */
    private final float f6646a;

    public af(float f2) {
        this.f6646a = f2;
    }

    @Override // com.google.android.material.k.f
    public final void b(float f2, float f3, float f4, ab abVar) {
        float f5 = this.f6646a;
        float f6 = (-f5) * f4;
        float f7 = f5 * f4;
        abVar.g(f3 - f7, f3, f6);
        abVar.g(f3 + f7, f2, 0.0f);
    }
}
