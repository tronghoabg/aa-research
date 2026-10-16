package com.unity3d.ads.core.extensions;

import E5.Q;
import com.unity3d.ads.AdFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import nb.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "Lnb/d;", "toUnityAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)Lnb/d;", "Lcom/unity3d/ads/AdFormat;", "toProtoAdFormat", "(Lcom/unity3d/ads/AdFormat;)Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "(Lcom/unity3d/ads/AdFormat;)Lnb/d;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdFormatExtensions {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdFormatOuterClass.AdFormat.values().length];
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdFormat.values().length];
            try {
                iArr2[AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final AdFormatOuterClass.AdFormat toProtoAdFormat(@NotNull AdFormat adFormat) {
        AbstractC3340k.e(adFormat, "<this>");
        int i5 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i5 == 1) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        if (i5 == 2) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i5 == 3) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i5 == 4) {
            return AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
        }
        throw new Q((byte) 0, 9);
    }

    @Nullable
    public static final d toUnityAdFormat(@NotNull AdFormatOuterClass.AdFormat adFormat) {
        AbstractC3340k.e(adFormat, "<this>");
        int i5 = WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i5 == 1) {
            return d.f41007c;
        }
        if (i5 == 2) {
            return d.f41006b;
        }
        if (i5 == 3) {
            return d.f41008d;
        }
        if (i5 != 4) {
            return null;
        }
        return d.f41005a;
    }

    @NotNull
    public static final d toUnityAdFormat(@NotNull AdFormat adFormat) {
        AbstractC3340k.e(adFormat, "<this>");
        int i5 = WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i5 == 1) {
            return d.f41005a;
        }
        if (i5 == 2) {
            return d.f41008d;
        }
        if (i5 == 3) {
            return d.f41006b;
        }
        if (i5 == 4) {
            return d.f41007c;
        }
        throw new Q((byte) 0, 9);
    }
}
