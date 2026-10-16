package com.qonversion.android.sdk.dto;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "", "(Ljava/lang/String;I)V", "toReplacementMode", "", "toReplacementMode$sdk_release", "ChargeFullPrice", "ChargeProratedPrice", "WithTimeProration", "Deferred", "WithoutProration", "Unknown", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QPurchaseUpdatePolicy {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QPurchaseUpdatePolicy[] $VALUES;
    public static final QPurchaseUpdatePolicy ChargeFullPrice = new QPurchaseUpdatePolicy("ChargeFullPrice", 0);
    public static final QPurchaseUpdatePolicy ChargeProratedPrice = new QPurchaseUpdatePolicy("ChargeProratedPrice", 1);
    public static final QPurchaseUpdatePolicy WithTimeProration = new QPurchaseUpdatePolicy("WithTimeProration", 2);
    public static final QPurchaseUpdatePolicy Deferred = new QPurchaseUpdatePolicy("Deferred", 3);
    public static final QPurchaseUpdatePolicy WithoutProration = new QPurchaseUpdatePolicy("WithoutProration", 4);
    public static final QPurchaseUpdatePolicy Unknown = new QPurchaseUpdatePolicy("Unknown", 5);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QPurchaseUpdatePolicy.values().length];
            try {
                iArr[QPurchaseUpdatePolicy.ChargeFullPrice.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QPurchaseUpdatePolicy.ChargeProratedPrice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QPurchaseUpdatePolicy.WithTimeProration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QPurchaseUpdatePolicy.Deferred.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QPurchaseUpdatePolicy.WithoutProration.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ QPurchaseUpdatePolicy[] $values() {
        return new QPurchaseUpdatePolicy[]{ChargeFullPrice, ChargeProratedPrice, WithTimeProration, Deferred, WithoutProration, Unknown};
    }

    static {
        QPurchaseUpdatePolicy[] qPurchaseUpdatePolicyArr$values = $values();
        $VALUES = qPurchaseUpdatePolicyArr$values;
        $ENTRIES = d.t(qPurchaseUpdatePolicyArr$values);
    }

    private QPurchaseUpdatePolicy(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QPurchaseUpdatePolicy valueOf(String str) {
        return (QPurchaseUpdatePolicy) Enum.valueOf(QPurchaseUpdatePolicy.class, str);
    }

    public static QPurchaseUpdatePolicy[] values() {
        return (QPurchaseUpdatePolicy[]) $VALUES.clone();
    }

    public final int toReplacementMode$sdk_release() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i5 == 1) {
            return 5;
        }
        if (i5 == 2) {
            return 2;
        }
        if (i5 == 3) {
            return 1;
        }
        if (i5 != 4) {
            return i5 != 5 ? 0 : 3;
        }
        return 6;
    }
}
