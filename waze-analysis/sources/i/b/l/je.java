package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class je extends com.google.v.du<je, jd> implements com.google.v.fj {
    public static final int COMMUNITY_FIELD_NUMBER = 4;
    private static final je DEFAULT_INSTANCE;
    public static final int FACIAL_TAGGING_STATUS_FIELD_NUMBER = 5;
    public static final int GENDER_FIELD_NUMBER = 9;
    public static final int GENDER_TEXT_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<je> PARSER;
    private int bitField0_;
    private int facialTaggingStatus_;
    private com.google.v.eo<ix> community_ = emptyProtobufList();
    private String imageUrl_ = "";
    private int gender_ = 1;
    private String genderText_ = "";

    static {
        je jeVar = new je();
        DEFAULT_INSTANCE = jeVar;
        com.google.v.du.registerDefaultInstance(je.class, jeVar);
    }

    private je() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommunity(Iterable<? extends ix> iterable) {
        ensureCommunityIsMutable();
        com.google.v.c.addAll(iterable, this.community_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(int i2, ix ixVar) {
        Objects.requireNonNull(ixVar);
        ensureCommunityIsMutable();
        this.community_.add(i2, ixVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.community_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFacialTaggingStatus() {
        this.bitField0_ &= -3;
        this.facialTaggingStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGender() {
        this.bitField0_ &= -5;
        this.gender_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenderText() {
        this.bitField0_ &= -9;
        this.genderText_ = getDefaultInstance().getGenderText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -2;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    private void ensureCommunityIsMutable() {
        com.google.v.eo<ix> eoVar = this.community_;
        if (eoVar.c()) {
            return;
        }
        this.community_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static je getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jd newBuilder() {
        return (jd) DEFAULT_INSTANCE.createBuilder();
    }

    public static je parseDelimitedFrom(InputStream inputStream) {
        return (je) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static je parseFrom(com.google.v.v vVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<je> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCommunity(int i2) {
        ensureCommunityIsMutable();
        this.community_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(int i2, ix ixVar) {
        Objects.requireNonNull(ixVar);
        ensureCommunityIsMutable();
        this.community_.set(i2, ixVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFacialTaggingStatus(i.b.p.s sVar) {
        this.facialTaggingStatus_ = sVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGender(im imVar) {
        this.gender_ = imVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenderText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.genderText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenderTextBytes(com.google.v.v vVar) {
        this.genderText_ = vVar.u();
        this.bitField0_ |= 8;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0003\n\u0005\u0000\u0001\u0000\u0003ဈ\u0000\u0004\u001b\u0005᠌\u0001\t᠌\u0002\nဈ\u0003", new Object[]{"bitField0_", "imageUrl_", "community_", ix.class, "facialTaggingStatus_", i.b.p.s.a(), "gender_", hf.f48741e, "genderText_"});
        }
        if (iOrdinal == 3) {
            return new je();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<je> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (je.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ix getCommunity(int i2) {
        return this.community_.get(i2);
    }

    public int getCommunityCount() {
        return this.community_.size();
    }

    public List<ix> getCommunityList() {
        return this.community_;
    }

    public iy getCommunityOrBuilder(int i2) {
        return this.community_.get(i2);
    }

    public List<? extends iy> getCommunityOrBuilderList() {
        return this.community_;
    }

    public i.b.p.s getFacialTaggingStatus() {
        i.b.p.s sVarB = i.b.p.s.b(this.facialTaggingStatus_);
        return sVarB == null ? i.b.p.s.UNKNOWN : sVarB;
    }

    public im getGender() {
        im imVarA = im.a(this.gender_);
        return imVarA == null ? im.MALE : imVarA;
    }

    public String getGenderText() {
        return this.genderText_;
    }

    public com.google.v.v getGenderTextBytes() {
        return com.google.v.v.s(this.genderText_);
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public com.google.v.v getImageUrlBytes() {
        return com.google.v.v.s(this.imageUrl_);
    }

    public boolean hasFacialTaggingStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGender() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGenderText() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasImageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jd newBuilder(je jeVar) {
        return (jd) DEFAULT_INSTANCE.createBuilder(jeVar);
    }

    public static je parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (je) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static je parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static je parseFrom(com.google.v.z zVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static je parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(ix ixVar) {
        Objects.requireNonNull(ixVar);
        ensureCommunityIsMutable();
        this.community_.add(ixVar);
    }

    public static je parseFrom(InputStream inputStream) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static je parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static je parseFrom(ByteBuffer byteBuffer) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static je parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static je parseFrom(byte[] bArr) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static je parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
