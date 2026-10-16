package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ct extends com.google.v.du<ct, cs> implements fj {
    private static final ct DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile fo<ct> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long id_;
    private int type_;

    static {
        ct ctVar = new ct();
        DEFAULT_INSTANCE = ctVar;
        com.google.v.du.registerDefaultInstance(ct.class, ctVar);
    }

    private ct() {
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

    public static ct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cs newBuilder() {
        return (cs) DEFAULT_INSTANCE.createBuilder();
    }

    public static ct parseDelimitedFrom(InputStream inputStream) {
        return (ct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ct parseFrom(com.google.v.v vVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ct> parser() {
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
            return new ct();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ct> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ct.class) {
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

    public static cs newBuilder(ct ctVar) {
        return (cs) DEFAULT_INSTANCE.createBuilder(ctVar);
    }

    public static ct parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ct parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ct parseFrom(com.google.v.z zVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ct parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ct parseFrom(InputStream inputStream) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ct parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ct parseFrom(ByteBuffer byteBuffer) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ct parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ct parseFrom(byte[] bArr) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ct parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
