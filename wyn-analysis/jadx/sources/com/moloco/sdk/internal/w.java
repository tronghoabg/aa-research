package com.moloco.sdk.internal;

import E.C0420j;
import E.F;
import Hf.v0;
import N.C0718d;
import N.C0740o;
import N.V;
import com.moloco.sdk.internal.publisher.H;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class w implements tf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.d f29786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f29787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29788c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f29791f;

    public w(Z.d dVar, F f10, String str, String str2, long j8, long j10) {
        this.f29786a = dVar;
        this.f29787b = f10;
        this.f29788c = str;
        this.f29789d = str2;
        this.f29790e = j8;
        this.f29791f = j10;
    }

    @Override // tf.u
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        v0 currentAdPartFlow = (v0) obj3;
        tf.l onButtonRendered = (tf.l) obj4;
        tf.a onCTA = (tf.a) obj5;
        C0740o c0740o = (C0740o) obj6;
        int iIntValue = ((Number) obj7).intValue();
        AbstractC3340k.e(currentAdPartFlow, "currentAdPartFlow");
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        AbstractC3340k.e(onCTA, "onCTA");
        V vU = C0718d.u(currentAdPartFlow, c0740o, (iIntValue >> 6) & 14);
        Z.d alignment = this.f29786a;
        AbstractC3340k.e(alignment, "alignment");
        Fe.c.b(zBooleanValue, H.e0(AbstractC3935e.w(new C0420j(alignment, false)), this.f29787b), null, null, null, V.e.b(c0740o, -657845797, new v(onButtonRendered, vU, this.f29788c, this.f29789d, this.f29790e, this.f29791f, onCTA)), c0740o, ((iIntValue >> 3) & 14) | 196608);
        return C2515C.f34653a;
    }
}
