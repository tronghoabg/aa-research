package com.google.e.a.c.a;

import com.google.android.libraries.phenotype.client.stable.p;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.c.g;
import com.google.e.a.e.f;
import com.google.e.a.e.v;
import com.google.e.a.e.z;
import com.google.e.a.r;
import com.google.e.a.s;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8362a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f8363b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f8364c;

    /* renamed from: d, reason: collision with root package name */
    private static final z f8365d;

    /* renamed from: e, reason: collision with root package name */
    private static final f f8366e;

    static {
        int i2 = 9;
        f8362a = z.a(new aq(i2), g.class);
        f8365d = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.AesSivKey");
        f8363b = f.a(new as(i2), com.google.e.a.c.b.class);
        f8366e = f.d(new at(i2), "type.googleapis.com/google.crypto.tink.AesSivKey");
        HashMap map = new HashMap();
        map.put(com.google.e.a.c.f.f8386c, s.f8785d);
        map.put(com.google.e.a.c.f.f8384a, s.f8783b);
        map.put(com.google.e.a.c.f.f8385b, s.f8786e);
        f8364c = DesugarCollections.unmodifiableMap(map);
    }

    public static void a() {
        v vVarA = v.a();
        vVarA.c(f8362a);
        vVarA.g(f8365d);
        vVarA.b(f8363b);
        vVarA.f(f8366e);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(g gVar) throws GeneralSecurityException {
        s sVarF = f(gVar.h());
        com.google.e.a.h.as asVarNewBuilder = com.google.e.a.h.at.newBuilder();
        asVarNewBuilder.a(gVar.f());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesSivKey", sVarF, asVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ g c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            com.google.e.a.h.at from = com.google.e.a.h.at.parseFrom(fVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.e.a.c.e eVarG = g.g();
            eVarG.b(from.getKeySize());
            eVarG.c(g(fVar.e()));
            return eVarG.a();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e2);
        }
    }

    public static /* synthetic */ ai d(com.google.e.a.c.b bVar) {
        com.google.e.a.h.aq aqVarNewBuilder = com.google.e.a.h.ar.newBuilder();
        aqVarNewBuilder.a(com.google.v.v.q(bVar.i().e()));
        return ai.i("type.googleapis.com/google.crypto.tink.AesSivKey", aqVarNewBuilder.build().toByteString(), r.f8777b, f(bVar.g().h()), bVar.b());
    }

    public static /* synthetic */ com.google.e.a.c.b e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            com.google.e.a.h.ar from = com.google.e.a.h.ar.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.e.a.c.e eVarG = g.g();
            eVarG.b(from.getKeyValue().c());
            eVarG.c(g(aiVar.e()));
            g gVarA = eVarG.a();
            com.google.e.a.c.a aVarF = com.google.e.a.c.b.f();
            aVarF.c(gVarA);
            aVarF.d(p.g(from.getKeyValue().x()));
            aVarF.b(aiVar.g());
            return aVarF.a();
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    private static s f(com.google.e.a.c.f fVar) throws GeneralSecurityException {
        Map map = f8364c;
        if (map.containsKey(fVar)) {
            return (s) map.get(fVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(fVar))));
    }

    private static com.google.e.a.c.f g(s sVar) throws GeneralSecurityException {
        if (sVar == s.f8785d) {
            return com.google.e.a.c.f.f8386c;
        }
        if (sVar == s.f8783b) {
            return com.google.e.a.c.f.f8384a;
        }
        if (sVar == s.f8786e || sVar == s.f8784c) {
            return com.google.e.a.c.f.f8385b;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
