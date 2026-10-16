package com.waze.reports;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class az implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33673b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33674c;

    public /* synthetic */ az(ba baVar, Runnable runnable, int i2) {
        this.f33674c = i2;
        this.f33672a = baVar;
        this.f33673b = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f33674c == 0) {
            int iIntValue = ((Integer) obj2).intValue();
            ?? r0 = this.f33673b;
            return ba.a((ba) this.f33672a, r0, (Composer) obj, iIntValue);
        }
        h.c.h hVar = (h.c.h) obj2;
        h.g.b.x.f((h.ab) obj, "<unused var>");
        h.g.b.x.f(hVar, "element");
        h.g.b.ao aoVar = (h.g.b.ao) this.f33672a;
        int i2 = aoVar.f48103a;
        aoVar.f48103a = i2 + 1;
        ((h.c.j[]) this.f33673b)[i2] = hVar;
        return h.ab.f48028a;
    }

    public /* synthetic */ az(h.c.j[] jVarArr, h.g.b.ao aoVar, int i2) {
        this.f33674c = i2;
        this.f33673b = jVarArr;
        this.f33672a = aoVar;
    }
}
