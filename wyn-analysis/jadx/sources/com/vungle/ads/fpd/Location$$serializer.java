package com.vungle.ads.fpd;

import Sf.i;
import Vf.a;
import Vf.b;
import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import ef.InterfaceC2519c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/Location.$serializer", "LWf/C;", "Lcom/vungle/ads/fpd/Location;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/fpd/Location;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/fpd/Location;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@InterfaceC2519c
/* loaded from: classes5.dex */
public final class Location$$serializer implements C {

    @NotNull
    public static final Location$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Location$$serializer location$$serializer = new Location$$serializer();
        INSTANCE = location$$serializer;
        descriptor = new C1244d0("com.vungle.ads.fpd.Location", location$$serializer, 0);
    }

    @Override // Wf.C
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public Location deserialize(@NotNull Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        a aVarB = decoder.b(descriptor2);
        int iM = aVarB.m(descriptor2);
        if (iM != -1) {
            throw new i(iM);
        }
        aVarB.c(descriptor2);
        return new Location(0, null);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull Location value) {
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        Location.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // Wf.C
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
