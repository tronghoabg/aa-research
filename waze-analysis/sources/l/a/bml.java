package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bml extends com.google.v.du<bml, bmk> implements com.google.v.fj {
    public static final int ABBREVIATED_TEXT_FIELD_NUMBER = 2;
    private static final bml DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bml> PARSER = null;
    public static final int PRE_ABBREVIATED_TEXT_FIELD_NUMBER = 1;
    private com.google.v.eo<String> preAbbreviatedText_ = emptyProtobufList();
    private com.google.v.eo<String> abbreviatedText_ = emptyProtobufList();

    static {
        bml bmlVar = new bml();
        DEFAULT_INSTANCE = bmlVar;
        com.google.v.du.registerDefaultInstance(bml.class, bmlVar);
    }

    private bml() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbbreviatedText(String str) {
        Objects.requireNonNull(str);
        ensureAbbreviatedTextIsMutable();
        this.abbreviatedText_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbbreviatedTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureAbbreviatedTextIsMutable();
        this.abbreviatedText_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAbbreviatedText(Iterable<String> iterable) {
        ensureAbbreviatedTextIsMutable();
        com.google.v.c.addAll(iterable, this.abbreviatedText_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreAbbreviatedText(Iterable<String> iterable) {
        ensurePreAbbreviatedTextIsMutable();
        com.google.v.c.addAll(iterable, this.preAbbreviatedText_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreAbbreviatedText(String str) {
        Objects.requireNonNull(str);
        ensurePreAbbreviatedTextIsMutable();
        this.preAbbreviatedText_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreAbbreviatedTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        ensurePreAbbreviatedTextIsMutable();
        this.preAbbreviatedText_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbbreviatedText() {
        this.abbreviatedText_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreAbbreviatedText() {
        this.preAbbreviatedText_ = emptyProtobufList();
    }

    private void ensureAbbreviatedTextIsMutable() {
        com.google.v.eo<String> eoVar = this.abbreviatedText_;
        if (eoVar.c()) {
            return;
        }
        this.abbreviatedText_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePreAbbreviatedTextIsMutable() {
        com.google.v.eo<String> eoVar = this.preAbbreviatedText_;
        if (eoVar.c()) {
            return;
        }
        this.preAbbreviatedText_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bml getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bmk newBuilder() {
        return (bmk) DEFAULT_INSTANCE.createBuilder();
    }

    public static bml parseDelimitedFrom(InputStream inputStream) {
        return (bml) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bml parseFrom(com.google.v.v vVar) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bml> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbbreviatedText(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAbbreviatedTextIsMutable();
        this.abbreviatedText_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreAbbreviatedText(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePreAbbreviatedTextIsMutable();
        this.preAbbreviatedText_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"preAbbreviatedText_", "abbreviatedText_"});
        }
        if (iOrdinal == 3) {
            return new bml();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bml> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bml.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAbbreviatedText(int i2) {
        return this.abbreviatedText_.get(i2);
    }

    public com.google.v.v getAbbreviatedTextBytes(int i2) {
        return com.google.v.v.s(this.abbreviatedText_.get(i2));
    }

    public int getAbbreviatedTextCount() {
        return this.abbreviatedText_.size();
    }

    public List<String> getAbbreviatedTextList() {
        return this.abbreviatedText_;
    }

    public String getPreAbbreviatedText(int i2) {
        return this.preAbbreviatedText_.get(i2);
    }

    public com.google.v.v getPreAbbreviatedTextBytes(int i2) {
        return com.google.v.v.s(this.preAbbreviatedText_.get(i2));
    }

    public int getPreAbbreviatedTextCount() {
        return this.preAbbreviatedText_.size();
    }

    public List<String> getPreAbbreviatedTextList() {
        return this.preAbbreviatedText_;
    }

    public static bmk newBuilder(bml bmlVar) {
        return (bmk) DEFAULT_INSTANCE.createBuilder(bmlVar);
    }

    public static bml parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bml) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bml parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bml parseFrom(com.google.v.z zVar) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bml parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bml parseFrom(InputStream inputStream) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bml parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bml parseFrom(ByteBuffer byteBuffer) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bml parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bml parseFrom(byte[] bArr) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bml parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
