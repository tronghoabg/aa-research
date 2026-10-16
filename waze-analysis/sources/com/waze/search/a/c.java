package com.waze.search.a;

import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class c extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2) {
        super(0, obj, com.waze.config.d.class, "getValue", "getValue()Ljava/lang/String;", 0);
        this.f35457a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f35457a;
        if (i2 == 0) {
            return ((com.waze.config.d) this.receiver).b();
        }
        if (i2 == 1) {
            return ((com.waze.config.b) this.receiver).b();
        }
        Object obj = this.receiver;
        if (i2 != 2) {
            ((com.waze.search.d.a.a.a) obj).e();
            return ab.f48028a;
        }
        ((com.waze.search.d.a.a.a) obj).e();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.config.b.class, "getValue", "getValue()Ljava/lang/Boolean;", 0);
        this.f35457a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, char[] cArr) {
        super(0, obj, com.waze.search.d.a.a.a.class, "onClick", "onClick()V", 0);
        this.f35457a = i2;
    }
}
