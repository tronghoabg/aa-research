package com.qonversion.android.sdk.dto.offerings;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "", "tag", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Unknown", OfficeOpenXMLExtended.SECURITY_NONE, "Main", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QOfferingTag {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QOfferingTag[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @Nullable
    private final Integer tag;
    public static final QOfferingTag Unknown = new QOfferingTag("Unknown", 0, -1);
    public static final QOfferingTag None = new QOfferingTag(OfficeOpenXMLExtended.SECURITY_NONE, 1, 0);
    public static final QOfferingTag Main = new QOfferingTag("Main", 2, 1);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;", "", "()V", "fromTag", "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "tag", "", "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QOfferingTag fromTag(@Nullable Integer tag) {
            int iIntValue = tag != null ? tag.intValue() : 0;
            return iIntValue != 0 ? iIntValue != 1 ? QOfferingTag.Unknown : QOfferingTag.Main : QOfferingTag.None;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QOfferingTag[] $values() {
        return new QOfferingTag[]{Unknown, None, Main};
    }

    static {
        QOfferingTag[] qOfferingTagArr$values = $values();
        $VALUES = qOfferingTagArr$values;
        $ENTRIES = d.t(qOfferingTagArr$values);
        INSTANCE = new Companion(null);
    }

    private QOfferingTag(String str, int i5, Integer num) {
        this.tag = num;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QOfferingTag valueOf(String str) {
        return (QOfferingTag) Enum.valueOf(QOfferingTag.class, str);
    }

    public static QOfferingTag[] values() {
        return (QOfferingTag[]) $VALUES.clone();
    }

    @Nullable
    public final Integer getTag() {
        return this.tag;
    }
}
