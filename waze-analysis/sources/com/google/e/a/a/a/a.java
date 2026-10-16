package com.google.e.a.a.a;

import com.google.e.a.a.am;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.z;
import com.google.e.a.h.ba;
import com.google.e.a.h.bb;
import com.google.e.a.h.bc;
import com.google.e.a.h.bd;
import com.google.e.a.h.be;
import com.google.e.a.h.bf;
import com.google.e.a.h.bg;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8100a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8101b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8102c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8103d;

    static {
        int i2 = 2;
        f8100a = z.a(new aq(i2), com.google.e.a.a.j.class);
        f8102c = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f8101b = com.google.e.a.e.f.a(new as(i2), com.google.e.a.a.d.class);
        f8103d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8100a);
        vVarA.g(f8102c);
        vVarA.b(f8101b);
        vVarA.f(f8103d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(com.google.e.a.a.j jVar) throws GeneralSecurityException {
        com.google.e.a.s sVarF = f(jVar.l());
        com.google.e.a.h.i iVarNewBuilder = com.google.e.a.h.j.newBuilder();
        com.google.e.a.h.s sVarNewBuilder = com.google.e.a.h.t.newBuilder();
        com.google.e.a.h.u uVarNewBuilder = com.google.e.a.h.v.newBuilder();
        uVarNewBuilder.a(jVar.h());
        sVarNewBuilder.b(uVarNewBuilder.build());
        sVarNewBuilder.a(jVar.f());
        iVarNewBuilder.a(sVarNewBuilder.build());
        bd bdVarNewBuilder = be.newBuilder();
        bdVarNewBuilder.b(i(jVar));
        bdVarNewBuilder.a(jVar.g());
        iVarNewBuilder.b(bdVarNewBuilder.build());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", sVarF, iVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ com.google.e.a.a.j c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            com.google.e.a.h.j from = com.google.e.a.h.j.parseFrom(fVar.f(), de.a());
            if (from.getHmacKeyFormat().getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.e.a.a.g gVarJ = com.google.e.a.a.j.j();
            gVarJ.b(from.getAesCtrKeyFormat().getKeySize());
            gVarJ.d(from.getHmacKeyFormat().getKeySize());
            gVarJ.e(from.getAesCtrKeyFormat().getParams().getIvSize());
            gVarJ.f(from.getHmacKeyFormat().getParams().getTagSize());
            gVarJ.c(g(from.getHmacKeyFormat().getParams().getHash()));
            gVarJ.g(h(fVar.e()));
            return gVarJ.a();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
        }
    }

    public static /* synthetic */ com.google.e.a.a.d d(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            com.google.e.a.h.h from = com.google.e.a.h.h.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (from.getAesCtrKey().getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (from.getHmacKey().getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            com.google.e.a.a.g gVarJ = com.google.e.a.a.j.j();
            gVarJ.b(from.getAesCtrKey().getKeyValue().c());
            gVarJ.d(from.getHmacKey().getKeyValue().c());
            gVarJ.e(from.getAesCtrKey().getParams().getIvSize());
            gVarJ.f(from.getHmacKey().getParams().getTagSize());
            gVarJ.c(g(from.getHmacKey().getParams().getHash()));
            gVarJ.g(h(aiVar.e()));
            com.google.e.a.a.j jVarA = gVarJ.a();
            am amVarJ = com.google.e.a.a.d.j();
            amVarJ.q(jVarA);
            amVarJ.r(com.google.android.libraries.phenotype.client.stable.p.g(from.getAesCtrKey().getKeyValue().x()));
            amVarJ.s(com.google.android.libraries.phenotype.client.stable.p.g(from.getHmacKey().getKeyValue().x()));
            amVarJ.p(aiVar.g());
            return amVarJ.o();
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ ai e(com.google.e.a.a.d dVar) {
        com.google.e.a.h.g gVarNewBuilder = com.google.e.a.h.h.newBuilder();
        com.google.e.a.h.q qVarNewBuilder = com.google.e.a.h.r.newBuilder();
        com.google.e.a.h.u uVarNewBuilder = com.google.e.a.h.v.newBuilder();
        uVarNewBuilder.a(dVar.g().h());
        qVarNewBuilder.b(uVarNewBuilder.build());
        qVarNewBuilder.a(com.google.v.v.q(dVar.h().e()));
        gVarNewBuilder.a(qVarNewBuilder.build());
        bb bbVarNewBuilder = bc.newBuilder();
        bbVarNewBuilder.b(i(dVar.g()));
        bbVarNewBuilder.a(com.google.v.v.q(dVar.i().e()));
        gVarNewBuilder.b(bbVarNewBuilder.build());
        return ai.i("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", gVarNewBuilder.build().toByteString(), com.google.e.a.r.f8777b, f(dVar.g().l()), dVar.b());
    }

    private static com.google.e.a.s f(com.google.e.a.a.i iVar) throws GeneralSecurityException {
        if (iVar.equals(com.google.e.a.a.i.f8289a)) {
            return com.google.e.a.s.f8783b;
        }
        if (iVar.equals(com.google.e.a.a.i.f8290b)) {
            return com.google.e.a.s.f8786e;
        }
        if (iVar.equals(com.google.e.a.a.i.f8291c)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(iVar))));
    }

    private static com.google.e.a.a.h g(ba baVar) throws GeneralSecurityException {
        int iOrdinal = baVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.e.a.a.h.f8283a;
        }
        if (iOrdinal == 2) {
            return com.google.e.a.a.h.f8286d;
        }
        if (iOrdinal == 3) {
            return com.google.e.a.a.h.f8285c;
        }
        if (iOrdinal == 4) {
            return com.google.e.a.a.h.f8287e;
        }
        if (iOrdinal == 5) {
            return com.google.e.a.a.h.f8284b;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + baVar.getNumber());
    }

    private static com.google.e.a.a.i h(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return com.google.e.a.a.i.f8289a;
        }
        if (sVar == com.google.e.a.s.f8786e || sVar == com.google.e.a.s.f8784c) {
            return com.google.e.a.a.i.f8290b;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return com.google.e.a.a.i.f8291c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }

    private static bg i(com.google.e.a.a.j jVar) throws GeneralSecurityException {
        ba baVar;
        bf bfVarNewBuilder = bg.newBuilder();
        bfVarNewBuilder.b(jVar.i());
        com.google.e.a.a.h hVarK = jVar.k();
        if (hVarK.equals(com.google.e.a.a.h.f8283a)) {
            baVar = ba.SHA1;
        } else if (hVarK.equals(com.google.e.a.a.h.f8284b)) {
            baVar = ba.SHA224;
        } else if (hVarK.equals(com.google.e.a.a.h.f8285c)) {
            baVar = ba.SHA256;
        } else if (hVarK.equals(com.google.e.a.a.h.f8286d)) {
            baVar = ba.SHA384;
        } else {
            if (!hVarK.equals(com.google.e.a.a.h.f8287e)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(hVarK))));
            }
            baVar = ba.SHA512;
        }
        bfVarNewBuilder.a(baVar);
        return bfVarNewBuilder.build();
    }
}
