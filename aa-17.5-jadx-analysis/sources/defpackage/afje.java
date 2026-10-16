package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
final class afje<V> extends ClassValue<SoftReference<V>> {
    public final afec<Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public afje(afec<? super Class<?>, ? extends V> afecVar) {
        afecVar.getClass();
        this.compute = afecVar;
    }

    @Override // java.lang.ClassValue
    protected SoftReference<V> computeValue(Class<?> cls) {
        cls.getClass();
        return new SoftReference<>(this.compute.invoke(cls));
    }

    public final afje<V> createNewCopy() {
        return new afje<>(this.compute);
    }

    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
        return computeValue((Class<?>) cls);
    }
}
