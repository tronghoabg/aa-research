package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class i extends com.google.v.du<i, d> implements j {
    private static final i DEFAULT_INSTANCE;
    public static final int EXTERNAL_PROVIDER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<i> PARSER = null;
    public static final int RATES_FIELD_NUMBER = 4;
    public static final int RESERVATION_URI_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 5;
    private int bitField0_;
    private bo externalProvider_;
    private int type_;
    private com.waze.ca.e updateTime_;
    private String reservationUri_ = "";
    private com.google.v.eo<f> rates_ = emptyProtobufList();

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        com.google.v.du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRates(Iterable<? extends f> iterable) {
        ensureRatesIsMutable();
        com.google.v.c.addAll(iterable, this.rates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRates(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureRatesIsMutable();
        this.rates_.add(i2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalProvider() {
        this.externalProvider_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRates() {
        this.rates_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservationUri() {
        this.bitField0_ &= -5;
        this.reservationUri_ = getDefaultInstance().getReservationUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.updateTime_ = null;
        this.bitField0_ &= -9;
    }

    private void ensureRatesIsMutable() {
        com.google.v.eo<f> eoVar = this.rates_;
        if (eoVar.c()) {
            return;
        }
        this.rates_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExternalProvider(bo boVar) {
        Objects.requireNonNull(boVar);
        bo boVar2 = this.externalProvider_;
        if (boVar2 != null && boVar2 != bo.getDefaultInstance()) {
            bm bmVarNewBuilder = bo.newBuilder(boVar2);
            bmVarNewBuilder.mergeFrom((bm) boVar);
            boVar = bmVarNewBuilder.buildPartial();
        }
        this.externalProvider_ = boVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateTime(com.waze.ca.e eVar) {
        Objects.requireNonNull(eVar);
        com.waze.ca.e eVar2 = this.updateTime_;
        if (eVar2 != null && eVar2 != com.waze.ca.e.getDefaultInstance()) {
            com.waze.ca.d dVarNewBuilder = com.waze.ca.e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((com.waze.ca.d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.updateTime_ = eVar;
        this.bitField0_ |= 8;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(com.google.v.v vVar) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRates(int i2) {
        ensureRatesIsMutable();
        this.rates_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalProvider(bo boVar) {
        Objects.requireNonNull(boVar);
        this.externalProvider_ = boVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRates(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureRatesIsMutable();
        this.rates_.set(i2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservationUri(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.reservationUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservationUriBytes(com.google.v.v vVar) {
        this.reservationUri_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(h hVar) {
        this.type_ = hVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(com.waze.ca.e eVar) {
        Objects.requireNonNull(eVar);
        this.updateTime_ = eVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"bitField0_", "externalProvider_", "type_", z.f49555b, "reservationUri_", "rates_", f.class, "updateTime_"});
        }
        if (iOrdinal == 3) {
            return new i();
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
        com.google.v.fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bo getExternalProvider() {
        bo boVar = this.externalProvider_;
        return boVar == null ? bo.getDefaultInstance() : boVar;
    }

    public f getRates(int i2) {
        return this.rates_.get(i2);
    }

    public int getRatesCount() {
        return this.rates_.size();
    }

    public List<f> getRatesList() {
        return this.rates_;
    }

    public g getRatesOrBuilder(int i2) {
        return this.rates_.get(i2);
    }

    public List<? extends g> getRatesOrBuilderList() {
        return this.rates_;
    }

    public String getReservationUri() {
        return this.reservationUri_;
    }

    public com.google.v.v getReservationUriBytes() {
        return com.google.v.v.s(this.reservationUri_);
    }

    public h getType() {
        h hVarA = h.a(this.type_);
        return hVarA == null ? h.TYPE_UNSPECIFIED : hVarA;
    }

    public com.waze.ca.e getUpdateTime() {
        com.waze.ca.e eVar = this.updateTime_;
        return eVar == null ? com.waze.ca.e.getDefaultInstance() : eVar;
    }

    public boolean hasExternalProvider() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReservationUri() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUpdateTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public static d newBuilder(i iVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(com.google.v.z zVar) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRates(f fVar) {
        Objects.requireNonNull(fVar);
        ensureRatesIsMutable();
        this.rates_.add(fVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (i) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
