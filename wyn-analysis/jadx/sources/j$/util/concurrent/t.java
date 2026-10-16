package j$.util.concurrent;

import j$.util.function.Consumer$CC;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37861c;

    public /* synthetic */ t(int i5, Object obj, Object obj2) {
        this.f37859a = i5;
        this.f37860b = obj;
        this.f37861c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f37859a = 2;
        this.f37861c = biFunction;
        this.f37860b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f37859a) {
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.b(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f37860b).accept(obj);
        ((Consumer) this.f37861c).accept(obj);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f37860b).apply(((BiFunction) this.f37861c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f37859a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.f37860b).accept(obj, obj2);
                ((BiConsumer) this.f37861c).accept(obj, obj2);
                return;
        }
        do {
            Object objApply = ((BiFunction) this.f37861c).apply(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f37860b;
            if (concurrentMap.replace(obj, obj2, objApply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }
}
