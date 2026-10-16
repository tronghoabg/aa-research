package com.google.w.g;

import com.google.k.a.a.b.bv;
import com.google.k.a.a.b.bw;
import com.google.k.a.a.b.bx;
import com.google.k.a.a.cy;
import com.google.k.a.a.cz;
import com.google.k.a.a.eb;
import com.google.k.a.a.ec;
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
public final class p extends du<p, j> implements fj {
    public static final int ASSOCIATED_HOST_FIELD_NUMBER = 2;
    private static final p DEFAULT_INSTANCE;
    public static final int EV_CHARGERS_FIELD_NUMBER = 3;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 6;
    public static final int GELFS_ID_FIELD_NUMBER = 8;
    public static final int OCPI_ID_FIELD_NUMBER = 7;
    public static final int OEM_RESTRICTION_FIELD_NUMBER = 4;
    private static volatile fo<p> PARSER;
    private bw associatedHost_;
    private int bitField0_;
    private int oemRestriction_;
    private byte memoizedIsInitialized = 2;
    private eo<m> externalId_ = emptyProtobufList();
    private eo<cy> ocpiId_ = emptyProtobufList();
    private eo<eb> gelfsId_ = emptyProtobufList();
    private eo<bw> evChargers_ = emptyProtobufList();

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvChargers(Iterable<? extends bw> iterable) {
        ensureEvChargersIsMutable();
        com.google.v.c.addAll(iterable, this.evChargers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExternalId(Iterable<? extends m> iterable) {
        ensureExternalIdIsMutable();
        com.google.v.c.addAll(iterable, this.externalId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGelfsId(Iterable<? extends eb> iterable) {
        ensureGelfsIdIsMutable();
        com.google.v.c.addAll(iterable, this.gelfsId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOcpiId(Iterable<? extends cy> iterable) {
        ensureOcpiIdIsMutable();
        com.google.v.c.addAll(iterable, this.ocpiId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvChargers(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureEvChargersIsMutable();
        this.evChargers_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExternalId(int i2, m mVar) {
        Objects.requireNonNull(mVar);
        ensureExternalIdIsMutable();
        this.externalId_.add(i2, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGelfsId(int i2, eb ebVar) {
        Objects.requireNonNull(ebVar);
        ensureGelfsIdIsMutable();
        this.gelfsId_.add(i2, ebVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOcpiId(int i2, cy cyVar) {
        Objects.requireNonNull(cyVar);
        ensureOcpiIdIsMutable();
        this.ocpiId_.add(i2, cyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssociatedHost() {
        this.associatedHost_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvChargers() {
        this.evChargers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalId() {
        this.externalId_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGelfsId() {
        this.gelfsId_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOcpiId() {
        this.ocpiId_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOemRestriction() {
        this.bitField0_ &= -2;
        this.oemRestriction_ = 0;
    }

    private void ensureEvChargersIsMutable() {
        eo<bw> eoVar = this.evChargers_;
        if (eoVar.c()) {
            return;
        }
        this.evChargers_ = du.mutableCopy(eoVar);
    }

    private void ensureExternalIdIsMutable() {
        eo<m> eoVar = this.externalId_;
        if (eoVar.c()) {
            return;
        }
        this.externalId_ = du.mutableCopy(eoVar);
    }

    private void ensureGelfsIdIsMutable() {
        eo<eb> eoVar = this.gelfsId_;
        if (eoVar.c()) {
            return;
        }
        this.gelfsId_ = du.mutableCopy(eoVar);
    }

    private void ensureOcpiIdIsMutable() {
        eo<cy> eoVar = this.ocpiId_;
        if (eoVar.c()) {
            return;
        }
        this.ocpiId_ = du.mutableCopy(eoVar);
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAssociatedHost(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.associatedHost_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.associatedHost_ = bwVar;
        this.bitField0_ |= 2;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvChargers(int i2) {
        ensureEvChargersIsMutable();
        this.evChargers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExternalId(int i2) {
        ensureExternalIdIsMutable();
        this.externalId_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGelfsId(int i2) {
        ensureGelfsIdIsMutable();
        this.gelfsId_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOcpiId(int i2) {
        ensureOcpiIdIsMutable();
        this.ocpiId_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssociatedHost(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.associatedHost_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvChargers(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureEvChargersIsMutable();
        this.evChargers_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalId(int i2, m mVar) {
        Objects.requireNonNull(mVar);
        ensureExternalIdIsMutable();
        this.externalId_.set(i2, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGelfsId(int i2, eb ebVar) {
        Objects.requireNonNull(ebVar);
        ensureGelfsIdIsMutable();
        this.gelfsId_.set(i2, ebVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOcpiId(int i2, cy cyVar) {
        Objects.requireNonNull(cyVar);
        ensureOcpiIdIsMutable();
        this.ocpiId_.set(i2, cyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOemRestriction(o oVar) {
        this.oemRestriction_ = oVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOemRestrictionValue(int i2) {
        this.bitField0_ |= 1;
        this.oemRestriction_ = i2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0004\u0002\u0002ᐉ\u0001\u0003Л\u0004ဌ\u0000\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"bitField0_", "associatedHost_", "evChargers_", bw.class, "oemRestriction_", "externalId_", m.class, "ocpiId_", cy.class, "gelfsId_", eb.class});
            case 3:
                return new p();
            case 4:
                return new j(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<p> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (p.class) {
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

    public bw getAssociatedHost() {
        bw bwVar = this.associatedHost_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public bw getEvChargers(int i2) {
        return this.evChargers_.get(i2);
    }

    public int getEvChargersCount() {
        return this.evChargers_.size();
    }

    public List<bw> getEvChargersList() {
        return this.evChargers_;
    }

    public bx getEvChargersOrBuilder(int i2) {
        return this.evChargers_.get(i2);
    }

    public List<? extends bx> getEvChargersOrBuilderList() {
        return this.evChargers_;
    }

    public m getExternalId(int i2) {
        return this.externalId_.get(i2);
    }

    public int getExternalIdCount() {
        return this.externalId_.size();
    }

    public List<m> getExternalIdList() {
        return this.externalId_;
    }

    public n getExternalIdOrBuilder(int i2) {
        return this.externalId_.get(i2);
    }

    public List<? extends n> getExternalIdOrBuilderList() {
        return this.externalId_;
    }

    public eb getGelfsId(int i2) {
        return this.gelfsId_.get(i2);
    }

    public int getGelfsIdCount() {
        return this.gelfsId_.size();
    }

    public List<eb> getGelfsIdList() {
        return this.gelfsId_;
    }

    public ec getGelfsIdOrBuilder(int i2) {
        return this.gelfsId_.get(i2);
    }

    public List<? extends ec> getGelfsIdOrBuilderList() {
        return this.gelfsId_;
    }

    public cy getOcpiId(int i2) {
        return this.ocpiId_.get(i2);
    }

    public int getOcpiIdCount() {
        return this.ocpiId_.size();
    }

    public List<cy> getOcpiIdList() {
        return this.ocpiId_;
    }

    public cz getOcpiIdOrBuilder(int i2) {
        return this.ocpiId_.get(i2);
    }

    public List<? extends cz> getOcpiIdOrBuilderList() {
        return this.ocpiId_;
    }

    public o getOemRestriction() {
        int i2 = this.oemRestriction_;
        o oVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : o.RIVIAN : o.NACS_PARTNER : o.TESLA : o.OEM_RESTRICTION_NONE;
        return oVar == null ? o.UNRECOGNIZED : oVar;
    }

    public int getOemRestrictionValue() {
        return this.oemRestriction_;
    }

    public boolean hasAssociatedHost() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOemRestriction() {
        return (this.bitField0_ & 1) != 0;
    }

    public static j newBuilder(p pVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(v vVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(z zVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvChargers(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureEvChargersIsMutable();
        this.evChargers_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExternalId(m mVar) {
        Objects.requireNonNull(mVar);
        ensureExternalIdIsMutable();
        this.externalId_.add(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGelfsId(eb ebVar) {
        Objects.requireNonNull(ebVar);
        ensureGelfsIdIsMutable();
        this.gelfsId_.add(ebVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOcpiId(cy cyVar) {
        Objects.requireNonNull(cyVar);
        ensureOcpiIdIsMutable();
        this.ocpiId_.add(cyVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
