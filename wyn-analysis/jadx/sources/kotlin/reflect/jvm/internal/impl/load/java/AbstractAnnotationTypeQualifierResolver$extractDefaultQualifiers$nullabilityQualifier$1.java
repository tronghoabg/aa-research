package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1 extends AbstractC3343n implements l {
    public static final AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1 INSTANCE = new AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1();

    public AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@NotNull TAnnotation extractNullability) {
        AbstractC3340k.e(extractNullability, "$this$extractNullability");
        return Boolean.FALSE;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AbstractAnnotationTypeQualifierResolver$extractDefaultQualifiers$nullabilityQualifier$1) obj);
    }
}
