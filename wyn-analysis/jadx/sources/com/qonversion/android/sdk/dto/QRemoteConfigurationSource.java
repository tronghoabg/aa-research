package com.qonversion.android.sdk.dto;

import A7.AbstractC0279p0;
import N0.a;
import com.unity3d.ads.metadata.MediationMetaData;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001aJ=\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;", "", "id", "", MediationMetaData.KEY_NAME, "assignmentType", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;", "type", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;", "contextKeyApi", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;)V", "getAssignmentType", "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;", "contextKey", "getContextKey", "()Ljava/lang/String;", "getContextKeyApi$sdk_release", "getId", "getName", "getType", "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;", "component1", "component2", "component3", "component4", "component5", "component5$sdk_release", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QRemoteConfigurationSource {

    @NotNull
    private final QRemoteConfigurationAssignmentType assignmentType;

    @Nullable
    private final String contextKey;

    @Nullable
    private final String contextKeyApi;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private final QRemoteConfigurationSourceType type;

    public QRemoteConfigurationSource(@InterfaceC2812o(name = "uid") @NotNull String id2, @InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "assignment_type") @NotNull QRemoteConfigurationAssignmentType assignmentType, @InterfaceC2812o(name = "type") @NotNull QRemoteConfigurationSourceType type, @InterfaceC2812o(name = "context_key") @Nullable String str) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(assignmentType, "assignmentType");
        AbstractC3340k.e(type, "type");
        this.id = id2;
        this.name = name;
        this.assignmentType = assignmentType;
        this.type = type;
        this.contextKeyApi = str;
        this.contextKey = (str == null || str.length() <= 0) ? null : str;
    }

    public static /* synthetic */ QRemoteConfigurationSource copy$default(QRemoteConfigurationSource qRemoteConfigurationSource, String str, String str2, QRemoteConfigurationAssignmentType qRemoteConfigurationAssignmentType, QRemoteConfigurationSourceType qRemoteConfigurationSourceType, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qRemoteConfigurationSource.id;
        }
        if ((i5 & 2) != 0) {
            str2 = qRemoteConfigurationSource.name;
        }
        if ((i5 & 4) != 0) {
            qRemoteConfigurationAssignmentType = qRemoteConfigurationSource.assignmentType;
        }
        if ((i5 & 8) != 0) {
            qRemoteConfigurationSourceType = qRemoteConfigurationSource.type;
        }
        if ((i5 & 16) != 0) {
            str3 = qRemoteConfigurationSource.contextKeyApi;
        }
        String str4 = str3;
        QRemoteConfigurationAssignmentType qRemoteConfigurationAssignmentType2 = qRemoteConfigurationAssignmentType;
        return qRemoteConfigurationSource.copy(str, str2, qRemoteConfigurationAssignmentType2, qRemoteConfigurationSourceType, str4);
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
    public final QRemoteConfigurationAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final QRemoteConfigurationSourceType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5$sdk_release, reason: from getter */
    public final String getContextKeyApi() {
        return this.contextKeyApi;
    }

    @NotNull
    public final QRemoteConfigurationSource copy(@InterfaceC2812o(name = "uid") @NotNull String id2, @InterfaceC2812o(name = MediationMetaData.KEY_NAME) @NotNull String name, @InterfaceC2812o(name = "assignment_type") @NotNull QRemoteConfigurationAssignmentType assignmentType, @InterfaceC2812o(name = "type") @NotNull QRemoteConfigurationSourceType type, @InterfaceC2812o(name = "context_key") @Nullable String contextKeyApi) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(assignmentType, "assignmentType");
        AbstractC3340k.e(type, "type");
        return new QRemoteConfigurationSource(id2, name, assignmentType, type, contextKeyApi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRemoteConfigurationSource)) {
            return false;
        }
        QRemoteConfigurationSource qRemoteConfigurationSource = (QRemoteConfigurationSource) other;
        return AbstractC3340k.a(this.id, qRemoteConfigurationSource.id) && AbstractC3340k.a(this.name, qRemoteConfigurationSource.name) && this.assignmentType == qRemoteConfigurationSource.assignmentType && this.type == qRemoteConfigurationSource.type && AbstractC3340k.a(this.contextKeyApi, qRemoteConfigurationSource.contextKeyApi);
    }

    @NotNull
    public final QRemoteConfigurationAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    @Nullable
    public final String getContextKey() {
        return this.contextKey;
    }

    @Nullable
    public final String getContextKeyApi$sdk_release() {
        return this.contextKeyApi;
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
    public final QRemoteConfigurationSourceType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + ((this.assignmentType.hashCode() + a.c(this.id.hashCode() * 31, 31, this.name)) * 31)) * 31;
        String str = this.contextKeyApi;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        QRemoteConfigurationAssignmentType qRemoteConfigurationAssignmentType = this.assignmentType;
        QRemoteConfigurationSourceType qRemoteConfigurationSourceType = this.type;
        String str3 = this.contextKeyApi;
        StringBuilder sbR = AbstractC0279p0.r("QRemoteConfigurationSource(id=", str, ", name=", str2, ", assignmentType=");
        sbR.append(qRemoteConfigurationAssignmentType);
        sbR.append(", type=");
        sbR.append(qRemoteConfigurationSourceType);
        sbR.append(", contextKeyApi=");
        return b.c(sbR, str3, ")");
    }
}
