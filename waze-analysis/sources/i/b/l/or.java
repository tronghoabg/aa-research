package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class or extends com.google.v.du<or, oq> implements com.google.v.fj {
    public static final int ALLOWBIDI_FIELD_NUMBER = 8;
    public static final int CITYNAME_FIELD_NUMBER = 6;
    public static final int DBSEGMENTID_FIELD_NUMBER = 2;
    private static final or DEFAULT_INSTANCE;
    public static final int FROMNODE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<or> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int STATENAME_FIELD_NUMBER = 7;
    public static final int STREETNAME_FIELD_NUMBER = 5;
    public static final int TONODE_FIELD_NUMBER = 4;
    private boolean allowBidi_;
    private int bitField0_;
    private int dbSegmentId_;
    private long fromNode_;
    private i.b.s position_;
    private long toNode_;
    private String streetName_ = "";
    private String cityName_ = "";
    private String stateName_ = "";

    static {
        or orVar = new or();
        DEFAULT_INSTANCE = orVar;
        com.google.v.du.registerDefaultInstance(or.class, orVar);
    }

    private or() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowBidi() {
        this.bitField0_ &= -129;
        this.allowBidi_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCityName() {
        this.bitField0_ &= -33;
        this.cityName_ = getDefaultInstance().getCityName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDbSegmentId() {
        this.bitField0_ &= -3;
        this.dbSegmentId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -5;
        this.fromNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateName() {
        this.bitField0_ &= -65;
        this.stateName_ = getDefaultInstance().getStateName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        this.bitField0_ &= -17;
        this.streetName_ = getDefaultInstance().getStreetName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -9;
        this.toNode_ = 0L;
    }

    public static or getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.position_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.position_ = sVar;
        this.bitField0_ |= 1;
    }

    public static oq newBuilder() {
        return (oq) DEFAULT_INSTANCE.createBuilder();
    }

    public static or parseDelimitedFrom(InputStream inputStream) {
        return (or) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static or parseFrom(com.google.v.v vVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<or> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowBidi(boolean z) {
        this.bitField0_ |= 128;
        this.allowBidi_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.cityName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityNameBytes(com.google.v.v vVar) {
        this.cityName_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDbSegmentId(int i2) {
        this.bitField0_ |= 2;
        this.dbSegmentId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(long j2) {
        this.bitField0_ |= 4;
        this.fromNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.position_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.stateName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateNameBytes(com.google.v.v vVar) {
        this.stateName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.streetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(com.google.v.v vVar) {
        this.streetName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(long j2) {
        this.bitField0_ |= 8;
        this.toNode_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"bitField0_", "position_", "dbSegmentId_", "fromNode_", "toNode_", "streetName_", "cityName_", "stateName_", "allowBidi_"});
        }
        if (iOrdinal == 3) {
            return new or();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<or> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (or.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAllowBidi() {
        return this.allowBidi_;
    }

    public String getCityName() {
        return this.cityName_;
    }

    public com.google.v.v getCityNameBytes() {
        return com.google.v.v.s(this.cityName_);
    }

    public int getDbSegmentId() {
        return this.dbSegmentId_;
    }

    public long getFromNode() {
        return this.fromNode_;
    }

    public i.b.s getPosition() {
        i.b.s sVar = this.position_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public String getStateName() {
        return this.stateName_;
    }

    public com.google.v.v getStateNameBytes() {
        return com.google.v.v.s(this.stateName_);
    }

    public String getStreetName() {
        return this.streetName_;
    }

    public com.google.v.v getStreetNameBytes() {
        return com.google.v.v.s(this.streetName_);
    }

    public long getToNode() {
        return this.toNode_;
    }

    public boolean hasAllowBidi() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCityName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDbSegmentId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStateName() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasStreetName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasToNode() {
        return (this.bitField0_ & 8) != 0;
    }

    public static oq newBuilder(or orVar) {
        return (oq) DEFAULT_INSTANCE.createBuilder(orVar);
    }

    public static or parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (or) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static or parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static or parseFrom(com.google.v.z zVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static or parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static or parseFrom(InputStream inputStream) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static or parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static or parseFrom(ByteBuffer byteBuffer) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static or parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static or parseFrom(byte[] bArr) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static or parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (or) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
