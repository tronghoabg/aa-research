package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ai extends com.google.v.du<ai, ag> implements com.google.v.fj {
    public static final int ALMOSTTHEREPUSHSENT_FIELD_NUMBER = 5;
    public static final int CHANGEETAPUSHSENT_FIELD_NUMBER = 4;
    public static final int CURRENTWATCHERS_FIELD_NUMBER = 2;
    private static final ai DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ai> PARSER = null;
    public static final int SHARETYPE_FIELD_NUMBER = 7;
    public static final int TOTALWATCHERS_FIELD_NUMBER = 3;
    public static final int WATCHED_FIELD_NUMBER = 1;
    public static final int WATCHERNAMES_FIELD_NUMBER = 6;
    private boolean almostTherePushSent_;
    private int bitField0_;
    private boolean changeEtaPushSent_;
    private int currentWatchers_;
    private int totalWatchers_;
    private boolean watched_;
    private com.google.v.eo<String> watcherNames_ = emptyProtobufList();
    private int shareType_ = 1;

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        com.google.v.du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWatcherNames(Iterable<String> iterable) {
        ensureWatcherNamesIsMutable();
        com.google.v.c.addAll(iterable, this.watcherNames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWatcherNames(String str) {
        Objects.requireNonNull(str);
        ensureWatcherNamesIsMutable();
        this.watcherNames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWatcherNamesBytes(com.google.v.v vVar) {
        ensureWatcherNamesIsMutable();
        this.watcherNames_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlmostTherePushSent() {
        this.bitField0_ &= -17;
        this.almostTherePushSent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeEtaPushSent() {
        this.bitField0_ &= -9;
        this.changeEtaPushSent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentWatchers() {
        this.bitField0_ &= -3;
        this.currentWatchers_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareType() {
        this.bitField0_ &= -33;
        this.shareType_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalWatchers() {
        this.bitField0_ &= -5;
        this.totalWatchers_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatched() {
        this.bitField0_ &= -2;
        this.watched_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatcherNames() {
        this.watcherNames_ = emptyProtobufList();
    }

    private void ensureWatcherNamesIsMutable() {
        com.google.v.eo<String> eoVar = this.watcherNames_;
        if (eoVar.c()) {
            return;
        }
        this.watcherNames_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlmostTherePushSent(boolean z) {
        this.bitField0_ |= 16;
        this.almostTherePushSent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeEtaPushSent(boolean z) {
        this.bitField0_ |= 8;
        this.changeEtaPushSent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentWatchers(int i2) {
        this.bitField0_ |= 2;
        this.currentWatchers_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareType(ah ahVar) {
        this.shareType_ = ahVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalWatchers(int i2) {
        this.bitField0_ |= 4;
        this.totalWatchers_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatched(boolean z) {
        this.bitField0_ |= 1;
        this.watched_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatcherNames(int i2, String str) {
        Objects.requireNonNull(str);
        ensureWatcherNamesIsMutable();
        this.watcherNames_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006\u001a\u0007᠌\u0005", new Object[]{"bitField0_", "watched_", "currentWatchers_", "totalWatchers_", "changeEtaPushSent_", "almostTherePushSent_", "watcherNames_", "shareType_", e.f48662i});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAlmostTherePushSent() {
        return this.almostTherePushSent_;
    }

    public boolean getChangeEtaPushSent() {
        return this.changeEtaPushSent_;
    }

    public int getCurrentWatchers() {
        return this.currentWatchers_;
    }

    public ah getShareType() {
        ah ahVarA = ah.a(this.shareType_);
        return ahVarA == null ? ah.ROUTE_AND_ETA : ahVarA;
    }

    public int getTotalWatchers() {
        return this.totalWatchers_;
    }

    public boolean getWatched() {
        return this.watched_;
    }

    public String getWatcherNames(int i2) {
        return this.watcherNames_.get(i2);
    }

    public com.google.v.v getWatcherNamesBytes(int i2) {
        return com.google.v.v.s(this.watcherNames_.get(i2));
    }

    public int getWatcherNamesCount() {
        return this.watcherNames_.size();
    }

    public List<String> getWatcherNamesList() {
        return this.watcherNames_;
    }

    public boolean hasAlmostTherePushSent() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasChangeEtaPushSent() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCurrentWatchers() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasShareType() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTotalWatchers() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWatched() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ag newBuilder(ai aiVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
