package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Ef.E;
import Ef.H;
import Ef.S;
import Va.X7;
import ef.C2515C;
import java.io.File;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class k extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30292c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f30293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f30294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c f30295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30291b = oVar;
        this.f30292c = str;
        this.f30293d = file;
        this.f30294e = str2;
        this.f30295f = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f30291b, this.f30292c, this.f30293d, this.f30294e, this.f30295f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30290a;
        o oVar = this.f30291b;
        String str = this.f30292c;
        if (i5 == 0) {
            Fe.e.U(obj);
            X7 x72 = oVar.f30309b;
            this.f30290a = 1;
            Lf.e eVar = S.f3698a;
            if (H.P(Lf.d.f7120b, new c(x72, str, this.f30293d, this.f30295f, this.f30294e, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        oVar.f30313f.remove(str);
        oVar.f30314g.remove(str);
        return C2515C.f34653a;
    }
}
