package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class T implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final T f28746a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28747b;

    static {
        T t10 = new T();
        f28746a = t10;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.ExperimentalConfigs", t10, 1);
        c1244d0.j("server_rendering_ignore_net_err_failed", true);
        f28747b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(C1247f.f15596a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28747b;
        Vf.a aVarB = decoder.b(c1244d0);
        Boolean bool = null;
        boolean z2 = true;
        int i5 = 0;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else {
                if (iM != 0) {
                    throw new Sf.i(iM);
                }
                bool = (Boolean) aVarB.B(c1244d0, 0, C1247f.f15596a, bool);
                i5 = 1;
            }
        }
        aVarB.c(c1244d0);
        return new U(i5, bool);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28747b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        U value = (U) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28747b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        Boolean bool = value.f28748a;
        if (zA || bool != null) {
            bVarB.i(c1244d0, 0, C1247f.f15596a, bool);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
