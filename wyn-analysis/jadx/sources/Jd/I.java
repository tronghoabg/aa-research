package Jd;

import Wf.h0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class I implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final I f6038a = new I();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f6039b = Fe.g.d("io.ktor.http.Url");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return xg.g.c(decoder.w());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f6039b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        H value = (H) obj;
        AbstractC3340k.e(value, "value");
        encoder.F(value.f6031f);
    }
}
