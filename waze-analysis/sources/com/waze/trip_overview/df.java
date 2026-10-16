package com.waze.trip_overview;

import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class df<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bw f41344a;

    public df(bw bwVar) {
        this.f41344a = bwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        long jA = ((com.waze.modules.c.ar) t).a();
        bw bwVar = this.f41344a;
        return h.b.a.a(Boolean.valueOf(jA == bwVar.e()), Boolean.valueOf(((com.waze.modules.c.ar) t2).a() == bwVar.e()));
    }
}
