package com.vungle.ads.fpd;

import Sf.e;
import Vf.b;
import Wf.B;
import Wf.C1247f;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\"\b\u0007\u0018\u0000 @2\u00020\u0001:\u0002A@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003BK\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0002\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u0019J\u001f\u0010\"\u001a\u00020\u00002\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010\u0019J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010\u0019J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010\u0019J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u0019J\u0017\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0006H\u0007¢\u0006\u0004\b1\u0010\u0019J\u0017\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u0010\u0019J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0006H\u0007¢\u0006\u0004\b5\u0010\u0019J\u0017\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0006H\u0007¢\u0006\u0004\b7\u0010\u0019J\u0017\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0006H\u0007¢\u0006\u0004\b9\u0010\u0019J\u0017\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0006H\u0007¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010=\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0006H\u0007¢\u0006\u0004\b=\u0010\u0019J\u0017\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0006H\u0007¢\u0006\u0004\b?\u0010\u0019¨\u0006B"}, d2 = {"Lcom/vungle/ads/fpd/Revenue;", "", "<init>", "()V", "", "seen1", "", "iaaRevenueUSD", "iapRevenueUSD", "totalRevenueUSD", "", "isUserAPurchaser", "LWf/l0;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;LWf/l0;)V", "self", "LVf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lef/C;", "write$Self", "(Lcom/vungle/ads/fpd/Revenue;LVf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "totalEarningsUsd", "setTotalEarningsUsd", "(F)Lcom/vungle/ads/fpd/Revenue;", "setIAARevenueUSD", "setIAPRevenueUSD", "setTotalRevenueUSD", "earningsByPlacement", "setEarningsByPlacement", "", "", "topNAdomain", "setTopNAdomain", "(Ljava/util/List;)Lcom/vungle/ads/fpd/Revenue;", "setIsUserAPurchaser", "(Z)Lcom/vungle/ads/fpd/Revenue;", "isUserASubscriber", "setIsUserASubscriber", "last7DaysMedianSpendUsd", "setLast7DaysMedianSpendUsd", "last7DaysTotalSpendUsd", "setLast7DaysTotalSpendUsd", "last30DaysTotalSpendUsd", "setLast30DaysTotalSpendUsd", "last7DaysMeanSpendUsd", "setLast7DaysMeanSpendUsd", "last30DaysMedianSpendUsd", "setLast30DaysMedianSpendUsd", "last30DaysMeanSpendUsd", "setLast30DaysMeanSpendUsd", "last7DaysUserPltvUsd", "setLast7DaysUserPltvUsd", "last7DaysUserLtvUsd", "setLast7DaysUserLtvUsd", "last30DaysUserPltvUsd", "setLast30DaysUserPltvUsd", "last30DaysUserLtvUsd", "setLast30DaysUserLtvUsd", "last7DaysPlacementFillRate", "setLast7DaysPlacementFillRate", "last30DaysPlacementFillRate", "setLast30DaysPlacementFillRate", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@e
/* loaded from: classes5.dex */
public final class Revenue {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public Float f32888a;

    /* renamed from: b, reason: collision with root package name */
    public Float f32889b;

    /* renamed from: c, reason: collision with root package name */
    public Float f32890c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f32891d;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/Revenue$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Revenue;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Revenue$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public Revenue() {
    }

    public static final void write$Self(@NotNull Revenue self, @NotNull b output, @NotNull SerialDescriptor serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f32888a != null) {
            output.i(serialDesc, 0, B.f15526a, self.f32888a);
        }
        if (output.A(serialDesc, 1) || self.f32889b != null) {
            output.i(serialDesc, 1, B.f15526a, self.f32889b);
        }
        if (output.A(serialDesc, 2) || self.f32890c != null) {
            output.i(serialDesc, 2, B.f15526a, self.f32890c);
        }
        if (!output.A(serialDesc, 3) && self.f32891d == null) {
            return;
        }
        output.i(serialDesc, 3, C1247f.f15596a, self.f32891d);
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setEarningsByPlacement(float earningsByPlacement) {
        return this;
    }

    @NotNull
    public final Revenue setIAARevenueUSD(float iaaRevenueUSD) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= iaaRevenueUSD && iaaRevenueUSD <= Float.MAX_VALUE) {
            this.f32888a = Float.valueOf(iaaRevenueUSD);
        }
        return this;
    }

    @NotNull
    public final Revenue setIAPRevenueUSD(float iapRevenueUSD) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= iapRevenueUSD && iapRevenueUSD <= Float.MAX_VALUE) {
            this.f32889b = Float.valueOf(iapRevenueUSD);
        }
        return this;
    }

    @NotNull
    public final Revenue setIsUserAPurchaser(boolean isUserAPurchaser) {
        this.f32891d = Boolean.valueOf(isUserAPurchaser);
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setIsUserASubscriber(boolean isUserASubscriber) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast30DaysMeanSpendUsd(float last30DaysMeanSpendUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast30DaysMedianSpendUsd(float last30DaysMedianSpendUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast30DaysPlacementFillRate(float last30DaysPlacementFillRate) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast30DaysTotalSpendUsd(float last30DaysTotalSpendUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast30DaysUserLtvUsd(float last30DaysUserLtvUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast30DaysUserPltvUsd(float last30DaysUserPltvUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast7DaysMeanSpendUsd(float last7DaysMeanSpendUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast7DaysMedianSpendUsd(float last7DaysMedianSpendUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast7DaysPlacementFillRate(float last7DaysPlacementFillRate) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast7DaysTotalSpendUsd(float last7DaysTotalSpendUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast7DaysUserLtvUsd(float last7DaysUserLtvUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setLast7DaysUserPltvUsd(float last7DaysUserPltvUsd) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setTopNAdomain(@Nullable List<String> topNAdomain) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Revenue setTotalEarningsUsd(float totalEarningsUsd) {
        return this;
    }

    @NotNull
    public final Revenue setTotalRevenueUSD(float totalRevenueUSD) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= totalRevenueUSD && totalRevenueUSD <= Float.MAX_VALUE) {
            this.f32890c = Float.valueOf(totalRevenueUSD);
        }
        return this;
    }

    @InterfaceC2519c
    public /* synthetic */ Revenue(int i5, Float f10, Float f11, Float f12, Boolean bool, l0 l0Var) {
        if ((i5 & 1) == 0) {
            this.f32888a = null;
        } else {
            this.f32888a = f10;
        }
        if ((i5 & 2) == 0) {
            this.f32889b = null;
        } else {
            this.f32889b = f11;
        }
        if ((i5 & 4) == 0) {
            this.f32890c = null;
        } else {
            this.f32890c = f12;
        }
        if ((i5 & 8) == 0) {
            this.f32891d = null;
        } else {
            this.f32891d = bool;
        }
    }
}
