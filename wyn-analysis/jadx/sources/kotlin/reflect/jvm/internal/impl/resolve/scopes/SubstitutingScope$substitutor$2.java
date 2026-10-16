package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class SubstitutingScope$substitutor$2 extends AbstractC3343n implements a {
    final /* synthetic */ TypeSubstitutor $givenSubstitutor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutingScope$substitutor$2(TypeSubstitutor typeSubstitutor) {
        super(0);
        this.$givenSubstitutor = typeSubstitutor;
    }

    @Override // tf.a
    @NotNull
    public final TypeSubstitutor invoke() {
        return this.$givenSubstitutor.getSubstitution().buildSubstitutor();
    }
}
