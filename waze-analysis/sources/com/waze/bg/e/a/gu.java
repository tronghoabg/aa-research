package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gu extends com.google.v.du<gu, gt> implements com.google.v.fj {
    public static final int COMMENT_TEXT_FIELD_NUMBER = 1;
    public static final int COMMENT_VOICE_FIELD_NUMBER = 2;
    private static final gu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gu> PARSER;
    private int bitField0_;
    private String commentText_ = "";
    private String commentVoice_ = "";

    static {
        gu guVar = new gu();
        DEFAULT_INSTANCE = guVar;
        com.google.v.du.registerDefaultInstance(gu.class, guVar);
    }

    private gu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommentText() {
        this.bitField0_ &= -2;
        this.commentText_ = getDefaultInstance().getCommentText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommentVoice() {
        this.bitField0_ &= -3;
        this.commentVoice_ = getDefaultInstance().getCommentVoice();
    }

    public static gu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gt newBuilder() {
        return (gt) DEFAULT_INSTANCE.createBuilder();
    }

    public static gu parseDelimitedFrom(InputStream inputStream) {
        return (gu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gu parseFrom(com.google.v.v vVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.commentText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentTextBytes(com.google.v.v vVar) {
        this.commentText_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentVoice(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.commentVoice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentVoiceBytes(com.google.v.v vVar) {
        this.commentVoice_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "commentText_", "commentVoice_"});
        }
        if (iOrdinal == 3) {
            return new gu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCommentText() {
        return this.commentText_;
    }

    public com.google.v.v getCommentTextBytes() {
        return com.google.v.v.s(this.commentText_);
    }

    public String getCommentVoice() {
        return this.commentVoice_;
    }

    public com.google.v.v getCommentVoiceBytes() {
        return com.google.v.v.s(this.commentVoice_);
    }

    public boolean hasCommentText() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCommentVoice() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gt newBuilder(gu guVar) {
        return (gt) DEFAULT_INSTANCE.createBuilder(guVar);
    }

    public static gu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gu parseFrom(com.google.v.z zVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gu parseFrom(InputStream inputStream) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gu parseFrom(ByteBuffer byteBuffer) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gu parseFrom(byte[] bArr) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
