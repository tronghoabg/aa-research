package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class auw extends com.google.v.du<auw, auv> implements aux {
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final auw DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<auw> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private String category_ = "";
    private String name_ = "";
    private String value_ = "";

    static {
        auw auwVar = new auw();
        DEFAULT_INSTANCE = auwVar;
        com.google.v.du.registerDefaultInstance(auw.class, auwVar);
    }

    private auw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = getDefaultInstance().getCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static auw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static auv newBuilder() {
        return (auv) DEFAULT_INSTANCE.createBuilder();
    }

    public static auw parseDelimitedFrom(InputStream inputStream) {
        return (auw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auw parseFrom(com.google.v.v vVar) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<auw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(String str) {
        Objects.requireNonNull(str);
        this.category_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.category_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.value_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"category_", "name_", "value_"});
        }
        if (iOrdinal == 3) {
            return new auw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new auv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<auw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (auw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCategory() {
        return this.category_;
    }

    public com.google.v.v getCategoryBytes() {
        return com.google.v.v.s(this.category_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getValue() {
        return this.value_;
    }

    public com.google.v.v getValueBytes() {
        return com.google.v.v.s(this.value_);
    }

    public static auv newBuilder(auw auwVar) {
        return (auv) DEFAULT_INSTANCE.createBuilder(auwVar);
    }

    public static auw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static auw parseFrom(com.google.v.z zVar) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static auw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static auw parseFrom(InputStream inputStream) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static auw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static auw parseFrom(ByteBuffer byteBuffer) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static auw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static auw parseFrom(byte[] bArr) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static auw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (auw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
