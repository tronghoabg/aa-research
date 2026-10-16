package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.C0588a0;
import Hf.k0;
import a2.C1323c;
import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import ef.C2527k;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class M extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f30369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f30370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(boolean z2, O o7, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30368b = z2;
        this.f30369c = o7;
        this.f30370d = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new M(this.f30368b, this.f30369c, this.f30370d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30367a;
        if (i5 == 0) {
            Fe.e.U(obj);
            try {
                boolean z2 = this.f30368b;
                String str = this.f30370d;
                O o7 = this.f30369c;
                if (z2) {
                    Context context = o7.getContext();
                    AbstractC3340k.d(context, "getContext(...)");
                    com.moloco.sdk.internal.publisher.H.L(o7, new C1323c(7, new G4.c(context, (byte) 0), new ae.d(4)).C(str));
                } else {
                    com.moloco.sdk.internal.publisher.H.L(o7, str);
                }
                P p10 = o7.f30382b;
                C0588a0 c0588a0 = new C0588a0(p10.f30387d, p10.f30389f, new K(3, null, 0));
                L l10 = new L(2, null);
                this.f30367a = 1;
                obj = k0.p(c0588a0, l10, this);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Exception e7) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebView", e7.toString(), null, false, 12, null);
                return new com.moloco.sdk.internal.y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30103c);
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        C2527k c2527k = (C2527k) obj;
        boolean zBooleanValue = ((Boolean) c2527k.f34671a).booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) c2527k.f34672b;
        return dVar != null ? new com.moloco.sdk.internal.y(dVar) : zBooleanValue ? new com.moloco.sdk.internal.z(new C2013h(null)) : new com.moloco.sdk.internal.y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30104d);
    }
}
