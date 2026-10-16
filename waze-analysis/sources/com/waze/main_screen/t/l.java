package com.waze.main_screen.t;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class l implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27593c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27594d;

    public /* synthetic */ l(com.waze.main_screen.ab abVar, com.waze.main_screen.m.p pVar, int i2, int i3) {
        this.f27594d = i3;
        this.f27592b = abVar;
        this.f27593c = pVar;
        this.f27591a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f27594d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f27591a;
            ?? r0 = this.f27592b;
            return al.r(this.f27593c, r0, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f27591a;
        Object obj3 = this.f27593c;
        return al.y((com.waze.main_screen.ab) this.f27592b, (com.waze.main_screen.m.p) obj3, i3, (Composer) obj);
    }

    public /* synthetic */ l(h.g.a.a aVar, Modifier modifier, int i2, int i3) {
        this.f27594d = i3;
        this.f27593c = aVar;
        this.f27592b = modifier;
        this.f27591a = i2;
    }
}
