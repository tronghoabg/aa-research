package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends AbstractC3343n implements l {
    final /* synthetic */ AbstractDeserializedPackageFragmentProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDeserializedPackageFragmentProvider$fragments$1(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        super(1);
        this.this$0 = abstractDeserializedPackageFragmentProvider;
    }

    @Override // tf.l
    @Nullable
    public final PackageFragmentDescriptor invoke(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        DeserializedPackageFragment deserializedPackageFragmentFindPackage = this.this$0.findPackage(fqName);
        if (deserializedPackageFragmentFindPackage == null) {
            return null;
        }
        deserializedPackageFragmentFindPackage.initialize(this.this$0.getComponents());
        return deserializedPackageFragmentFindPackage;
    }
}
