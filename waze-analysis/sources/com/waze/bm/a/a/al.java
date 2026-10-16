package com.waze.bm.a.a;

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
public final class al extends du<al, aj> implements fj {
    public static final int ACTION_FIELD_NUMBER = 103;
    private static final al DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 101;
    public static final int END_CONVERSATION_FIELD_NUMBER = 102;
    private static volatile fo<al> PARSER = null;
    public static final int PLAY_SOUND_FIELD_NUMBER = 100;
    private int responseCase_ = 0;
    private Object response_;

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        du.registerDefaultInstance(al.class, alVar);
    }

    private al() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        if (this.responseCase_ == 103) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayText() {
        if (this.responseCase_ == 101) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndConversation() {
        if (this.responseCase_ == 102) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaySound() {
        if (this.responseCase_ == 100) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    public static al getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAction(c cVar) {
        Objects.requireNonNull(cVar);
        if (this.responseCase_ == 103 && this.response_ != c.getDefaultInstance()) {
            b bVarNewBuilder = c.newBuilder((c) this.response_);
            bVarNewBuilder.mergeFrom((b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.response_ = cVar;
        this.responseCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayText(com.waze.u.a.i iVar) {
        Objects.requireNonNull(iVar);
        if (this.responseCase_ == 101 && this.response_ != com.waze.u.a.i.getDefaultInstance()) {
            com.waze.u.a.h hVarNewBuilder = com.waze.u.a.i.newBuilder((com.waze.u.a.i) this.response_);
            hVarNewBuilder.mergeFrom((com.waze.u.a.h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.response_ = iVar;
        this.responseCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndConversation(com.waze.u.a.k kVar) {
        Objects.requireNonNull(kVar);
        if (this.responseCase_ == 102 && this.response_ != com.waze.u.a.k.getDefaultInstance()) {
            com.waze.u.a.j jVarNewBuilder = com.waze.u.a.k.newBuilder((com.waze.u.a.k) this.response_);
            jVarNewBuilder.mergeFrom((com.waze.u.a.j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.response_ = kVar;
        this.responseCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaySound(com.waze.u.a.m mVar) {
        Objects.requireNonNull(mVar);
        if (this.responseCase_ == 100 && this.response_ != com.waze.u.a.m.getDefaultInstance()) {
            com.waze.u.a.l lVarNewBuilder = com.waze.u.a.m.newBuilder((com.waze.u.a.m) this.response_);
            lVarNewBuilder.mergeFrom((com.waze.u.a.l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.response_ = mVar;
        this.responseCase_ = 100;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static al parseDelimitedFrom(InputStream inputStream) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(com.google.v.v vVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<al> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(c cVar) {
        Objects.requireNonNull(cVar);
        this.response_ = cVar;
        this.responseCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayText(com.waze.u.a.i iVar) {
        Objects.requireNonNull(iVar);
        this.response_ = iVar;
        this.responseCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndConversation(com.waze.u.a.k kVar) {
        Objects.requireNonNull(kVar);
        this.response_ = kVar;
        this.responseCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaySound(com.waze.u.a.m mVar) {
        Objects.requireNonNull(mVar);
        this.response_ = mVar;
        this.responseCase_ = 100;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0000dg\u0004\u0000\u0000\u0000d<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"response_", "responseCase_", com.waze.u.a.m.class, com.waze.u.a.i.class, com.waze.u.a.k.class, c.class});
        }
        if (iOrdinal == 3) {
            return new al();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<al> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (al.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getAction() {
        return this.responseCase_ == 103 ? (c) this.response_ : c.getDefaultInstance();
    }

    public com.waze.u.a.i getDisplayText() {
        return this.responseCase_ == 101 ? (com.waze.u.a.i) this.response_ : com.waze.u.a.i.getDefaultInstance();
    }

    public com.waze.u.a.k getEndConversation() {
        return this.responseCase_ == 102 ? (com.waze.u.a.k) this.response_ : com.waze.u.a.k.getDefaultInstance();
    }

    public com.waze.u.a.m getPlaySound() {
        return this.responseCase_ == 100 ? (com.waze.u.a.m) this.response_ : com.waze.u.a.m.getDefaultInstance();
    }

    public ak getResponseCase() {
        int i2 = this.responseCase_;
        if (i2 == 0) {
            return ak.f17124e;
        }
        switch (i2) {
            case 100:
                return ak.f17120a;
            case 101:
                return ak.f17121b;
            case 102:
                return ak.f17122c;
            case 103:
                return ak.f17123d;
            default:
                return null;
        }
    }

    public boolean hasAction() {
        return this.responseCase_ == 103;
    }

    public boolean hasDisplayText() {
        return this.responseCase_ == 101;
    }

    public boolean hasEndConversation() {
        return this.responseCase_ == 102;
    }

    public boolean hasPlaySound() {
        return this.responseCase_ == 100;
    }

    public static aj newBuilder(al alVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(alVar);
    }

    public static al parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(com.google.v.v vVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static al parseFrom(com.google.v.z zVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static al parseFrom(com.google.v.z zVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static al parseFrom(InputStream inputStream) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(InputStream inputStream, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(ByteBuffer byteBuffer) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static al parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static al parseFrom(byte[] bArr) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static al parseFrom(byte[] bArr, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
