package com.google.android.libraries.phenotype.client.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ff;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends du<c, a> implements fj {
    public static final int CONFIGURATION_VERSION_FIELD_NUMBER = 4;
    private static final c DEFAULT_INSTANCE;
    public static final int EXPERIMENT_TOKEN_FIELD_NUMBER = 2;
    public static final int FORCED_FLAGS_FIELD_NUMBER = 5;
    private static volatile fo<c> PARSER = null;
    public static final int SERVER_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private long configurationVersion_;
    private ff<String, com.google.android.libraries.phenotype.client.a.k> forcedFlags_ = ff.a();
    private String snapshotToken_ = "";
    private v experimentToken_ = v.f13054a;
    private String serverToken_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
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
    public void clearServerToken() {
        this.bitField0_ &= -5;
        this.serverToken_ = getDefaultInstance().getServerToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotToken() {
        this.bitField0_ &= -2;
        this.snapshotToken_ = getDefaultInstance().getSnapshotToken();
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, com.google.android.libraries.phenotype.client.a.k> getMutableForcedFlagsMap() {
        return internalGetMutableForcedFlags();
    }

    private ff<String, com.google.android.libraries.phenotype.client.a.k> internalGetForcedFlags() {
        return this.forcedFlags_;
    }

    private ff<String, com.google.android.libraries.phenotype.client.a.k> internalGetMutableForcedFlags() {
        if (!this.forcedFlags_.e()) {
            this.forcedFlags_ = this.forcedFlags_.b();
        }
        return this.forcedFlags_;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigurationVersion(long j2) {
        this.bitField0_ |= 8;
        this.configurationVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentToken(v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.experimentToken_ = vVar;
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

    public boolean containsForcedFlags(String str) {
        Objects.requireNonNull(str);
        return internalGetForcedFlags().containsKey(str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"bitField0_", "snapshotToken_", "experimentToken_", "serverToken_", "configurationVersion_", "forcedFlags_", b.f5969a});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
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

    public v getExperimentToken() {
        return this.experimentToken_;
    }

    public int getForcedFlagsCount() {
        return internalGetForcedFlags().size();
    }

    public Map<String, com.google.android.libraries.phenotype.client.a.k> getForcedFlagsMap() {
        return DesugarCollections.unmodifiableMap(internalGetForcedFlags());
    }

    public com.google.android.libraries.phenotype.client.a.k getForcedFlagsOrDefault(String str, com.google.android.libraries.phenotype.client.a.k kVar) {
        Objects.requireNonNull(str);
        com.google.android.libraries.phenotype.client.a.k kVar2 = internalGetForcedFlags().get(str);
        return kVar2 != null ? kVar2 : kVar;
    }

    public com.google.android.libraries.phenotype.client.a.k getForcedFlagsOrThrow(String str) {
        Objects.requireNonNull(str);
        com.google.android.libraries.phenotype.client.a.k kVar = internalGetForcedFlags().get(str);
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException();
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

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
