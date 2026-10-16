package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import N.C0740o;
import ef.C2515C;

/* loaded from: classes4.dex */
public final class M implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f30835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30836c;

    public M(String str, long j8, long j10) {
        this.f30834a = str;
        this.f30835b = j8;
        this.f30836c = j10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            K.I.b(this.f30834a, new E.D(0, -1), this.f30835b, this.f30836c, null, null, 0L, null, 0L, 0, false, 0, null, null, c0740o, 48, 0, 65520);
        }
        return C2515C.f34653a;
    }
}
