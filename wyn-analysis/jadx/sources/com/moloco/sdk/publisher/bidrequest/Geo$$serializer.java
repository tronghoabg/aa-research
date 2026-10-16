package com.moloco.sdk.publisher.bidrequest;

import Sf.i;
import Vf.a;
import Vf.b;
import Wf.AbstractC1240b0;
import Wf.B;
import Wf.C;
import Wf.C1244d0;
import Wf.q0;
import ef.InterfaceC2519c;
import ff.AbstractC2641B;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/moloco/sdk/publisher/bidrequest/Geo.$serializer", "LWf/C;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Lef/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/moloco/sdk/publisher/bidrequest/Geo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/moloco/sdk/publisher/bidrequest/Geo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InterfaceC2519c
/* loaded from: classes4.dex */
public /* synthetic */ class Geo$$serializer implements C {
    public static final int $stable;

    @NotNull
    public static final Geo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Geo$$serializer geo$$serializer = new Geo$$serializer();
        INSTANCE = geo$$serializer;
        $stable = 8;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.publisher.bidrequest.Geo", geo$$serializer, 6);
        c1244d0.j("city", false);
        c1244d0.j("country", false);
        c1244d0.j("region", false);
        c1244d0.j("zipCode", false);
        c1244d0.j("latitude", false);
        c1244d0.j("longitude", false);
        descriptor = c1244d0;
    }

    private Geo$$serializer() {
    }

    @Override // Wf.C
    @NotNull
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU2 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU3 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU4 = AbstractC2641B.u(q0Var);
        B b5 = B.f15526a;
        return new KSerializer[]{kSerializerU, kSerializerU2, kSerializerU3, kSerializerU4, AbstractC2641B.u(b5), AbstractC2641B.u(b5)};
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final Geo deserialize(@NotNull Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a aVarB = decoder.b(serialDescriptor);
        int i5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Float f10 = null;
        Float f11 = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(serialDescriptor);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    str = (String) aVarB.B(serialDescriptor, 0, q0.f15625a, str);
                    i5 |= 1;
                    break;
                case 1:
                    str2 = (String) aVarB.B(serialDescriptor, 1, q0.f15625a, str2);
                    i5 |= 2;
                    break;
                case 2:
                    str3 = (String) aVarB.B(serialDescriptor, 2, q0.f15625a, str3);
                    i5 |= 4;
                    break;
                case 3:
                    str4 = (String) aVarB.B(serialDescriptor, 3, q0.f15625a, str4);
                    i5 |= 8;
                    break;
                case 4:
                    f10 = (Float) aVarB.B(serialDescriptor, 4, B.f15526a, f10);
                    i5 |= 16;
                    break;
                case 5:
                    f11 = (Float) aVarB.B(serialDescriptor, 5, B.f15526a, f11);
                    i5 |= 32;
                    break;
                default:
                    throw new i(iM);
            }
        }
        aVarB.c(serialDescriptor);
        return new Geo(i5, str, str2, str3, str4, f10, f11, null);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Geo value) {
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        b bVarB = encoder.b(serialDescriptor);
        Geo.write$Self$moloco_sdk_release(value, bVarB, serialDescriptor);
        bVarB.c(serialDescriptor);
    }

    @Override // Wf.C
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
