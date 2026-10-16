package com.waze.ui.m;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class co implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42885c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42886d;

    public /* synthetic */ co(Object obj, Object obj2, int i2, int i3) {
        this.f42886d = i3;
        this.f42884b = obj;
        this.f42885c = obj2;
        this.f42883a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f42886d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f42883a;
            ?? r0 = this.f42885c;
            return dc.r((b) this.f42884b, r0, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f42883a;
            ?? r02 = this.f42885c;
            return dc.E(this.f42884b, r02, i4, (Composer) obj);
        }
        if (i2 != 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f42883a;
            ?? r03 = this.f42885c;
            return dc.c((String) this.f42884b, r03, i5, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i6 = this.f42883a;
        ?? r04 = this.f42885c;
        return dc.q(this.f42884b, r04, i6, (Composer) obj);
    }
}
