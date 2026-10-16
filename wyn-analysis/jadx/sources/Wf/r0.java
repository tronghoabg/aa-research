package Wf;

import ef.C2533q;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class r0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f15628a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f15629b;

    /* renamed from: c, reason: collision with root package name */
    public final KSerializer f15630c;

    /* renamed from: d, reason: collision with root package name */
    public final Uf.g f15631d = Fe.g.r("kotlin.Triple", new SerialDescriptor[0], new Af.r(this, 12));

    public r0(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.f15628a = kSerializer;
        this.f15629b = kSerializer2;
        this.f15630c = kSerializer3;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Uf.g gVar = this.f15631d;
        Vf.a aVarB = decoder.b(gVar);
        KSerializer kSerializer = this.f15630c;
        KSerializer kSerializer2 = this.f15629b;
        KSerializer kSerializer3 = this.f15628a;
        Object obj = AbstractC1240b0.f15578c;
        Object objD = obj;
        Object objD2 = objD;
        Object objD3 = objD2;
        while (true) {
            int iM = aVarB.m(gVar);
            if (iM == -1) {
                aVarB.c(gVar);
                if (objD == obj) {
                    throw new Sf.f("Element 'first' is missing");
                }
                if (objD2 == obj) {
                    throw new Sf.f("Element 'second' is missing");
                }
                if (objD3 != obj) {
                    return new C2533q(objD, objD2, objD3);
                }
                throw new Sf.f("Element 'third' is missing");
            }
            if (iM == 0) {
                objD = aVarB.D(gVar, 0, kSerializer3, null);
            } else if (iM == 1) {
                objD2 = aVarB.D(gVar, 1, kSerializer2, null);
            } else {
                if (iM != 2) {
                    throw new Sf.f(AbstractC3256n.g(iM, "Unexpected index "));
                }
                objD3 = aVarB.D(gVar, 2, kSerializer, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f15631d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2533q value = (C2533q) obj;
        AbstractC3340k.e(value, "value");
        Uf.g gVar = this.f15631d;
        Vf.b bVarB = encoder.b(gVar);
        bVarB.f(gVar, 0, this.f15628a, value.f34681a);
        bVarB.f(gVar, 1, this.f15629b, value.f34682b);
        bVarB.f(gVar, 2, this.f15630c, value.f34683c);
        bVarB.c(gVar);
    }
}
