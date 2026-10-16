package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ag extends com.google.v.du<ag, af> implements fj {
    private static final ag DEFAULT_INSTANCE;
    public static final int LENGTH_METERS_FIELD_NUMBER = 1;
    private static volatile fo<ag> PARSER;
    private int bitField0_;
    private long lengthMeters_;

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        com.google.v.du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthMeters() {
        this.bitField0_ &= -2;
        this.lengthMeters_ = 0L;
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthMeters(long j2) {
        this.bitField0_ |= 1;
        this.lengthMeters_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "lengthMeters_"});
        }
        if (iOrdinal == 3) {
            return new ag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new af(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ag.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLengthMeters() {
        return this.lengthMeters_;
    }

    public boolean hasLengthMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public static af newBuilder(ag agVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
