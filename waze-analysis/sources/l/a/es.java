package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class es extends com.google.v.du<es, er> implements com.google.v.fj {
    private static final es DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_ANNOUNCE_FIELD_NUMBER = 2;
    public static final int DISTANCE_UNIT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<es> PARSER;
    private int bitField0_;
    private int distanceToAnnounce_;
    private String distanceUnit_ = "";

    static {
        es esVar = new es();
        DEFAULT_INSTANCE = esVar;
        com.google.v.du.registerDefaultInstance(es.class, esVar);
    }

    private es() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToAnnounce() {
        this.bitField0_ &= -2;
        this.distanceToAnnounce_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceUnit() {
        this.distanceUnit_ = getDefaultInstance().getDistanceUnit();
    }

    public static es getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static er newBuilder() {
        return (er) DEFAULT_INSTANCE.createBuilder();
    }

    public static es parseDelimitedFrom(InputStream inputStream) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(com.google.v.v vVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<es> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToAnnounce(int i2) {
        this.bitField0_ |= 1;
        this.distanceToAnnounce_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceUnit(String str) {
        Objects.requireNonNull(str);
        this.distanceUnit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceUnitBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.distanceUnit_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002င\u0000", new Object[]{"bitField0_", "distanceUnit_", "distanceToAnnounce_"});
        }
        if (iOrdinal == 3) {
            return new es();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new er(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<es> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (es.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDistanceToAnnounce() {
        return this.distanceToAnnounce_;
    }

    public String getDistanceUnit() {
        return this.distanceUnit_;
    }

    public com.google.v.v getDistanceUnitBytes() {
        return com.google.v.v.s(this.distanceUnit_);
    }

    public boolean hasDistanceToAnnounce() {
        return (this.bitField0_ & 1) != 0;
    }

    public static er newBuilder(es esVar) {
        return (er) DEFAULT_INSTANCE.createBuilder(esVar);
    }

    public static es parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static es parseFrom(com.google.v.z zVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static es parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static es parseFrom(InputStream inputStream) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(ByteBuffer byteBuffer) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static es parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static es parseFrom(byte[] bArr) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static es parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
