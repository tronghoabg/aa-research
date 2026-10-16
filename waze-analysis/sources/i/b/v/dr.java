package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dr extends com.google.v.du<dr, dq> implements ds {
    private static final dr DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2001;
    private static volatile com.google.v.fo<dr> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2002;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String key_ = "";
    private com.google.v.v value_ = com.google.v.v.f13054a;

    static {
        dr drVar = new dr();
        DEFAULT_INSTANCE = drVar;
        com.google.v.du.registerDefaultInstance(dr.class, drVar);
    }

    private dr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = getDefaultInstance().getValue();
    }

    public static dr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dq newBuilder() {
        return (dq) DEFAULT_INSTANCE.createBuilder();
    }

    public static dr parseDelimitedFrom(InputStream inputStream) {
        return (dr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dr parseFrom(com.google.v.v vVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dr> parser() {
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
    public void setValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.value_ = vVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001ߑߒ\u0002\u0000\u0000\u0002ߑᔈ\u0000ߒᔊ\u0001", new Object[]{"bitField0_", "key_", "value_"});
            case 3:
                return new dr();
            case 4:
                return new dq(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<dr> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (dr.class) {
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

    public com.google.v.v getValue() {
        return this.value_;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static dq newBuilder(dr drVar) {
        return (dq) DEFAULT_INSTANCE.createBuilder(drVar);
    }

    public static dr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dr parseFrom(com.google.v.z zVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dr parseFrom(InputStream inputStream) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dr parseFrom(ByteBuffer byteBuffer) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dr parseFrom(byte[] bArr) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
