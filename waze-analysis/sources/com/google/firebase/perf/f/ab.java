package com.google.firebase.perf.f;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.ff;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab extends du<ab, x> implements fj {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final ab DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile fo<ab> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private ff<String, String> customAttributes_ = ff.a();
    private String url_ = "";
    private String responseContentType_ = "";
    private eo<ah> perfSessions_ = emptyProtobufList();

    static {
        ab abVar = new ab();
        DEFAULT_INSTANCE = abVar;
        du.registerDefaultInstance(ab.class, abVar);
    }

    private ab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends ah> iterable) {
        ensurePerfSessionsIsMutable();
        com.google.v.c.addAll(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i2, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        eo<ah> eoVar = this.perfSessions_;
        if (eoVar.c()) {
            return;
        }
        this.perfSessions_ = du.mutableCopy(eoVar);
    }

    public static ab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private ff<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private ff<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.e()) {
            this.customAttributes_ = this.customAttributes_.b();
        }
        return this.customAttributes_;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static ab parseDelimitedFrom(InputStream inputStream) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(com.google.v.v vVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i2) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j2) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpMethod(z zVar) {
        this.httpMethod_ = zVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpResponseCode(int i2) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkClientErrorReason(aa aaVar) {
        this.networkClientErrorReason_ = aaVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i2, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestPayloadBytes(long j2) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentTypeBytes(com.google.v.v vVar) {
        this.responseContentType_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponsePayloadBytes(long j2) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j2) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j2) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j2) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        this.url_ = vVar.u();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        Objects.requireNonNull(str);
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", m.f10456c, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", m.f10457d, "customAttributes_", y.f10470a, "perfSessions_", ah.class});
        }
        if (iOrdinal == 3) {
            return new ab();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ab> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ab.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return DesugarCollections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        Objects.requireNonNull(str);
        String str3 = internalGetCustomAttributes().get(str);
        return str3 != null ? str3 : str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        Objects.requireNonNull(str);
        String str2 = internalGetCustomAttributes().get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException();
    }

    public z getHttpMethod() {
        z zVarA = z.a(this.httpMethod_);
        return zVarA == null ? z.HTTP_METHOD_UNKNOWN : zVarA;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    public aa getNetworkClientErrorReason() {
        aa aaVarA = aa.a(this.networkClientErrorReason_);
        return aaVarA == null ? aa.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : aaVarA;
    }

    public ah getPerfSessions(int i2) {
        return this.perfSessions_.get(i2);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<ah> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public ai getPerfSessionsOrBuilder(int i2) {
        return this.perfSessions_.get(i2);
    }

    public List<? extends ai> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    public String getResponseContentType() {
        return this.responseContentType_;
    }

    public com.google.v.v getResponseContentTypeBytes() {
        return com.google.v.v.s(this.responseContentType_);
    }

    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasHttpMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHttpResponseCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNetworkClientErrorReason() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestPayloadBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasResponseContentType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResponsePayloadBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeToRequestCompletedUs() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimeToResponseCompletedUs() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTimeToResponseInitiatedUs() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static x newBuilder(ab abVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(abVar);
    }

    public static ab parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(com.google.v.v vVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ab parseFrom(com.google.v.z zVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ab parseFrom(com.google.v.z zVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(ahVar);
    }

    public static ab parseFrom(InputStream inputStream) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(InputStream inputStream, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(ByteBuffer byteBuffer) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ab parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ab parseFrom(byte[] bArr) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ab parseFrom(byte[] bArr, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
