package androidx.credentials.webauthn;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialParameters {
    private final long alg;
    private final String type;

    public PublicKeyCredentialParameters(String str, long j2) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.type = str;
        this.alg = j2;
    }

    public static /* synthetic */ PublicKeyCredentialParameters copy$default(PublicKeyCredentialParameters publicKeyCredentialParameters, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = publicKeyCredentialParameters.type;
        }
        if ((i2 & 2) != 0) {
            j2 = publicKeyCredentialParameters.alg;
        }
        return publicKeyCredentialParameters.copy(str, j2);
    }

    public final String component1() {
        return this.type;
    }

    public final long component2() {
        return this.alg;
    }

    public final PublicKeyCredentialParameters copy(String str, long j2) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return new PublicKeyCredentialParameters(str, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return x.n(this.type, publicKeyCredentialParameters.type) && this.alg == publicKeyCredentialParameters.alg;
    }

    public final long getAlg() {
        return this.alg;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + PublicKeyCredentialParameters$$ExternalSyntheticBackport0.m(this.alg);
    }

    public String toString() {
        return "PublicKeyCredentialParameters(type=" + this.type + ", alg=" + this.alg + ")";
    }
}
