package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.ReflectJvmMapping;
import tf.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KCallableImpl$_absentArguments$1 extends AbstractC3343n implements a {
    final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_absentArguments$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // tf.a
    public final Object[] invoke() {
        int parameterTypeSize;
        List<KParameter> parameters = this.this$0.getParameters();
        int size = (this.this$0.isSuspend() ? 1 : 0) + parameters.size();
        if (((Boolean) ((KCallableImpl) this.this$0).parametersNeedMFVCFlattening.getValue()).booleanValue()) {
            KCallableImpl<R> kCallableImpl = this.this$0;
            parameterTypeSize = 0;
            for (KParameter kParameter : parameters) {
                parameterTypeSize += kParameter.getKind() == KParameter.Kind.VALUE ? kCallableImpl.getParameterTypeSize(kParameter) : 0;
            }
        } else {
            List<KParameter> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                parameterTypeSize = 0;
            } else {
                Iterator<T> it = list.iterator();
                parameterTypeSize = 0;
                while (it.hasNext()) {
                    if (((KParameter) it.next()).getKind() == KParameter.Kind.VALUE && (parameterTypeSize = parameterTypeSize + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
        }
        int i5 = (parameterTypeSize + 31) / 32;
        Object[] objArr = new Object[size + i5 + 1];
        KCallableImpl<R> kCallableImpl2 = this.this$0;
        for (KParameter kParameter2 : parameters) {
            if (kParameter2.isOptional() && !UtilKt.isInlineClassType(kParameter2.getType())) {
                objArr[kParameter2.getIndex()] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(kParameter2.getType()));
            } else if (kParameter2.isVararg()) {
                objArr[kParameter2.getIndex()] = kCallableImpl2.defaultEmptyArray(kParameter2.getType());
            }
        }
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[size + i10] = 0;
        }
        return objArr;
    }
}
