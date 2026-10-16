package com.waze.main_screen.p;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bf f27260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27261b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27262c;

    public /* synthetic */ g(bf bfVar, int i2, int i3) {
        this.f27262c = i3;
        this.f27260a = bfVar;
        this.f27261b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f27262c != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f27261b;
            return bi.A(this.f27260a, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f27261b;
        return bi.w(this.f27260a, i3, (Composer) obj);
    }
}
