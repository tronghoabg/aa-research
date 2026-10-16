package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 extends AbstractC3343n implements l {
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 INSTANCE = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1();

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1() {
        super(1);
    }

    @Override // tf.l
    @Nullable
    public final ClassDescriptor invoke(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor = kotlinType.getConstructor().mo419getDeclarationDescriptor();
        if (classifierDescriptorMo419getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo419getDeclarationDescriptor;
        }
        return null;
    }
}
