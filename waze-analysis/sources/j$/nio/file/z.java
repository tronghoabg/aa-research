package j$.nio.file;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.a2;
import j$.util.stream.j7;
import j$.util.stream.k7;
import j$.util.stream.r8;
import j$.util.stream.s7;
import j$.util.stream.u1;
import j$.util.stream.y1;
import j$.util.stream.z1;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class z implements d0, BiConsumer, BiFunction, Consumer, Supplier, r8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49784a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f49785b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f49786c;

    public z(k7 k7Var, z1 z1Var, Supplier supplier) {
        this.f49784a = 7;
        this.f49785b = z1Var;
        this.f49786c = supplier;
    }

    @Override // j$.util.stream.r8
    public Object a(j$.util.stream.a aVar, Spliterator spliterator) {
        y1 y1Var = (y1) ((Supplier) this.f49786c).get();
        aVar.Q(spliterator, y1Var);
        return Boolean.valueOf(y1Var.f50705b);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void u(Object obj) {
        int i2 = this.f49784a;
        Object obj2 = this.f49786c;
        Object obj3 = this.f49785b;
        switch (i2) {
            case 4:
                ((Consumer) obj3).u(obj);
                ((Consumer) obj2).u(obj);
                break;
            case 5:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    atomicBoolean.set(true);
                    break;
                }
            case 6:
            case 7:
            default:
                Consumer consumer = (Consumer) obj2;
                if (((s7) obj3).f50612b.putIfAbsent(obj != null ? obj : s7.f50610d, Boolean.TRUE) == null) {
                    consumer.u(obj);
                    break;
                }
                break;
            case 8:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49784a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f49786c).apply(((BiFunction) this.f49785b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.r8
    public Object b(j$.util.stream.a aVar, Spliterator spliterator) {
        return (Boolean) new a2(this, aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.r8
    public int c() {
        return j7.u | j7.r;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new u1((z1) this.f49785b, (Predicate) this.f49786c);
    }

    @Override // j$.nio.file.d0
    public String name() {
        return (String) this.f49785b;
    }

    public String toString() {
        switch (this.f49784a) {
            case 0:
                return (String) this.f49785b;
            default:
                return super.toString();
        }
    }

    @Override // j$.nio.file.d0
    public Class type() {
        return (Class) this.f49786c;
    }

    public /* synthetic */ z(int i2, Object obj, Object obj2) {
        this.f49784a = i2;
        this.f49785b = obj;
        this.f49786c = obj2;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f49784a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        int i2 = this.f49784a;
        Object obj3 = this.f49786c;
        Object obj4 = this.f49785b;
        switch (i2) {
            case 1:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
        }
    }
}
