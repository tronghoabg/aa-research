package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public class yrm {
    public yrm() {
    }

    public static void A(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(a.bp(i, "at index "));
        }
    }

    public static void B(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            A(objArr[i2], i2);
        }
    }

    public static void C(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public static Collection D(Collection collection) {
        return collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? DesugarCollections.unmodifiableSet((Set) collection) : collection instanceof List ? DesugarCollections.unmodifiableList((List) collection) : DesugarCollections.unmodifiableCollection(collection);
    }

    public static int E(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        wub.G(i, "expectedSize");
        return i + 1;
    }

    public static yfy F(Map map) {
        if (map instanceof yfi) {
            return (yfi) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ylx.a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        wub.E(r1, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(r1, value));
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            wub.E(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        return yfi.a(enumMap);
    }

    public static yfy G(Collection collection) {
        yfu yfuVar = new yfu(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            yfuVar.e(it.next(), Integer.valueOf(i));
            i++;
        }
        return yfuVar.d(true);
    }

    public static yfy H(Iterator it, xwx xwxVar, yfu yfuVar) {
        while (it.hasNext()) {
            Object next = it.next();
            yfuVar.e(xwxVar.a(next), next);
        }
        try {
            return yfuVar.d(true);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    public static Object I(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Object J(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String K(Map map) {
        int size = map.size();
        wub.G(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static LinkedHashMap L(int i) {
        return new LinkedHashMap(E(i));
    }

    public static Map.Entry M(Map.Entry entry) {
        entry.getClass();
        return new ykh(entry);
    }

    public static boolean N(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static int O(int i) {
        wub.G(i, "arraySize");
        return wub.aw(i + 5 + (i / 10));
    }

    public static ArrayList P(Iterable iterable) {
        return Q(iterable.iterator());
    }

    public static ArrayList Q(Iterator it) {
        ArrayList arrayList = new ArrayList();
        ad(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList R(Object... objArr) {
        ArrayList arrayList = new ArrayList(O(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList S(int i) {
        wub.G(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static ArrayList T(int i) {
        return new ArrayList(O(i));
    }

    public static List U(List list) {
        return list instanceof yfq ? ((yfq) list).h() : list instanceof yij ? ((yij) list).a : list instanceof RandomAccess ? new yih(list) : new yij(list);
    }

    public static List V(List list, xwx xwxVar) {
        return list instanceof RandomAccess ? new yil(list, xwxVar) : new yin(list, xwxVar);
    }

    public static boolean W(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static yno X(Iterator it) {
        it.getClass();
        return it instanceof yno ? (yno) it : new yhm(it);
    }

    public static Object Y(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object Z(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static abnl aA(Object obj) {
        return ((abns) obj).w;
    }

    public static void aB(abmx abmxVar, Object obj, abnj abnjVar, abnl abnlVar) throws IOException {
        abnh abnhVar = (abnh) obj;
        abnlVar.l(abnhVar.d, abmxVar.s(abnhVar.c.getClass(), abnjVar));
    }

    public static void aC(CountDownLatch countDownLatch) {
        boolean z = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void aD(Thread thread) {
        boolean z = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void aE(Thread thread, long j, TimeUnit timeUnit) {
        thread.getClass();
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, nanos);
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void aF() {
        Thread.currentThread().interrupt();
    }

    public static void aG(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void aH(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public static zgs aI(ExecutorService executorService) {
        return executorService instanceof zgs ? (zgs) executorService : executorService instanceof ScheduledExecutorService ? new zgy((ScheduledExecutorService) executorService) : new zgv(executorService);
    }

    public static zgt aJ(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof zgt ? (zgt) scheduledExecutorService : new zgy(scheduledExecutorService);
    }

    public static Executor aK(final Executor executor, final zeu zeuVar) {
        executor.getClass();
        return executor == zfq.a ? executor : new Executor() { // from class: zgu
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                yrm.aL(executor, zeuVar, runnable);
            }
        };
    }

    public static /* synthetic */ void aL(Executor executor, zeu zeuVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            zeuVar.p(e);
        }
    }

    public static void aM(lds ldsVar, Map.Entry entry) throws IOException {
        abnu abnuVar = (abnu) entry.getKey();
        if (!abnuVar.d) {
            abqd abqdVar = abqd.DOUBLE;
            switch (abnuVar.c.ordinal()) {
                case 0:
                    ldsVar.r(abnuVar.b, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    ldsVar.v(abnuVar.b, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    ldsVar.y(abnuVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    ldsVar.H(abnuVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    ldsVar.x(abnuVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    ldsVar.u(abnuVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    ldsVar.t(abnuVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    ldsVar.p(abnuVar.b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    ldsVar.F(abnuVar.b, (String) entry.getValue());
                    break;
                case 9:
                    ldsVar.w(abnuVar.b, entry.getValue(), abpe.a.b(((abnv) entry.getValue()).getClass()));
                    break;
                case 10:
                    ldsVar.z(abnuVar.b, entry.getValue(), abpe.a.b(((abnv) entry.getValue()).getClass()));
                    break;
                case 11:
                    ldsVar.q(abnuVar.b, (abms) entry.getValue());
                    break;
                case 12:
                    ldsVar.G(abnuVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    ldsVar.x(abnuVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    ldsVar.B(abnuVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    ldsVar.C(abnuVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    ldsVar.D(abnuVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    ldsVar.E(abnuVar.b, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        abqd abqdVar2 = abqd.DOUBLE;
        switch (abnuVar.c.ordinal()) {
            case 0:
                abpm.n(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 1:
                abpm.o(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 2:
                abpm.y(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 3:
                abpm.y(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 4:
                abpm.v(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 5:
                abpm.x(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 6:
                abpm.w(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 7:
                abpm.l(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 8:
                abpm.t(abnuVar.b, (List) entry.getValue(), ldsVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    abpm.p(abnuVar.b, (List) entry.getValue(), ldsVar, abpe.a.b(((abnv) list.get(0)).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    abpm.q(abnuVar.b, (List) entry.getValue(), ldsVar, abpe.a.b(((abnv) list2.get(0)).getClass()));
                    break;
                }
                break;
            case 11:
                abpm.m(abnuVar.b, (List) entry.getValue(), ldsVar);
                break;
            case 12:
                abpm.u(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 13:
                abpm.v(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 14:
                abpm.w(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 15:
                abpm.x(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 16:
                abpm.r(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
            case 17:
                abpm.s(abnuVar.b, (List) entry.getValue(), ldsVar, false);
                break;
        }
    }

    private static void aN(List list, xxj xxjVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!xxjVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        c(list, xxjVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        c(list, xxjVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static String aa(Iterator it) {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static Iterator ab(Iterator it, xwx xwxVar) {
        xwxVar.getClass();
        return new yho(it, xwxVar);
    }

    public static void ac(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean ad(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean ae(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean af(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean ag(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static yht ah(Iterator it) {
        return it instanceof yht ? (yht) it : new yht(it);
    }

    public static Object ai(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Iterable aj(Iterable iterable, xxj xxjVar) {
        iterable.getClass();
        return new yhh(iterable, xxjVar);
    }

    public static Iterable ak(Iterable iterable, int i) {
        woy.O(i >= 0, "limit is negative");
        return new yhl(iterable, i);
    }

    public static Iterable al(Iterable iterable, int i) {
        iterable.getClass();
        woy.O(i >= 0, "number to skip cannot be negative");
        return new yhk(iterable, i);
    }

    public static Iterable am(Iterable iterable, xwx xwxVar) {
        iterable.getClass();
        return new yhi(iterable, xwxVar);
    }

    public static Object an(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object ao(Iterable iterable) {
        return Y(iterable.iterator());
    }

    public static String ap(Iterable iterable) {
        return aa(iterable.iterator());
    }

    public static Collection aq(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        ad(arrayList, it);
        return arrayList;
    }

    public static boolean ar(Collection collection, Iterable iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : ad(collection, iterable.iterator());
    }

    public static boolean as(Iterable iterable, xxj xxjVar) {
        Iterator it = iterable.iterator();
        xxjVar.getClass();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!xxjVar.a(it.next())) {
                i++;
            } else if (i != -1) {
                return true;
            }
        }
        return false;
    }

    public static Object[] at(Iterable iterable, Class cls) {
        return aq(iterable).toArray((Object[]) Array.newInstance((Class<?>) cls, 0));
    }

    public static Object au(Iterable iterable) {
        return ai(iterable.iterator());
    }

    public static void av(Iterable iterable, xxj xxjVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            xxjVar.getClass();
            aN((List) iterable, xxjVar);
            return;
        }
        Iterator it = iterable.iterator();
        xxjVar.getClass();
        while (it.hasNext()) {
            if (xxjVar.a(it.next())) {
                it.remove();
            }
        }
    }

    public static boolean aw(byte b) {
        return b > -65;
    }

    public static abot ax(Object obj, Object obj2) {
        abot abotVarA = (abot) obj;
        abot abotVar = (abot) obj2;
        if (!abotVar.isEmpty()) {
            if (!abotVarA.b) {
                abotVarA = abotVarA.a();
            }
            abotVarA.b();
            if (!abotVar.isEmpty()) {
                abotVarA.putAll(abotVar);
            }
        }
        return abotVarA;
    }

    public static boolean ay(Object obj) {
        return !((abot) obj).b;
    }

    public static List az(Object obj, long j) {
        abqa abqaVar = abqb.a;
        aboh abohVar = (aboh) abqaVar.i(obj, j);
        if (abohVar.c()) {
            return abohVar;
        }
        int size = abohVar.size();
        aboh abohVarD = abohVar.d(size == 0 ? 10 : size + size);
        abqaVar.l(obj, j, abohVarD);
        return abohVarD;
    }

    private static void c(List list, xxj xxjVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (xxjVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static String e(String str, String str2) {
        if (str.length() + str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        return str.concat(String.valueOf(str2));
    }

    public static int f(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static void g(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void h(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean i(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static /* synthetic */ boolean j(int i, yok yokVar, StringBuilder sb) {
        if (i - 1 != 0 || yokVar == yok.a) {
            return false;
        }
        sb.append(yokVar.b());
        sb.append('.');
        sb.append(yokVar.d());
        sb.append(':');
        sb.append(yokVar.a());
        return true;
    }

    public static Collection k(Collection collection, Object obj) {
        return collection instanceof SortedSet ? new ynh((SortedSet) collection, obj) : collection instanceof Set ? new yng((Set) collection, obj) : collection instanceof List ? l((List) collection, obj) : new ymz(collection, obj);
    }

    public static List l(List list, Object obj) {
        return list instanceof RandomAccess ? new ynf(list, obj) : new yna(list, obj);
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ygr n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return iterable.isEmpty() ? yly.a : yfk.h(EnumSet.copyOf((Collection) iterable));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return yly.a;
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        ad(enumSetOf, it);
        return yfk.h(enumSetOf);
    }

    public static ygr o(Enum r0, Enum... enumArr) {
        return yfk.h(EnumSet.of(r0, enumArr));
    }

    public static ymn p(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new yml(set, set2);
    }

    public static HashSet q(Object... objArr) {
        HashSet hashSetR = r(objArr.length);
        Collections.addAll(hashSetR, objArr);
        return hashSetR;
    }

    public static HashSet r(int i) {
        return new HashSet(E(i));
    }

    public static NavigableSet s(NavigableSet navigableSet) {
        return ((navigableSet instanceof yfg) || (navigableSet instanceof ymo)) ? navigableSet : new ymo(navigableSet);
    }

    public static Set t() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set u() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean v(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean w(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof ylc) {
            collection = ((ylc) collection).k();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? x(set, collection.iterator()) : af(set.iterator(), collection);
    }

    public static boolean x(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static Object[] y(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static Object[] z(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = y(objArr, size);
        }
        C(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public ypt a() {
        return yps.a;
    }

    public yrt b() {
        return yrt.b;
    }

    public yrm(int[] iArr) {
    }

    public void d(String str, Level level, boolean z) {
    }
}
