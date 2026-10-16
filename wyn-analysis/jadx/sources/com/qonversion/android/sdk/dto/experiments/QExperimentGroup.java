package com.qonversion.android.sdk.dto.experiments;

import A7.AbstractC0279p0;
import N0.a;
import com.unity3d.ads.metadata.MediationMetaData;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;", "", "id", "", MediationMetaData.KEY_NAME, "type", "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QExperimentGroup {

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private final QExperimentGroupType type;

    public QExperimentGroup(@InterfaceC2812o(name = "uid") @NotNull String id2, @InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "type") @NotNull QExperimentGroupType type) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(type, "type");
        this.id = id2;
        this.name = name;
        this.type = type;
    }

    public static /* synthetic */ QExperimentGroup copy$default(QExperimentGroup qExperimentGroup, String str, String str2, QExperimentGroupType qExperimentGroupType, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qExperimentGroup.id;
        }
        if ((i5 & 2) != 0) {
            str2 = qExperimentGroup.name;
        }
        if ((i5 & 4) != 0) {
            qExperimentGroupType = qExperimentGroup.type;
        }
        return qExperimentGroup.copy(str, str2, qExperimentGroupType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final QExperimentGroupType getType() {
        return this.type;
    }

    @NotNull
    public final QExperimentGroup copy(@InterfaceC2812o(name = "uid") @NotNull String id2, @InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "type") @NotNull QExperimentGroupType type) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(type, "type");
        return new QExperimentGroup(id2, name, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QExperimentGroup)) {
            return false;
        }
        QExperimentGroup qExperimentGroup = (QExperimentGroup) other;
        return AbstractC3340k.a(this.id, qExperimentGroup.id) && AbstractC3340k.a(this.name, qExperimentGroup.name) && this.type == qExperimentGroup.type;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final QExperimentGroupType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + a.c(this.id.hashCode() * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        QExperimentGroupType qExperimentGroupType = this.type;
        StringBuilder sbR = AbstractC0279p0.r("QExperimentGroup(id=", str, ", name=", str2, ", type=");
        sbR.append(qExperimentGroupType);
        sbR.append(")");
        return sbR.toString();
    }
}
