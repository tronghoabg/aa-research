package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class akal implements Cloneable, Serializable {
    public static final ajoy[] a = new ajoy[0];
    private static final long serialVersionUID = 2608834160639271617L;
    public final List b = new ArrayList(16);

    public final void a(ajoy ajoyVar) {
        if (ajoyVar == null) {
            return;
        }
        this.b.add(ajoyVar);
    }

    public final void b() {
        this.b.clear();
    }

    public final void c(ajoy[] ajoyVarArr) {
        b();
        if (ajoyVarArr == null) {
            return;
        }
        Collections.addAll(this.b, ajoyVarArr);
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final ajoy[] d() {
        List list = this.b;
        return (ajoy[]) list.toArray(new ajoy[list.size()]);
    }

    public final String toString() {
        return this.b.toString();
    }
}
