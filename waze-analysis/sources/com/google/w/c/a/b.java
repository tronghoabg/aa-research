package com.google.w.c.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends dq<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    public static final int ENCODING_VERSION_FIELD_NUMBER = 3;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 130046566;
    public static final int NUM_VALUES_FIELD_NUMBER = 2;
    private static volatile fo<b> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    public static final ds<com.google.w.n.a.b, b> messageSetExtension;
    private int bitField0_;
    private long numValues_;
    private int type_;
    private int valueType_;
    private byte memoizedIsInitialized = 2;
    private int encodingVersion_ = 1;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, b.class);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncodingVersion() {
        this.bitField0_ &= -5;
        this.encodingVersion_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumValues() {
        this.bitField0_ &= -3;
        this.numValues_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.bitField0_ &= -9;
        this.valueType_ = 0;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncodingVersion(int i2) {
        this.bitField0_ |= 4;
        this.encodingVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumValues(long j2) {
        this.bitField0_ |= 2;
        this.numValues_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(c cVar) {
        this.type_ = cVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(int i2) {
        this.bitField0_ |= 8;
        this.valueType_ = i2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔂ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "type_", f.f13182b, "numValues_", "encodingVersion_", "valueType_"});
            case 3:
                return new b();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<b> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (b.class) {
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

    public int getEncodingVersion() {
        return this.encodingVersion_;
    }

    public long getNumValues() {
        return this.numValues_;
    }

    public c getType() {
        c cVarA = c.a(this.type_);
        return cVarA == null ? c.AGGREGATOR_TYPE_UNSPECIFIED : cVarA;
    }

    public int getValueType() {
        return this.valueType_;
    }

    public boolean hasEncodingVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNumValues() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValueType() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
