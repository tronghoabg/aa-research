package com.qonversion.android.sdk.internal.dto.request;

import R8.v;
import hb.InterfaceC2812o;
import hb.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;", "", "anonID", "", "identityID", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnonID", "()Ljava/lang/String;", "getIdentityID", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IdentityRequest {

    @NotNull
    private final String anonID;

    @NotNull
    private final String identityID;

    public IdentityRequest(@InterfaceC2812o(name = "anon_id") @NotNull String anonID, @InterfaceC2812o(name = "identity_id") @NotNull String identityID) {
        AbstractC3340k.e(anonID, "anonID");
        AbstractC3340k.e(identityID, "identityID");
        this.anonID = anonID;
        this.identityID = identityID;
    }

    public static /* synthetic */ IdentityRequest copy$default(IdentityRequest identityRequest, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = identityRequest.anonID;
        }
        if ((i5 & 2) != 0) {
            str2 = identityRequest.identityID;
        }
        return identityRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAnonID() {
        return this.anonID;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIdentityID() {
        return this.identityID;
    }

    @NotNull
    public final IdentityRequest copy(@InterfaceC2812o(name = "anon_id") @NotNull String anonID, @InterfaceC2812o(name = "identity_id") @NotNull String identityID) {
        AbstractC3340k.e(anonID, "anonID");
        AbstractC3340k.e(identityID, "identityID");
        return new IdentityRequest(anonID, identityID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityRequest)) {
            return false;
        }
        IdentityRequest identityRequest = (IdentityRequest) other;
        return AbstractC3340k.a(this.anonID, identityRequest.anonID) && AbstractC3340k.a(this.identityID, identityRequest.identityID);
    }

    @NotNull
    public final String getAnonID() {
        return this.anonID;
    }

    @NotNull
    public final String getIdentityID() {
        return this.identityID;
    }

    public int hashCode() {
        return this.identityID.hashCode() + (this.anonID.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return v.g("IdentityRequest(anonID=", this.anonID, ", identityID=", this.identityID, ")");
    }
}
