package com.unity3d.ads.core.data.model;

import Fe.e;
import ef.C2529m;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "", "(Ljava/lang/String;I)V", "BANNER", "MREC", "INTERSTITIAL", "REWARDED", "NATIVE", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum AdRevenueAdFormat {
    BANNER,
    MREC,
    INTERSTITIAL,
    REWARDED,
    NATIVE;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat$Companion;", "", "()V", "fromString", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AdRevenueAdFormat fromString(@Nullable String value) {
            Object objZ;
            if (value == null) {
                return null;
            }
            try {
                String upperCase = value.toUpperCase(Locale.ROOT);
                AbstractC3340k.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objZ = AdRevenueAdFormat.valueOf(upperCase);
            } catch (Throwable th) {
                objZ = e.z(th);
            }
            return (AdRevenueAdFormat) (objZ instanceof C2529m ? null : objZ);
        }

        private Companion() {
        }
    }
}
