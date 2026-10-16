package com.vungle.ads.internal.network;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1266y;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class e implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final e f33406a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1266y f33407b;

    static {
        C1266y c1266y = new C1266y("com.vungle.ads.internal.network.HttpMethod", 2);
        c1266y.j("GET", false);
        c1266y.j("POST", false);
        f33407b = c1266y;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        return g.values()[decoder.e(f33407b)];
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33407b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g value = (g) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        encoder.l(f33407b, value.ordinal());
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
