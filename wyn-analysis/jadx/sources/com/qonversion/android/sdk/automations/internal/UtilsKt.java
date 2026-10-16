package com.qonversion.android.sdk.automations.internal;

import com.qonversion.android.sdk.R;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationStyle;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import ef.C2527k;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE, "Lef/k;", "", "getScreenTransactionAnimations", "(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Lef/k;", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UtilsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QScreenPresentationStyle.values().length];
            try {
                iArr[QScreenPresentationStyle.FullScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QScreenPresentationStyle.NoAnimation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final C2527k getScreenTransactionAnimations(@Nullable QScreenPresentationStyle qScreenPresentationStyle) {
        int i5 = qScreenPresentationStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[qScreenPresentationStyle.ordinal()];
        if (i5 == 1) {
            return new C2527k(Integer.valueOf(R.anim.q_slide_in_from_bottom), Integer.valueOf(R.anim.q_slide_out_to_bottom));
        }
        if (i5 != 2) {
            return null;
        }
        return new C2527k(0, 0);
    }
}
