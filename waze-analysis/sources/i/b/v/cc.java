package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cc extends com.google.v.du<cc, by> implements com.google.v.fj {
    public static final int BUSINESS_STATUS_FIELD_NUMBER = 3;
    private static final cc DEFAULT_INSTANCE;
    public static final int EXCEPTIONAL_HOUR_DAYS_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<cc> PARSER = null;
    public static final int PRICE_LEVEL_FIELD_NUMBER = 1;
    public static final int PRICE_LEVEL_SYMBOL_FIELD_NUMBER = 6;
    public static final int RATING_FIELD_NUMBER = 2;
    private int bitField0_;
    private int businessStatus_;
    private int priceLevel_;
    private cb rating_;
    private String priceLevelSymbol_ = "";
    private com.google.v.ek exceptionalHourDays_ = emptyIntList();

    static {
        cc ccVar = new cc();
        DEFAULT_INSTANCE = ccVar;
        com.google.v.du.registerDefaultInstance(cc.class, ccVar);
    }

    private cc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExceptionalHourDays(Iterable<? extends Integer> iterable) {
        ensureExceptionalHourDaysIsMutable();
        com.google.v.c.addAll(iterable, this.exceptionalHourDays_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExceptionalHourDays(int i2) {
        ensureExceptionalHourDaysIsMutable();
        this.exceptionalHourDays_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessStatus() {
        this.bitField0_ &= -9;
        this.businessStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExceptionalHourDays() {
        this.exceptionalHourDays_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceLevel() {
        this.bitField0_ &= -2;
        this.priceLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceLevelSymbol() {
        this.bitField0_ &= -3;
        this.priceLevelSymbol_ = getDefaultInstance().getPriceLevelSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.rating_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureExceptionalHourDaysIsMutable() {
        com.google.v.ek ekVar = this.exceptionalHourDays_;
        if (ekVar.c()) {
            return;
        }
        this.exceptionalHourDays_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static cc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRating(cb cbVar) {
        Objects.requireNonNull(cbVar);
        cb cbVar2 = this.rating_;
        if (cbVar2 != null && cbVar2 != cb.getDefaultInstance()) {
            ca caVarNewBuilder = cb.newBuilder(cbVar2);
            caVarNewBuilder.mergeFrom((ca) cbVar);
            cbVar = caVarNewBuilder.buildPartial();
        }
        this.rating_ = cbVar;
        this.bitField0_ |= 4;
    }

    public static by newBuilder() {
        return (by) DEFAULT_INSTANCE.createBuilder();
    }

    public static cc parseDelimitedFrom(InputStream inputStream) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(com.google.v.v vVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessStatus(bz bzVar) {
        this.businessStatus_ = bzVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExceptionalHourDays(int i2, int i3) {
        ensureExceptionalHourDaysIsMutable();
        this.exceptionalHourDays_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceLevel(int i2) {
        this.bitField0_ |= 1;
        this.priceLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceLevelSymbol(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.priceLevelSymbol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceLevelSymbolBytes(com.google.v.v vVar) {
        this.priceLevelSymbol_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(cb cbVar) {
        Objects.requireNonNull(cbVar);
        this.rating_ = cbVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0002\u0003᠌\u0003\u0005\u0016\u0006ဈ\u0001", new Object[]{"bitField0_", "priceLevel_", "rating_", "businessStatus_", z.f49564k, "exceptionalHourDays_", "priceLevelSymbol_"});
        }
        if (iOrdinal == 3) {
            return new cc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new by(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bz getBusinessStatus() {
        bz bzVarA = bz.a(this.businessStatus_);
        return bzVarA == null ? bz.BUSINESS_STATUS_UNSPECIFIED : bzVarA;
    }

    public int getExceptionalHourDays(int i2) {
        return this.exceptionalHourDays_.d(i2);
    }

    public int getExceptionalHourDaysCount() {
        return this.exceptionalHourDays_.size();
    }

    public List<Integer> getExceptionalHourDaysList() {
        return this.exceptionalHourDays_;
    }

    public int getPriceLevel() {
        return this.priceLevel_;
    }

    public String getPriceLevelSymbol() {
        return this.priceLevelSymbol_;
    }

    public com.google.v.v getPriceLevelSymbolBytes() {
        return com.google.v.v.s(this.priceLevelSymbol_);
    }

    public cb getRating() {
        cb cbVar = this.rating_;
        return cbVar == null ? cb.getDefaultInstance() : cbVar;
    }

    public boolean hasBusinessStatus() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPriceLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPriceLevelSymbol() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRating() {
        return (this.bitField0_ & 4) != 0;
    }

    public static by newBuilder(cc ccVar) {
        return (by) DEFAULT_INSTANCE.createBuilder(ccVar);
    }

    public static cc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cc parseFrom(com.google.v.z zVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cc parseFrom(InputStream inputStream) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(ByteBuffer byteBuffer) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cc parseFrom(byte[] bArr) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
