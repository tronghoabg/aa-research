package defpackage;

import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* loaded from: classes2.dex */
public final class suy extends sva {
    final /* synthetic */ nok a;

    public suy(nok nokVar) {
        this.a = nokVar;
    }

    @Override // defpackage.sva
    public final void a(Status status, PseudonymousIdToken pseudonymousIdToken, ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            std stdVar = ssh.a;
        }
        oni.n(status, pseudonymousIdToken, this.a);
    }
}
