package com.waze.search;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class y implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f36660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36662c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f36663d;

    public /* synthetic */ y(com.waze.search.e.p pVar, boolean z, int i2, int i3) {
        this.f36663d = i3;
        this.f36662c = pVar;
        this.f36660a = z;
        this.f36661b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.q, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f36663d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f36661b;
            ?? r0 = this.f36662c;
            return ai.f(this.f36660a, r0, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f36661b;
        boolean z = this.f36660a;
        return ai.g((com.waze.search.e.p) this.f36662c, z, i3, (Composer) obj);
    }

    public /* synthetic */ y(boolean z, h.g.a.q qVar, int i2, int i3) {
        this.f36663d = i3;
        this.f36660a = z;
        this.f36662c = qVar;
        this.f36661b = i2;
    }
}
