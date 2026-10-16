package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import E5.Q;
import N.C0740o;
import U8.v0;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class v implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.a f31063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f31066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f31067e;

    public v(tf.a aVar, boolean z2, long j8, long j10, long j11) {
        this.f31063a = aVar;
        this.f31064b = z2;
        this.f31065c = j8;
        this.f31066d = j10;
        this.f31067e = j11;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z buttonPart = (z) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC3340k.e(buttonPart, "buttonPart");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0740o.e(buttonPart) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            z0.p pVar = ((K.L) c0740o.j(K.M.f6215a)).f6208f;
            if (buttonPart instanceof w) {
                c0740o.M(1000266506);
                c0740o.p(false);
            } else if (buttonPart instanceof x) {
                c0740o.M(1000608622);
                x xVar = (x) buttonPart;
                Fe.b.a(xVar.f31071a, this.f31063a, null, this.f31064b, xVar.f31072b, this.f31065c, this.f31066d, xVar.f31073c, xVar.f31074d, xVar.f31075e, c0740o, 0, 4);
                c0740o.p(false);
            } else {
                if (!(buttonPart instanceof y)) {
                    c0740o.M(-1491754012);
                    c0740o.p(false);
                    throw new Q((byte) 0, 9);
                }
                c0740o.M(1001871283);
                y yVar = (y) buttonPart;
                long j8 = L0.j.f6810c;
                long j10 = yVar.f31085j;
                if (L0.j.a(j10, j8)) {
                    j10 = this.f31067e;
                }
                v0.h(yVar.f31076a, yVar.f31077b, yVar.f31078c, yVar.f31079d, yVar.f31080e, yVar.f31081f, A6.c.b(120, 20), yVar.f31084i, yVar.f31082g, yVar.f31083h, j10, this.f31063a, c0740o, 1572864);
                c0740o.p(false);
            }
        }
        return C2515C.f34653a;
    }
}
