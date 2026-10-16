package com.waze.bw.c.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class co implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f18045a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18046b;

    public co(List list, int i2) {
        this.f18046b = i2;
        this.f18045a = list;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f18046b;
        if (i2 == 0) {
            this.f18045a.get(((Number) obj).intValue());
            return null;
        }
        if (i2 != 1) {
            this.f18045a.get(((Number) obj).intValue());
            return null;
        }
        this.f18045a.get(((Number) obj).intValue());
        return null;
    }
}
