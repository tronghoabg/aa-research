package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends du<m, l> implements fj {
    public static final int ALT_ROUTES_FIELD_NUMBER = 2;
    private static final m DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    private static volatile fo<m> PARSER = null;
    public static final int ROUTE_ID_FIELD_NUMBER = 1;
    private eo<h> altRoutes_ = emptyProtobufList();
    private int bitField0_;
    private ce destination_;
    private long routeId_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAltRoutes(Iterable<? extends h> iterable) {
        ensureAltRoutesIsMutable();
        com.google.v.c.addAll(iterable, this.altRoutes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAltRoutes(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureAltRoutesIsMutable();
        this.altRoutes_.add(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltRoutes() {
        this.altRoutes_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteId() {
        this.bitField0_ &= -2;
        this.routeId_ = 0L;
    }

    private void ensureAltRoutesIsMutable() {
        eo<h> eoVar = this.altRoutes_;
        if (eoVar.c()) {
            return;
        }
        this.altRoutes_ = du.mutableCopy(eoVar);
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.destination_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.destination_ = ceVar;
        this.bitField0_ |= 2;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAltRoutes(int i2) {
        ensureAltRoutesIsMutable();
        this.altRoutes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltRoutes(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureAltRoutesIsMutable();
        this.altRoutes_.set(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.destination_ = ceVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteId(long j2) {
        this.bitField0_ |= 1;
        this.routeId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "routeId_", "altRoutes_", h.class, "destination_"});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public h getAltRoutes(int i2) {
        return this.altRoutes_.get(i2);
    }

    public int getAltRoutesCount() {
        return this.altRoutes_.size();
    }

    public List<h> getAltRoutesList() {
        return this.altRoutes_;
    }

    public i getAltRoutesOrBuilder(int i2) {
        return this.altRoutes_.get(i2);
    }

    public List<? extends i> getAltRoutesOrBuilderList() {
        return this.altRoutes_;
    }

    public ce getDestination() {
        ce ceVar = this.destination_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public long getRouteId() {
        return this.routeId_;
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAltRoutes(h hVar) {
        Objects.requireNonNull(hVar);
        ensureAltRoutesIsMutable();
        this.altRoutes_.add(hVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
