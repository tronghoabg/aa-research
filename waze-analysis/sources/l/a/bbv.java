package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbv extends com.google.v.du<bbv, bbt> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int BUTTON_FIELD_NUMBER = 1;
    private static final bbv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bbv> PARSER;
    private int action_;
    private int button_;

    static {
        bbv bbvVar = new bbv();
        DEFAULT_INSTANCE = bbvVar;
        com.google.v.du.registerDefaultInstance(bbv.class, bbvVar);
    }

    private bbv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = 0;
    }

    public static bbv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bbt newBuilder() {
        return (bbt) DEFAULT_INSTANCE.createBuilder();
    }

    public static bbv parseDelimitedFrom(InputStream inputStream) {
        return (bbv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbv parseFrom(com.google.v.v vVar) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bbv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bbs bbsVar) {
        this.action_ = bbsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(bbu bbuVar) {
        this.button_ = bbuVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonValue(int i2) {
        this.button_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"button_", "action_"});
        }
        if (iOrdinal == 3) {
            return new bbv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bbv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bbv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bbs getAction() {
        bbs bbsVarA = bbs.a(this.action_);
        return bbsVarA == null ? bbs.UNRECOGNIZED : bbsVarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public bbu getButton() {
        bbu bbuVar;
        switch (this.button_) {
            case 0:
                bbuVar = bbu.BUTTON_UNSPECIFIED;
                break;
            case 1:
                bbuVar = bbu.GENERAL_SETTINGS;
                break;
            case 2:
                bbuVar = bbu.MAP_DISPLAY_SETTINGS;
                break;
            case 3:
                bbuVar = bbu.VOICE_SETTINGS;
                break;
            case 4:
            default:
                bbuVar = null;
                break;
            case 5:
                bbuVar = bbu.NAVIGATION_SETTINGS;
                break;
            case 6:
                bbuVar = bbu.CAR_DETAILS_SETTINGS;
                break;
            case 7:
                bbuVar = bbu.SUBSCRIPTIONS_SETTINGS;
                break;
            case 8:
                bbuVar = bbu.ALERTS_AND_REPORTS_SETTINGS;
                break;
            case 9:
                bbuVar = bbu.GAS_STATIONS_SETTINGS;
                break;
            case 10:
                bbuVar = bbu.SPEEDOMETER_SETTINGS;
                break;
            case 11:
                bbuVar = bbu.CARPOOL_SETTINGS_SETTINGS;
                break;
            case 12:
                bbuVar = bbu.MUSIC_SETTINGS;
                break;
            case 13:
                bbuVar = bbu.NOTIFICATIONS_SETTINGS;
                break;
            case 14:
                bbuVar = bbu.PLANNED_DRIVE_SETTINGS;
                break;
            case 15:
                bbuVar = bbu.REMINDERS_SETTINGS;
                break;
            case 16:
                bbuVar = bbu.ACCOUNT_AND_LOGIN_SETTINGS;
                break;
            case 17:
                bbuVar = bbu.PRIVACY_SETTINGS;
                break;
            case 18:
                bbuVar = bbu.ABOUT_SETTINGS;
                break;
            case 19:
                bbuVar = bbu.SPREAD_THE_WORD_SETTINGS;
                break;
            case 20:
                bbuVar = bbu.BECOME_AN_EDITOR_SETTINGS;
                break;
        }
        return bbuVar == null ? bbu.UNRECOGNIZED : bbuVar;
    }

    public int getButtonValue() {
        return this.button_;
    }

    public static bbt newBuilder(bbv bbvVar) {
        return (bbt) DEFAULT_INSTANCE.createBuilder(bbvVar);
    }

    public static bbv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bbv parseFrom(com.google.v.z zVar) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bbv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bbv parseFrom(InputStream inputStream) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbv parseFrom(ByteBuffer byteBuffer) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bbv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bbv parseFrom(byte[] bArr) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bbv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bbv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
