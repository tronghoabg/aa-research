package com.qonversion.android.sdk.dto;

import cb.AbstractC1593a;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.P;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfigListJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V", "Lhb/u;", "options", "Lhb/u;", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "listOfQRemoteConfigAdapter", "Lhb/r;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QRemoteConfigListJsonAdapter extends r {

    @NotNull
    private final r listOfQRemoteConfigAdapter;

    @NotNull
    private final u options;

    public QRemoteConfigListJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("remoteConfigs");
        this.listOfQRemoteConfigAdapter = moshi.c(P.f(List.class, QRemoteConfig.class), x.f35434a, "remoteConfigs");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(39, "GeneratedJsonAdapter(QRemoteConfigList)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QRemoteConfigList fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        List list = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0 && (list = (List) this.listOfQRemoteConfigAdapter.fromJson(reader)) == null) {
                throw f.l("remoteConfigs", "remoteConfigs", reader);
            }
        }
        reader.h();
        if (list != null) {
            return new QRemoteConfigList(list);
        }
        throw f.f("remoteConfigs", "remoteConfigs", reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QRemoteConfigList value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("remoteConfigs");
        this.listOfQRemoteConfigAdapter.toJson(writer, value_.getRemoteConfigs());
        writer.i();
    }
}
