package com.vungle.ads.fpd;

import Sf.i;
import Vf.a;
import Vf.b;
import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.E;
import Wf.q0;
import ef.InterfaceC2519c;
import ff.AbstractC2641B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/FirstPartyData.$serializer", "LWf/C;", "Lcom/vungle/ads/fpd/FirstPartyData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/fpd/FirstPartyData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/fpd/FirstPartyData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@InterfaceC2519c
/* loaded from: classes5.dex */
public final class FirstPartyData$$serializer implements C {

    @NotNull
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        c1244d0.j("model_version", true);
        c1244d0.j("session_context", true);
        c1244d0.j("demographic", true);
        c1244d0.j("location", true);
        c1244d0.j("revenue", true);
        c1244d0.j("custom_data", true);
        descriptor = c1244d0;
    }

    @Override // Wf.C
    @NotNull
    public KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        return new KSerializer[]{q0Var, AbstractC2641B.u(SessionContext$$serializer.INSTANCE), AbstractC2641B.u(Demographic$$serializer.INSTANCE), AbstractC2641B.u(Location$$serializer.INSTANCE), AbstractC2641B.u(Revenue$$serializer.INSTANCE), AbstractC2641B.u(new E(q0Var, q0Var, 1))};
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public FirstPartyData deserialize(@NotNull Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        a aVarB = decoder.b(descriptor2);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        Object objB3 = null;
        String strL = null;
        Object objB4 = null;
        Object objB5 = null;
        while (z2) {
            int iM = aVarB.m(descriptor2);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    strL = aVarB.l(descriptor2, 0);
                    i5 |= 1;
                    break;
                case 1:
                    objB = aVarB.B(descriptor2, 1, SessionContext$$serializer.INSTANCE, objB);
                    i5 |= 2;
                    break;
                case 2:
                    objB2 = aVarB.B(descriptor2, 2, Demographic$$serializer.INSTANCE, objB2);
                    i5 |= 4;
                    break;
                case 3:
                    objB3 = aVarB.B(descriptor2, 3, Location$$serializer.INSTANCE, objB3);
                    i5 |= 8;
                    break;
                case 4:
                    objB4 = aVarB.B(descriptor2, 4, Revenue$$serializer.INSTANCE, objB4);
                    i5 |= 16;
                    break;
                case 5:
                    q0 q0Var = q0.f15625a;
                    objB5 = aVarB.B(descriptor2, 5, new E(q0Var, q0Var, 1), objB5);
                    i5 |= 32;
                    break;
                default:
                    throw new i(iM);
            }
        }
        aVarB.c(descriptor2);
        return new FirstPartyData(i5, strL, (SessionContext) objB, (Demographic) objB2, (Location) objB3, (Revenue) objB4, (Map) objB5, null);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull FirstPartyData value) {
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        b bVarB = encoder.b(descriptor2);
        FirstPartyData.write$Self(value, bVarB, descriptor2);
        bVarB.c(descriptor2);
    }

    @Override // Wf.C
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
