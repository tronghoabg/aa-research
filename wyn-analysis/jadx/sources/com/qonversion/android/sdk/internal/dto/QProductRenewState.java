package com.qonversion.android.sdk.internal.dto;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "NonRenewable", "Unknown", "WillRenew", "Canceled", "BillingIssue", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QProductRenewState {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QProductRenewState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int type;
    public static final QProductRenewState NonRenewable = new QProductRenewState("NonRenewable", 0, -1);
    public static final QProductRenewState Unknown = new QProductRenewState("Unknown", 1, 0);
    public static final QProductRenewState WillRenew = new QProductRenewState("WillRenew", 2, 1);
    public static final QProductRenewState Canceled = new QProductRenewState("Canceled", 3, 2);
    public static final QProductRenewState BillingIssue = new QProductRenewState("BillingIssue", 4, 3);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QProductRenewState$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QProductRenewState fromType(int type) {
            return type != -1 ? type != 1 ? type != 2 ? type != 3 ? QProductRenewState.Unknown : QProductRenewState.BillingIssue : QProductRenewState.Canceled : QProductRenewState.WillRenew : QProductRenewState.NonRenewable;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QProductRenewState[] $values() {
        return new QProductRenewState[]{NonRenewable, Unknown, WillRenew, Canceled, BillingIssue};
    }

    static {
        QProductRenewState[] qProductRenewStateArr$values = $values();
        $VALUES = qProductRenewStateArr$values;
        $ENTRIES = d.t(qProductRenewStateArr$values);
        INSTANCE = new Companion(null);
    }

    private QProductRenewState(String str, int i5, int i10) {
        this.type = i10;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QProductRenewState valueOf(String str) {
        return (QProductRenewState) Enum.valueOf(QProductRenewState.class, str);
    }

    public static QProductRenewState[] values() {
        return (QProductRenewState[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
