package com.moloco.sdk.internal.ilrd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.ilrd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1884c extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.C f28548a;

    /* renamed from: b, reason: collision with root package name */
    public Nf.a f28549b;

    /* renamed from: c, reason: collision with root package name */
    public m f28550c;

    /* renamed from: d, reason: collision with root package name */
    public t f28551d;

    /* renamed from: e, reason: collision with root package name */
    public int f28552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f28553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f28554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884c(m mVar, t tVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28553f = mVar;
        this.f28554g = tVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1884c(this.f28553f, this.f28554g, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1884c) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:16:0x003e, B:40:0x00b9, B:42:0x00bf, B:44:0x00ea, B:46:0x00f0), top: B:72:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133 A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:13:0x002f, B:53:0x0124, B:58:0x0133, B:62:0x0149), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #1 {all -> 0x0145, blocks: (B:13:0x002f, B:53:0x0124, B:58:0x0133, B:62:0x0149), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.C1884c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
