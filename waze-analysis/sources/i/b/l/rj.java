package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rj extends com.google.v.du<rj, rh> implements com.google.v.fj {
    private static final rj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<rj> PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    private int hintCase_ = 0;
    private Object hint_;

    static {
        rj rjVar = new rj();
        DEFAULT_INSTANCE = rjVar;
        com.google.v.du.registerDefaultInstance(rj.class, rjVar);
    }

    private rj() {
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

    public static rj getDefaultInstance() {
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

    public static rh newBuilder() {
        return (rh) DEFAULT_INSTANCE.createBuilder();
    }

    public static rj parseDelimitedFrom(InputStream inputStream) {
        return (rj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rj parseFrom(com.google.v.v vVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rj> parser() {
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
            return new rj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ri getHintCase() {
        int i2 = this.hintCase_;
        if (i2 == 0) {
            return ri.f49025b;
        }
        if (i2 != 1) {
            return null;
        }
        return ri.f49024a;
    }

    public mp getPrompt() {
        return this.hintCase_ == 1 ? (mp) this.hint_ : mp.getDefaultInstance();
    }

    public boolean hasPrompt() {
        return this.hintCase_ == 1;
    }

    public static rh newBuilder(rj rjVar) {
        return (rh) DEFAULT_INSTANCE.createBuilder(rjVar);
    }

    public static rj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rj parseFrom(com.google.v.z zVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rj parseFrom(InputStream inputStream) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rj parseFrom(ByteBuffer byteBuffer) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rj parseFrom(byte[] bArr) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
