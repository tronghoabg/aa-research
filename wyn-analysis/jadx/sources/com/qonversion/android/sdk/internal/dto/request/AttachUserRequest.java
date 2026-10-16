package com.qonversion.android.sdk.internal.dto.request;

import A7.AbstractC0279p0;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;", "", "groupId", "", "(Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AttachUserRequest {

    @NotNull
    private final String groupId;

    public AttachUserRequest(@InterfaceC2812o(name = "group_id") @NotNull String groupId) {
        AbstractC3340k.e(groupId, "groupId");
        this.groupId = groupId;
    }

    public static /* synthetic */ AttachUserRequest copy$default(AttachUserRequest attachUserRequest, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = attachUserRequest.groupId;
        }
        return attachUserRequest.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final AttachUserRequest copy(@InterfaceC2812o(name = "group_id") @NotNull String groupId) {
        AbstractC3340k.e(groupId, "groupId");
        return new AttachUserRequest(groupId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AttachUserRequest) && AbstractC3340k.a(this.groupId, ((AttachUserRequest) other).groupId);
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return this.groupId.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC0279p0.l("AttachUserRequest(groupId=", this.groupId, ")");
    }
}
