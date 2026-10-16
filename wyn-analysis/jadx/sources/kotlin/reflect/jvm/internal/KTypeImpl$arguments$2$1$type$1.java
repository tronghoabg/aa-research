package kotlin.reflect.jvm.internal;

import ef.InterfaceC2525i;
import ff.m;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KTypeImpl$arguments$2$1$type$1 extends AbstractC3343n implements a {
    final /* synthetic */ int $i;
    final /* synthetic */ InterfaceC2525i $parameterizedTypeArguments$delegate;
    final /* synthetic */ KTypeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$1$type$1(KTypeImpl kTypeImpl, int i5, InterfaceC2525i interfaceC2525i) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$i = i5;
        this.$parameterizedTypeArguments$delegate = interfaceC2525i;
    }

    @Override // tf.a
    @NotNull
    public final Type invoke() {
        Type javaType = this.this$0.getJavaType();
        if (javaType instanceof Class) {
            Class cls = (Class) javaType;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            AbstractC3340k.b(componentType);
            return componentType;
        }
        if (javaType instanceof GenericArrayType) {
            if (this.$i == 0) {
                Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
                AbstractC3340k.b(genericComponentType);
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + this.this$0);
        }
        if (!(javaType instanceof ParameterizedType)) {
            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + this.this$0);
        }
        Type type = (Type) KTypeImpl$arguments$2.invoke$lambda$0(this.$parameterizedTypeArguments$delegate).get(this.$i);
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            AbstractC3340k.d(lowerBounds, "getLowerBounds(...)");
            Type type2 = (Type) m.v0(lowerBounds);
            if (type2 == null) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                AbstractC3340k.d(upperBounds, "getUpperBounds(...)");
                type = (Type) m.u0(upperBounds);
            } else {
                type = type2;
            }
        }
        AbstractC3340k.b(type);
        return type;
    }
}
