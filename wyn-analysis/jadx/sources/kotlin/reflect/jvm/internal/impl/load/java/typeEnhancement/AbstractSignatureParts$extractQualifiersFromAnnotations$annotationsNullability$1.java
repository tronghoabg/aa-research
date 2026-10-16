package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 extends AbstractC3343n implements l {
    final /* synthetic */ AbstractSignatureParts.TypeAndDefaultQualifiers $this_extractQualifiersFromAnnotations;
    final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1(AbstractSignatureParts<TAnnotation> abstractSignatureParts, AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        super(1);
        this.this$0 = abstractSignatureParts;
        this.$this_extractQualifiersFromAnnotations = typeAndDefaultQualifiers;
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@NotNull TAnnotation extractNullability) {
        AbstractC3340k.e(extractNullability, "$this$extractNullability");
        return Boolean.valueOf(this.this$0.forceWarning(extractNullability, this.$this_extractQualifiersFromAnnotations.getType()));
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1) obj);
    }
}
