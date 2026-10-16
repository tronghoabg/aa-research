package i.b.f.a;

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
public final class e extends du<e, d> implements fj {
    public static final int CLAIMED_FIELD_NUMBER = 6;
    public static final int CONDITION_STATE_FIELD_NUMBER = 4;
    private static final e DEFAULT_INSTANCE;
    private static volatile fo<e> PARSER = null;
    public static final int SEEN_FIELD_NUMBER = 7;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    public static final int TYPE_ID_FIELD_NUMBER = 2;
    public static final int UNLOCKED_FIELD_NUMBER = 3;
    public static final int UNLOCK_SESSION_FIELD_NUMBER = 8;
    private int bitField0_;
    private boolean claimed_;
    private boolean seen_;
    private long timestamp_;
    private boolean unlocked_;
    private String typeId_ = "";
    private eo<g> conditionState_ = emptyProtobufList();
    private String unlockSession_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConditionState(Iterable<? extends g> iterable) {
        ensureConditionStateIsMutable();
        com.google.v.c.addAll(iterable, this.conditionState_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConditionState(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureConditionStateIsMutable();
        this.conditionState_.add(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClaimed() {
        this.bitField0_ &= -9;
        this.claimed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConditionState() {
        this.conditionState_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeen() {
        this.bitField0_ &= -17;
        this.seen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.bitField0_ &= -5;
        this.timestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeId() {
        this.bitField0_ &= -2;
        this.typeId_ = getDefaultInstance().getTypeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnlockSession() {
        this.bitField0_ &= -33;
        this.unlockSession_ = getDefaultInstance().getUnlockSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnlocked() {
        this.bitField0_ &= -3;
        this.unlocked_ = false;
    }

    private void ensureConditionStateIsMutable() {
        eo<g> eoVar = this.conditionState_;
        if (eoVar.c()) {
            return;
        }
        this.conditionState_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(com.google.v.v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConditionState(int i2) {
        ensureConditionStateIsMutable();
        this.conditionState_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClaimed(boolean z) {
        this.bitField0_ |= 8;
        this.claimed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConditionState(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureConditionStateIsMutable();
        this.conditionState_.set(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeen(boolean z) {
        this.bitField0_ |= 16;
        this.seen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j2) {
        this.bitField0_ |= 4;
        this.timestamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.typeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeIdBytes(com.google.v.v vVar) {
        this.typeId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnlockSession(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.unlockSession_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnlockSessionBytes(com.google.v.v vVar) {
        this.unlockSession_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnlocked(boolean z) {
        this.bitField0_ |= 2;
        this.unlocked_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0000\u0002ဈ\u0000\u0003ဇ\u0001\u0004\u001b\u0005ဂ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဈ\u0005", new Object[]{"bitField0_", "typeId_", "unlocked_", "conditionState_", g.class, "timestamp_", "claimed_", "seen_", "unlockSession_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getClaimed() {
        return this.claimed_;
    }

    public g getConditionState(int i2) {
        return this.conditionState_.get(i2);
    }

    public int getConditionStateCount() {
        return this.conditionState_.size();
    }

    public List<g> getConditionStateList() {
        return this.conditionState_;
    }

    public h getConditionStateOrBuilder(int i2) {
        return this.conditionState_.get(i2);
    }

    public List<? extends h> getConditionStateOrBuilderList() {
        return this.conditionState_;
    }

    public boolean getSeen() {
        return this.seen_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public String getTypeId() {
        return this.typeId_;
    }

    public com.google.v.v getTypeIdBytes() {
        return com.google.v.v.s(this.typeId_);
    }

    public String getUnlockSession() {
        return this.unlockSession_;
    }

    public com.google.v.v getUnlockSessionBytes() {
        return com.google.v.v.s(this.unlockSession_);
    }

    public boolean getUnlocked() {
        return this.unlocked_;
    }

    public boolean hasClaimed() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSeen() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUnlockSession() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUnlocked() {
        return (this.bitField0_ & 2) != 0;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(com.google.v.v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(com.google.v.z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(com.google.v.z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConditionState(g gVar) {
        Objects.requireNonNull(gVar);
        ensureConditionStateIsMutable();
        this.conditionState_.add(gVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
