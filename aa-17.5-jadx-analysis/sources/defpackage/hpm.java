package defpackage;

import android.service.personalcontext.RenderToken;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class hpm extends hne {
    public static final hpl b = new hpl();
    private final RenderToken c;
    private final Collection d;

    public hpm(RenderToken renderToken, Collection collection) {
        super(hnm.i);
        this.c = renderToken;
        this.d = collection;
    }

    @Override // defpackage.hnj
    public final Collection a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpm)) {
            return false;
        }
        hpm hpmVar = (hpm) obj;
        return affa.f(this.c, hpmVar.c) && affa.f(this.d, hpmVar.d);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }
}
