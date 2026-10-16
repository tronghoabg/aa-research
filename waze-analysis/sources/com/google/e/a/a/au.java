package com.google.e.a.a;

import com.google.e.a.h.bl;
import com.google.e.a.h.bm;
import com.google.e.a.h.ce;
import com.google.e.a.h.cf;
import com.google.e.a.h.cg;
import com.google.e.a.h.ch;
import com.google.e.a.h.ci;
import com.google.v.de;
import com.google.v.eu;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.e.a.e.z f8221a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8222b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.z f8223c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8224d;

    static {
        int i2 = 0;
        f8221a = com.google.e.a.e.z.a(new aq(i2), ap.class);
        f8223c = com.google.e.a.e.z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f8222b = com.google.e.a.e.f.a(new as(i2), al.class);
        f8224d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8221a);
        vVarA.g(f8223c);
        vVarA.b(f8222b);
        vVarA.f(f8224d);
    }

    public static /* synthetic */ ap c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            return g(ch.parseFrom(fVar.f(), de.a()), fVar.e());
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static /* synthetic */ com.waze.car_lib.r.ai d(al alVar) {
        ce ceVarNewBuilder = cf.newBuilder();
        ceVarNewBuilder.a(h(alVar.h()));
        return com.waze.car_lib.r.ai.i("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ceVarNewBuilder.build().toByteString(), com.google.e.a.r.f8780e, f(alVar.h().f()), alVar.b());
    }

    public static /* synthetic */ al e(com.waze.car_lib.r.ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            cf from = cf.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(from));
            }
            ch params = from.getParams();
            com.google.e.a.s sVarE = aiVar.e();
            com.google.e.a.s sVar = com.google.e.a.s.f8783b;
            if (sVarE != sVar && sVarE != (sVar = com.google.e.a.s.f8785d)) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVarE))));
            }
            return al.g(g(params, sVar), aiVar.g());
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
        }
    }

    private static com.google.e.a.s f(ao aoVar) throws GeneralSecurityException {
        if (ao.f8210a.equals(aoVar)) {
            return com.google.e.a.s.f8783b;
        }
        if (ao.f8211b.equals(aoVar)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(aoVar))));
    }

    private static ap g(ch chVar, com.google.e.a.s sVar) throws GeneralSecurityException {
        an anVar;
        ao aoVar;
        bl blVarNewBuilder = bm.newBuilder();
        blVarNewBuilder.b(chVar.getDekTemplate().getTypeUrl());
        blVarNewBuilder.c(chVar.getDekTemplate().getValue());
        blVarNewBuilder.a(ci.RAW);
        com.google.d.m.a.a.b bVarE = com.google.e.a.e.e(blVarNewBuilder.build().toByteArray());
        if (bVarE instanceof t) {
            anVar = an.f8203a;
        } else if (bVarE instanceof ad) {
            anVar = an.f8205c;
        } else if (bVarE instanceof be) {
            anVar = an.f8204b;
        } else if (bVarE instanceof j) {
            anVar = an.f8206d;
        } else if (bVarE instanceof o) {
            anVar = an.f8207e;
        } else {
            if (!(bVarE instanceof z)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(bVarE.toString()));
            }
            anVar = an.f8208f;
        }
        am amVar = new am();
        if (sVar.equals(com.google.e.a.s.f8783b)) {
            aoVar = ao.f8210a;
        } else {
            if (!sVar.equals(com.google.e.a.s.f8785d)) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
            }
            aoVar = ao.f8211b;
        }
        amVar.d(aoVar);
        amVar.c(chVar.getKekUri());
        amVar.t(bVarE);
        amVar.b(anVar);
        return amVar.a();
    }

    private static ch h(ap apVar) throws GeneralSecurityException {
        try {
            bm from = bm.parseFrom(com.google.e.a.e.f(apVar.h()), de.a());
            cg cgVarNewBuilder = ch.newBuilder();
            cgVarNewBuilder.b(apVar.g());
            cgVarNewBuilder.a(from);
            return cgVarNewBuilder.build();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }
}
