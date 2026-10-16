package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gt extends com.google.v.du<gt, gs> implements com.google.v.fj {
    public static final int CHILD_TYPE_FIELD_NUMBER = 1;
    private static final gt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gt> PARSER;
    private int bitField0_;
    private int childType_;

    static {
        gt gtVar = new gt();
        DEFAULT_INSTANCE = gtVar;
        com.google.v.du.registerDefaultInstance(gt.class, gtVar);
    }

    private gt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildType() {
        this.bitField0_ &= -2;
        this.childType_ = 0;
    }

    public static gt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gs newBuilder() {
        return (gs) DEFAULT_INSTANCE.createBuilder();
    }

    public static gt parseDelimitedFrom(InputStream inputStream) {
        return (gt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gt parseFrom(com.google.v.v vVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildType(int i2) {
        this.bitField0_ |= 1;
        this.childType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "childType_"});
        }
        if (iOrdinal == 3) {
            return new gt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getChildType() {
        return this.childType_;
    }

    public boolean hasChildType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gs newBuilder(gt gtVar) {
        return (gs) DEFAULT_INSTANCE.createBuilder(gtVar);
    }

    public static gt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gt parseFrom(com.google.v.z zVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gt parseFrom(InputStream inputStream) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gt parseFrom(ByteBuffer byteBuffer) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gt parseFrom(byte[] bArr) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
