package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hj extends com.google.v.du<hj, hc> implements com.google.v.fj {
    public static final int CALORIES_FIELD_NUMBER = 1;
    public static final int CHOLESTEROL_FIELD_NUMBER = 3;
    private static final hj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hj> PARSER = null;
    public static final int PROTEIN_FIELD_NUMBER = 6;
    public static final int SODIUM_FIELD_NUMBER = 4;
    public static final int TOTAL_CARBOHYDRATE_FIELD_NUMBER = 5;
    public static final int TOTAL_FAT_FIELD_NUMBER = 2;
    private int bitField0_;
    private he calories_;
    private hi cholesterol_;
    private hi protein_;
    private hi sodium_;
    private hi totalCarbohydrate_;
    private hi totalFat_;

    static {
        hj hjVar = new hj();
        DEFAULT_INSTANCE = hjVar;
        com.google.v.du.registerDefaultInstance(hj.class, hjVar);
    }

    private hj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalories() {
        this.calories_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCholesterol() {
        this.cholesterol_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtein() {
        this.protein_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSodium() {
        this.sodium_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalCarbohydrate() {
        this.totalCarbohydrate_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalFat() {
        this.totalFat_ = null;
        this.bitField0_ &= -3;
    }

    public static hj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCalories(he heVar) {
        Objects.requireNonNull(heVar);
        he heVar2 = this.calories_;
        if (heVar2 != null && heVar2 != he.getDefaultInstance()) {
            hd hdVarNewBuilder = he.newBuilder(heVar2);
            hdVarNewBuilder.mergeFrom((hd) heVar);
            heVar = hdVarNewBuilder.buildPartial();
        }
        this.calories_ = heVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCholesterol(hi hiVar) {
        Objects.requireNonNull(hiVar);
        hi hiVar2 = this.cholesterol_;
        if (hiVar2 != null && hiVar2 != hi.getDefaultInstance()) {
            hh hhVarNewBuilder = hi.newBuilder(hiVar2);
            hhVarNewBuilder.mergeFrom((hh) hiVar);
            hiVar = hhVarNewBuilder.buildPartial();
        }
        this.cholesterol_ = hiVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProtein(hi hiVar) {
        Objects.requireNonNull(hiVar);
        hi hiVar2 = this.protein_;
        if (hiVar2 != null && hiVar2 != hi.getDefaultInstance()) {
            hh hhVarNewBuilder = hi.newBuilder(hiVar2);
            hhVarNewBuilder.mergeFrom((hh) hiVar);
            hiVar = hhVarNewBuilder.buildPartial();
        }
        this.protein_ = hiVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSodium(hi hiVar) {
        Objects.requireNonNull(hiVar);
        hi hiVar2 = this.sodium_;
        if (hiVar2 != null && hiVar2 != hi.getDefaultInstance()) {
            hh hhVarNewBuilder = hi.newBuilder(hiVar2);
            hhVarNewBuilder.mergeFrom((hh) hiVar);
            hiVar = hhVarNewBuilder.buildPartial();
        }
        this.sodium_ = hiVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTotalCarbohydrate(hi hiVar) {
        Objects.requireNonNull(hiVar);
        hi hiVar2 = this.totalCarbohydrate_;
        if (hiVar2 != null && hiVar2 != hi.getDefaultInstance()) {
            hh hhVarNewBuilder = hi.newBuilder(hiVar2);
            hhVarNewBuilder.mergeFrom((hh) hiVar);
            hiVar = hhVarNewBuilder.buildPartial();
        }
        this.totalCarbohydrate_ = hiVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTotalFat(hi hiVar) {
        Objects.requireNonNull(hiVar);
        hi hiVar2 = this.totalFat_;
        if (hiVar2 != null && hiVar2 != hi.getDefaultInstance()) {
            hh hhVarNewBuilder = hi.newBuilder(hiVar2);
            hhVarNewBuilder.mergeFrom((hh) hiVar);
            hiVar = hhVarNewBuilder.buildPartial();
        }
        this.totalFat_ = hiVar;
        this.bitField0_ |= 2;
    }

    public static hc newBuilder() {
        return (hc) DEFAULT_INSTANCE.createBuilder();
    }

    public static hj parseDelimitedFrom(InputStream inputStream) {
        return (hj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hj parseFrom(com.google.v.v vVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalories(he heVar) {
        Objects.requireNonNull(heVar);
        this.calories_ = heVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCholesterol(hi hiVar) {
        Objects.requireNonNull(hiVar);
        this.cholesterol_ = hiVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtein(hi hiVar) {
        Objects.requireNonNull(hiVar);
        this.protein_ = hiVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSodium(hi hiVar) {
        Objects.requireNonNull(hiVar);
        this.sodium_ = hiVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalCarbohydrate(hi hiVar) {
        Objects.requireNonNull(hiVar);
        this.totalCarbohydrate_ = hiVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalFat(hi hiVar) {
        Objects.requireNonNull(hiVar);
        this.totalFat_ = hiVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "calories_", "totalFat_", "cholesterol_", "sodium_", "totalCarbohydrate_", "protein_"});
        }
        if (iOrdinal == 3) {
            return new hj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public he getCalories() {
        he heVar = this.calories_;
        return heVar == null ? he.getDefaultInstance() : heVar;
    }

    public hi getCholesterol() {
        hi hiVar = this.cholesterol_;
        return hiVar == null ? hi.getDefaultInstance() : hiVar;
    }

    public hi getProtein() {
        hi hiVar = this.protein_;
        return hiVar == null ? hi.getDefaultInstance() : hiVar;
    }

    public hi getSodium() {
        hi hiVar = this.sodium_;
        return hiVar == null ? hi.getDefaultInstance() : hiVar;
    }

    public hi getTotalCarbohydrate() {
        hi hiVar = this.totalCarbohydrate_;
        return hiVar == null ? hi.getDefaultInstance() : hiVar;
    }

    public hi getTotalFat() {
        hi hiVar = this.totalFat_;
        return hiVar == null ? hi.getDefaultInstance() : hiVar;
    }

    public boolean hasCalories() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCholesterol() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProtein() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSodium() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTotalCarbohydrate() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTotalFat() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hc newBuilder(hj hjVar) {
        return (hc) DEFAULT_INSTANCE.createBuilder(hjVar);
    }

    public static hj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hj parseFrom(com.google.v.z zVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hj parseFrom(InputStream inputStream) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hj parseFrom(ByteBuffer byteBuffer) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hj parseFrom(byte[] bArr) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
