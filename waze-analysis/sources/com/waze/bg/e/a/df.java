package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class df extends com.google.v.du<df, de> implements com.google.v.fj {
    private static final df DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<df> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String name_ = "";
    private i.b.s position_;

    static {
        df dfVar = new df();
        DEFAULT_INSTANCE = dfVar;
        com.google.v.du.registerDefaultInstance(df.class, dfVar);
    }

    private df() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    public static df getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.position_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.position_ = sVar;
        this.bitField0_ |= 1;
    }

    public static de newBuilder() {
        return (de) DEFAULT_INSTANCE.createBuilder();
    }

    public static df parseDelimitedFrom(InputStream inputStream) {
        return (df) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static df parseFrom(com.google.v.v vVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<df> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.position_ = sVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "position_", "name_"});
        }
        if (iOrdinal == 3) {
            return new df();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new de(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<df> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (df.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public i.b.s getPosition() {
        i.b.s sVar = this.position_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static de newBuilder(df dfVar) {
        return (de) DEFAULT_INSTANCE.createBuilder(dfVar);
    }

    public static df parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (df) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static df parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static df parseFrom(com.google.v.z zVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static df parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static df parseFrom(InputStream inputStream) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static df parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static df parseFrom(ByteBuffer byteBuffer) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static df parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static df parseFrom(byte[] bArr) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static df parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
