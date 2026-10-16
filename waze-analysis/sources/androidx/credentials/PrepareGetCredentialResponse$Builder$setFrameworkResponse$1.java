package androidx.credentials;

import androidx.credentials.PrepareGetCredentialResponse;
import h.g.a.l;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$1 extends u implements l<String, Boolean> {
    PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(Object obj) {
        super(1, obj, PrepareGetCredentialResponse.Builder.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
    }

    @Override // h.g.a.l
    public final Boolean invoke(String str) {
        x.f(str, "p0");
        return Boolean.valueOf(((PrepareGetCredentialResponse.Builder) this.receiver).hasCredentialType(str));
    }
}
