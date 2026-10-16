package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahq extends com.google.v.du<ahq, aho> implements com.google.v.fj {
    private static final ahq DEFAULT_INSTANCE;
    public static final int ITEMS_WITH_BADGES_FIELD_NUMBER = 1;
    public static final int MOOD_ICON_ASSET_ID_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ahq> PARSER = null;
    public static final int PORTRAIT_FIELD_NUMBER = 2;
    private static final com.google.v.el<ahp> itemsWithBadges_converter_ = new ve(11);
    private int bitField0_;
    private int itemsWithBadgesMemoizedSerializedSize;
    private com.google.v.ek itemsWithBadges_ = emptyIntList();
    private String moodIconAssetId_ = "";
    private boolean portrait_;

    static {
        ahq ahqVar = new ahq();
        DEFAULT_INSTANCE = ahqVar;
        com.google.v.du.registerDefaultInstance(ahq.class, ahqVar);
    }

    private ahq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemsWithBadges(Iterable<? extends ahp> iterable) {
        ensureItemsWithBadgesIsMutable();
        Iterator<? extends ahp> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemsWithBadges_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemsWithBadgesValue(Iterable<Integer> iterable) {
        ensureItemsWithBadgesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemsWithBadges_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemsWithBadges(ahp ahpVar) {
        Objects.requireNonNull(ahpVar);
        ensureItemsWithBadgesIsMutable();
        this.itemsWithBadges_.i(ahpVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemsWithBadgesValue(int i2) {
        ensureItemsWithBadgesIsMutable();
        this.itemsWithBadges_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemsWithBadges() {
        this.itemsWithBadges_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodIconAssetId() {
        this.moodIconAssetId_ = getDefaultInstance().getMoodIconAssetId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortrait() {
        this.bitField0_ &= -2;
        this.portrait_ = false;
    }

    private void ensureItemsWithBadgesIsMutable() {
        com.google.v.ek ekVar = this.itemsWithBadges_;
        if (ekVar.c()) {
            return;
        }
        this.itemsWithBadges_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static ahq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aho newBuilder() {
        return (aho) DEFAULT_INSTANCE.createBuilder();
    }

    public static ahq parseDelimitedFrom(InputStream inputStream) {
        return (ahq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahq parseFrom(com.google.v.v vVar) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ahq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemsWithBadges(int i2, ahp ahpVar) {
        Objects.requireNonNull(ahpVar);
        ensureItemsWithBadgesIsMutable();
        this.itemsWithBadges_.e(i2, ahpVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemsWithBadgesValue(int i2, int i3) {
        ensureItemsWithBadgesIsMutable();
        this.itemsWithBadges_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodIconAssetId(String str) {
        Objects.requireNonNull(str);
        this.moodIconAssetId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodIconAssetIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.moodIconAssetId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortrait(boolean z) {
        this.bitField0_ |= 1;
        this.portrait_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001,\u0002ဇ\u0000\u0003Ȉ", new Object[]{"bitField0_", "itemsWithBadges_", "portrait_", "moodIconAssetId_"});
        }
        if (iOrdinal == 3) {
            return new ahq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aho(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ahq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ahq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ahp getItemsWithBadges(int i2) {
        ahp ahpVarA = ahp.a(this.itemsWithBadges_.d(i2));
        return ahpVarA == null ? ahp.UNRECOGNIZED : ahpVarA;
    }

    public int getItemsWithBadgesCount() {
        return this.itemsWithBadges_.size();
    }

    public List<ahp> getItemsWithBadgesList() {
        return new com.google.v.em(this.itemsWithBadges_, itemsWithBadges_converter_);
    }

    public int getItemsWithBadgesValue(int i2) {
        return this.itemsWithBadges_.d(i2);
    }

    public List<Integer> getItemsWithBadgesValueList() {
        return this.itemsWithBadges_;
    }

    public String getMoodIconAssetId() {
        return this.moodIconAssetId_;
    }

    public com.google.v.v getMoodIconAssetIdBytes() {
        return com.google.v.v.s(this.moodIconAssetId_);
    }

    public boolean getPortrait() {
        return this.portrait_;
    }

    public boolean hasPortrait() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aho newBuilder(ahq ahqVar) {
        return (aho) DEFAULT_INSTANCE.createBuilder(ahqVar);
    }

    public static ahq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ahq parseFrom(com.google.v.z zVar) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ahq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ahq parseFrom(InputStream inputStream) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahq parseFrom(ByteBuffer byteBuffer) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ahq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ahq parseFrom(byte[] bArr) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ahq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ahq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
