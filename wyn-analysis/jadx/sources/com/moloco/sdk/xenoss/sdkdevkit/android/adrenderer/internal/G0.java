package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.AbstractC3340k;
import p9.C3778C;

/* loaded from: classes4.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29943a;

    public G0(Context context) {
        this.f29943a = context;
    }

    public final boolean a(String uri) {
        AbstractC3340k.e(uri, "uri");
        Context context = this.f29943a;
        try {
            C3778C c3778c = new C3778C();
            ((Intent) c3778c.f43324c).putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            u.k kVarB = c3778c.b();
            kVarB.f46072a.addFlags(268435456);
            kVarB.a(context, Uri.parse(uri));
            return true;
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "tryStartCustomTabs exception", e7, false, 8, null);
            return false;
        }
    }
}
