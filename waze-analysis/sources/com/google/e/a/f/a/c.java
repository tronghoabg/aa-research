package com.google.e.a.f.a;

import com.google.android.libraries.phenotype.client.stable.p;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.ab;
import com.google.e.a.e.ai;
import com.google.e.a.e.f;
import com.google.e.a.e.v;
import com.google.e.a.e.z;
import com.google.e.a.f.g;
import com.google.e.a.f.h;
import com.google.e.a.f.k;
import com.google.e.a.f.l;
import com.google.e.a.f.m;
import com.google.e.a.f.n;
import com.google.e.a.h.ba;
import com.google.e.a.h.bb;
import com.google.e.a.h.bc;
import com.google.e.a.h.bd;
import com.google.e.a.h.be;
import com.google.e.a.h.bf;
import com.google.e.a.h.bg;
import com.google.e.a.r;
import com.google.e.a.s;
import com.google.v.de;
import com.google.v.eu;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8478a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f8479b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8480c;

    /* renamed from: d, reason: collision with root package name */
    private static final f f8481d;

    /* renamed from: e, reason: collision with root package name */
    private static final ai f8482e;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ab.c(ba.SHA1, l.f8515a, map, map2);
        ab.c(ba.SHA224, l.f8516b, map, map2);
        ab.c(ba.SHA256, l.f8517c, map, map2);
        ab.c(ba.SHA384, l.f8518d, map, map2);
        ab.c(ba.SHA512, l.f8519e, map, map2);
        f8482e = ab.d(map, map2);
        int i2 = 12;
        f8478a = z.a(new aq(i2), n.class);
        int i3 = 11;
        f8480c = z.d(new ar(i3), "type.googleapis.com/google.crypto.tink.HmacKey");
        f8479b = f.a(new as(i2), h.class);
        f8481d = f.d(new at(i3), "type.googleapis.com/google.crypto.tink.HmacKey");
    }

    public static void a() {
        v vVarA = v.a();
        vVarA.c(f8478a);
        vVarA.g(f8480c);
        vVarA.b(f8479b);
        vVarA.f(f8481d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(n nVar) throws GeneralSecurityException {
        s sVarF = f(nVar.k());
        bd bdVarNewBuilder = be.newBuilder();
        bdVarNewBuilder.b(h(nVar));
        bdVarNewBuilder.a(nVar.g());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.HmacKey", sVarF, bdVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ n c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            be from = be.parseFrom(fVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + from.getVersion());
            }
            k kVarI = n.i();
            kVarI.c(from.getKeySize());
            kVarI.d(from.getParams().getTagSize());
            kVarI.b((l) f8482e.l(from.getParams().getHash()));
            kVarI.e(g(fVar.e()));
            return kVarI.a();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
        }
    }

    public static /* synthetic */ com.waze.car_lib.r.ai d(h hVar) {
        bb bbVarNewBuilder = bc.newBuilder();
        bbVarNewBuilder.b(h(hVar.h()));
        bbVarNewBuilder.a(com.google.v.v.q(hVar.i().e()));
        return com.waze.car_lib.r.ai.i("type.googleapis.com/google.crypto.tink.HmacKey", bbVarNewBuilder.build().toByteString(), r.f8777b, f(hVar.h().k()), hVar.b());
    }

    public static /* synthetic */ h e(com.waze.car_lib.r.ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            bc from = bc.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            k kVarI = n.i();
            kVarI.c(from.getKeyValue().c());
            kVarI.d(from.getParams().getTagSize());
            kVarI.b((l) f8482e.l(from.getParams().getHash()));
            kVarI.e(g(aiVar.e()));
            n nVarA = kVarI.a();
            g gVarF = h.f();
            gVarF.c(nVarA);
            gVarF.d(p.g(from.getKeyValue().x()));
            gVarF.b(aiVar.g());
            return gVarF.a();
        } catch (eu | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static s f(m mVar) throws GeneralSecurityException {
        if (mVar == m.f8524d) {
            return s.f8785d;
        }
        if (mVar == m.f8521a) {
            return s.f8783b;
        }
        if (mVar == m.f8523c) {
            return s.f8784c;
        }
        if (mVar == m.f8522b) {
            return s.f8786e;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(String.valueOf(mVar))));
    }

    private static m g(s sVar) throws GeneralSecurityException {
        if (sVar == s.f8785d) {
            return m.f8524d;
        }
        if (sVar == s.f8783b) {
            return m.f8521a;
        }
        if (sVar == s.f8784c) {
            return m.f8523c;
        }
        if (sVar == s.f8786e) {
            return m.f8522b;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }

    private static bg h(n nVar) {
        bf bfVarNewBuilder = bg.newBuilder();
        bfVarNewBuilder.b(nVar.f());
        bfVarNewBuilder.a((ba) f8482e.k(nVar.j()));
        return bfVarNewBuilder.build();
    }
}
