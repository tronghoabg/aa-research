package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class JvmBuiltInsCustomizer$cloneableType$2 extends AbstractC3343n implements a {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$cloneableType$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
        this.$storageManager = storageManager;
    }

    @Override // tf.a
    @NotNull
    public final SimpleType invoke() {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.this$0.getSettings().getOwnerModuleDescriptor(), JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new NotFoundClasses(this.$storageManager, this.this$0.getSettings().getOwnerModuleDescriptor())).getDefaultType();
    }
}
