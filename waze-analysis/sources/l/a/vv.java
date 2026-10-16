package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vv extends com.google.v.du<vv, vu> implements com.google.v.fj {
    private static final vv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<vv> PARSER = null;
    public static final int TIMELINE_ALERTS_FIELD_NUMBER = 1;
    public static final int TIMELINE_TRAFFIC_INCIDENTS_FIELD_NUMBER = 2;
    private com.google.v.eo<bim> timelineAlerts_ = emptyProtobufList();
    private com.google.v.eo<biq> timelineTrafficIncidents_ = emptyProtobufList();

    static {
        vv vvVar = new vv();
        DEFAULT_INSTANCE = vvVar;
        com.google.v.du.registerDefaultInstance(vv.class, vvVar);
    }

    private vv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimelineAlerts(Iterable<? extends bim> iterable) {
        ensureTimelineAlertsIsMutable();
        com.google.v.c.addAll(iterable, this.timelineAlerts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimelineTrafficIncidents(Iterable<? extends biq> iterable) {
        ensureTimelineTrafficIncidentsIsMutable();
        com.google.v.c.addAll(iterable, this.timelineTrafficIncidents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimelineAlerts(int i2, bim bimVar) {
        Objects.requireNonNull(bimVar);
        ensureTimelineAlertsIsMutable();
        this.timelineAlerts_.add(i2, bimVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimelineTrafficIncidents(int i2, biq biqVar) {
        Objects.requireNonNull(biqVar);
        ensureTimelineTrafficIncidentsIsMutable();
        this.timelineTrafficIncidents_.add(i2, biqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelineAlerts() {
        this.timelineAlerts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelineTrafficIncidents() {
        this.timelineTrafficIncidents_ = emptyProtobufList();
    }

    private void ensureTimelineAlertsIsMutable() {
        com.google.v.eo<bim> eoVar = this.timelineAlerts_;
        if (eoVar.c()) {
            return;
        }
        this.timelineAlerts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTimelineTrafficIncidentsIsMutable() {
        com.google.v.eo<biq> eoVar = this.timelineTrafficIncidents_;
        if (eoVar.c()) {
            return;
        }
        this.timelineTrafficIncidents_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static vv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static vu newBuilder() {
        return (vu) DEFAULT_INSTANCE.createBuilder();
    }

    public static vv parseDelimitedFrom(InputStream inputStream) {
        return (vv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vv parseFrom(com.google.v.v vVar) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<vv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTimelineAlerts(int i2) {
        ensureTimelineAlertsIsMutable();
        this.timelineAlerts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTimelineTrafficIncidents(int i2) {
        ensureTimelineTrafficIncidentsIsMutable();
        this.timelineTrafficIncidents_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelineAlerts(int i2, bim bimVar) {
        Objects.requireNonNull(bimVar);
        ensureTimelineAlertsIsMutable();
        this.timelineAlerts_.set(i2, bimVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelineTrafficIncidents(int i2, biq biqVar) {
        Objects.requireNonNull(biqVar);
        ensureTimelineTrafficIncidentsIsMutable();
        this.timelineTrafficIncidents_.set(i2, biqVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"timelineAlerts_", bim.class, "timelineTrafficIncidents_", biq.class});
        }
        if (iOrdinal == 3) {
            return new vv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<vv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (vv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bim getTimelineAlerts(int i2) {
        return this.timelineAlerts_.get(i2);
    }

    public int getTimelineAlertsCount() {
        return this.timelineAlerts_.size();
    }

    public List<bim> getTimelineAlertsList() {
        return this.timelineAlerts_;
    }

    public bin getTimelineAlertsOrBuilder(int i2) {
        return this.timelineAlerts_.get(i2);
    }

    public List<? extends bin> getTimelineAlertsOrBuilderList() {
        return this.timelineAlerts_;
    }

    public biq getTimelineTrafficIncidents(int i2) {
        return this.timelineTrafficIncidents_.get(i2);
    }

    public int getTimelineTrafficIncidentsCount() {
        return this.timelineTrafficIncidents_.size();
    }

    public List<biq> getTimelineTrafficIncidentsList() {
        return this.timelineTrafficIncidents_;
    }

    public bir getTimelineTrafficIncidentsOrBuilder(int i2) {
        return this.timelineTrafficIncidents_.get(i2);
    }

    public List<? extends bir> getTimelineTrafficIncidentsOrBuilderList() {
        return this.timelineTrafficIncidents_;
    }

    public static vu newBuilder(vv vvVar) {
        return (vu) DEFAULT_INSTANCE.createBuilder(vvVar);
    }

    public static vv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static vv parseFrom(com.google.v.z zVar) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static vv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimelineAlerts(bim bimVar) {
        Objects.requireNonNull(bimVar);
        ensureTimelineAlertsIsMutable();
        this.timelineAlerts_.add(bimVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimelineTrafficIncidents(biq biqVar) {
        Objects.requireNonNull(biqVar);
        ensureTimelineTrafficIncidentsIsMutable();
        this.timelineTrafficIncidents_.add(biqVar);
    }

    public static vv parseFrom(InputStream inputStream) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vv parseFrom(ByteBuffer byteBuffer) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static vv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static vv parseFrom(byte[] bArr) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static vv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (vv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
