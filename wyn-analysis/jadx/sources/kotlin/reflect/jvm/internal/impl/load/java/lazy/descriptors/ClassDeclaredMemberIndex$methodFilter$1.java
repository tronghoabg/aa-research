package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class ClassDeclaredMemberIndex$methodFilter$1 extends AbstractC3343n implements l {
    final /* synthetic */ ClassDeclaredMemberIndex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDeclaredMemberIndex$methodFilter$1(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        super(1);
        this.this$0 = classDeclaredMemberIndex;
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@NotNull JavaMethod m10) {
        AbstractC3340k.e(m10, "m");
        return Boolean.valueOf(((Boolean) this.this$0.memberFilter.invoke(m10)).booleanValue() && !JavaLoadingKt.isObjectMethodInInterface(m10));
    }
}
