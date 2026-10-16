package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class adrq {
    private static volatile java.lang.reflect.Method a;

    private adrq() {
    }

    public static /* synthetic */ int A(int i) {
        return i == 1 ? defpackage.abpk.b() : i - 2;
    }

    public static /* synthetic */ int B(int i) {
        return i == 1 ? defpackage.abpk.b() : i - 2;
    }

    public static /* synthetic */ java.lang.Object C(java.lang.Object obj) {
        return (defpackage.absx) defpackage.abox.x(defpackage.absx.a, (byte[]) obj);
    }

    public static java.lang.Object D() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.Object E() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static java.lang.Integer F(aest aestVar, java.lang.Object obj, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$getOrDefault(aestVar, obj, num);
    }

    @java.lang.Deprecated
    public static java.lang.Integer G(aest aestVar, java.lang.Object obj, java.lang.Integer num, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$merge(aestVar, obj, num, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer H(aest aestVar, java.lang.Object obj, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$putIfAbsent(aestVar, obj, num);
    }

    @java.lang.Deprecated
    public static java.lang.Integer I(aest aestVar, java.lang.Object obj, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$replace(aestVar, obj, num);
    }

    public static void O(aest aestVar, java.util.function.BiConsumer biConsumer) {
        aete aeteVarP = aestVar.p();
        aesr aesrVar = new aesr(biConsumer);
        if (!(aeteVarP instanceof aete)) {
            j$.lang.Iterable.-EL.forEach(aeteVarP, aesrVar);
            return;
        }
        aetj aetjVar = aeteVarP.a;
        aetd aetdVar = new aetd(aetjVar);
        if (aetjVar.d) {
            aetdVar.a = aetjVar.e;
            a$.ExternalSyntheticApiModelOutline2.m(aesrVar, aetdVar);
        }
        java.lang.Object[] objArr = aetjVar.a;
        int i = aetjVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                aetdVar.a = i;
                a$.ExternalSyntheticApiModelOutline2.m(aesrVar, aetdVar);
            }
        }
    }

    public static void Q() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static java.lang.Integer R(aesn aesnVar, java.lang.Object obj) {
        int iO = aesnVar.o(obj);
        if (iO == 0) {
            if (!aesnVar.containsKey(obj)) {
                return null;
            }
            iO = 0;
        }
        return java.lang.Integer.valueOf(iO);
    }

    @java.lang.Deprecated
    public static java.lang.Integer S(aesn aesnVar, java.lang.Object obj, java.lang.Integer num) {
        boolean zContainsKey = aesnVar.containsKey(obj);
        int iA = aesnVar.a(obj, num.intValue());
        if (zContainsKey) {
            return java.lang.Integer.valueOf(iA);
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Integer T(aesn aesnVar, java.lang.Object obj) {
        if (aesnVar.containsKey(obj)) {
            return java.lang.Integer.valueOf(aesnVar.b(obj));
        }
        return null;
    }

    @java.lang.Deprecated
    public static void U(aerd aerdVar, java.util.function.Consumer consumer) {
        java.util.function.LongConsumer aercVar;
        if (a$.ExternalSyntheticApiModelOutline2.m$1(consumer)) {
            aercVar = a$.ExternalSyntheticApiModelOutline2.m(consumer);
        } else {
            consumer.getClass();
            aercVar = new aerc(consumer);
        }
        aerdVar.forEachRemaining(aercVar);
    }

    @java.lang.Deprecated
    public static boolean V(aerd aerdVar, java.util.function.Consumer consumer) {
        java.util.function.LongConsumer aercVar;
        if (a$.ExternalSyntheticApiModelOutline2.m$1(consumer)) {
            aercVar = a$.ExternalSyntheticApiModelOutline2.m(consumer);
        } else {
            consumer.getClass();
            aercVar = new aerc(consumer);
        }
        return aerdVar.tryAdvance(aercVar);
    }

    public static aeqf W() {
        throw new java.lang.IllegalStateException();
    }

    @java.lang.Deprecated
    public static void X(aeqt aeqtVar, java.lang.Long l) {
        aeqtVar.c(l.longValue());
    }

    @java.lang.Deprecated
    public static void Z(aeqt aeqtVar, java.lang.Long l) {
        aeqtVar.e(l.longValue());
    }

    @java.lang.Deprecated
    public static java.lang.Long aA(aeno aenoVar, java.lang.Long l, java.lang.Long l2) {
        return (java.lang.Long) j$.util.Map.-CC.$default$putIfAbsent(aenoVar, l, l2);
    }

    @java.lang.Deprecated
    public static java.lang.Long aB(aeno aenoVar, java.lang.Long l, java.lang.Long l2) {
        return (java.lang.Long) j$.util.Map.-CC.$default$replace(aenoVar, l, l2);
    }

    public static void aJ(aeno aenoVar, java.util.function.BiConsumer biConsumer) {
        aeny aenyVarU = aenoVar.u();
        aenn aennVar = new aenn(biConsumer);
        if (!(aenyVarU instanceof aeny)) {
            j$.lang.Iterable.-EL.forEach(aenyVarU, aennVar);
            return;
        }
        aeod aeodVar = aenyVarU.a;
        aenx aenxVar = new aenx(aeodVar);
        if (aeodVar.e) {
            aenxVar.a = aeodVar.f;
            a$.ExternalSyntheticApiModelOutline2.m(aennVar, aenxVar);
        }
        long[] jArr = aeodVar.b;
        int i = aeodVar.f;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
                aenxVar.a = i;
                a$.ExternalSyntheticApiModelOutline2.m(aennVar, aenxVar);
            }
        }
    }

    @java.lang.Deprecated
    public static boolean aK(aeno aenoVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aenoVar.r(((java.lang.Long) obj).longValue());
    }

    @java.lang.Deprecated
    public static java.lang.Long aM(aenj aenjVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        long jT = aenjVar.t(jLongValue);
        if (jT != aenjVar.a() || aenjVar.e(jLongValue)) {
            return java.lang.Long.valueOf(jT);
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Long aN(aenj aenjVar, java.lang.Long l, java.lang.Long l2) {
        long jLongValue = l.longValue();
        boolean zE = aenjVar.e(jLongValue);
        long jB = aenjVar.b(jLongValue, l2.longValue());
        if (zE) {
            return java.lang.Long.valueOf(jB);
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Long aO(aenj aenjVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        if (aenjVar.e(jLongValue)) {
            return java.lang.Long.valueOf(aenjVar.c(jLongValue));
        }
        return null;
    }

    @java.lang.Deprecated
    public static boolean aP(aenj aenjVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aenjVar.e(((java.lang.Long) obj).longValue());
    }

    public static /* synthetic */ void aQ() {
        throw new java.lang.NoSuchMethodError();
    }

    public static void ab() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static void ac() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static java.lang.Long ad(aeqm aeqmVar) {
        return java.lang.Long.valueOf(aeqmVar.nextLong());
    }

    @java.lang.Deprecated
    public static void ae(aeqm aeqmVar, java.util.function.Consumer consumer) {
        java.util.function.LongConsumer aeqlVar;
        if (a$.ExternalSyntheticApiModelOutline2.m$1(consumer)) {
            aeqlVar = a$.ExternalSyntheticApiModelOutline2.m(consumer);
        } else {
            consumer.getClass();
            aeqlVar = new aeql(consumer);
        }
        aeqmVar.forEachRemaining(aeqlVar);
    }

    @java.lang.Deprecated
    public static int af(aeqf aeqfVar, java.lang.Long l, java.lang.Long l2) {
        return aeqfVar.a(l.longValue(), l2.longValue());
    }

    public static java.util.Comparator ah(aeqf aeqfVar, java.util.Comparator comparator) {
        return comparator instanceof aeqf ? aeqfVar.c((aeqf) comparator) : j$.util.Comparator.-CC.$default$thenComparing(aeqfVar, comparator);
    }

    @java.lang.Deprecated
    public static boolean ai(aeqb aeqbVar, java.lang.Long l) {
        return aeqbVar.c(l.longValue());
    }

    @java.lang.Deprecated
    public static boolean aj(aeqb aeqbVar, java.util.function.Predicate predicate) {
        return aeqbVar.i(a$.ExternalSyntheticApiModelOutline2.m(predicate) ? a$.ExternalSyntheticApiModelOutline2.m(predicate) : new aeqa(predicate));
    }

    @java.lang.Deprecated
    public static java.lang.Long ak(aepz aepzVar) {
        return java.lang.Long.valueOf(aepzVar.a());
    }

    @java.lang.Deprecated
    public static java.lang.Object am(aeow aeowVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        java.lang.Object objH = aeowVar.h(jLongValue);
        if (objH != null || aeowVar.c(jLongValue)) {
            return objH;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object an(aeow aeowVar, java.lang.Long l, java.lang.Object obj) {
        long jLongValue = l.longValue();
        boolean zC = aeowVar.c(jLongValue);
        java.lang.Object objA = aeowVar.a(jLongValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object ao(aeow aeowVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        if (aeowVar.c(jLongValue)) {
            return aeowVar.b(jLongValue);
        }
        return null;
    }

    @java.lang.Deprecated
    public static boolean ap(aeow aeowVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aeowVar.c(((java.lang.Long) obj).longValue());
    }

    @java.lang.Deprecated
    public static java.lang.Object ar(aeoe aeoeVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        java.lang.Object objP = aeoeVar.p(jLongValue);
        if (objP != null || aeoeVar.c(jLongValue)) {
            return objP;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object as(aeoe aeoeVar, java.lang.Long l, java.lang.Object obj) {
        long jLongValue = l.longValue();
        boolean zC = aeoeVar.c(jLongValue);
        java.lang.Object objA = aeoeVar.a(jLongValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object at(aeoe aeoeVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        if (aeoeVar.c(jLongValue)) {
            return aeoeVar.b(jLongValue);
        }
        return null;
    }

    @java.lang.Deprecated
    public static boolean au(aeoe aeoeVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aeoeVar.c(((java.lang.Long) obj).longValue());
    }

    @java.lang.Deprecated
    public static java.lang.Long av(aeno aenoVar, java.lang.Long l, java.util.function.BiFunction biFunction) {
        return (java.lang.Long) j$.util.Map.-CC.$default$compute(aenoVar, l, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Long aw(aeno aenoVar, java.lang.Long l, java.util.function.Function function) {
        return (java.lang.Long) j$.util.Map.-CC.$default$computeIfAbsent(aenoVar, l, function);
    }

    @java.lang.Deprecated
    public static java.lang.Long ax(aeno aenoVar, java.lang.Long l, java.util.function.BiFunction biFunction) {
        return (java.lang.Long) j$.util.Map.-CC.$default$computeIfPresent(aenoVar, l, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Long ay(aeno aenoVar, java.lang.Object obj, java.lang.Long l) {
        return (java.lang.Long) j$.util.Map.-CC.$default$getOrDefault(aenoVar, obj, l);
    }

    @java.lang.Deprecated
    public static java.lang.Long az(aeno aenoVar, java.lang.Long l, java.lang.Long l2, java.util.function.BiFunction biFunction) {
        return (java.lang.Long) j$.util.Map.-CC.$default$merge(aenoVar, l, l2, biFunction);
    }

    public static android.content.Context p(android.content.Context context, android.os.UserHandle userHandle) throws java.lang.ReflectiveOperationException {
        if (a == null) {
            synchronized (defpackage.adrq.class) {
                if (a == null) {
                    a = android.content.Context.class.getMethod("createContextAsUser", android.os.UserHandle.class, java.lang.Integer.TYPE);
                }
            }
        }
        return (android.content.Context) a.invoke(context, userHandle, 0);
    }

    public static java.util.List r(java.lang.Class cls, java.util.Iterator it, defpackage.xzi xziVar, adon adonVar) {
        java.lang.Object objNewInstance;
        if (!(it instanceof java.util.ListIterator)) {
            if (s(cls.getClassLoader())) {
                java.lang.Iterable<java.lang.Class> iterable = (java.lang.Iterable) xziVar.fF();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Class cls2 : iterable) {
                    try {
                        objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (java.lang.ClassCastException unused) {
                        objNewInstance = null;
                    } catch (java.lang.Throwable th) {
                        throw new java.util.ServiceConfigurationError(java.lang.String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (objNewInstance != null) {
                        arrayList.add(objNewInstance);
                    }
                }
                it = arrayList.iterator();
            } else if (!it.hasNext()) {
                it = java.util.ServiceLoader.load(cls).iterator();
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            adonVar.b(next);
            arrayList2.add(next);
        }
        java.util.Collections.sort(arrayList2, java.util.Collections.reverseOrder(new defpackage.dab(adonVar, 10, null)));
        return j$.util.DesugarCollections.unmodifiableList(arrayList2);
    }

    public static boolean s(java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void t(defpackage.adng adngVar, adoi adoiVar, java.lang.String str, java.util.Map map) {
        defpackage.aecg aecgVar = new defpackage.aecg(adngVar, adoiVar);
        defpackage.adng adngVar2 = (defpackage.adng) aecgVar.a;
        java.lang.String str2 = adngVar2.b;
        defpackage.ysr.bg("wireless.android.auto.proto.assistant.CarAssistantCallbacksService".equals(adngVar2.c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", "wireless.android.auto.proto.assistant.CarAssistantCallbacksService", str2);
        defpackage.ysr.bn(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, aecgVar);
    }

    public static defpackage.adjx u(defpackage.adjx adjxVar, java.util.List list) {
        adjxVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            adjxVar = new defpackage.adka(adjxVar, (adjz) it.next());
        }
        return adjxVar;
    }

    public static defpackage.adjx v(defpackage.adjx adjxVar, adjz... adjzVarArr) {
        return u(adjxVar, java.util.Arrays.asList(adjzVarArr));
    }

    public static /* synthetic */ int x(int i) {
        return i == 1 ? defpackage.abpk.b() : i - 2;
    }

    public static /* synthetic */ int y(int i) {
        return i == 1 ? defpackage.abpk.b() : i - 2;
    }

    public static /* synthetic */ int z(int i) {
        return i == 1 ? defpackage.abpk.b() : i - 2;
    }

    public void a(defpackage.ador adorVar, defpackage.adnd adndVar) {
        throw null;
    }

    public defpackage.adkb aU() {
        throw null;
    }

    public void b(defpackage.adrq adrqVar, defpackage.adnd adndVar) {
        throw null;
    }

    public void g(java.lang.Object obj) {
        throw null;
    }

    public final synchronized void q() {
    }

    public adrq(short[] sArr) {
    }

    public void h() {
    }

    public void j() {
    }

    public void aV(defpackage.adnd adndVar) {
    }

    public void d(long j) {
    }

    public void e(long j) {
    }

    public void m(int i) {
    }

    public void n(java.lang.Object obj) {
    }

    public void i(java.lang.String str, java.lang.Throwable th) {
    }
}
