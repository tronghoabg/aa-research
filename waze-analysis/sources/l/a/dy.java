package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class dy extends com.google.v.du<dy, dx> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int ACTION_SOURCE_FIELD_NUMBER = 3;
    public static final int ALTERNATIVE_ROUTE_FIELD_NUMBER = 1;
    private static final dy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dy> PARSER;
    private int actionSource_;
    private int action_;
    private dk alternativeRoute_;
    private int bitField0_;

    static {
        dy dyVar = new dy();
        DEFAULT_INSTANCE = dyVar;
        com.google.v.du.registerDefaultInstance(dy.class, dyVar);
    }

    private dy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionSource() {
        this.actionSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoute() {
        this.alternativeRoute_ = null;
        this.bitField0_ &= -2;
    }

    public static dy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoute(dk dkVar) {
        Objects.requireNonNull(dkVar);
        dk dkVar2 = this.alternativeRoute_;
        if (dkVar2 != null && dkVar2 != dk.getDefaultInstance()) {
            di diVarNewBuilder = dk.newBuilder(dkVar2);
            diVarNewBuilder.mergeFrom((di) dkVar);
            dkVar = diVarNewBuilder.buildPartial();
        }
        this.alternativeRoute_ = dkVar;
        this.bitField0_ |= 1;
    }

    public static dx newBuilder() {
        return (dx) DEFAULT_INSTANCE.createBuilder();
    }

    public static dy parseDelimitedFrom(InputStream inputStream) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(com.google.v.v vVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(dv dvVar) {
        this.action_ = dvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSource(dw dwVar) {
        this.actionSource_ = dwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSourceValue(int i2) {
        this.actionSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoute(dk dkVar) {
        Objects.requireNonNull(dkVar);
        this.alternativeRoute_ = dkVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "alternativeRoute_", "action_", "actionSource_"});
        }
        if (iOrdinal == 3) {
            return new dy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dv getAction() {
        dv dvVar;
        switch (this.action_) {
            case 0:
                dvVar = dv.ACTION_UNSPECIFIED;
                break;
            case 1:
                dvVar = dv.ROUTE_SELECTED;
                break;
            case 2:
                dvVar = dv.ROUTE_LABEL_SELECTED;
                break;
            case 3:
                dvVar = dv.SWIPE;
                break;
            case 4:
                dvVar = dv.CHECK;
                break;
            case 5:
                dvVar = dv.GO;
                break;
            case 6:
                dvVar = dv.RESUME;
                break;
            case 7:
                dvVar = dv.BACK;
                break;
            case 8:
                dvVar = dv.PAN;
                break;
            case 9:
                dvVar = dv.ZOOM;
                break;
            case 10:
                dvVar = dv.RECENTER;
                break;
            case 11:
                dvVar = dv.DRIVING_INSTRUCTIONS_BAR_OPENED;
                break;
            case 12:
                dvVar = dv.DRIVING_INSTRUCTIONS_BAR_COLLAPSED;
                break;
            case 13:
                dvVar = dv.MORE_DETAILS;
                break;
            case 14:
                dvVar = dv.HOV_TOGGLE;
                break;
            case 15:
                dvVar = dv.SCROLL;
                break;
            case 16:
                dvVar = dv.TOGGLE_SCREEN_MODE;
                break;
            default:
                dvVar = null;
                break;
        }
        return dvVar == null ? dv.UNRECOGNIZED : dvVar;
    }

    public dw getActionSource() {
        dw dwVar;
        switch (this.actionSource_) {
            case 0:
                dwVar = dw.ACTION_SOURCE_UNSPECIFIED;
                break;
            case 1:
                dwVar = dw.MAP;
                break;
            case 2:
                dwVar = dw.CARD;
                break;
            case 3:
                dwVar = dw.INCAR_CHECKLIST;
                break;
            case 4:
                dwVar = dw.HARDWARE_BACK;
                break;
            case 5:
                dwVar = dw.RECENTER_ICON;
                break;
            case 6:
                dwVar = dw.DRIVING_INSTRUCTIONS_BAR;
                break;
            case 7:
                dwVar = dw.SCREEN_MODE_TOGGLE;
                break;
            default:
                dwVar = null;
                break;
        }
        return dwVar == null ? dw.UNRECOGNIZED : dwVar;
    }

    public int getActionSourceValue() {
        return this.actionSource_;
    }

    public int getActionValue() {
        return this.action_;
    }

    public dk getAlternativeRoute() {
        dk dkVar = this.alternativeRoute_;
        return dkVar == null ? dk.getDefaultInstance() : dkVar;
    }

    public boolean hasAlternativeRoute() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dx newBuilder(dy dyVar) {
        return (dx) DEFAULT_INSTANCE.createBuilder(dyVar);
    }

    public static dy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dy parseFrom(com.google.v.z zVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dy parseFrom(InputStream inputStream) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(ByteBuffer byteBuffer) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dy parseFrom(byte[] bArr) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
