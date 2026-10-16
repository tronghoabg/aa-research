package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class de extends com.google.v.du<de, dd> implements df {
    private static final de DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 600;
    private static volatile com.google.v.fo<de> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 601;
    private int bitField0_;
    private dc value_;
    private byte memoizedIsInitialized = 2;
    private String key_ = "";

    static {
        de deVar = new de();
        DEFAULT_INSTANCE = deVar;
        com.google.v.du.registerDefaultInstance(de.class, deVar);
    }

    private de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -3;
    }

    public static de getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(dc dcVar) {
        Objects.requireNonNull(dcVar);
        dc dcVar2 = this.value_;
        if (dcVar2 != null && dcVar2 != dc.getDefaultInstance()) {
            db dbVarNewBuilder = dc.newBuilder(dcVar2);
            dbVarNewBuilder.mergeFrom((db) dcVar);
            dcVar = dbVarNewBuilder.buildPartial();
        }
        this.value_ = dcVar;
        this.bitField0_ |= 2;
    }

    public static dd newBuilder() {
        return (dd) DEFAULT_INSTANCE.createBuilder();
    }

    public static de parseDelimitedFrom(InputStream inputStream) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(com.google.v.v vVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<de> parser() {
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
    public void setValue(dc dcVar) {
        Objects.requireNonNull(dcVar);
        this.value_ = dcVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001ɘə\u0002\u0000\u0000\u0002ɘᔈ\u0000əᔉ\u0001", new Object[]{"bitField0_", "key_", "value_"});
            case 3:
                return new de();
            case 4:
                return new dd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<de> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (de.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getKey() {
        return this.key_;
    }

    public com.google.v.v getKeyBytes() {
        return com.google.v.v.s(this.key_);
    }

    public dc getValue() {
        dc dcVar = this.value_;
        return dcVar == null ? dc.getDefaultInstance() : dcVar;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static dd newBuilder(de deVar) {
        return (dd) DEFAULT_INSTANCE.createBuilder(deVar);
    }

    public static de parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static de parseFrom(com.google.v.z zVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static de parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static de parseFrom(InputStream inputStream) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(ByteBuffer byteBuffer) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static de parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static de parseFrom(byte[] bArr) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static de parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
