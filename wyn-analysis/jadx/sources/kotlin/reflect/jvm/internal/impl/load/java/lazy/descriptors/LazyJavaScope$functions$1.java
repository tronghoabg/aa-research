package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ff.o;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class LazyJavaScope$functions$1 extends AbstractC3343n implements l {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    @Override // tf.l
    @NotNull
    public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) this.this$0.declaredFunctions.invoke(name));
        this.this$0.retainMostSpecificMethods(linkedHashSet);
        this.this$0.computeNonDeclaredFunctions(linkedHashSet, name);
        return o.S0(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), linkedHashSet));
    }
}
