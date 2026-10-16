package com.qonversion.android.sdk.dto.entitlements;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Purchase", "FamilySharing", "Manual", "OfferCode", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QEntitlementGrantType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QEntitlementGrantType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final QEntitlementGrantType Purchase = new QEntitlementGrantType("Purchase", 0, "purchase");
    public static final QEntitlementGrantType FamilySharing = new QEntitlementGrantType("FamilySharing", 1, "family_sharing");
    public static final QEntitlementGrantType Manual = new QEntitlementGrantType("Manual", 2, "manual");
    public static final QEntitlementGrantType OfferCode = new QEntitlementGrantType("OfferCode", 3, "offer_code");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "type", "", "fromType$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final QEntitlementGrantType fromType$sdk_release(@NotNull String type) {
            AbstractC3340k.e(type, "type");
            switch (type.hashCode()) {
                case -1081415738:
                    if (type.equals("manual")) {
                        return QEntitlementGrantType.Manual;
                    }
                    break;
                case -523677951:
                    if (type.equals("family_sharing")) {
                        return QEntitlementGrantType.FamilySharing;
                    }
                    break;
                case 1743324417:
                    if (type.equals("purchase")) {
                        return QEntitlementGrantType.Purchase;
                    }
                    break;
                case 1944039017:
                    if (type.equals("offerCode")) {
                        return QEntitlementGrantType.OfferCode;
                    }
                    break;
            }
            return QEntitlementGrantType.Purchase;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QEntitlementGrantType[] $values() {
        return new QEntitlementGrantType[]{Purchase, FamilySharing, Manual, OfferCode};
    }

    static {
        QEntitlementGrantType[] qEntitlementGrantTypeArr$values = $values();
        $VALUES = qEntitlementGrantTypeArr$values;
        $ENTRIES = d.t(qEntitlementGrantTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private QEntitlementGrantType(String str, int i5, String str2) {
        this.type = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QEntitlementGrantType valueOf(String str) {
        return (QEntitlementGrantType) Enum.valueOf(QEntitlementGrantType.class, str);
    }

    public static QEntitlementGrantType[] values() {
        return (QEntitlementGrantType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
