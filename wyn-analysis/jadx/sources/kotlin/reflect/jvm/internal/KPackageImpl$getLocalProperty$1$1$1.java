package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3337h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import org.jetbrains.annotations.NotNull;
import tf.p;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class KPackageImpl$getLocalProperty$1$1$1 extends AbstractC3337h implements p {
    public static final KPackageImpl$getLocalProperty$1$1$1 INSTANCE = new KPackageImpl$getLocalProperty$1$1$1();

    public KPackageImpl$getLocalProperty$1$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final KDeclarationContainer getOwner() {
        return H.f39741a.getOrCreateKotlinClass(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // tf.p
    @NotNull
    public final PropertyDescriptor invoke(@NotNull MemberDeserializer p02, @NotNull ProtoBuf.Property p12) {
        AbstractC3340k.e(p02, "p0");
        AbstractC3340k.e(p12, "p1");
        return p02.loadProperty(p12);
    }
}
