package com.waze.bg.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v extends du<v, u> implements fj {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final v DEFAULT_INSTANCE;
    public static final int GENDER_FIELD_NUMBER = 6;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 5;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile fo<v> PARSER;
    private int bitField0_;
    private h message_;
    private String conversationId_ = "";
    private String languageCode_ = "";
    private int gender_ = 1;

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        du.registerDefaultInstance(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationId() {
        this.bitField0_ &= -3;
        this.conversationId_ = getDefaultInstance().getConversationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGender() {
        this.bitField0_ &= -9;
        this.gender_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.bitField0_ &= -5;
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = null;
        this.bitField0_ &= -2;
    }

    public static v getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessage(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.message_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            f fVarNewBuilder = h.newBuilder(hVar2);
            fVarNewBuilder.mergeFrom((f) hVar);
            hVar = fVarNewBuilder.buildPartial();
        }
        this.message_ = hVar;
        this.bitField0_ |= 1;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static v parseDelimitedFrom(InputStream inputStream) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(com.google.v.v vVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<v> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.conversationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationIdBytes(com.google.v.v vVar) {
        this.conversationId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGender(e eVar) {
        this.gender_ = eVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(com.google.v.v vVar) {
        this.languageCode_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(h hVar) {
        Objects.requireNonNull(hVar);
        this.message_ = hVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0005ဈ\u0002\u0006᠌\u0003", new Object[]{"bitField0_", "message_", "conversationId_", "languageCode_", "gender_", d.f16338a});
        }
        if (iOrdinal == 3) {
            return new v();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new u(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<v> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (v.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getConversationId() {
        return this.conversationId_;
    }

    public com.google.v.v getConversationIdBytes() {
        return com.google.v.v.s(this.conversationId_);
    }

    public e getGender() {
        e eVarA = e.a(this.gender_);
        return eVarA == null ? e.GENDER_MALE : eVarA;
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public com.google.v.v getLanguageCodeBytes() {
        return com.google.v.v.s(this.languageCode_);
    }

    public h getMessage() {
        h hVar = this.message_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public boolean hasConversationId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGender() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLanguageCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static u newBuilder(v vVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(vVar);
    }

    public static v parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(com.google.v.v vVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static v parseFrom(z zVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static v parseFrom(z zVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static v parseFrom(InputStream inputStream) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(InputStream inputStream, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(ByteBuffer byteBuffer) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static v parseFrom(byte[] bArr) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static v parseFrom(byte[] bArr, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
