package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class hvx {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public hsf c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public hum h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public hui m;
    public hsh n;
    public hwf o;
    public boolean p;
    public boolean q;
    public hwh r;

    final huq a(Class cls) {
        huq huqVar = (huq) this.i.get(cls);
        if (huqVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    huqVar = (huq) entry.getValue();
                    break;
                }
            }
        }
        if (huqVar != null) {
            return huqVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(a.bV(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return iab.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final hwv b(Class cls) {
        hwv hwvVar;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        hsn hsnVarA = this.c.a();
        iea ieaVar = hsnVarA.a;
        AtomicReference atomicReference = ieaVar.c;
        Class cls6 = this.g;
        Class cls7 = this.j;
        hwv hwvVar2 = null;
        ifw ifwVar = (ifw) atomicReference.getAndSet(null);
        if (ifwVar == null) {
            ifwVar = new ifw();
        }
        ifwVar.a(cls5, cls6, cls7);
        yw ywVar = ieaVar.b;
        synchronized (ywVar) {
            hwvVar = (hwv) ywVar.get(ifwVar);
        }
        ieaVar.c.set(ifwVar);
        iea ieaVar2 = hsnVarA.a;
        hwv hwvVar3 = iea.a;
        if (hwvVar3.equals(hwvVar)) {
            return null;
        }
        if (hwvVar != null) {
            return hwvVar;
        }
        ArrayList arrayList = new ArrayList();
        ieb iebVar = hsnVarA.c;
        for (Class cls8 : iebVar.b(cls5, cls6)) {
            htm htmVar = hsnVarA.f;
            for (Class cls9 : htmVar.g(cls8, cls7)) {
                arrayList.add(new hvz(cls5, cls8, cls9, iebVar.a(cls5, cls8), htmVar.f(cls8, cls9), hsnVarA.b));
                cls5 = cls;
                htmVar = htmVar;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            hwvVar2 = new hwv(cls2, cls3, cls4, arrayList, hsnVarA.b);
        }
        yw ywVar2 = ieaVar2.b;
        synchronized (ywVar2) {
            ifw ifwVar2 = new ifw(cls2, cls3, cls4);
            if (hwvVar2 != null) {
                hwvVar3 = hwvVar2;
            }
            ywVar2.put(ifwVar2, hwvVar3);
        }
        return hwvVar2;
    }

    final hxt c() {
        return this.r.a();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final List d() {
        if (!this.l) {
            this.l = true;
            List list = this.b;
            list.clear();
            List listE = e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                ncp ncpVar = (ncp) listE.get(i);
                Object obj = ncpVar.c;
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                int i2 = 0;
                while (true) {
                    ?? r7 = ncpVar.b;
                    if (i2 < r7.size()) {
                        if (!list.contains(r7.get(i2))) {
                            list.add((hui) r7.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final List e() {
        if (!this.k) {
            this.k = true;
            List list = this.a;
            list.clear();
            List listC = this.c.a().c(this.d);
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                ncp ncpVarB = ((hzh) listC.get(i)).b(this.d, this.e, this.f, this.h);
                if (ncpVarB != null) {
                    list.add(ncpVarB);
                }
            }
        }
        return this.a;
    }

    final List f(File file) throws hsk {
        return this.c.a().c(file);
    }

    final boolean g(Class cls) {
        return b(cls) != null;
    }

    final hxl h() {
        return this.c.f;
    }
}
