package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dd extends com.google.v.du<dd, dc> implements fj {
    private static final dd DEFAULT_INSTANCE;
    private static volatile fo<dd> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        dd ddVar = new dd();
        DEFAULT_INSTANCE = ddVar;
        com.google.v.du.registerDefaultInstance(dd.class, ddVar);
    }

    private dd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static dd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dc newBuilder() {
        return (dc) DEFAULT_INSTANCE.createBuilder();
    }

    public static dd parseDelimitedFrom(InputStream inputStream) {
        return (dd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dd parseFrom(com.google.v.v vVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ca caVar) {
        this.type_ = caVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.u});
        }
        if (iOrdinal == 3) {
            return new dd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ca getType() {
        ca caVarB = ca.b(this.type_);
        return caVarB == null ? ca.WEATHER_UNSPECIFIED : caVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dc newBuilder(dd ddVar) {
        return (dc) DEFAULT_INSTANCE.createBuilder(ddVar);
    }

    public static dd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dd parseFrom(com.google.v.z zVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dd parseFrom(InputStream inputStream) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dd parseFrom(ByteBuffer byteBuffer) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dd parseFrom(byte[] bArr) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
