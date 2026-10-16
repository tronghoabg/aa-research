package com.google.android.libraries.phenotype.client.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends du<n, m> implements fj {
    public static final int ALLOW_EMPTY_SNAPSHOT_TOKEN_FIELD_NUMBER = 11;
    public static final int CLIENT_FLAGS_FIELD_NUMBER = 12;
    private static final n DEFAULT_INSTANCE;
    public static final int DIR_PATH_FIELD_NUMBER = 3;
    public static final int ENABLED_BACKINGS_FIELD_NUMBER = 7;
    public static final int ENABLE_COMMIT_V2_API_FIELD_NUMBER = 10;
    public static final int EXCLUDE_STATIC_CONFIG_PACKAGES_FIELD_NUMBER = 6;
    public static final int GMS_CORE_DATA_DIRECTORY_FIELD_NUMBER = 8;
    public static final int INCLUDE_STATIC_CONFIG_PACKAGES_FIELD_NUMBER = 5;
    public static final int LAST_FETCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static volatile fo<n> PARSER = null;
    public static final int RESTRICT_UPDATE_NOTIFICATIONS_FIELD_NUMBER = 13;
    public static final int SECRET_FIELD_NUMBER = 1;
    public static final int SHOULD_USE_SHARED_STORAGE_FIELD_NUMBER = 2;
    private static final el<com.google.g.a.a.b> enabledBackings_converter_ = new o(1);
    private boolean allowEmptySnapshotToken_;
    private int bitField0_;
    private l clientFlags_;
    private boolean enableCommitV2Api_;
    private int enabledBackingsMemoizedSerializedSize;
    private s gmsCoreDataDirectory_;
    private long lastFetchTimestampMillis_;
    private boolean restrictUpdateNotifications_;
    private boolean shouldUseSharedStorage_;
    private v secret_ = v.f13054a;
    private String dirPath_ = "";
    private eo<String> includeStaticConfigPackages_ = emptyProtobufList();
    private eo<String> excludeStaticConfigPackages_ = emptyProtobufList();
    private ek enabledBackings_ = emptyIntList();

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnabledBackings(Iterable<? extends com.google.g.a.a.b> iterable) {
        ensureEnabledBackingsIsMutable();
        Iterator<? extends com.google.g.a.a.b> it = iterable.iterator();
        while (it.hasNext()) {
            this.enabledBackings_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExcludeStaticConfigPackages(Iterable<String> iterable) {
        ensureExcludeStaticConfigPackagesIsMutable();
        com.google.v.c.addAll(iterable, this.excludeStaticConfigPackages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIncludeStaticConfigPackages(Iterable<String> iterable) {
        ensureIncludeStaticConfigPackagesIsMutable();
        com.google.v.c.addAll(iterable, this.includeStaticConfigPackages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnabledBackings(com.google.g.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureEnabledBackingsIsMutable();
        this.enabledBackings_.i(bVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludeStaticConfigPackages(String str) {
        Objects.requireNonNull(str);
        ensureExcludeStaticConfigPackagesIsMutable();
        this.excludeStaticConfigPackages_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludeStaticConfigPackagesBytes(v vVar) {
        ensureExcludeStaticConfigPackagesIsMutable();
        this.excludeStaticConfigPackages_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludeStaticConfigPackages(String str) {
        Objects.requireNonNull(str);
        ensureIncludeStaticConfigPackagesIsMutable();
        this.includeStaticConfigPackages_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludeStaticConfigPackagesBytes(v vVar) {
        ensureIncludeStaticConfigPackagesIsMutable();
        this.includeStaticConfigPackages_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowEmptySnapshotToken() {
        this.bitField0_ &= -65;
        this.allowEmptySnapshotToken_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientFlags() {
        this.clientFlags_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirPath() {
        this.bitField0_ &= -5;
        this.dirPath_ = getDefaultInstance().getDirPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableCommitV2Api() {
        this.bitField0_ &= -33;
        this.enableCommitV2Api_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabledBackings() {
        this.enabledBackings_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExcludeStaticConfigPackages() {
        this.excludeStaticConfigPackages_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmsCoreDataDirectory() {
        this.gmsCoreDataDirectory_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeStaticConfigPackages() {
        this.includeStaticConfigPackages_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastFetchTimestampMillis() {
        this.bitField0_ &= -9;
        this.lastFetchTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictUpdateNotifications() {
        this.bitField0_ &= -257;
        this.restrictUpdateNotifications_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecret() {
        this.bitField0_ &= -2;
        this.secret_ = getDefaultInstance().getSecret();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldUseSharedStorage() {
        this.bitField0_ &= -3;
        this.shouldUseSharedStorage_ = false;
    }

    private void ensureEnabledBackingsIsMutable() {
        ek ekVar = this.enabledBackings_;
        if (ekVar.c()) {
            return;
        }
        this.enabledBackings_ = du.mutableCopy(ekVar);
    }

    private void ensureExcludeStaticConfigPackagesIsMutable() {
        eo<String> eoVar = this.excludeStaticConfigPackages_;
        if (eoVar.c()) {
            return;
        }
        this.excludeStaticConfigPackages_ = du.mutableCopy(eoVar);
    }

    private void ensureIncludeStaticConfigPackagesIsMutable() {
        eo<String> eoVar = this.includeStaticConfigPackages_;
        if (eoVar.c()) {
            return;
        }
        this.includeStaticConfigPackages_ = du.mutableCopy(eoVar);
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientFlags(l lVar) {
        Objects.requireNonNull(lVar);
        l lVar2 = this.clientFlags_;
        if (lVar2 != null && lVar2 != l.getDefaultInstance()) {
            k kVarNewBuilder = l.newBuilder(lVar2);
            kVarNewBuilder.mergeFrom((k) lVar);
            lVar = kVarNewBuilder.buildPartial();
        }
        this.clientFlags_ = lVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGmsCoreDataDirectory(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.gmsCoreDataDirectory_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder(sVar2);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.gmsCoreDataDirectory_ = sVar;
        this.bitField0_ |= 16;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(v vVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowEmptySnapshotToken(boolean z) {
        this.bitField0_ |= 64;
        this.allowEmptySnapshotToken_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientFlags(l lVar) {
        Objects.requireNonNull(lVar);
        this.clientFlags_ = lVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirPath(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.dirPath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirPathBytes(v vVar) {
        this.dirPath_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableCommitV2Api(boolean z) {
        this.bitField0_ |= 32;
        this.enableCommitV2Api_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledBackings(int i2, com.google.g.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureEnabledBackingsIsMutable();
        this.enabledBackings_.e(i2, bVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExcludeStaticConfigPackages(int i2, String str) {
        Objects.requireNonNull(str);
        ensureExcludeStaticConfigPackagesIsMutable();
        this.excludeStaticConfigPackages_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmsCoreDataDirectory(s sVar) {
        Objects.requireNonNull(sVar);
        this.gmsCoreDataDirectory_ = sVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeStaticConfigPackages(int i2, String str) {
        Objects.requireNonNull(str);
        ensureIncludeStaticConfigPackagesIsMutable();
        this.includeStaticConfigPackages_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastFetchTimestampMillis(long j2) {
        this.bitField0_ |= 8;
        this.lastFetchTimestampMillis_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictUpdateNotifications(boolean z) {
        this.bitField0_ |= 256;
        this.restrictUpdateNotifications_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecret(v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.secret_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldUseSharedStorage(boolean z) {
        this.bitField0_ |= 2;
        this.shouldUseSharedStorage_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\f\u0000\u0001\u0001\r\f\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007\rဇ\b", new Object[]{"bitField0_", "secret_", "shouldUseSharedStorage_", "dirPath_", "lastFetchTimestampMillis_", "includeStaticConfigPackages_", "excludeStaticConfigPackages_", "enabledBackings_", com.google.g.a.a.b.b(), "gmsCoreDataDirectory_", "enableCommitV2Api_", "allowEmptySnapshotToken_", "clientFlags_", "restrictUpdateNotifications_"});
        }
        if (iOrdinal == 3) {
            return new n();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<n> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (n.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAllowEmptySnapshotToken() {
        return this.allowEmptySnapshotToken_;
    }

    public l getClientFlags() {
        l lVar = this.clientFlags_;
        return lVar == null ? l.getDefaultInstance() : lVar;
    }

    public String getDirPath() {
        return this.dirPath_;
    }

    public v getDirPathBytes() {
        return v.s(this.dirPath_);
    }

    public boolean getEnableCommitV2Api() {
        return this.enableCommitV2Api_;
    }

    public com.google.g.a.a.b getEnabledBackings(int i2) {
        com.google.g.a.a.b bVarA = com.google.g.a.a.b.a(this.enabledBackings_.d(i2));
        return bVarA == null ? com.google.g.a.a.b.UNKNOWN : bVarA;
    }

    public int getEnabledBackingsCount() {
        return this.enabledBackings_.size();
    }

    public List<com.google.g.a.a.b> getEnabledBackingsList() {
        return new em(this.enabledBackings_, enabledBackings_converter_);
    }

    public String getExcludeStaticConfigPackages(int i2) {
        return this.excludeStaticConfigPackages_.get(i2);
    }

    public v getExcludeStaticConfigPackagesBytes(int i2) {
        return v.s(this.excludeStaticConfigPackages_.get(i2));
    }

    public int getExcludeStaticConfigPackagesCount() {
        return this.excludeStaticConfigPackages_.size();
    }

    public List<String> getExcludeStaticConfigPackagesList() {
        return this.excludeStaticConfigPackages_;
    }

    public s getGmsCoreDataDirectory() {
        s sVar = this.gmsCoreDataDirectory_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public String getIncludeStaticConfigPackages(int i2) {
        return this.includeStaticConfigPackages_.get(i2);
    }

    public v getIncludeStaticConfigPackagesBytes(int i2) {
        return v.s(this.includeStaticConfigPackages_.get(i2));
    }

    public int getIncludeStaticConfigPackagesCount() {
        return this.includeStaticConfigPackages_.size();
    }

    public List<String> getIncludeStaticConfigPackagesList() {
        return this.includeStaticConfigPackages_;
    }

    public long getLastFetchTimestampMillis() {
        return this.lastFetchTimestampMillis_;
    }

    public boolean getRestrictUpdateNotifications() {
        return this.restrictUpdateNotifications_;
    }

    public v getSecret() {
        return this.secret_;
    }

    public boolean getShouldUseSharedStorage() {
        return this.shouldUseSharedStorage_;
    }

    public boolean hasAllowEmptySnapshotToken() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasClientFlags() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDirPath() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEnableCommitV2Api() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasGmsCoreDataDirectory() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasLastFetchTimestampMillis() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRestrictUpdateNotifications() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasSecret() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShouldUseSharedStorage() {
        return (this.bitField0_ & 2) != 0;
    }

    public static m newBuilder(n nVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(v vVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(z zVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(z zVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
