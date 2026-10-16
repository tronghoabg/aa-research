package com.vungle.ads.internal.signals;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1241c;
import Wf.C1244d0;
import Wf.J;
import Wf.O;
import Wf.q0;
import com.applovin.shadow.okio.Segment;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.p3;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class a implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33638a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33639b;

    static {
        a aVar = new a();
        f33638a = aVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.signals.SessionData", aVar, 12);
        c1244d0.j("103", false);
        c1244d0.j(StatisticData.ERROR_CODE_IO_ERROR, true);
        c1244d0.j(StatisticData.ERROR_CODE_NOT_FOUND, true);
        c1244d0.j("106", true);
        c1244d0.j("102", true);
        c1244d0.j("104", true);
        c1244d0.j("105", true);
        c1244d0.j("112", true);
        c1244d0.j("113", true);
        c1244d0.j("114", true);
        c1244d0.j("115", true);
        c1244d0.j("116", true);
        f33639b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        C1241c c1241c = new C1241c(k.f33667a, 0);
        C1241c c1241c2 = new C1241c(p3.f33292a, 0);
        J j8 = J.f15549a;
        O o7 = O.f15556a;
        return new KSerializer[]{j8, q0.f15625a, o7, c1241c, o7, j8, c1241c2, j8, j8, j8, j8, j8};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33639b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objD = null;
        String strL = null;
        long jF = 0;
        long jF2 = 0;
        boolean z2 = true;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        Object objD2 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    i10 = aVarB.i(c1244d0, 0);
                    i5 |= 1;
                    break;
                case 1:
                    strL = aVarB.l(c1244d0, 1);
                    i5 |= 2;
                    break;
                case 2:
                    jF = aVarB.f(c1244d0, 2);
                    i5 |= 4;
                    break;
                case 3:
                    objD2 = aVarB.D(c1244d0, 3, new C1241c(k.f33667a, 0), objD2);
                    i5 |= 8;
                    break;
                case 4:
                    jF2 = aVarB.f(c1244d0, 4);
                    i5 |= 16;
                    break;
                case 5:
                    i11 = aVarB.i(c1244d0, 5);
                    i5 |= 32;
                    break;
                case 6:
                    objD = aVarB.D(c1244d0, 6, new C1241c(p3.f33292a, 0), objD);
                    i5 |= 64;
                    break;
                case 7:
                    i12 = aVarB.i(c1244d0, 7);
                    i5 |= 128;
                    break;
                case 8:
                    i13 = aVarB.i(c1244d0, 8);
                    i5 |= 256;
                    break;
                case 9:
                    i14 = aVarB.i(c1244d0, 9);
                    i5 |= 512;
                    break;
                case 10:
                    i15 = aVarB.i(c1244d0, 10);
                    i5 |= Segment.SHARE_MINIMUM;
                    break;
                case 11:
                    i16 = aVarB.i(c1244d0, 11);
                    i5 |= 2048;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new c(i5, i10, strL, jF, (List) objD2, jF2, i11, (List) objD, i12, i13, i14, i15, i16);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33639b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c value = (c) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33639b;
        Vf.b bVarB = encoder.b(c1244d0);
        c.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
