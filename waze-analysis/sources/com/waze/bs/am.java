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
public final class am extends du<am, ai> implements fj {
    private static final am DEFAULT_INSTANCE;
    public static final int FTE_FIELD_NUMBER = 1;
    private static volatile fo<am> PARSER = null;
    public static final int USER_PROMPT_FIELD_NUMBER = 2;
    private int triggerCase_ = 0;
    private Object trigger_;

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFte() {
        if (this.triggerCase_ == 1) {
            this.triggerCase_ = 0;
            this.trigger_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrigger() {
        this.triggerCase_ = 0;
        this.trigger_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPrompt() {
        if (this.triggerCase_ == 2) {
            this.triggerCase_ = 0;
            this.trigger_ = null;
        }
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFte(ak akVar) {
        Objects.requireNonNull(akVar);
        if (this.triggerCase_ == 1 && this.trigger_ != ak.getDefaultInstance()) {
            aj ajVarNewBuilder = ak.newBuilder((ak) this.trigger_);
            ajVarNewBuilder.mergeFrom((aj) akVar);
            akVar = ajVarNewBuilder.buildPartial();
        }
        this.trigger_ = akVar;
        this.triggerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPrompt(com.waze.u.a.s sVar) {
        Objects.requireNonNull(sVar);
        if (this.triggerCase_ == 2 && this.trigger_ != com.waze.u.a.s.getDefaultInstance()) {
            com.waze.u.a.n nVarNewBuilder = com.waze.u.a.s.newBuilder((com.waze.u.a.s) this.trigger_);
            nVarNewBuilder.mergeFrom((com.waze.u.a.n) sVar);
            sVar = nVarNewBuilder.buildPartial();
        }
        this.trigger_ = sVar;
        this.triggerCase_ = 2;
    }

    public static ai newBuilder() {
        return (ai) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFte(ak akVar) {
        Objects.requireNonNull(akVar);
        this.trigger_ = akVar;
        this.triggerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPrompt(com.waze.u.a.s sVar) {
        Objects.requireNonNull(sVar);
        this.trigger_ = sVar;
        this.triggerCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"trigger_", "triggerCase_", ak.class, com.waze.u.a.s.class});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ai(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ak getFte() {
        return this.triggerCase_ == 1 ? (ak) this.trigger_ : ak.getDefaultInstance();
    }

    public al getTriggerCase() {
        int i2 = this.triggerCase_;
        if (i2 == 0) {
            return al.f17431c;
        }
        if (i2 == 1) {
            return al.f17429a;
        }
        if (i2 != 2) {
            return null;
        }
        return al.f17430b;
    }

    public com.waze.u.a.s getUserPrompt() {
        return this.triggerCase_ == 2 ? (com.waze.u.a.s) this.trigger_ : com.waze.u.a.s.getDefaultInstance();
    }

    public boolean hasFte() {
        return this.triggerCase_ == 1;
    }

    public boolean hasUserPrompt() {
        return this.triggerCase_ == 2;
    }

    public static ai newBuilder(am amVar) {
        return (ai) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
