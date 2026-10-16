package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class JvmBuiltIns$customizer$2 extends AbstractC3343n implements a {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltIns this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ JvmBuiltIns this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JvmBuiltIns jvmBuiltIns) {
            super(0);
            this.this$0 = jvmBuiltIns;
        }

        @Override // tf.a
        @NotNull
        public final JvmBuiltIns.Settings invoke() {
            a aVar = this.this$0.settingsComputation;
            if (aVar == null) {
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
            JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) aVar.invoke();
            this.this$0.settingsComputation = null;
            return settings;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$customizer$2(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        super(0);
        this.this$0 = jvmBuiltIns;
        this.$storageManager = storageManager;
    }

    @Override // tf.a
    @NotNull
    public final JvmBuiltInsCustomizer invoke() {
        ModuleDescriptorImpl builtInsModule = this.this$0.getBuiltInsModule();
        AbstractC3340k.d(builtInsModule, "getBuiltInsModule(...)");
        return new JvmBuiltInsCustomizer(builtInsModule, this.$storageManager, new AnonymousClass1(this.this$0));
    }
}
