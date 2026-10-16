package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ff.o;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.l;

/* loaded from: classes5.dex */
public final class LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 extends AbstractC3343n implements l {
    final /* synthetic */ SimpleFunctionDescriptor $function;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.$function = simpleFunctionDescriptor;
        this.this$0 = lazyJavaClassMemberScope;
    }

    @Override // tf.l
    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name accessorName) {
        AbstractC3340k.e(accessorName, "accessorName");
        if (AbstractC3340k.a(this.$function.getName(), accessorName)) {
            return AbstractC3935e.C(this.$function);
        }
        return o.E0(this.this$0.searchMethodsInSupertypesWithoutBuiltinMagic(accessorName), this.this$0.searchMethodsByNameWithoutBuiltinMagic(accessorName));
    }
}
