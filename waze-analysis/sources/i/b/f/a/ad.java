package i.b.f.a;

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
public final class ad extends du<ad, ac> implements fj {
    private static final ad DEFAULT_INSTANCE;
    public static final int ELIGIBILITY_FIELD_NUMBER = 3;
    public static final int ELIGIBLE_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ORDINAL_FIELD_NUMBER = 5;
    private static volatile fo<ad> PARSER = null;
    public static final int PREVIOUS_STATUS_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 7;
    public static final int TARGET_FIELD_NUMBER = 4;
    public static final int TYPE_DEFINITION_FIELD_NUMBER = 2;
    private int bitField0_;
    private y eligibility_;
    private int ordinal_;
    private int status_;
    private y target_;
    private bs typeDefinition_;
    private String id_ = "";
    private eo<bb> previousStatus_ = emptyProtobufList();
    private boolean eligible_ = true;

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreviousStatus(Iterable<? extends bb> iterable) {
        ensurePreviousStatusIsMutable();
        com.google.v.c.addAll(iterable, this.previousStatus_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviousStatus(int i2, bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePreviousStatusIsMutable();
        this.previousStatus_.add(i2, bbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligibility() {
        this.eligibility_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligible() {
        this.bitField0_ &= -65;
        this.eligible_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrdinal() {
        this.bitField0_ &= -17;
        this.ordinal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviousStatus() {
        this.previousStatus_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -33;
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeDefinition() {
        this.typeDefinition_ = null;
        this.bitField0_ &= -3;
    }

    private void ensurePreviousStatusIsMutable() {
        eo<bb> eoVar = this.previousStatus_;
        if (eoVar.c()) {
            return;
        }
        this.previousStatus_ = du.mutableCopy(eoVar);
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEligibility(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.eligibility_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.eligibility_ = yVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTarget(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.target_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.target_ = yVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTypeDefinition(bs bsVar) {
        Objects.requireNonNull(bsVar);
        bs bsVar2 = this.typeDefinition_;
        if (bsVar2 != null && bsVar2 != bs.getDefaultInstance()) {
            br brVarNewBuilder = bs.newBuilder(bsVar2);
            brVarNewBuilder.mergeFrom((br) bsVar);
            bsVar = brVarNewBuilder.buildPartial();
        }
        this.typeDefinition_ = bsVar;
        this.bitField0_ |= 2;
    }

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePreviousStatus(int i2) {
        ensurePreviousStatusIsMutable();
        this.previousStatus_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligibility(y yVar) {
        Objects.requireNonNull(yVar);
        this.eligibility_ = yVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligible(boolean z) {
        this.bitField0_ |= 64;
        this.eligible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrdinal(int i2) {
        this.bitField0_ |= 16;
        this.ordinal_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousStatus(int i2, bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePreviousStatusIsMutable();
        this.previousStatus_.set(i2, bbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ab abVar) {
        this.status_ = abVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(y yVar) {
        Objects.requireNonNull(yVar);
        this.target_ = yVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeDefinition(bs bsVar) {
        Objects.requireNonNull(bsVar);
        this.typeDefinition_ = bsVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0007᠌\u0005\b\u001b\tဇ\u0006", new Object[]{"bitField0_", "id_", "typeDefinition_", "eligibility_", "target_", "ordinal_", "status_", bn.f48431b, "previousStatus_", bb.class, "eligible_"});
        }
        if (iOrdinal == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public y getEligibility() {
        y yVar = this.eligibility_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public boolean getEligible() {
        return this.eligible_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public int getOrdinal() {
        return this.ordinal_;
    }

    public bb getPreviousStatus(int i2) {
        return this.previousStatus_.get(i2);
    }

    public int getPreviousStatusCount() {
        return this.previousStatus_.size();
    }

    public List<bb> getPreviousStatusList() {
        return this.previousStatus_;
    }

    public bc getPreviousStatusOrBuilder(int i2) {
        return this.previousStatus_.get(i2);
    }

    public List<? extends bc> getPreviousStatusOrBuilderList() {
        return this.previousStatus_;
    }

    public ab getStatus() {
        ab abVarA = ab.a(this.status_);
        return abVarA == null ? ab.UNKNOWN : abVarA;
    }

    public y getTarget() {
        y yVar = this.target_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public bs getTypeDefinition() {
        bs bsVar = this.typeDefinition_;
        return bsVar == null ? bs.getDefaultInstance() : bsVar;
    }

    public boolean hasEligibility() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEligible() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOrdinal() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTarget() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTypeDefinition() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviousStatus(bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePreviousStatusIsMutable();
        this.previousStatus_.add(bbVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
