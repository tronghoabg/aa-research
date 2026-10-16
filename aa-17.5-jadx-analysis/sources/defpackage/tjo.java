package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class tjo {
    private boolean a;
    public final List k = new ArrayList();
    public Object l;

    private final boolean c() {
        if (this.l == null) {
            return false;
        }
        List list = this.k;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((tjo) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    protected abstract Object a();

    public abstract String b();

    public final Object d() throws tjn {
        Object obj;
        if (!f() && c() && (obj = this.l) != null) {
            return obj;
        }
        try {
            Object objA = a();
            this.a = false;
            this.l = objA;
            return objA;
        } catch (Throwable th) {
            throw new tjn("Error building node for ".concat(b()), th);
        }
    }

    public final void e() {
        this.a = true;
    }

    public final boolean f() {
        if (this.a) {
            return true;
        }
        List list = this.k;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((tjo) it.next()).f()) {
                return true;
            }
        }
        return false;
    }
}
