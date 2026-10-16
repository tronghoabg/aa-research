package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class ov {
    public final Set a = new CopyOnWriteArraySet();
    public volatile Context b;

    public final void a(ow owVar) {
        owVar.getClass();
        if (this.b != null) {
            owVar.a();
        }
        this.a.add(owVar);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        this.b = context;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ow) it.next()).a();
        }
    }
}
