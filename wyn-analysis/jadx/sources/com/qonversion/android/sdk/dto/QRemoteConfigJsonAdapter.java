package com.qonversion.android.sdk.dto;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.dto.experiments.QExperiment;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.P;
import hb.r;
import hb.u;
import hb.w;
import ib.d;
import ib.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V", "Lhb/u;", "options", "Lhb/u;", "", "", "mapOfStringAnyAdapter", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;", "nullableQExperimentAdapter", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;", "nullableQRemoteConfigurationSourceAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRemoteConfigJsonAdapter extends r {

    @NotNull
    private final r mapOfStringAnyAdapter;

    @NotNull
    private final r nullableQExperimentAdapter;

    @NotNull
    private final r nullableQRemoteConfigurationSourceAdapter;

    @NotNull
    private final u options;

    public QRemoteConfigJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("payload", "experiment", "source");
        d dVarF = P.f(Map.class, String.class, Object.class);
        x xVar = x.f35434a;
        this.mapOfStringAnyAdapter = moshi.c(dVarF, xVar, "payload");
        this.nullableQExperimentAdapter = moshi.c(QExperiment.class, xVar, "experiment");
        this.nullableQRemoteConfigurationSourceAdapter = moshi.c(QRemoteConfigurationSource.class, xVar, "sourceApi");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(35, "GeneratedJsonAdapter(QRemoteConfig)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QRemoteConfig fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        Map map = null;
        QExperiment qExperiment = null;
        QRemoteConfigurationSource qRemoteConfigurationSource = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                if (map == null) {
                    throw f.l("payload", "payload", reader);
                }
            } else if (iW == 1) {
                qExperiment = (QExperiment) this.nullableQExperimentAdapter.fromJson(reader);
            } else if (iW == 2) {
                qRemoteConfigurationSource = (QRemoteConfigurationSource) this.nullableQRemoteConfigurationSourceAdapter.fromJson(reader);
            }
        }
        reader.h();
        if (map != null) {
            return new QRemoteConfig(map, qExperiment, qRemoteConfigurationSource);
        }
        throw f.f("payload", "payload", reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QRemoteConfig value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("payload");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getPayload());
        writer.w("experiment");
        this.nullableQExperimentAdapter.toJson(writer, value_.getExperiment());
        writer.w("source");
        this.nullableQRemoteConfigurationSourceAdapter.toJson(writer, value_.getSourceApi$sdk_release());
        writer.i();
    }
}
