package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class GetCustomCredentialOption extends CredentialOption {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i2) {
        super(str, bundle, bundle2, z, z2, set, i2);
        x.f(bundle, "requestData");
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle2, "candidateQueryData");
        x.f(set, "allowedProviders");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
        if (i2 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2) {
        this(str, bundle, bundle2, z, z2, null, 32, null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "requestData");
        x.f(bundle2, "candidateQueryData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z) {
        this(str, bundle, bundle2, z, false, null, 48, null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "requestData");
        x.f(bundle2, "candidateQueryData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set) {
        this(bundle, str, bundle2, z, z2, set, 0, 64, (o) null);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "requestData");
        x.f(bundle2, "candidateQueryData");
        x.f(set, "allowedProviders");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i2) {
        this(bundle, str, bundle2, z, z2, set, i2);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(bundle, "requestData");
        x.f(bundle2, "candidateQueryData");
        x.f(set, "allowedProviders");
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i2, int i3, o oVar) {
        this(str, bundle, bundle2, z, ((i3 & 16) == 0) & z2, (Set<ComponentName>) ((i3 & 32) != 0 ? a.p() : set), (i3 & 64) != 0 ? 2000 : i2);
    }

    public /* synthetic */ GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z, boolean z2, Set set, int i2, int i3, o oVar) {
        this(bundle, str, bundle2, z, ((i3 & 16) == 0) & z2, (Set<ComponentName>) ((i3 & 32) != 0 ? a.p() : set), (i3 & 64) != 0 ? 2000 : i2);
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i2, o oVar) {
        this(str, bundle, bundle2, z, ((i2 & 16) == 0) & z2, (i2 & 32) != 0 ? a.p() : set);
    }
}
