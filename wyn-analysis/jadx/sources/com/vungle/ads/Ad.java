package com.vungle.ads;

import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/Ad;", "", "", "canPlayAd", "()Ljava/lang/Boolean;", "Lef/C;", "load", "()V", "", LegacyLoadUseCase.KEY_AD_MARKUP, "(Ljava/lang/String;)V", "Lcom/vungle/ads/VungleCSBData;", "csbData", "(Lcom/vungle/ads/VungleCSBData;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public interface Ad {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(Ad ad2, String str, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i5 & 1) != 0) {
                str = null;
            }
            ad2.load(str);
        }
    }

    @Nullable
    Boolean canPlayAd();

    void load();

    void load(@NotNull VungleCSBData csbData);

    void load(@Nullable String adMarkup);
}
