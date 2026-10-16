package Ge;

import com.qonversion.android.sdk.dto.QRemoteConfigurationAssignmentType;
import com.qonversion.android.sdk.dto.QRemoteConfigurationSourceType;
import com.qonversion.android.sdk.dto.experiments.QExperimentGroupType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4735a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4736b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f4737c;

    static {
        int[] iArr = new int[QExperimentGroupType.values().length];
        try {
            iArr[QExperimentGroupType.Treatment.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QExperimentGroupType.Control.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4735a = iArr;
        int[] iArr2 = new int[QRemoteConfigurationSourceType.values().length];
        try {
            iArr2[QRemoteConfigurationSourceType.RemoteConfiguration.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[QRemoteConfigurationSourceType.ExperimentTreatmentGroup.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[QRemoteConfigurationSourceType.ExperimentControlGroup.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f4736b = iArr2;
        int[] iArr3 = new int[QRemoteConfigurationAssignmentType.values().length];
        try {
            iArr3[QRemoteConfigurationAssignmentType.Auto.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[QRemoteConfigurationAssignmentType.Manual.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f4737c = iArr3;
    }
}
