package defpackage;

import android.os.Bundle;
import android.service.personalcontext.RenderToken;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hpl extends hnd {
    @Override // defpackage.hnd
    public final /* bridge */ /* synthetic */ hne a(Bundle bundle, Set set) {
        RenderToken renderToken = (RenderToken) dlz.g(bundle, "render_token", RenderToken.class);
        if (renderToken != null) {
            return new hpm(renderToken, set);
        }
        throw new IllegalStateException("RenderToken is null");
    }
}
