package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import ff.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {

    @NotNull
    private final List<SyntheticJavaPartsProvider> inner;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(@NotNull List<? extends SyntheticJavaPartsProvider> inner) {
        AbstractC3340k.e(inner, "inner");
        this.inner = inner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull List<ClassConstructorDescriptor> result) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        AbstractC3340k.e(result, "result");
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateConstructors(context_receiver_0, thisDescriptor, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> result) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(result, "result");
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateMethods(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> result) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(result, "result");
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateNestedClass(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> result) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(result, "result");
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateStaticFunctions(context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getMethodNames(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        List<SyntheticJavaPartsProvider> list = this.inner;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            t.e0(((SyntheticJavaPartsProvider) it.next()).getMethodNames(context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getNestedClassNames(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        List<SyntheticJavaPartsProvider> list = this.inner;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            t.e0(((SyntheticJavaPartsProvider) it.next()).getNestedClassNames(context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List<Name> getStaticFunctionNames(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        List<SyntheticJavaPartsProvider> list = this.inner;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            t.e0(((SyntheticJavaPartsProvider) it.next()).getStaticFunctionNames(context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public PropertyDescriptorImpl modifyField(@NotNull LazyJavaResolverContext context_receiver_0, @NotNull ClassDescriptor thisDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptor) {
        AbstractC3340k.e(context_receiver_0, "$context_receiver_0");
        AbstractC3340k.e(thisDescriptor, "thisDescriptor");
        AbstractC3340k.e(propertyDescriptor, "propertyDescriptor");
        Iterator<T> it = this.inner.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((SyntheticJavaPartsProvider) it.next()).modifyField(context_receiver_0, thisDescriptor, propertyDescriptor);
        }
        return propertyDescriptor;
    }
}
