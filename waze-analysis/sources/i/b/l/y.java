package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class y extends com.google.v.du<y, x> implements com.google.v.fj {
    public static final int COMMUNITY_FIELD_NUMBER = 1;
    private static final y DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<y> PARSER;
    private int bitField0_;
    private String imageUrl_ = "";
    private com.google.v.eo<v> community_ = emptyProtobufList();

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.v.du.registerDefaultInstance(y.class, yVar);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommunity(Iterable<? extends v> iterable) {
        ensureCommunityIsMutable();
        com.google.v.c.addAll(iterable, this.community_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(int i2, v vVar) {
        Objects.requireNonNull(vVar);
        ensureCommunityIsMutable();
        this.community_.add(i2, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.community_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -2;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    private void ensureCommunityIsMutable() {
        com.google.v.eo<v> eoVar = this.community_;
        if (eoVar.c()) {
            return;
        }
        this.community_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static y getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static y parseDelimitedFrom(InputStream inputStream) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(com.google.v.v vVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<y> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCommunity(int i2) {
        ensureCommunityIsMutable();
        this.community_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(int i2, v vVar) {
        Objects.requireNonNull(vVar);
        ensureCommunityIsMutable();
        this.community_.set(i2, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(com.google.v.v vVar) {
        this.imageUrl_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"bitField0_", "community_", v.class, "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new y();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<y> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (y.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public v getCommunity(int i2) {
        return this.community_.get(i2);
    }

    public int getCommunityCount() {
        return this.community_.size();
    }

    public List<v> getCommunityList() {
        return this.community_;
    }

    public w getCommunityOrBuilder(int i2) {
        return this.community_.get(i2);
    }

    public List<? extends w> getCommunityOrBuilderList() {
        return this.community_;
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public com.google.v.v getImageUrlBytes() {
        return com.google.v.v.s(this.imageUrl_);
    }

    public boolean hasImageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static x newBuilder(y yVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(yVar);
    }

    public static y parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static y parseFrom(com.google.v.z zVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static y parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(v vVar) {
        Objects.requireNonNull(vVar);
        ensureCommunityIsMutable();
        this.community_.add(vVar);
    }

    public static y parseFrom(InputStream inputStream) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(ByteBuffer byteBuffer) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static y parseFrom(byte[] bArr) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static y parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
