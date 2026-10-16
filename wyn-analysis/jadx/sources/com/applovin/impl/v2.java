package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import org.apache.tika.metadata.MachineMetadata;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes.dex */
public class v2 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f23395a = new StringBuilder();

    public v2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public v2 b(String str) {
        this.f23395a.append(str);
        return this;
    }

    public String toString() {
        return this.f23395a.toString();
    }

    public v2 a(String str, Object obj, String str2) {
        StringBuilder sb2 = this.f23395a;
        sb2.append("\n");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append(str2);
        return this;
    }

    public v2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.W()).a("close_style", bVar.p()).a("close_delay_graphic", Long.valueOf(bVar.r()), "s");
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.g1().substring(0, Math.min(aVar.g1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.d0()), "s").a("skip_style", bVar.U()).a("Streaming", Boolean.valueOf(bVar.C0())).a("Video Location", bVar.I()).a("video_button_properties", bVar.b0());
        }
        return this;
    }

    public v2 a(String str) {
        StringBuilder sb2 = this.f23395a;
        sb2.append("\n");
        sb2.append(str);
        return this;
    }

    public v2 a() {
        this.f23395a.append("\n========================================");
        return this;
    }

    public v2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z2 = bVar instanceof p7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z2 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z2) {
            a("VAST DSP", ((p7) bVar).n1());
        }
        return this;
    }

    public v2 a(y2 y2Var) {
        v2 v2VarA = a(AndroidInitializeBoldSDK.MSG_NETWORK, y2Var.c()).a("Adapter Version", y2Var.z()).a("Format", y2Var.getFormat().getLabel()).a("Ad Unit ID", y2Var.getAdUnitId()).a("Placement", y2Var.getPlacement()).a("Network Placement", y2Var.P()).a("Serve ID", y2Var.O());
        boolean zIsValidString = StringUtils.isValidString(y2Var.getCreativeId());
        String dspId = OfficeOpenXMLExtended.SECURITY_NONE;
        v2 v2VarA2 = v2VarA.a("Creative ID", zIsValidString ? y2Var.getCreativeId() : OfficeOpenXMLExtended.SECURITY_NONE).a("Ad Domain", StringUtils.isValidString(y2Var.v()) ? y2Var.v() : OfficeOpenXMLExtended.SECURITY_NONE).a("DSP Name", StringUtils.isValidString(y2Var.getDspName()) ? y2Var.getDspName() : OfficeOpenXMLExtended.SECURITY_NONE);
        if (StringUtils.isValidString(y2Var.getDspId())) {
            dspId = y2Var.getDspId();
        }
        return v2VarA2.a("DSP ID", dspId).a("Server Parameters", y2Var.l());
    }

    public v2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a(MachineMetadata.MACHINE_ALPHA, Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", f8.a(appLovinAdView.getVisibility()));
    }

    public v2 a(com.applovin.impl.sdk.k kVar) {
        return a("Muted", Boolean.valueOf(kVar.o0().isMuted()));
    }

    public v2 a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str));
            }
        }
        return this;
    }
}
