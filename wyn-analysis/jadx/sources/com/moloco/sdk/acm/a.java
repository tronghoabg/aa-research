package com.moloco.sdk.acm;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public Nf.a f28334a;

    /* renamed from: b, reason: collision with root package name */
    public int f28335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f28336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28336c = jVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a(this.f28336c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (com.moloco.sdk.acm.f.d(r14, r13) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v14, types: [lf.j, tf.p] */
    /* JADX WARN: Type inference failed for: r0v6, types: [Nf.a] */
    /* JADX WARN: Type inference failed for: r14v7, types: [a9.a] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
