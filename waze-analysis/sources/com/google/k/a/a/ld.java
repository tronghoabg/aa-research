package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ld extends com.google.v.du<ld, kz> implements le {
    private static final ld DEFAULT_INSTANCE;
    public static final int IS_INVALIDATED_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ld> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int SIGN_ID_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isInvalidated_;
    private lb position_;
    private long signId_;
    private String text_ = "";
    private int type_;

    static {
        ld ldVar = new ld();
        DEFAULT_INSTANCE = ldVar;
        com.google.v.du.registerDefaultInstance(ld.class, ldVar);
    }

    private ld() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInvalidated() {
        this.bitField0_ &= -9;
        this.isInvalidated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignId() {
        this.bitField0_ &= -2;
        this.signId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -17;
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    public static ld getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(lb lbVar) {
        Objects.requireNonNull(lbVar);
        lb lbVar2 = this.position_;
        if (lbVar2 != null && lbVar2 != lb.getDefaultInstance()) {
            la laVarNewBuilder = lb.newBuilder(lbVar2);
            laVarNewBuilder.mergeFrom((la) lbVar);
            lbVar = laVarNewBuilder.buildPartial();
        }
        this.position_ = lbVar;
        this.bitField0_ |= 4;
    }

    public static kz newBuilder() {
        return (kz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ld parseDelimitedFrom(InputStream inputStream) {
        return (ld) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ld parseFrom(com.google.v.v vVar) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ld> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInvalidated(boolean z) {
        this.bitField0_ |= 8;
        this.isInvalidated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(lb lbVar) {
        Objects.requireNonNull(lbVar);
        this.position_ = lbVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignId(long j2) {
        this.bitField0_ |= 1;
        this.signId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        this.text_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(lc lcVar) {
        this.type_ = lcVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "signId_", "type_", ha.t, "position_", "isInvalidated_", "text_"});
        }
        if (iOrdinal == 3) {
            return new ld();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ld> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ld.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsInvalidated() {
        return this.isInvalidated_;
    }

    public lb getPosition() {
        lb lbVar = this.position_;
        return lbVar == null ? lb.getDefaultInstance() : lbVar;
    }

    public long getSignId() {
        return this.signId_;
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public lc getType() {
        lc lcVarA = lc.a(this.type_);
        return lcVarA == null ? lc.UNKNOWN : lcVarA;
    }

    public boolean hasIsInvalidated() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSignId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static kz newBuilder(ld ldVar) {
        return (kz) DEFAULT_INSTANCE.createBuilder(ldVar);
    }

    public static ld parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ld) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ld parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ld parseFrom(com.google.v.z zVar) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ld parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ld parseFrom(InputStream inputStream) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ld parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ld parseFrom(ByteBuffer byteBuffer) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ld parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ld parseFrom(byte[] bArr) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ld parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ld) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
