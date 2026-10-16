package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hp extends com.google.v.du<hp, hn> implements hq {
    private static final hp DEFAULT_INSTANCE;
    public static final int DISPLAY_PREFERENCE_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<hp> PARSER = null;
    public static final int ROUTE_DIRECTION_FIELD_NUMBER = 3;
    public static final int ROUTE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ce metadata_;
    private int routeDirection_;
    private bw route_;
    private byte memoizedIsInitialized = 2;
    private int displayPreference_ = 2;

    static {
        hp hpVar = new hp();
        DEFAULT_INSTANCE = hpVar;
        com.google.v.du.registerDefaultInstance(hp.class, hpVar);
    }

    private hp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayPreference() {
        this.bitField0_ &= -3;
        this.displayPreference_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoute() {
        this.route_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDirection() {
        this.bitField0_ &= -5;
        this.routeDirection_ = 0;
    }

    public static hp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoute(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.route_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.route_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static hn newBuilder() {
        return (hn) DEFAULT_INSTANCE.createBuilder();
    }

    public static hp parseDelimitedFrom(InputStream inputStream) {
        return (hp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hp parseFrom(com.google.v.v vVar) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayPreference(ho hoVar) {
        this.displayPreference_ = hoVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoute(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.route_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDirection(com.google.k.a.a.kt ktVar) {
        this.routeDirection_ = ktVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001Ǵ\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003᠌\u0002Ǵဉ\u0003", new Object[]{"bitField0_", "route_", "displayPreference_", dq.u, "routeDirection_", com.google.k.a.a.kt.b(), "metadata_"});
            case 3:
                return new hp();
            case 4:
                return new hn(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<hp> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (hp.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public ho getDisplayPreference() {
        ho hoVarA = ho.a(this.displayPreference_);
        return hoVarA == null ? ho.DISPLAY_OK : hoVarA;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public bw getRoute() {
        bw bwVar = this.route_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public com.google.k.a.a.kt getRouteDirection() {
        com.google.k.a.a.kt ktVarA = com.google.k.a.a.kt.a(this.routeDirection_);
        return ktVarA == null ? com.google.k.a.a.kt.DIRECTION_NONE : ktVarA;
    }

    public boolean hasDisplayPreference() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRoute() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRouteDirection() {
        return (this.bitField0_ & 4) != 0;
    }

    public static hn newBuilder(hp hpVar) {
        return (hn) DEFAULT_INSTANCE.createBuilder(hpVar);
    }

    public static hp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hp parseFrom(com.google.v.z zVar) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hp parseFrom(InputStream inputStream) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hp parseFrom(ByteBuffer byteBuffer) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hp parseFrom(byte[] bArr) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
