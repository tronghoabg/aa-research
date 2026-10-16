package com.qonversion.android.sdk.dto.products;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductType;", "", "(Ljava/lang/String;I)V", "Unknown", "Trial", "Intro", "Subscription", "InApp", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QProductType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QProductType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final QProductType Unknown = new QProductType("Unknown", 0);
    public static final QProductType Trial = new QProductType("Trial", 1);
    public static final QProductType Intro = new QProductType("Intro", 2);
    public static final QProductType Subscription = new QProductType("Subscription", 3);
    public static final QProductType InApp = new QProductType("InApp", 4);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/dto/products/QProductType;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QProductType fromType(int type) {
            if (type == 0) {
                return QProductType.Trial;
            }
            if (type == 1) {
                return QProductType.Subscription;
            }
            if (type == 2) {
                return QProductType.InApp;
            }
            throw new IllegalArgumentException("Undefined enum type");
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QProductType[] $values() {
        return new QProductType[]{Unknown, Trial, Intro, Subscription, InApp};
    }

    static {
        QProductType[] qProductTypeArr$values = $values();
        $VALUES = qProductTypeArr$values;
        $ENTRIES = d.t(qProductTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private QProductType(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QProductType valueOf(String str) {
        return (QProductType) Enum.valueOf(QProductType.class, str);
    }

    public static QProductType[] values() {
        return (QProductType[]) $VALUES.clone();
    }
}
