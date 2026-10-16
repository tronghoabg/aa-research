package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC3337h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public /* synthetic */ class ReflectJavaClass$fields$1 extends AbstractC3337h implements l {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final KDeclarationContainer getOwner() {
        return H.f39741a.getOrCreateKotlinClass(Member.class);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@NotNull Member p02) {
        AbstractC3340k.e(p02, "p0");
        return Boolean.valueOf(p02.isSynthetic());
    }
}
