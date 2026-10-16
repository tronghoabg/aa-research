package com.waze.sharedui.api;

import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class AuthParameters implements Serializable {
    public static final c Companion = new c();
    private static final AuthParameters empty = new AuthParameters("", "", null, false, 8, null);
    private final String community;
    private final String token;
    private final AuthTokenType tokenType;
    private final boolean useDataForSignUp;

    public AuthParameters(String str, String str2, AuthTokenType authTokenType, boolean z) {
        x.f(str, "community");
        x.f(str2, "token");
        this.community = str;
        this.token = str2;
        this.tokenType = authTokenType;
        this.useDataForSignUp = z;
    }

    public static /* synthetic */ AuthParameters copy$default(AuthParameters authParameters, String str, String str2, AuthTokenType authTokenType, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = authParameters.community;
        }
        if ((i2 & 2) != 0) {
            str2 = authParameters.token;
        }
        if ((i2 & 4) != 0) {
            authTokenType = authParameters.tokenType;
        }
        if ((i2 & 8) != 0) {
            z = authParameters.useDataForSignUp;
        }
        return authParameters.copy(str, str2, authTokenType, z);
    }

    public final String component1() {
        return this.community;
    }

    public final String component2() {
        return this.token;
    }

    public final AuthTokenType component3() {
        return this.tokenType;
    }

    public final boolean component4() {
        return this.useDataForSignUp;
    }

    public final AuthParameters copy(String str, String str2, AuthTokenType authTokenType, boolean z) {
        x.f(str, "community");
        x.f(str2, "token");
        return new AuthParameters(str, str2, authTokenType, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthParameters)) {
            return false;
        }
        AuthParameters authParameters = (AuthParameters) obj;
        return x.n(this.community, authParameters.community) && x.n(this.token, authParameters.token) && this.tokenType == authParameters.tokenType && this.useDataForSignUp == authParameters.useDataForSignUp;
    }

    public final String getCommunity() {
        return this.community;
    }

    public final String getToken() {
        return this.token;
    }

    public final AuthTokenType getTokenType() {
        return this.tokenType;
    }

    public final boolean getUseDataForSignUp() {
        return this.useDataForSignUp;
    }

    public int hashCode() {
        int iHashCode = (this.community.hashCode() * 31) + this.token.hashCode();
        AuthTokenType authTokenType = this.tokenType;
        return (((iHashCode * 31) + (authTokenType == null ? 0 : authTokenType.hashCode())) * 31) + a.a.a(this.useDataForSignUp);
    }

    public String toString() {
        return "AuthParameters(community=" + this.community + ", token=" + this.token + ", tokenType=" + this.tokenType + ", useDataForSignUp=" + this.useDataForSignUp + ")";
    }

    public /* synthetic */ AuthParameters(String str, String str2, AuthTokenType authTokenType, boolean z, int i2, h.g.b.o oVar) {
        this(str, str2, authTokenType, z & ((i2 & 8) == 0));
    }
}
