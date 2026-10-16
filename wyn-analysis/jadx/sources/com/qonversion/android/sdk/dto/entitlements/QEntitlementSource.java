package com.qonversion.android.sdk.dto.entitlements;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey$sdk_release", "()Ljava/lang/String;", "Unknown", "AppStore", "PlayStore", "Stripe", "Manual", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QEntitlementSource {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QEntitlementSource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String key;
    public static final QEntitlementSource Unknown = new QEntitlementSource("Unknown", 0, "unknown");
    public static final QEntitlementSource AppStore = new QEntitlementSource("AppStore", 1, "appstore");
    public static final QEntitlementSource PlayStore = new QEntitlementSource("PlayStore", 2, "playstore");
    public static final QEntitlementSource Stripe = new QEntitlementSource("Stripe", 3, "stripe");
    public static final QEntitlementSource Manual = new QEntitlementSource("Manual", 4, "manual");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource$Companion;", "", "()V", "fromKey", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QEntitlementSource fromKey(@NotNull String key) {
            QEntitlementSource qEntitlementSource;
            AbstractC3340k.e(key, "key");
            QEntitlementSource[] qEntitlementSourceArrValues = QEntitlementSource.values();
            int length = qEntitlementSourceArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    qEntitlementSource = null;
                    break;
                }
                qEntitlementSource = qEntitlementSourceArrValues[i5];
                if (AbstractC3340k.a(qEntitlementSource.getKey(), key)) {
                    break;
                }
                i5++;
            }
            return qEntitlementSource == null ? QEntitlementSource.Unknown : qEntitlementSource;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QEntitlementSource[] $values() {
        return new QEntitlementSource[]{Unknown, AppStore, PlayStore, Stripe, Manual};
    }

    static {
        QEntitlementSource[] qEntitlementSourceArr$values = $values();
        $VALUES = qEntitlementSourceArr$values;
        $ENTRIES = d.t(qEntitlementSourceArr$values);
        INSTANCE = new Companion(null);
    }

    private QEntitlementSource(String str, int i5, String str2) {
        this.key = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QEntitlementSource valueOf(String str) {
        return (QEntitlementSource) Enum.valueOf(QEntitlementSource.class, str);
    }

    public static QEntitlementSource[] values() {
        return (QEntitlementSource[]) $VALUES.clone();
    }

    @NotNull
    /* renamed from: getKey$sdk_release, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
