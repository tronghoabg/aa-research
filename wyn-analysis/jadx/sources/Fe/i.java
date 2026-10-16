package Fe;

import com.qonversion.android.sdk.dto.products.QProductPricingPhase;
import com.qonversion.android.sdk.dto.products.QSubscriptionPeriod;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4091a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4092b;

    static {
        int[] iArr = new int[ae.e.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ae.d dVar = ae.e.f17637b;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ae.d dVar2 = ae.e.f17637b;
            iArr[6] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ae.d dVar3 = ae.e.f17637b;
            iArr[7] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ae.d dVar4 = ae.e.f17637b;
            iArr[8] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ae.d dVar5 = ae.e.f17637b;
            iArr[9] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            ae.d dVar6 = ae.e.f17637b;
            iArr[3] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            ae.d dVar7 = ae.e.f17637b;
            iArr[4] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            ae.d dVar8 = ae.e.f17637b;
            iArr[5] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr2 = new int[QSubscriptionPeriod.Unit.values().length];
        try {
            iArr2[QSubscriptionPeriod.Unit.Day.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[QSubscriptionPeriod.Unit.Week.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[QSubscriptionPeriod.Unit.Month.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[QSubscriptionPeriod.Unit.Year.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[QSubscriptionPeriod.Unit.Unknown.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        f4091a = iArr2;
        int[] iArr3 = new int[QProductPricingPhase.Type.values().length];
        try {
            iArr3[QProductPricingPhase.Type.FreeTrial.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[QProductPricingPhase.Type.DiscountedSinglePayment.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[QProductPricingPhase.Type.DiscountedRecurringPayment.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        f4092b = iArr3;
    }
}
