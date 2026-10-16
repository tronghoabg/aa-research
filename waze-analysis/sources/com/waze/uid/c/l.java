package com.waze.uid.c;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class l implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44391c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f44392d;

    public /* synthetic */ l(h.g.a.a aVar, Modifier modifier, int i2, int i3) {
        this.f44392d = i3;
        this.f44391c = aVar;
        this.f44390b = modifier;
        this.f44389a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f44392d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f44389a;
            ?? r0 = this.f44391c;
            return cb.n((String) this.f44390b, r0, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f44389a;
            Object obj3 = this.f44391c;
            return cb.k((String) this.f44390b, (String) obj3, i4, (Composer) obj);
        }
        if (i2 != 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f44389a;
            ?? r02 = this.f44391c;
            return cb.f(this.f44390b, r02, i5, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i6 = this.f44389a;
        ?? r03 = this.f44390b;
        return cb.h(this.f44391c, r03, i6, (Composer) obj);
    }

    public /* synthetic */ l(Object obj, Object obj2, int i2, int i3) {
        this.f44392d = i3;
        this.f44390b = obj;
        this.f44391c = obj2;
        this.f44389a = i2;
    }
}
