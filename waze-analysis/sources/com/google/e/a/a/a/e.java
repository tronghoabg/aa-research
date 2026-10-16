package com.google.e.a.a.a;

import com.google.e.a.a.am;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.z;
import com.google.e.a.h.aj;
import com.google.e.a.h.ak;
import com.google.e.a.h.al;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8109a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8110b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8111c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8112d;

    static {
        int i2 = 4;
        f8109a = z.a(new aq(i2), com.google.e.a.a.t.class);
        f8111c = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.AesGcmKey");
        f8110b = com.google.e.a.e.f.a(new as(i2), com.google.e.a.a.p.class);
        f8112d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.AesGcmKey");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8109a);
        vVarA.g(f8111c);
        vVarA.b(f8110b);
        vVarA.f(f8112d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(com.google.e.a.a.t tVar) throws GeneralSecurityException {
        com.google.e.a.s sVarF = f(tVar.g());
        ak akVarNewBuilder = al.newBuilder();
        akVarNewBuilder.a(tVar.f());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesGcmKey", sVarF, akVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ com.google.e.a.a.t c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            al from = al.parseFrom(fVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            am amVarH = com.google.e.a.a.t.h();
            amVarH.g(from.getKeySize());
            amVarH.f();
            amVarH.h();
            amVarH.i(g(fVar.e()));
            return amVarH.e();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
        }
    }

    public static /* synthetic */ ai d(com.google.e.a.a.p pVar) {
        com.google.e.a.h.ai aiVarNewBuilder = aj.newBuilder();
        aiVarNewBuilder.a(com.google.v.v.q(pVar.h().e()));
        return ai.i("type.googleapis.com/google.crypto.tink.AesGcmKey", aiVarNewBuilder.build().toByteString(), com.google.e.a.r.f8777b, f(pVar.g().g()), pVar.b());
    }

    public static /* synthetic */ com.google.e.a.a.p e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            aj from = aj.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            am amVarH = com.google.e.a.a.t.h();
            amVarH.g(from.getKeyValue().c());
            amVarH.f();
            amVarH.h();
            amVarH.i(g(aiVar.e()));
            com.google.e.a.a.t tVarE = amVarH.e();
            com.google.e.a.a.u uVarI = com.google.e.a.a.p.i();
            uVarI.g(tVarE);
            uVarI.k(com.google.android.libraries.phenotype.client.stable.p.g(from.getKeyValue().x()));
            uVarI.f(aiVar.g());
            return uVarI.e();
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static com.google.e.a.s f(com.google.e.a.a.s sVar) throws GeneralSecurityException {
        if (sVar.equals(com.google.e.a.a.s.f8326a)) {
            return com.google.e.a.s.f8783b;
        }
        if (sVar.equals(com.google.e.a.a.s.f8327b)) {
            return com.google.e.a.s.f8786e;
        }
        if (sVar.equals(com.google.e.a.a.s.f8328c)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(sVar))));
    }

    private static com.google.e.a.a.s g(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return com.google.e.a.a.s.f8326a;
        }
        if (sVar == com.google.e.a.s.f8786e || sVar == com.google.e.a.s.f8784c) {
            return com.google.e.a.a.s.f8327b;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return com.google.e.a.a.s.f8328c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
