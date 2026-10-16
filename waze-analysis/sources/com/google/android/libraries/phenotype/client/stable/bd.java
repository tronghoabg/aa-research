package com.google.android.libraries.phenotype.client.stable;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bd extends du<bd, bb> implements be {
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 3;
    public static final int BYTES_VALUE_FIELD_NUMBER = 6;
    private static final bd DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
    public static final int LONG_VALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<bd> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object value_;
    private int valueCase_ = 0;
    private String name_ = "";

    static {
        bd bdVar = new bd();
        DEFAULT_INSTANCE = bdVar;
        du.registerDefaultInstance(bd.class, bdVar);
    }

    private bd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBooleanValue() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesValue() {
        if (this.valueCase_ == 6) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongValue() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.valueCase_ == 5) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static bd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bb newBuilder() {
        return (bb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bd parseDelimitedFrom(InputStream inputStream) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(com.google.v.v vVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBooleanValue(boolean z) {
        this.valueCase_ = 3;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.valueCase_ = 6;
        this.value_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d2) {
        this.valueCase_ = 4;
        this.value_ = Double.valueOf(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongValue(long j2) {
        this.valueCase_ = 2;
        this.value_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.v.v vVar) {
        this.value_ = vVar.u();
        this.valueCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "name_"});
        }
        if (iOrdinal == 3) {
            return new bd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBooleanValue() {
        if (this.valueCase_ == 3) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public com.google.v.v getBytesValue() {
        return this.valueCase_ == 6 ? (com.google.v.v) this.value_ : com.google.v.v.f13054a;
    }

    public double getDoubleValue() {
        return this.valueCase_ == 4 ? ((Double) this.value_).doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public long getLongValue() {
        if (this.valueCase_ == 2) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getStringValue() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public com.google.v.v getStringValueBytes() {
        return com.google.v.v.s(this.valueCase_ == 5 ? (String) this.value_ : "");
    }

    public bc getValueCase() {
        int i2 = this.valueCase_;
        if (i2 == 0) {
            return bc.f6110f;
        }
        if (i2 == 2) {
            return bc.f6105a;
        }
        if (i2 == 3) {
            return bc.f6106b;
        }
        if (i2 == 4) {
            return bc.f6107c;
        }
        if (i2 == 5) {
            return bc.f6108d;
        }
        if (i2 != 6) {
            return null;
        }
        return bc.f6109e;
    }

    public boolean hasBooleanValue() {
        return this.valueCase_ == 3;
    }

    public boolean hasBytesValue() {
        return this.valueCase_ == 6;
    }

    public boolean hasDoubleValue() {
        return this.valueCase_ == 4;
    }

    public boolean hasLongValue() {
        return this.valueCase_ == 2;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStringValue() {
        return this.valueCase_ == 5;
    }

    public static bb newBuilder(bd bdVar) {
        return (bb) DEFAULT_INSTANCE.createBuilder(bdVar);
    }

    public static bd parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(com.google.v.v vVar, de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bd parseFrom(com.google.v.z zVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bd parseFrom(com.google.v.z zVar, de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bd parseFrom(InputStream inputStream) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(InputStream inputStream, de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(ByteBuffer byteBuffer) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bd parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bd parseFrom(byte[] bArr) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bd parseFrom(byte[] bArr, de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
