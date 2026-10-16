package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ff.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyJavaClassMemberScope$constructors$1 extends AbstractC3343n implements a {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
        this.$c = lazyJavaResolverContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection] */
    @Override // tf.a
    @NotNull
    public final List<ClassConstructorDescriptor> invoke() {
        Collection<JavaConstructor> constructors = this.this$0.jClass.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        Iterator<JavaConstructor> it = constructors.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.resolveConstructor(it.next()));
        }
        if (this.this$0.jClass.isRecord()) {
            ClassConstructorDescriptor classConstructorDescriptorCreateDefaultRecordConstructor = this.this$0.createDefaultRecordConstructor();
            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptorCreateDefaultRecordConstructor, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(classConstructorDescriptorCreateDefaultRecordConstructor);
                this.$c.getComponents().getJavaResolverCache().recordConstructor(this.this$0.jClass, classConstructorDescriptorCreateDefaultRecordConstructor);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (AbstractC3340k.a(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it2.next(), false, false, 2, null), strComputeJvmDescriptor$default)) {
                        break;
                    }
                }
                arrayList.add(classConstructorDescriptorCreateDefaultRecordConstructor);
                this.$c.getComponents().getJavaResolverCache().recordConstructor(this.this$0.jClass, classConstructorDescriptorCreateDefaultRecordConstructor);
            }
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.$c;
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaResolverContext, this.this$0.getOwnerDescriptor(), arrayList);
        SignatureEnhancement signatureEnhancement = this.$c.getComponents().getSignatureEnhancement();
        LazyJavaResolverContext lazyJavaResolverContext2 = this.$c;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayListE = arrayList;
        if (zIsEmpty) {
            arrayListE = AbstractC3935e.E(lazyJavaClassMemberScope.createDefaultConstructor());
        }
        return o.S0(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext2, arrayListE));
    }
}
