package com.waze.main_screen.t;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ am f27560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27561b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27562c;

    public /* synthetic */ f(am amVar, int i2, int i3) {
        this.f27562c = i3;
        this.f27560a = amVar;
        this.f27561b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f27562c;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f27561b;
            return al.s(this.f27560a, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f27561b;
            return al.k(this.f27560a, i4, (Composer) obj);
        }
        if (i2 == 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f27561b;
            return al.j(this.f27560a, i5, (Composer) obj);
        }
        if (i2 == 3) {
            ((Integer) obj2).intValue();
            int i6 = this.f27561b;
            return al.x(this.f27560a, i6, (Composer) obj);
        }
        if (i2 != 4) {
            ((Integer) obj2).intValue();
            int i7 = this.f27561b;
            return al.n(this.f27560a, i7, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i8 = this.f27561b;
        return al.t(this.f27560a, i8, (Composer) obj);
    }
}
