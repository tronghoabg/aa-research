package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1241c;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.J;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class g implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final g f33169a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33170b;

    static {
        g gVar = new g();
        f33169a = gVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.AdUnit", gVar, 30);
        c1244d0.j("id", true);
        c1244d0.j("ad_type", true);
        c1244d0.j("ad_source", true);
        c1244d0.j("expiry", true);
        c1244d0.j("expiry_duration", true);
        c1244d0.j("deeplink_url", true);
        c1244d0.j("click_coordinates_enabled", true);
        c1244d0.j("ad_load_optimization", true);
        c1244d0.j("mediation_name", true);
        c1244d0.j("info", true);
        c1244d0.j("sleep", true);
        c1244d0.j("error_code", true);
        c1244d0.j("tpat", true);
        c1244d0.j("vm_url", true);
        c1244d0.j("vm_version", true);
        c1244d0.j("ad_market_id", true);
        c1244d0.j("notification", true);
        c1244d0.j("load_ad", true);
        c1244d0.j("viewability", true);
        c1244d0.j("template_type", true);
        c1244d0.j("template_settings", true);
        c1244d0.j("creative_id", true);
        c1244d0.j("app_id", true);
        c1244d0.j("show_close", true);
        c1244d0.j("show_close_incentivized", true);
        c1244d0.j("ad_size", true);
        c1244d0.j("webview_settings", true);
        c1244d0.j("use_preloading", true);
        c1244d0.j("ad_partial_download_enabled", true);
        c1244d0.j("max_download_retry_attempts", true);
        f33170b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU2 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU3 = AbstractC2641B.u(q0Var);
        J j8 = J.f15549a;
        KSerializer kSerializerU4 = AbstractC2641B.u(j8);
        KSerializer kSerializerU5 = AbstractC2641B.u(j8);
        KSerializer kSerializerU6 = AbstractC2641B.u(q0Var);
        C1247f c1247f = C1247f.f15596a;
        return new KSerializer[]{kSerializerU, kSerializerU2, kSerializerU3, kSerializerU4, kSerializerU5, kSerializerU6, AbstractC2641B.u(c1247f), AbstractC2641B.u(c1247f), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(j8), AbstractC2641B.u(j8), AbstractC2641B.u(w.f33352a), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(new C1241c(q0Var, 0)), AbstractC2641B.u(new C1241c(q0Var, 0)), AbstractC2641B.u(x.f33356a), AbstractC2641B.u(q0Var), AbstractC2641B.u(t.f33316a), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(j8), AbstractC2641B.u(j8), AbstractC2641B.u(d.f33151a), AbstractC2641B.u(d0.f33153a), AbstractC2641B.u(c1247f), AbstractC2641B.u(c1247f), AbstractC2641B.u(j8)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r21v5 java.lang.Object), method size: 1332
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r66) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.g.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33170b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i value = (i) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33170b;
        Vf.b bVarB = encoder.b(c1244d0);
        i.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
