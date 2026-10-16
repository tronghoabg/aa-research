package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class oi extends com.google.v.du<oi, oh> implements oj {
    private static final oi DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<oi> PARSER = null;
    public static final int ROUTINGCONTEXT_FIELD_NUMBER = 4;
    public static final int TOLOC_FIELD_NUMBER = 2;
    public static final int VENUEID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int id_;
    private or toLoc_;
    private byte memoizedIsInitialized = 2;
    private String venueId_ = "";
    private String routingContext_ = "";
    private com.google.v.eo<i.b.v.bi> entryPoint_ = emptyProtobufList();

    static {
        oi oiVar = new oi();
        DEFAULT_INSTANCE = oiVar;
        com.google.v.du.registerDefaultInstance(oi.class, oiVar);
    }

    private oi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntryPoint(Iterable<? extends i.b.v.bi> iterable) {
        ensureEntryPointIsMutable();
        com.google.v.c.addAll(iterable, this.entryPoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryPoint(int i2, i.b.v.bi biVar) {
        Objects.requireNonNull(biVar);
        ensureEntryPointIsMutable();
        this.entryPoint_.add(i2, biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPoint() {
        this.entryPoint_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.bitField0_ &= -9;
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToLoc() {
        this.toLoc_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -5;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    private void ensureEntryPointIsMutable() {
        com.google.v.eo<i.b.v.bi> eoVar = this.entryPoint_;
        if (eoVar.c()) {
            return;
        }
        this.entryPoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static oi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToLoc(or orVar) {
        Objects.requireNonNull(orVar);
        or orVar2 = this.toLoc_;
        if (orVar2 != null && orVar2 != or.getDefaultInstance()) {
            oq oqVarNewBuilder = or.newBuilder(orVar2);
            oqVarNewBuilder.mergeFrom((oq) orVar);
            orVar = oqVarNewBuilder.buildPartial();
        }
        this.toLoc_ = orVar;
        this.bitField0_ |= 2;
    }

    public static oh newBuilder() {
        return (oh) DEFAULT_INSTANCE.createBuilder();
    }

    public static oi parseDelimitedFrom(InputStream inputStream) {
        return (oi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oi parseFrom(com.google.v.v vVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntryPoint(int i2) {
        ensureEntryPointIsMutable();
        this.entryPoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPoint(int i2, i.b.v.bi biVar) {
        Objects.requireNonNull(biVar);
        ensureEntryPointIsMutable();
        this.entryPoint_.set(i2, biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.bitField0_ |= 1;
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(com.google.v.v vVar) {
        this.routingContext_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToLoc(or orVar) {
        Objects.requireNonNull(orVar);
        this.toLoc_ = orVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005Л", new Object[]{"bitField0_", "id_", "toLoc_", "venueId_", "routingContext_", "entryPoint_", i.b.v.bi.class});
            case 3:
                return new oi();
            case 4:
                return new oh(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<oi> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (oi.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public i.b.v.bi getEntryPoint(int i2) {
        return this.entryPoint_.get(i2);
    }

    public int getEntryPointCount() {
        return this.entryPoint_.size();
    }

    public List<i.b.v.bi> getEntryPointList() {
        return this.entryPoint_;
    }

    public i.b.v.bj getEntryPointOrBuilder(int i2) {
        return this.entryPoint_.get(i2);
    }

    public List<? extends i.b.v.bj> getEntryPointOrBuilderList() {
        return this.entryPoint_;
    }

    public int getId() {
        return this.id_;
    }

    public String getRoutingContext() {
        return this.routingContext_;
    }

    public com.google.v.v getRoutingContextBytes() {
        return com.google.v.v.s(this.routingContext_);
    }

    public or getToLoc() {
        or orVar = this.toLoc_;
        return orVar == null ? or.getDefaultInstance() : orVar;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoutingContext() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasToLoc() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static oh newBuilder(oi oiVar) {
        return (oh) DEFAULT_INSTANCE.createBuilder(oiVar);
    }

    public static oi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oi parseFrom(com.google.v.z zVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryPoint(i.b.v.bi biVar) {
        Objects.requireNonNull(biVar);
        ensureEntryPointIsMutable();
        this.entryPoint_.add(biVar);
    }

    public static oi parseFrom(InputStream inputStream) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oi parseFrom(ByteBuffer byteBuffer) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oi parseFrom(byte[] bArr) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
