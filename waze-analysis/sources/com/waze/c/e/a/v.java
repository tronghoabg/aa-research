package com.waze.c.e.a;

import com.waze.modules.c.ar;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f18485a;

    public v(long j2) {
        this.f18485a = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        long jA = ((ar) t).a();
        long j2 = this.f18485a;
        return h.b.a.a(Boolean.valueOf(jA == j2), Boolean.valueOf(((ar) t2).a() == j2));
    }
}
