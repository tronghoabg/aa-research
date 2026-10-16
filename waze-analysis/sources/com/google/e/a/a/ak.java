package com.google.e.a.a;

import com.google.e.a.h.ca;
import com.google.e.a.h.cb;
import com.google.e.a.h.cc;
import com.google.e.a.h.cd;
import com.google.v.de;
import com.google.v.eu;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.e.a.e.z f8192a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.f f8193b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.z f8194c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.f f8195d;

    static {
        int i2 = 1;
        f8192a = com.google.e.a.e.z.a(new aq(i2), aj.class);
        f8194c = com.google.e.a.e.z.d(new ar(i2), "type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f8193b = com.google.e.a.e.f.a(new as(i2), ah.class);
        f8195d = com.google.e.a.e.f.d(new at(i2), "type.googleapis.com/google.crypto.tink.KmsAeadKey");
    }

    public static void a() {
        com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
        vVarA.c(f8192a);
        vVarA.g(f8194c);
        vVarA.b(f8193b);
        vVarA.f(f8195d);
    }

    public static /* synthetic */ com.google.android.libraries.e.a.f b(aj ajVar) throws GeneralSecurityException {
        com.google.e.a.s sVarF = f(ajVar.f());
        cc ccVarNewBuilder = cd.newBuilder();
        ccVarNewBuilder.a(ajVar.h());
        return com.google.android.libraries.e.a.f.h("type.googleapis.com/google.crypto.tink.KmsAeadKey", sVarF, ccVarNewBuilder.build().toByteString());
    }

    public static /* synthetic */ aj c(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        if (!fVar.g().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(fVar.g())));
        }
        try {
            return aj.g(cd.parseFrom(fVar.f(), de.a()).getKeyUri(), g(fVar.e()));
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
        }
    }

    public static /* synthetic */ ah d(com.waze.car_lib.r.ai aiVar) throws GeneralSecurityException {
        if (!aiVar.h().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            cb from = cb.parseFrom(aiVar.f(), de.a());
            if (from.getVersion() == 0) {
                return ah.g(aj.g(from.getParams().getKeyUri(), g(aiVar.e())), aiVar.g());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(from));
        } catch (eu e2) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
        }
    }

    public static /* synthetic */ com.waze.car_lib.r.ai e(ah ahVar) {
        ca caVarNewBuilder = cb.newBuilder();
        cc ccVarNewBuilder = cd.newBuilder();
        ccVarNewBuilder.a(ahVar.h().h());
        caVarNewBuilder.a(ccVarNewBuilder.build());
        return com.waze.car_lib.r.ai.i("type.googleapis.com/google.crypto.tink.KmsAeadKey", caVarNewBuilder.build().toByteString(), com.google.e.a.r.f8780e, f(ahVar.h().f()), ahVar.b());
    }

    private static com.google.e.a.s f(ai aiVar) throws GeneralSecurityException {
        if (aiVar.equals(ai.f8187a)) {
            return com.google.e.a.s.f8783b;
        }
        if (aiVar.equals(ai.f8188b)) {
            return com.google.e.a.s.f8785d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(aiVar.toString()));
    }

    private static ai g(com.google.e.a.s sVar) throws GeneralSecurityException {
        if (sVar == com.google.e.a.s.f8783b) {
            return ai.f8187a;
        }
        if (sVar == com.google.e.a.s.f8785d) {
            return ai.f8188b;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
