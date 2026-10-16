package com.google.e.a.a.a;

import com.google.e.a.a.am;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.z;
import com.google.e.a.h.aa;
import com.google.e.a.h.ab;
import com.google.e.a.h.x;
import com.google.e.a.h.y;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8104a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8105b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8106c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8107d;

    static {
        int i2 = 3;
        f8104a = z.a(new aq(i2), com.google.e.a.a.o.class);
        f8106c = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.AesEaxKey");
        f8105b = com.google.e.a.e.f.a(new as(i2), com.google.e.a.a.k.class);
        f8107d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.AesEaxKey");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8104a);
        vVarA.g(f8106c);
        vVarA.b(f8105b);
        vVarA.f(f8107d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(com.google.e.a.a.o oVar) throws GeneralSecurityException {
        com.google.e.a.s sVarF = f(oVar.h());
        y yVarNewBuilder = com.google.e.a.h.z.newBuilder();
        yVarNewBuilder.b(h(oVar));
        yVarNewBuilder.a(oVar.g());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesEaxKey", sVarF, yVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ com.google.e.a.a.o c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            com.google.e.a.h.z from = com.google.e.a.h.z.parseFrom(fVar.f(), de.a());
            am amVarI = com.google.e.a.a.o.i();
            amVarI.l(from.getKeySize());
            amVarI.k(from.getParams().getIvSize());
            amVarI.m();
            amVarI.n(g(fVar.e()));
            return amVarI.j();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
        }
    }

    public static /* synthetic */ ai d(com.google.e.a.a.k kVar) {
        com.google.e.a.h.w wVarNewBuilder = x.newBuilder();
        wVarNewBuilder.b(h(kVar.g()));
        wVarNewBuilder.a(com.google.v.v.q(kVar.h().e()));
        return ai.i("type.googleapis.com/google.crypto.tink.AesEaxKey", wVarNewBuilder.build().toByteString(), com.google.e.a.r.f8777b, f(kVar.g().h()), kVar.b());
    }

    public static /* synthetic */ com.google.e.a.a.k e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            x from = x.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            am amVarI = com.google.e.a.a.o.i();
            amVarI.l(from.getKeyValue().c());
            amVarI.k(from.getParams().getIvSize());
            amVarI.m();
            amVarI.n(g(aiVar.e()));
            com.google.e.a.a.o oVarJ = amVarI.j();
            com.google.e.a.a.u uVarI = com.google.e.a.a.k.i();
            uVarI.j(oVarJ);
            uVarI.l(com.google.android.libraries.phenotype.client.stable.p.g(from.getKeyValue().x()));
            uVarI.i(aiVar.g());
            return uVarI.h();
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    private static com.google.e.a.s f(com.google.e.a.a.n nVar) throws GeneralSecurityException {
        if (nVar.equals(com.google.e.a.a.n.f8308a)) {
            return com.google.e.a.s.f8783b;
        }
        if (nVar.equals(com.google.e.a.a.n.f8309b)) {
            return com.google.e.a.s.f8786e;
        }
        if (nVar.equals(com.google.e.a.a.n.f8310c)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(nVar))));
    }

    private static com.google.e.a.a.n g(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return com.google.e.a.a.n.f8308a;
        }
        if (sVar == com.google.e.a.s.f8786e || sVar == com.google.e.a.s.f8784c) {
            return com.google.e.a.a.n.f8309b;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return com.google.e.a.a.n.f8310c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }

    private static ab h(com.google.e.a.a.o oVar) {
        aa aaVarNewBuilder = ab.newBuilder();
        aaVarNewBuilder.a(oVar.f());
        return aaVarNewBuilder.build();
    }
}
