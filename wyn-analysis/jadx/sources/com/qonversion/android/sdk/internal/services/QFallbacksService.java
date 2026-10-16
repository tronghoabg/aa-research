package com.qonversion.android.sdk.internal.services;

import android.app.Application;
import com.qonversion.android.sdk.dto.QFallbackObject;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.CacheConfigProvider;
import hb.K;
import hb.r;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "", "Landroid/app/Application;", "context", "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;", "cacheConfigProvider", "Lhb/K;", "moshi", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "<init>", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lhb/K;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "obtainFallbackData", "()Lcom/qonversion/android/sdk/dto/QFallbackObject;", "Ljava/io/InputStream;", "inputStream", "", "convertStreamToString", "(Ljava/io/InputStream;)Ljava/lang/String;", "getStringFromFile", "()Ljava/lang/String;", "Landroid/app/Application;", "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "Lhb/r;", "jsonAdapter", "Lhb/r;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QFallbacksService {

    @NotNull
    private final CacheConfigProvider cacheConfigProvider;

    @NotNull
    private final Application context;

    @NotNull
    private final r jsonAdapter;

    @NotNull
    private final Logger logger;

    public QFallbacksService(@NotNull Application context, @NotNull CacheConfigProvider cacheConfigProvider, @NotNull K moshi, @NotNull Logger logger) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(cacheConfigProvider, "cacheConfigProvider");
        AbstractC3340k.e(moshi, "moshi");
        AbstractC3340k.e(logger, "logger");
        this.context = context;
        this.cacheConfigProvider = cacheConfigProvider;
        this.logger = logger;
        this.jsonAdapter = moshi.a(QFallbackObject.class);
    }

    @NotNull
    public final String convertStreamToString(@NotNull InputStream inputStream) throws Exception {
        AbstractC3340k.e(inputStream, "inputStream");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                String string = sb2.toString();
                AbstractC3340k.d(string, "toString(...)");
                return string;
            }
            sb2.append(line);
            sb2.append("\n");
        }
    }

    @NotNull
    public final String getStringFromFile() throws Exception {
        Integer fallbackFileIdentifier = this.cacheConfigProvider.getCacheConfig().getFallbackFileIdentifier();
        InputStream inputStreamOpenRawResource = fallbackFileIdentifier != null ? this.context.getResources().openRawResource(fallbackFileIdentifier.intValue()) : this.context.getAssets().open("qonversion_android_fallbacks.json");
        AbstractC3340k.b(inputStreamOpenRawResource);
        String strConvertStreamToString = convertStreamToString(inputStreamOpenRawResource);
        inputStreamOpenRawResource.close();
        return strConvertStreamToString;
    }

    @Nullable
    public final QFallbackObject obtainFallbackData() {
        try {
            return (QFallbackObject) this.jsonAdapter.fromJson(getStringFromFile());
        } catch (Exception e7) {
            this.logger.warn("Failed to parse Qonversion fallback file: " + e7.getMessage());
            return null;
        }
    }
}
