package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import N0.a;
import R8.v;
import ef.C2527k;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.l;

/* loaded from: classes5.dex */
public final class JvmBuiltInsCustomizer$deprecationForSomeOfTheListMethods$1 extends AbstractC3343n implements l {
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$deprecationForSomeOfTheListMethods$1(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    @Override // tf.l
    @NotNull
    public final Annotations invoke(@NotNull C2527k c2527k) {
        AbstractC3340k.e(c2527k, "<name for destructuring parameter 0>");
        String str = (String) c2527k.f34671a;
        String str2 = (String) c2527k.f34672b;
        return Annotations.Companion.create(AbstractC3935e.C(AnnotationUtilKt.createDeprecatedAnnotation(this.this$0.moduleDescriptor.getBuiltIns(), v.g("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), a.f(str2, "()"), "HIDDEN", false)));
    }
}
