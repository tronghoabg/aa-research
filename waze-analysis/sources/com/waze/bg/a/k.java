package com.waze.bg.a;

import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends com.google.v.du<k, j> implements fj {
    public static final int ALERT_DETAILS_FIELD_NUMBER = 9;
    public static final int ALERT_TRAITS_FIELD_NUMBER = 10;
    public static final int AZYMUTH_FIELD_NUMBER = 6;
    private static final k DEFAULT_INSTANCE;
    public static final int ON_ROUTE_FIELD_NUMBER = 7;
    private static volatile fo<k> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int PRIORITY_FIELD_NUMBER = 8;
    public static final int SEGMENT_DIRECTION_ID_FIELD_NUMBER = 4;
    public static final int SEG_DIRECTION_FIELD_NUMBER = 5;
    public static final int SUB_TYPE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final el<bl> alertTraits_converter_ = new n(1);
    private ej alertDetails_;
    private ek alertTraits_ = emptyIntList();
    private int azymuth_;
    private int bitField0_;
    private boolean onRoute_;
    private i.b.s position_;
    private int priority_;
    private int segDirection_;
    private com.waze.bg.d.h segmentDirectionId_;
    private int subType_;
    private int type_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        com.google.v.du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlertTraits(bl blVar) {
        Objects.requireNonNull(blVar);
        ensureAlertTraitsIsMutable();
        this.alertTraits_.i(blVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlertTraits(Iterable<? extends bl> iterable) {
        ensureAlertTraitsIsMutable();
        Iterator<? extends bl> it = iterable.iterator();
        while (it.hasNext()) {
            this.alertTraits_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetails_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertTraits() {
        this.alertTraits_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzymuth() {
        this.bitField0_ &= -33;
        this.azymuth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnRoute() {
        this.bitField0_ &= -65;
        this.onRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -129;
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegDirection() {
        this.bitField0_ &= -17;
        this.segDirection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentDirectionId() {
        this.segmentDirectionId_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubType() {
        this.bitField0_ &= -3;
        this.subType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    private void ensureAlertTraitsIsMutable() {
        ek ekVar = this.alertTraits_;
        if (ekVar.c()) {
            return;
        }
        this.alertTraits_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(ej ejVar) {
        Objects.requireNonNull(ejVar);
        ej ejVar2 = this.alertDetails_;
        if (ejVar2 != null && ejVar2 != ej.getDefaultInstance()) {
            dk dkVarNewBuilder = ej.newBuilder(ejVar2);
            dkVarNewBuilder.mergeFrom((dk) ejVar);
            ejVar = dkVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.position_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.position_ = sVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentDirectionId(com.waze.bg.d.h hVar) {
        Objects.requireNonNull(hVar);
        com.waze.bg.d.h hVar2 = this.segmentDirectionId_;
        if (hVar2 != null && hVar2 != com.waze.bg.d.h.getDefaultInstance()) {
            com.waze.bg.d.g gVarNewBuilder = com.waze.bg.d.h.newBuilder(hVar2);
            gVarNewBuilder.mergeFrom((com.waze.bg.d.g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.segmentDirectionId_ = hVar;
        this.bitField0_ |= 8;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertTraits(int i2, bl blVar) {
        Objects.requireNonNull(blVar);
        ensureAlertTraitsIsMutable();
        this.alertTraits_.e(i2, blVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzymuth(int i2) {
        this.bitField0_ |= 32;
        this.azymuth_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnRoute(boolean z) {
        this.bitField0_ |= 64;
        this.onRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.position_ = sVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i2) {
        this.bitField0_ |= 128;
        this.priority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegDirection(com.waze.bg.d.f fVar) {
        this.segDirection_ = fVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentDirectionId(com.waze.bg.d.h hVar) {
        Objects.requireNonNull(hVar);
        this.segmentDirectionId_ = hVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubType(bk bkVar) {
        this.subType_ = bkVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bm bmVar) {
        this.type_ = bmVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006င\u0005\u0007ဇ\u0006\bင\u0007\tဉ\b\nࠞ", new Object[]{"bitField0_", "type_", o.f16561g, "subType_", o.f16559e, "position_", "segmentDirectionId_", "segDirection_", com.waze.bg.d.f.a(), "azymuth_", "onRoute_", "priority_", "alertDetails_", "alertTraits_", o.f16560f});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ej getAlertDetails() {
        ej ejVar = this.alertDetails_;
        return ejVar == null ? ej.getDefaultInstance() : ejVar;
    }

    public bl getAlertTraits(int i2) {
        bl blVarA = bl.a(this.alertTraits_.d(i2));
        return blVarA == null ? bl.ALERT_TRAIT_UNKNOWN : blVarA;
    }

    public int getAlertTraitsCount() {
        return this.alertTraits_.size();
    }

    public List<bl> getAlertTraitsList() {
        return new em(this.alertTraits_, alertTraits_converter_);
    }

    public int getAzymuth() {
        return this.azymuth_;
    }

    public boolean getOnRoute() {
        return this.onRoute_;
    }

    public i.b.s getPosition() {
        i.b.s sVar = this.position_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public int getPriority() {
        return this.priority_;
    }

    public com.waze.bg.d.f getSegDirection() {
        com.waze.bg.d.f fVarB = com.waze.bg.d.f.b(this.segDirection_);
        return fVarB == null ? com.waze.bg.d.f.UNKNOWN_DIRECTION : fVarB;
    }

    public com.waze.bg.d.h getSegmentDirectionId() {
        com.waze.bg.d.h hVar = this.segmentDirectionId_;
        return hVar == null ? com.waze.bg.d.h.getDefaultInstance() : hVar;
    }

    @Deprecated
    public bk getSubType() {
        bk bkVarA = bk.a(this.subType_);
        return bkVarA == null ? bk.NO_SUBTYPE : bkVarA;
    }

    @Deprecated
    public bm getType() {
        bm bmVarA = bm.a(this.type_);
        return bmVarA == null ? bm.UNKNOWN_TYPE : bmVarA;
    }

    public boolean hasAlertDetails() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasAzymuth() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOnRoute() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSegDirection() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSegmentDirectionId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasSubType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(com.google.v.z zVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (k) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
