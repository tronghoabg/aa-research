package l.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gq extends com.google.v.du<gq, gm> implements com.google.v.fj {
    private static final gq DEFAULT_INSTANCE;
    public static final int DEST_COORDINATE_FIELD_NUMBER = 12;
    public static final int DISTANCE_FROM_RESULT_METERS_FIELD_NUMBER = 6;
    public static final int DISTANCE_SOURCE_FIELD_NUMBER = 7;
    public static final int LINE_NUMBER_FIELD_NUMBER = 2;
    public static final int LINE_NUMBER_ORGANIC_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<gq> PARSER = null;
    public static final int QUERY_CHARACTERS_COUNT_FIELD_NUMBER = 5;
    public static final int QUERY_FIELD_NUMBER = 4;
    public static final int RESULT_ID_FIELD_NUMBER = 9;
    public static final int RESULT_NAME_FIELD_NUMBER = 10;
    public static final int RESULT_SOURCE_FIELD_NUMBER = 8;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VENUE_ID_FIELD_NUMBER = 11;
    private int bitField0_;
    private afx destCoordinate_;
    private double distanceFromResultMeters_;
    private int distanceSource_;
    private long lineNumberOrganic_;
    private long lineNumber_;
    private long queryCharactersCount_;
    private int resultSource_;
    private int triggeringPlatform_;
    private int type_;
    private String query_ = "";
    private String resultId_ = "";
    private String resultName_ = "";
    private String venueId_ = "";

    static {
        gq gqVar = new gq();
        DEFAULT_INSTANCE = gqVar;
        com.google.v.du.registerDefaultInstance(gq.class, gqVar);
    }

    private gq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestCoordinate() {
        this.destCoordinate_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceFromResultMeters() {
        this.bitField0_ &= -9;
        this.distanceFromResultMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceSource() {
        this.distanceSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLineNumber() {
        this.bitField0_ &= -2;
        this.lineNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLineNumberOrganic() {
        this.bitField0_ &= -3;
        this.lineNumberOrganic_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryCharactersCount() {
        this.bitField0_ &= -5;
        this.queryCharactersCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultId() {
        this.resultId_ = getDefaultInstance().getResultId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultName() {
        this.resultName_ = getDefaultInstance().getResultName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultSource() {
        this.resultSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static gq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestCoordinate(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.destCoordinate_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.destCoordinate_ = afxVar;
        this.bitField0_ |= 16;
    }

    public static gm newBuilder() {
        return (gm) DEFAULT_INSTANCE.createBuilder();
    }

    public static gq parseDelimitedFrom(InputStream inputStream) {
        return (gq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gq parseFrom(com.google.v.v vVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestCoordinate(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destCoordinate_ = afxVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceFromResultMeters(double d2) {
        this.bitField0_ |= 8;
        this.distanceFromResultMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceSource(gn gnVar) {
        this.distanceSource_ = gnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceSourceValue(int i2) {
        this.distanceSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLineNumber(long j2) {
        this.bitField0_ |= 1;
        this.lineNumber_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLineNumberOrganic(long j2) {
        this.bitField0_ |= 2;
        this.lineNumberOrganic_ = j2;
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
        this.bitField0_ |= 4;
        this.queryCharactersCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultId(String str) {
        Objects.requireNonNull(str);
        this.resultId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.resultId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultName(String str) {
        Objects.requireNonNull(str);
        this.resultName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.resultName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultSource(go goVar) {
        this.resultSource_ = goVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultSourceValue(int i2) {
        this.resultSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(gp gpVar) {
        this.type_ = gpVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001\u0004Ȉ\u0005ဂ\u0002\u0006က\u0003\u0007\f\b\f\tȈ\nȈ\u000bȈ\fဉ\u0004\r\f", new Object[]{"bitField0_", "type_", "lineNumber_", "lineNumberOrganic_", "query_", "queryCharactersCount_", "distanceFromResultMeters_", "distanceSource_", "resultSource_", "resultId_", "resultName_", "venueId_", "destCoordinate_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new gq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public afx getDestCoordinate() {
        afx afxVar = this.destCoordinate_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public double getDistanceFromResultMeters() {
        return this.distanceFromResultMeters_;
    }

    public gn getDistanceSource() {
        int i2 = this.distanceSource_;
        gn gnVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : gn.HUBCAPS : gn.CLIENT : gn.AERIAL : gn.DISTANCE_SOURCE_UNSPECIFIED;
        return gnVar == null ? gn.UNRECOGNIZED : gnVar;
    }

    public int getDistanceSourceValue() {
        return this.distanceSource_;
    }

    public long getLineNumber() {
        return this.lineNumber_;
    }

    public long getLineNumberOrganic() {
        return this.lineNumberOrganic_;
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

    public String getResultId() {
        return this.resultId_;
    }

    public com.google.v.v getResultIdBytes() {
        return com.google.v.v.s(this.resultId_);
    }

    public String getResultName() {
        return this.resultName_;
    }

    public com.google.v.v getResultNameBytes() {
        return com.google.v.v.s(this.resultName_);
    }

    public go getResultSource() {
        int i2 = this.resultSource_;
        go goVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : go.WAZE_AD : go.WAZE : go.GOOGLE : go.RESULT_SOURCE_UNSPECIFIED;
        return goVar == null ? go.UNRECOGNIZED : goVar;
    }

    public int getResultSourceValue() {
        return this.resultSource_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public gp getType() {
        gp gpVar;
        switch (this.type_) {
            case 0:
                gpVar = gp.TYPE_UNSPECIFIED;
                break;
            case 1:
                gpVar = gp.PLACE;
                break;
            case 2:
                gpVar = gp.CONTACT;
                break;
            case 3:
                gpVar = gp.FAVORITE;
                break;
            case 4:
                gpVar = gp.HISTORY;
                break;
            case 5:
                gpVar = gp.QUERY;
                break;
            case 6:
                gpVar = gp.RETURN;
                break;
            case 7:
                gpVar = gp.SEARCH;
                break;
            case 8:
                gpVar = gp.ALGO_TRANSPARENCY_LINK;
                break;
            default:
                gpVar = null;
                break;
        }
        return gpVar == null ? gp.UNRECOGNIZED : gpVar;
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

    public boolean hasDestCoordinate() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDistanceFromResultMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLineNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLineNumberOrganic() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasQueryCharactersCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public static gm newBuilder(gq gqVar) {
        return (gm) DEFAULT_INSTANCE.createBuilder(gqVar);
    }

    public static gq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gq parseFrom(com.google.v.z zVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gq parseFrom(InputStream inputStream) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gq parseFrom(ByteBuffer byteBuffer) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gq parseFrom(byte[] bArr) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
