package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class CreateCustomCredentialRequest extends CreateCredentialRequest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, String str2, boolean z3) {
        super(str, bundle, bundle2, z, z2, displayInfo, str2, z3);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "credentialData");
        x.f(bundle2, "candidateQueryData");
        x.f(displayInfo, "displayInfo");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2) {
        this(str, bundle, bundle2, z, displayInfo, z2, null, false, 192, null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "credentialData");
        x.f(bundle2, "candidateQueryData");
        x.f(displayInfo, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, String str2) {
        this(str, bundle, bundle2, z, displayInfo, z2, str2, false, 128, null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "credentialData");
        x.f(bundle2, "candidateQueryData");
        x.f(displayInfo, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo) {
        this(str, bundle, bundle2, z, displayInfo, false, null, false, 224, null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "credentialData");
        x.f(bundle2, "candidateQueryData");
        x.f(displayInfo, "displayInfo");
    }

    public /* synthetic */ CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, String str2, boolean z3, int i2, o oVar) {
        this(str, bundle, bundle2, z, displayInfo, z2 & ((i2 & 32) == 0), (i2 & 64) != 0 ? null : str2, z3 & ((i2 & 128) == 0));
    }
}
