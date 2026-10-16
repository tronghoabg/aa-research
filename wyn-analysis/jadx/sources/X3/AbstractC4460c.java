package x3;

import androidx.webkit.ProfileStore;
import y3.AbstractC4557o;
import y3.AbstractC4559q;
import y3.C4549g;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4460c {
    public static ProfileStore a() {
        if (!AbstractC4557o.f48015j.b()) {
            throw AbstractC4557o.a();
        }
        if (C4549g.f47995b == null) {
            C4549g.f47995b = new C4549g(AbstractC4559q.f48019a.getProfileStore());
        }
        return C4549g.f47995b;
    }
}
