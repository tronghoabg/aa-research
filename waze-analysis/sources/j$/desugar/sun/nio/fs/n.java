package j$.desugar.sun.nio.fs;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.q1;
import j$.util.stream.Collectors;
import j$.util.u;
import j$.util.v;
import j$.util.x;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements Predicate, j$.time.temporal.k, IntFunction, Supplier, BiConsumer, BinaryOperator, Function, DoubleFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49676a;

    public /* synthetic */ n(int i2) {
        this.f49676a = i2;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f49676a) {
            case 15:
                ((List) obj).add(obj2);
                break;
            case 22:
                ((q1) obj).a((CharSequence) obj2);
                break;
            case 26:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 27:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((u) obj).a((u) obj2);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f49676a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f49676a) {
            case 15:
                break;
            case 22:
                break;
            case 26:
                break;
            case 27:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f49676a) {
            case 16:
                List list = (List) obj;
                Set set = Collectors.f50307a;
                list.addAll((List) obj2);
                return list;
            case 20:
                List list2 = (List) obj;
                Set set2 = Collectors.f50307a;
                list2.addAll((List) obj2);
                return list2;
            default:
                q1 q1Var = (q1) obj;
                q1 q1Var2 = (q1) obj2;
                q1Var.getClass();
                Objects.requireNonNull(q1Var2);
                if (q1Var2.f50297d != null) {
                    q1Var2.b();
                    q1Var.a(q1Var2.f50297d[0]);
                }
                return q1Var;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.f49676a) {
            case 17:
                break;
            case 21:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    public Object d(TemporalAccessor temporalAccessor) {
        int i2 = this.f49676a;
        n nVar = j$.time.temporal.n.f50065a;
        switch (i2) {
            case 1:
                return LocalDate.M(temporalAccessor);
            case 2:
                n nVar2 = DateTimeFormatterBuilder.f49905h;
                ZoneId zoneId = (ZoneId) temporalAccessor.x(nVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 3:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.c(aVar)) {
                    return LocalTime.P(temporalAccessor.D(aVar));
                }
                return null;
            case 4:
                return (ZoneId) temporalAccessor.x(nVar);
            case 5:
                return (Chronology) temporalAccessor.x(j$.time.temporal.n.f50066b);
            case 6:
                return (TemporalUnit) temporalAccessor.x(j$.time.temporal.n.f50067c);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.c(aVar2)) {
                    return ZoneOffset.S(temporalAccessor.f(aVar2));
                }
                return null;
            case 8:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.x(nVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.x(j$.time.temporal.n.f50068d);
            case 9:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.c(aVar3)) {
                    return LocalDate.ofEpochDay(temporalAccessor.D(aVar3));
                }
                return null;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f49676a) {
            case 13:
                return new u();
            case 14:
                return new ArrayList();
            case 15:
            case 16:
            case 17:
            default:
                return new LinkedHashSet();
            case 18:
                return new v();
            case 19:
                return new x();
        }
    }

    @Override // j$.time.temporal.k
    public Temporal m(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.a(temporal.k(aVar).f50075d, aVar);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f49676a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f49676a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f49676a) {
            case 0:
                return !((String) obj).isEmpty();
            default:
                j$.com.android.tools.r8.b bVar = ConcurrentLinkedQueue.f50157a;
                return true;
        }
    }

    public String toString() {
        switch (this.f49676a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f49676a) {
            case 16:
                break;
            case 20:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m37426andThen(Function function) {
        switch (this.f49676a) {
            case 17:
                break;
            case 21:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.f49676a) {
            case 17:
                Set set = Collectors.f50307a;
                return j$.com.android.tools.r8.a.I(((List) obj).toArray());
            case 21:
                Set set2 = Collectors.f50307a;
                return obj;
            default:
                return ((q1) obj).toString();
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d2) {
        return Double.valueOf(d2);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i2) {
        return new Object[i2];
    }
}
