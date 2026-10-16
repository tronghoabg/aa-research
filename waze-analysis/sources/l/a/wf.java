package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wf extends com.google.v.du<wf, wd> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final wf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<wf> PARSER = null;
    public static final int RESPONSE_STATUS_FIELD_NUMBER = 2;
    private String alternativeRouteUuid_ = "";
    private int responseStatus_;

    static {
        wf wfVar = new wf();
        DEFAULT_INSTANCE = wfVar;
        com.google.v.du.registerDefaultInstance(wf.class, wfVar);
    }

    private wf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseStatus() {
        this.responseStatus_ = 0;
    }

    public static wf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wd newBuilder() {
        return (wd) DEFAULT_INSTANCE.createBuilder();
    }

    public static wf parseDelimitedFrom(InputStream inputStream) {
        return (wf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wf parseFrom(com.google.v.v vVar) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStatus(we weVar) {
        this.responseStatus_ = weVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStatusValue(int i2) {
        this.responseStatus_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"alternativeRouteUuid_", "responseStatus_"});
        }
        if (iOrdinal == 3) {
            return new wf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new wd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public we getResponseStatus() {
        int i2 = this.responseStatus_;
        we weVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : we.NO_DATA : we.PARSING_ERROR : we.SERVER_ERROR : we.SUCCESS : we.RESPONSE_STATUS_UNSPECIFIED;
        return weVar == null ? we.UNRECOGNIZED : weVar;
    }

    public int getResponseStatusValue() {
        return this.responseStatus_;
    }

    public static wd newBuilder(wf wfVar) {
        return (wd) DEFAULT_INSTANCE.createBuilder(wfVar);
    }

    public static wf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wf parseFrom(com.google.v.z zVar) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wf parseFrom(InputStream inputStream) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wf parseFrom(ByteBuffer byteBuffer) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wf parseFrom(byte[] bArr) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
