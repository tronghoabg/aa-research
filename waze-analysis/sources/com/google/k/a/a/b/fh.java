package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fh extends com.google.v.du<fh, fg> implements fi {
    private static final fh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fh> PARSER = null;
    public static final int PROPERTY_ID_FIELD_NUMBER = 1;
    public static final int VALUE_STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.k.c.a.a.c propertyId_;
    private int valueStatus_;

    static {
        fh fhVar = new fh();
        DEFAULT_INSTANCE = fhVar;
        com.google.v.du.registerDefaultInstance(fh.class, fhVar);
    }

    private fh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPropertyId() {
        this.propertyId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueStatus() {
        this.bitField0_ &= -3;
        this.valueStatus_ = 0;
    }

    public static fh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePropertyId(com.google.k.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        com.google.k.c.a.a.c cVar2 = this.propertyId_;
        if (cVar2 != null && cVar2 != com.google.k.c.a.a.c.getDefaultInstance()) {
            com.google.k.c.a.a.a aVarNewBuilder = com.google.k.c.a.a.c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((com.google.k.c.a.a.a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.propertyId_ = cVar;
        this.bitField0_ |= 1;
    }

    public static fg newBuilder() {
        return (fg) DEFAULT_INSTANCE.createBuilder();
    }

    public static fh parseDelimitedFrom(InputStream inputStream) {
        return (fh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fh parseFrom(com.google.v.v vVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPropertyId(com.google.k.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        this.propertyId_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueStatus(com.google.k.a.a.jh jhVar) {
        this.valueStatus_ = jhVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "propertyId_", "valueStatus_", com.google.k.a.a.jh.b()});
        }
        if (iOrdinal == 3) {
            return new fh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.c.a.a.c getPropertyId() {
        com.google.k.c.a.a.c cVar = this.propertyId_;
        return cVar == null ? com.google.k.c.a.a.c.getDefaultInstance() : cVar;
    }

    public com.google.k.a.a.jh getValueStatus() {
        com.google.k.a.a.jh jhVarA = com.google.k.a.a.jh.a(this.valueStatus_);
        return jhVarA == null ? com.google.k.a.a.jh.PROPERTY_VALUE_STATUS_UNSPECIFIED : jhVarA;
    }

    public boolean hasPropertyId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValueStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public static fg newBuilder(fh fhVar) {
        return (fg) DEFAULT_INSTANCE.createBuilder(fhVar);
    }

    public static fh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fh parseFrom(com.google.v.z zVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fh parseFrom(InputStream inputStream) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fh parseFrom(ByteBuffer byteBuffer) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fh parseFrom(byte[] bArr) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
