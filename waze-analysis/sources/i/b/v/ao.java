package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ao extends com.google.v.du<ao, am> implements ap {
    public static final int ACCEPTABLE_PAYMENT_METHODS_FIELD_NUMBER = 5;
    public static final int AVAILABILITY_STATUS_FIELD_NUMBER = 6;
    public static final int AVAILABLE_FIELD_NUMBER = 4;
    public static final int CONNECTOR_FIELD_NUMBER = 3;
    private static final ao DEFAULT_INSTANCE;
    public static final int EVSE_ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ao> PARSER = null;
    public static final int UID_FIELD_NUMBER = 1;
    private static final com.google.v.el<an> acceptablePaymentMethods_converter_ = new al(0);
    private int availabilityStatus_;
    private boolean available_;
    private int bitField0_;
    private String uid_ = "";
    private String evseId_ = "";
    private com.google.v.eo<ag> connector_ = emptyProtobufList();
    private com.google.v.ek acceptablePaymentMethods_ = emptyIntList();

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        com.google.v.du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAcceptablePaymentMethods(an anVar) {
        Objects.requireNonNull(anVar);
        ensureAcceptablePaymentMethodsIsMutable();
        this.acceptablePaymentMethods_.i(anVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAcceptablePaymentMethods(Iterable<? extends an> iterable) {
        ensureAcceptablePaymentMethodsIsMutable();
        Iterator<? extends an> it = iterable.iterator();
        while (it.hasNext()) {
            this.acceptablePaymentMethods_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConnector(Iterable<? extends ag> iterable) {
        ensureConnectorIsMutable();
        com.google.v.c.addAll(iterable, this.connector_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConnector(int i2, ag agVar) {
        Objects.requireNonNull(agVar);
        ensureConnectorIsMutable();
        this.connector_.add(i2, agVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcceptablePaymentMethods() {
        this.acceptablePaymentMethods_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityStatus() {
        this.bitField0_ &= -9;
        this.availabilityStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailable() {
        this.bitField0_ &= -5;
        this.available_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnector() {
        this.connector_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvseId() {
        this.bitField0_ &= -3;
        this.evseId_ = getDefaultInstance().getEvseId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.bitField0_ &= -2;
        this.uid_ = getDefaultInstance().getUid();
    }

    private void ensureAcceptablePaymentMethodsIsMutable() {
        com.google.v.ek ekVar = this.acceptablePaymentMethods_;
        if (ekVar.c()) {
            return;
        }
        this.acceptablePaymentMethods_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureConnectorIsMutable() {
        com.google.v.eo<ag> eoVar = this.connector_;
        if (eoVar.c()) {
            return;
        }
        this.connector_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static am newBuilder() {
        return (am) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConnector(int i2) {
        ensureConnectorIsMutable();
        this.connector_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcceptablePaymentMethods(int i2, an anVar) {
        Objects.requireNonNull(anVar);
        ensureAcceptablePaymentMethodsIsMutable();
        this.acceptablePaymentMethods_.e(i2, anVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityStatus(com.waze.cd.b bVar) {
        this.availabilityStatus_ = bVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailable(boolean z) {
        this.bitField0_ |= 4;
        this.available_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnector(int i2, ag agVar) {
        Objects.requireNonNull(agVar);
        ensureConnectorIsMutable();
        this.connector_.set(i2, agVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvseId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.evseId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvseIdBytes(com.google.v.v vVar) {
        this.evseId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.uid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUidBytes(com.google.v.v vVar) {
        this.uid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ࠞ\u0006᠌\u0003", new Object[]{"bitField0_", "uid_", "evseId_", "connector_", ag.class, "available_", "acceptablePaymentMethods_", z.f49557d, "availabilityStatus_", com.waze.cd.b.a()});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new am(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public an getAcceptablePaymentMethods(int i2) {
        an anVarA = an.a(this.acceptablePaymentMethods_.d(i2));
        return anVarA == null ? an.PAYMENT_METHOD_UNKNOWN : anVarA;
    }

    @Deprecated
    public int getAcceptablePaymentMethodsCount() {
        return this.acceptablePaymentMethods_.size();
    }

    @Deprecated
    public List<an> getAcceptablePaymentMethodsList() {
        return new com.google.v.em(this.acceptablePaymentMethods_, acceptablePaymentMethods_converter_);
    }

    public com.waze.cd.b getAvailabilityStatus() {
        com.waze.cd.b bVarB = com.waze.cd.b.b(this.availabilityStatus_);
        return bVarB == null ? com.waze.cd.b.UNKNOWN : bVarB;
    }

    public boolean getAvailable() {
        return this.available_;
    }

    public ag getConnector(int i2) {
        return this.connector_.get(i2);
    }

    public int getConnectorCount() {
        return this.connector_.size();
    }

    public List<ag> getConnectorList() {
        return this.connector_;
    }

    public ah getConnectorOrBuilder(int i2) {
        return this.connector_.get(i2);
    }

    public List<? extends ah> getConnectorOrBuilderList() {
        return this.connector_;
    }

    public String getEvseId() {
        return this.evseId_;
    }

    public com.google.v.v getEvseIdBytes() {
        return com.google.v.v.s(this.evseId_);
    }

    public String getUid() {
        return this.uid_;
    }

    public com.google.v.v getUidBytes() {
        return com.google.v.v.s(this.uid_);
    }

    public boolean hasAvailabilityStatus() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAvailable() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEvseId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUid() {
        return (this.bitField0_ & 1) != 0;
    }

    public static am newBuilder(ao aoVar) {
        return (am) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConnector(ag agVar) {
        Objects.requireNonNull(agVar);
        ensureConnectorIsMutable();
        this.connector_.add(agVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
