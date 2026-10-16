package com.google.e.a.a.a;

import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.a.x;
import com.google.e.a.a.y;
import com.google.e.a.e.z;
import com.google.e.a.h.am;
import com.google.e.a.h.an;
import com.google.e.a.h.ao;
import com.google.e.a.h.ap;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8120a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8121b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8122c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8123d;

    static {
        int i2 = 5;
        f8120a = z.a(new aq(i2), com.google.e.a.a.z.class);
        f8122c = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f8121b = com.google.e.a.e.f.a(new as(i2), com.google.e.a.a.v.class);
        f8123d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.AesGcmSivKey");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8120a);
        vVarA.g(f8122c);
        vVarA.b(f8121b);
        vVarA.f(f8123d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(com.google.e.a.a.z zVar) throws GeneralSecurityException {
        com.google.e.a.s sVarF = f(zVar.h());
        ao aoVarNewBuilder = ap.newBuilder();
        aoVarNewBuilder.a(zVar.f());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey", sVarF, aoVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ com.google.e.a.a.z c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            ap from = ap.parseFrom(fVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            x xVarG = com.google.e.a.a.z.g();
            xVarG.b(from.getKeySize());
            xVarG.c(g(fVar.e()));
            return xVarG.a();
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
        }
    }

    public static /* synthetic */ ai d(com.google.e.a.a.v vVar) {
        am amVarNewBuilder = an.newBuilder();
        amVarNewBuilder.a(com.google.v.v.q(vVar.i().e()));
        return ai.i("type.googleapis.com/google.crypto.tink.AesGcmSivKey", amVarNewBuilder.build().toByteString(), com.google.e.a.r.f8777b, f(vVar.h().h()), vVar.b());
    }

    public static /* synthetic */ com.google.e.a.a.v e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            an from = an.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            x xVarG = com.google.e.a.a.z.g();
            xVarG.b(from.getKeyValue().c());
            xVarG.c(g(aiVar.e()));
            com.google.e.a.a.z zVarA = xVarG.a();
            com.google.e.a.a.u uVarG = com.google.e.a.a.v.g();
            uVarG.c(zVarA);
            uVarG.d(com.google.android.libraries.phenotype.client.stable.p.g(from.getKeyValue().x()));
            uVarG.b(aiVar.g());
            return uVarG.a();
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static com.google.e.a.s f(y yVar) throws GeneralSecurityException {
        if (yVar.equals(y.f8348a)) {
            return com.google.e.a.s.f8783b;
        }
        if (yVar.equals(y.f8349b)) {
            return com.google.e.a.s.f8786e;
        }
        if (yVar.equals(y.f8350c)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(yVar))));
    }

    private static y g(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return y.f8348a;
        }
        if (sVar == com.google.e.a.s.f8786e || sVar == com.google.e.a.s.f8784c) {
            return y.f8349b;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return y.f8350c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
