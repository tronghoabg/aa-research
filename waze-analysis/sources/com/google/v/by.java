package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class by extends du<by, bx> implements bz {
    private static final by DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<by> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private String value_ = "";

    static {
        by byVar = new by();
        DEFAULT_INSTANCE = byVar;
        du.registerDefaultInstance(by.class, byVar);
    }

    private by() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = getDefaultInstance().getValue();
    }

    public static by getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bx newBuilder() {
        return (bx) DEFAULT_INSTANCE.createBuilder();
    }

    public static by parseDelimitedFrom(InputStream inputStream) {
        return (by) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static by parseFrom(v vVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<by> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(v vVar) {
        this.value_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", "value_"});
        }
        if (iOrdinal == 3) {
            return new by();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<by> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (by.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public String getValue() {
        return this.value_;
    }

    public v getValueBytes() {
        return v.s(this.value_);
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bx newBuilder(by byVar) {
        return (bx) DEFAULT_INSTANCE.createBuilder(byVar);
    }

    public static by parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (by) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static by parseFrom(v vVar, de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static by parseFrom(z zVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static by parseFrom(z zVar, de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static by parseFrom(InputStream inputStream) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static by parseFrom(InputStream inputStream, de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static by parseFrom(ByteBuffer byteBuffer) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static by parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static by parseFrom(byte[] bArr) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static by parseFrom(byte[] bArr, de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
