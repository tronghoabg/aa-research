package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ia extends com.google.v.du<ia, hz> implements ib {
    private static final ia DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ia> PARSER;
    private int bitField0_;
    private String key_ = "";
    private String name_ = "";

    static {
        ia iaVar = new ia();
        DEFAULT_INSTANCE = iaVar;
        com.google.v.du.registerDefaultInstance(ia.class, iaVar);
    }

    private ia() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    public static ia getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hz newBuilder() {
        return (hz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ia parseDelimitedFrom(InputStream inputStream) {
        return (ia) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ia parseFrom(com.google.v.v vVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ia> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(com.google.v.v vVar) {
        this.key_ = vVar.u();
        this.bitField0_ |= 1;
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "key_", "name_"});
        }
        if (iOrdinal == 3) {
            return new ia();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ia> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ia.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getKey() {
        return this.key_;
    }

    public com.google.v.v getKeyBytes() {
        return com.google.v.v.s(this.key_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hz newBuilder(ia iaVar) {
        return (hz) DEFAULT_INSTANCE.createBuilder(iaVar);
    }

    public static ia parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ia) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ia parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ia parseFrom(com.google.v.z zVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ia parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ia parseFrom(InputStream inputStream) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ia parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ia parseFrom(ByteBuffer byteBuffer) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ia parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ia parseFrom(byte[] bArr) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ia parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
