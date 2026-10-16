package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rw extends com.google.v.du<rw, rv> implements rx {
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final rw DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<rw> PARSER = null;
    public static final int UNIQUENAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private i.b.am name_;
    private com.google.v.eo<String> category_ = emptyProtobufList();
    private String uniqueName_ = "";

    static {
        rw rwVar = new rw();
        DEFAULT_INSTANCE = rwVar;
        com.google.v.du.registerDefaultInstance(rw.class, rwVar);
    }

    private rw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategory(Iterable<String> iterable) {
        ensureCategoryIsMutable();
        com.google.v.c.addAll(iterable, this.category_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategory(String str) {
        Objects.requireNonNull(str);
        ensureCategoryIsMutable();
        this.category_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryBytes(com.google.v.v vVar) {
        ensureCategoryIsMutable();
        this.category_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUniqueName() {
        this.bitField0_ &= -2;
        this.uniqueName_ = getDefaultInstance().getUniqueName();
    }

    private void ensureCategoryIsMutable() {
        com.google.v.eo<String> eoVar = this.category_;
        if (eoVar.c()) {
            return;
        }
        this.category_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static rw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeName(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.name_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.name_ = amVar;
        this.bitField0_ |= 2;
    }

    public static rv newBuilder() {
        return (rv) DEFAULT_INSTANCE.createBuilder();
    }

    public static rw parseDelimitedFrom(InputStream inputStream) {
        return (rw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rw parseFrom(com.google.v.v vVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCategoryIsMutable();
        this.category_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.name_ = amVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.uniqueName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueNameBytes(com.google.v.v vVar) {
        this.uniqueName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "category_", "uniqueName_", "name_"});
        }
        if (iOrdinal == 3) {
            return new rw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCategory(int i2) {
        return this.category_.get(i2);
    }

    public com.google.v.v getCategoryBytes(int i2) {
        return com.google.v.v.s(this.category_.get(i2));
    }

    public int getCategoryCount() {
        return this.category_.size();
    }

    public List<String> getCategoryList() {
        return this.category_;
    }

    public i.b.am getName() {
        i.b.am amVar = this.name_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    public String getUniqueName() {
        return this.uniqueName_;
    }

    public com.google.v.v getUniqueNameBytes() {
        return com.google.v.v.s(this.uniqueName_);
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUniqueName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rv newBuilder(rw rwVar) {
        return (rv) DEFAULT_INSTANCE.createBuilder(rwVar);
    }

    public static rw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rw parseFrom(com.google.v.z zVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rw parseFrom(InputStream inputStream) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rw parseFrom(ByteBuffer byteBuffer) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rw parseFrom(byte[] bArr) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
