package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfy extends com.google.v.du<bfy, bfv> implements com.google.v.fj {
    public static final int CHANGE_REASON_FIELD_NUMBER = 2;
    private static final bfy DEFAULT_INSTANCE;
    public static final int NEW_DRAWER_STATE_FIELD_NUMBER = 4;
    public static final int NEW_STATE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bfy> PARSER = null;
    public static final int PORTRAIT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int changeReason_;
    private int newDrawerState_;
    private int newState_;
    private boolean portrait_;

    static {
        bfy bfyVar = new bfy();
        DEFAULT_INSTANCE = bfyVar;
        com.google.v.du.registerDefaultInstance(bfy.class, bfyVar);
    }

    private bfy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeReason() {
        this.changeReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewDrawerState() {
        this.newDrawerState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewState() {
        this.newState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortrait() {
        this.bitField0_ &= -2;
        this.portrait_ = false;
    }

    public static bfy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfv newBuilder() {
        return (bfv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfy parseDelimitedFrom(InputStream inputStream) {
        return (bfy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfy parseFrom(com.google.v.v vVar) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeReason(bfw bfwVar) {
        this.changeReason_ = bfwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeReasonValue(int i2) {
        this.changeReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewDrawerState(sv svVar) {
        this.newDrawerState_ = svVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewDrawerStateValue(int i2) {
        this.newDrawerState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewState(bfx bfxVar) {
        this.newState_ = bfxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewStateValue(int i2) {
        this.newState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortrait(boolean z) {
        this.bitField0_ |= 1;
        this.portrait_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004\f", new Object[]{"bitField0_", "newState_", "changeReason_", "portrait_", "newDrawerState_"});
        }
        if (iOrdinal == 3) {
            return new bfy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bfv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bfw getChangeReason() {
        bfw bfwVar;
        switch (this.changeReason_) {
            case 0:
                bfwVar = bfw.CHANGE_REASON_UNSPECIFIED;
                break;
            case 1:
                bfwVar = bfw.APP_OPEN;
                break;
            case 2:
                bfwVar = bfw.ROAMING;
                break;
            case 3:
                bfwVar = bfw.USER_SWIPE;
                break;
            case 4:
                bfwVar = bfw.MAP_INTERACTION;
                break;
            case 5:
                bfwVar = bfw.NAVIGATION_STARTED;
                break;
            case 6:
                bfwVar = bfw.NAVIGATION_ENDED;
                break;
            case 7:
                bfwVar = bfw.BACK_FROM_SEARCH;
                break;
            case 8:
                bfwVar = bfw.WARNING_INDICATOR_VISIBILITY_CHANGED;
                break;
            case 9:
                bfwVar = bfw.SUGGESTION_CARD_TIMEOUT;
                break;
            case 10:
                bfwVar = bfw.RECENTER_BUTTON_TAPPED;
                break;
            case 11:
                bfwVar = bfw.UGC_MENU_DISMISS;
                break;
            default:
                bfwVar = null;
                break;
        }
        return bfwVar == null ? bfw.UNRECOGNIZED : bfwVar;
    }

    public int getChangeReasonValue() {
        return this.changeReason_;
    }

    public sv getNewDrawerState() {
        sv svVarA = sv.a(this.newDrawerState_);
        return svVarA == null ? sv.UNRECOGNIZED : svVarA;
    }

    public int getNewDrawerStateValue() {
        return this.newDrawerState_;
    }

    @Deprecated
    public bfx getNewState() {
        int i2 = this.newState_;
        bfx bfxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bfx.REMOVED : bfx.FULL_SCREEN : bfx.SERACH_ONLY : bfx.PARTIALLY_OPEN : bfx.NEW_STATE_UNSPECIFIED;
        return bfxVar == null ? bfx.UNRECOGNIZED : bfxVar;
    }

    @Deprecated
    public int getNewStateValue() {
        return this.newState_;
    }

    public boolean getPortrait() {
        return this.portrait_;
    }

    public boolean hasPortrait() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bfv newBuilder(bfy bfyVar) {
        return (bfv) DEFAULT_INSTANCE.createBuilder(bfyVar);
    }

    public static bfy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfy parseFrom(com.google.v.z zVar) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfy parseFrom(InputStream inputStream) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfy parseFrom(ByteBuffer byteBuffer) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfy parseFrom(byte[] bArr) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
