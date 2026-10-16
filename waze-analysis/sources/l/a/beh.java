package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class beh extends com.google.v.du<beh, beb> implements com.google.v.fj {
    private static final beh DEFAULT_INSTANCE;
    public static final int NON_PARAMETERIZED_PHRASE_INFO_FIELD_NUMBER = 2;
    public static final int PARAMETERIZED_PHRASE_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<beh> PARSER = null;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 1;
    private Object phraseInfo_;
    private int phraseInfoCase_ = 0;
    private String ugcContextId_ = "";

    static {
        beh behVar = new beh();
        DEFAULT_INSTANCE = behVar;
        com.google.v.du.registerDefaultInstance(beh.class, behVar);
    }

    private beh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonParameterizedPhraseInfo() {
        if (this.phraseInfoCase_ == 2) {
            this.phraseInfoCase_ = 0;
            this.phraseInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameterizedPhraseInfo() {
        if (this.phraseInfoCase_ == 3) {
            this.phraseInfoCase_ = 0;
            this.phraseInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhraseInfo() {
        this.phraseInfoCase_ = 0;
        this.phraseInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    public static beh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNonParameterizedPhraseInfo(bed bedVar) {
        Objects.requireNonNull(bedVar);
        if (this.phraseInfoCase_ == 2 && this.phraseInfo_ != bed.getDefaultInstance()) {
            bec becVarNewBuilder = bed.newBuilder((bed) this.phraseInfo_);
            becVarNewBuilder.mergeFrom((bec) bedVar);
            bedVar = becVarNewBuilder.buildPartial();
        }
        this.phraseInfo_ = bedVar;
        this.phraseInfoCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParameterizedPhraseInfo(bef befVar) {
        Objects.requireNonNull(befVar);
        if (this.phraseInfoCase_ == 3 && this.phraseInfo_ != bef.getDefaultInstance()) {
            bee beeVarNewBuilder = bef.newBuilder((bef) this.phraseInfo_);
            beeVarNewBuilder.mergeFrom((bee) befVar);
            befVar = beeVarNewBuilder.buildPartial();
        }
        this.phraseInfo_ = befVar;
        this.phraseInfoCase_ = 3;
    }

    public static beb newBuilder() {
        return (beb) DEFAULT_INSTANCE.createBuilder();
    }

    public static beh parseDelimitedFrom(InputStream inputStream) {
        return (beh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static beh parseFrom(com.google.v.v vVar) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<beh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonParameterizedPhraseInfo(bed bedVar) {
        Objects.requireNonNull(bedVar);
        this.phraseInfo_ = bedVar;
        this.phraseInfoCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameterizedPhraseInfo(bef befVar) {
        Objects.requireNonNull(befVar);
        this.phraseInfo_ = befVar;
        this.phraseInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"phraseInfo_", "phraseInfoCase_", "ugcContextId_", bed.class, bef.class});
        }
        if (iOrdinal == 3) {
            return new beh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new beb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<beh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (beh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bed getNonParameterizedPhraseInfo() {
        return this.phraseInfoCase_ == 2 ? (bed) this.phraseInfo_ : bed.getDefaultInstance();
    }

    public bef getParameterizedPhraseInfo() {
        return this.phraseInfoCase_ == 3 ? (bef) this.phraseInfo_ : bef.getDefaultInstance();
    }

    public beg getPhraseInfoCase() {
        int i2 = this.phraseInfoCase_;
        if (i2 == 0) {
            return beg.f53803c;
        }
        if (i2 == 2) {
            return beg.f53801a;
        }
        if (i2 != 3) {
            return null;
        }
        return beg.f53802b;
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public boolean hasNonParameterizedPhraseInfo() {
        return this.phraseInfoCase_ == 2;
    }

    public boolean hasParameterizedPhraseInfo() {
        return this.phraseInfoCase_ == 3;
    }

    public static beb newBuilder(beh behVar) {
        return (beb) DEFAULT_INSTANCE.createBuilder(behVar);
    }

    public static beh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (beh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static beh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static beh parseFrom(com.google.v.z zVar) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static beh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static beh parseFrom(InputStream inputStream) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static beh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static beh parseFrom(ByteBuffer byteBuffer) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static beh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static beh parseFrom(byte[] bArr) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static beh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (beh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
