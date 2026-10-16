package defpackage;

import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes.dex */
final class advu {
    final Object a = new Object();
    Collection b = new HashSet();
    adnq c;
    final /* synthetic */ advv d;

    public advu(advv advvVar) {
        this.d = advvVar;
    }

    final void a(adnq adnqVar) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = adnqVar;
            boolean zIsEmpty = this.b.isEmpty();
            if (zIsEmpty) {
                this.d.x.q(adnqVar);
            }
        }
    }
}
