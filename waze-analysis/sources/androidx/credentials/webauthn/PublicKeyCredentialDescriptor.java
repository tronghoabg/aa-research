package androidx.credentials.webauthn;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialDescriptor {
    private final byte[] id;
    private final List<String> transports;
    private final String type;

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List<String> list) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bArr, TtmlNode.ATTR_ID);
        x.f(list, "transports");
        this.type = str;
        this.id = bArr;
        this.transports = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublicKeyCredentialDescriptor copy$default(PublicKeyCredentialDescriptor publicKeyCredentialDescriptor, String str, byte[] bArr, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = publicKeyCredentialDescriptor.type;
        }
        if ((i2 & 2) != 0) {
            bArr = publicKeyCredentialDescriptor.id;
        }
        if ((i2 & 4) != 0) {
            list = publicKeyCredentialDescriptor.transports;
        }
        return publicKeyCredentialDescriptor.copy(str, bArr, list);
    }

    public final String component1() {
        return this.type;
    }

    public final byte[] component2() {
        return this.id;
    }

    public final List<String> component3() {
        return this.transports;
    }

    public final PublicKeyCredentialDescriptor copy(String str, byte[] bArr, List<String> list) {
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bArr, TtmlNode.ATTR_ID);
        x.f(list, "transports");
        return new PublicKeyCredentialDescriptor(str, bArr, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        return x.n(this.type, publicKeyCredentialDescriptor.type) && x.n(this.id, publicKeyCredentialDescriptor.id) && x.n(this.transports, publicKeyCredentialDescriptor.transports);
    }

    public final byte[] getId() {
        return this.id;
    }

    public final List<String> getTransports() {
        return this.transports;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.id)) * 31) + this.transports.hashCode();
    }

    public String toString() {
        return "PublicKeyCredentialDescriptor(type=" + this.type + ", id=" + Arrays.toString(this.id) + ", transports=" + this.transports + ")";
    }
}
