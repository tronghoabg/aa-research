package com.waze.closure.domain;

import com.waze.bw.a.c.p;
import com.waze.bw.a.c.q;
import com.waze.ui.m.bc;
import com.waze.ui.m.bd;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22502b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22503c;

    public /* synthetic */ e(Object obj, int i2, int i3) {
        this.f22503c = i3;
        this.f22502b = obj;
        this.f22501a = i2;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f22503c;
        if (i2 == 0) {
            return f.getClosureCandidates$lambda$0((f) this.f22502b, this.f22501a);
        }
        if (i2 == 1) {
            this.f22502b.invoke(new q(this.f22501a));
            return ab.f48028a;
        }
        if (i2 == 2) {
            this.f22502b.invoke(new p(this.f22501a));
            return ab.f48028a;
        }
        if (i2 != 3) {
            this.f22502b.invoke(new bd(this.f22501a));
            return ab.f48028a;
        }
        this.f22502b.invoke(new bc(this.f22501a));
        return ab.f48028a;
    }
}
