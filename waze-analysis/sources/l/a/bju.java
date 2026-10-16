package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bju extends com.google.v.du<bju, bjt> implements com.google.v.fj {
    private static final bju DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bju> PARSER = null;
    public static final int TRAFFIC_PILL_ALERTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long durationSeconds_;
    private com.google.v.eo<bjr> trafficPillAlerts_ = emptyProtobufList();

    static {
        bju bjuVar = new bju();
        DEFAULT_INSTANCE = bjuVar;
        com.google.v.du.registerDefaultInstance(bju.class, bjuVar);
    }

    private bju() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrafficPillAlerts(Iterable<? extends bjr> iterable) {
        ensureTrafficPillAlertsIsMutable();
        com.google.v.c.addAll(iterable, this.trafficPillAlerts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficPillAlerts(int i2, bjr bjrVar) {
        Objects.requireNonNull(bjrVar);
        ensureTrafficPillAlertsIsMutable();
        this.trafficPillAlerts_.add(i2, bjrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationSeconds() {
        this.bitField0_ &= -2;
        this.durationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficPillAlerts() {
        this.trafficPillAlerts_ = emptyProtobufList();
    }

    private void ensureTrafficPillAlertsIsMutable() {
        com.google.v.eo<bjr> eoVar = this.trafficPillAlerts_;
        if (eoVar.c()) {
            return;
        }
        this.trafficPillAlerts_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bju getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bjt newBuilder() {
        return (bjt) DEFAULT_INSTANCE.createBuilder();
    }

    public static bju parseDelimitedFrom(InputStream inputStream) {
        return (bju) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bju parseFrom(com.google.v.v vVar) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bju> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrafficPillAlerts(int i2) {
        ensureTrafficPillAlertsIsMutable();
        this.trafficPillAlerts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationSeconds(long j2) {
        this.bitField0_ |= 1;
        this.durationSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficPillAlerts(int i2, bjr bjrVar) {
        Objects.requireNonNull(bjrVar);
        ensureTrafficPillAlertsIsMutable();
        this.trafficPillAlerts_.set(i2, bjrVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"bitField0_", "trafficPillAlerts_", bjr.class, "durationSeconds_"});
        }
        if (iOrdinal == 3) {
            return new bju();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bjt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bju> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bju.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDurationSeconds() {
        return this.durationSeconds_;
    }

    public bjr getTrafficPillAlerts(int i2) {
        return this.trafficPillAlerts_.get(i2);
    }

    public int getTrafficPillAlertsCount() {
        return this.trafficPillAlerts_.size();
    }

    public List<bjr> getTrafficPillAlertsList() {
        return this.trafficPillAlerts_;
    }

    public bjs getTrafficPillAlertsOrBuilder(int i2) {
        return this.trafficPillAlerts_.get(i2);
    }

    public List<? extends bjs> getTrafficPillAlertsOrBuilderList() {
        return this.trafficPillAlerts_;
    }

    public boolean hasDurationSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bjt newBuilder(bju bjuVar) {
        return (bjt) DEFAULT_INSTANCE.createBuilder(bjuVar);
    }

    public static bju parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bju) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bju parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bju parseFrom(com.google.v.z zVar) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bju parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficPillAlerts(bjr bjrVar) {
        Objects.requireNonNull(bjrVar);
        ensureTrafficPillAlertsIsMutable();
        this.trafficPillAlerts_.add(bjrVar);
    }

    public static bju parseFrom(InputStream inputStream) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bju parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bju parseFrom(ByteBuffer byteBuffer) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bju parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bju parseFrom(byte[] bArr) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bju parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bju) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
