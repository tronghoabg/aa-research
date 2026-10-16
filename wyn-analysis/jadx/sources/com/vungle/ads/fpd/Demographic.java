package com.vungle.ads.fpd;

import Sf.e;
import Vf.b;
import Wf.J;
import Wf.l0;
import ef.InterfaceC2519c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "<init>", "()V", "", "seen1", "ageRange", "gender", "LWf/l0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;LWf/l0;)V", "self", "LVf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lef/C;", "write$Self", "(Lcom/vungle/ads/fpd/Demographic;LVf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/vungle/ads/fpd/LiftoffGender;", "setGender", "(Lcom/vungle/ads/fpd/LiftoffGender;)Lcom/vungle/ads/fpd/Demographic;", "age", "setAgeRange", "(I)Lcom/vungle/ads/fpd/Demographic;", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@e
/* loaded from: classes5.dex */
public final class Demographic {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public Integer f32877a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f32878b;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Demographic;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Demographic$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public Demographic() {
    }

    public static final void write$Self(@NotNull Demographic self, @NotNull b output, @NotNull SerialDescriptor serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f32877a != null) {
            output.i(serialDesc, 0, J.f15549a, self.f32877a);
        }
        if (!output.A(serialDesc, 1) && self.f32878b == null) {
            return;
        }
        output.i(serialDesc, 1, J.f15549a, self.f32878b);
    }

    @NotNull
    public final Demographic setAgeRange(int age) {
        this.f32877a = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    @NotNull
    public final Demographic setGender(@NotNull LiftoffGender gender) {
        AbstractC3340k.e(gender, "gender");
        this.f32878b = Integer.valueOf(gender.getOrg.apache.tika.mime.MimeTypesReaderMetKeys.MATCH_VALUE_ATTR java.lang.String());
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @InterfaceC2519c
    @NotNull
    public final Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }

    @InterfaceC2519c
    public /* synthetic */ Demographic(int i5, Integer num, Integer num2, l0 l0Var) {
        if ((i5 & 1) == 0) {
            this.f32877a = null;
        } else {
            this.f32877a = num;
        }
        if ((i5 & 2) == 0) {
            this.f32878b = null;
        } else {
            this.f32878b = num2;
        }
    }
}
