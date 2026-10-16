package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class at extends du<at, as> implements au {
    private static final at DEFAULT_INSTANCE;
    public static final int FULL_NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile fo<at> PARSER = null;
    public static final int REPEATED_FIELD_NUMBER = 6;
    public static final int RESERVED_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int number_;
    private boolean repeated_;
    private boolean reserved_;
    private String fullName_ = "";
    private String type_ = "";

    static {
        at atVar = new at();
        DEFAULT_INSTANCE = atVar;
        du.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullName() {
        this.bitField0_ &= -3;
        this.fullName_ = getDefaultInstance().getFullName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -2;
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepeated() {
        this.bitField0_ &= -17;
        this.repeated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserved() {
        this.bitField0_ &= -9;
        this.reserved_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -5;
        this.type_ = getDefaultInstance().getType();
    }

    public static at getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static as newBuilder() {
        return (as) DEFAULT_INSTANCE.createBuilder();
    }

    public static at parseDelimitedFrom(InputStream inputStream) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(v vVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<at> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.fullName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullNameBytes(v vVar) {
        this.fullName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i2) {
        this.bitField0_ |= 1;
        this.number_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepeated(boolean z) {
        this.bitField0_ |= 16;
        this.repeated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserved(boolean z) {
        this.bitField0_ |= 8;
        this.reserved_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(v vVar) {
        this.type_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"});
        }
        if (iOrdinal == 3) {
            return new at();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new as(bArr);
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

    public String getFullName() {
        return this.fullName_;
    }

    public v getFullNameBytes() {
        return v.s(this.fullName_);
    }

    public int getNumber() {
        return this.number_;
    }

    public boolean getRepeated() {
        return this.repeated_;
    }

    public boolean getReserved() {
        return this.reserved_;
    }

    public String getType() {
        return this.type_;
    }

    public v getTypeBytes() {
        return v.s(this.type_);
    }

    public boolean hasFullName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRepeated() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasReserved() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static as newBuilder(at atVar) {
        return (as) DEFAULT_INSTANCE.createBuilder(atVar);
    }

    public static at parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(v vVar, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static at parseFrom(z zVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static at parseFrom(z zVar, de deVar) {
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
