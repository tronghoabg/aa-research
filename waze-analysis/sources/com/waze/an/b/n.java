package com.waze.an.b;

import com.waze.an.a.r;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f14655a;

    public n(int i2) {
        this.f14655a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f14655a != 0 ? h.b.a.a(new h((com.waze.an.a.b) obj), new h((com.waze.an.a.b) obj2)) : h.b.a.a(new h((r) obj), new h((r) obj2));
    }
}
