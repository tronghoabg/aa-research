package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import org.jetbrains.annotations.NotNull;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "kotlin.jvm.PlatformType", "second", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 extends AbstractC3343n implements p {
    public static final KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 INSTANCE = new KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2();

    public KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2() {
        super(2);
    }

    @Override // tf.p
    @NotNull
    public final Integer invoke(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        Integer numCompare = DescriptorVisibilities.compare(descriptorVisibility, descriptorVisibility2);
        return Integer.valueOf(numCompare == null ? 0 : numCompare.intValue());
    }
}
