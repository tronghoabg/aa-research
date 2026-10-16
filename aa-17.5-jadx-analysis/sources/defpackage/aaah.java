package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aaah implements zxf, zwy {
    public zwv e;
    public float f;
    public float g;
    public float h;
    public float i;
    private final aaac l;
    public final List a = DesugarCollections.synchronizedList(new ArrayList());
    public final List b = DesugarCollections.synchronizedList(new ArrayList());
    public final List c = DesugarCollections.synchronizedList(new ArrayList());
    public final aaad d = new aaad();
    public final acad j = new acad(1);
    public final civ k = new civ(20);

    public aaah(aaac aaacVar) {
        this.l = aaacVar;
    }

    public final zwv a() {
        List list = this.c;
        if (list.size() == 1) {
            return ((aaae) list.get(0)).a;
        }
        return null;
    }

    @Override // defpackage.zwy
    public final zwu b(zwv zwvVar) {
        return new aaae(zwvVar, this);
    }

    @Override // defpackage.zwy
    public final List c() {
        ArrayList arrayList = new ArrayList();
        List list = this.c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((aaae) it.next()).a);
            }
        }
        return arrayList;
    }

    @Override // defpackage.zwy
    public final List d() {
        return c();
    }

    @Override // defpackage.zxf
    public final zvh e(zvi zviVar) {
        zrn.d("Ground Overlays", " are not supported in Lite Mode");
        return null;
    }

    @Override // defpackage.zxf
    public final zxe f(zuk zukVar) {
        return new aaal(zukVar, this);
    }

    @Override // defpackage.zxf
    public final zxe g(zxj zxjVar) {
        return new aaal(zxjVar, this);
    }

    @Override // defpackage.zxf
    public final zxk h(zxl zxlVar) {
        return new aaam(zxlVar, this);
    }

    @Override // defpackage.zxf
    public final aacv i(zyo zyoVar) {
        zrn.d("Tile Overlays", " are not supported in Lite Mode");
        return null;
    }

    final void j(aaap aaapVar) {
        this.a.add(aaapVar);
        m();
    }

    public final void k() {
        zwv zwvVar = this.e;
        if (zwvVar != null) {
            zwvVar.hideInfoWindow();
        }
    }

    final void l(aaae aaaeVar) {
        zwv zwvVar = this.e;
        zwv zwvVar2 = aaaeVar.a;
        if (zwvVar == zwvVar2) {
            this.e = null;
            zwvVar2.b.g(zwvVar2);
        }
        m();
    }

    public final void m() {
        this.l.invalidate();
    }

    final void n(aaap aaapVar) {
        this.a.remove(aaapVar);
        m();
    }

    public final boolean o(float f, float f2) {
        aaap aaapVar;
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return false;
            }
            try {
                aaapVar = (aaap) list.get(size);
            } catch (IndexOutOfBoundsException unused) {
            }
            if (aaapVar != null && aaapVar.f(f, f2)) {
                return true;
            }
        }
    }

    public final boolean p() {
        return this.c.size() > 1;
    }

    public final boolean q(float f, float f2) {
        if (this.e == null) {
            return false;
        }
        float f3 = this.f;
        if (f < f3 || f > f3 + this.h) {
            return false;
        }
        float f4 = this.g;
        return f2 >= f4 && f2 <= f4 + this.i;
    }
}
