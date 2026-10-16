package com.waze.main_screen.c;

import com.waze.sdk.bd;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class w extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f26291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(Object obj, int i2) {
        super(0, obj, bd.class, "hideTooltip", "hideTooltip()V", 0);
        this.f26291a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f26291a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((com.waze.nav_connect.b.d) obj).b();
            return h.ab.f48028a;
        }
        ((bd) obj).w();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.nav_connect.b.d.class, "onTooltipDismissed", "onTooltipDismissed()V", 0);
        this.f26291a = i2;
    }
}
