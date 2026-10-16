package t8;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w8.d;

/* renamed from: t8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4149c {

    /* renamed from: a, reason: collision with root package name */
    public final O9.b f45941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45942b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f45943c = null;

    public C4149c(O9.b bVar, String str) {
        this.f45941a = bVar;
        this.f45942b = str;
    }

    public static boolean b(ArrayList arrayList, C4148b c4148b) {
        String str = c4148b.f45935a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4148b c4148b2 = (C4148b) it.next();
            if (c4148b2.f45935a.equals(str) && c4148b2.f45936b.equals(c4148b.f45936b)) {
                return true;
            }
        }
        return false;
    }

    public final void a(ArrayList arrayList) {
        O9.b bVar = this.f45941a;
        d dVar = (d) bVar.get();
        String str = this.f45942b;
        ArrayDeque arrayDeque = new ArrayDeque(dVar.d(str));
        if (this.f45943c == null) {
            this.f45943c = Integer.valueOf(((d) bVar.get()).f(str));
        }
        int iIntValue = this.f45943c.intValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4148b c4148b = (C4148b) it.next();
            while (arrayDeque.size() >= iIntValue) {
                ((d) bVar.get()).c(((w8.c) arrayDeque.pollFirst()).f47393b);
            }
            w8.c cVarB = c4148b.b(str);
            ((d) bVar.get()).g(cVarB);
            arrayDeque.offer(cVarB);
        }
    }

    public final void c(ArrayList arrayList) throws C4147a {
        d();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C4148b.a((Map) it.next()));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        String str = this.f45942b;
        O9.b bVar = this.f45941a;
        if (zIsEmpty) {
            d();
            Iterator it2 = ((d) bVar.get()).d(str).iterator();
            while (it2.hasNext()) {
                ((d) bVar.get()).c(((w8.c) it2.next()).f47393b);
            }
            return;
        }
        d();
        List<w8.c> listD = ((d) bVar.get()).d(str);
        ArrayList arrayList3 = new ArrayList();
        for (w8.c cVar : listD) {
            String[] strArr = C4148b.f45933g;
            String str2 = cVar.f47395d;
            if (str2 == null) {
                str2 = "";
            }
            arrayList3.add(new C4148b(cVar.f47393b, String.valueOf(cVar.f47394c), str2, new Date(cVar.f47403m), cVar.f47396e, cVar.f47401j));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C4148b c4148b = (C4148b) it3.next();
            if (!b(arrayList2, c4148b)) {
                arrayList4.add(c4148b.b(str));
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((d) bVar.get()).c(((w8.c) it4.next()).f47393b);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            C4148b c4148b2 = (C4148b) it5.next();
            if (!b(arrayList3, c4148b2)) {
                arrayList5.add(c4148b2);
            }
        }
        a(arrayList5);
    }

    public final void d() throws C4147a {
        if (this.f45941a.get() == null) {
            throw new C4147a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
