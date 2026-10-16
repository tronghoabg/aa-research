package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import N.C0740o;
import ef.C2515C;
import h0.AbstractC2765c;

/* loaded from: classes4.dex */
public final class L implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f30830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2765c f30831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30833d;

    public L(long j8, AbstractC2765c abstractC2765c, String str, long j10) {
        this.f30830a = j8;
        this.f30831b = abstractC2765c;
        this.f30832c = str;
        this.f30833d = j10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            Z.k kVarD = E.L.d(Z.i.f16922a, this.f30830a);
            K.t.a(this.f30831b, this.f30832c, kVarD, this.f30833d, c0740o, 0);
        }
        return C2515C.f34653a;
    }
}
