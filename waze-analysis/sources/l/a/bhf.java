package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhf extends com.google.v.du<bhf, bhe> implements com.google.v.fj {
    private static final bhf DEFAULT_INSTANCE;
    public static final int HEAVY_TRAFFIC_SHOWN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bhf> PARSER = null;
    public static final int SERVER_SUGGESTION_CARD_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean heavyTrafficShown_;
    private String serverSuggestionCardId_ = "";

    static {
        bhf bhfVar = new bhf();
        DEFAULT_INSTANCE = bhfVar;
        com.google.v.du.registerDefaultInstance(bhf.class, bhfVar);
    }

    private bhf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeavyTrafficShown() {
        this.bitField0_ &= -2;
        this.heavyTrafficShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSuggestionCardId() {
        this.serverSuggestionCardId_ = getDefaultInstance().getServerSuggestionCardId();
    }

    public static bhf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bhe newBuilder() {
        return (bhe) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhf parseDelimitedFrom(InputStream inputStream) {
        return (bhf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhf parseFrom(com.google.v.v vVar) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeavyTrafficShown(boolean z) {
        this.bitField0_ |= 1;
        this.heavyTrafficShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSuggestionCardId(String str) {
        Objects.requireNonNull(str);
        this.serverSuggestionCardId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSuggestionCardIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.serverSuggestionCardId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002Ȉ", new Object[]{"bitField0_", "heavyTrafficShown_", "serverSuggestionCardId_"});
        }
        if (iOrdinal == 3) {
            return new bhf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getHeavyTrafficShown() {
        return this.heavyTrafficShown_;
    }

    public String getServerSuggestionCardId() {
        return this.serverSuggestionCardId_;
    }

    public com.google.v.v getServerSuggestionCardIdBytes() {
        return com.google.v.v.s(this.serverSuggestionCardId_);
    }

    public boolean hasHeavyTrafficShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bhe newBuilder(bhf bhfVar) {
        return (bhe) DEFAULT_INSTANCE.createBuilder(bhfVar);
    }

    public static bhf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhf parseFrom(com.google.v.z zVar) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhf parseFrom(InputStream inputStream) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhf parseFrom(ByteBuffer byteBuffer) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhf parseFrom(byte[] bArr) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
