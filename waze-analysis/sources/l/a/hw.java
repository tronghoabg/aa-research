package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hw extends com.google.v.du<hw, hu> implements com.google.v.fj {
    public static final int BEACONS_AROUND_STATUS_CHANGED_FIELD_NUMBER = 6;
    public static final int BEACONS_RECEPTION_CHANGED_FIELD_NUMBER = 2;
    public static final int BEACON_DATA_FIELD_NUMBER = 1;
    public static final int BEACON_SCANNING_STARTED_FIELD_NUMBER = 4;
    public static final int BEACON_SCANNING_STOPPED_FIELD_NUMBER = 5;
    public static final int BEACON_TELEMETRY_FIELD_NUMBER = 3;
    private static final hw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hw> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        hw hwVar = new hw();
        DEFAULT_INSTANCE = hwVar;
        com.google.v.du.registerDefaultInstance(hw.class, hwVar);
    }

    private hw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconData() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconScanningStarted() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconScanningStopped() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconTelemetry() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconsAroundStatusChanged() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconsReceptionChanged() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static hw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeaconData(hm hmVar) {
        Objects.requireNonNull(hmVar);
        if (this.statCase_ == 1 && this.stat_ != hm.getDefaultInstance()) {
            hl hlVarNewBuilder = hm.newBuilder((hm) this.stat_);
            hlVarNewBuilder.mergeFrom((hl) hmVar);
            hmVar = hlVarNewBuilder.buildPartial();
        }
        this.stat_ = hmVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeaconScanningStarted(hr hrVar) {
        Objects.requireNonNull(hrVar);
        if (this.statCase_ == 4 && this.stat_ != hr.getDefaultInstance()) {
            hq hqVarNewBuilder = hr.newBuilder((hr) this.stat_);
            hqVarNewBuilder.mergeFrom((hq) hrVar);
            hrVar = hqVarNewBuilder.buildPartial();
        }
        this.stat_ = hrVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeaconScanningStopped(ht htVar) {
        Objects.requireNonNull(htVar);
        if (this.statCase_ == 5 && this.stat_ != ht.getDefaultInstance()) {
            hs hsVarNewBuilder = ht.newBuilder((ht) this.stat_);
            hsVarNewBuilder.mergeFrom((hs) htVar);
            htVar = hsVarNewBuilder.buildPartial();
        }
        this.stat_ = htVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeaconTelemetry(hy hyVar) {
        Objects.requireNonNull(hyVar);
        if (this.statCase_ == 3 && this.stat_ != hy.getDefaultInstance()) {
            hx hxVarNewBuilder = hy.newBuilder((hy) this.stat_);
            hxVarNewBuilder.mergeFrom((hx) hyVar);
            hyVar = hxVarNewBuilder.buildPartial();
        }
        this.stat_ = hyVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeaconsAroundStatusChanged(ia iaVar) {
        Objects.requireNonNull(iaVar);
        if (this.statCase_ == 6 && this.stat_ != ia.getDefaultInstance()) {
            hz hzVarNewBuilder = ia.newBuilder((ia) this.stat_);
            hzVarNewBuilder.mergeFrom((hz) iaVar);
            iaVar = hzVarNewBuilder.buildPartial();
        }
        this.stat_ = iaVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeaconsReceptionChanged(id idVar) {
        Objects.requireNonNull(idVar);
        if (this.statCase_ == 2 && this.stat_ != id.getDefaultInstance()) {
            ib ibVarNewBuilder = id.newBuilder((id) this.stat_);
            ibVarNewBuilder.mergeFrom((ib) idVar);
            idVar = ibVarNewBuilder.buildPartial();
        }
        this.stat_ = idVar;
        this.statCase_ = 2;
    }

    public static hu newBuilder() {
        return (hu) DEFAULT_INSTANCE.createBuilder();
    }

    public static hw parseDelimitedFrom(InputStream inputStream) {
        return (hw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hw parseFrom(com.google.v.v vVar) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconData(hm hmVar) {
        Objects.requireNonNull(hmVar);
        this.stat_ = hmVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconScanningStarted(hr hrVar) {
        Objects.requireNonNull(hrVar);
        this.stat_ = hrVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconScanningStopped(ht htVar) {
        Objects.requireNonNull(htVar);
        this.stat_ = htVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconTelemetry(hy hyVar) {
        Objects.requireNonNull(hyVar);
        this.stat_ = hyVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconsAroundStatusChanged(ia iaVar) {
        Objects.requireNonNull(iaVar);
        this.stat_ = iaVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconsReceptionChanged(id idVar) {
        Objects.requireNonNull(idVar);
        this.stat_ = idVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"stat_", "statCase_", hm.class, id.class, hy.class, hr.class, ht.class, ia.class});
        }
        if (iOrdinal == 3) {
            return new hw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hm getBeaconData() {
        return this.statCase_ == 1 ? (hm) this.stat_ : hm.getDefaultInstance();
    }

    public hr getBeaconScanningStarted() {
        return this.statCase_ == 4 ? (hr) this.stat_ : hr.getDefaultInstance();
    }

    public ht getBeaconScanningStopped() {
        return this.statCase_ == 5 ? (ht) this.stat_ : ht.getDefaultInstance();
    }

    public hy getBeaconTelemetry() {
        return this.statCase_ == 3 ? (hy) this.stat_ : hy.getDefaultInstance();
    }

    public ia getBeaconsAroundStatusChanged() {
        return this.statCase_ == 6 ? (ia) this.stat_ : ia.getDefaultInstance();
    }

    public id getBeaconsReceptionChanged() {
        return this.statCase_ == 2 ? (id) this.stat_ : id.getDefaultInstance();
    }

    public hv getStatCase() {
        switch (this.statCase_) {
            case 0:
                return hv.f54953g;
            case 1:
                return hv.f54947a;
            case 2:
                return hv.f54948b;
            case 3:
                return hv.f54949c;
            case 4:
                return hv.f54950d;
            case 5:
                return hv.f54951e;
            case 6:
                return hv.f54952f;
            default:
                return null;
        }
    }

    public boolean hasBeaconData() {
        return this.statCase_ == 1;
    }

    public boolean hasBeaconScanningStarted() {
        return this.statCase_ == 4;
    }

    public boolean hasBeaconScanningStopped() {
        return this.statCase_ == 5;
    }

    public boolean hasBeaconTelemetry() {
        return this.statCase_ == 3;
    }

    public boolean hasBeaconsAroundStatusChanged() {
        return this.statCase_ == 6;
    }

    public boolean hasBeaconsReceptionChanged() {
        return this.statCase_ == 2;
    }

    public static hu newBuilder(hw hwVar) {
        return (hu) DEFAULT_INSTANCE.createBuilder(hwVar);
    }

    public static hw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hw parseFrom(com.google.v.z zVar) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hw parseFrom(InputStream inputStream) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hw parseFrom(ByteBuffer byteBuffer) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hw parseFrom(byte[] bArr) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
