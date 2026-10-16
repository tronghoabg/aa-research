package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lo extends com.google.v.du<lo, lk> implements com.google.v.fj {
    public static final int CATEGORY_FIELD_NUMBER = 3;
    public static final int CONDITION_FIELD_NUMBER = 4;
    private static final lo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<lo> PARSER = null;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 8;
    public static final int SPEED_WITH_UNIT_FIELD_NUMBER = 5;
    public static final int UNLIMITED_SPEED_FIELD_NUMBER = 7;
    public static final int VARIABLE_SPEED_FIELD_NUMBER = 6;
    private int bitField0_;
    private int category_;
    private int sourceType_;
    private Object speedValue_;
    private int speedValueCase_ = 0;
    private com.google.v.eo<ka> condition_ = emptyProtobufList();

    static {
        lo loVar = new lo();
        DEFAULT_INSTANCE = loVar;
        com.google.v.du.registerDefaultInstance(lo.class, loVar);
    }

    private lo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCondition(Iterable<? extends ka> iterable) {
        ensureConditionIsMutable();
        com.google.v.c.addAll(iterable, this.condition_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCondition(int i2, ka kaVar) {
        Objects.requireNonNull(kaVar);
        ensureConditionIsMutable();
        this.condition_.add(i2, kaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.bitField0_ &= -2;
        this.category_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCondition() {
        this.condition_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceType() {
        this.bitField0_ &= -3;
        this.sourceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedValue() {
        this.speedValueCase_ = 0;
        this.speedValue_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedWithUnit() {
        if (this.speedValueCase_ == 5) {
            this.speedValueCase_ = 0;
            this.speedValue_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnlimitedSpeed() {
        if (this.speedValueCase_ == 7) {
            this.speedValueCase_ = 0;
            this.speedValue_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVariableSpeed() {
        if (this.speedValueCase_ == 6) {
            this.speedValueCase_ = 0;
            this.speedValue_ = null;
        }
    }

    private void ensureConditionIsMutable() {
        com.google.v.eo<ka> eoVar = this.condition_;
        if (eoVar.c()) {
            return;
        }
        this.condition_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static lo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedWithUnit(ls lsVar) {
        Objects.requireNonNull(lsVar);
        if (this.speedValueCase_ == 5 && this.speedValue_ != ls.getDefaultInstance()) {
            lp lpVarNewBuilder = ls.newBuilder((ls) this.speedValue_);
            lpVarNewBuilder.mergeFrom((lp) lsVar);
            lsVar = lpVarNewBuilder.buildPartial();
        }
        this.speedValue_ = lsVar;
        this.speedValueCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnlimitedSpeed(nx nxVar) {
        Objects.requireNonNull(nxVar);
        if (this.speedValueCase_ == 7 && this.speedValue_ != nx.getDefaultInstance()) {
            nw nwVarNewBuilder = nx.newBuilder((nx) this.speedValue_);
            nwVarNewBuilder.mergeFrom((nw) nxVar);
            nxVar = nwVarNewBuilder.buildPartial();
        }
        this.speedValue_ = nxVar;
        this.speedValueCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVariableSpeed(nz nzVar) {
        Objects.requireNonNull(nzVar);
        if (this.speedValueCase_ == 6 && this.speedValue_ != nz.getDefaultInstance()) {
            ny nyVarNewBuilder = nz.newBuilder((nz) this.speedValue_);
            nyVarNewBuilder.mergeFrom((ny) nzVar);
            nzVar = nyVarNewBuilder.buildPartial();
        }
        this.speedValue_ = nzVar;
        this.speedValueCase_ = 6;
    }

    public static lk newBuilder() {
        return (lk) DEFAULT_INSTANCE.createBuilder();
    }

    public static lo parseDelimitedFrom(InputStream inputStream) {
        return (lo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lo parseFrom(com.google.v.v vVar) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCondition(int i2) {
        ensureConditionIsMutable();
        this.condition_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(ll llVar) {
        this.category_ = llVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCondition(int i2, ka kaVar) {
        Objects.requireNonNull(kaVar);
        ensureConditionIsMutable();
        this.condition_.set(i2, kaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceType(lm lmVar) {
        this.sourceType_ = lmVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedWithUnit(ls lsVar) {
        Objects.requireNonNull(lsVar);
        this.speedValue_ = lsVar;
        this.speedValueCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnlimitedSpeed(nx nxVar) {
        Objects.requireNonNull(nxVar);
        this.speedValue_ = nxVar;
        this.speedValueCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVariableSpeed(nz nzVar) {
        Objects.requireNonNull(nzVar);
        this.speedValue_ = nzVar;
        this.speedValueCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0003\b\u0006\u0000\u0001\u0000\u0003᠌\u0000\u0004\u001b\u0005<\u0000\u0006<\u0000\u0007<\u0000\b᠌\u0001", new Object[]{"speedValue_", "speedValueCase_", "bitField0_", "category_", ha.u, "condition_", ka.class, ls.class, nz.class, nx.class, "sourceType_", lq.f12089b});
        }
        if (iOrdinal == 3) {
            return new lo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ll getCategory() {
        ll llVarA = ll.a(this.category_);
        return llVarA == null ? ll.SPEED_LIMIT_CATEGORY_UNKNOWN : llVarA;
    }

    public ka getCondition(int i2) {
        return this.condition_.get(i2);
    }

    public int getConditionCount() {
        return this.condition_.size();
    }

    public List<ka> getConditionList() {
        return this.condition_;
    }

    public kb getConditionOrBuilder(int i2) {
        return this.condition_.get(i2);
    }

    public List<? extends kb> getConditionOrBuilderList() {
        return this.condition_;
    }

    public lm getSourceType() {
        lm lmVarA = lm.a(this.sourceType_);
        return lmVarA == null ? lm.SPEED_LIMIT_SOURCE_TYPE_UNKNOWN : lmVarA;
    }

    public ln getSpeedValueCase() {
        int i2 = this.speedValueCase_;
        if (i2 == 0) {
            return ln.f12086d;
        }
        if (i2 == 5) {
            return ln.f12083a;
        }
        if (i2 == 6) {
            return ln.f12084b;
        }
        if (i2 != 7) {
            return null;
        }
        return ln.f12085c;
    }

    public ls getSpeedWithUnit() {
        return this.speedValueCase_ == 5 ? (ls) this.speedValue_ : ls.getDefaultInstance();
    }

    public nx getUnlimitedSpeed() {
        return this.speedValueCase_ == 7 ? (nx) this.speedValue_ : nx.getDefaultInstance();
    }

    public nz getVariableSpeed() {
        return this.speedValueCase_ == 6 ? (nz) this.speedValue_ : nz.getDefaultInstance();
    }

    public boolean hasCategory() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSourceType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSpeedWithUnit() {
        return this.speedValueCase_ == 5;
    }

    public boolean hasUnlimitedSpeed() {
        return this.speedValueCase_ == 7;
    }

    public boolean hasVariableSpeed() {
        return this.speedValueCase_ == 6;
    }

    public static lk newBuilder(lo loVar) {
        return (lk) DEFAULT_INSTANCE.createBuilder(loVar);
    }

    public static lo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lo parseFrom(com.google.v.z zVar) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCondition(ka kaVar) {
        Objects.requireNonNull(kaVar);
        ensureConditionIsMutable();
        this.condition_.add(kaVar);
    }

    public static lo parseFrom(InputStream inputStream) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lo parseFrom(ByteBuffer byteBuffer) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lo parseFrom(byte[] bArr) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
