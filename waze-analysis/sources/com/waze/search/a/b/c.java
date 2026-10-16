package com.waze.search.a.b;

import h.ab;
import h.g.b.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2) {
        super(0, obj, com.waze.search.a.c.g.class, "onCloseClicked", "onCloseClicked()V", 0);
        this.f35446a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f35446a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((com.waze.search.a.c.g) obj).e();
            return ab.f48028a;
        }
        ((com.waze.search.a.c.g) obj).g();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.search.a.c.g.class, "onBackClicked", "onBackClicked()V", 0);
        this.f35446a = i2;
    }
}
