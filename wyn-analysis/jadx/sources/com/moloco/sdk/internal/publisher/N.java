package com.moloco.sdk.internal.publisher;

import Ef.H0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdKt;
import ef.C2515C;
import java.util.Locale;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class N extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f28928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f28929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R0.e f28930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(V v2, R0.e eVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28929b = v2;
        this.f28930c = eVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        N n10 = new N(this.f28929b, this.f28930c, interfaceC3103c);
        n10.f28928a = ((Boolean) obj).booleanValue();
        return n10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        N n10 = (N) create(bool, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        n10.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        String strName;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l creativeType;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = this.f28928a;
        V v2 = this.f28929b;
        R0.e eVar = v2.f28965t;
        eVar.f10050b = z2;
        String str = v2.f28950d;
        if (z2) {
            com.moloco.sdk.acm.l lVar = v2.f28963r;
            if (lVar != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) eVar.f10052d;
                if (eVar2 == null || (creativeType = eVar2.getCreativeType()) == null || (strName = creativeType.name()) == null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32379a;
                    strName = "UNKNOWN";
                }
                String lowerCase = strName.toLowerCase(Locale.ROOT);
                AbstractC3340k.d(lowerCase, "toLowerCase(...)");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
                String lowerCase2 = v2.f28960o.name().toLowerCase(Locale.ROOT);
                AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
                lVar.a("ad_type", lowerCase2);
                lVar.a("creative_type", lowerCase);
                v2.f28958m.b(lVar);
            }
            String strC = V.c(v2);
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "Banner parent view type: ".concat(strC), false, 4, null);
            Y2.B b5 = v2.f28967v;
            if (b5 != null) {
                b5.d(MolocoAdKt.createAdInfo$default(str, null, null, 6, null), strC);
            }
        } else {
            Y2.B b10 = v2.f28967v;
            if (b10 != null) {
                b10.s(MolocoAdKt.createAdInfo$default(str, null, null, 6, null));
            }
            H0 h02 = (H0) this.f28930c.f10055g;
            if (h02 != null) {
                h02.cancel(null);
            }
        }
        return C2515C.f34653a;
    }
}
