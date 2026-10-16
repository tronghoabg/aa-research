package androidx.credentials.provider;

import android.os.Bundle;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class BeginCreateCustomCredentialRequest extends BeginCreateCredentialRequest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginCreateCustomCredentialRequest(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        super(str, bundle, callingAppInfo);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "candidateQueryData");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
