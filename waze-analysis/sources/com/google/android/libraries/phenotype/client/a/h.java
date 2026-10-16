package com.google.android.libraries.phenotype.client.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends du<h, g> implements fj {
    public static final int CONFIGURATION_VERSION_FIELD_NUMBER = 9;
    private static final h DEFAULT_INSTANCE;
    public static final int DELETE_FLAG_FIELD_NUMBER = 5;
    public static final int EXPERIMENT_TOKEN_FIELD_NUMBER = 3;
    public static final int FLAG_FIELD_NUMBER = 4;
    public static final int IS_DELTA_FIELD_NUMBER = 8;
    private static volatile fo<h> PARSER = null;
    public static final int SERVER_TOKEN_FIELD_NUMBER = 1;
    public static final int SNAPSHOT_TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private long configurationVersion_;
    private boolean isDelta_;
    private String snapshotToken_ = "";
    private v experimentToken_ = v.f13054a;
    private String serverToken_ = "";
    private eo<k> flag_ = emptyProtobufList();
    private eo<String> deleteFlag_ = emptyProtobufList();

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeleteFlag(Iterable<String> iterable) {
        ensureDeleteFlagIsMutable();
        com.google.v.c.addAll(iterable, this.deleteFlag_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFlag(Iterable<? extends k> iterable) {
        ensureFlagIsMutable();
        com.google.v.c.addAll(iterable, this.flag_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeleteFlag(String str) {
        Objects.requireNonNull(str);
        ensureDeleteFlagIsMutable();
        this.deleteFlag_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeleteFlagBytes(v vVar) {
        ensureDeleteFlagIsMutable();
        this.deleteFlag_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFlag(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureFlagIsMutable();
        this.flag_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigurationVersion() {
        this.bitField0_ &= -17;
        this.configurationVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteFlag() {
        this.deleteFlag_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentToken() {
        this.bitField0_ &= -3;
        this.experimentToken_ = getDefaultInstance().getExperimentToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlag() {
        this.flag_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDelta() {
        this.bitField0_ &= -9;
        this.isDelta_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerToken() {
        this.bitField0_ &= -5;
        this.serverToken_ = getDefaultInstance().getServerToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotToken() {
        this.bitField0_ &= -2;
        this.snapshotToken_ = getDefaultInstance().getSnapshotToken();
    }

    private void ensureDeleteFlagIsMutable() {
        eo<String> eoVar = this.deleteFlag_;
        if (eoVar.c()) {
            return;
        }
        this.deleteFlag_ = du.mutableCopy(eoVar);
    }

    private void ensureFlagIsMutable() {
        eo<k> eoVar = this.flag_;
        if (eoVar.c()) {
            return;
        }
        this.flag_ = du.mutableCopy(eoVar);
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFlag(int i2) {
        ensureFlagIsMutable();
        this.flag_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigurationVersion(long j2) {
        this.bitField0_ |= 16;
        this.configurationVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteFlag(int i2, String str) {
        Objects.requireNonNull(str);
        ensureDeleteFlagIsMutable();
        this.deleteFlag_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentToken(v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.experimentToken_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlag(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureFlagIsMutable();
        this.flag_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDelta(boolean z) {
        this.bitField0_ |= 8;
        this.isDelta_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.serverToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerTokenBytes(v vVar) {
        this.serverToken_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.snapshotToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotTokenBytes(v vVar) {
        this.snapshotToken_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"bitField0_", "serverToken_", "snapshotToken_", "experimentToken_", "flag_", k.class, "deleteFlag_", "isDelta_", "configurationVersion_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getConfigurationVersion() {
        return this.configurationVersion_;
    }

    @Deprecated
    public String getDeleteFlag(int i2) {
        return this.deleteFlag_.get(i2);
    }

    @Deprecated
    public v getDeleteFlagBytes(int i2) {
        return v.s(this.deleteFlag_.get(i2));
    }

    @Deprecated
    public int getDeleteFlagCount() {
        return this.deleteFlag_.size();
    }

    @Deprecated
    public List<String> getDeleteFlagList() {
        return this.deleteFlag_;
    }

    public v getExperimentToken() {
        return this.experimentToken_;
    }

    public k getFlag(int i2) {
        return this.flag_.get(i2);
    }

    public int getFlagCount() {
        return this.flag_.size();
    }

    public List<k> getFlagList() {
        return this.flag_;
    }

    public l getFlagOrBuilder(int i2) {
        return this.flag_.get(i2);
    }

    public List<? extends l> getFlagOrBuilderList() {
        return this.flag_;
    }

    @Deprecated
    public boolean getIsDelta() {
        return this.isDelta_;
    }

    public String getServerToken() {
        return this.serverToken_;
    }

    public v getServerTokenBytes() {
        return v.s(this.serverToken_);
    }

    public String getSnapshotToken() {
        return this.snapshotToken_;
    }

    public v getSnapshotTokenBytes() {
        return v.s(this.snapshotToken_);
    }

    public boolean hasConfigurationVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasExperimentToken() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasIsDelta() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasServerToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSnapshotToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFlag(k kVar) {
        Objects.requireNonNull(kVar);
        ensureFlagIsMutable();
        this.flag_.add(kVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
