package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ik extends com.google.v.du<ik, ij> implements com.google.v.fj {
    private static final ik DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int JOB_RELATED_CATEGORIES_FIELD_NUMBER = 2;
    public static final int JOB_TYPE_ID_FIELD_NUMBER = 1;
    public static final int JOB_TYPE_MID_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ik> PARSER;
    private int bitField0_;
    private com.google.v.db duration_;
    private String jobTypeId_ = "";
    private com.google.v.eo<im> jobRelatedCategories_ = emptyProtobufList();
    private String jobTypeMid_ = "";

    static {
        ik ikVar = new ik();
        DEFAULT_INSTANCE = ikVar;
        com.google.v.du.registerDefaultInstance(ik.class, ikVar);
    }

    private ik() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJobRelatedCategories(Iterable<? extends im> iterable) {
        ensureJobRelatedCategoriesIsMutable();
        com.google.v.c.addAll(iterable, this.jobRelatedCategories_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJobRelatedCategories(int i2, im imVar) {
        Objects.requireNonNull(imVar);
        ensureJobRelatedCategoriesIsMutable();
        this.jobRelatedCategories_.add(i2, imVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobRelatedCategories() {
        this.jobRelatedCategories_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobTypeId() {
        this.bitField0_ &= -2;
        this.jobTypeId_ = getDefaultInstance().getJobTypeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobTypeMid() {
        this.bitField0_ &= -5;
        this.jobTypeMid_ = getDefaultInstance().getJobTypeMid();
    }

    private void ensureJobRelatedCategoriesIsMutable() {
        com.google.v.eo<im> eoVar = this.jobRelatedCategories_;
        if (eoVar.c()) {
            return;
        }
        this.jobRelatedCategories_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ik getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDuration(com.google.v.db dbVar) {
        Objects.requireNonNull(dbVar);
        com.google.v.db dbVar2 = this.duration_;
        if (dbVar2 != null && dbVar2 != com.google.v.db.getDefaultInstance()) {
            com.google.v.da daVarNewBuilder = com.google.v.db.newBuilder(dbVar2);
            daVarNewBuilder.mergeFrom((com.google.v.da) dbVar);
            dbVar = daVarNewBuilder.buildPartial();
        }
        this.duration_ = dbVar;
        this.bitField0_ |= 2;
    }

    public static ij newBuilder() {
        return (ij) DEFAULT_INSTANCE.createBuilder();
    }

    public static ik parseDelimitedFrom(InputStream inputStream) {
        return (ik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ik parseFrom(com.google.v.v vVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ik> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeJobRelatedCategories(int i2) {
        ensureJobRelatedCategoriesIsMutable();
        this.jobRelatedCategories_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(com.google.v.db dbVar) {
        Objects.requireNonNull(dbVar);
        this.duration_ = dbVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobRelatedCategories(int i2, im imVar) {
        Objects.requireNonNull(imVar);
        ensureJobRelatedCategoriesIsMutable();
        this.jobRelatedCategories_.set(i2, imVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTypeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.jobTypeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTypeIdBytes(com.google.v.v vVar) {
        this.jobTypeId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTypeMid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.jobTypeMid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTypeMidBytes(com.google.v.v vVar) {
        this.jobTypeMid_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဈ\u0002", new Object[]{"bitField0_", "jobTypeId_", "jobRelatedCategories_", im.class, "duration_", "jobTypeMid_"});
        }
        if (iOrdinal == 3) {
            return new ik();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ij(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ik> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ik.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.db getDuration() {
        com.google.v.db dbVar = this.duration_;
        return dbVar == null ? com.google.v.db.getDefaultInstance() : dbVar;
    }

    public im getJobRelatedCategories(int i2) {
        return this.jobRelatedCategories_.get(i2);
    }

    public int getJobRelatedCategoriesCount() {
        return this.jobRelatedCategories_.size();
    }

    public List<im> getJobRelatedCategoriesList() {
        return this.jobRelatedCategories_;
    }

    public in getJobRelatedCategoriesOrBuilder(int i2) {
        return this.jobRelatedCategories_.get(i2);
    }

    public List<? extends in> getJobRelatedCategoriesOrBuilderList() {
        return this.jobRelatedCategories_;
    }

    public String getJobTypeId() {
        return this.jobTypeId_;
    }

    public com.google.v.v getJobTypeIdBytes() {
        return com.google.v.v.s(this.jobTypeId_);
    }

    public String getJobTypeMid() {
        return this.jobTypeMid_;
    }

    public com.google.v.v getJobTypeMidBytes() {
        return com.google.v.v.s(this.jobTypeMid_);
    }

    public boolean hasDuration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasJobTypeId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasJobTypeMid() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ij newBuilder(ik ikVar) {
        return (ij) DEFAULT_INSTANCE.createBuilder(ikVar);
    }

    public static ik parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ik parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ik parseFrom(com.google.v.z zVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ik parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJobRelatedCategories(im imVar) {
        Objects.requireNonNull(imVar);
        ensureJobRelatedCategoriesIsMutable();
        this.jobRelatedCategories_.add(imVar);
    }

    public static ik parseFrom(InputStream inputStream) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ik parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ik parseFrom(ByteBuffer byteBuffer) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ik parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ik parseFrom(byte[] bArr) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ik parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
