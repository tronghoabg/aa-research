package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class LazyJavaScope$declaredField$1 extends AbstractC3343n implements l {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredField$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    @Override // tf.l
    @Nullable
    public final PropertyDescriptor invoke(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        if (this.this$0.getMainScope() != null) {
            return (PropertyDescriptor) this.this$0.getMainScope().declaredField.invoke(name);
        }
        JavaField javaFieldFindFieldByName = ((DeclaredMemberIndex) this.this$0.getDeclaredMemberIndex().invoke()).findFieldByName(name);
        if (javaFieldFindFieldByName == null || javaFieldFindFieldByName.isEnumEntry()) {
            return null;
        }
        return this.this$0.resolveProperty(javaFieldFindFieldByName);
    }
}
