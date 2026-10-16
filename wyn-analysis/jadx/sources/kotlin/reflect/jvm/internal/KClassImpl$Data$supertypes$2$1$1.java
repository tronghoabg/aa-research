package kotlin.reflect.jvm.internal;

import ff.m;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KClassImpl$Data$supertypes$2$1$1 extends AbstractC3343n implements a {
    final /* synthetic */ KotlinType $kotlinType;
    final /* synthetic */ KClassImpl<T>.Data this$0;
    final /* synthetic */ KClassImpl<T> this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2$1$1(KotlinType kotlinType, KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.$kotlinType = kotlinType;
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    @Override // tf.a
    @NotNull
    public final Type invoke() {
        ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor = this.$kotlinType.getConstructor().mo419getDeclarationDescriptor();
        if (!(classifierDescriptorMo419getDeclarationDescriptor instanceof ClassDescriptor)) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptorMo419getDeclarationDescriptor);
        }
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) classifierDescriptorMo419getDeclarationDescriptor);
        if (javaClass == null) {
            throw new KotlinReflectionInternalError("Unsupported superclass of " + this.this$0 + ": " + classifierDescriptorMo419getDeclarationDescriptor);
        }
        if (AbstractC3340k.a(this.this$1.getJClass().getSuperclass(), javaClass)) {
            Type genericSuperclass = this.this$1.getJClass().getGenericSuperclass();
            AbstractC3340k.b(genericSuperclass);
            return genericSuperclass;
        }
        Class<?>[] interfaces = this.this$1.getJClass().getInterfaces();
        AbstractC3340k.d(interfaces, "getInterfaces(...)");
        int iY0 = m.y0(javaClass, interfaces);
        if (iY0 >= 0) {
            Type type = this.this$1.getJClass().getGenericInterfaces()[iY0];
            AbstractC3340k.b(type);
            return type;
        }
        throw new KotlinReflectionInternalError("No superclass of " + this.this$0 + " in Java reflection for " + classifierDescriptorMo419getDeclarationDescriptor);
    }
}
