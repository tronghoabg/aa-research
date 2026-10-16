package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Ef.E;
import ef.C2515C;
import java.io.File;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class j extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Nf.a f30283a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30284b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30285c;

    /* renamed from: d, reason: collision with root package name */
    public File f30286d;

    /* renamed from: e, reason: collision with root package name */
    public int f30287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f30288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f30289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30288f = str;
        this.f30289g = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new j(this.f30288f, this.f30289g, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c A[Catch: all -> 0x0032, Exception -> 0x01c2, TryCatch #0 {all -> 0x0032, blocks: (B:7:0x0029, B:63:0x0186, B:65:0x018c, B:67:0x01a0, B:72:0x01c5, B:82:0x01e1), top: B:88:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
