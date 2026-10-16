package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class br extends com.google.v.du<br, bq> implements bv {
    public static final int CONFIG_KEY_FIELD_NUMBER = 1;
    private static final br DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<br> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private bt configKey_;
    private String value_ = "";

    static {
        br brVar = new br();
        DEFAULT_INSTANCE = brVar;
        com.google.v.du.registerDefaultInstance(br.class, brVar);
    }

    private br() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigKey() {
        this.configKey_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = getDefaultInstance().getValue();
    }

    public static br getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigKey(bt btVar) {
        Objects.requireNonNull(btVar);
        bt btVar2 = this.configKey_;
        if (btVar2 != null && btVar2 != bt.getDefaultInstance()) {
            bs bsVarNewBuilder = bt.newBuilder(btVar2);
            bsVarNewBuilder.mergeFrom((bs) btVar);
            btVar = bsVarNewBuilder.buildPartial();
        }
        this.configKey_ = btVar;
        this.bitField0_ |= 1;
    }

    public static bq newBuilder() {
        return (bq) DEFAULT_INSTANCE.createBuilder();
    }

    public static br parseDelimitedFrom(InputStream inputStream) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(com.google.v.v vVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<br> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigKey(bt btVar) {
        Objects.requireNonNull(btVar);
        this.configKey_ = btVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(com.google.v.v vVar) {
        this.value_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "configKey_", "value_"});
        }
        if (iOrdinal == 3) {
            return new br();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<br> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (br.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bt getConfigKey() {
        bt btVar = this.configKey_;
        return btVar == null ? bt.getDefaultInstance() : btVar;
    }

    public String getValue() {
        return this.value_;
    }

    public com.google.v.v getValueBytes() {
        return com.google.v.v.s(this.value_);
    }

    public boolean hasConfigKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bq newBuilder(br brVar) {
        return (bq) DEFAULT_INSTANCE.createBuilder(brVar);
    }

    public static br parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static br parseFrom(com.google.v.z zVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static br parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static br parseFrom(InputStream inputStream) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(ByteBuffer byteBuffer) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static br parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static br parseFrom(byte[] bArr) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static br parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
