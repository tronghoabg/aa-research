package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gl extends com.google.v.du<gl, gk> implements com.google.v.fj {
    private static final gl DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    public static final int NEW_QUERY_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<gl> PARSER = null;
    public static final int QUERY_CHARACTERS_COUNT_FIELD_NUMBER = 5;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VOICE_SEARCH_FIELD_NUMBER = 4;
    private int bitField0_;
    private long latencyMs_;
    private boolean newQuery_;
    private long queryCharactersCount_;
    private String query_ = "";
    private boolean voiceSearch_;

    static {
        gl glVar = new gl();
        DEFAULT_INSTANCE = glVar;
        com.google.v.du.registerDefaultInstance(gl.class, glVar);
    }

    private gl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewQuery() {
        this.bitField0_ &= -3;
        this.newQuery_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryCharactersCount() {
        this.bitField0_ &= -9;
        this.queryCharactersCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceSearch() {
        this.bitField0_ &= -5;
        this.voiceSearch_ = false;
    }

    public static gl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gk newBuilder() {
        return (gk) DEFAULT_INSTANCE.createBuilder();
    }

    public static gl parseDelimitedFrom(InputStream inputStream) {
        return (gl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gl parseFrom(com.google.v.v vVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewQuery(boolean z) {
        this.bitField0_ |= 2;
        this.newQuery_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        Objects.requireNonNull(str);
        this.query_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.query_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryCharactersCount(long j2) {
        this.bitField0_ |= 8;
        this.queryCharactersCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceSearch(boolean z) {
        this.bitField0_ |= 4;
        this.voiceSearch_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဂ\u0003", new Object[]{"bitField0_", "latencyMs_", "query_", "newQuery_", "voiceSearch_", "queryCharactersCount_"});
        }
        if (iOrdinal == 3) {
            return new gl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public boolean getNewQuery() {
        return this.newQuery_;
    }

    @Deprecated
    public String getQuery() {
        return this.query_;
    }

    @Deprecated
    public com.google.v.v getQueryBytes() {
        return com.google.v.v.s(this.query_);
    }

    public long getQueryCharactersCount() {
        return this.queryCharactersCount_;
    }

    public boolean getVoiceSearch() {
        return this.voiceSearch_;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNewQuery() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasQueryCharactersCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVoiceSearch() {
        return (this.bitField0_ & 4) != 0;
    }

    public static gk newBuilder(gl glVar) {
        return (gk) DEFAULT_INSTANCE.createBuilder(glVar);
    }

    public static gl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gl parseFrom(com.google.v.z zVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gl parseFrom(InputStream inputStream) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gl parseFrom(ByteBuffer byteBuffer) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gl parseFrom(byte[] bArr) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
