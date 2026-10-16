package com.google.e.a.a.a;

import com.google.e.a.a.aq;
import com.google.e.a.a.ar;
import com.google.e.a.a.as;
import com.google.e.a.a.at;
import com.google.e.a.a.bb;
import com.google.e.a.a.bd;
import com.google.e.a.a.be;
import com.google.e.a.e.z;
import com.google.e.a.h.cr;
import com.google.e.a.h.cs;
import com.google.e.a.h.cu;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final z f8153a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8154b;

    /* renamed from: c, reason: collision with root package name */
    private static final z f8155c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8156d;

    static {
        int i2 = 8;
        f8153a = z.a(new aq(i2), be.class);
        f8155c = z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f8154b = com.google.e.a.e.f.a(new as(i2), bb.class);
        f8156d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8153a);
        vVarA.g(f8155c);
        vVarA.b(f8154b);
        vVarA.f(f8156d);
    }

    public static /* synthetic */ be c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            if (cu.parseFrom(fVar.f(), de.a()).getVersion() == 0) {
                return be.g(g(fVar.e()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ ai d(bb bbVar) {
        cr crVarNewBuilder = cs.newBuilder();
        crVarNewBuilder.a(com.google.v.v.q(bbVar.i().e()));
        return ai.i("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", crVarNewBuilder.build().toByteString(), com.google.e.a.r.f8777b, f(bbVar.g().f()), bbVar.b());
    }

    public static /* synthetic */ bb e(ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            cs from = cs.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() == 0) {
                return bb.h(g(aiVar.e()), com.google.android.libraries.phenotype.client.stable.p.g(from.getKeyValue().x()), aiVar.g());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (eu unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static com.google.e.a.s f(bd bdVar) throws GeneralSecurityException {
        if (bdVar.equals(bd.f8258a)) {
            return com.google.e.a.s.f8783b;
        }
        if (bdVar.equals(bd.f8259b)) {
            return com.google.e.a.s.f8786e;
        }
        if (bdVar.equals(bd.f8260c)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(bdVar.toString()));
    }

    private static bd g(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return bd.f8258a;
        }
        if (sVar == com.google.e.a.s.f8786e || sVar == com.google.e.a.s.f8784c) {
            return bd.f8259b;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return bd.f8260c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
