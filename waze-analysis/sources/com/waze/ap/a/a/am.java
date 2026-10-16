package com.waze.ap.a.a;

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
/* loaded from: classes6.dex */
public final class am extends du<am, ak> implements fj {
    private static final am DEFAULT_INSTANCE;
    public static final int INSIGHT_TRIGGER_FIELD_NUMBER = 1;
    private static volatile fo<am> PARSER;
    private int triggerTypeCase_ = 0;
    private Object triggerType_;

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightTrigger() {
        if (this.triggerTypeCase_ == 1) {
            this.triggerTypeCase_ = 0;
            this.triggerType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerType() {
        this.triggerTypeCase_ = 0;
        this.triggerType_ = null;
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightTrigger(af afVar) {
        Objects.requireNonNull(afVar);
        if (this.triggerTypeCase_ == 1 && this.triggerType_ != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder((af) this.triggerType_);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.triggerType_ = afVar;
        this.triggerTypeCase_ = 1;
    }

    public static ak newBuilder() {
        return (ak) DEFAULT_INSTANCE.createBuilder();
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
    public void setInsightTrigger(af afVar) {
        Objects.requireNonNull(afVar);
        this.triggerType_ = afVar;
        this.triggerTypeCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"triggerType_", "triggerTypeCase_", af.class});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ak(bArr);
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

    public af getInsightTrigger() {
        return this.triggerTypeCase_ == 1 ? (af) this.triggerType_ : af.getDefaultInstance();
    }

    public al getTriggerTypeCase() {
        int i2 = this.triggerTypeCase_;
        if (i2 == 0) {
            return al.f14931b;
        }
        if (i2 != 1) {
            return null;
        }
        return al.f14930a;
    }

    public boolean hasInsightTrigger() {
        return this.triggerTypeCase_ == 1;
    }

    public static ak newBuilder(am amVar) {
        return (ak) DEFAULT_INSTANCE.createBuilder(amVar);
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
