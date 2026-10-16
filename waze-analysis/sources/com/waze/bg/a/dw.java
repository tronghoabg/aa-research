package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dw extends com.google.v.du<dw, dv> implements fj {
    private static final dw DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile fo<dw> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long id_;
    private int type_;

    static {
        dw dwVar = new dw();
        DEFAULT_INSTANCE = dwVar;
        com.google.v.du.registerDefaultInstance(dw.class, dwVar);
    }

    private dw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -3;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static dw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dv newBuilder() {
        return (dv) DEFAULT_INSTANCE.createBuilder();
    }

    public static dw parseDelimitedFrom(InputStream inputStream) {
        return (dw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dw parseFrom(com.google.v.v vVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 2;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bu buVar) {
        this.type_ = buVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "type_", o.o, "id_"});
        }
        if (iOrdinal == 3) {
            return new dw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getId() {
        return this.id_;
    }

    public bu getType() {
        bu buVarA = bu.a(this.type_);
        return buVarA == null ? bu.PH_UNSPECIFIED : buVarA;
    }

    public boolean hasId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dv newBuilder(dw dwVar) {
        return (dv) DEFAULT_INSTANCE.createBuilder(dwVar);
    }

    public static dw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dw parseFrom(com.google.v.z zVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dw parseFrom(InputStream inputStream) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dw parseFrom(ByteBuffer byteBuffer) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dw parseFrom(byte[] bArr) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
