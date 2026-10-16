package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hsn {
    public final dzk b;
    public final ieb c;
    public final htm e;
    public final htm f;
    public final gms g;
    public final ieb h;
    private final hva i;
    private final htm j;
    public final ieb d = new ieb((byte[]) null);
    public final iea a = new iea();

    public hsn() {
        igc igcVar = new igc(new dzm(20), new hxz(2), new iga());
        this.b = igcVar;
        this.h = new ieb(igcVar);
        this.e = new htm((byte[]) null, (byte[]) null);
        this.c = new ieb();
        this.g = new gms((byte[]) null, (char[]) null);
        this.i = new hva();
        this.f = new htm((char[]) null, (byte[]) null);
        this.j = new htm((char[]) null);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.c.d(arrayList);
    }

    public final hux a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List listB = this.j.b();
        if (listB.isEmpty()) {
            throw new hsj();
        }
        return listB;
    }

    public final List c(Object obj) {
        List listM = this.h.m(obj.getClass());
        if (listM.isEmpty()) {
            throw new hsk(obj);
        }
        int size = listM.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            hzh hzhVar = (hzh) listM.get(i);
            if (hzhVar.a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                }
                arrayList.add(hzhVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new hsk(obj, listM);
        }
        return arrayList;
    }

    public final void d(Class cls, htz htzVar) {
        this.e.e(cls, htzVar);
    }

    public final void e(Class cls, hup hupVar) {
        this.g.i(cls, hupVar);
    }

    public final void f(Class cls, Class cls2, hzi hziVar) {
        this.h.n(cls, cls2, hziVar);
    }

    public final void g(String str, Class cls, Class cls2, huo huoVar) {
        this.c.c(str, huoVar, cls, cls2);
    }

    public final void h(Class cls, Class cls2, hzi hziVar) {
        this.h.o(cls, cls2, hziVar);
    }

    public final void i(Class cls, Class cls2, huo huoVar) {
        this.c.e(huoVar, cls, cls2);
    }

    public final void j(ImageHeaderParser imageHeaderParser) {
        this.j.c(imageHeaderParser);
    }

    public final void k(huw huwVar) {
        this.i.b(huwVar);
    }

    public final void l(Class cls, Class cls2, icw icwVar) {
        this.f.h(cls, cls2, icwVar);
    }
}
