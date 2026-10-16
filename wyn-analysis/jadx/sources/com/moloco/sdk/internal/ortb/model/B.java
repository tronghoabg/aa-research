package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import e0.C2465q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class B implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final B f28689a = new B();

    /* renamed from: b, reason: collision with root package name */
    public static final Wf.h0 f28690b = Fe.g.d("Color");

    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1889c.f28778a;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new C2465q(e0.z.b(Color.parseColor(decoder.w())));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28690b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j8 = ((C2465q) obj).f34382a;
        throw new Ef.G("Color encoding is not supported");
    }
}
