package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ff.o;
import gf.C2755b;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.l;

/* loaded from: classes5.dex */
public final class LazyJavaClassMemberScope$nestedClasses$1 extends AbstractC3343n implements l {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
        this.$c = lazyJavaResolverContext;
    }

    @Override // tf.l
    @Nullable
    public final ClassDescriptor invoke(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        if (((Set) this.this$0.nestedClassIndex.invoke()).contains(name)) {
            JavaClassFinder finder = this.$c.getComponents().getFinder();
            ClassId classId = DescriptorUtilsKt.getClassId(this.this$0.getOwnerDescriptor());
            AbstractC3340k.b(classId);
            ClassId classIdCreateNestedClassId = classId.createNestedClassId(name);
            AbstractC3340k.d(classIdCreateNestedClassId, "createNestedClassId(...)");
            JavaClass javaClassFindClass = finder.findClass(new JavaClassFinder.Request(classIdCreateNestedClassId, null, this.this$0.jClass, 2, null));
            if (javaClassFindClass == null) {
                return null;
            }
            LazyJavaResolverContext lazyJavaResolverContext = this.$c;
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, this.this$0.getOwnerDescriptor(), javaClassFindClass, null, 8, null);
            lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        if (!((Set) this.this$0.generatedNestedClassNames.invoke()).contains(name)) {
            JavaField javaField = (JavaField) ((Map) this.this$0.enumEntryIndex.invoke()).get(name);
            if (javaField == null) {
                return null;
            }
            return EnumEntrySyntheticClassDescriptor.create(this.$c.getStorageManager(), this.this$0.getOwnerDescriptor(), name, this.$c.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this.this$0)), LazyJavaAnnotationsKt.resolveAnnotations(this.$c, javaField), this.$c.getComponents().getSourceElementFactory().source(javaField));
        }
        LazyJavaResolverContext lazyJavaResolverContext2 = this.$c;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
        C2755b c2755bT = AbstractC3935e.t();
        lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaResolverContext2, lazyJavaClassMemberScope.getOwnerDescriptor(), name, c2755bT);
        C2755b c2755bL = AbstractC3935e.l(c2755bT);
        int iA = c2755bL.a();
        if (iA == 0) {
            return null;
        }
        if (iA == 1) {
            return (ClassDescriptor) o.I0(c2755bL);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + c2755bL).toString());
    }
}
