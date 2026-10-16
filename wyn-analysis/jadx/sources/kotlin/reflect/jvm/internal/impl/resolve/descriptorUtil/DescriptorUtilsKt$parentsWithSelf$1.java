package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class DescriptorUtilsKt$parentsWithSelf$1 extends AbstractC3343n implements l {
    public static final DescriptorUtilsKt$parentsWithSelf$1 INSTANCE = new DescriptorUtilsKt$parentsWithSelf$1();

    public DescriptorUtilsKt$parentsWithSelf$1() {
        super(1);
    }

    @Override // tf.l
    @Nullable
    public final DeclarationDescriptor invoke(@NotNull DeclarationDescriptor it) {
        AbstractC3340k.e(it, "it");
        return it.getContainingDeclaration();
    }
}
