package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2515C;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class K0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.internal.services.events.c f31210a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g f31211b;

    /* renamed from: c, reason: collision with root package name */
    public L0 f31212c;

    /* renamed from: d, reason: collision with root package name */
    public List f31213d;

    /* renamed from: e, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E f31214e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f31215f;

    /* renamed from: g, reason: collision with root package name */
    public String f31216g;

    /* renamed from: h, reason: collision with root package name */
    public Iterator f31217h;

    /* renamed from: i, reason: collision with root package name */
    public int f31218i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f31219j;
    public final /* synthetic */ com.moloco.sdk.internal.services.events.c k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g f31220l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L0 f31221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f31222n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E f31223o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Integer f31224p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f31225q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(List list, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar, L0 l02, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E e7, Integer num, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31219j = list;
        this.k = cVar;
        this.f31220l = gVar;
        this.f31221m = l02;
        this.f31222n = list2;
        this.f31223o = e7;
        this.f31224p = num;
        this.f31225q = str;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new K0(this.f31219j, this.k, this.f31220l, this.f31221m, this.f31222n, this.f31223o, this.f31224p, this.f31225q, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005b -> B:19:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:19:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008a -> B:18:0x0091). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.K0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
