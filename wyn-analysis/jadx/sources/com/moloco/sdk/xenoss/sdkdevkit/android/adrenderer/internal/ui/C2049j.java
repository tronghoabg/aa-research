package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import N.C0732k;
import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f30919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f30920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.a f30924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f30925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f30926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f30927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.ortb.model.D f30928j;
    public final /* synthetic */ tf.a k;

    public C2049j(boolean z2, z zVar, boolean z10, int i5, int i10, tf.a aVar, long j8, long j10, long j11, com.moloco.sdk.internal.ortb.model.D d3, tf.a aVar2) {
        this.f30919a = z2;
        this.f30920b = zVar;
        this.f30921c = z10;
        this.f30922d = i5;
        this.f30923e = i10;
        this.f30924f = aVar;
        this.f30925g = j8;
        this.f30926h = j10;
        this.f30927i = j11;
        this.f30928j = d3;
        this.k = aVar2;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Z.k modifier = (Z.k) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC3340k.e(modifier, "modifier");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0740o.e(modifier) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            z wVar = this.f30919a ? this.f30920b : new w(this.f30922d, this.f30923e, this.f30921c);
            c0740o.M(1166287030);
            tf.a aVar = this.f30924f;
            boolean zE = c0740o.e(aVar) | c0740o.e(null);
            Object objF = c0740o.F();
            if (zE || objF == C0732k.f7800a) {
                objF = new C2048i(aVar, 0);
                c0740o.U(objF);
            }
            c0740o.p(false);
            AbstractC4345a.f(wVar, modifier, (tf.a) objF, this.f30919a, this.f30925g, this.f30926h, this.f30927i, this.f30928j, this.k, c0740o, (iIntValue << 3) & 112);
        }
        return C2515C.f34653a;
    }
}
