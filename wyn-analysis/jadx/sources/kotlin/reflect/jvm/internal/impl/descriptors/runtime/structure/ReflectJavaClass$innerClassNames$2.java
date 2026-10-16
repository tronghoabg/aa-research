package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class ReflectJavaClass$innerClassNames$2 extends AbstractC3343n implements l {
    public static final ReflectJavaClass$innerClassNames$2 INSTANCE = new ReflectJavaClass$innerClassNames$2();

    public ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    @Override // tf.l
    @Nullable
    public final Name invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!Name.isValidIdentifier(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.identifier(simpleName);
        }
        return null;
    }
}
