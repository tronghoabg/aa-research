package com.waze.bg.e.a;

import i.b.l.mn;
import i.b.l.mp;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dx extends com.google.v.du<dx, dv> implements com.google.v.fj {
    private static final dx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dx> PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    private int hintCase_ = 0;
    private Object hint_;

    static {
        dx dxVar = new dx();
        DEFAULT_INSTANCE = dxVar;
        com.google.v.du.registerDefaultInstance(dx.class, dxVar);
    }

    private dx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHint() {
        this.hintCase_ = 0;
        this.hint_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        if (this.hintCase_ == 1) {
            this.hintCase_ = 0;
            this.hint_ = null;
        }
    }

    public static dx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrompt(mp mpVar) {
        Objects.requireNonNull(mpVar);
        if (this.hintCase_ == 1 && this.hint_ != mp.getDefaultInstance()) {
            mn mnVarNewBuilder = mp.newBuilder((mp) this.hint_);
            mnVarNewBuilder.mergeFrom((mn) mpVar);
            mpVar = mnVarNewBuilder.buildPartial();
        }
        this.hint_ = mpVar;
        this.hintCase_ = 1;
    }

    public static dv newBuilder() {
        return (dv) DEFAULT_INSTANCE.createBuilder();
    }

    public static dx parseDelimitedFrom(InputStream inputStream) {
        return (dx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dx parseFrom(com.google.v.v vVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrompt(mp mpVar) {
        Objects.requireNonNull(mpVar);
        this.hint_ = mpVar;
        this.hintCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"hint_", "hintCase_", mp.class});
        }
        if (iOrdinal == 3) {
            return new dx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dw getHintCase() {
        int i2 = this.hintCase_;
        if (i2 == 0) {
            return dw.f16674b;
        }
        if (i2 != 1) {
            return null;
        }
        return dw.f16673a;
    }

    public mp getPrompt() {
        return this.hintCase_ == 1 ? (mp) this.hint_ : mp.getDefaultInstance();
    }

    public boolean hasPrompt() {
        return this.hintCase_ == 1;
    }

    public static dv newBuilder(dx dxVar) {
        return (dv) DEFAULT_INSTANCE.createBuilder(dxVar);
    }

    public static dx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dx parseFrom(com.google.v.z zVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dx parseFrom(InputStream inputStream) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dx parseFrom(ByteBuffer byteBuffer) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dx parseFrom(byte[] bArr) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
