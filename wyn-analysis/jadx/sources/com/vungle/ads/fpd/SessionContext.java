package com.vungle.ads.fpd;

import Sf.e;
import Vf.b;
import Wf.B;
import Wf.l0;
import com.unity3d.services.UnityAdsConstants;
import ef.InterfaceC2519c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0010\b\u0007\u0018\u0000 02\u00020\u0001:\u000210B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0015H\u0007¢\u0006\u0004\b!\u0010\u0018J\u001f\u0010$\u001a\u00020\u00002\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\u0014J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010\u0014J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\u001bJ\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010\u001bJ\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u0014¨\u00062"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext;", "", "<init>", "()V", "", "seen1", "", "levelPercentile", "LWf/l0;", "serializationConstructorMarker", "(ILjava/lang/Float;LWf/l0;)V", "self", "LVf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lef/C;", "write$Self", "(Lcom/vungle/ads/fpd/SessionContext;LVf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "setLevelPercentile", "(F)Lcom/vungle/ads/fpd/SessionContext;", "", "page", "setPage", "(Ljava/lang/String;)Lcom/vungle/ads/fpd/SessionContext;", "timeSpent", "setTimeSpent", "(I)Lcom/vungle/ads/fpd/SessionContext;", "signupDate", "setSignupDate", "userScorePercentile", "setUserScorePercentile", "userID", "setUserID", "", "friends", "setFriends", "(Ljava/util/List;)Lcom/vungle/ads/fpd/SessionContext;", "userLevelPercentile", "setUserLevelPercentile", "healthPercentile", "setHealthPercentile", "sessionStartTime", "setSessionStartTime", "sessionDuration", "setSessionDuration", "inGamePurchasesUSD", "setInGamePurchasesUSD", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@e
/* loaded from: classes5.dex */
public final class SessionContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public Float f32892a;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/SessionContext;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SessionContext$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public SessionContext() {
    }

    public static final void write$Self(@NotNull SessionContext self, @NotNull b output, @NotNull SerialDescriptor serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (!output.A(serialDesc, 0) && self.f32892a == null) {
            return;
        }
        output.i(serialDesc, 0, B.f15526a, self.f32892a);
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setFriends(@Nullable List<String> friends) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setHealthPercentile(float healthPercentile) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setInGamePurchasesUSD(float inGamePurchasesUSD) {
        return this;
    }

    @NotNull
    public final SessionContext setLevelPercentile(float levelPercentile) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= levelPercentile && levelPercentile <= 100.0f) {
            this.f32892a = Float.valueOf(levelPercentile);
        }
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setPage(@NotNull String page) {
        AbstractC3340k.e(page, "page");
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setSessionDuration(int sessionDuration) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setSessionStartTime(int sessionStartTime) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setSignupDate(int signupDate) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setTimeSpent(int timeSpent) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setUserID(@NotNull String userID) {
        AbstractC3340k.e(userID, "userID");
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setUserLevelPercentile(float userLevelPercentile) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final SessionContext setUserScorePercentile(float userScorePercentile) {
        return this;
    }

    @InterfaceC2519c
    public /* synthetic */ SessionContext(int i5, Float f10, l0 l0Var) {
        if ((i5 & 1) == 0) {
            this.f32892a = null;
        } else {
            this.f32892a = f10;
        }
    }
}
