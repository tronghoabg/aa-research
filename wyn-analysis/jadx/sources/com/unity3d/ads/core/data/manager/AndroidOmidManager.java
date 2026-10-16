package com.unity3d.ads.core.data.manager;

import G6.Q;
import Ma.c;
import Ma.d;
import Ma.g;
import Ma.i;
import Ma.j;
import Oa.b;
import Oa.e;
import Oa.f;
import Oa.h;
import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import android.webkit.WebView;
import c8.C1581e;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import ka.AbstractC3230e0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import m9.S;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import s8.C4026b;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOmidManager;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "<init>", "()V", "Landroid/content/Context;", "context", "Lef/C;", "activate", "(Landroid/content/Context;)V", "LMa/i;", "partner", "Landroid/webkit/WebView;", "adView", "", "contentUrl", "customReferenceData", "LMa/d;", "createHtmlAdSessionContext", "(LMa/i;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)LMa/d;", "createJavaScriptAdSessionContext", "LMa/f;", "creativeType", "LMa/g;", "impressionType", "LMa/h;", "owner", "mediaEventsOwner", "", "isolateVerificationScripts", "LMa/c;", "createAdSessionConfiguration", "(LMa/f;LMa/g;LMa/h;LMa/h;Z)LMa/c;", "adSessionConfiguration", "LMa/b;", "createAdSession", "(LMa/c;LMa/d;)LMa/b;", "adSession", "LMa/a;", "createAdEvents", "(LMa/b;)LMa/a;", "isActive", "()Z", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "version", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        C4026b c4026b = La.a.f7058a;
        Context applicationContext = context.getApplicationContext();
        AbstractC3935e.g(applicationContext, "Application Context cannot be null");
        if (c4026b.f45322b) {
            return;
        }
        c4026b.f45322b = true;
        h hVarB = h.b();
        S s10 = hVarB.f8941b;
        hVarB.f8942c = new Na.a(new Handler(), applicationContext, new C1581e(23), hVarB);
        b bVar = b.f8929d;
        boolean z2 = applicationContext instanceof Application;
        if (z2) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(bVar);
        }
        AbstractC3230e0.f39407g = (UiModeManager) applicationContext.getSystemService("uimode");
        WindowManager windowManager = Ra.b.f10570a;
        Ra.b.f10572c = applicationContext.getResources().getDisplayMetrics().density;
        Ra.b.f10570a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new Q(1), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        f.f8936b.f8937a = applicationContext.getApplicationContext();
        Oa.a aVar = Oa.a.f8923f;
        if (aVar.f8926c) {
            return;
        }
        e eVar = aVar.f8927d;
        eVar.getClass();
        if (z2) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(eVar);
        }
        eVar.f8935c = aVar;
        eVar.f8933a = true;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        eVar.f8934b = runningAppProcessInfo.importance == 100;
        aVar.f8928e = eVar.f8934b;
        aVar.f8926c = true;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public Ma.a createAdEvents(@NotNull Ma.b adSession) {
        AbstractC3340k.e(adSession, "adSession");
        j jVar = (j) adSession;
        Qa.a aVar = jVar.f7610e;
        if (aVar.f9931c != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (jVar.f7612g) {
            throw new IllegalStateException("AdSession is finished");
        }
        Ma.a aVar2 = new Ma.a(jVar);
        aVar.f9931c = aVar2;
        return aVar2;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public Ma.b createAdSession(@NotNull c adSessionConfiguration, @NotNull d context) {
        AbstractC3340k.e(adSessionConfiguration, "adSessionConfiguration");
        AbstractC3340k.e(context, "context");
        if (La.a.f7058a.f45322b) {
            return new j(adSessionConfiguration, context);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public c createAdSessionConfiguration(@NotNull Ma.f creativeType, @NotNull g impressionType, @NotNull Ma.h owner, @NotNull Ma.h mediaEventsOwner, boolean isolateVerificationScripts) {
        AbstractC3340k.e(creativeType, "creativeType");
        AbstractC3340k.e(impressionType, "impressionType");
        AbstractC3340k.e(owner, "owner");
        AbstractC3340k.e(mediaEventsOwner, "mediaEventsOwner");
        if (owner == Ma.h.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        Ma.f fVar = Ma.f.DEFINED_BY_JAVASCRIPT;
        Ma.h hVar = Ma.h.NATIVE;
        if (creativeType == fVar && owner == hVar) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (impressionType == g.DEFINED_BY_JAVASCRIPT && owner == hVar) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new c(creativeType, impressionType, owner, mediaEventsOwner, isolateVerificationScripts);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public d createHtmlAdSessionContext(@Nullable i partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData) {
        AbstractC3935e.g(partner, "Partner is null");
        AbstractC3935e.g(adView, "WebView is null");
        if (customReferenceData == null || customReferenceData.length() <= 256) {
            return new d(partner, adView, contentUrl, customReferenceData, Ma.e.HTML);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public d createJavaScriptAdSessionContext(@Nullable i partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData) {
        AbstractC3935e.g(partner, "Partner is null");
        AbstractC3935e.g(adView, "WebView is null");
        if (customReferenceData == null || customReferenceData.length() <= 256) {
            return new d(partner, adView, contentUrl, customReferenceData, Ma.e.JAVASCRIPT);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public String getVersion() {
        return "1.4.9-Unity3d";
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return La.a.f7058a.f45322b;
    }
}
