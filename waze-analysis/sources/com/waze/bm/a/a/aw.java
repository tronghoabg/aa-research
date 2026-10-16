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
public final class aw extends du<aw, aq> implements fj {
    private static final aw DEFAULT_INSTANCE;
    public static final int FTE_FIELD_NUMBER = 1;
    private static volatile fo<aw> PARSER = null;
    public static final int USER_INITIATED_FIELD_NUMBER = 2;
    private int triggerCase_ = 0;
    private Object trigger_;

    static {
        aw awVar = new aw();
        DEFAULT_INSTANCE = awVar;
        du.registerDefaultInstance(aw.class, awVar);
    }

    private aw() {
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
    public void clearUserInitiated() {
        if (this.triggerCase_ == 2) {
            this.triggerCase_ = 0;
            this.trigger_ = null;
        }
    }

    public static aw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFte(as asVar) {
        Objects.requireNonNull(asVar);
        if (this.triggerCase_ == 1 && this.trigger_ != as.getDefaultInstance()) {
            ar arVarNewBuilder = as.newBuilder((as) this.trigger_);
            arVarNewBuilder.mergeFrom((ar) asVar);
            asVar = arVarNewBuilder.buildPartial();
        }
        this.trigger_ = asVar;
        this.triggerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInitiated(av avVar) {
        Objects.requireNonNull(avVar);
        if (this.triggerCase_ == 2 && this.trigger_ != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder((av) this.trigger_);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.trigger_ = avVar;
        this.triggerCase_ = 2;
    }

    public static aq newBuilder() {
        return (aq) DEFAULT_INSTANCE.createBuilder();
    }

    public static aw parseDelimitedFrom(InputStream inputStream) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(com.google.v.v vVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFte(as asVar) {
        Objects.requireNonNull(asVar);
        this.trigger_ = asVar;
        this.triggerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInitiated(av avVar) {
        Objects.requireNonNull(avVar);
        this.trigger_ = avVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"trigger_", "triggerCase_", as.class, av.class});
        }
        if (iOrdinal == 3) {
            return new aw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aq(bArr);
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

    public as getFte() {
        return this.triggerCase_ == 1 ? (as) this.trigger_ : as.getDefaultInstance();
    }

    public at getTriggerCase() {
        int i2 = this.triggerCase_;
        if (i2 == 0) {
            return at.f17128c;
        }
        if (i2 == 1) {
            return at.f17126a;
        }
        if (i2 != 2) {
            return null;
        }
        return at.f17127b;
    }

    public av getUserInitiated() {
        return this.triggerCase_ == 2 ? (av) this.trigger_ : av.getDefaultInstance();
    }

    public boolean hasFte() {
        return this.triggerCase_ == 1;
    }

    public boolean hasUserInitiated() {
        return this.triggerCase_ == 2;
    }

    public static aq newBuilder(aw awVar) {
        return (aq) DEFAULT_INSTANCE.createBuilder(awVar);
    }

    public static aw parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(com.google.v.v vVar, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aw parseFrom(com.google.v.z zVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aw parseFrom(com.google.v.z zVar, de deVar) {
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
