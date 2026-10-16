package i.b.i;

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
public final class ak extends du<ak, aj> implements fj {
    public static final int APP_TYPE_FIELD_NUMBER = 8;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 7;
    public static final int CONFIG_ITEM_FIELD_NUMBER = 5;
    private static final ak DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 6;
    public static final int INSTALLTION_ID_FIELD_NUMBER = 2;
    public static final int LAST_SYNCED_FIELD_NUMBER = 4;
    private static volatile fo<ak> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int appType_;
    private int bitField0_;
    private int deviceType_;
    private long lastSynced_;
    private long userId_;
    private String installtionId_ = "ACCOUNT";
    private eo<o> configItem_ = emptyProtobufList();
    private String clientVersion_ = "";

    static {
        ak akVar = new ak();
        DEFAULT_INSTANCE = akVar;
        du.registerDefaultInstance(ak.class, akVar);
    }

    private ak() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConfigItem(Iterable<? extends o> iterable) {
        ensureConfigItemIsMutable();
        com.google.v.c.addAll(iterable, this.configItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigItem(int i2, o oVar) {
        Objects.requireNonNull(oVar);
        ensureConfigItemIsMutable();
        this.configItem_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.bitField0_ &= -33;
        this.appType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientVersion() {
        this.bitField0_ &= -17;
        this.clientVersion_ = getDefaultInstance().getClientVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigItem() {
        this.configItem_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.bitField0_ &= -9;
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstalltionId() {
        this.bitField0_ &= -3;
        this.installtionId_ = getDefaultInstance().getInstalltionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastSynced() {
        this.bitField0_ &= -5;
        this.lastSynced_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    private void ensureConfigItemIsMutable() {
        eo<o> eoVar = this.configItem_;
        if (eoVar.c()) {
            return;
        }
        this.configItem_ = du.mutableCopy(eoVar);
    }

    public static ak getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ak parseDelimitedFrom(InputStream inputStream) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(com.google.v.v vVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ak> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConfigItem(int i2) {
        ensureConfigItemIsMutable();
        this.configItem_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppType(i.b.n nVar) {
        this.appType_ = nVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.clientVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersionBytes(com.google.v.v vVar) {
        this.clientVersion_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigItem(int i2, o oVar) {
        Objects.requireNonNull(oVar);
        ensureConfigItemIsMutable();
        this.configItem_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(i.b.u uVar) {
        this.deviceType_ = uVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstalltionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.installtionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstalltionIdBytes(com.google.v.v vVar) {
        this.installtionId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSynced(long j2) {
        this.bitField0_ |= 4;
        this.lastSynced_ = j2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005\u001b\u0006᠌\u0003\u0007ဈ\u0004\b᠌\u0005", new Object[]{"bitField0_", "userId_", "installtionId_", "lastSynced_", "configItem_", o.class, "deviceType_", i.b.u.a(), "clientVersion_", "appType_", i.b.n.a()});
        }
        if (iOrdinal == 3) {
            return new ak();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ak> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ak.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public i.b.n getAppType() {
        i.b.n nVarB = i.b.n.b(this.appType_);
        return nVarB == null ? i.b.n.UNKNOWN_APP_TYPE : nVarB;
    }

    @Deprecated
    public String getClientVersion() {
        return this.clientVersion_;
    }

    @Deprecated
    public com.google.v.v getClientVersionBytes() {
        return com.google.v.v.s(this.clientVersion_);
    }

    public o getConfigItem(int i2) {
        return this.configItem_.get(i2);
    }

    public int getConfigItemCount() {
        return this.configItem_.size();
    }

    public List<o> getConfigItemList() {
        return this.configItem_;
    }

    public p getConfigItemOrBuilder(int i2) {
        return this.configItem_.get(i2);
    }

    public List<? extends p> getConfigItemOrBuilderList() {
        return this.configItem_;
    }

    @Deprecated
    public i.b.u getDeviceType() {
        i.b.u uVarB = i.b.u.b(this.deviceType_);
        return uVarB == null ? i.b.u.UNKNOWN_DEVICE_TYPE : uVarB;
    }

    public String getInstalltionId() {
        return this.installtionId_;
    }

    public com.google.v.v getInstalltionIdBytes() {
        return com.google.v.v.s(this.installtionId_);
    }

    public long getLastSynced() {
        return this.lastSynced_;
    }

    public long getUserId() {
        return this.userId_;
    }

    @Deprecated
    public boolean hasAppType() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasClientVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasDeviceType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInstalltionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLastSynced() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aj newBuilder(ak akVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(akVar);
    }

    public static ak parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(com.google.v.v vVar, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ak parseFrom(com.google.v.z zVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ak parseFrom(com.google.v.z zVar, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigItem(o oVar) {
        Objects.requireNonNull(oVar);
        ensureConfigItemIsMutable();
        this.configItem_.add(oVar);
    }

    public static ak parseFrom(InputStream inputStream) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(InputStream inputStream, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(ByteBuffer byteBuffer) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ak parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ak parseFrom(byte[] bArr) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ak parseFrom(byte[] bArr, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
