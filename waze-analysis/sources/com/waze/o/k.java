package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import i.b.l.oh;
import i.b.l.oi;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends du<k, j> implements fj {
    private static final k DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 1;
    private static volatile fo<k> PARSER = null;
    public static final int ROUTING_OPTIONS_FIELD_NUMBER = 2;
    public static final int SHOW_OVERVIEW_FIELD_NUMBER = 3;
    private int bitField0_;
    private oi destination_;
    private byte memoizedIsInitialized = 2;
    private eo<i.c.a.a.o> routingOptions_ = emptyProtobufList();
    private boolean showOverview_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoutingOptions(Iterable<? extends i.c.a.a.o> iterable) {
        ensureRoutingOptionsIsMutable();
        com.google.v.c.addAll(iterable, this.routingOptions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutingOptions(int i2, i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingOptions() {
        this.routingOptions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowOverview() {
        this.bitField0_ &= -3;
        this.showOverview_ = false;
    }

    private void ensureRoutingOptionsIsMutable() {
        eo<i.c.a.a.o> eoVar = this.routingOptions_;
        if (eoVar.c()) {
            return;
        }
        this.routingOptions_ = du.mutableCopy(eoVar);
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(oi oiVar) {
        Objects.requireNonNull(oiVar);
        oi oiVar2 = this.destination_;
        if (oiVar2 != null && oiVar2 != oi.getDefaultInstance()) {
            oh ohVarNewBuilder = oi.newBuilder(oiVar2);
            ohVarNewBuilder.mergeFrom((oh) oiVar);
            oiVar = ohVarNewBuilder.buildPartial();
        }
        this.destination_ = oiVar;
        this.bitField0_ |= 1;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoutingOptions(int i2) {
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(oi oiVar) {
        Objects.requireNonNull(oiVar);
        this.destination_ = oiVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingOptions(int i2, i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowOverview(boolean z) {
        this.bitField0_ |= 2;
        this.showOverview_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"bitField0_", "destination_", "routingOptions_", i.c.a.a.o.class, "showOverview_"});
            case 3:
                return new k();
            case 4:
                return new j(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<k> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (k.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public oi getDestination() {
        oi oiVar = this.destination_;
        return oiVar == null ? oi.getDefaultInstance() : oiVar;
    }

    public i.c.a.a.o getRoutingOptions(int i2) {
        return this.routingOptions_.get(i2);
    }

    public int getRoutingOptionsCount() {
        return this.routingOptions_.size();
    }

    public List<i.c.a.a.o> getRoutingOptionsList() {
        return this.routingOptions_;
    }

    public i.c.a.a.p getRoutingOptionsOrBuilder(int i2) {
        return this.routingOptions_.get(i2);
    }

    public List<? extends i.c.a.a.p> getRoutingOptionsOrBuilderList() {
        return this.routingOptions_;
    }

    public boolean getShowOverview() {
        return this.showOverview_;
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShowOverview() {
        return (this.bitField0_ & 2) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(com.google.v.z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(com.google.v.z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutingOptions(i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.add(oVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
