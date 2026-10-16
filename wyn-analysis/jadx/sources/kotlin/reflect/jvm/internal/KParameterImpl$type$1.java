package kotlin.reflect.jvm.internal;

import ff.o;
import ff.v;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import tf.a;
import zf.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KParameterImpl$type$1 extends AbstractC3343n implements a {
    final /* synthetic */ KParameterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KParameterImpl$type$1(KParameterImpl kParameterImpl) {
        super(0);
        this.this$0 = kParameterImpl;
    }

    @Override // tf.a
    @NotNull
    public final Type invoke() {
        Collection collectionS0;
        ParameterDescriptor descriptor = this.this$0.getDescriptor();
        if ((descriptor instanceof ReceiverParameterDescriptor) && AbstractC3340k.a(UtilKt.getInstanceReceiverParameter(this.this$0.getCallable().getDescriptor()), descriptor) && this.this$0.getCallable().getDescriptor().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            DeclarationDescriptor containingDeclaration = this.this$0.getCallable().getDescriptor().getContainingDeclaration();
            AbstractC3340k.c(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
            if (javaClass != null) {
                return javaClass;
            }
            throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + descriptor);
        }
        Caller<?> caller = this.this$0.getCallable().getCaller();
        if (!(caller instanceof ValueClassAwareCaller)) {
            if (!(caller instanceof ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller)) {
                return caller.getParameterTypes().get(this.this$0.getIndex());
            }
            KParameterImpl kParameterImpl = this.this$0;
            Class[] clsArr = (Class[]) ((ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) caller).getOriginalParametersGroups().get(this.this$0.getIndex()).toArray(new Class[0]);
            return kParameterImpl.compoundType((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        g indices = ((ValueClassAwareCaller) caller).getRealSlicesOfParameters(this.this$0.getIndex());
        List<Type> parameterTypes = caller.getParameterTypes();
        AbstractC3340k.e(parameterTypes, "<this>");
        AbstractC3340k.e(indices, "indices");
        if (indices.isEmpty()) {
            collectionS0 = v.f35432a;
        } else {
            collectionS0 = o.S0(parameterTypes.subList(indices.f48500a, indices.f48501b + 1));
        }
        KParameterImpl kParameterImpl2 = this.this$0;
        Type[] typeArr = (Type[]) collectionS0.toArray(new Type[0]);
        return kParameterImpl2.compoundType((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }
}
