package com.airbnb.lottie.d.a;

import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.a.b.q;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    private final List f2099a;

    public e(List list) {
        this.f2099a = list;
    }

    @Override // com.airbnb.lottie.d.a.m
    public final com.airbnb.lottie.a.b.f a() {
        List list = this.f2099a;
        return ((com.airbnb.lottie.h.a) list.get(0)).j() ? new q(list) : new p(list);
    }

    @Override // com.airbnb.lottie.d.a.m
    public final List b() {
        return this.f2099a;
    }

    @Override // com.airbnb.lottie.d.a.m
    public final boolean c() {
        List list = this.f2099a;
        return list.size() == 1 && ((com.airbnb.lottie.h.a) list.get(0)).j();
    }
}
