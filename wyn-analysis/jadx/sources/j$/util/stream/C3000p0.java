package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3000p0 implements Supplier, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38278c;

    public /* synthetic */ C3000p0(int i5, Object obj, Object obj2) {
        this.f38276a = i5;
        this.f38277b = obj;
        this.f38278c = obj2;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f38276a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f38276a) {
            case 0:
                return new C3009r0((EnumC3029v0) this.f38277b, (IntPredicate) this.f38278c);
            default:
                return new C3005q0((EnumC3029v0) this.f38277b, (Predicate) this.f38278c);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f38276a) {
            case 2:
                ((C3003p3) this.f38277b).b((Consumer) this.f38278c, obj);
                break;
            case 3:
                if (obj != null) {
                    ((ConcurrentHashMap) this.f38278c).putIfAbsent(obj, Boolean.TRUE);
                    break;
                } else {
                    ((AtomicBoolean) this.f38277b).set(true);
                    break;
                }
            default:
                ((BiConsumer) this.f38277b).accept(this.f38278c, obj);
                break;
        }
    }
}
