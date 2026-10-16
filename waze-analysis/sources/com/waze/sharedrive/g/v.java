package com.waze.sharedrive.g;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class v implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38748c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f38749d;

    public /* synthetic */ v(com.waze.main_screen.l.b.j jVar, h.g.a.l lVar, int i2, int i3) {
        this.f38749d = i3;
        this.f38747b = jVar;
        this.f38748c = lVar;
        this.f38746a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.main_screen.l.b.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f38749d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f38746a;
            ?? r0 = this.f38748c;
            return bf.m(this.f38747b, r0, i3, (Composer) obj);
        }
        if (i2 != 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f38746a;
            ?? r02 = this.f38747b;
            return ag.b((ah) this.f38748c, r02, i4, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i5 = this.f38746a;
        ?? r03 = this.f38747b;
        return bf.z(this.f38748c, r03, i5, (Composer) obj);
    }

    public /* synthetic */ v(Object obj, Modifier modifier, int i2, int i3) {
        this.f38749d = i3;
        this.f38748c = obj;
        this.f38747b = modifier;
        this.f38746a = i2;
    }
}
