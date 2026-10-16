package Qd;

import Sf.i;
import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import Wf.O;
import ef.InterfaceC2525i;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9969a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f9969a = bVar;
        C1244d0 c1244d0 = new C1244d0("io.ktor.util.date.GMTDate", bVar, 9);
        c1244d0.j("seconds", false);
        c1244d0.j("minutes", false);
        c1244d0.j("hours", false);
        c1244d0.j("dayOfWeek", false);
        c1244d0.j("dayOfMonth", false);
        c1244d0.j("dayOfYear", false);
        c1244d0.j("month", false);
        c1244d0.j("year", false);
        c1244d0.j("timestamp", false);
        descriptor = c1244d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        InterfaceC2525i[] interfaceC2525iArr = d.f9970j;
        J j8 = J.f15549a;
        return new KSerializer[]{j8, j8, j8, interfaceC2525iArr[3].getValue(), j8, j8, interfaceC2525iArr[6].getValue(), j8, O.f15556a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        Vf.a aVarB = decoder.b(serialDescriptor);
        InterfaceC2525i[] interfaceC2525iArr = d.f9970j;
        e eVar = null;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        f fVar = null;
        long jF = 0;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(serialDescriptor);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    i10 = aVarB.i(serialDescriptor, 0);
                    i5 |= 1;
                    break;
                case 1:
                    i11 = aVarB.i(serialDescriptor, 1);
                    i5 |= 2;
                    break;
                case 2:
                    i12 = aVarB.i(serialDescriptor, 2);
                    i5 |= 4;
                    break;
                case 3:
                    fVar = (f) aVarB.D(serialDescriptor, 3, (KSerializer) interfaceC2525iArr[3].getValue(), fVar);
                    i5 |= 8;
                    break;
                case 4:
                    i13 = aVarB.i(serialDescriptor, 4);
                    i5 |= 16;
                    break;
                case 5:
                    i14 = aVarB.i(serialDescriptor, 5);
                    i5 |= 32;
                    break;
                case 6:
                    eVar = (e) aVarB.D(serialDescriptor, 6, (KSerializer) interfaceC2525iArr[6].getValue(), eVar);
                    i5 |= 64;
                    break;
                case 7:
                    i15 = aVarB.i(serialDescriptor, 7);
                    i5 |= 128;
                    break;
                case 8:
                    jF = aVarB.f(serialDescriptor, 8);
                    i5 |= 256;
                    break;
                default:
                    throw new i(iM);
            }
        }
        aVarB.c(serialDescriptor);
        return new d(i5, i10, i11, i12, fVar, i13, i14, eVar, i15, jF);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d value = (d) obj;
        AbstractC3340k.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Vf.b bVarB = encoder.b(serialDescriptor);
        bVarB.t(0, value.f9971a, serialDescriptor);
        bVarB.t(1, value.f9972b, serialDescriptor);
        bVarB.t(2, value.f9973c, serialDescriptor);
        InterfaceC2525i[] interfaceC2525iArr = d.f9970j;
        bVarB.f(serialDescriptor, 3, (KSerializer) interfaceC2525iArr[3].getValue(), value.f9974d);
        bVarB.t(4, value.f9975e, serialDescriptor);
        bVarB.t(5, value.f9976f, serialDescriptor);
        bVarB.f(serialDescriptor, 6, (KSerializer) interfaceC2525iArr[6].getValue(), value.f9977g);
        bVarB.t(7, value.f9978h, serialDescriptor);
        bVarB.E(serialDescriptor, 8, value.f9979i);
        bVarB.c(serialDescriptor);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
