package com.waze.ui.z;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class q implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f43987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43990d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f43991e;

    public /* synthetic */ q(Modifier modifier, com.waze.ui.p.i iVar, h.g.a.a aVar, int i2, int i3) {
        this.f43991e = i3;
        this.f43987a = modifier;
        this.f43989c = iVar;
        this.f43990d = aVar;
        this.f43988b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f43991e;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f43988b;
            ?? r0 = this.f43990d;
            Object obj3 = this.f43989c;
            return as.s(this.f43987a, (com.waze.ui.p.i) obj3, r0, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f43988b;
            ?? r02 = this.f43990d;
            Modifier modifier = this.f43987a;
            return as.z((an) this.f43989c, modifier, r02, i4, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i5 = this.f43988b;
        Modifier modifier2 = this.f43987a;
        Object obj4 = this.f43990d;
        return as.u((com.waze.ui.p.i) this.f43989c, (f) obj4, modifier2, i5, (Composer) obj);
    }

    public /* synthetic */ q(com.waze.ui.p.i iVar, f fVar, Modifier modifier, int i2, int i3) {
        this.f43991e = i3;
        this.f43989c = iVar;
        this.f43990d = fVar;
        this.f43987a = modifier;
        this.f43988b = i2;
    }

    public /* synthetic */ q(an anVar, Modifier modifier, h.g.a.l lVar, int i2, int i3) {
        this.f43991e = i3;
        this.f43989c = anVar;
        this.f43987a = modifier;
        this.f43990d = lVar;
        this.f43988b = i2;
    }
}
