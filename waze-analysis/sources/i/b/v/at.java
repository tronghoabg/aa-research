package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class at extends com.google.v.du<at, y> implements com.google.v.fj {
    public static final int ACCESS_TYPE_FIELD_NUMBER = 12;
    public static final int AVAILABILITYLASTUPDATETIME_FIELD_NUMBER = 3;
    public static final int CHARGINGPORTSAVAILABILITY_FIELD_NUMBER = 2;
    public static final int CHARGINGPORTS_FIELD_NUMBER = 1;
    public static final int CHARGING_STATIONS_FIELD_NUMBER = 4;
    public static final int CHARGING_STATION_GROUP_ID_FIELD_NUMBER = 6;
    public static final int COST_TYPE_FIELD_NUMBER = 9;
    private static final at DEFAULT_INSTANCE;
    public static final int DIRECTIONS_FIELD_NUMBER = 7;
    public static final int EDITOR_UPDATED_FIELD_NUMBER = 10;
    public static final int NETWORK_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<at> PARSER = null;
    public static final int PAYMENT_METHODS_FIELD_NUMBER = 11;
    public static final int SOURCE_FIELD_NUMBER = 5;
    private static final com.google.v.el<ar> paymentMethods_converter_ = new al(1);
    private int accessType_;
    private long availabilityLastUpdateTime_;
    private int bitField0_;
    private int costType_;
    private boolean editorUpdated_;
    private int source_;
    private com.google.v.eo<aj> chargingPorts_ = emptyProtobufList();
    private com.google.v.eo<ac> chargingPortsAvailability_ = emptyProtobufList();
    private com.google.v.eo<ao> chargingStations_ = emptyProtobufList();
    private String chargingStationGroupId_ = "";
    private String directions_ = "";
    private String network_ = "";
    private com.google.v.ek paymentMethods_ = emptyIntList();

    static {
        at atVar = new at();
        DEFAULT_INSTANCE = atVar;
        com.google.v.du.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChargingPorts(Iterable<? extends aj> iterable) {
        ensureChargingPortsIsMutable();
        com.google.v.c.addAll(iterable, this.chargingPorts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChargingPortsAvailability(Iterable<? extends ac> iterable) {
        ensureChargingPortsAvailabilityIsMutable();
        com.google.v.c.addAll(iterable, this.chargingPortsAvailability_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChargingStations(Iterable<? extends ao> iterable) {
        ensureChargingStationsIsMutable();
        com.google.v.c.addAll(iterable, this.chargingStations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaymentMethods(Iterable<? extends ar> iterable) {
        ensurePaymentMethodsIsMutable();
        Iterator<? extends ar> it = iterable.iterator();
        while (it.hasNext()) {
            this.paymentMethods_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChargingPorts(int i2, aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureChargingPortsIsMutable();
        this.chargingPorts_.add(i2, ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChargingPortsAvailability(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensureChargingPortsAvailabilityIsMutable();
        this.chargingPortsAvailability_.add(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChargingStations(int i2, ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureChargingStationsIsMutable();
        this.chargingStations_.add(i2, aoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaymentMethods(ar arVar) {
        Objects.requireNonNull(arVar);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.i(arVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessType() {
        this.bitField0_ &= -129;
        this.accessType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityLastUpdateTime() {
        this.bitField0_ &= -2;
        this.availabilityLastUpdateTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChargingPorts() {
        this.chargingPorts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChargingPortsAvailability() {
        this.chargingPortsAvailability_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChargingStationGroupId() {
        this.bitField0_ &= -5;
        this.chargingStationGroupId_ = getDefaultInstance().getChargingStationGroupId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChargingStations() {
        this.chargingStations_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCostType() {
        this.bitField0_ &= -33;
        this.costType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirections() {
        this.bitField0_ &= -9;
        this.directions_ = getDefaultInstance().getDirections();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditorUpdated() {
        this.bitField0_ &= -65;
        this.editorUpdated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetwork() {
        this.bitField0_ &= -17;
        this.network_ = getDefaultInstance().getNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaymentMethods() {
        this.paymentMethods_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -3;
        this.source_ = 0;
    }

    private void ensureChargingPortsAvailabilityIsMutable() {
        com.google.v.eo<ac> eoVar = this.chargingPortsAvailability_;
        if (eoVar.c()) {
            return;
        }
        this.chargingPortsAvailability_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureChargingPortsIsMutable() {
        com.google.v.eo<aj> eoVar = this.chargingPorts_;
        if (eoVar.c()) {
            return;
        }
        this.chargingPorts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureChargingStationsIsMutable() {
        com.google.v.eo<ao> eoVar = this.chargingStations_;
        if (eoVar.c()) {
            return;
        }
        this.chargingStations_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePaymentMethodsIsMutable() {
        com.google.v.ek ekVar = this.paymentMethods_;
        if (ekVar.c()) {
            return;
        }
        this.paymentMethods_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static at getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static y newBuilder() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    public static at parseDelimitedFrom(InputStream inputStream) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(com.google.v.v vVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<at> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChargingPorts(int i2) {
        ensureChargingPortsIsMutable();
        this.chargingPorts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChargingPortsAvailability(int i2) {
        ensureChargingPortsAvailabilityIsMutable();
        this.chargingPortsAvailability_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChargingStations(int i2) {
        ensureChargingStationsIsMutable();
        this.chargingStations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessType(aa aaVar) {
        this.accessType_ = aaVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityLastUpdateTime(long j2) {
        this.bitField0_ |= 1;
        this.availabilityLastUpdateTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargingPorts(int i2, aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureChargingPortsIsMutable();
        this.chargingPorts_.set(i2, ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargingPortsAvailability(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensureChargingPortsAvailabilityIsMutable();
        this.chargingPortsAvailability_.set(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargingStationGroupId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.chargingStationGroupId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargingStationGroupIdBytes(com.google.v.v vVar) {
        this.chargingStationGroupId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargingStations(int i2, ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureChargingStationsIsMutable();
        this.chargingStations_.set(i2, aoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCostType(ae aeVar) {
        this.costType_ = aeVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirections(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.directions_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionsBytes(com.google.v.v vVar) {
        this.directions_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditorUpdated(boolean z) {
        this.bitField0_ |= 64;
        this.editorUpdated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.network_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkBytes(com.google.v.v vVar) {
        this.network_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaymentMethods(int i2, ar arVar) {
        Objects.requireNonNull(arVar);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.e(i2, arVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(as asVar) {
        this.source_ = asVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003ဂ\u0000\u0004\u001b\u0005᠌\u0001\u0006ဈ\u0002\u0007ဈ\u0003\bဈ\u0004\t᠌\u0005\nဇ\u0006\u000bࠞ\f᠌\u0007", new Object[]{"bitField0_", "chargingPorts_", aj.class, "chargingPortsAvailability_", ac.class, "availabilityLastUpdateTime_", "chargingStations_", ao.class, "source_", z.f49560g, "chargingStationGroupId_", "directions_", "network_", "costType_", z.f49556c, "editorUpdated_", "paymentMethods_", z.f49559f, "accessType_", z.f49554a});
        }
        if (iOrdinal == 3) {
            return new at();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new y(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<at> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (at.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aa getAccessType() {
        aa aaVarA = aa.a(this.accessType_);
        return aaVarA == null ? aa.CHARGERS_ACCESS_TYPE_UNKNOWN : aaVarA;
    }

    public long getAvailabilityLastUpdateTime() {
        return this.availabilityLastUpdateTime_;
    }

    @Deprecated
    public aj getChargingPorts(int i2) {
        return this.chargingPorts_.get(i2);
    }

    @Deprecated
    public ac getChargingPortsAvailability(int i2) {
        return this.chargingPortsAvailability_.get(i2);
    }

    @Deprecated
    public int getChargingPortsAvailabilityCount() {
        return this.chargingPortsAvailability_.size();
    }

    @Deprecated
    public List<ac> getChargingPortsAvailabilityList() {
        return this.chargingPortsAvailability_;
    }

    @Deprecated
    public ad getChargingPortsAvailabilityOrBuilder(int i2) {
        return this.chargingPortsAvailability_.get(i2);
    }

    @Deprecated
    public List<? extends ad> getChargingPortsAvailabilityOrBuilderList() {
        return this.chargingPortsAvailability_;
    }

    @Deprecated
    public int getChargingPortsCount() {
        return this.chargingPorts_.size();
    }

    @Deprecated
    public List<aj> getChargingPortsList() {
        return this.chargingPorts_;
    }

    @Deprecated
    public ak getChargingPortsOrBuilder(int i2) {
        return this.chargingPorts_.get(i2);
    }

    @Deprecated
    public List<? extends ak> getChargingPortsOrBuilderList() {
        return this.chargingPorts_;
    }

    public String getChargingStationGroupId() {
        return this.chargingStationGroupId_;
    }

    public com.google.v.v getChargingStationGroupIdBytes() {
        return com.google.v.v.s(this.chargingStationGroupId_);
    }

    public ao getChargingStations(int i2) {
        return this.chargingStations_.get(i2);
    }

    public int getChargingStationsCount() {
        return this.chargingStations_.size();
    }

    public List<ao> getChargingStationsList() {
        return this.chargingStations_;
    }

    public ap getChargingStationsOrBuilder(int i2) {
        return this.chargingStations_.get(i2);
    }

    public List<? extends ap> getChargingStationsOrBuilderList() {
        return this.chargingStations_;
    }

    public ae getCostType() {
        ae aeVarA = ae.a(this.costType_);
        return aeVarA == null ? ae.COST_TYPE_UNSPECIFIED : aeVarA;
    }

    public String getDirections() {
        return this.directions_;
    }

    public com.google.v.v getDirectionsBytes() {
        return com.google.v.v.s(this.directions_);
    }

    public boolean getEditorUpdated() {
        return this.editorUpdated_;
    }

    public String getNetwork() {
        return this.network_;
    }

    public com.google.v.v getNetworkBytes() {
        return com.google.v.v.s(this.network_);
    }

    public ar getPaymentMethods(int i2) {
        ar arVarA = ar.a(this.paymentMethods_.d(i2));
        return arVarA == null ? ar.PAYMENT_METHOD_UNKNOWN : arVarA;
    }

    public int getPaymentMethodsCount() {
        return this.paymentMethods_.size();
    }

    public List<ar> getPaymentMethodsList() {
        return new com.google.v.em(this.paymentMethods_, paymentMethods_converter_);
    }

    public as getSource() {
        as asVarA = as.a(this.source_);
        return asVarA == null ? as.SOURCE_UNSPECIFIED : asVarA;
    }

    public boolean hasAccessType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasAvailabilityLastUpdateTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasChargingStationGroupId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCostType() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDirections() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEditorUpdated() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasNetwork() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 2) != 0;
    }

    public static y newBuilder(at atVar) {
        return (y) DEFAULT_INSTANCE.createBuilder(atVar);
    }

    public static at parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static at parseFrom(com.google.v.z zVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static at parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChargingPorts(aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureChargingPortsIsMutable();
        this.chargingPorts_.add(ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChargingPortsAvailability(ac acVar) {
        Objects.requireNonNull(acVar);
        ensureChargingPortsAvailabilityIsMutable();
        this.chargingPortsAvailability_.add(acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChargingStations(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ensureChargingStationsIsMutable();
        this.chargingStations_.add(aoVar);
    }

    public static at parseFrom(InputStream inputStream) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(ByteBuffer byteBuffer) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static at parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static at parseFrom(byte[] bArr) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static at parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
