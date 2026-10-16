package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.x0;
import com.moloco.sdk.internal.ortb.model.E;
import ef.C2537u;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1895i implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1895i f28832a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28833b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.i$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1911z.f28881a;
        }
    }

    static {
        C1895i c1895i = new C1895i();
        f28832a = c1895i;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.VastPrivacyIcon", c1895i, 3);
        c1244d0.j("padding", false);
        c1244d0.j("horizontal_alignment", false);
        c1244d0.j("vertical_alignment", false);
        f28833b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1896j.f28834d;
        return new KSerializer[]{x0.f15655a, kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28833b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = C1896j.f28834d;
        C2537u c2537u = null;
        boolean z2 = true;
        int i5 = 0;
        X x5 = null;
        EnumC1897k enumC1897k = null;
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
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                enumC1897k = (EnumC1897k) aVarB.D(c1244d0, 2, kSerializerArr[2], enumC1897k);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new C1896j(i5, c2537u, x5, enumC1897k);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28833b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1896j value = (C1896j) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28833b;
        Vf.b bVarB = encoder.b(c1244d0);
        E.b bVar = C1896j.Companion;
        bVarB.f(c1244d0, 0, x0.f15655a, new C2537u(value.f28835a));
        KSerializer[] kSerializerArr = C1896j.f28834d;
        bVarB.f(c1244d0, 1, kSerializerArr[1], value.f28836b);
        bVarB.f(c1244d0, 2, kSerializerArr[2], value.f28837c);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
