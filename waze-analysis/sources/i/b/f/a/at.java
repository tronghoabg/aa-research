package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at extends du<at, ar> implements fj {
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 2;
    private static final at DEFAULT_INSTANCE;
    public static final int INT_VALUE_FIELD_NUMBER = 4;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile fo<at> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int TTL_FIELD_NUMBER = 5;
    private int bitField0_;
    private int ttl_;
    private Object value_;
    private int valueCase_ = 0;
    private String key_ = "";

    static {
        at atVar = new at();
        DEFAULT_INSTANCE = atVar;
        du.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBooleanValue() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntValue() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtl() {
        this.bitField0_ &= -3;
        this.ttl_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static at getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ar newBuilder() {
        return (ar) DEFAULT_INSTANCE.createBuilder();
    }

    public static at parseDelimitedFrom(InputStream inputStream) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(com.google.v.v vVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<at> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBooleanValue(boolean z) {
        this.valueCase_ = 2;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntValue(int i2) {
        this.valueCase_ = 4;
        this.value_ = Integer.valueOf(i2);
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
    public void setStringValue(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 3;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.v.v vVar) {
        this.value_ = vVar.u();
        this.valueCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtl(int i2) {
        this.bitField0_ |= 2;
        this.ttl_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002:\u0000\u0003;\u0000\u00047\u0000\u0005င\u0001", new Object[]{"value_", "valueCase_", "bitField0_", "key_", "ttl_"});
        }
        if (iOrdinal == 3) {
            return new at();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ar(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<at> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (at.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBooleanValue() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public int getIntValue() {
        if (this.valueCase_ == 4) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public String getKey() {
        return this.key_;
    }

    public com.google.v.v getKeyBytes() {
        return com.google.v.v.s(this.key_);
    }

    public String getStringValue() {
        return this.valueCase_ == 3 ? (String) this.value_ : "";
    }

    public com.google.v.v getStringValueBytes() {
        return com.google.v.v.s(this.valueCase_ == 3 ? (String) this.value_ : "");
    }

    public int getTtl() {
        return this.ttl_;
    }

    public as getValueCase() {
        int i2 = this.valueCase_;
        if (i2 == 0) {
            return as.f48421d;
        }
        if (i2 == 2) {
            return as.f48418a;
        }
        if (i2 == 3) {
            return as.f48419b;
        }
        if (i2 != 4) {
            return null;
        }
        return as.f48420c;
    }

    public boolean hasBooleanValue() {
        return this.valueCase_ == 2;
    }

    public boolean hasIntValue() {
        return this.valueCase_ == 4;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStringValue() {
        return this.valueCase_ == 3;
    }

    public boolean hasTtl() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ar newBuilder(at atVar) {
        return (ar) DEFAULT_INSTANCE.createBuilder(atVar);
    }

    public static at parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(com.google.v.v vVar, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static at parseFrom(com.google.v.z zVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static at parseFrom(com.google.v.z zVar, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static at parseFrom(InputStream inputStream) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(InputStream inputStream, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(ByteBuffer byteBuffer) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static at parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static at parseFrom(byte[] bArr) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static at parseFrom(byte[] bArr, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
