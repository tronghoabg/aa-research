package kotlin.reflect.jvm.internal.impl.descriptors;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class InvalidModuleExceptionKt {

    @NotNull
    private static final ModuleCapability<InvalidModuleNotifier> INVALID_MODULE_NOTIFIER_CAPABILITY = new ModuleCapability<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(@NotNull ModuleDescriptor moduleDescriptor) {
        C2515C c2515c;
        AbstractC3340k.e(moduleDescriptor, "<this>");
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
    }
}
