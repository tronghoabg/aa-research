package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

/* loaded from: classes5.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements a {
        private final a initializer;
        private volatile SoftReference<Object> value;

        private static /* synthetic */ void $$$reportNull$$$0(int i5) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }

        public LazySoftVal(@Nullable T t10, @NotNull a aVar) {
            if (aVar == null) {
                $$$reportNull$$$0(0);
            }
            this.value = null;
            this.initializer = aVar;
            if (t10 != null) {
                this.value = new SoftReference<>(escape(t10));
            }
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, tf.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.value;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T t10 = (T) this.initializer.invoke();
            this.value = new SoftReference<>(escape(t10));
            return t10;
        }
    }

    public static abstract class Val<T> {
        private static final Object NULL_VALUE = new Object() { // from class: kotlin.reflect.jvm.internal.ReflectProperties.Val.1
        };

        public Object escape(T t10) {
            return t10 == null ? NULL_VALUE : t10;
        }

        public final T getValue(Object obj, Object obj2) {
            return invoke();
        }

        public abstract T invoke();

        /* JADX WARN: Multi-variable type inference failed */
        public T unescape(Object obj) {
            if (obj == NULL_VALUE) {
                return null;
            }
            return obj;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i5) {
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@Nullable T t10, @NotNull a aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(0);
        }
        return new LazySoftVal<>(t10, aVar);
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@NotNull a aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(1);
        }
        return lazySoft(null, aVar);
    }
}
