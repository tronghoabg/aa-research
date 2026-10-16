package com.google.e.a.a.a;

import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.a.ax;
import com.google.e.a.a.az;
import com.google.e.a.a.ba;
import com.google.e.a.e.z;
import com.google.e.a.h.cl;
import com.google.e.a.h.cm;
import com.google.e.a.h.cn;
import com.google.e.a.h.co;
import com.google.e.a.h.cp;
import com.google.e.a.h.cq;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8146a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8147b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8148c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8149d;

    static {
        int i2 = 7;
        f8146a = z.a(new aq(i2), ba.class);
        f8148c = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f8147b = com.google.e.a.e.f.a(new as(i2), ax.class);
        f8149d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.XAesGcmKey");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8146a);
        vVarA.g(f8148c);
        vVarA.b(f8147b);
        vVarA.f(f8149d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(ba baVar) throws GeneralSecurityException {
        com.google.e.a.s sVarF = f(baVar.g());
        cn cnVarNewBuilder = co.newBuilder();
        cp cpVarNewBuilder = cq.newBuilder();
        cpVarNewBuilder.a(baVar.f());
        cnVarNewBuilder.a(cpVarNewBuilder.build());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.XAesGcmKey", sVarF, cnVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ ba c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            co from = co.parseFrom(fVar.f(), de.a());
            if (from.getVersion() == 0) {
                return ba.h(g(fVar.e()), from.getParams().getSaltSize());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
        }
    }

    public static /* synthetic */ ai d(ax axVar) {
        cl clVarNewBuilder = cm.newBuilder();
        clVarNewBuilder.a(com.google.v.v.q(axVar.i().e()));
        cp cpVarNewBuilder = cq.newBuilder();
        cpVarNewBuilder.a(axVar.g().f());
        clVarNewBuilder.b(cpVarNewBuilder.build());
        return ai.i("type.googleapis.com/google.crypto.tink.XAesGcmKey", clVarNewBuilder.build().toByteString(), com.google.e.a.r.f8777b, f(axVar.g().g()), axVar.b());
    }

    public static /* synthetic */ ax e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            cm from = cm.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (from.getKeyValue().c() == 32) {
                return ax.h(ba.h(g(aiVar.e()), from.getParams().getSaltSize()), com.google.android.libraries.phenotype.client.stable.p.g(from.getKeyValue().x()), aiVar.g());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static com.google.e.a.s f(az azVar) throws GeneralSecurityException {
        if (Objects.equals(azVar, az.f8242a)) {
            return com.google.e.a.s.f8783b;
        }
        if (Objects.equals(azVar, az.f8243b)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(azVar.toString()));
    }

    private static az g(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return az.f8242a;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return az.f8243b;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
