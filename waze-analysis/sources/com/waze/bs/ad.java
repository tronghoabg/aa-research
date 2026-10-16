package com.waze.bs;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends du<ad, ac> implements fj {
    public static final int CHAT_CONTEXT_FIELD_NUMBER = 1;
    private static final ad DEFAULT_INSTANCE;
    private static volatile fo<ad> PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    private int bitField0_;
    private d chatContext_;
    private am trigger_;

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatContext() {
        this.chatContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrigger() {
        this.trigger_ = null;
        this.bitField0_ &= -3;
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatContext(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.chatContext_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.chatContext_ = dVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrigger(am amVar) {
        Objects.requireNonNull(amVar);
        am amVar2 = this.trigger_;
        if (amVar2 != null && amVar2 != am.getDefaultInstance()) {
            ai aiVarNewBuilder = am.newBuilder(amVar2);
            aiVarNewBuilder.mergeFrom((ai) amVar);
            amVar = aiVarNewBuilder.buildPartial();
        }
        this.trigger_ = amVar;
        this.bitField0_ |= 2;
    }

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatContext(d dVar) {
        Objects.requireNonNull(dVar);
        this.chatContext_ = dVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrigger(am amVar) {
        Objects.requireNonNull(amVar);
        this.trigger_ = amVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "chatContext_", "trigger_"});
        }
        if (iOrdinal == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public d getChatContext() {
        d dVar = this.chatContext_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public am getTrigger() {
        am amVar = this.trigger_;
        return amVar == null ? am.getDefaultInstance() : amVar;
    }

    public boolean hasChatContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrigger() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
