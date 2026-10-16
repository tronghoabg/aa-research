package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URISyntaxException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class l {
    public static boolean a(String str, String str2, Context context, s sVar, com.vungle.ads.internal.ui.m mVar) {
        AbstractC3340k.e(context, "context");
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z2 = !(context instanceof Activity);
            try {
                Intent intentA = a(z2, str);
                Intent intentA2 = a(z2, str2);
                d dVar = d.f33838f;
                return a.a(context, intentA, intentA2, mVar);
            } catch (Exception e7) {
                if (str == null || str.length() == 0) {
                    new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, com.iab.omid.library.vungle.d.a("Fail to open ", str2)).setLogEntry$vungle_ads_release(sVar).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, com.iab.omid.library.vungle.d.a("Fail to open ", str)).setLogEntry$vungle_ads_release(sVar).logErrorNoReturnValue$vungle_ads_release();
                }
                boolean z10 = u.f33874a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error while opening url");
                sbA.append(e7.getLocalizedMessage());
                t.b("ExternalRouter", sbA.toString());
                t.a("ExternalRouter", "Cannot open url " + str2);
            }
        }
        return false;
    }

    public static Intent a(boolean z2, String str) throws URISyntaxException {
        Intent uri = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    uri = Intent.parseUri(str, 0);
                }
            } catch (URISyntaxException e7) {
                boolean z10 = u.f33874a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("url format is not correct ");
                sbA.append(e7.getLocalizedMessage());
                t.b("ExternalRouter", sbA.toString());
            }
        }
        if (uri != null && z2) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }
}
