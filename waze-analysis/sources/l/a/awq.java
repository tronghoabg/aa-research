package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awq extends com.google.v.du<awq, awp> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final awq DEFAULT_INSTANCE;
    public static final int NUM_PASSENGERS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<awq> PARSER = null;
    public static final int PRIMARY_ROUTE_ALT_ID_FIELD_NUMBER = 3;
    public static final int ROUTES_SCREEN_VIEW_FIELD_NUMBER = 8;
    public static final int ROUTE_ALT_ID_FIELD_NUMBER = 4;
    public static final int ROUTE_INDEX_FIELD_NUMBER = 5;
    public static final int SUBROUTE_INDEX_FIELD_NUMBER = 6;
    public static final int VIEW_FIELD_NUMBER = 7;
    private int action_;
    private int bitField0_;
    private long numPassengers_;
    private long primaryRouteAltId_;
    private long routeAltId_;
    private long routeIndex_;
    private int routesScreenView_;
    private long subrouteIndex_;
    private int view_;

    static {
        awq awqVar = new awq();
        DEFAULT_INSTANCE = awqVar;
        com.google.v.du.registerDefaultInstance(awq.class, awqVar);
    }

    private awq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumPassengers() {
        this.bitField0_ &= -2;
        this.numPassengers_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryRouteAltId() {
        this.bitField0_ &= -3;
        this.primaryRouteAltId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteAltId() {
        this.bitField0_ &= -5;
        this.routeAltId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteIndex() {
        this.bitField0_ &= -9;
        this.routeIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutesScreenView() {
        this.routesScreenView_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubrouteIndex() {
        this.bitField0_ &= -17;
        this.subrouteIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearView() {
        this.view_ = 0;
    }

    public static awq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static awp newBuilder() {
        return (awp) DEFAULT_INSTANCE.createBuilder();
    }

    public static awq parseDelimitedFrom(InputStream inputStream) {
        return (awq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awq parseFrom(com.google.v.v vVar) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<awq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(awo awoVar) {
        this.action_ = awoVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumPassengers(long j2) {
        this.bitField0_ |= 1;
        this.numPassengers_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryRouteAltId(long j2) {
        this.bitField0_ |= 2;
        this.primaryRouteAltId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteAltId(long j2) {
        this.bitField0_ |= 4;
        this.routeAltId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteIndex(long j2) {
        this.bitField0_ |= 8;
        this.routeIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutesScreenView(awt awtVar) {
        this.routesScreenView_ = awtVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutesScreenViewValue(int i2) {
        this.routesScreenView_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubrouteIndex(long j2) {
        this.bitField0_ |= 16;
        this.subrouteIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setView(awt awtVar) {
        this.view_ = awtVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewValue(int i2) {
        this.view_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007\f\b\f", new Object[]{"bitField0_", "action_", "numPassengers_", "primaryRouteAltId_", "routeAltId_", "routeIndex_", "subrouteIndex_", "view_", "routesScreenView_"});
        }
        if (iOrdinal == 3) {
            return new awq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<awq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (awq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public awo getAction() {
        awo awoVar;
        switch (this.action_) {
            case 0:
                awoVar = awo.ACTION_UNSPECIFIED;
                break;
            case 1:
                awoVar = awo.GO;
                break;
            case 2:
                awoVar = awo.BACK;
                break;
            case 3:
                awoVar = awo.SETTINGS;
                break;
            case 4:
                awoVar = awo.CHANGE_VIEW;
                break;
            case 5:
                awoVar = awo.CHOOSE_ROUTE;
                break;
            case 6:
                awoVar = awo.ALGO_TRANSPARENCY_LINK;
                break;
            default:
                awoVar = null;
                break;
        }
        return awoVar == null ? awo.UNRECOGNIZED : awoVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getNumPassengers() {
        return this.numPassengers_;
    }

    public long getPrimaryRouteAltId() {
        return this.primaryRouteAltId_;
    }

    public long getRouteAltId() {
        return this.routeAltId_;
    }

    public long getRouteIndex() {
        return this.routeIndex_;
    }

    public awt getRoutesScreenView() {
        awt awtVarA = awt.a(this.routesScreenView_);
        return awtVarA == null ? awt.UNRECOGNIZED : awtVarA;
    }

    public int getRoutesScreenViewValue() {
        return this.routesScreenView_;
    }

    public long getSubrouteIndex() {
        return this.subrouteIndex_;
    }

    @Deprecated
    public awt getView() {
        awt awtVarA = awt.a(this.view_);
        return awtVarA == null ? awt.UNRECOGNIZED : awtVarA;
    }

    @Deprecated
    public int getViewValue() {
        return this.view_;
    }

    public boolean hasNumPassengers() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPrimaryRouteAltId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteAltId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRouteIndex() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSubrouteIndex() {
        return (this.bitField0_ & 16) != 0;
    }

    public static awp newBuilder(awq awqVar) {
        return (awp) DEFAULT_INSTANCE.createBuilder(awqVar);
    }

    public static awq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static awq parseFrom(com.google.v.z zVar) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static awq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static awq parseFrom(InputStream inputStream) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awq parseFrom(ByteBuffer byteBuffer) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static awq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static awq parseFrom(byte[] bArr) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static awq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (awq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
