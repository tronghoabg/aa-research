package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/ClassValueCache;", "V", "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Ltf/l;)V", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "get", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lef/C;", "clear", "()V", "Lkotlin/reflect/jvm/internal/ComputableClassValue;", "classValue", "Lkotlin/reflect/jvm/internal/ComputableClassValue;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ClassValueCache<V> extends CacheByClass<V> {

    @NotNull
    private volatile ComputableClassValue<V> classValue;

    public ClassValueCache(@NotNull l compute) {
        AbstractC3340k.e(compute, "compute");
        this.classValue = new ComputableClassValue<>(compute);
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public void clear() {
        this.classValue = this.classValue.createNewCopy();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public V get(@NotNull Class<?> key) {
        AbstractC3340k.e(key, "key");
        ComputableClassValue<V> computableClassValue = this.classValue;
        V v2 = (V) ((SoftReference) computableClassValue.get(key)).get();
        if (v2 != null) {
            return v2;
        }
        computableClassValue.remove(key);
        V v10 = (V) ((SoftReference) computableClassValue.get(key)).get();
        return v10 != null ? v10 : (V) computableClassValue.compute.invoke(key);
    }
}
