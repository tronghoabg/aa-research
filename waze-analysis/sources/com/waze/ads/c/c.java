package com.waze.ads.c;

import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class c extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2) {
        super(0, obj, m.class, "onAdInfoClosePressed", "onAdInfoClosePressed()V", 0);
        this.f13954a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f13954a;
        if (i2 == 0) {
            ((m) this.receiver).j();
            return ab.f48028a;
        }
        if (i2 == 1) {
            ((m) this.receiver).k();
            return ab.f48028a;
        }
        if (i2 == 2) {
            ((m) this.receiver).n();
            return ab.f48028a;
        }
        if (i2 == 3) {
            ((m) this.receiver).m();
            return ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 != 4) {
            ((m) obj).p();
            return ab.f48028a;
        }
        ((m) obj).q();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, byte[] bArr) {
        super(0, obj, m.class, "onAdInfoPressed", "onAdInfoPressed()V", 0);
        this.f13954a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, char[] cArr) {
        super(0, obj, m.class, "onCloseButtonPressed", "onCloseButtonPressed()V", 0);
        this.f13954a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, int[] iArr) {
        super(0, obj, m.class, "onOutsideAdPressed", "onOutsideAdPressed()V", 0);
        this.f13954a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, short[] sArr) {
        super(0, obj, m.class, "onBackPressed", "onBackPressed()V", 0);
        this.f13954a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, boolean[] zArr) {
        super(0, obj, m.class, "onOutsideAdInfoPressed", "onOutsideAdInfoPressed()V", 0);
        this.f13954a = i2;
    }
}
