package com.google.e.a.i.a;

import com.google.android.libraries.phenotype.client.stable.p;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.f;
import com.google.e.a.e.v;
import com.google.e.a.e.z;
import com.google.e.a.h.ac;
import com.google.e.a.h.ad;
import com.google.e.a.h.ae;
import com.google.e.a.h.af;
import com.google.e.a.h.ag;
import com.google.e.a.h.ah;
import com.google.e.a.h.ba;
import com.google.e.a.i.h;
import com.google.e.a.i.i;
import com.google.e.a.i.j;
import com.google.e.a.r;
import com.google.e.a.s;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8592a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f8593b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8594c;

    /* renamed from: d, reason: collision with root package name */
    private static final f f8595d;

    static {
        int i2 = 14;
        f8592a = z.a(new aq(i2), j.class);
        int i3 = 13;
        f8594c = z.d(new ar(i3), "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        f8593b = f.a(new as(i2), com.google.e.a.i.f.class);
        f8595d = f.d(new at(i3), "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
    }

    public static void a() {
        v vVarA = v.a();
        vVarA.c(f8592a);
        vVarA.g(f8594c);
        vVarA.b(f8593b);
        vVarA.f(f8595d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(j jVar) {
        s sVar = s.f8785d;
        ae aeVarNewBuilder = af.newBuilder();
        aeVarNewBuilder.a(jVar.h());
        aeVarNewBuilder.b(f(jVar));
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", sVar, aeVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ j c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            af from = af.parseFrom(fVar.f(), de.a());
            if (from.getVersion() == 0) {
                return g(from.getParams(), from.getKeySize());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingParameters failed: ", e2);
        }
    }

    public static /* synthetic */ com.google.e.a.i.f d(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
        }
        try {
            ad from = ad.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() == 0) {
                return com.google.e.a.i.f.g(g(from.getParams(), from.getKeyValue().c()), p.g(from.getKeyValue().x()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
        }
    }

    public static /* synthetic */ ai e(com.google.e.a.i.f fVar) {
        ac acVarNewBuilder = ad.newBuilder();
        acVarNewBuilder.a(com.google.v.v.q(fVar.h().e()));
        acVarNewBuilder.b(f(fVar.f()));
        return ai.i("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", acVarNewBuilder.build().toByteString(), r.f8777b, s.f8785d, null);
    }

    private static ah f(j jVar) throws GeneralSecurityException {
        ba baVar;
        ag agVarNewBuilder = ah.newBuilder();
        agVarNewBuilder.a(jVar.f());
        agVarNewBuilder.b(jVar.g());
        i iVarI = jVar.i();
        if (i.f8634a.equals(iVarI)) {
            baVar = ba.SHA1;
        } else if (i.f8635b.equals(iVarI)) {
            baVar = ba.SHA256;
        } else {
            if (!i.f8636c.equals(iVarI)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(iVarI))));
            }
            baVar = ba.SHA512;
        }
        agVarNewBuilder.c(baVar);
        return agVarNewBuilder.build();
    }

    private static j g(ah ahVar, int i2) throws GeneralSecurityException {
        i iVar;
        h hVar = new h();
        hVar.e(i2);
        hVar.c(ahVar.getDerivedKeySize());
        hVar.b(ahVar.getCiphertextSegmentSize());
        ba hkdfHashType = ahVar.getHkdfHashType();
        int iOrdinal = hkdfHashType.ordinal();
        if (iOrdinal == 1) {
            iVar = i.f8634a;
        } else if (iOrdinal == 3) {
            iVar = i.f8635b;
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse HashType: " + hkdfHashType.getNumber());
            }
            iVar = i.f8636c;
        }
        hVar.d(iVar);
        return hVar.a();
    }
}
