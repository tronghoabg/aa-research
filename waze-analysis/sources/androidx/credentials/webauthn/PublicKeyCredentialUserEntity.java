package androidx.credentials.webauthn;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialUserEntity {
    private final String displayName;
    private final byte[] id;
    private final String name;

    public PublicKeyCredentialUserEntity(String str, byte[] bArr, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(bArr, TtmlNode.ATTR_ID);
        x.f(str2, "displayName");
        this.name = str;
        this.id = bArr;
        this.displayName = str2;
    }

    public static /* synthetic */ PublicKeyCredentialUserEntity copy$default(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, String str, byte[] bArr, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = publicKeyCredentialUserEntity.name;
        }
        if ((i2 & 2) != 0) {
            bArr = publicKeyCredentialUserEntity.id;
        }
        if ((i2 & 4) != 0) {
            str2 = publicKeyCredentialUserEntity.displayName;
        }
        return publicKeyCredentialUserEntity.copy(str, bArr, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final byte[] component2() {
        return this.id;
    }

    public final String component3() {
        return this.displayName;
    }

    public final PublicKeyCredentialUserEntity copy(String str, byte[] bArr, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(bArr, TtmlNode.ATTR_ID);
        x.f(str2, "displayName");
        return new PublicKeyCredentialUserEntity(str, bArr, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return x.n(this.name, publicKeyCredentialUserEntity.name) && x.n(this.id, publicKeyCredentialUserEntity.id) && x.n(this.displayName, publicKeyCredentialUserEntity.displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final byte[] getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Arrays.hashCode(this.id)) * 31) + this.displayName.hashCode();
    }

    public String toString() {
        return "PublicKeyCredentialUserEntity(name=" + this.name + ", id=" + Arrays.toString(this.id) + ", displayName=" + this.displayName + ")";
    }
}
