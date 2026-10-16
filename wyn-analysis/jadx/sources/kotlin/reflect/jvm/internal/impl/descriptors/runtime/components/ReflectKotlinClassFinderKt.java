package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import Bf.r;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes5.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String strAsString = classId.getRelativeClassName().asString();
        AbstractC3340k.d(strAsString, "asString(...)");
        String strI0 = r.i0(strAsString, '.', '$');
        if (classId.getPackageFqName().isRoot()) {
            return strI0;
        }
        return classId.getPackageFqName() + '.' + strI0;
    }
}
