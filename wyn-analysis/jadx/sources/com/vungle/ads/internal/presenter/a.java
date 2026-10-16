package com.vungle.ads.internal.presenter;

import A7.AbstractC0279p0;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f33501a;

    /* renamed from: b, reason: collision with root package name */
    public i3 f33502b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33503c;

    public a(b bVar, i3 i3Var) {
        this.f33501a = bVar;
        this.f33502b = i3Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String s10, String str, String str2) {
        i3 i3Var;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        AbstractC3340k.e(s10, "s");
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        StringBuilder sbR = AbstractC0279p0.r("s=", s10, ", value=", str, ", id=");
        sbR.append(str2);
        com.vungle.ads.internal.util.t.a("AdEventListener", sbR.toString());
        switch (s10.hashCode()) {
            case -1912374177:
                if (s10.equals("successfulView") && (i3Var = this.f33502b) != null && i3Var.j() && !this.f33503c) {
                    this.f33503c = true;
                    b bVar5 = this.f33501a;
                    if (bVar5 != null) {
                        bVar5.onAdRewarded(str2);
                        break;
                    }
                }
                break;
            case -1627831289:
                if (s10.equals("adViewed") && (bVar = this.f33501a) != null) {
                    bVar.onAdImpression(str2);
                    break;
                }
                break;
            case 100571:
                if (s10.equals("end") && (bVar2 = this.f33501a) != null) {
                    bVar2.onAdEnd(str2);
                    break;
                }
                break;
            case 3417674:
                if (s10.equals("open")) {
                    if (!AbstractC3340k.a(str, "adClick")) {
                        if (AbstractC3340k.a(str, "adLeftApplication") && (bVar3 = this.f33501a) != null) {
                            bVar3.onAdLeftApplication(str2);
                            break;
                        }
                    } else {
                        b bVar6 = this.f33501a;
                        if (bVar6 != null) {
                            bVar6.onAdClick(str2);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (s10.equals("start") && (bVar4 = this.f33501a) != null) {
                    bVar4.onAdStart(str2);
                    break;
                }
                break;
        }
    }

    public final void a(VungleError error, String str) {
        AbstractC3340k.e(error, "error");
        b bVar = this.f33501a;
        if (bVar != null) {
            bVar.onFailure(error);
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AdEventListener", "AdEventListener#PlayAdCallback " + str, error);
        }
    }
}
