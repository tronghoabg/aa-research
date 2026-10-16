package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bi extends com.google.v.du<bi, bg> implements bj {
    private static final bi DEFAULT_INSTANCE;
    public static final int LIMIT_SUBSCRIPTION_FIELD_NUMBER = 706;
    public static final int NAME_FIELD_NUMBER = 702;
    public static final int OPEN_HOURS_FIELD_NUMBER = 705;
    private static volatile com.google.v.fo<bi> PARSER = null;
    public static final int POINT_FIELD_NUMBER = 701;
    public static final int PRIMARY_FIELD_NUMBER = 704;
    public static final int TYPE_FIELD_NUMBER = 703;
    private int bitField0_;
    private u point_;
    private boolean primary_;
    private int type_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private com.google.v.eo<ch> openHours_ = emptyProtobufList();
    private com.google.v.eo<String> limitSubscription_ = emptyProtobufList();

    static {
        bi biVar = new bi();
        DEFAULT_INSTANCE = biVar;
        com.google.v.du.registerDefaultInstance(bi.class, biVar);
    }

    private bi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLimitSubscription(Iterable<String> iterable) {
        ensureLimitSubscriptionIsMutable();
        com.google.v.c.addAll(iterable, this.limitSubscription_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOpenHours(Iterable<? extends ch> iterable) {
        ensureOpenHoursIsMutable();
        com.google.v.c.addAll(iterable, this.openHours_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimitSubscription(String str) {
        Objects.requireNonNull(str);
        ensureLimitSubscriptionIsMutable();
        this.limitSubscription_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimitSubscriptionBytes(com.google.v.v vVar) {
        ensureLimitSubscriptionIsMutable();
        this.limitSubscription_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenHours(int i2, ch chVar) {
        Objects.requireNonNull(chVar);
        ensureOpenHoursIsMutable();
        this.openHours_.add(i2, chVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimitSubscription() {
        this.limitSubscription_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenHours() {
        this.openHours_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoint() {
        this.point_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimary() {
        this.bitField0_ &= -9;
        this.primary_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -5;
        this.type_ = 0;
    }

    private void ensureLimitSubscriptionIsMutable() {
        com.google.v.eo<String> eoVar = this.limitSubscription_;
        if (eoVar.c()) {
            return;
        }
        this.limitSubscription_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureOpenHoursIsMutable() {
        com.google.v.eo<ch> eoVar = this.openHours_;
        if (eoVar.c()) {
            return;
        }
        this.openHours_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePoint(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.point_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.point_ = uVar;
        this.bitField0_ |= 1;
    }

    public static bg newBuilder() {
        return (bg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bi parseDelimitedFrom(InputStream inputStream) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(com.google.v.v vVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOpenHours(int i2) {
        ensureOpenHoursIsMutable();
        this.openHours_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitSubscription(int i2, String str) {
        Objects.requireNonNull(str);
        ensureLimitSubscriptionIsMutable();
        this.limitSubscription_.set(i2, str);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenHours(int i2, ch chVar) {
        Objects.requireNonNull(chVar);
        ensureOpenHoursIsMutable();
        this.openHours_.set(i2, chVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoint(u uVar) {
        Objects.requireNonNull(uVar);
        this.point_ = uVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimary(boolean z) {
        this.bitField0_ |= 8;
        this.primary_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bh bhVar) {
        this.type_ = bhVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001ʽ˂\u0006\u0000\u0002\u0002ʽᔉ\u0000ʾဈ\u0001ʿᴌ\u0002ˀဇ\u0003ˁ\u001b˂\u001a", new Object[]{"bitField0_", "point_", "name_", "type_", z.f49561h, "primary_", "openHours_", ch.class, "limitSubscription_"});
            case 3:
                return new bi();
            case 4:
                return new bg(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<bi> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (bi.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getLimitSubscription(int i2) {
        return this.limitSubscription_.get(i2);
    }

    public com.google.v.v getLimitSubscriptionBytes(int i2) {
        return com.google.v.v.s(this.limitSubscription_.get(i2));
    }

    public int getLimitSubscriptionCount() {
        return this.limitSubscription_.size();
    }

    public List<String> getLimitSubscriptionList() {
        return this.limitSubscription_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public ch getOpenHours(int i2) {
        return this.openHours_.get(i2);
    }

    public int getOpenHoursCount() {
        return this.openHours_.size();
    }

    public List<ch> getOpenHoursList() {
        return this.openHours_;
    }

    public ci getOpenHoursOrBuilder(int i2) {
        return this.openHours_.get(i2);
    }

    public List<? extends ci> getOpenHoursOrBuilderList() {
        return this.openHours_;
    }

    public u getPoint() {
        u uVar = this.point_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public boolean getPrimary() {
        return this.primary_;
    }

    public bh getType() {
        bh bhVarA = bh.a(this.type_);
        return bhVarA == null ? bh.ENTRY : bhVarA;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPoint() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPrimary() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bg newBuilder(bi biVar) {
        return (bg) DEFAULT_INSTANCE.createBuilder(biVar);
    }

    public static bi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bi parseFrom(com.google.v.z zVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenHours(ch chVar) {
        Objects.requireNonNull(chVar);
        ensureOpenHoursIsMutable();
        this.openHours_.add(chVar);
    }

    public static bi parseFrom(InputStream inputStream) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(ByteBuffer byteBuffer) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bi parseFrom(byte[] bArr) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
