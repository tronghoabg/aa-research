package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.x0;
import com.moloco.sdk.internal.ortb.model.A;
import e0.C2465q;
import ef.C2537u;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1887a implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1887a f28768a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28769b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.a$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1898l.f28843a;
        }
    }

    static {
        C1887a c1887a = new C1887a();
        f28768a = c1887a;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.ProgressBar", c1887a, 4);
        c1244d0.j("padding", false);
        c1244d0.j("horizontal_alignment", false);
        c1244d0.j("vertical_alignment", false);
        c1244d0.j("foreground_color", false);
        f28769b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1888b.f28772e;
        return new KSerializer[]{x0.f15655a, kSerializerArr[1], kSerializerArr[2], B.f28689a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28769b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = C1888b.f28772e;
        int i5 = 0;
        C2537u c2537u = null;
        X x5 = null;
        EnumC1897k enumC1897k = null;
        C2465q c2465q = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                c2537u = (C2537u) aVarB.D(c1244d0, 0, x0.f15655a, c2537u);
                i5 |= 1;
            } else if (iM == 1) {
                x5 = (X) aVarB.D(c1244d0, 1, kSerializerArr[1], x5);
                i5 |= 2;
            } else if (iM == 2) {
                enumC1897k = (EnumC1897k) aVarB.D(c1244d0, 2, kSerializerArr[2], enumC1897k);
                i5 |= 4;
            } else {
                if (iM != 3) {
                    throw new Sf.i(iM);
                }
                c2465q = (C2465q) aVarB.D(c1244d0, 3, B.f28689a, c2465q);
                i5 |= 8;
            }
        }
        aVarB.c(c1244d0);
        return new C1888b(i5, c2537u, x5, enumC1897k, c2465q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28769b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1888b value = (C1888b) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28769b;
        Vf.b bVarB = encoder.b(c1244d0);
        A.b bVar = C1888b.Companion;
        bVarB.f(c1244d0, 0, x0.f15655a, new C2537u(value.f28773a));
        KSerializer[] kSerializerArr = C1888b.f28772e;
        bVarB.f(c1244d0, 1, kSerializerArr[1], value.f28774b);
        bVarB.f(c1244d0, 2, kSerializerArr[2], value.f28775c);
        bVarB.f(c1244d0, 3, B.f28689a, new C2465q(value.f28776d));
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
