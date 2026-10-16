package com.google.android.libraries.phenotype.client.stable;

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
/* loaded from: classes4.dex */
public final class ba extends du<ba, az> implements fj {
    public static final int CONFIGURATION_VERSION_FIELD_NUMBER = 4;
    private static final ba DEFAULT_INSTANCE;
    public static final int EXPERIMENT_TOKEN_FIELD_NUMBER = 2;
    public static final int FLAG_FIELD_NUMBER = 5;
    private static volatile fo<ba> PARSER = null;
    public static final int SERVER_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private long configurationVersion_;
    private String snapshotToken_ = "";
    private com.google.v.v experimentToken_ = com.google.v.v.f13054a;
    private String serverToken_ = "";
    private eo<bd> flag_ = emptyProtobufList();

    static {
        ba baVar = new ba();
        DEFAULT_INSTANCE = baVar;
        du.registerDefaultInstance(ba.class, baVar);
    }

    private ba() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFlag(Iterable<? extends bd> iterable) {
        ensureFlagIsMutable();
        com.google.v.c.addAll(iterable, this.flag_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFlag(int i2, bd bdVar) {
        Objects.requireNonNull(bdVar);
        ensureFlagIsMutable();
        this.flag_.add(i2, bdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigurationVersion() {
        this.bitField0_ &= -9;
        this.configurationVersion_ = 0L;
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
    public void clearServerToken() {
        this.bitField0_ &= -5;
        this.serverToken_ = getDefaultInstance().getServerToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotToken() {
        this.bitField0_ &= -2;
        this.snapshotToken_ = getDefaultInstance().getSnapshotToken();
    }

    private void ensureFlagIsMutable() {
        eo<bd> eoVar = this.flag_;
        if (eoVar.c()) {
            return;
        }
        this.flag_ = du.mutableCopy(eoVar);
    }

    public static ba getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static az newBuilder() {
        return (az) DEFAULT_INSTANCE.createBuilder();
    }

    public static ba parseDelimitedFrom(InputStream inputStream) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(com.google.v.v vVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ba> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFlag(int i2) {
        ensureFlagIsMutable();
        this.flag_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigurationVersion(long j2) {
        this.bitField0_ |= 8;
        this.configurationVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentToken(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.experimentToken_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlag(int i2, bd bdVar) {
        Objects.requireNonNull(bdVar);
        ensureFlagIsMutable();
        this.flag_.set(i2, bdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.serverToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerTokenBytes(com.google.v.v vVar) {
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
    public void setSnapshotTokenBytes(com.google.v.v vVar) {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"bitField0_", "snapshotToken_", "experimentToken_", "serverToken_", "configurationVersion_", "flag_", bd.class});
        }
        if (iOrdinal == 3) {
            return new ba();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new az(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ba> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ba.class) {
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

    public com.google.v.v getExperimentToken() {
        return this.experimentToken_;
    }

    public bd getFlag(int i2) {
        return this.flag_.get(i2);
    }

    public int getFlagCount() {
        return this.flag_.size();
    }

    public List<bd> getFlagList() {
        return this.flag_;
    }

    public be getFlagOrBuilder(int i2) {
        return this.flag_.get(i2);
    }

    public List<? extends be> getFlagOrBuilderList() {
        return this.flag_;
    }

    public String getServerToken() {
        return this.serverToken_;
    }

    public com.google.v.v getServerTokenBytes() {
        return com.google.v.v.s(this.serverToken_);
    }

    public String getSnapshotToken() {
        return this.snapshotToken_;
    }

    public com.google.v.v getSnapshotTokenBytes() {
        return com.google.v.v.s(this.snapshotToken_);
    }

    public boolean hasConfigurationVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasExperimentToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasServerToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSnapshotToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static az newBuilder(ba baVar) {
        return (az) DEFAULT_INSTANCE.createBuilder(baVar);
    }

    public static ba parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(com.google.v.v vVar, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ba parseFrom(com.google.v.z zVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ba parseFrom(com.google.v.z zVar, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFlag(bd bdVar) {
        Objects.requireNonNull(bdVar);
        ensureFlagIsMutable();
        this.flag_.add(bdVar);
    }

    public static ba parseFrom(InputStream inputStream) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(InputStream inputStream, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(ByteBuffer byteBuffer) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ba parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ba parseFrom(byte[] bArr) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ba parseFrom(byte[] bArr, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
