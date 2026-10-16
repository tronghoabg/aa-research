package com.waze.ch;

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
/* loaded from: classes7.dex */
public final class x extends du<x, v> implements fj {
    private static final x DEFAULT_INSTANCE;
    public static final int EMPTY_ADS_REASON_FIELD_NUMBER = 4;
    public static final int IS_INVISIBLE_FIELD_NUMBER = 7;
    public static final int IS_TEST_FIELD_NUMBER = 6;
    public static final int KEEP_AD_CACHE_FIELD_NUMBER = 3;
    private static volatile fo<x> PARSER = null;
    public static final int PIN_AD_FIELD_NUMBER = 1;
    public static final int PIN_AD_PARAMETERS_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 5;
    private int bitField0_;
    private int emptyAdsReason_;
    private boolean isInvisible_;
    private boolean isTest_;
    private boolean keepAdCache_;
    private af pinAdParameters_;
    private eo<ac> pinAd_ = emptyProtobufList();
    private i.b.ah status_;

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPinAd(Iterable<? extends ac> iterable) {
        ensurePinAdIsMutable();
        com.google.v.c.addAll(iterable, this.pinAd_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPinAd(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensurePinAdIsMutable();
        this.pinAd_.add(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmptyAdsReason() {
        this.bitField0_ &= -9;
        this.emptyAdsReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInvisible() {
        this.bitField0_ &= -5;
        this.isInvisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTest() {
        this.bitField0_ &= -33;
        this.isTest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeepAdCache() {
        this.bitField0_ &= -3;
        this.keepAdCache_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinAd() {
        this.pinAd_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinAdParameters() {
        this.pinAdParameters_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -17;
    }

    private void ensurePinAdIsMutable() {
        eo<ac> eoVar = this.pinAd_;
        if (eoVar.c()) {
            return;
        }
        this.pinAd_ = du.mutableCopy(eoVar);
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePinAdParameters(af afVar) {
        Objects.requireNonNull(afVar);
        af afVar2 = this.pinAdParameters_;
        if (afVar2 != null && afVar2 != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder(afVar2);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.pinAdParameters_ = afVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        i.b.ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != i.b.ah.getDefaultInstance()) {
            i.b.af afVarNewBuilder = i.b.ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((i.b.af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 16;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePinAd(int i2) {
        ensurePinAdIsMutable();
        this.pinAd_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmptyAdsReason(w wVar) {
        this.emptyAdsReason_ = wVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInvisible(boolean z) {
        this.bitField0_ |= 4;
        this.isInvisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTest(boolean z) {
        this.bitField0_ |= 32;
        this.isTest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeepAdCache(boolean z) {
        this.bitField0_ |= 2;
        this.keepAdCache_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinAd(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensurePinAdIsMutable();
        this.pinAd_.set(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinAdParameters(af afVar) {
        Objects.requireNonNull(afVar);
        this.pinAdParameters_ = afVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001\u0004᠌\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဇ\u0002", new Object[]{"bitField0_", "pinAd_", ac.class, "pinAdParameters_", "keepAdCache_", "emptyAdsReason_", j.f22370g, "status_", "isTest_", "isInvisible_"});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public w getEmptyAdsReason() {
        w wVarA = w.a(this.emptyAdsReason_);
        return wVarA == null ? w.REASON_UNSPECIFIED : wVarA;
    }

    @Deprecated
    public boolean getIsInvisible() {
        return this.isInvisible_;
    }

    public boolean getIsTest() {
        return this.isTest_;
    }

    public boolean getKeepAdCache() {
        return this.keepAdCache_;
    }

    public ac getPinAd(int i2) {
        return this.pinAd_.get(i2);
    }

    public int getPinAdCount() {
        return this.pinAd_.size();
    }

    public List<ac> getPinAdList() {
        return this.pinAd_;
    }

    public ad getPinAdOrBuilder(int i2) {
        return this.pinAd_.get(i2);
    }

    public List<? extends ad> getPinAdOrBuilderList() {
        return this.pinAd_;
    }

    public af getPinAdParameters() {
        af afVar = this.pinAdParameters_;
        return afVar == null ? af.getDefaultInstance() : afVar;
    }

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public boolean hasEmptyAdsReason() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasIsInvisible() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsTest() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasKeepAdCache() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPinAdParameters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 16) != 0;
    }

    public static v newBuilder(x xVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPinAd(ac acVar) {
        Objects.requireNonNull(acVar);
        ensurePinAdIsMutable();
        this.pinAd_.add(acVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
