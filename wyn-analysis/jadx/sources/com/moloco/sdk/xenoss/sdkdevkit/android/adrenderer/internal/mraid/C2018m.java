package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.x0;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2018m extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2021p f30422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2018m(AbstractC2021p abstractC2021p, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30422b = abstractC2021p;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2018m c2018m = new C2018m(this.f30422b, interfaceC3103c);
        c2018m.f30421a = obj;
        return c2018m;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2018m c2018m = (C2018m) create((C) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2018m.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C c10 = (C) this.f30421a;
        x xVar = x.f30463b;
        boolean zA = AbstractC3340k.a(c10, xVar);
        AbstractC2021p abstractC2021p = this.f30422b;
        if (zA) {
            if (((Boolean) ((x0) abstractC2021p.f30436j.f6516f).getValue()).booleanValue()) {
                abstractC2021p.d();
            } else {
                abstractC2021p.f30433g.c(xVar, "Can't close ad when mraid container is not visible to the user");
            }
        } else if (c10 instanceof A) {
            A a5 = (A) c10;
            if (((Boolean) ((x0) abstractC2021p.f30436j.f6516f).getValue()).booleanValue()) {
                tf.l lVar = abstractC2021p.f30430d;
                String string = a5.f30336b.toString();
                AbstractC3340k.d(string, "toString(...)");
                lVar.invoke(string);
            } else {
                abstractC2021p.f30433g.c(a5, "Can't open links when mraid container is not visible to the user");
            }
        } else if (!(c10 instanceof B)) {
            if (c10 instanceof z) {
                z zVar = (z) c10;
                boolean z2 = abstractC2021p.f30432f;
                K8.H h10 = abstractC2021p.f30433g;
                if (z2) {
                    h10.c(zVar, "expand() is force blocked for the current ad");
                } else if (!((Boolean) ((x0) abstractC2021p.f30436j.f6516f).getValue()).booleanValue()) {
                    h10.c(zVar, "Can't expand() when mraid container is not visible to the user");
                } else if (abstractC2021p.f30435i != G.f30350b) {
                    h10.c(zVar, "In order to expand() mraid ad, container must be in Default view state");
                } else {
                    if (abstractC2021p.f30428b == F.f30347c) {
                        h10.c(zVar, "expand() is not supported for interstitials");
                    } else if (zVar.f30465b != null) {
                        h10.c(zVar, "Two-part expand is not supported yet");
                    } else {
                        abstractC2021p.a();
                        abstractC2021p.c(G.f30351c);
                    }
                }
            } else {
                abstractC2021p.f30433g.c(c10, "unsupported command: ".concat(c10.f30339a));
            }
        }
        return C2515C.f34653a;
    }
}
