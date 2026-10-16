package j$.nio.file;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.t4;
import j$.util.stream.u3;
import j$.util.stream.v3;
import j$.util.stream.y3;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class h0 implements l0, BiConsumer, BiFunction, Consumer, Supplier, t4 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public h0(v3 v3Var, j$.util.stream.w wVar, h0 h0Var) {
        this.a = (byte) 7;
        this.b = wVar;
        this.c = h0Var;
    }

    @Override // j$.util.stream.t4
    public Object a(j$.util.stream.a aVar, Spliterator spliterator) {
        j$.util.stream.v vVar = (j$.util.stream.v) ((h0) this.c).get();
        aVar.s(spliterator, vVar);
        return Boolean.valueOf(vVar.b);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 4:
                ((Consumer) obj3).accept(obj);
                ((Consumer) obj2).accept(obj);
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
                if (((y3) obj3).b.putIfAbsent(obj != null ? obj : y3.d, Boolean.TRUE) == null) {
                    consumer.accept(obj);
                    break;
                }
                break;
            case 8:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.t4
    public Object b(j$.util.stream.a aVar, Spliterator spliterator) {
        return (Boolean) new j$.util.stream.x(this, aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.t4
    public int c() {
        return u3.t | u3.q;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new j$.util.stream.v((j$.util.stream.w) this.b, (Predicate) this.c);
    }

    @Override // j$.nio.file.l0
    public String name() {
        return (String) this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // j$.nio.file.l0
    public Class type() {
        return (Class) this.c;
    }

    public /* synthetic */ h0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
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
