package com.waze.bh.c;

import h.ab;
import h.g.b.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f16774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2) {
        super(0, obj, h.class, "approvedClicked", "approvedClicked()V", 0);
        this.f16774a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f16774a;
        if (i2 == 0) {
            ((h) this.receiver).f();
            return ab.f48028a;
        }
        if (i2 == 1) {
            ((h) this.receiver).g();
            return ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 != 2) {
            ((h) obj).h();
            return ab.f48028a;
        }
        ((h) obj).i();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, byte[] bArr) {
        super(0, obj, h.class, "backClicked", "backClicked()V", 0);
        this.f16774a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, char[] cArr) {
        super(0, obj, h.class, "refusedClicked", "refusedClicked()V", 0);
        this.f16774a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, short[] sArr) {
        super(0, obj, h.class, "bottomLinkClicked", "bottomLinkClicked()V", 0);
        this.f16774a = i2;
    }
}
