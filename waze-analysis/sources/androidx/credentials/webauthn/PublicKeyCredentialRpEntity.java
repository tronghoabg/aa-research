package androidx.credentials.webauthn;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialRpEntity {
    private final String id;
    private final String name;

    public PublicKeyCredentialRpEntity(String str, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(str2, TtmlNode.ATTR_ID);
        this.name = str;
        this.id = str2;
    }

    public static /* synthetic */ PublicKeyCredentialRpEntity copy$default(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = publicKeyCredentialRpEntity.name;
        }
        if ((i2 & 2) != 0) {
            str2 = publicKeyCredentialRpEntity.id;
        }
        return publicKeyCredentialRpEntity.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final PublicKeyCredentialRpEntity copy(String str, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(str2, TtmlNode.ATTR_ID);
        return new PublicKeyCredentialRpEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return x.n(this.name, publicKeyCredentialRpEntity.name) && x.n(this.id, publicKeyCredentialRpEntity.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.id.hashCode();
    }

    public String toString() {
        return "PublicKeyCredentialRpEntity(name=" + this.name + ", id=" + this.id + ")";
    }
}
