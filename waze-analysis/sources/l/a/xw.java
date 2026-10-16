package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xw extends com.google.v.du<xw, xu> implements com.google.v.fj {
    private static final xw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<xw> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    private int type_;
    private String venueId_ = "";

    static {
        xw xwVar = new xw();
        DEFAULT_INSTANCE = xwVar;
        com.google.v.du.registerDefaultInstance(xw.class, xwVar);
    }

    private xw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static xw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xu newBuilder() {
        return (xu) DEFAULT_INSTANCE.createBuilder();
    }

    public static xw parseDelimitedFrom(InputStream inputStream) {
        return (xw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xw parseFrom(com.google.v.v vVar) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(xv xvVar) {
        this.type_ = xvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new xw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public xv getType() {
        int i2 = this.type_;
        xv xvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : xv.INSIDE_STATION : xv.NEAR_STATION : xv.TYPE_UNSPECIFIED;
        return xvVar == null ? xv.UNRECOGNIZED : xvVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public static xu newBuilder(xw xwVar) {
        return (xu) DEFAULT_INSTANCE.createBuilder(xwVar);
    }

    public static xw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xw parseFrom(com.google.v.z zVar) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xw parseFrom(InputStream inputStream) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xw parseFrom(ByteBuffer byteBuffer) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xw parseFrom(byte[] bArr) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
