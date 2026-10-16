package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abqo {
    public static final defpackage.abqx a = new defpackage.abqx();

    @java.lang.Deprecated
    static int a(int i, defpackage.abpy abpyVar, defpackage.abqn abqnVar) {
        int iNumberOfLeadingZeros = (352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        return iNumberOfLeadingZeros + iNumberOfLeadingZeros + ((defpackage.abng) abpyVar).e(abqnVar);
    }

    static int b(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof defpackage.aboy)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iIntValue = ((java.lang.Integer) list.get(i)).intValue();
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros((iIntValue + iIntValue) ^ (iIntValue >> 31)) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        defpackage.aboy aboyVar = (defpackage.aboy) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            int iE = aboyVar.e(i);
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros((iE + iE) ^ (iE >> 31)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static int c(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof defpackage.abpt)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jLongValue = ((java.lang.Long) list.get(i)).longValue();
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jLongValue + jLongValue) ^ (jLongValue >> 63)) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        defpackage.abpt abptVar = (defpackage.abpt) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            long jA = abptVar.a(i);
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros((jA + jA) ^ (jA >> 63)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static int d(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof defpackage.aboy)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        defpackage.aboy aboyVar = (defpackage.aboy) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros(aboyVar.e(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static java.lang.Object e(java.lang.Object obj, int i, java.util.List list, defpackage.abpd abpdVar, java.lang.Object obj2, defpackage.abqx abqxVar) {
        if (abpdVar == null) {
            return obj2;
        }
        if (!(list instanceof java.util.RandomAccess)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                if (!abpdVar.a(iIntValue)) {
                    obj2 = k(obj, i, iIntValue, obj2);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Integer num = (java.lang.Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (abpdVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = k(obj, i, iIntValue2, obj2);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static int f(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 4);
    }

    static int g(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 8);
    }

    public static /* synthetic */ int h(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof defpackage.aboy)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        defpackage.aboy aboyVar = (defpackage.aboy) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros(aboyVar.e(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static /* synthetic */ int i(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof defpackage.abpt)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Long) list.get(i)).longValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        defpackage.abpt abptVar = (defpackage.abpt) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros(abptVar.a(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static void j(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.abon abonVar = ((defpackage.abou) obj2).w;
        if (abonVar.g()) {
            return;
        }
        defpackage.abon abonVarI = ((defpackage.abou) obj).i();
        defpackage.abqs abqsVar = abonVar.b;
        int size = abqsVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.abqp abqpVar = (defpackage.abqp) abqsVar.a(i);
            defpackage.abow abowVar = abqpVar.c;
            java.lang.Object objB = abqpVar.a;
            boolean z = objB instanceof defpackage.abpn;
            if (abowVar.d) {
                if (z) {
                    throw new java.lang.IllegalStateException("Lazy fields can not be repeated");
                }
                java.lang.Object objJ = abonVarI.j(abowVar);
                java.util.List list = (java.util.List) objB;
                int size2 = list.size();
                if (objJ == null) {
                    objJ = new java.util.ArrayList(size2);
                }
                java.util.List list2 = (java.util.List) objJ;
                for (int i2 = 0; i2 < size2; i2++) {
                    list2.add(defpackage.abon.c(list.get(i2)));
                }
                abonVarI.b.d(abowVar, objJ);
            } else if (abowVar.a() == defpackage.abrg.i) {
                java.lang.Object objJ2 = abonVarI.j(abowVar);
                if (objJ2 == null) {
                    abonVarI.b.d(abowVar, defpackage.abon.c(objB));
                    if (z) {
                        abonVarI.d = true;
                    }
                } else {
                    if (z) {
                        objB = ((defpackage.abpn) objB).b();
                    }
                    if (objJ2 instanceof defpackage.abpy) {
                        defpackage.abpx abpxVarK = ((defpackage.abpy) objJ2).K();
                        defpackage.abow.b(abpxVarK, objB);
                        abonVarI.b.d(abowVar, abpxVarK.q());
                    } else {
                        defpackage.abow.b(objJ2, objB);
                    }
                }
            } else {
                if (z) {
                    throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
                }
                abonVarI.b.d(abowVar, defpackage.abon.c(objB));
            }
        }
    }

    static java.lang.Object k(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        if (obj2 == null) {
            obj2 = defpackage.abqx.e(obj);
        }
        ((defpackage.abqy) obj2).e(i << 3, java.lang.Long.valueOf(i2));
        return obj2;
    }

    public static void l(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abnm)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).f(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            abofVar.v(i3);
            while (i2 < list.size()) {
                abofVar.d(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        abnm abnmVar = (abnm) list;
        if (!z) {
            while (i2 < abnmVar.b) {
                ((defpackage.abof) kwvVar.a).f(i, abnmVar.f(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abnmVar.b; i6++) {
            abnmVar.f(i6);
            i5++;
        }
        abofVar2.v(i5);
        while (i2 < abnmVar.b) {
            abofVar2.d(abnmVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void m(int i, java.util.List list, defpackage.kwv kwvVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((defpackage.abof) kwvVar.a).g(i, (defpackage.abnv) list.get(i2));
        }
    }

    public static void n(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abog)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).J(i, ((java.lang.Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            abofVar.v(i3);
            while (i2 < list.size()) {
                abofVar.K(((java.lang.Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        abog abogVar = (abog) list;
        if (!z) {
            while (i2 < abogVar.c) {
                ((defpackage.abof) kwvVar.a).J(i, abogVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abogVar.c; i6++) {
            abogVar.e(i6);
            i5 += 8;
        }
        abofVar2.v(i5);
        while (i2 < abogVar.c) {
            abofVar2.K(abogVar.e(i2));
            i2++;
        }
    }

    public static void o(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abop)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).L(i, ((java.lang.Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            abofVar.v(i3);
            while (i2 < list.size()) {
                abofVar.M(((java.lang.Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        abop abopVar = (abop) list;
        if (!z) {
            while (i2 < abopVar.c) {
                ((defpackage.abof) kwvVar.a).L(i, abopVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abopVar.c; i6++) {
            abopVar.e(i6);
            i5 += 4;
        }
        abofVar2.v(i5);
        while (i2 < abopVar.c) {
            abofVar2.M(abopVar.e(i2));
            i2++;
        }
    }

    public static void p(int i, java.util.List list, defpackage.kwv kwvVar, defpackage.abqn abqnVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            kwvVar.l(i, list.get(i2), abqnVar);
        }
    }

    public static void q(int i, java.util.List list, defpackage.kwv kwvVar, defpackage.abqn abqnVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            kwvVar.o(i, list.get(i2), abqnVar);
        }
    }

    public static void r(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.aboy)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = kwvVar.a;
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    ((defpackage.abof) obj).u(i, (iIntValue + iIntValue) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros((iIntValue2 + iIntValue2) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            abofVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                abofVar.v((iIntValue3 + iIntValue3) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        defpackage.aboy aboyVar = (defpackage.aboy) list;
        if (!z) {
            while (i2 < aboyVar.c) {
                java.lang.Object obj2 = kwvVar.a;
                int iE = aboyVar.e(i2);
                ((defpackage.abof) obj2).u(i, (iE + iE) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aboyVar.c; i4++) {
            int iE2 = aboyVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros((iE2 + iE2) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        abofVar2.v(iNumberOfLeadingZeros2);
        while (i2 < aboyVar.c) {
            int iE3 = aboyVar.e(i2);
            abofVar2.v((iE3 + iE3) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void s(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.abpt)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = kwvVar.a;
                    long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                    ((defpackage.abof) obj).w(i, (jLongValue + jLongValue) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            abofVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
                abofVar.x((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        defpackage.abpt abptVar = (defpackage.abpt) list;
        if (!z) {
            while (i2 < abptVar.c) {
                java.lang.Object obj2 = kwvVar.a;
                long jA = abptVar.a(i2);
                ((defpackage.abof) obj2).w(i, (jA + jA) ^ (jA >> 63));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < abptVar.c; i4++) {
            long jA2 = abptVar.a(i4);
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros((jA2 + jA2) ^ (jA2 >> 63)) * 9)) >>> 6;
        }
        abofVar2.v(iNumberOfLeadingZeros2);
        while (i2 < abptVar.c) {
            long jA3 = abptVar.a(i2);
            abofVar2.x((jA3 + jA3) ^ (jA3 >> 63));
            i2++;
        }
    }

    public static void t(int i, java.util.List list, defpackage.kwv kwvVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.abps)) {
            while (i2 < list.size()) {
                ((defpackage.abof) kwvVar.a).r(i, (java.lang.String) list.get(i2));
                i2++;
            }
            return;
        }
        defpackage.abps abpsVar = (defpackage.abps) list;
        while (i2 < list.size()) {
            java.lang.Object objC = abpsVar.c();
            if (objC instanceof java.lang.String) {
                ((defpackage.abof) kwvVar.a).r(i, (java.lang.String) objC);
            } else {
                ((defpackage.abof) kwvVar.a).g(i, (defpackage.abnv) objC);
            }
            i2++;
        }
    }

    public static void u(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.aboy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).u(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            abofVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                abofVar.v(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.aboy aboyVar = (defpackage.aboy) list;
        if (!z) {
            while (i2 < aboyVar.c) {
                ((defpackage.abof) kwvVar.a).u(i, aboyVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aboyVar.c; i4++) {
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros(aboyVar.e(i4)) * 9)) >>> 6;
        }
        abofVar2.v(iNumberOfLeadingZeros2);
        while (i2 < aboyVar.c) {
            abofVar2.v(aboyVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.aboy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).m(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += defpackage.abof.F(((java.lang.Integer) list.get(i3)).intValue());
            }
            abofVar.v(iF);
            while (i2 < list.size()) {
                abofVar.n(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.aboy aboyVar = (defpackage.aboy) list;
        if (!z) {
            while (i2 < aboyVar.c) {
                ((defpackage.abof) kwvVar.a).m(i, aboyVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i4 = 0; i4 < aboyVar.c; i4++) {
            iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(aboyVar.e(i4)) * 9)) >>> 6;
        }
        abofVar2.v(iNumberOfLeadingZeros);
        while (i2 < aboyVar.c) {
            abofVar2.n(aboyVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void w(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.aboy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).i(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            abofVar.v(i3);
            while (i2 < list.size()) {
                abofVar.j(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.aboy aboyVar = (defpackage.aboy) list;
        if (!z) {
            while (i2 < aboyVar.c) {
                ((defpackage.abof) kwvVar.a).i(i, aboyVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aboyVar.c; i6++) {
            aboyVar.e(i6);
            i5 += 4;
        }
        abofVar2.v(i5);
        while (i2 < aboyVar.c) {
            abofVar2.j(aboyVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void x(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.abpt)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).k(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            abofVar.v(i3);
            while (i2 < list.size()) {
                abofVar.l(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        defpackage.abpt abptVar = (defpackage.abpt) list;
        if (!z) {
            while (i2 < abptVar.c) {
                ((defpackage.abof) kwvVar.a).k(i, abptVar.a(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abptVar.c; i6++) {
            abptVar.a(i6);
            i5 += 8;
        }
        abofVar2.v(i5);
        while (i2 < abptVar.c) {
            abofVar2.l(abptVar.a(i2));
            i2++;
        }
    }

    public static /* synthetic */ void y(int i, java.util.List list, defpackage.kwv kwvVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.abpt)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.abof) kwvVar.a).w(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.abof abofVar = (defpackage.abof) kwvVar.a;
            abofVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            abofVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                abofVar.x(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        defpackage.abpt abptVar = (defpackage.abpt) list;
        if (!z) {
            while (i2 < abptVar.c) {
                ((defpackage.abof) kwvVar.a).w(i, abptVar.a(i2));
                i2++;
            }
            return;
        }
        defpackage.abof abofVar2 = (defpackage.abof) kwvVar.a;
        abofVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < abptVar.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros(abptVar.a(i4)) * 9)) >>> 6;
        }
        abofVar2.v(iNumberOfLeadingZeros2);
        while (i2 < abptVar.c) {
            abofVar2.x(abptVar.a(i2));
            i2++;
        }
    }
}
