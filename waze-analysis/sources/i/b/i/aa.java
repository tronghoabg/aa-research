package i.b.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends du<aa, z> implements ab {
    public static final int CATEGORY_INFO_FIELD_NUMBER = 2;
    private static final aa DEFAULT_INSTANCE;
    public static final int GROUP_FIELD_NUMBER = 1;
    private static volatile fo<aa> PARSER;
    private int bitField0_;
    private String group_ = "";
    private eo<k> categoryInfo_ = emptyProtobufList();

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategoryInfo(Iterable<? extends k> iterable) {
        ensureCategoryInfoIsMutable();
        com.google.v.c.addAll(iterable, this.categoryInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryInfo(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureCategoryInfoIsMutable();
        this.categoryInfo_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryInfo() {
        this.categoryInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroup() {
        this.bitField0_ &= -2;
        this.group_ = getDefaultInstance().getGroup();
    }

    private void ensureCategoryInfoIsMutable() {
        eo<k> eoVar = this.categoryInfo_;
        if (eoVar.c()) {
            return;
        }
        this.categoryInfo_ = du.mutableCopy(eoVar);
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCategoryInfo(int i2) {
        ensureCategoryInfoIsMutable();
        this.categoryInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryInfo(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureCategoryInfoIsMutable();
        this.categoryInfo_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroup(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.group_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupBytes(com.google.v.v vVar) {
        this.group_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "group_", "categoryInfo_", k.class});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new z(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public k getCategoryInfo(int i2) {
        return this.categoryInfo_.get(i2);
    }

    public int getCategoryInfoCount() {
        return this.categoryInfo_.size();
    }

    public List<k> getCategoryInfoList() {
        return this.categoryInfo_;
    }

    public l getCategoryInfoOrBuilder(int i2) {
        return this.categoryInfo_.get(i2);
    }

    public List<? extends l> getCategoryInfoOrBuilderList() {
        return this.categoryInfo_;
    }

    public String getGroup() {
        return this.group_;
    }

    public com.google.v.v getGroupBytes() {
        return com.google.v.v.s(this.group_);
    }

    public boolean hasGroup() {
        return (this.bitField0_ & 1) != 0;
    }

    public static z newBuilder(aa aaVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryInfo(k kVar) {
        Objects.requireNonNull(kVar);
        ensureCategoryInfoIsMutable();
        this.categoryInfo_.add(kVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
