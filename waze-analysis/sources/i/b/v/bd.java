package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bd extends com.google.v.du<bd, au> implements com.google.v.fj {
    public static final int ACCESS_TYPE_FIELD_NUMBER = 5;
    private static final bd DEFAULT_INSTANCE;
    public static final int DIRECTIONS_FIELD_NUMBER = 2;
    public static final int EV_CONNECTOR_OVERVIEWS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bd> PARSER = null;
    public static final int PAYMENT_METHODS_DEPRECATED_FIELD_NUMBER = 3;
    public static final int PAYMENT_METHODS_FIELD_NUMBER = 4;
    private static final com.google.v.el<an> paymentMethodsDeprecated_converter_ = new al(2);
    private int accessType_;
    private int bitField0_;
    private com.google.v.eo<ay> evConnectorOverviews_ = emptyProtobufList();
    private String directions_ = "";
    private com.google.v.ek paymentMethodsDeprecated_ = emptyIntList();
    private com.google.v.eo<bb> paymentMethods_ = emptyProtobufList();

    static {
        bd bdVar = new bd();
        DEFAULT_INSTANCE = bdVar;
        com.google.v.du.registerDefaultInstance(bd.class, bdVar);
    }

    private bd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvConnectorOverviews(Iterable<? extends ay> iterable) {
        ensureEvConnectorOverviewsIsMutable();
        com.google.v.c.addAll(iterable, this.evConnectorOverviews_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaymentMethods(Iterable<? extends bb> iterable) {
        ensurePaymentMethodsIsMutable();
        com.google.v.c.addAll(iterable, this.paymentMethods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaymentMethodsDeprecated(Iterable<? extends an> iterable) {
        ensurePaymentMethodsDeprecatedIsMutable();
        Iterator<? extends an> it = iterable.iterator();
        while (it.hasNext()) {
            this.paymentMethodsDeprecated_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorOverviews(int i2, ay ayVar) {
        Objects.requireNonNull(ayVar);
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.add(i2, ayVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaymentMethods(int i2, bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.add(i2, bbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaymentMethodsDeprecated(an anVar) {
        Objects.requireNonNull(anVar);
        ensurePaymentMethodsDeprecatedIsMutable();
        this.paymentMethodsDeprecated_.i(anVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessType() {
        this.bitField0_ &= -3;
        this.accessType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirections() {
        this.bitField0_ &= -2;
        this.directions_ = getDefaultInstance().getDirections();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnectorOverviews() {
        this.evConnectorOverviews_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaymentMethods() {
        this.paymentMethods_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaymentMethodsDeprecated() {
        this.paymentMethodsDeprecated_ = emptyIntList();
    }

    private void ensureEvConnectorOverviewsIsMutable() {
        com.google.v.eo<ay> eoVar = this.evConnectorOverviews_;
        if (eoVar.c()) {
            return;
        }
        this.evConnectorOverviews_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePaymentMethodsDeprecatedIsMutable() {
        com.google.v.ek ekVar = this.paymentMethodsDeprecated_;
        if (ekVar.c()) {
            return;
        }
        this.paymentMethodsDeprecated_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensurePaymentMethodsIsMutable() {
        com.google.v.eo<bb> eoVar = this.paymentMethods_;
        if (eoVar.c()) {
            return;
        }
        this.paymentMethods_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static bd parseDelimitedFrom(InputStream inputStream) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(com.google.v.v vVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvConnectorOverviews(int i2) {
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePaymentMethods(int i2) {
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessType(aa aaVar) {
        this.accessType_ = aaVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirections(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.directions_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionsBytes(com.google.v.v vVar) {
        this.directions_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnectorOverviews(int i2, ay ayVar) {
        Objects.requireNonNull(ayVar);
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.set(i2, ayVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaymentMethods(int i2, bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.set(i2, bbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaymentMethodsDeprecated(int i2, an anVar) {
        Objects.requireNonNull(anVar);
        ensurePaymentMethodsDeprecatedIsMutable();
        this.paymentMethodsDeprecated_.e(i2, anVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002ဈ\u0000\u0003ࠞ\u0004\u001b\u0005᠌\u0001", new Object[]{"bitField0_", "evConnectorOverviews_", ay.class, "directions_", "paymentMethodsDeprecated_", z.f49557d, "paymentMethods_", bb.class, "accessType_", z.f49554a});
        }
        if (iOrdinal == 3) {
            return new bd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bd.class) {
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

    public String getDirections() {
        return this.directions_;
    }

    public com.google.v.v getDirectionsBytes() {
        return com.google.v.v.s(this.directions_);
    }

    public ay getEvConnectorOverviews(int i2) {
        return this.evConnectorOverviews_.get(i2);
    }

    public int getEvConnectorOverviewsCount() {
        return this.evConnectorOverviews_.size();
    }

    public List<ay> getEvConnectorOverviewsList() {
        return this.evConnectorOverviews_;
    }

    public az getEvConnectorOverviewsOrBuilder(int i2) {
        return this.evConnectorOverviews_.get(i2);
    }

    public List<? extends az> getEvConnectorOverviewsOrBuilderList() {
        return this.evConnectorOverviews_;
    }

    public bb getPaymentMethods(int i2) {
        return this.paymentMethods_.get(i2);
    }

    public int getPaymentMethodsCount() {
        return this.paymentMethods_.size();
    }

    @Deprecated
    public an getPaymentMethodsDeprecated(int i2) {
        an anVarA = an.a(this.paymentMethodsDeprecated_.d(i2));
        return anVarA == null ? an.PAYMENT_METHOD_UNKNOWN : anVarA;
    }

    @Deprecated
    public int getPaymentMethodsDeprecatedCount() {
        return this.paymentMethodsDeprecated_.size();
    }

    @Deprecated
    public List<an> getPaymentMethodsDeprecatedList() {
        return new com.google.v.em(this.paymentMethodsDeprecated_, paymentMethodsDeprecated_converter_);
    }

    public List<bb> getPaymentMethodsList() {
        return this.paymentMethods_;
    }

    public bc getPaymentMethodsOrBuilder(int i2) {
        return this.paymentMethods_.get(i2);
    }

    public List<? extends bc> getPaymentMethodsOrBuilderList() {
        return this.paymentMethods_;
    }

    public boolean hasAccessType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDirections() {
        return (this.bitField0_ & 1) != 0;
    }

    public static au newBuilder(bd bdVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(bdVar);
    }

    public static bd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bd parseFrom(com.google.v.z zVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorOverviews(ay ayVar) {
        Objects.requireNonNull(ayVar);
        ensureEvConnectorOverviewsIsMutable();
        this.evConnectorOverviews_.add(ayVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaymentMethods(bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePaymentMethodsIsMutable();
        this.paymentMethods_.add(bbVar);
    }

    public static bd parseFrom(InputStream inputStream) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(ByteBuffer byteBuffer) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bd parseFrom(byte[] bArr) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
