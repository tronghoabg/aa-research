package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkz extends com.google.v.du<bkz, bkx> implements com.google.v.fj {
    public static final int CONNECTED_TO_NETWORK_FIELD_NUMBER = 4;
    private static final bkz DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_ENABLED_FIELD_NUMBER = 5;
    public static final int ERROR_CODE_FIELD_NUMBER = 2;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 1;
    public static final int LOGGED_IN_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<bkz> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean connectedToNetwork_;
    private boolean entryPointEnabled_;
    private long errorCode_;
    private String errorDescription_ = "";
    private boolean loggedIn_;
    private int source_;

    static {
        bkz bkzVar = new bkz();
        DEFAULT_INSTANCE = bkzVar;
        com.google.v.du.registerDefaultInstance(bkz.class, bkzVar);
    }

    private bkz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedToNetwork() {
        this.bitField0_ &= -5;
        this.connectedToNetwork_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointEnabled() {
        this.bitField0_ &= -9;
        this.entryPointEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -3;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorDescription() {
        this.bitField0_ &= -2;
        this.errorDescription_ = getDefaultInstance().getErrorDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggedIn() {
        this.bitField0_ &= -17;
        this.loggedIn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static bkz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bkx newBuilder() {
        return (bkx) DEFAULT_INSTANCE.createBuilder();
    }

    public static bkz parseDelimitedFrom(InputStream inputStream) {
        return (bkz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkz parseFrom(com.google.v.v vVar) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bkz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedToNetwork(boolean z) {
        this.bitField0_ |= 4;
        this.connectedToNetwork_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.entryPointEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 2;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.errorDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorDescriptionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorDescription_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggedIn(boolean z) {
        this.bitField0_ |= 16;
        this.loggedIn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(bky bkyVar) {
        this.source_ = bkyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003\f\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "errorDescription_", "errorCode_", "source_", "connectedToNetwork_", "entryPointEnabled_", "loggedIn_"});
        }
        if (iOrdinal == 3) {
            return new bkz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bkx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bkz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bkz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getConnectedToNetwork() {
        return this.connectedToNetwork_;
    }

    public boolean getEntryPointEnabled() {
        return this.entryPointEnabled_;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public String getErrorDescription() {
        return this.errorDescription_;
    }

    public com.google.v.v getErrorDescriptionBytes() {
        return com.google.v.v.s(this.errorDescription_);
    }

    public boolean getLoggedIn() {
        return this.loggedIn_;
    }

    public bky getSource() {
        bky bkyVar;
        switch (this.source_) {
            case 0:
                bkyVar = bky.SOURCE_UNSPECIFIED;
                break;
            case 1:
                bkyVar = bky.AAOS_ADDRESS_PREVIEW;
                break;
            case 2:
                bkyVar = bky.AAOS_SEARCH;
                break;
            case 3:
                bkyVar = bky.ADD_HOME_WORK;
                break;
            case 4:
                bkyVar = bky.ADS_0SPEED;
                break;
            case 5:
                bkyVar = bky.ADS_PIN_POPUP;
                break;
            case 6:
                bkyVar = bky.AUTOCOMPLETE_PERSONAL_PLACE;
                break;
            case 7:
                bkyVar = bky.CAR_PLAY;
                break;
            case 8:
                bkyVar = bky.DEEP_LINK;
                break;
            case 9:
                bkyVar = bky.FAVORITES;
                break;
            case 10:
                bkyVar = bky.HISTORY;
                break;
            case 11:
                bkyVar = bky.LEFT_MENU;
                break;
            case 12:
                bkyVar = bky.LEFT_MENU_OPTIONS_ROUTES;
                break;
            case 13:
                bkyVar = bky.PIN_ON_MAP;
                break;
            case 14:
                bkyVar = bky.PLACE_PREVIEW;
                break;
            case 15:
                bkyVar = bky.PLANNED_DRIVE;
                break;
            case 16:
                bkyVar = bky.SEARCH_EMPTY_STATE;
                break;
            case 17:
                bkyVar = bky.SEARCH_ZERO_STATE;
                break;
            case 18:
                bkyVar = bky.START_STATE;
                break;
            case 19:
                bkyVar = bky.VOICE_ACTIVATION;
                break;
            case 20:
                bkyVar = bky.TRANSPORT_SDK;
                break;
            case 21:
                bkyVar = bky.ADS_ARROW;
                break;
            case 22:
                bkyVar = bky.SUGGESTION_CARD;
                break;
            case 23:
                bkyVar = bky.SHARE_DRIVE;
                break;
            default:
                bkyVar = null;
                break;
        }
        return bkyVar == null ? bky.UNRECOGNIZED : bkyVar;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean hasConnectedToNetwork() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEntryPointEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasErrorDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLoggedIn() {
        return (this.bitField0_ & 16) != 0;
    }

    public static bkx newBuilder(bkz bkzVar) {
        return (bkx) DEFAULT_INSTANCE.createBuilder(bkzVar);
    }

    public static bkz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bkz parseFrom(com.google.v.z zVar) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bkz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bkz parseFrom(InputStream inputStream) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkz parseFrom(ByteBuffer byteBuffer) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bkz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bkz parseFrom(byte[] bArr) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bkz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bkz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
