package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.q0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1898l implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1898l f28843a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28844b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.l$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return E.f28702a;
        }
    }

    static {
        C1898l c1898l = new C1898l();
        f28843a = c1898l;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.AndroidInline", c1898l, 2);
        c1244d0.j("enabled", false);
        c1244d0.j("url", false);
        f28844b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1247f.f15596a, q0.f15625a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28844b;
        Vf.a aVarB = decoder.b(c1244d0);
        String strL = null;
        boolean z2 = true;
        int i5 = 0;
        boolean zY = false;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                zY = aVarB.y(c1244d0, 0);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                strL = aVarB.l(c1244d0, 1);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new C1899m(i5, strL, zY);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28844b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1899m value = (C1899m) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28844b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.x(c1244d0, 0, value.f28845a);
        bVarB.y(c1244d0, 1, value.f28846b);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
