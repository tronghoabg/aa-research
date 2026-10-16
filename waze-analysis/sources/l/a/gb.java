package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gb extends com.google.v.du<gb, ga> implements com.google.v.fj {
    private static final gb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gb> PARSER = null;
    public static final int PARTNER_NAME_FIELD_NUMBER = 1;
    private String partnerName_ = "";

    static {
        gb gbVar = new gb();
        DEFAULT_INSTANCE = gbVar;
        com.google.v.du.registerDefaultInstance(gb.class, gbVar);
    }

    private gb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerName() {
        this.partnerName_ = getDefaultInstance().getPartnerName();
    }

    public static gb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ga newBuilder() {
        return (ga) DEFAULT_INSTANCE.createBuilder();
    }

    public static gb parseDelimitedFrom(InputStream inputStream) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(com.google.v.v vVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerName(String str) {
        Objects.requireNonNull(str);
        this.partnerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.partnerName_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"partnerName_"});
        }
        if (iOrdinal == 3) {
            return new gb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ga(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPartnerName() {
        return this.partnerName_;
    }

    public com.google.v.v getPartnerNameBytes() {
        return com.google.v.v.s(this.partnerName_);
    }

    public static ga newBuilder(gb gbVar) {
        return (ga) DEFAULT_INSTANCE.createBuilder(gbVar);
    }

    public static gb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gb parseFrom(com.google.v.z zVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gb parseFrom(InputStream inputStream) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(ByteBuffer byteBuffer) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gb parseFrom(byte[] bArr) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
