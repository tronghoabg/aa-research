package com.google.o.a.a;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends dq<e, d> implements fj {
    public static final int BOOL_VALUE_FIELD_NUMBER = 8;
    public static final int BYTES_VALUE_FIELD_NUMBER = 12;
    private static final e DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 1;
    public static final int FIXED32_VALUE_FIELD_NUMBER = 7;
    public static final int FIXED64_VALUE_FIELD_NUMBER = 6;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 2;
    public static final int INT32_VALUE_FIELD_NUMBER = 5;
    public static final int INT64_VALUE_FIELD_NUMBER = 3;
    private static volatile fo<e> PARSER = null;
    public static final int SFIXED32_VALUE_FIELD_NUMBER = 15;
    public static final int SFIXED64_VALUE_FIELD_NUMBER = 16;
    public static final int SINT32_VALUE_FIELD_NUMBER = 17;
    public static final int SINT64_VALUE_FIELD_NUMBER = 18;
    public static final int STRING_VALUE_FIELD_NUMBER = 9;
    public static final int UINT32_VALUE_FIELD_NUMBER = 13;
    public static final int UINT64_VALUE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean boolValue_;
    private double doubleValue_;
    private int fixed32Value_;
    private long fixed64Value_;
    private float floatValue_;
    private int int32Value_;
    private long int64Value_;
    private int sfixed32Value_;
    private long sfixed64Value_;
    private int sint32Value_;
    private long sint64Value_;
    private int uint32Value_;
    private long uint64Value_;
    private byte memoizedIsInitialized = 2;
    private String stringValue_ = "";
    private v bytesValue_ = v.f13054a;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        this.bitField0_ &= -129;
        this.boolValue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesValue() {
        this.bitField0_ &= -513;
        this.bytesValue_ = getDefaultInstance().getBytesValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.bitField0_ &= -2;
        this.doubleValue_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFixed32Value() {
        this.bitField0_ &= -65;
        this.fixed32Value_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFixed64Value() {
        this.bitField0_ &= -33;
        this.fixed64Value_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloatValue() {
        this.bitField0_ &= -3;
        this.floatValue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInt32Value() {
        this.bitField0_ &= -17;
        this.int32Value_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInt64Value() {
        this.bitField0_ &= -5;
        this.int64Value_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSfixed32Value() {
        this.bitField0_ &= -2049;
        this.sfixed32Value_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSfixed64Value() {
        this.bitField0_ &= -4097;
        this.sfixed64Value_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSint32Value() {
        this.bitField0_ &= -8193;
        this.sint32Value_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSint64Value() {
        this.bitField0_ &= -16385;
        this.sint64Value_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -257;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUint32Value() {
        this.bitField0_ &= -1025;
        this.uint32Value_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUint64Value() {
        this.bitField0_ &= -9;
        this.uint64Value_ = 0L;
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.bitField0_ |= 128;
        this.boolValue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesValue(v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 512;
        this.bytesValue_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d2) {
        this.bitField0_ |= 1;
        this.doubleValue_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixed32Value(int i2) {
        this.bitField0_ |= 64;
        this.fixed32Value_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixed64Value(long j2) {
        this.bitField0_ |= 32;
        this.fixed64Value_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatValue(float f2) {
        this.bitField0_ |= 2;
        this.floatValue_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInt32Value(int i2) {
        this.bitField0_ |= 16;
        this.int32Value_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInt64Value(long j2) {
        this.bitField0_ |= 4;
        this.int64Value_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSfixed32Value(int i2) {
        this.bitField0_ |= 2048;
        this.sfixed32Value_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSfixed64Value(long j2) {
        this.bitField0_ |= 4096;
        this.sfixed64Value_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSint32Value(int i2) {
        this.bitField0_ |= 8192;
        this.sint32Value_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSint64Value(long j2) {
        this.bitField0_ |= 16384;
        this.sint64Value_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.stringValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(v vVar) {
        this.stringValue_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUint32Value(int i2) {
        this.bitField0_ |= 1024;
        this.uint32Value_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUint64Value(long j2) {
        this.bitField0_ |= 8;
        this.uint64Value_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u0012\u000f\u0000\u0000\u0000\u0001က\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဃ\u0003\u0005င\u0004\u0006စ\u0005\u0007ဆ\u0006\bဇ\u0007\tဈ\b\fည\t\rဋ\n\u000fဍ\u000b\u0010ဎ\f\u0011ဏ\r\u0012တ\u000e", new Object[]{"bitField0_", "doubleValue_", "floatValue_", "int64Value_", "uint64Value_", "int32Value_", "fixed64Value_", "fixed32Value_", "boolValue_", "stringValue_", "bytesValue_", "uint32Value_", "sfixed32Value_", "sfixed64Value_", "sint32Value_", "sint64Value_"});
            case 3:
                return new e();
            case 4:
                return new d(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<e> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (e.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getBoolValue() {
        return this.boolValue_;
    }

    public v getBytesValue() {
        return this.bytesValue_;
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public int getFixed32Value() {
        return this.fixed32Value_;
    }

    public long getFixed64Value() {
        return this.fixed64Value_;
    }

    public float getFloatValue() {
        return this.floatValue_;
    }

    public int getInt32Value() {
        return this.int32Value_;
    }

    public long getInt64Value() {
        return this.int64Value_;
    }

    public int getSfixed32Value() {
        return this.sfixed32Value_;
    }

    public long getSfixed64Value() {
        return this.sfixed64Value_;
    }

    public int getSint32Value() {
        return this.sint32Value_;
    }

    public long getSint64Value() {
        return this.sint64Value_;
    }

    public String getStringValue() {
        return this.stringValue_;
    }

    public v getStringValueBytes() {
        return v.s(this.stringValue_);
    }

    public int getUint32Value() {
        return this.uint32Value_;
    }

    public long getUint64Value() {
        return this.uint64Value_;
    }

    public boolean hasBoolValue() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasBytesValue() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasDoubleValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFixed32Value() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFixed64Value() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFloatValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInt32Value() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasInt64Value() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSfixed32Value() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSfixed64Value() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSint32Value() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasSint64Value() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasStringValue() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasUint32Value() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasUint64Value() {
        return (this.bitField0_ & 8) != 0;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
