package com.google.e.a.b.a;

import com.google.e.a.e.w;
import com.google.e.a.h.bi;
import com.google.e.a.h.ci;
import com.google.e.a.r;
import com.google.e.a.s;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {
    public a(byte[] bArr) {
        new AtomicInteger();
        new AtomicInteger();
    }

    public static boolean a(int i2) {
        return i2 + (-1) != 0 ? !b.b() || b.a().booleanValue() : !b.b();
    }

    public static r b(bi biVar) throws GeneralSecurityException {
        int iOrdinal = biVar.ordinal();
        if (iOrdinal == 0) {
            return r.f8776a;
        }
        if (iOrdinal == 1) {
            return r.f8777b;
        }
        if (iOrdinal == 2) {
            return r.f8778c;
        }
        if (iOrdinal == 3) {
            return r.f8779d;
        }
        if (iOrdinal == 4) {
            return r.f8780e;
        }
        if (iOrdinal != 5) {
            throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(String.valueOf(biVar))));
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(String.valueOf(biVar))));
    }

    public static s c(ci ciVar) throws GeneralSecurityException {
        switch (ciVar) {
            case UNKNOWN_PREFIX:
                return s.f8782a;
            case TINK:
                return s.f8783b;
            case LEGACY:
                return s.f8784c;
            case RAW:
                return s.f8785d;
            case CRUNCHY:
                return s.f8786e;
            case WITH_ID_REQUIREMENT:
                return s.f8787f;
            case UNRECOGNIZED:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(String.valueOf(ciVar))));
            default:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(String.valueOf(ciVar))));
        }
    }

    public static bi d(r rVar) throws GeneralSecurityException {
        if (rVar.equals(r.f8776a)) {
            return bi.UNKNOWN_KEYMATERIAL;
        }
        if (rVar.equals(r.f8777b)) {
            return bi.SYMMETRIC;
        }
        if (rVar.equals(r.f8778c)) {
            return bi.ASYMMETRIC_PRIVATE;
        }
        if (rVar.equals(r.f8779d)) {
            return bi.ASYMMETRIC_PUBLIC;
        }
        if (rVar.equals(r.f8780e)) {
            return bi.REMOTE;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(rVar.toString()));
    }

    public static ci e(s sVar) throws GeneralSecurityException {
        if (sVar.equals(s.f8782a)) {
            return ci.UNKNOWN_PREFIX;
        }
        if (sVar.equals(s.f8783b)) {
            return ci.TINK;
        }
        if (sVar.equals(s.f8784c)) {
            return ci.LEGACY;
        }
        if (sVar.equals(s.f8785d)) {
            return ci.RAW;
        }
        if (sVar.equals(s.f8786e)) {
            return ci.CRUNCHY;
        }
        if (sVar.equals(s.f8787f)) {
            return ci.WITH_ID_REQUIREMENT;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }

    public static com.google.e.a.k.a f(s sVar, Integer num) throws GeneralSecurityException {
        if (sVar == s.f8785d) {
            if (num == null) {
                return w.f8463a;
            }
            throw new GeneralSecurityException("RAW output prefix type cannot have an id requirement");
        }
        if (num == null) {
            throw new GeneralSecurityException("idRequirement must be non-null for " + String.valueOf(sVar) + " type");
        }
        if (sVar == s.f8783b) {
            return w.b(num.intValue());
        }
        if (sVar == s.f8784c || sVar == s.f8786e) {
            return w.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(String.valueOf(sVar))));
    }
}
