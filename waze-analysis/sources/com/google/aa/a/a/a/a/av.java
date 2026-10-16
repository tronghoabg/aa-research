package com.google.aa.a.a.a.a;

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
/* loaded from: classes5.dex */
public final class av extends du<av, au> implements fj {
    public static final int ARCHITECTURE_FIELD_NUMBER = 5;
    public static final int BITNESS_FIELD_NUMBER = 8;
    private static final av DEFAULT_INSTANCE;
    public static final int MOBILE_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 6;
    private static volatile fo<av> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 3;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 4;
    public static final int UA_FULL_VERSION_FIELD_NUMBER = 7;
    public static final int UA_LIST_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean mobile_;
    private eo<as> uaList_ = emptyProtobufList();
    private String platform_ = "";
    private String platformVersion_ = "";
    private String architecture_ = "";
    private String model_ = "";
    private String uaFullVersion_ = "";
    private String bitness_ = "";

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUaList(Iterable<? extends as> iterable) {
        ensureUaListIsMutable();
        com.google.v.c.addAll(iterable, this.uaList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUaList(int i2, as asVar) {
        Objects.requireNonNull(asVar);
        ensureUaListIsMutable();
        this.uaList_.add(i2, asVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArchitecture() {
        this.bitField0_ &= -9;
        this.architecture_ = getDefaultInstance().getArchitecture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitness() {
        this.bitField0_ &= -65;
        this.bitness_ = getDefaultInstance().getBitness();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobile() {
        this.bitField0_ &= -2;
        this.mobile_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.bitField0_ &= -17;
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.bitField0_ &= -3;
        this.platform_ = getDefaultInstance().getPlatform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformVersion() {
        this.bitField0_ &= -5;
        this.platformVersion_ = getDefaultInstance().getPlatformVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUaFullVersion() {
        this.bitField0_ &= -33;
        this.uaFullVersion_ = getDefaultInstance().getUaFullVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUaList() {
        this.uaList_ = emptyProtobufList();
    }

    private void ensureUaListIsMutable() {
        eo<as> eoVar = this.uaList_;
        if (eoVar.c()) {
            return;
        }
        this.uaList_ = du.mutableCopy(eoVar);
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUaList(int i2) {
        ensureUaListIsMutable();
        this.uaList_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchitecture(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.architecture_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchitectureBytes(com.google.v.v vVar) {
        this.architecture_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitness(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.bitness_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitnessBytes(com.google.v.v vVar) {
        this.bitness_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobile(boolean z) {
        this.bitField0_ |= 1;
        this.mobile_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(com.google.v.v vVar) {
        this.model_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatform(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.platform_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformBytes(com.google.v.v vVar) {
        this.platform_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.platformVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersionBytes(com.google.v.v vVar) {
        this.platformVersion_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUaFullVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.uaFullVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUaFullVersionBytes(com.google.v.v vVar) {
        this.uaFullVersion_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUaList(int i2, as asVar) {
        Objects.requireNonNull(asVar);
        ensureUaListIsMutable();
        this.uaList_.set(i2, asVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{"bitField0_", "uaList_", as.class, "mobile_", "platform_", "platformVersion_", "architecture_", "model_", "uaFullVersion_", "bitness_"});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getArchitecture() {
        return this.architecture_;
    }

    public com.google.v.v getArchitectureBytes() {
        return com.google.v.v.s(this.architecture_);
    }

    public String getBitness() {
        return this.bitness_;
    }

    public com.google.v.v getBitnessBytes() {
        return com.google.v.v.s(this.bitness_);
    }

    public boolean getMobile() {
        return this.mobile_;
    }

    public String getModel() {
        return this.model_;
    }

    public com.google.v.v getModelBytes() {
        return com.google.v.v.s(this.model_);
    }

    public String getPlatform() {
        return this.platform_;
    }

    public com.google.v.v getPlatformBytes() {
        return com.google.v.v.s(this.platform_);
    }

    public String getPlatformVersion() {
        return this.platformVersion_;
    }

    public com.google.v.v getPlatformVersionBytes() {
        return com.google.v.v.s(this.platformVersion_);
    }

    public String getUaFullVersion() {
        return this.uaFullVersion_;
    }

    public com.google.v.v getUaFullVersionBytes() {
        return com.google.v.v.s(this.uaFullVersion_);
    }

    public as getUaList(int i2) {
        return this.uaList_.get(i2);
    }

    public int getUaListCount() {
        return this.uaList_.size();
    }

    public List<as> getUaListList() {
        return this.uaList_;
    }

    public at getUaListOrBuilder(int i2) {
        return this.uaList_.get(i2);
    }

    public List<? extends at> getUaListOrBuilderList() {
        return this.uaList_;
    }

    public boolean hasArchitecture() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasBitness() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMobile() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasModel() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPlatform() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPlatformVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUaFullVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUaList(as asVar) {
        Objects.requireNonNull(asVar);
        ensureUaListIsMutable();
        this.uaList_.add(asVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
