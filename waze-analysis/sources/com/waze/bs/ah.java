package com.waze.bs;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import i.b.l.ao;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends du<ah, ag> implements fj {
    public static final int CLIENT_INFO_FIELD_NUMBER = 3;
    public static final int COUNTRY_FIELD_NUMBER = 2;
    private static final ah DEFAULT_INSTANCE;
    private static volatile fo<ah> PARSER = null;
    public static final int REAL_POSITION_FIELD_NUMBER = 1;
    public static final int SELECTED_ROUTE_GEOMETRY_FIELD_NUMBER = 4;
    private int bitField0_;
    private ao clientInfo_;
    private com.waze.bg.d.b country_;
    private com.waze.bg.d.j realPosition_;
    private i.a.a.c selectedRouteGeometry_;

    static {
        ah ahVar = new ah();
        DEFAULT_INSTANCE = ahVar;
        du.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.country_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealPosition() {
        this.realPosition_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedRouteGeometry() {
        this.selectedRouteGeometry_ = null;
        this.bitField0_ &= -9;
    }

    public static ah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.clientInfo_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            i.b.l.aj ajVarNewBuilder = ao.newBuilder(aoVar2);
            ajVarNewBuilder.mergeFrom((i.b.l.aj) aoVar);
            aoVar = ajVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = aoVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCountry(com.waze.bg.d.b bVar) {
        Objects.requireNonNull(bVar);
        com.waze.bg.d.b bVar2 = this.country_;
        if (bVar2 != null && bVar2 != com.waze.bg.d.b.getDefaultInstance()) {
            com.waze.bg.d.a aVarNewBuilder = com.waze.bg.d.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.waze.bg.d.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.country_ = bVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRealPosition(com.waze.bg.d.j jVar) {
        Objects.requireNonNull(jVar);
        com.waze.bg.d.j jVar2 = this.realPosition_;
        if (jVar2 != null && jVar2 != com.waze.bg.d.j.getDefaultInstance()) {
            com.waze.bg.d.i iVarNewBuilder = com.waze.bg.d.j.newBuilder(jVar2);
            iVarNewBuilder.mergeFrom((com.waze.bg.d.i) jVar);
            jVar = iVarNewBuilder.buildPartial();
        }
        this.realPosition_ = jVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectedRouteGeometry(i.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        i.a.a.c cVar2 = this.selectedRouteGeometry_;
        if (cVar2 != null && cVar2 != i.a.a.c.getDefaultInstance()) {
            i.a.a.a aVarNewBuilder = i.a.a.c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((i.a.a.a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.selectedRouteGeometry_ = cVar;
        this.bitField0_ |= 8;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ah parseDelimitedFrom(InputStream inputStream) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(com.google.v.v vVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ah> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.clientInfo_ = aoVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(com.waze.bg.d.b bVar) {
        Objects.requireNonNull(bVar);
        this.country_ = bVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealPosition(com.waze.bg.d.j jVar) {
        Objects.requireNonNull(jVar);
        this.realPosition_ = jVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedRouteGeometry(i.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        this.selectedRouteGeometry_ = cVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "realPosition_", "country_", "clientInfo_", "selectedRouteGeometry_"});
        }
        if (iOrdinal == 3) {
            return new ah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ah.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ao getClientInfo() {
        ao aoVar = this.clientInfo_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public com.waze.bg.d.b getCountry() {
        com.waze.bg.d.b bVar = this.country_;
        return bVar == null ? com.waze.bg.d.b.getDefaultInstance() : bVar;
    }

    public com.waze.bg.d.j getRealPosition() {
        com.waze.bg.d.j jVar = this.realPosition_;
        return jVar == null ? com.waze.bg.d.j.getDefaultInstance() : jVar;
    }

    public i.a.a.c getSelectedRouteGeometry() {
        i.a.a.c cVar = this.selectedRouteGeometry_;
        return cVar == null ? i.a.a.c.getDefaultInstance() : cVar;
    }

    public boolean hasClientInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRealPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSelectedRouteGeometry() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ag newBuilder(ah ahVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(ahVar);
    }

    public static ah parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(com.google.v.v vVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ah parseFrom(com.google.v.z zVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ah parseFrom(com.google.v.z zVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ah parseFrom(InputStream inputStream) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(InputStream inputStream, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(ByteBuffer byteBuffer) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ah parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ah parseFrom(byte[] bArr) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ah parseFrom(byte[] bArr, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
