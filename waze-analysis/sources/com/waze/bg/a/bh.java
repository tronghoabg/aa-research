package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bh extends com.google.v.du<bh, bg> implements fj {
    private static final bh DEFAULT_INSTANCE;
    public static final int FACEBOOK_FULL_NAME_FIELD_NUMBER = 2;
    public static final int MOOD_FIELD_NUMBER = 1;
    private static volatile fo<bh> PARSER = null;
    public static final int USER_PERSISTENT_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int mood_;
    private String facebookFullName_ = "";
    private String userPersistentId_ = "";

    static {
        bh bhVar = new bh();
        DEFAULT_INSTANCE = bhVar;
        com.google.v.du.registerDefaultInstance(bh.class, bhVar);
    }

    private bh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFacebookFullName() {
        this.bitField0_ &= -3;
        this.facebookFullName_ = getDefaultInstance().getFacebookFullName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMood() {
        this.bitField0_ &= -2;
        this.mood_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPersistentId() {
        this.bitField0_ &= -5;
        this.userPersistentId_ = getDefaultInstance().getUserPersistentId();
    }

    public static bh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bg newBuilder() {
        return (bg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bh parseDelimitedFrom(InputStream inputStream) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(com.google.v.v vVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFacebookFullName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.facebookFullName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFacebookFullNameBytes(com.google.v.v vVar) {
        this.facebookFullName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMood(int i2) {
        this.bitField0_ |= 1;
        this.mood_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPersistentId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.userPersistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPersistentIdBytes(com.google.v.v vVar) {
        this.userPersistentId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "mood_", "facebookFullName_", "userPersistentId_"});
        }
        if (iOrdinal == 3) {
            return new bh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getFacebookFullName() {
        return this.facebookFullName_;
    }

    public com.google.v.v getFacebookFullNameBytes() {
        return com.google.v.v.s(this.facebookFullName_);
    }

    public int getMood() {
        return this.mood_;
    }

    public String getUserPersistentId() {
        return this.userPersistentId_;
    }

    public com.google.v.v getUserPersistentIdBytes() {
        return com.google.v.v.s(this.userPersistentId_);
    }

    public boolean hasFacebookFullName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMood() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserPersistentId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bg newBuilder(bh bhVar) {
        return (bg) DEFAULT_INSTANCE.createBuilder(bhVar);
    }

    public static bh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bh parseFrom(com.google.v.z zVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bh parseFrom(InputStream inputStream) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(ByteBuffer byteBuffer) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bh parseFrom(byte[] bArr) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
