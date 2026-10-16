package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhd extends com.google.v.du<bhd, bha> implements com.google.v.fj {
    private static final bhd DEFAULT_INSTANCE;
    public static final int FRESH_LOCATION_AVAILABLE_FIELD_NUMBER = 3;
    public static final int LOGGED_IN_FIELD_NUMBER = 5;
    public static final int NETWORK_AVAILABLE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bhd> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int RESUME_DRIVE_FLAG_FIELD_NUMBER = 8;
    public static final int SERVER_SUGGESTION_CARD_ID_FIELD_NUMBER = 6;
    public static final int SUGGESTION_TYPE_FIELD_NUMBER = 2;
    public static final int TRIP_FORECAST_FLAG_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean freshLocationAvailable_;
    private boolean loggedIn_;
    private boolean networkAvailable_;
    private int result_;
    private boolean resumeDriveFlag_;
    private String serverSuggestionCardId_ = "";
    private int suggestionType_;
    private boolean tripForecastFlag_;

    static {
        bhd bhdVar = new bhd();
        DEFAULT_INSTANCE = bhdVar;
        com.google.v.du.registerDefaultInstance(bhd.class, bhdVar);
    }

    private bhd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreshLocationAvailable() {
        this.bitField0_ &= -2;
        this.freshLocationAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggedIn() {
        this.bitField0_ &= -5;
        this.loggedIn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkAvailable() {
        this.bitField0_ &= -3;
        this.networkAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeDriveFlag() {
        this.bitField0_ &= -17;
        this.resumeDriveFlag_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSuggestionCardId() {
        this.serverSuggestionCardId_ = getDefaultInstance().getServerSuggestionCardId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionType() {
        this.suggestionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripForecastFlag() {
        this.bitField0_ &= -9;
        this.tripForecastFlag_ = false;
    }

    public static bhd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bha newBuilder() {
        return (bha) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhd parseDelimitedFrom(InputStream inputStream) {
        return (bhd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhd parseFrom(com.google.v.v vVar) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreshLocationAvailable(boolean z) {
        this.bitField0_ |= 1;
        this.freshLocationAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggedIn(boolean z) {
        this.bitField0_ |= 4;
        this.loggedIn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkAvailable(boolean z) {
        this.bitField0_ |= 2;
        this.networkAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(bhb bhbVar) {
        this.result_ = bhbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultValue(int i2) {
        this.result_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeDriveFlag(boolean z) {
        this.bitField0_ |= 16;
        this.resumeDriveFlag_ = z;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionType(bhc bhcVar) {
        this.suggestionType_ = bhcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionTypeValue(int i2) {
        this.suggestionType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripForecastFlag(boolean z) {
        this.bitField0_ |= 8;
        this.tripForecastFlag_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006Ȉ\u0007ဇ\u0003\bဇ\u0004", new Object[]{"bitField0_", "result_", "suggestionType_", "freshLocationAvailable_", "networkAvailable_", "loggedIn_", "serverSuggestionCardId_", "tripForecastFlag_", "resumeDriveFlag_"});
        }
        if (iOrdinal == 3) {
            return new bhd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bha(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getFreshLocationAvailable() {
        return this.freshLocationAvailable_;
    }

    public boolean getLoggedIn() {
        return this.loggedIn_;
    }

    public boolean getNetworkAvailable() {
        return this.networkAvailable_;
    }

    public bhb getResult() {
        bhb bhbVar;
        switch (this.result_) {
            case 0:
                bhbVar = bhb.RESULT_UNSPECIFIED;
                break;
            case 1:
                bhbVar = bhb.RESUME_DRIVE;
                break;
            case 2:
                bhbVar = bhb.SERVER_SUGGESTION;
                break;
            case 3:
                bhbVar = bhb.NOTHING_TO_SUGGEST;
                break;
            case 4:
                bhbVar = bhb.TIMEOUT;
                break;
            case 5:
                bhbVar = bhb.SERVER_ERROR;
                break;
            case 6:
                bhbVar = bhb.NO_REQUEST_DUE_TO_NAVIGATION;
                break;
            case 7:
                bhbVar = bhb.NO_REQUEST_DUE_TO_TRIP_FORCAST_FLAG_OFF;
                break;
            case 8:
                bhbVar = bhb.RESUME_DRIVE_OLD_EXPERIENCE;
                break;
            case 9:
                bhbVar = bhb.NO_REQUEST_DUE_TO_SLEEP;
                break;
            default:
                bhbVar = null;
                break;
        }
        return bhbVar == null ? bhb.UNRECOGNIZED : bhbVar;
    }

    public int getResultValue() {
        return this.result_;
    }

    @Deprecated
    public boolean getResumeDriveFlag() {
        return this.resumeDriveFlag_;
    }

    public String getServerSuggestionCardId() {
        return this.serverSuggestionCardId_;
    }

    public com.google.v.v getServerSuggestionCardIdBytes() {
        return com.google.v.v.s(this.serverSuggestionCardId_);
    }

    public bhc getSuggestionType() {
        int i2 = this.suggestionType_;
        bhc bhcVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bhc.ETA_CHECK : bhc.CALENDAR : bhc.PLANNED_DRIVE : bhc.PREDICTION : bhc.RESUME : bhc.SUGGESTION_TYPE_UNSPECIFIED;
        return bhcVar == null ? bhc.UNRECOGNIZED : bhcVar;
    }

    public int getSuggestionTypeValue() {
        return this.suggestionType_;
    }

    public boolean getTripForecastFlag() {
        return this.tripForecastFlag_;
    }

    public boolean hasFreshLocationAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLoggedIn() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNetworkAvailable() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasResumeDriveFlag() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTripForecastFlag() {
        return (this.bitField0_ & 8) != 0;
    }

    public static bha newBuilder(bhd bhdVar) {
        return (bha) DEFAULT_INSTANCE.createBuilder(bhdVar);
    }

    public static bhd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhd parseFrom(com.google.v.z zVar) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhd parseFrom(InputStream inputStream) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhd parseFrom(ByteBuffer byteBuffer) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhd parseFrom(byte[] bArr) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
