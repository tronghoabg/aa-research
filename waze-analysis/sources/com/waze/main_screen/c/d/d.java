package com.waze.main_screen.c.d;

import com.waze.nav_connect.b.j;
import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class d extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f26181a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2) {
        super(0, obj, j.class, "onLongClick", "onLongClick()V", 0);
        this.f26181a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f26181a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((j) obj).d();
            return ab.f48028a;
        }
        ((j) obj).d();
        return ab.f48028a;
    }
}
