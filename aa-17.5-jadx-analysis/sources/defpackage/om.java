package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class om {
    public boolean c;
    public final List b = new ArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    public om(boolean z) {
        this.c = z;
    }

    public abstract void b();

    public final ol e(ewv ewvVar) {
        ol olVar = new ol(this, ewvVar);
        this.b.add(olVar);
        return olVar;
    }

    public final void f(boolean z) {
        this.c = z;
        for (ol olVar : this.b) {
            boolean z2 = false;
            if (olVar.a && z) {
                z2 = true;
            }
            olVar.g(z2);
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(nw nwVar) {
    }
}
