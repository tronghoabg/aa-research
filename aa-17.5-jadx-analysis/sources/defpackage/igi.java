package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class igi {
    public List a = null;

    public final void a(igi igiVar) {
        List list = igiVar.a;
        if (list == null) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList(list.size());
        }
        Iterator it = igiVar.a.iterator();
        while (it.hasNext()) {
            this.a.add((igh) it.next());
        }
    }

    public final String toString() {
        if (this.a == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(((igh) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
