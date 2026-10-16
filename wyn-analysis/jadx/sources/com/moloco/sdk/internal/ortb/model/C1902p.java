package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.q0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1902p implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1902p f28853a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28854b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.p$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return M.f28727a;
        }
    }

    static {
        C1902p c1902p = new C1902p();
        f28853a = c1902p;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.AutoStore", c1902p, 3);
        c1244d0.j("enabled", false);
        c1244d0.j("on_skip", true);
        c1244d0.j("event_link", true);
        f28854b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerU = AbstractC2641B.u(q0.f15625a);
        C1247f c1247f = C1247f.f15596a;
        return new KSerializer[]{c1247f, c1247f, kSerializerU};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28854b;
        Vf.a aVarB = decoder.b(c1244d0);
        String str = null;
        boolean z2 = true;
        int i5 = 0;
        boolean zY = false;
        boolean zY2 = false;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                zY = aVarB.y(c1244d0, 0);
                i5 |= 1;
            } else if (iM == 1) {
                zY2 = aVarB.y(c1244d0, 1);
                i5 |= 2;
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                str = (String) aVarB.B(c1244d0, 2, q0.f15625a, str);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new C1903q(str, i5, zY, zY2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28854b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1903q value = (C1903q) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28854b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.x(c1244d0, 0, value.f28855a);
        boolean zA = bVarB.A(c1244d0, 1);
        boolean z2 = value.f28856b;
        if (zA || !z2) {
            bVarB.x(c1244d0, 1, z2);
        }
        boolean zA2 = bVarB.A(c1244d0, 2);
        String str = value.f28857c;
        if (zA2 || str != null) {
            bVarB.i(c1244d0, 2, q0.f15625a, str);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
