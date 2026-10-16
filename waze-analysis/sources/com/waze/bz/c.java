package com.waze.bz;

import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class c extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2) {
        super(0, obj, d.class, "mainActionIntent", "mainActionIntent()Landroid/content/Intent;", 0);
        this.f18208a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f18208a;
        if (i2 == 0) {
            return d.d((d) this.receiver);
        }
        if (i2 == 1) {
            return d.c((d) this.receiver);
        }
        Object obj = this.receiver;
        if (i2 != 2) {
            d.f((d) obj);
            return ab.f48028a;
        }
        d.e((d) obj);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, byte[] bArr) {
        super(0, obj, d.class, "aboutTollPricesActionIntent", "aboutTollPricesActionIntent()Landroid/content/Intent;", 0);
        this.f18208a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, char[] cArr) {
        super(0, obj, d.class, "handleCancelClicked", "handleCancelClicked()V", 0);
        this.f18208a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, short[] sArr) {
        super(0, obj, d.class, "handleDismissed", "handleDismissed()V", 0);
        this.f18208a = i2;
    }
}
