package com.waze.u.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends du<s, n> implements fj {
    private static final s DEFAULT_INSTANCE;
    private static volatile fo<s> PARSER = null;
    public static final int SPEECH_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int promptCase_ = 0;
    private Object prompt_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.promptCase_ = 0;
        this.prompt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeech() {
        if (this.promptCase_ == 2) {
            this.promptCase_ = 0;
            this.prompt_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        if (this.promptCase_ == 1) {
            this.promptCase_ = 0;
            this.prompt_ = null;
        }
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeech(r rVar) {
        Objects.requireNonNull(rVar);
        if (this.promptCase_ == 2 && this.prompt_ != r.getDefaultInstance()) {
            p pVarNewBuilder = r.newBuilder((r) this.prompt_);
            pVarNewBuilder.mergeFrom((p) rVar);
            rVar = pVarNewBuilder.buildPartial();
        }
        this.prompt_ = rVar;
        this.promptCase_ = 2;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeech(r rVar) {
        Objects.requireNonNull(rVar);
        this.prompt_ = rVar;
        this.promptCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.promptCase_ = 1;
        this.prompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(v vVar) {
        this.prompt_ = vVar.u();
        this.promptCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"prompt_", "promptCase_", r.class});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public o getPromptCase() {
        int i2 = this.promptCase_;
        if (i2 == 0) {
            return o.f41627c;
        }
        if (i2 == 1) {
            return o.f41625a;
        }
        if (i2 != 2) {
            return null;
        }
        return o.f41626b;
    }

    public r getSpeech() {
        return this.promptCase_ == 2 ? (r) this.prompt_ : r.getDefaultInstance();
    }

    public String getText() {
        return this.promptCase_ == 1 ? (String) this.prompt_ : "";
    }

    public v getTextBytes() {
        return v.s(this.promptCase_ == 1 ? (String) this.prompt_ : "");
    }

    public boolean hasSpeech() {
        return this.promptCase_ == 2;
    }

    public boolean hasText() {
        return this.promptCase_ == 1;
    }

    public static n newBuilder(s sVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
