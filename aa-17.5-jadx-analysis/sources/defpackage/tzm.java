package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tzm implements Runnable {
    public boolean c;
    public final gjv d;
    public final List b = new ArrayList();
    private final List e = new ArrayList();
    public final List a = new ArrayList();

    public tzm(gjv gjvVar) {
        this.d = gjvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vaq.d();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((uwl) it.next()).b(true != this.c ? BitmapDescriptorFactory.HUE_RED : 1.0f);
        }
        int i = true != this.c ? 1 : 3;
        for (umo umoVar : this.a) {
            umoVar.t = true;
            umoVar.u = 519;
            umoVar.v = i;
            umoVar.w = 3;
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((umo) it2.next()).x(1, 1);
        }
    }
}
