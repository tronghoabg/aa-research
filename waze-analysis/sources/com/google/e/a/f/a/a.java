package com.google.e.a.f.a;

import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.f;
import com.google.e.a.e.i;
import com.google.e.a.e.v;
import com.google.e.a.e.z;
import com.google.e.a.f.g;
import com.google.e.a.f.p;
import com.google.e.a.r;
import com.google.e.a.s;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8474a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f8475b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8476c;

    /* renamed from: d, reason: collision with root package name */
    private static final f f8477d;

    static {
        int i2 = 11;
        f8474a = z.a(new aq(i2), com.google.e.a.f.d.class);
        int i3 = 10;
        f8476c = z.d(new ar(i3), "type.googleapis.com/google.crypto.tink.AesCmacKey");
        f8475b = f.a(new as(i2), com.google.e.a.f.a.class);
        f8477d = f.d(new at(i3), "type.googleapis.com/google.crypto.tink.AesCmacKey");
    }

    public static void a() {
        v vVarA = v.a();
        vVarA.c(f8474a);
        vVarA.g(f8476c);
        vVarA.b(f8475b);
        vVarA.f(f8477d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(com.google.e.a.f.d dVar) throws GeneralSecurityException {
        s sVarG = g(dVar.i());
        com.google.e.a.h.c cVarNewBuilder = com.google.e.a.h.d.newBuilder();
        cVarNewBuilder.b(i(dVar));
        cVarNewBuilder.a(dVar.g());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesCmacKey", sVarG, cVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ com.google.e.a.f.d c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            com.google.e.a.h.d from = com.google.e.a.h.d.parseFrom(fVar.f(), de.a());
            g gVarJ = com.google.e.a.f.d.j();
            gVarJ.f(from.getKeySize());
            gVarJ.g(from.getParams().getTagSize());
            gVarJ.h(h(fVar.e()));
            return gVarJ.e();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
        }
    }

    static /* synthetic */ com.google.e.a.k.a d(com.google.d.m.a.a.b bVar) throws GeneralSecurityException {
        if (bVar instanceof p) {
            return ((p) bVar).g();
        }
        if (bVar instanceof i) {
            return ((i) bVar).f();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + bVar.getClass().getName() + " with parameters " + String.valueOf(bVar.e()));
    }

    public static /* synthetic */ com.google.e.a.f.a e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            com.google.e.a.h.b from = com.google.e.a.h.b.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            g gVarJ = com.google.e.a.f.d.j();
            gVarJ.f(from.getKeyValue().c());
            gVarJ.g(from.getParams().getTagSize());
            gVarJ.h(h(aiVar.e()));
            com.google.e.a.f.d dVarE = gVarJ.e();
            g gVarI = com.google.e.a.f.a.i();
            gVarI.k(dVarE);
            gVarI.l(com.google.android.libraries.phenotype.client.stable.p.g(from.getKeyValue().x()));
            gVarI.j(aiVar.g());
            return gVarI.i();
        } catch (eu | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ ai f(com.google.e.a.f.a aVar) {
        com.google.e.a.h.a aVarNewBuilder = com.google.e.a.h.b.newBuilder();
        aVarNewBuilder.b(i(aVar.f()));
        aVarNewBuilder.a(com.google.v.v.q(aVar.h().e()));
        return ai.i("type.googleapis.com/google.crypto.tink.AesCmacKey", aVarNewBuilder.build().toByteString(), r.f8777b, g(aVar.f().i()), aVar.b());
    }

    private static s g(com.google.e.a.f.c cVar) throws GeneralSecurityException {
        if (cVar.equals(com.google.e.a.f.c.f8488a)) {
            return s.f8783b;
        }
        if (cVar.equals(com.google.e.a.f.c.f8489b)) {
            return s.f8786e;
        }
        if (cVar.equals(com.google.e.a.f.c.f8491d)) {
            return s.f8785d;
        }
        if (cVar.equals(com.google.e.a.f.c.f8490c)) {
            return s.f8784c;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(cVar))));
    }

    private static com.google.e.a.f.c h(s sVar) throws GeneralSecurityException {
        if (sVar == s.f8783b) {
            return com.google.e.a.f.c.f8488a;
        }
        if (sVar == s.f8786e) {
            return com.google.e.a.f.c.f8489b;
        }
        if (sVar == s.f8784c) {
            return com.google.e.a.f.c.f8490c;
        }
        if (sVar == s.f8785d) {
            return com.google.e.a.f.c.f8491d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }

    private static com.google.e.a.h.f i(com.google.e.a.f.d dVar) {
        com.google.e.a.h.e eVarNewBuilder = com.google.e.a.h.f.newBuilder();
        eVarNewBuilder.a(dVar.f());
        return eVarNewBuilder.build();
    }
}
