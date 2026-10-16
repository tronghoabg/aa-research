package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aw extends du<aw, av> implements fj {
    private static final aw DEFAULT_INSTANCE;
    public static final int FULL_NAME_FIELD_NUMBER = 4;
    public static final int IS_REPEATED_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<aw> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isRepeated_;
    private String name_ = "";
    private String type_ = "";
    private String fullName_ = "";

    static {
        aw awVar = new aw();
        DEFAULT_INSTANCE = awVar;
        du.registerDefaultInstance(aw.class, awVar);
    }

    private aw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullName() {
        this.bitField0_ &= -9;
        this.fullName_ = getDefaultInstance().getFullName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRepeated() {
        this.bitField0_ &= -5;
        this.isRepeated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = getDefaultInstance().getType();
    }

    public static aw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static av newBuilder() {
        return (av) DEFAULT_INSTANCE.createBuilder();
    }

    public static aw parseDelimitedFrom(InputStream inputStream) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(v vVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.fullName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullNameBytes(v vVar) {
        this.fullName_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRepeated(boolean z) {
        this.bitField0_ |= 4;
        this.isRepeated_ = z;
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
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(v vVar) {
        this.type_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "name_", "type_", "isRepeated_", "fullName_"});
        }
        if (iOrdinal == 3) {
            return new aw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new av(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aw.class) {
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

    public boolean getIsRepeated() {
        return this.isRepeated_;
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public String getType() {
        return this.type_;
    }

    public v getTypeBytes() {
        return v.s(this.type_);
    }

    public boolean hasFullName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsRepeated() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static av newBuilder(aw awVar) {
        return (av) DEFAULT_INSTANCE.createBuilder(awVar);
    }

    public static aw parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(v vVar, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aw parseFrom(z zVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aw parseFrom(z zVar, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aw parseFrom(InputStream inputStream) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(InputStream inputStream, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(ByteBuffer byteBuffer) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aw parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aw parseFrom(byte[] bArr) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aw parseFrom(byte[] bArr, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
