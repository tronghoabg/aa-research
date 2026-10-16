package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nk extends com.google.v.du<nk, na> implements nl {
    private static final nk DEFAULT_INSTANCE;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int FUTURE_ROUTE_RESPONSES_FIELD_NUMBER = 3;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<nk> PARSER = null;
    public static final int REALTIME_ROUTE_RESPONSE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 4;
    private int bitField0_;
    private nh realtimeRouteResponse_;
    private int status_;
    private String identifier_ = "";
    private com.google.v.eo<ne> futureRouteResponses_ = emptyProtobufList();
    private String errorDescription_ = "";

    static {
        nk nkVar = new nk();
        DEFAULT_INSTANCE = nkVar;
        com.google.v.du.registerDefaultInstance(nk.class, nkVar);
    }

    private nk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFutureRouteResponses(Iterable<? extends ne> iterable) {
        ensureFutureRouteResponsesIsMutable();
        com.google.v.c.addAll(iterable, this.futureRouteResponses_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFutureRouteResponses(int i2, ne neVar) {
        Objects.requireNonNull(neVar);
        ensureFutureRouteResponsesIsMutable();
        this.futureRouteResponses_.add(i2, neVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorDescription() {
        this.bitField0_ &= -9;
        this.errorDescription_ = getDefaultInstance().getErrorDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFutureRouteResponses() {
        this.futureRouteResponses_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifier() {
        this.bitField0_ &= -2;
        this.identifier_ = getDefaultInstance().getIdentifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealtimeRouteResponse() {
        this.realtimeRouteResponse_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -5;
        this.status_ = 0;
    }

    private void ensureFutureRouteResponsesIsMutable() {
        com.google.v.eo<ne> eoVar = this.futureRouteResponses_;
        if (eoVar.c()) {
            return;
        }
        this.futureRouteResponses_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static nk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRealtimeRouteResponse(nh nhVar) {
        Objects.requireNonNull(nhVar);
        nh nhVar2 = this.realtimeRouteResponse_;
        if (nhVar2 != null && nhVar2 != nh.getDefaultInstance()) {
            ng ngVarNewBuilder = nh.newBuilder(nhVar2);
            ngVarNewBuilder.mergeFrom((ng) nhVar);
            nhVar = ngVarNewBuilder.buildPartial();
        }
        this.realtimeRouteResponse_ = nhVar;
        this.bitField0_ |= 2;
    }

    public static na newBuilder() {
        return (na) DEFAULT_INSTANCE.createBuilder();
    }

    public static nk parseDelimitedFrom(InputStream inputStream) {
        return (nk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nk parseFrom(com.google.v.v vVar) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFutureRouteResponses(int i2) {
        ensureFutureRouteResponsesIsMutable();
        this.futureRouteResponses_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.errorDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorDescriptionBytes(com.google.v.v vVar) {
        this.errorDescription_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFutureRouteResponses(int i2, ne neVar) {
        Objects.requireNonNull(neVar);
        ensureFutureRouteResponsesIsMutable();
        this.futureRouteResponses_.set(i2, neVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifier(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.identifier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierBytes(com.google.v.v vVar) {
        this.identifier_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealtimeRouteResponse(nh nhVar) {
        Objects.requireNonNull(nhVar);
        this.realtimeRouteResponse_ = nhVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ni niVar) {
        this.status_ = niVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "identifier_", "realtimeRouteResponse_", "futureRouteResponses_", ne.class, "status_", hf.s, "errorDescription_"});
        }
        if (iOrdinal == 3) {
            return new nk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new na(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getErrorDescription() {
        return this.errorDescription_;
    }

    public com.google.v.v getErrorDescriptionBytes() {
        return com.google.v.v.s(this.errorDescription_);
    }

    public ne getFutureRouteResponses(int i2) {
        return this.futureRouteResponses_.get(i2);
    }

    public int getFutureRouteResponsesCount() {
        return this.futureRouteResponses_.size();
    }

    public List<ne> getFutureRouteResponsesList() {
        return this.futureRouteResponses_;
    }

    public nf getFutureRouteResponsesOrBuilder(int i2) {
        return this.futureRouteResponses_.get(i2);
    }

    public List<? extends nf> getFutureRouteResponsesOrBuilderList() {
        return this.futureRouteResponses_;
    }

    public String getIdentifier() {
        return this.identifier_;
    }

    public com.google.v.v getIdentifierBytes() {
        return com.google.v.v.s(this.identifier_);
    }

    public nh getRealtimeRouteResponse() {
        nh nhVar = this.realtimeRouteResponse_;
        return nhVar == null ? nh.getDefaultInstance() : nhVar;
    }

    public ni getStatus() {
        ni niVarA = ni.a(this.status_);
        return niVarA == null ? ni.STATUS_UNSPECIFIED : niVarA;
    }

    public boolean hasErrorDescription() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRealtimeRouteResponse() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public static na newBuilder(nk nkVar) {
        return (na) DEFAULT_INSTANCE.createBuilder(nkVar);
    }

    public static nk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nk parseFrom(com.google.v.z zVar) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFutureRouteResponses(ne neVar) {
        Objects.requireNonNull(neVar);
        ensureFutureRouteResponsesIsMutable();
        this.futureRouteResponses_.add(neVar);
    }

    public static nk parseFrom(InputStream inputStream) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nk parseFrom(ByteBuffer byteBuffer) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nk parseFrom(byte[] bArr) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
