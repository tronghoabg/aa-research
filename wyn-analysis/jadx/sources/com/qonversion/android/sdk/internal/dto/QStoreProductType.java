package com.qonversion.android.sdk.internal.dto;

import E5.Q;
import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "", "(Ljava/lang/String;I)V", "toProductType", "", "toSkuType", "InApp", "Subscription", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QStoreProductType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QStoreProductType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final QStoreProductType InApp = new QStoreProductType("InApp", 0);
    public static final QStoreProductType Subscription = new QStoreProductType("Subscription", 1);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;", "", "()V", "fromProductType", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "type", "", "fromSkuType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QStoreProductType fromProductType(@NotNull String type) {
            AbstractC3340k.e(type, "type");
            return type.equals("inapp") ? QStoreProductType.InApp : QStoreProductType.Subscription;
        }

        @NotNull
        public final QStoreProductType fromSkuType(@NotNull String type) {
            AbstractC3340k.e(type, "type");
            return type.equals("inapp") ? QStoreProductType.InApp : QStoreProductType.Subscription;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QStoreProductType.values().length];
            try {
                iArr[QStoreProductType.InApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QStoreProductType.Subscription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ QStoreProductType[] $values() {
        return new QStoreProductType[]{InApp, Subscription};
    }

    static {
        QStoreProductType[] qStoreProductTypeArr$values = $values();
        $VALUES = qStoreProductTypeArr$values;
        $ENTRIES = d.t(qStoreProductTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private QStoreProductType(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QStoreProductType valueOf(String str) {
        return (QStoreProductType) Enum.valueOf(QStoreProductType.class, str);
    }

    public static QStoreProductType[] values() {
        return (QStoreProductType[]) $VALUES.clone();
    }

    @NotNull
    public final String toProductType() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i5 == 1) {
            return "inapp";
        }
        if (i5 == 2) {
            return "subs";
        }
        throw new Q((byte) 0, 9);
    }

    @NotNull
    public final String toSkuType() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i5 == 1) {
            return "inapp";
        }
        if (i5 == 2) {
            return "subs";
        }
        throw new Q((byte) 0, 9);
    }
}
