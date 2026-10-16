package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends du<m, k> implements fj {
    public static final int BATTLESTAR_CLIENT_TYPE_FIELD_NUMBER = 2;
    public static final int BATTLESTAR_MACHINE_TIER_FIELD_NUMBER = 6;
    public static final int BUILD_TYPE_FIELD_NUMBER = 4;
    public static final int BUILD_VERSION_FIELD_NUMBER = 1;
    public static final int CPU_MANUFACTURER_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int OMAHA_CHANNEL_FIELD_NUMBER = 5;
    private static volatile fo<m> PARSER = null;
    public static final int SYSTEM_PHYSICAL_MEMORY_BYTES_FIELD_NUMBER = 10;
    private int battlestarClientType_;
    private int battlestarMachineTier_;
    private int bitField0_;
    private int cpuManufacturer_;
    private long systemPhysicalMemoryBytes_;
    private String buildVersion_ = "";
    private String buildType_ = "";
    private String omahaChannel_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattlestarClientType() {
        this.bitField0_ &= -9;
        this.battlestarClientType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattlestarMachineTier() {
        this.bitField0_ &= -17;
        this.battlestarMachineTier_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildType() {
        this.bitField0_ &= -3;
        this.buildType_ = getDefaultInstance().getBuildType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildVersion() {
        this.bitField0_ &= -2;
        this.buildVersion_ = getDefaultInstance().getBuildVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuManufacturer() {
        this.bitField0_ &= -33;
        this.cpuManufacturer_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmahaChannel() {
        this.bitField0_ &= -5;
        this.omahaChannel_ = getDefaultInstance().getOmahaChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemPhysicalMemoryBytes() {
        this.bitField0_ &= -65;
        this.systemPhysicalMemoryBytes_ = 0L;
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattlestarClientType(h hVar) {
        this.battlestarClientType_ = hVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattlestarMachineTier(j jVar) {
        this.battlestarMachineTier_ = jVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.buildType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildTypeBytes(com.google.v.v vVar) {
        this.buildType_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.buildVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersionBytes(com.google.v.v vVar) {
        this.buildVersion_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuManufacturer(l lVar) {
        this.cpuManufacturer_ = lVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmahaChannel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.omahaChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmahaChannelBytes(com.google.v.v vVar) {
        this.omahaChannel_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemPhysicalMemoryBytes(long j2) {
        this.bitField0_ |= 64;
        this.systemPhysicalMemoryBytes_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0003\u0004ဈ\u0001\u0005ဈ\u0002\u0006᠌\u0004\b᠌\u0005\nဂ\u0006", new Object[]{"bitField0_", "buildVersion_", "battlestarClientType_", i.f3784b, "buildType_", "omahaChannel_", "battlestarMachineTier_", i.f3783a, "cpuManufacturer_", i.f3785c, "systemPhysicalMemoryBytes_"});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public h getBattlestarClientType() {
        h hVarA = h.a(this.battlestarClientType_);
        return hVarA == null ? h.CLIENT_UNKNOWN : hVarA;
    }

    public j getBattlestarMachineTier() {
        j jVarA = j.a(this.battlestarMachineTier_);
        return jVarA == null ? j.TIER_UNKNOWN : jVarA;
    }

    public String getBuildType() {
        return this.buildType_;
    }

    public com.google.v.v getBuildTypeBytes() {
        return com.google.v.v.s(this.buildType_);
    }

    public String getBuildVersion() {
        return this.buildVersion_;
    }

    public com.google.v.v getBuildVersionBytes() {
        return com.google.v.v.s(this.buildVersion_);
    }

    public l getCpuManufacturer() {
        l lVarA = l.a(this.cpuManufacturer_);
        return lVarA == null ? l.MANUFACTURER_UNKNOWN : lVarA;
    }

    public String getOmahaChannel() {
        return this.omahaChannel_;
    }

    public com.google.v.v getOmahaChannelBytes() {
        return com.google.v.v.s(this.omahaChannel_);
    }

    public long getSystemPhysicalMemoryBytes() {
        return this.systemPhysicalMemoryBytes_;
    }

    public boolean hasBattlestarClientType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasBattlestarMachineTier() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasBuildType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBuildVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCpuManufacturer() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOmahaChannel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSystemPhysicalMemoryBytes() {
        return (this.bitField0_ & 64) != 0;
    }

    public static k newBuilder(m mVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
