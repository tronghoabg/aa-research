package com.qonversion.android.sdk.dto;

import com.qonversion.android.sdk.dto.experiments.QExperiment;
import hb.InterfaceC2812o;
import hb.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0002\b\u0019J7\u0010\u001a\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006 "}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "", "payload", "", "", "experiment", "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;", "sourceApi", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;", "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)V", "getExperiment", "()Lcom/qonversion/android/sdk/dto/experiments/QExperiment;", "isCorrect", "", "isCorrect$sdk_release", "()Z", "getPayload", "()Ljava/util/Map;", "source", "getSource", "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;", "getSourceApi$sdk_release", "component1", "component2", "component3", "component3$sdk_release", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QRemoteConfig {

    @Nullable
    private final QExperiment experiment;
    private final boolean isCorrect;

    @NotNull
    private final Map<String, Object> payload;

    @Nullable
    private final QRemoteConfigurationSource sourceApi;

    public QRemoteConfig(@InterfaceC2812o(name = "payload") @NotNull Map<String, ? extends Object> payload, @InterfaceC2812o(name = "experiment") @Nullable QExperiment qExperiment, @InterfaceC2812o(name = "source") @Nullable QRemoteConfigurationSource qRemoteConfigurationSource) {
        AbstractC3340k.e(payload, "payload");
        this.payload = payload;
        this.experiment = qExperiment;
        this.sourceApi = qRemoteConfigurationSource;
        this.isCorrect = qRemoteConfigurationSource != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QRemoteConfig copy$default(QRemoteConfig qRemoteConfig, Map map, QExperiment qExperiment, QRemoteConfigurationSource qRemoteConfigurationSource, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            map = qRemoteConfig.payload;
        }
        if ((i5 & 2) != 0) {
            qExperiment = qRemoteConfig.experiment;
        }
        if ((i5 & 4) != 0) {
            qRemoteConfigurationSource = qRemoteConfig.sourceApi;
        }
        return qRemoteConfig.copy(map, qExperiment, qRemoteConfigurationSource);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.payload;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final QExperiment getExperiment() {
        return this.experiment;
    }

    @Nullable
    /* renamed from: component3$sdk_release, reason: from getter */
    public final QRemoteConfigurationSource getSourceApi() {
        return this.sourceApi;
    }

    @NotNull
    public final QRemoteConfig copy(@InterfaceC2812o(name = "payload") @NotNull Map<String, ? extends Object> payload, @InterfaceC2812o(name = "experiment") @Nullable QExperiment experiment, @InterfaceC2812o(name = "source") @Nullable QRemoteConfigurationSource sourceApi) {
        AbstractC3340k.e(payload, "payload");
        return new QRemoteConfig(payload, experiment, sourceApi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRemoteConfig)) {
            return false;
        }
        QRemoteConfig qRemoteConfig = (QRemoteConfig) other;
        return AbstractC3340k.a(this.payload, qRemoteConfig.payload) && AbstractC3340k.a(this.experiment, qRemoteConfig.experiment) && AbstractC3340k.a(this.sourceApi, qRemoteConfig.sourceApi);
    }

    @Nullable
    public final QExperiment getExperiment() {
        return this.experiment;
    }

    @NotNull
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    @NotNull
    public final QRemoteConfigurationSource getSource() {
        QRemoteConfigurationSource qRemoteConfigurationSource = this.sourceApi;
        AbstractC3340k.b(qRemoteConfigurationSource);
        return qRemoteConfigurationSource;
    }

    @Nullable
    public final QRemoteConfigurationSource getSourceApi$sdk_release() {
        return this.sourceApi;
    }

    public int hashCode() {
        int iHashCode = this.payload.hashCode() * 31;
        QExperiment qExperiment = this.experiment;
        int iHashCode2 = (iHashCode + (qExperiment == null ? 0 : qExperiment.hashCode())) * 31;
        QRemoteConfigurationSource qRemoteConfigurationSource = this.sourceApi;
        return iHashCode2 + (qRemoteConfigurationSource != null ? qRemoteConfigurationSource.hashCode() : 0);
    }

    /* renamed from: isCorrect$sdk_release, reason: from getter */
    public final boolean getIsCorrect() {
        return this.isCorrect;
    }

    @NotNull
    public String toString() {
        return "QRemoteConfig(payload=" + this.payload + ", experiment=" + this.experiment + ", sourceApi=" + this.sourceApi + ")";
    }
}
