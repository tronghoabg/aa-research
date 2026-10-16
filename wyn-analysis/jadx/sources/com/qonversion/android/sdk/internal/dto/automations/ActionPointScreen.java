package com.qonversion.android.sdk.internal.dto.automations;

import A7.AbstractC0279p0;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "", ScreenActivity.INTENT_SCREEN_ID, "", "(Ljava/lang/String;)V", "getScreenId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActionPointScreen {

    @NotNull
    private final String screenId;

    public ActionPointScreen(@InterfaceC2812o(name = "screen") @NotNull String screenId) {
        AbstractC3340k.e(screenId, "screenId");
        this.screenId = screenId;
    }

    public static /* synthetic */ ActionPointScreen copy$default(ActionPointScreen actionPointScreen, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = actionPointScreen.screenId;
        }
        return actionPointScreen.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    @NotNull
    public final ActionPointScreen copy(@InterfaceC2812o(name = "screen") @NotNull String screenId) {
        AbstractC3340k.e(screenId, "screenId");
        return new ActionPointScreen(screenId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionPointScreen) && AbstractC3340k.a(this.screenId, ((ActionPointScreen) other).screenId);
    }

    @NotNull
    public final String getScreenId() {
        return this.screenId;
    }

    public int hashCode() {
        return this.screenId.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC0279p0.l("ActionPointScreen(screenId=", this.screenId, ")");
    }
}
