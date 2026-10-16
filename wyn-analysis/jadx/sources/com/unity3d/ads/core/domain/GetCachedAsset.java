package com.unity3d.ads.core.domain;

import Bf.k;
import Ef.H;
import Fe.e;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import ef.C2527k;
import ef.C2529m;
import ff.AbstractC2641B;
import ff.w;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import jf.C3109i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\b\u0010\u0012\u001a\u00020\u000eH\u0003J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0087\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "context", "Landroid/content/Context;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "getAssetFileName", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Landroid/content/Context;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "getBundledAsset", "Landroid/webkit/WebResourceResponse;", "uri", "Landroid/net/Uri;", "getLegacyCachedAsset", "getNotFoundResponse", "invoke", "webviewType", "", "tryGetWebViewAsset", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetCachedAsset {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final Context context;

    @NotNull
    private final GetAssetFileName getAssetFileName;

    @NotNull
    private final SessionRepository sessionRepository;

    public GetCachedAsset(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository, @NotNull Context context, @NotNull CacheWebViewAssets cacheWebViewAssets, @NotNull GetAssetFileName getAssetFileName) {
        AbstractC3340k.e(cacheRepository, "cacheRepository");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(cacheWebViewAssets, "cacheWebViewAssets");
        AbstractC3340k.e(getAssetFileName, "getAssetFileName");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.getAssetFileName = getAssetFileName;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) throws IOException {
        String strValueOf = String.valueOf(uri.getPath());
        String strM0 = k.M0(strValueOf, "/", strValueOf);
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strM0);
            AbstractC3340k.d(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strM0), null, inputStreamOpen);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getLegacyCachedAsset(Uri uri) {
        Object objZ;
        String string = uri.toString();
        AbstractC3340k.d(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) H.I(C3109i.f38759a, new GetCachedAsset$getLegacyCachedAsset$result$1(this, k.O0(string, "/"), null));
        if (!(cacheResult instanceof CacheResult.Success)) {
            return getNotFoundResponse();
        }
        File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
        if (file != null) {
            try {
                objZ = new FileInputStream(file);
            } catch (Throwable th) {
                objZ = e.z(th);
            }
            if (objZ instanceof C2529m) {
                objZ = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objZ;
            if (fileInputStream != null) {
                String filePath = file.getAbsolutePath();
                AbstractC3340k.d(filePath, "filePath");
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, fileInputStream);
            }
        }
        return null;
    }

    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", "utf-8", TTAdConstant.DEEPLINK_FALLBACK_CODE, "Not Found", w.f35433a, new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String webviewType) {
        Object objZ;
        File file;
        Object objZ2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(webviewType);
        sb2.append('/');
        String string = uri.toString();
        AbstractC3340k.d(string, "uri.toString()");
        sb2.append(k.O0(k.Q0(string, "?"), "/"));
        String string2 = sb2.toString();
        File file2 = this.cacheWebViewAssets.getCached().get(string2);
        if (file2 != null) {
            try {
                objZ = new FileInputStream(file2);
            } catch (Throwable th) {
                objZ = e.z(th);
            }
            if (objZ instanceof C2529m) {
                objZ = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objZ;
            if (fileInputStream != null) {
                return new WebResourceResponse(StringExtensionsKt.guessMimeType(string2), null, fileInputStream);
            }
        } else {
            String string3 = uri.toString();
            AbstractC3340k.d(string3, "uri.toString()");
            CacheResult cacheResult = (CacheResult) H.I(C3109i.f38759a, new GetCachedAsset$tryGetWebViewAsset$result$1(this, this.getAssetFileName.invoke(string3), null));
            if ((cacheResult instanceof CacheResult.Success) && (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) != null) {
                try {
                    objZ2 = new FileInputStream(file);
                } catch (Throwable th2) {
                    objZ2 = e.z(th2);
                }
                if (objZ2 instanceof C2529m) {
                    objZ2 = null;
                }
                FileInputStream fileInputStream2 = (FileInputStream) objZ2;
                if (fileInputStream2 != null) {
                    String filePath = file.getAbsolutePath();
                    AbstractC3340k.d(filePath, "filePath");
                    return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, 200, "OK", AbstractC2641B.E(new C2527k("Access-Control-Allow-Origin", "*")), fileInputStream2);
                }
            }
        }
        return null;
    }

    @Nullable
    public final WebResourceResponse invoke(@NotNull Uri uri, @NotNull String webviewType) {
        AbstractC3340k.e(uri, "uri");
        AbstractC3340k.e(webviewType, "webviewType");
        boolean disableCustomScheme = this.sessionRepository.getFeatureFlags().getDisableCustomScheme();
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return disableCustomScheme ? tryGetWebViewAsset(uri, webviewType) : getLegacyCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}
