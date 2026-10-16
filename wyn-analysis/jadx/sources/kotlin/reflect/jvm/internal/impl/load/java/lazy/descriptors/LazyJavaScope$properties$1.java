package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ff.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class LazyJavaScope$properties$1 extends AbstractC3343n implements l {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    @Override // tf.l
    @NotNull
    public final List<PropertyDescriptor> invoke(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addIfNotNull(arrayList, this.this$0.declaredField.invoke(name));
        this.this$0.computeNonDeclaredProperties(name, arrayList);
        return DescriptorUtils.isAnnotationClass(this.this$0.getOwnerDescriptor()) ? o.S0(arrayList) : o.S0(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), arrayList));
    }
}
