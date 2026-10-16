package Xf;

import Wf.q0;
import ff.AbstractC2641B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class u implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final u f16294a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final t f16295b = t.f16291b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Fe.c.i(decoder);
        q0 q0Var = q0.f15625a;
        return new kotlinx.serialization.json.c((Map) AbstractC2641B.a(k.f16281a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f16295b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.c value = (kotlinx.serialization.json.c) obj;
        AbstractC3340k.e(value, "value");
        Fe.c.j(encoder);
        q0 q0Var = q0.f15625a;
        AbstractC2641B.a(k.f16281a).serialize(encoder, value);
    }
}
