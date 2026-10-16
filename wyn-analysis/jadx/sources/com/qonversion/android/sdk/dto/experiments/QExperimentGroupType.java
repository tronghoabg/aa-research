package com.qonversion.android.sdk.dto.experiments;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Control", "Treatment", "Unknown", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QExperimentGroupType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QExperimentGroupType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final QExperimentGroupType Control = new QExperimentGroupType("Control", 0, "control");
    public static final QExperimentGroupType Treatment = new QExperimentGroupType("Treatment", 1, "treatment");
    public static final QExperimentGroupType Unknown = new QExperimentGroupType("Unknown", 2, "unknown");

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QExperimentGroupType fromType(@NotNull String type) {
            AbstractC3340k.e(type, "type");
            return type.equals("control") ? QExperimentGroupType.Control : type.equals("treatment") ? QExperimentGroupType.Treatment : QExperimentGroupType.Unknown;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QExperimentGroupType[] $values() {
        return new QExperimentGroupType[]{Control, Treatment, Unknown};
    }

    static {
        QExperimentGroupType[] qExperimentGroupTypeArr$values = $values();
        $VALUES = qExperimentGroupTypeArr$values;
        $ENTRIES = d.t(qExperimentGroupTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private QExperimentGroupType(String str, int i5, String str2) {
        this.type = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QExperimentGroupType valueOf(String str) {
        return (QExperimentGroupType) Enum.valueOf(QExperimentGroupType.class, str);
    }

    public static QExperimentGroupType[] values() {
        return (QExperimentGroupType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
