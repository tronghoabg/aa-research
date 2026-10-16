package com.google.e.a.a.a;

import com.google.e.a.a.aa;
import com.google.e.a.a.ac;
import com.google.e.a.a.ad;
import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.e.z;
import com.google.e.a.h.au;
import com.google.e.a.h.av;
import com.google.e.a.h.ax;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8130a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8131b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8132c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8133d;

    static {
        int i2 = 6;
        f8130a = z.a(new aq(i2), ad.class);
        f8132c = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f8131b = com.google.e.a.e.f.a(new as(i2), aa.class);
        f8133d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8130a);
        vVarA.g(f8132c);
        vVarA.b(f8131b);
        vVarA.f(f8133d);
    }

    public static /* synthetic */ ad c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            ax.parseFrom(fVar.f(), de.a());
            return ad.g(g(fVar.e()));
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ ai d(aa aaVar) {
        au auVarNewBuilder = av.newBuilder();
        auVarNewBuilder.a(com.google.v.v.q(aaVar.i().e()));
        return ai.i("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", auVarNewBuilder.build().toByteString(), com.google.e.a.r.f8777b, f(aaVar.g().f()), aaVar.b());
    }

    public static /* synthetic */ aa e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            av from = av.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() == 0) {
                return aa.h(g(aiVar.e()), com.google.android.libraries.phenotype.client.stable.p.g(from.getKeyValue().x()), aiVar.g());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static com.google.e.a.s f(ac acVar) throws GeneralSecurityException {
        if (acVar.equals(ac.f8165a)) {
            return com.google.e.a.s.f8783b;
        }
        if (acVar.equals(ac.f8166b)) {
            return com.google.e.a.s.f8786e;
        }
        if (acVar.equals(ac.f8167c)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(acVar.toString()));
    }

    private static ac g(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return ac.f8165a;
        }
        if (sVar == com.google.e.a.s.f8786e || sVar == com.google.e.a.s.f8784c) {
            return ac.f8166b;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return ac.f8167c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
