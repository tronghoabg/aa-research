package com.moloco.sdk.internal.services.bidtoken;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.G;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public G f29420a;

    /* renamed from: b, reason: collision with root package name */
    public a2.v f29421b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.c f29422c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29423d;

    /* renamed from: e, reason: collision with root package name */
    public int f29424e;

    /* renamed from: f, reason: collision with root package name */
    public int f29425f;

    /* renamed from: g, reason: collision with root package name */
    public int f29426g;

    /* renamed from: h, reason: collision with root package name */
    public int f29427h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a2.v f29428i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29429j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a2.v vVar, com.moloco.sdk.acm.recorder.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29428i = vVar;
        this.f29429j = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f29428i, this.f29429j, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x018a -> B:30:0x018f). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
