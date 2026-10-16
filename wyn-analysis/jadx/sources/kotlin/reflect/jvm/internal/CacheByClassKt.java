package kotlin.reflect.jvm.internal;

import Fe.e;
import ef.C2529m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkotlin/reflect/jvm/internal/CacheByClass;", "createCache", "(Ltf/l;)Lkotlin/reflect/jvm/internal/CacheByClass;", "", "useClassValue", "Z", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CacheByClassKt {
    private static final boolean useClassValue = false;

    static {
        Object objZ;
        try {
            objZ = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        if (!(objZ instanceof C2529m)) {
            objZ = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objZ instanceof C2529m) {
            objZ = obj;
        }
    }

    @NotNull
    public static final <V> CacheByClass<V> createCache(@NotNull l compute) {
        AbstractC3340k.e(compute, "compute");
        return new ConcurrentHashMapCache(compute);
    }
}
