package com.waze.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import i.b.af;
import i.b.ah;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends du<s, r> implements fj {
    private static final s DEFAULT_INSTANCE;
    private static volatile fo<s> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ah status_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            af afVarNewBuilder = ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "status_"});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ah getStatus() {
        ah ahVar = this.status_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
