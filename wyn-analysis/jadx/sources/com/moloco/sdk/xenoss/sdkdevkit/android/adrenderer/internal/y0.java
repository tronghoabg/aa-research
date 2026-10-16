package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.unity3d.services.core.device.MimeTypes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Bf.i f32363a;

    static {
        Bf.j[] jVarArr = Bf.j.f1696a;
        Pattern patternCompile = Pattern.compile("<meta\\s+name=[\"']templateName[\"']\\s+content=[\"']([^\"']+)[\"']", 66);
        AbstractC3340k.d(patternCompile, "compile(...)");
        f32363a = new Bf.i(patternCompile);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l a(String adm) {
        String str;
        AbstractC3340k.e(adm, "adm");
        Bf.i iVar = f32363a;
        iVar.getClass();
        Matcher matcher = iVar.f1695a.matcher(adm);
        AbstractC3340k.d(matcher, "matcher(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar = null;
        Bf.f fVar = !matcher.find(0) ? null : new Bf.f(matcher, adm);
        if (fVar != null && (str = (String) ((Bf.e) fVar.a()).get(1)) != null) {
            if (Bf.r.k0(str, MimeTypes.BASE_TYPE_VIDEO, true)) {
                lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32382d;
            } else if (str.equalsIgnoreCase("mraid")) {
                lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32383e;
            } else if (str.equalsIgnoreCase("static")) {
                lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32384f;
            } else {
                com.moloco.sdk.acm.recorder.b.Companion.getClass();
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("unknown_creative_type");
                hVar.a("template_name", str);
                com.moloco.sdk.acm.f fVar2 = com.moloco.sdk.acm.f.f28407a;
                com.moloco.sdk.acm.f.a(hVar);
                lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32384f;
            }
        }
        return lVar == null ? Bf.k.n0(adm, "<VAST", true) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32379a : Bf.k.n0(adm, "mraid.js", true) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32380b : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32381c : lVar;
    }
}
