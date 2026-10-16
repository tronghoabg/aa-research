package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class ModuleDescriptorImpl$packages$1 extends AbstractC3343n implements l {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packages$1(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(1);
        this.this$0 = moduleDescriptorImpl;
    }

    @Override // tf.l
    @NotNull
    public final PackageViewDescriptor invoke(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        PackageViewDescriptorFactory packageViewDescriptorFactory = this.this$0.packageViewDescriptorFactory;
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        return packageViewDescriptorFactory.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.storageManager);
    }
}
