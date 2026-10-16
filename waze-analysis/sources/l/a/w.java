package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class w extends com.google.v.du<w, v> implements com.google.v.fj {
    public static final int AD_CONTEXT_FIELD_NUMBER = 2;
    private static final w DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<w> PARSER = null;
    public static final int SERVING_CHANNEL_FIELD_NUMBER = 1;
    public static final int VENUE_CONTEXT_FIELD_NUMBER = 3;
    public static final int VENUE_ID_FIELD_NUMBER = 4;
    private String servingChannel_ = "";
    private String adContext_ = "";
    private String venueContext_ = "";
    private String venueId_ = "";

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        com.google.v.du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdContext() {
        this.adContext_ = getDefaultInstance().getAdContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServingChannel() {
        this.servingChannel_ = getDefaultInstance().getServingChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueContext() {
        this.venueContext_ = getDefaultInstance().getVenueContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdContext(String str) {
        Objects.requireNonNull(str);
        this.adContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdContextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.adContext_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServingChannel(String str) {
        Objects.requireNonNull(str);
        this.servingChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServingChannelBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.servingChannel_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContext(String str) {
        Objects.requireNonNull(str);
        this.venueContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueContext_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"servingChannel_", "adContext_", "venueContext_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdContext() {
        return this.adContext_;
    }

    public com.google.v.v getAdContextBytes() {
        return com.google.v.v.s(this.adContext_);
    }

    public String getServingChannel() {
        return this.servingChannel_;
    }

    public com.google.v.v getServingChannelBytes() {
        return com.google.v.v.s(this.servingChannel_);
    }

    public String getVenueContext() {
        return this.venueContext_;
    }

    public com.google.v.v getVenueContextBytes() {
        return com.google.v.v.s(this.venueContext_);
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public static v newBuilder(w wVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(com.google.v.z zVar) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (w) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
