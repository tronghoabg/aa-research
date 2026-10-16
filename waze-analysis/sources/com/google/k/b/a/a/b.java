package com.google.k.b.a.a;

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
public final class b extends du<b, a> implements c {
    public static final int ATTACHMENT_ID_FIELD_NUMBER = 4;
    public static final int CLIENT_NAME_SPACE_FIELD_NUMBER = 5;
    public static final int COMMENT_FIELD_NUMBER = 2;
    private static final b DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile fo<b> PARSER = null;
    public static final int TYPE_ID_FIELD_NUMBER = 3;
    private long attachmentId_;
    private int bitField0_;
    private com.google.w.n.a.b messages_;
    private long typeId_;
    private byte memoizedIsInitialized = 2;
    private String comment_ = "";
    private String clientNameSpace_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttachmentId() {
        this.bitField0_ &= -9;
        this.attachmentId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientNameSpace() {
        this.bitField0_ &= -17;
        this.clientNameSpace_ = getDefaultInstance().getClientNameSpace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComment() {
        this.bitField0_ &= -3;
        this.comment_ = getDefaultInstance().getComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessages() {
        this.messages_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeId() {
        this.bitField0_ &= -5;
        this.typeId_ = 0L;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessages(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.messages_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.messages_ = bVar;
        this.bitField0_ |= 1;
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
    public void setAttachmentId(long j2) {
        this.bitField0_ |= 8;
        this.attachmentId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNameSpace(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.clientNameSpace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNameSpaceBytes(v vVar) {
        this.clientNameSpace_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.comment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentBytes(v vVar) {
        this.comment_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessages(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.messages_ = bVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeId(long j2) {
        this.bitField0_ |= 4;
        this.typeId_ = j2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "messages_", "comment_", "typeId_", "attachmentId_", "clientNameSpace_"});
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

    public long getAttachmentId() {
        return this.attachmentId_;
    }

    public String getClientNameSpace() {
        return this.clientNameSpace_;
    }

    public v getClientNameSpaceBytes() {
        return v.s(this.clientNameSpace_);
    }

    @Deprecated
    public String getComment() {
        return this.comment_;
    }

    @Deprecated
    public v getCommentBytes() {
        return v.s(this.comment_);
    }

    public com.google.w.n.a.b getMessages() {
        com.google.w.n.a.b bVar = this.messages_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public long getTypeId() {
        return this.typeId_;
    }

    public boolean hasAttachmentId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasClientNameSpace() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasComment() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMessages() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 4) != 0;
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
