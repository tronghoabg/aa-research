package com.google.w.l;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends du<c, b> implements d {
    private static final c DEFAULT_INSTANCE;
    public static final int LOG_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<c> PARSER = null;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String sourceType_ = "";
    private String logType_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogType() {
        this.bitField0_ &= -3;
        this.logType_ = getDefaultInstance().getLogType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceType() {
        this.bitField0_ &= -2;
        this.sourceType_ = getDefaultInstance().getSourceType();
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.logType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogTypeBytes(v vVar) {
        this.logType_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.sourceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceTypeBytes(v vVar) {
        this.sourceType_ = vVar.u();
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"bitField0_", "sourceType_", "logType_"});
            case 3:
                return new c();
            case 4:
                return new b(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<c> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (c.class) {
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

    public String getLogType() {
        return this.logType_;
    }

    public v getLogTypeBytes() {
        return v.s(this.logType_);
    }

    public String getSourceType() {
        return this.sourceType_;
    }

    public v getSourceTypeBytes() {
        return v.s(this.sourceType_);
    }

    public boolean hasLogType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSourceType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
