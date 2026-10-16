package androidx.credentials.webauthn;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AuthenticatorSelectionCriteria {
    private final String authenticatorAttachment;
    private final boolean requireResidentKey;
    private final String residentKey;
    private final String userVerification;

    public AuthenticatorSelectionCriteria(String str, String str2, boolean z, String str3) {
        x.f(str, "authenticatorAttachment");
        x.f(str2, "residentKey");
        x.f(str3, "userVerification");
        this.authenticatorAttachment = str;
        this.residentKey = str2;
        this.requireResidentKey = z;
        this.userVerification = str3;
    }

    public static /* synthetic */ AuthenticatorSelectionCriteria copy$default(AuthenticatorSelectionCriteria authenticatorSelectionCriteria, String str, String str2, boolean z, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = authenticatorSelectionCriteria.authenticatorAttachment;
        }
        if ((i2 & 2) != 0) {
            str2 = authenticatorSelectionCriteria.residentKey;
        }
        if ((i2 & 4) != 0) {
            z = authenticatorSelectionCriteria.requireResidentKey;
        }
        if ((i2 & 8) != 0) {
            str3 = authenticatorSelectionCriteria.userVerification;
        }
        return authenticatorSelectionCriteria.copy(str, str2, z, str3);
    }

    public final String component1() {
        return this.authenticatorAttachment;
    }

    public final String component2() {
        return this.residentKey;
    }

    public final boolean component3() {
        return this.requireResidentKey;
    }

    public final String component4() {
        return this.userVerification;
    }

    public final AuthenticatorSelectionCriteria copy(String str, String str2, boolean z, String str3) {
        x.f(str, "authenticatorAttachment");
        x.f(str2, "residentKey");
        x.f(str3, "userVerification");
        return new AuthenticatorSelectionCriteria(str, str2, z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return x.n(this.authenticatorAttachment, authenticatorSelectionCriteria.authenticatorAttachment) && x.n(this.residentKey, authenticatorSelectionCriteria.residentKey) && this.requireResidentKey == authenticatorSelectionCriteria.requireResidentKey && x.n(this.userVerification, authenticatorSelectionCriteria.userVerification);
    }

    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    public final String getResidentKey() {
        return this.residentKey;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public int hashCode() {
        return (((((this.authenticatorAttachment.hashCode() * 31) + this.residentKey.hashCode()) * 31) + AuthenticatorSelectionCriteria$$ExternalSyntheticBackport0.m(this.requireResidentKey)) * 31) + this.userVerification.hashCode();
    }

    public String toString() {
        return "AuthenticatorSelectionCriteria(authenticatorAttachment=" + this.authenticatorAttachment + ", residentKey=" + this.residentKey + ", requireResidentKey=" + this.requireResidentKey + ", userVerification=" + this.userVerification + ")";
    }

    public /* synthetic */ AuthenticatorSelectionCriteria(String str, String str2, boolean z, String str3, int i2, o oVar) {
        this(str, str2, z & ((i2 & 4) == 0), (i2 & 8) != 0 ? "preferred" : str3);
    }
}
