package com.qonversion.android.sdk.dto;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "ExperimentControlGroup", "ExperimentTreatmentGroup", "RemoteConfiguration", "Unknown", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRemoteConfigurationSourceType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QRemoteConfigurationSourceType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final QRemoteConfigurationSourceType ExperimentControlGroup = new QRemoteConfigurationSourceType("ExperimentControlGroup", 0, "experiment_control_group");
    public static final QRemoteConfigurationSourceType ExperimentTreatmentGroup = new QRemoteConfigurationSourceType("ExperimentTreatmentGroup", 1, "experiment_treatment_group");
    public static final QRemoteConfigurationSourceType RemoteConfiguration = new QRemoteConfigurationSourceType("RemoteConfiguration", 2, "remote_configuration");
    public static final QRemoteConfigurationSourceType Unknown = new QRemoteConfigurationSourceType("Unknown", 3, "unknown");

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QRemoteConfigurationSourceType fromType(@NotNull String type) {
            AbstractC3340k.e(type, "type");
            int iHashCode = type.hashCode();
            if (iHashCode != -894634917) {
                if (iHashCode != -466006851) {
                    if (iHashCode == 1409167286 && type.equals("experiment_treatment_group")) {
                        return QRemoteConfigurationSourceType.ExperimentTreatmentGroup;
                    }
                } else if (type.equals("remote_configuration")) {
                    return QRemoteConfigurationSourceType.RemoteConfiguration;
                }
            } else if (type.equals("experiment_control_group")) {
                return QRemoteConfigurationSourceType.ExperimentControlGroup;
            }
            return QRemoteConfigurationSourceType.Unknown;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ QRemoteConfigurationSourceType[] $values() {
        return new QRemoteConfigurationSourceType[]{ExperimentControlGroup, ExperimentTreatmentGroup, RemoteConfiguration, Unknown};
    }

    static {
        QRemoteConfigurationSourceType[] qRemoteConfigurationSourceTypeArr$values = $values();
        $VALUES = qRemoteConfigurationSourceTypeArr$values;
        $ENTRIES = d.t(qRemoteConfigurationSourceTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private QRemoteConfigurationSourceType(String str, int i5, String str2) {
        this.type = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QRemoteConfigurationSourceType valueOf(String str) {
        return (QRemoteConfigurationSourceType) Enum.valueOf(QRemoteConfigurationSourceType.class, str);
    }

    public static QRemoteConfigurationSourceType[] values() {
        return (QRemoteConfigurationSourceType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
