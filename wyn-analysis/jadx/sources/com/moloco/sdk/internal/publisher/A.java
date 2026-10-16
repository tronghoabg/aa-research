package com.moloco.sdk.internal.publisher;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class A extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public C f28884a;

    /* renamed from: b, reason: collision with root package name */
    public long f28885b;

    /* renamed from: c, reason: collision with root package name */
    public int f28886c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f28888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f28889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f28890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C f28891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b5, String str, long j8, C c10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28888e = b5;
        this.f28889f = str;
        this.f28890g = j8;
        this.f28891h = c10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        A a5 = new A(this.f28888e, this.f28889f, this.f28890g, this.f28891h, interfaceC3103c);
        a5.f28887d = obj;
        return a5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.i, tf.l] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
