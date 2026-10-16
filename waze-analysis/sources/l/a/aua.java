package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aua extends com.google.v.du<aua, atz> implements com.google.v.fj {
    private static final aua DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aua> PARSER = null;
    public static final int SEARCH_ID_FIELD_NUMBER = 1;
    private String searchId_ = "";

    static {
        aua auaVar = new aua();
        DEFAULT_INSTANCE = auaVar;
        com.google.v.du.registerDefaultInstance(aua.class, auaVar);
    }

    private aua() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
    }

    public static aua getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static atz newBuilder() {
        return (atz) DEFAULT_INSTANCE.createBuilder();
    }

    public static aua parseDelimitedFrom(InputStream inputStream) {
        return (aua) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aua parseFrom(com.google.v.v vVar) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aua> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchId(String str) {
        Objects.requireNonNull(str);
        this.searchId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.searchId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"searchId_"});
        }
        if (iOrdinal == 3) {
            return new aua();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new atz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aua> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aua.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getSearchId() {
        return this.searchId_;
    }

    public com.google.v.v getSearchIdBytes() {
        return com.google.v.v.s(this.searchId_);
    }

    public static atz newBuilder(aua auaVar) {
        return (atz) DEFAULT_INSTANCE.createBuilder(auaVar);
    }

    public static aua parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aua) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aua parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aua parseFrom(com.google.v.z zVar) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aua parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aua parseFrom(InputStream inputStream) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aua parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aua parseFrom(ByteBuffer byteBuffer) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aua parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aua parseFrom(byte[] bArr) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aua parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aua) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
