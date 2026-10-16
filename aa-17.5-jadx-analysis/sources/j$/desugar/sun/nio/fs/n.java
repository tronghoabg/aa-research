package j$.desugar.sun.nio.fs;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.StringJoiner;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Predicate, j$.time.temporal.l, Function, IntFunction, BiConsumer, BinaryOperator, Supplier {
    public final /* synthetic */ byte a;

    public /* synthetic */ n(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                ((Collection) obj).add(obj2);
                break;
            case 19:
                ((List) obj).add(obj2);
                break;
            case 23:
                ((Set) obj).add(obj2);
                break;
            default:
                ((StringJoiner) obj).add((CharSequence) obj2);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 17:
                break;
            case 20:
                break;
            case 24:
                break;
            case 27:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 20:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 24:
                List list2 = (List) obj;
                Set set3 = Collectors.a;
                list2.addAll((List) obj2);
                return list2;
            case 27:
                StringJoiner stringJoiner = (StringJoiner) obj;
                StringJoiner stringJoiner2 = (StringJoiner) obj2;
                stringJoiner.getClass();
                stringJoiner2.getClass();
                if (stringJoiner2.d == null) {
                    return stringJoiner;
                }
                stringJoiner2.a();
                return stringJoiner.add(stringJoiner2.d[0]);
            default:
                Set set4 = (Set) obj;
                Set set5 = (Set) obj2;
                Set set6 = Collectors.a;
                if (set4.size() < set5.size()) {
                    set5.addAll(set4);
                    return set5;
                }
                set4.addAll(set5);
                return set4;
        }
    }

    public Object c(j$.time.temporal.k kVar) {
        byte b = this.a;
        n nVar = j$.time.temporal.o.a;
        switch (b) {
            case 1:
                return Instant.s(kVar);
            case 2:
                return LocalDate.A(kVar);
            case 3:
                return ZonedDateTime.r(kVar);
            case 4:
                ZoneId zoneId = (ZoneId) kVar.w(nVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 5:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (kVar.d(aVar)) {
                    return LocalTime.I(kVar.C(aVar));
                }
                return null;
            case 6:
                return (ZoneId) kVar.w(nVar);
            case 7:
                return (j$.time.chrono.a) kVar.w(j$.time.temporal.o.b);
            case 8:
                return (TemporalUnit) kVar.w(j$.time.temporal.o.c);
            case 9:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (kVar.d(aVar2)) {
                    return ZoneOffset.ofTotalSeconds(kVar.h(aVar2));
                }
                return null;
            case 10:
                ZoneId zoneId2 = (ZoneId) kVar.w(nVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) kVar.w(j$.time.temporal.o.d);
            case 11:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (kVar.d(aVar3)) {
                    return LocalDate.ofEpochDay(kVar.C(aVar3));
                }
                return null;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 21:
                break;
            case 25:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 18:
                return new ArrayList();
            default:
                return new HashSet();
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo56negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // j$.time.temporal.l
    public Temporal p(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.a(temporal.l(aVar).d, aVar);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((String) obj).isEmpty();
            default:
                j$.com.android.tools.r8.a aVar = ConcurrentLinkedQueue.a;
                return true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "ZoneId";
            case 7:
                return "Chronology";
            case 8:
                return "Precision";
            case 9:
                return "ZoneOffset";
            case 10:
                return "Zone";
            case 11:
                return "LocalDate";
            case 12:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 16:
                break;
            case 19:
                break;
            case 23:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
            case 14:
                break;
            case 21:
                break;
            case 25:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 14:
                return obj;
            case 21:
                Set set = Collectors.a;
                return g.A(((List) obj).toArray());
            case 25:
                Set set2 = Collectors.a;
                return obj;
            default:
                return ((StringJoiner) obj).toString();
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
