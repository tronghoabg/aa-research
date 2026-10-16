package defpackage;

import android.os.Bundle;
import android.service.personalcontext.RenderToken;

/* loaded from: classes2.dex */
public final class hpk extends hng {
    public static final hno b = new hno(12);
    private final RenderToken c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpk(RenderToken renderToken) {
        super(hnh.l);
        renderToken.getClass();
        this.c = renderToken;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putParcelable("render_token", this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpk) && affa.f(this.c, ((hpk) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
