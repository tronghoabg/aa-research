package com.google.e.a.i.a;

import com.google.android.libraries.phenotype.client.stable.p;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.f;
import com.google.e.a.e.v;
import com.google.e.a.e.z;
import com.google.e.a.h.ba;
import com.google.e.a.h.bf;
import com.google.e.a.h.bg;
import com.google.e.a.h.k;
import com.google.e.a.h.l;
import com.google.e.a.h.m;
import com.google.e.a.h.n;
import com.google.e.a.h.o;
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
    private static final z f8588a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f8589b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8590c;

    /* renamed from: d, reason: collision with root package name */
    private static final f f8591d;

    static {
        int i2 = 13;
        f8588a = z.a(new aq(i2), com.google.e.a.i.e.class);
        int i3 = 12;
        f8590c = z.d(new ar(i3), "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        f8589b = f.a(new as(i2), com.google.e.a.i.a.class);
        f8591d = f.d(new at(i3), "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
    }

    public static void a() {
        v vVarA = v.a();
        vVarA.c(f8588a);
        vVarA.g(f8590c);
        vVarA.b(f8589b);
        vVarA.f(f8591d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(com.google.e.a.i.e eVar) {
        s sVar = s.f8785d;
        m mVarNewBuilder = n.newBuilder();
        mVarNewBuilder.a(eVar.i());
        mVarNewBuilder.b(f(eVar));
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", sVar, mVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ com.google.e.a.i.e c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            n from = n.parseFrom(fVar.f(), de.a());
            return i(from.getParams(), from.getKeySize());
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e2);
        }
    }

    public static /* synthetic */ com.google.e.a.i.a d(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
        }
        try {
            l from = l.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() == 0) {
                return com.google.e.a.i.a.g(i(from.getParams(), from.getKeyValue().c()), p.g(from.getKeyValue().x()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
        }
    }

    public static /* synthetic */ ai e(com.google.e.a.i.a aVar) {
        k kVarNewBuilder = l.newBuilder();
        kVarNewBuilder.a(com.google.v.v.q(aVar.h().e()));
        kVarNewBuilder.b(f(aVar.f()));
        return ai.i("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", kVarNewBuilder.build().toByteString(), r.f8777b, s.f8785d, null);
    }

    private static com.google.e.a.h.p f(com.google.e.a.i.e eVar) {
        o oVarNewBuilder = com.google.e.a.h.p.newBuilder();
        oVarNewBuilder.a(eVar.f());
        oVarNewBuilder.b(eVar.g());
        oVarNewBuilder.c(g(eVar.j()));
        bf bfVarNewBuilder = bg.newBuilder();
        bfVarNewBuilder.a(g(eVar.k()));
        bfVarNewBuilder.b(eVar.h());
        oVarNewBuilder.d(bfVarNewBuilder);
        return oVarNewBuilder.build();
    }

    private static ba g(com.google.e.a.i.d dVar) throws GeneralSecurityException {
        if (com.google.e.a.i.d.f8613a.equals(dVar)) {
            return ba.SHA1;
        }
        if (com.google.e.a.i.d.f8614b.equals(dVar)) {
            return ba.SHA256;
        }
        if (com.google.e.a.i.d.f8615c.equals(dVar)) {
            return ba.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(dVar))));
    }

    private static com.google.e.a.i.d h(ba baVar) throws GeneralSecurityException {
        int iOrdinal = baVar.ordinal();
        if (iOrdinal == 1) {
            return com.google.e.a.i.d.f8613a;
        }
        if (iOrdinal == 3) {
            return com.google.e.a.i.d.f8614b;
        }
        if (iOrdinal == 4) {
            return com.google.e.a.i.d.f8615c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + baVar.getNumber());
    }

    private static com.google.e.a.i.e i(com.google.e.a.h.p pVar, int i2) {
        com.google.e.a.i.c cVar = new com.google.e.a.i.c();
        cVar.g(i2);
        cVar.c(pVar.getDerivedKeySize());
        cVar.b(pVar.getCiphertextSegmentSize());
        cVar.d(h(pVar.getHkdfHashType()));
        cVar.e(h(pVar.getHmacParams().getHash()));
        cVar.f(Integer.valueOf(pVar.getHmacParams().getTagSize()));
        return cVar.a();
    }
}
