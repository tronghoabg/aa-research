package com.moloco.sdk.internal.publisher.nativead;

import Ef.E;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.publisher.C;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class m extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public long f29169a;

    /* renamed from: b, reason: collision with root package name */
    public C1906u f29170b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.internal.publisher.nativead.model.h f29171c;

    /* renamed from: d, reason: collision with root package name */
    public int f29172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f29173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.l f29174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f29175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C f29176h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, com.moloco.sdk.acm.l lVar, String str, C c10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29173e = oVar;
        this.f29174f = lVar;
        this.f29175g = str;
        this.f29176h = c10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new m(this.f29173e, this.f29174f, this.f29175g, this.f29176h, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
