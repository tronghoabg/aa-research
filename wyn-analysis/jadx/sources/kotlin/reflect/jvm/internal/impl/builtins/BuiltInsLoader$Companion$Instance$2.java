package kotlin.reflect.jvm.internal.impl.builtins;

import ff.o;
import java.util.ServiceLoader;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class BuiltInsLoader$Companion$Instance$2 extends AbstractC3343n implements a {
    public static final BuiltInsLoader$Companion$Instance$2 INSTANCE = new BuiltInsLoader$Companion$Instance$2();

    public BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    @Override // tf.a
    @NotNull
    public final BuiltInsLoader invoke() {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
        AbstractC3340k.b(serviceLoaderLoad);
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) o.r0(serviceLoaderLoad);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
