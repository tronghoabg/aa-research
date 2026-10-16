package com.waze.bg.e.a;

import i.b.l.od;
import i.b.l.og;
import i.b.l.qj;
import i.b.l.qq;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ic extends com.google.v.du<ic, ib> implements com.google.v.fj {
    public static final int CLOSURE_INFO_FIELD_NUMBER = 2;
    private static final ic DEFAULT_INSTANCE;
    public static final int INFORMATION_CARD_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ic> PARSER = null;
    public static final int ROUTE_GROUPS_FIELD_NUMBER = 1;
    public static final int VISUAL_IMPACT_INFO_FIELD_NUMBER = 4;
    private int bitField0_;
    private og closureInfo_;
    private hy informationCard_;
    private com.google.v.eo<gw> routeGroups_ = emptyProtobufList();
    private qq visualImpactInfo_;

    static {
        ic icVar = new ic();
        DEFAULT_INSTANCE = icVar;
        com.google.v.du.registerDefaultInstance(ic.class, icVar);
    }

    private ic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteGroups(Iterable<? extends gw> iterable) {
        ensureRouteGroupsIsMutable();
        com.google.v.c.addAll(iterable, this.routeGroups_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteGroups(int i2, gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensureRouteGroupsIsMutable();
        this.routeGroups_.add(i2, gwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosureInfo() {
        this.closureInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInformationCard() {
        this.informationCard_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteGroups() {
        this.routeGroups_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisualImpactInfo() {
        this.visualImpactInfo_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureRouteGroupsIsMutable() {
        com.google.v.eo<gw> eoVar = this.routeGroups_;
        if (eoVar.c()) {
            return;
        }
        this.routeGroups_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosureInfo(og ogVar) {
        Objects.requireNonNull(ogVar);
        og ogVar2 = this.closureInfo_;
        if (ogVar2 != null && ogVar2 != og.getDefaultInstance()) {
            od odVarNewBuilder = og.newBuilder(ogVar2);
            odVarNewBuilder.mergeFrom((od) ogVar);
            ogVar = odVarNewBuilder.buildPartial();
        }
        this.closureInfo_ = ogVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInformationCard(hy hyVar) {
        Objects.requireNonNull(hyVar);
        hy hyVar2 = this.informationCard_;
        if (hyVar2 != null && hyVar2 != hy.getDefaultInstance()) {
            hx hxVarNewBuilder = hy.newBuilder(hyVar2);
            hxVarNewBuilder.mergeFrom((hx) hyVar);
            hyVar = hxVarNewBuilder.buildPartial();
        }
        this.informationCard_ = hyVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVisualImpactInfo(qq qqVar) {
        Objects.requireNonNull(qqVar);
        qq qqVar2 = this.visualImpactInfo_;
        if (qqVar2 != null && qqVar2 != qq.getDefaultInstance()) {
            qj qjVarNewBuilder = qq.newBuilder(qqVar2);
            qjVarNewBuilder.mergeFrom((qj) qqVar);
            qqVar = qjVarNewBuilder.buildPartial();
        }
        this.visualImpactInfo_ = qqVar;
        this.bitField0_ |= 4;
    }

    public static ib newBuilder() {
        return (ib) DEFAULT_INSTANCE.createBuilder();
    }

    public static ic parseDelimitedFrom(InputStream inputStream) {
        return (ic) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ic parseFrom(com.google.v.v vVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ic> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRouteGroups(int i2) {
        ensureRouteGroupsIsMutable();
        this.routeGroups_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosureInfo(og ogVar) {
        Objects.requireNonNull(ogVar);
        this.closureInfo_ = ogVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInformationCard(hy hyVar) {
        Objects.requireNonNull(hyVar);
        this.informationCard_ = hyVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteGroups(int i2, gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensureRouteGroupsIsMutable();
        this.routeGroups_.set(i2, gwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisualImpactInfo(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.visualImpactInfo_ = qqVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "routeGroups_", gw.class, "closureInfo_", "informationCard_", "visualImpactInfo_"});
        }
        if (iOrdinal == 3) {
            return new ic();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ib(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ic> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ic.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public og getClosureInfo() {
        og ogVar = this.closureInfo_;
        return ogVar == null ? og.getDefaultInstance() : ogVar;
    }

    public hy getInformationCard() {
        hy hyVar = this.informationCard_;
        return hyVar == null ? hy.getDefaultInstance() : hyVar;
    }

    public gw getRouteGroups(int i2) {
        return this.routeGroups_.get(i2);
    }

    public int getRouteGroupsCount() {
        return this.routeGroups_.size();
    }

    public List<gw> getRouteGroupsList() {
        return this.routeGroups_;
    }

    public gx getRouteGroupsOrBuilder(int i2) {
        return this.routeGroups_.get(i2);
    }

    public List<? extends gx> getRouteGroupsOrBuilderList() {
        return this.routeGroups_;
    }

    public qq getVisualImpactInfo() {
        qq qqVar = this.visualImpactInfo_;
        return qqVar == null ? qq.getDefaultInstance() : qqVar;
    }

    public boolean hasClosureInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInformationCard() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVisualImpactInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ib newBuilder(ic icVar) {
        return (ib) DEFAULT_INSTANCE.createBuilder(icVar);
    }

    public static ic parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ic) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ic parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ic parseFrom(com.google.v.z zVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ic parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteGroups(gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensureRouteGroupsIsMutable();
        this.routeGroups_.add(gwVar);
    }

    public static ic parseFrom(InputStream inputStream) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ic parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ic parseFrom(ByteBuffer byteBuffer) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ic parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ic parseFrom(byte[] bArr) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ic parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
