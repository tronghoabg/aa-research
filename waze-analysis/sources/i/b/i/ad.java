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
public final class ad extends du<ad, ac> implements ae {
    public static final int CATEGORIES_FIELD_NUMBER = 3;
    public static final int CHANNEL_FIELD_NUMBER = 2;
    private static final ad DEFAULT_INSTANCE;
    public static final int ENABLED_CHANGE_DATE_FIELD_NUMBER = 7;
    public static final int ENABLED_FIELD_NUMBER = 5;
    public static final int EXTENDED_CATEGORIES_FIELD_NUMBER = 6;
    public static final int GROUP_INFO_FIELD_NUMBER = 4;
    private static volatile fo<ad> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private i.b.am categories_;
    private long enabledChangeDate_;
    private boolean enabled_;
    private d extendedCategories_;
    private long userId_;
    private String channel_ = "";
    private eo<aa> groupInfo_ = emptyProtobufList();

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGroupInfo(Iterable<? extends aa> iterable) {
        ensureGroupInfoIsMutable();
        com.google.v.c.addAll(iterable, this.groupInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroupInfo(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureGroupInfoIsMutable();
        this.groupInfo_.add(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategories() {
        this.categories_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannel() {
        this.bitField0_ &= -3;
        this.channel_ = getDefaultInstance().getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabled() {
        this.bitField0_ &= -9;
        this.enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabledChangeDate() {
        this.bitField0_ &= -33;
        this.enabledChangeDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendedCategories() {
        this.extendedCategories_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupInfo() {
        this.groupInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    private void ensureGroupInfoIsMutable() {
        eo<aa> eoVar = this.groupInfo_;
        if (eoVar.c()) {
            return;
        }
        this.groupInfo_ = du.mutableCopy(eoVar);
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCategories(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.categories_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.categories_ = amVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtendedCategories(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.extendedCategories_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.extendedCategories_ = dVar;
        this.bitField0_ |= 16;
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
    public void removeGroupInfo(int i2) {
        ensureGroupInfoIsMutable();
        this.groupInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategories(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.categories_ = amVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.channel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelBytes(com.google.v.v vVar) {
        this.channel_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.enabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledChangeDate(long j2) {
        this.bitField0_ |= 32;
        this.enabledChangeDate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendedCategories(d dVar) {
        Objects.requireNonNull(dVar);
        this.extendedCategories_ = dVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupInfo(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureGroupInfoIsMutable();
        this.groupInfo_.set(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဇ\u0003\u0006ဉ\u0004\u0007ဂ\u0005", new Object[]{"bitField0_", "userId_", "channel_", "categories_", "groupInfo_", aa.class, "enabled_", "extendedCategories_", "enabledChangeDate_"});
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

    public i.b.am getCategories() {
        i.b.am amVar = this.categories_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    public String getChannel() {
        return this.channel_;
    }

    public com.google.v.v getChannelBytes() {
        return com.google.v.v.s(this.channel_);
    }

    public boolean getEnabled() {
        return this.enabled_;
    }

    public long getEnabledChangeDate() {
        return this.enabledChangeDate_;
    }

    public d getExtendedCategories() {
        d dVar = this.extendedCategories_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public aa getGroupInfo(int i2) {
        return this.groupInfo_.get(i2);
    }

    public int getGroupInfoCount() {
        return this.groupInfo_.size();
    }

    public List<aa> getGroupInfoList() {
        return this.groupInfo_;
    }

    public ab getGroupInfoOrBuilder(int i2) {
        return this.groupInfo_.get(i2);
    }

    public List<? extends ab> getGroupInfoOrBuilderList() {
        return this.groupInfo_;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasCategories() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasChannel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEnabledChangeDate() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasExtendedCategories() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
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
    public void addGroupInfo(aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureGroupInfoIsMutable();
        this.groupInfo_.add(aaVar);
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
