package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class adrs {
    public adrs(byte[] bArr, char[] cArr) {
        this(null);
    }

    public static void B() {
        java.util.Iterator it = ajmp.o().h().iterator();
        while (it.hasNext()) {
            ((adkg) it.next()).a();
        }
    }

    public static void C() {
        ajmp.o().i();
    }

    public static defpackage.ador D(defpackage.adkr adkrVar) {
        adkrVar.getClass();
        if (!adkrVar.i()) {
            return null;
        }
        java.lang.Throwable thC = adkrVar.c();
        if (thC == null) {
            return defpackage.ador.c.e("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof java.util.concurrent.TimeoutException) {
            return defpackage.ador.f.e(thC.getMessage()).d(thC);
        }
        defpackage.ador adorVarC = defpackage.ador.c(thC);
        return (defpackage.adoo.UNKNOWN.equals(adorVarC.p) && adorVarC.r == thC) ? defpackage.ador.c.e("Context cancelled").d(thC) : adorVarC.d(thC);
    }

    public static void E(java.lang.Throwable th, java.lang.Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (defpackage.afek.a()) {
                th.addSuppressed(th2);
                return;
            }
            java.lang.reflect.Method method = afei.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    @java.lang.Deprecated
    public static void F(afae afaeVar, java.util.function.Consumer consumer) {
        aezs afadVar;
        if (consumer instanceof aezs) {
            afadVar = (aezs) consumer;
        } else {
            consumer.getClass();
            afadVar = new afad(consumer);
        }
        afaeVar.forEachRemaining(afadVar);
    }

    @java.lang.Deprecated
    public static boolean G(afae afaeVar, java.util.function.Consumer consumer) {
        aezs afadVar;
        if (consumer instanceof aezs) {
            afadVar = (aezs) consumer;
        } else {
            consumer.getClass();
            afadVar = new afad(consumer);
        }
        return afaeVar.tryAdvance(afadVar);
    }

    public static aezk H() {
        throw new java.lang.IllegalStateException();
    }

    public static afac I(afac afacVar, afac afacVar2) {
        afacVar2.getClass();
        return new aezz(afacVar, afacVar2, 0);
    }

    public static afac J(afac afacVar, java.util.function.IntPredicate intPredicate) {
        afac afaaVar;
        if (intPredicate instanceof afac) {
            afaaVar = (afac) intPredicate;
        } else {
            intPredicate.getClass();
            afaaVar = new afaa(intPredicate);
        }
        return afacVar.a(afaaVar);
    }

    public static afac K(afac afacVar, afac afacVar2) {
        afacVar2.getClass();
        return new aezz(afacVar, afacVar2, 1);
    }

    public static afac L(afac afacVar, java.util.function.IntPredicate intPredicate) {
        afac afaaVar;
        if (intPredicate instanceof afac) {
            afaaVar = (afac) intPredicate;
        } else {
            intPredicate.getClass();
            afaaVar = new afaa(intPredicate);
        }
        return afacVar.b(afaaVar);
    }

    @java.lang.Deprecated
    public static boolean M(afac afacVar, int i) {
        defpackage.aeao.i(i);
        return afacVar.d((short) i);
    }

    @java.lang.Deprecated
    public static boolean O(afac afacVar, java.lang.Short sh) {
        return afacVar.d(sh.shortValue());
    }

    @java.lang.Deprecated
    public static void Q(aezy aezyVar, java.lang.Short sh) {
        aezyVar.g(sh.shortValue());
    }

    @java.lang.Deprecated
    public static void S(aezy aezyVar, java.lang.Short sh) {
        aezyVar.i(sh.shortValue());
    }

    @java.lang.Deprecated
    public static java.lang.Short T(aezu aezuVar) {
        return java.lang.Short.valueOf(aezuVar.d());
    }

    @java.lang.Deprecated
    public static void V(aezu aezuVar, java.util.function.Consumer consumer) {
        aezs aeztVar;
        if (consumer instanceof aezs) {
            aeztVar = (aezs) consumer;
        } else {
            consumer.getClass();
            aeztVar = new aezt(consumer);
        }
        aezuVar.b(aeztVar);
    }

    public static aezs W(aezs aezsVar, aezs aezsVar2) {
        aezsVar2.getClass();
        return new aezr(aezsVar, aezsVar2);
    }

    public static aezs X(aezs aezsVar, java.util.function.IntConsumer intConsumer) {
        aezs aezqVar;
        if (intConsumer instanceof aezs) {
            aezqVar = (aezs) intConsumer;
        } else {
            intConsumer.getClass();
            aezqVar = new aezq(intConsumer);
        }
        return aezsVar.a(aezqVar);
    }

    @java.lang.Deprecated
    public static void Y(aezs aezsVar, int i) {
        defpackage.aeao.i(i);
        aezsVar.c((short) i);
    }

    @java.lang.Deprecated
    public static java.lang.Integer aF(aewa aewaVar, java.lang.Object obj) {
        int iO = aewaVar.o(obj);
        if (iO == 0) {
            if (!aewaVar.containsKey(obj)) {
                return null;
            }
            iO = 0;
        }
        return java.lang.Integer.valueOf(iO);
    }

    @java.lang.Deprecated
    public static java.lang.Integer aG(aewa aewaVar, java.lang.Object obj, java.lang.Integer num) {
        boolean zContainsKey = aewaVar.containsKey(obj);
        int iA = aewaVar.a(obj, num.intValue());
        if (zContainsKey) {
            return java.lang.Integer.valueOf(iA);
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Integer aH(aewa aewaVar, java.lang.Object obj) {
        if (aewaVar.containsKey(obj)) {
            return java.lang.Integer.valueOf(aewaVar.b(obj));
        }
        return null;
    }

    public static void aI() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static void aJ() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static void aK() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.Object aL(aety aetyVar, java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        java.lang.Object obj2 = aetyVar.get(obj);
        boolean z = obj2 != null || aetyVar.containsKey(obj);
        if (true != z) {
            obj2 = null;
        }
        java.lang.Object objM = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj, obj2);
        if (objM != null) {
            aetyVar.put(obj, objM);
            return objM;
        }
        if (z) {
            aetyVar.remove(obj);
        }
        return null;
    }

    public static java.lang.Object aM(aety aetyVar, java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        java.lang.Object obj2 = aetyVar.get(obj);
        if (obj2 == null && !aetyVar.containsKey(obj)) {
            return null;
        }
        java.lang.Object objM = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj, obj2);
        if (objM == null) {
            aetyVar.remove(obj);
            return null;
        }
        aetyVar.put(obj, objM);
        return objM;
    }

    public static java.lang.Object aN(aety aetyVar, java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        obj2.getClass();
        java.lang.Object obj3 = aetyVar.get(obj);
        if ((obj3 != null || aetyVar.containsKey(obj)) && (obj2 = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj3, obj2)) == null) {
            aetyVar.remove(obj);
            return null;
        }
        aetyVar.put(obj, obj2);
        return obj2;
    }

    public static java.lang.Object aO(aety aetyVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = aetyVar.get(obj);
        if (obj3 != null || aetyVar.containsKey(obj)) {
            return obj3;
        }
        aetyVar.put(obj, obj2);
        return null;
    }

    public static java.lang.Object aP(aety aetyVar, java.lang.Object obj, java.lang.Object obj2) {
        if (aetyVar.containsKey(obj)) {
            return aetyVar.put(obj, obj2);
        }
        return null;
    }

    public static boolean aQ(aety aetyVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = aetyVar.get(obj);
        if (!j$.util.Objects.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !aetyVar.containsKey(obj)) {
            return false;
        }
        aetyVar.remove(obj);
        return true;
    }

    public static boolean aR(aety aetyVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4 = aetyVar.get(obj);
        if (!j$.util.Objects.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !aetyVar.containsKey(obj)) {
            return false;
        }
        aetyVar.put(obj, obj3);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    public static void aS(java.lang.String str, java.lang.String str2, defpackage.sr srVar) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(cCharAt), java.lang.Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Unexpected char %#04x at %d in header value: %s", java.lang.Integer.valueOf(cCharAt2), java.lang.Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            ?? r1 = srVar.a;
            if (i >= r1.size()) {
                r1.add(str);
                r1.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((java.lang.String) r1.get(i))) {
                    r1.remove(i);
                    r1.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    @java.lang.Deprecated
    public static void aa(aezs aezsVar, java.lang.Short sh) {
        aezsVar.c(sh.shortValue());
    }

    @java.lang.Deprecated
    public static int ac(aezk aezkVar, java.lang.Short sh, java.lang.Short sh2) {
        return aezkVar.b(sh.shortValue(), sh2.shortValue());
    }

    public static java.util.Comparator ad(aezk aezkVar, java.util.Comparator comparator) {
        return comparator instanceof aezk ? aezkVar.c((aezk) comparator) : j$.util.Comparator.-CC.$default$thenComparing(aezkVar, comparator);
    }

    @java.lang.Deprecated
    public static java.lang.Short ae(aezg aezgVar) {
        return java.lang.Short.valueOf(aezgVar.e());
    }

    public static java.lang.Object af(aexp aexpVar, java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        java.lang.Object obj2 = aexpVar.get(obj);
        boolean z = obj2 != null || aexpVar.containsKey(obj);
        if (true != z) {
            obj2 = null;
        }
        java.lang.Object objM = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj, obj2);
        if (objM != null) {
            aexpVar.put(obj, objM);
            return objM;
        }
        if (z) {
            aexpVar.remove(obj);
        }
        return null;
    }

    public static java.lang.Object ag(aexp aexpVar, java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        java.lang.Object obj2 = aexpVar.get(obj);
        if (obj2 == null && !aexpVar.containsKey(obj)) {
            return null;
        }
        java.lang.Object objM = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj, obj2);
        if (objM == null) {
            aexpVar.remove(obj);
            return null;
        }
        aexpVar.put(obj, objM);
        return objM;
    }

    public static java.lang.Object ah(aexp aexpVar, java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        obj2.getClass();
        java.lang.Object obj3 = aexpVar.get(obj);
        if ((obj3 != null || aexpVar.containsKey(obj)) && (obj2 = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj3, obj2)) == null) {
            aexpVar.remove(obj);
            return null;
        }
        aexpVar.put(obj, obj2);
        return obj2;
    }

    public static java.lang.Object ai(aexp aexpVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = aexpVar.get(obj);
        if (obj3 != null || aexpVar.containsKey(obj)) {
            return obj3;
        }
        aexpVar.put(obj, obj2);
        return null;
    }

    public static java.lang.Object aj(aexp aexpVar, java.lang.Object obj, java.lang.Object obj2) {
        if (aexpVar.containsKey(obj)) {
            return aexpVar.put(obj, obj2);
        }
        return null;
    }

    public static boolean ak(aexp aexpVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = aexpVar.get(obj);
        if (obj3 != obj2) {
            return false;
        }
        if (obj3 == null && !aexpVar.containsKey(obj)) {
            return false;
        }
        aexpVar.remove(obj);
        return true;
    }

    public static boolean al(aexp aexpVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4 = aexpVar.get(obj);
        if (obj4 != obj2) {
            return false;
        }
        if (obj4 == null && !aexpVar.containsKey(obj)) {
            return false;
        }
        aexpVar.put(obj, obj3);
        return true;
    }

    public static java.lang.Object am() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.Object an() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.Object ao(aewy aewyVar, java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        java.lang.Object obj2 = aewyVar.get(obj);
        boolean z = obj2 != null || aewyVar.containsKey(obj);
        if (true != z) {
            obj2 = null;
        }
        java.lang.Object objM = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj, obj2);
        if (objM != null) {
            aewyVar.put(obj, objM);
            return objM;
        }
        if (z) {
            aewyVar.remove(obj);
        }
        return null;
    }

    public static java.lang.Object ap(aewy aewyVar, java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        java.lang.Object obj2 = aewyVar.get(obj);
        if (obj2 == null && !aewyVar.containsKey(obj)) {
            return null;
        }
        java.lang.Object objM = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj, obj2);
        if (objM == null) {
            aewyVar.remove(obj);
            return null;
        }
        aewyVar.put(obj, objM);
        return objM;
    }

    public static java.lang.Object aq(aewy aewyVar, java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        obj2.getClass();
        java.lang.Object obj3 = aewyVar.get(obj);
        if ((obj3 != null || aewyVar.containsKey(obj)) && (obj2 = a$.ExternalSyntheticApiModelOutline2.m(biFunction, obj3, obj2)) == null) {
            aewyVar.remove(obj);
            return null;
        }
        aewyVar.put(obj, obj2);
        return obj2;
    }

    public static java.lang.Object ar(aewy aewyVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = aewyVar.get(obj);
        if (obj3 != null || aewyVar.containsKey(obj)) {
            return obj3;
        }
        aewyVar.put(obj, obj2);
        return null;
    }

    public static java.lang.Object as(aewy aewyVar, java.lang.Object obj, java.lang.Object obj2) {
        if (aewyVar.containsKey(obj)) {
            return aewyVar.put(obj, obj2);
        }
        return null;
    }

    public static boolean at(aewy aewyVar, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = aewyVar.get(obj);
        if (!j$.util.Objects.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !aewyVar.containsKey(obj)) {
            return false;
        }
        aewyVar.remove(obj);
        return true;
    }

    public static boolean au(aewy aewyVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4 = aewyVar.get(obj);
        if (!j$.util.Objects.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !aewyVar.containsKey(obj)) {
            return false;
        }
        aewyVar.put(obj, obj3);
        return true;
    }

    public static java.lang.Object av() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.Object aw() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static java.lang.Integer ax(aewe aeweVar, java.lang.Object obj, java.lang.Integer num, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$merge(aeweVar, obj, num, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer ay(aewe aeweVar, java.lang.Object obj, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$putIfAbsent(aeweVar, obj, num);
    }

    @java.lang.Deprecated
    public static java.lang.Integer az(aewe aeweVar, java.lang.Object obj, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$replace(aeweVar, obj, num);
    }

    static int h(android.os.Parcel parcel, defpackage.ador adorVar) {
        int i = adorVar.p.r;
        java.lang.String strSubstring = adorVar.q;
        if (strSubstring != null && strSubstring.length() > 1000) {
            strSubstring = strSubstring.substring(0, 1000);
        }
        int i2 = i << 16;
        if (strSubstring == null) {
            return i2;
        }
        int i3 = i2 | 32;
        parcel.writeString(strSubstring);
        return i3;
    }

    static defpackage.ador i(int i, android.os.Parcel parcel) {
        int i2 = i >> 16;
        int i3 = i & 32;
        defpackage.ador adorVarB = defpackage.ador.b(i2 & 255);
        return i3 != 0 ? adorVarB.e(parcel.readString()) : adorVarB;
    }

    static void j(android.os.Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(iDataPosition);
    }

    static boolean k(int i, int i2) {
        return (i & i2) != 0;
    }

    public static java.lang.Boolean l(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static java.lang.Double m(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (!(obj instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static java.lang.Integer n(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (!(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        java.lang.Double d = (java.lang.Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return java.lang.Integer.valueOf(iIntValue);
        }
        throw new java.lang.ClassCastException("Number expected to be integer: ".concat(java.lang.String.valueOf(d)));
    }

    public static java.lang.Long o(java.util.Map map, java.lang.String str) {
        boolean z;
        int iCharAt;
        java.lang.String strP = p(map, str);
        if (strP == null) {
            return null;
        }
        try {
            if (strP.isEmpty() || strP.charAt(strP.length() - 1) != 's') {
                throw new java.text.ParseException("Invalid duration string: ".concat(strP), 0);
            }
            if (strP.charAt(0) == '-') {
                strP = strP.substring(1);
                z = true;
            } else {
                z = false;
            }
            java.lang.String strSubstring = strP.substring(0, strP.length() - 1);
            java.lang.String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long jZ = java.lang.Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i = 0; i < 9; i++) {
                    iCharAt *= 10;
                    if (i < strSubstring2.length()) {
                        if (strSubstring2.charAt(i) < '0' || strSubstring2.charAt(i) > '9') {
                            throw new java.text.ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring2.charAt(i) - '0';
                    }
                }
            }
            if (jZ < 0) {
                throw new java.text.ParseException("Invalid duration string: ".concat(java.lang.String.valueOf(strP)), 0);
            }
            if (z) {
                jZ = -jZ;
                iCharAt = -iCharAt;
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                try {
                    jZ = defpackage.a.z(jZ, iCharAt / 1000000000);
                    iCharAt %= 1000000000;
                } catch (java.lang.IllegalArgumentException unused) {
                    throw new java.text.ParseException("Duration value is out of range.", 0);
                }
            }
            if (jZ > 0 && iCharAt < 0) {
                iCharAt += 1000000000;
                jZ--;
            }
            if (jZ < 0 && iCharAt > 0) {
                iCharAt -= 1000000000;
                jZ++;
            }
            if (!defpackage.a.n(jZ, iCharAt)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", java.lang.Long.valueOf(jZ), java.lang.Integer.valueOf(iCharAt)));
            }
            long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(jZ);
            long j = iCharAt;
            long j2 = nanos + j;
            if (!(((nanos ^ j2) >= 0) | ((j ^ nanos) < 0))) {
                j2 = ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return java.lang.Long.valueOf(j2);
        } catch (java.text.ParseException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static java.lang.String p(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static java.util.List q(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.util.List) {
            return (java.util.List) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static java.util.List r(java.util.Map map, java.lang.String str) {
        java.util.List listQ = q(map, str);
        if (listQ == null) {
            return null;
        }
        u(listQ);
        return listQ;
    }

    public static java.util.List s(java.util.Map map, java.lang.String str) {
        java.util.List listQ = q(map, str);
        if (listQ == null) {
            return null;
        }
        for (int i = 0; i < listQ.size(); i++) {
            if (!(listQ.get(i) instanceof java.lang.String)) {
                throw new java.lang.ClassCastException(java.lang.String.format(java.util.Locale.US, "value '%s' for idx %d in '%s' is not string", listQ.get(i), java.lang.Integer.valueOf(i), listQ));
            }
        }
        return listQ;
    }

    public static java.util.Map t(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static void u(java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof java.util.Map)) {
                throw new java.lang.ClassCastException(java.lang.String.format(java.util.Locale.US, "value %s for idx %d in %s is not object", list.get(i), java.lang.Integer.valueOf(i), list));
            }
        }
    }

    public static void v(defpackage.adng adngVar, defpackage.aeep aeepVar) {
        aeepVar.b(new defpackage.adou(defpackage.ador.k.e(java.lang.String.format("Method %s is unimplemented", adngVar.b)), null));
    }

    public static int w(java.lang.String[] strArr) {
        return strArr.length >> 1;
    }

    public static java.lang.String x(int i, java.lang.String[] strArr) {
        int i2 = i + i;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static java.lang.String y(int i, java.lang.String[] strArr) {
        int i2 = i + i + 1;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static /* synthetic */ java.lang.String z(int i) {
        return i != 1 ? "OUTBOUND" : "INBOUND";
    }

    public defpackage.ador A(defpackage.adnq adnqVar) {
        throw null;
    }

    public void a(adoj adojVar) {
        throw null;
    }

    private adrs() {
    }

    public adrs(char[] cArr) {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void f() {
    }

    public void e(java.lang.Object obj) {
    }
}
