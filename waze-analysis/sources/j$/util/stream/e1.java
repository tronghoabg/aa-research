package j$.util.stream;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class e1 implements Supplier, BinaryOperator, BiConsumer {
    public static final e1 DEFAULT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e1[] f50386a;

    static {
        e1 e1Var = new e1("DEFAULT", 0);
        DEFAULT = e1Var;
        f50386a = new e1[]{e1Var};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f50386a.clone();
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        throw new UnsupportedOperationException("This combiner cannot be used!");
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return null;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }
}
