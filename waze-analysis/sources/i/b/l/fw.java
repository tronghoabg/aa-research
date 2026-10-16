package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fw extends com.google.v.du<fw, fv> implements fx {
    public static final int CAN_EXPIRE_FIELD_NUMBER = 3;
    public static final int CORRELATEDPERMITIDS_FIELD_NUMBER = 4;
    private static final fw DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fw> PARSER;
    private int bitField0_;
    private boolean canExpire_;
    private String id_ = "";
    private String name_ = "";
    private com.google.v.eo<fp> correlatedPermitIds_ = emptyProtobufList();

    static {
        fw fwVar = new fw();
        DEFAULT_INSTANCE = fwVar;
        com.google.v.du.registerDefaultInstance(fw.class, fwVar);
    }

    private fw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCorrelatedPermitIds(Iterable<? extends fp> iterable) {
        ensureCorrelatedPermitIdsIsMutable();
        com.google.v.c.addAll(iterable, this.correlatedPermitIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCorrelatedPermitIds(int i2, fp fpVar) {
        Objects.requireNonNull(fpVar);
        ensureCorrelatedPermitIdsIsMutable();
        this.correlatedPermitIds_.add(i2, fpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanExpire() {
        this.bitField0_ &= -5;
        this.canExpire_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCorrelatedPermitIds() {
        this.correlatedPermitIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureCorrelatedPermitIdsIsMutable() {
        com.google.v.eo<fp> eoVar = this.correlatedPermitIds_;
        if (eoVar.c()) {
            return;
        }
        this.correlatedPermitIds_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fv newBuilder() {
        return (fv) DEFAULT_INSTANCE.createBuilder();
    }

    public static fw parseDelimitedFrom(InputStream inputStream) {
        return (fw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fw parseFrom(com.google.v.v vVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCorrelatedPermitIds(int i2) {
        ensureCorrelatedPermitIdsIsMutable();
        this.correlatedPermitIds_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanExpire(boolean z) {
        this.bitField0_ |= 4;
        this.canExpire_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCorrelatedPermitIds(int i2, fp fpVar) {
        Objects.requireNonNull(fpVar);
        ensureCorrelatedPermitIdsIsMutable();
        this.correlatedPermitIds_.set(i2, fpVar);
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
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001b", new Object[]{"bitField0_", "id_", "name_", "canExpire_", "correlatedPermitIds_", fp.class});
        }
        if (iOrdinal == 3) {
            return new fw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCanExpire() {
        return this.canExpire_;
    }

    public fp getCorrelatedPermitIds(int i2) {
        return this.correlatedPermitIds_.get(i2);
    }

    public int getCorrelatedPermitIdsCount() {
        return this.correlatedPermitIds_.size();
    }

    public List<fp> getCorrelatedPermitIdsList() {
        return this.correlatedPermitIds_;
    }

    public fq getCorrelatedPermitIdsOrBuilder(int i2) {
        return this.correlatedPermitIds_.get(i2);
    }

    public List<? extends fq> getCorrelatedPermitIdsOrBuilderList() {
        return this.correlatedPermitIds_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasCanExpire() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static fv newBuilder(fw fwVar) {
        return (fv) DEFAULT_INSTANCE.createBuilder(fwVar);
    }

    public static fw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fw parseFrom(com.google.v.z zVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCorrelatedPermitIds(fp fpVar) {
        Objects.requireNonNull(fpVar);
        ensureCorrelatedPermitIdsIsMutable();
        this.correlatedPermitIds_.add(fpVar);
    }

    public static fw parseFrom(InputStream inputStream) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fw parseFrom(ByteBuffer byteBuffer) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fw parseFrom(byte[] bArr) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
