package com.qonversion.android.sdk.automations.dto;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/QActionResultType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Unknown", "Url", "DeepLink", "Navigation", "Purchase", "Restore", "Close", "CloseAll", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QActionResultType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QActionResultType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final QActionResultType Unknown = new QActionResultType("Unknown", 0, "unknown");
    public static final QActionResultType Url = new QActionResultType("Url", 1, "url");
    public static final QActionResultType DeepLink = new QActionResultType("DeepLink", 2, "deeplink");
    public static final QActionResultType Navigation = new QActionResultType("Navigation", 3, "navigate");
    public static final QActionResultType Purchase = new QActionResultType("Purchase", 4, "purchase");
    public static final QActionResultType Restore = new QActionResultType("Restore", 5, "restore");
    public static final QActionResultType Close = new QActionResultType("Close", 6, "close");
    public static final QActionResultType CloseAll = new QActionResultType("CloseAll", 7, "closeAllQScreens");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QActionResultType fromType(@Nullable String type) {
            QActionResultType qActionResultType;
            QActionResultType[] qActionResultTypeArrValues = QActionResultType.values();
            int length = qActionResultTypeArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    qActionResultType = null;
                    break;
                }
                qActionResultType = qActionResultTypeArrValues[i5];
                if (AbstractC3340k.a(qActionResultType.getType(), type)) {
                    break;
                }
                i5++;
            }
            return qActionResultType == null ? QActionResultType.Unknown : qActionResultType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QActionResultType[] $values() {
        return new QActionResultType[]{Unknown, Url, DeepLink, Navigation, Purchase, Restore, Close, CloseAll};
    }

    static {
        QActionResultType[] qActionResultTypeArr$values = $values();
        $VALUES = qActionResultTypeArr$values;
        $ENTRIES = d.t(qActionResultTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private QActionResultType(String str, int i5, String str2) {
        this.type = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QActionResultType valueOf(String str) {
        return (QActionResultType) Enum.valueOf(QActionResultType.class, str);
    }

    public static QActionResultType[] values() {
        return (QActionResultType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
