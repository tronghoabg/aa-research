package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1241c;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.E;
import Wf.O;
import ff.AbstractC2641B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class c implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final c f33135a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33136b;

    static {
        c cVar = new c();
        f33135a = cVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload", cVar, 7);
        c1244d0.j("ads", true);
        c1244d0.j("config", true);
        c1244d0.j("expiryWindowStart", true);
        c1244d0.j("mraidFiles", true);
        c1244d0.j("incentivizedTextSettings", true);
        c1244d0.j("assetsFullyDownloaded", true);
        c1244d0.j("indexFilePath", true);
        f33136b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerU = AbstractC2641B.u(new C1241c(q.f33294a, 0));
        KSerializer kSerializerU2 = AbstractC2641B.u(u1.f33327a);
        KSerializer kSerializerU3 = AbstractC2641B.u(O.f15556a);
        KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(ConcurrentHashMap.class);
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{kSerializerU, kSerializerU2, kSerializerU3, new Sf.a(orCreateKotlinClass, new KSerializer[]{q0Var, q0Var}), new E(q0Var, q0Var, 1), C1247f.f15596a, AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i5;
        int i10 = 4;
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33136b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        int i11 = 0;
        boolean zY = false;
        boolean z2 = true;
        Object objD = null;
        Object objD2 = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i5 = i10;
                    objB4 = aVarB.B(c1244d0, 0, new C1241c(q.f33294a, 0), objB4);
                    i11 |= 1;
                    break;
                case 1:
                    i5 = i10;
                    objB3 = aVarB.B(c1244d0, 1, u1.f33327a, objB3);
                    i11 |= 2;
                    break;
                case 2:
                    i5 = i10;
                    objB2 = aVarB.B(c1244d0, 2, O.f15556a, objB2);
                    i11 |= 4;
                    break;
                case 3:
                    i5 = i10;
                    KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(ConcurrentHashMap.class);
                    Wf.q0 q0Var = Wf.q0.f15625a;
                    objD2 = aVarB.D(c1244d0, 3, new Sf.a(orCreateKotlinClass, new KSerializer[]{q0Var, q0Var}), objD2);
                    i11 |= 8;
                    break;
                case 4:
                    Wf.q0 q0Var2 = Wf.q0.f15625a;
                    objD = aVarB.D(c1244d0, i10, new E(q0Var2, q0Var2, 1), objD);
                    i11 |= 16;
                    continue;
                case 5:
                    zY = aVarB.y(c1244d0, 5);
                    i11 |= 32;
                    continue;
                case 6:
                    objB = aVarB.B(c1244d0, 6, Wf.q0.f15625a, objB);
                    i11 |= 64;
                    continue;
                default:
                    throw new Sf.i(iM);
            }
            i10 = i5;
        }
        aVarB.c(c1244d0);
        return new h0(i11, (List) objB4, (v2) objB3, (Long) objB2, (ConcurrentHashMap) objD2, (Map) objD, zY, (String) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33136b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h0 value = (h0) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33136b;
        Vf.b bVarB = encoder.b(c1244d0);
        h0.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
