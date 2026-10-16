package com.qonversion.android.sdk.dto.entitlements;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Owner", "FamilySharing", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QTransactionOwnershipType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QTransactionOwnershipType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final QTransactionOwnershipType Owner = new QTransactionOwnershipType("Owner", 0, "owner");
    public static final QTransactionOwnershipType FamilySharing = new QTransactionOwnershipType("FamilySharing", 1, "family_sharing");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "type", "", "fromType$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QTransactionOwnershipType fromType$sdk_release(@NotNull String type) {
            AbstractC3340k.e(type, "type");
            return type.equals("owner") ? QTransactionOwnershipType.Owner : type.equals("family_sharing") ? QTransactionOwnershipType.FamilySharing : QTransactionOwnershipType.Owner;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QTransactionOwnershipType[] $values() {
        return new QTransactionOwnershipType[]{Owner, FamilySharing};
    }

    static {
        QTransactionOwnershipType[] qTransactionOwnershipTypeArr$values = $values();
        $VALUES = qTransactionOwnershipTypeArr$values;
        $ENTRIES = d.t(qTransactionOwnershipTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private QTransactionOwnershipType(String str, int i5, String str2) {
        this.type = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QTransactionOwnershipType valueOf(String str) {
        return (QTransactionOwnershipType) Enum.valueOf(QTransactionOwnershipType.class, str);
    }

    public static QTransactionOwnershipType[] values() {
        return (QTransactionOwnershipType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
