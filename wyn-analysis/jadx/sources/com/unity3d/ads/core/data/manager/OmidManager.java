package com.unity3d.ads.core.data.manager;

import Ma.b;
import Ma.c;
import Ma.d;
import Ma.f;
import Ma.g;
import Ma.h;
import Ma.i;
import android.content.Context;
import android.webkit.WebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000f\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0011\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u000eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001fH&¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/unity3d/ads/core/data/manager/OmidManager;", "", "Landroid/content/Context;", "context", "Lef/C;", "activate", "(Landroid/content/Context;)V", "LMa/i;", "partner", "Landroid/webkit/WebView;", "adView", "", "contentUrl", "customReferenceData", "LMa/d;", "createHtmlAdSessionContext", "(LMa/i;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)LMa/d;", "createJavaScriptAdSessionContext", "LMa/f;", "creativeType", "LMa/g;", "impressionType", "LMa/h;", "owner", "mediaEventsOwner", "", "isolateVerificationScripts", "LMa/c;", "createAdSessionConfiguration", "(LMa/f;LMa/g;LMa/h;LMa/h;Z)LMa/c;", "adSessionConfiguration", "LMa/b;", "createAdSession", "(LMa/c;LMa/d;)LMa/b;", "adSession", "LMa/a;", "createAdEvents", "(LMa/b;)LMa/a;", "isActive", "()Z", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "version", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OmidManager {
    void activate(@NotNull Context context);

    @NotNull
    Ma.a createAdEvents(@NotNull b adSession);

    @NotNull
    b createAdSession(@NotNull c adSessionConfiguration, @NotNull d context);

    @NotNull
    c createAdSessionConfiguration(@NotNull f creativeType, @NotNull g impressionType, @NotNull h owner, @NotNull h mediaEventsOwner, boolean isolateVerificationScripts);

    @NotNull
    d createHtmlAdSessionContext(@Nullable i partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData);

    @NotNull
    d createJavaScriptAdSessionContext(@Nullable i partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData);

    @NotNull
    String getVersion();

    boolean isActive();
}
