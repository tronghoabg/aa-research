package cd;

import com.google.android.ump.ConsentInformation;

/* renamed from: cd.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1604j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19838a;

    static {
        int[] iArr = new int[ConsentInformation.PrivacyOptionsRequirementStatus.values().length];
        f19838a = iArr;
        try {
            iArr[ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19838a[ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
