package com.google.w.g;

import com.google.k.a.a.b.bv;
import com.google.k.a.a.b.bw;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends du<i, a> implements fj {
    public static final int CONNECTORS_FIELD_NUMBER = 3;
    private static final i DEFAULT_INSTANCE;
    public static final int EVSE_ID_FIELD_NUMBER = 2;
    public static final int EV_STATION_FIELD_NUMBER = 4;
    private static volatile fo<i> PARSER = null;
    public static final int UID_FIELD_NUMBER = 1;
    private int bitField0_;
    private bw evStation_;
    private byte memoizedIsInitialized = 2;
    private eo<g> uid_ = emptyProtobufList();
    private String evseId_ = "";
    private eo<d> connectors_ = emptyProtobufList();

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConnectors(Iterable<? extends d> iterable) {
        ensureConnectorsIsMutable();
        com.google.v.c.addAll(iterable, this.connectors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUid(Iterable<? extends g> iterable) {
        ensureUidIsMutable();
        com.google.v.c.addAll(iterable, this.uid_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConnectors(int i2, d dVar) {
        Objects.requireNonNull(dVar);
        ensureConnectorsIsMutable();
        this.connectors_.add(i2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUid(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureUidIsMutable();
        this.uid_.add(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectors() {
        this.connectors_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvStation() {
        this.evStation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvseId() {
        this.bitField0_ &= -2;
        this.evseId_ = getDefaultInstance().getEvseId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = emptyProtobufList();
    }

    private void ensureConnectorsIsMutable() {
        eo<d> eoVar = this.connectors_;
        if (eoVar.c()) {
            return;
        }
        this.connectors_ = du.mutableCopy(eoVar);
    }

    private void ensureUidIsMutable() {
        eo<g> eoVar = this.uid_;
        if (eoVar.c()) {
            return;
        }
        this.uid_ = du.mutableCopy(eoVar);
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvStation(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.evStation_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.evStation_ = bwVar;
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConnectors(int i2) {
        ensureConnectorsIsMutable();
        this.connectors_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUid(int i2) {
        ensureUidIsMutable();
        this.uid_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectors(int i2, d dVar) {
        Objects.requireNonNull(dVar);
        ensureConnectorsIsMutable();
        this.connectors_.set(i2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvStation(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.evStation_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvseId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.evseId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvseIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.evseId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureUidIsMutable();
        this.uid_.set(i2, gVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001\u001b\u0002ለ\u0000\u0003\u001b\u0004ᐉ\u0001", new Object[]{"bitField0_", "uid_", g.class, "evseId_", "connectors_", d.class, "evStation_"});
            case 3:
                return new i();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<i> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (i.class) {
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

    public d getConnectors(int i2) {
        return this.connectors_.get(i2);
    }

    public int getConnectorsCount() {
        return this.connectors_.size();
    }

    public List<d> getConnectorsList() {
        return this.connectors_;
    }

    public e getConnectorsOrBuilder(int i2) {
        return this.connectors_.get(i2);
    }

    public List<? extends e> getConnectorsOrBuilderList() {
        return this.connectors_;
    }

    public bw getEvStation() {
        bw bwVar = this.evStation_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public String getEvseId() {
        return this.evseId_;
    }

    public v getEvseIdBytes() {
        return v.s(this.evseId_);
    }

    public g getUid(int i2) {
        return this.uid_.get(i2);
    }

    public int getUidCount() {
        return this.uid_.size();
    }

    public List<g> getUidList() {
        return this.uid_;
    }

    public h getUidOrBuilder(int i2) {
        return this.uid_.get(i2);
    }

    public List<? extends h> getUidOrBuilderList() {
        return this.uid_;
    }

    public boolean hasEvStation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEvseId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(i iVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConnectors(d dVar) {
        Objects.requireNonNull(dVar);
        ensureConnectorsIsMutable();
        this.connectors_.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUid(g gVar) {
        Objects.requireNonNull(gVar);
        ensureUidIsMutable();
        this.uid_.add(gVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
