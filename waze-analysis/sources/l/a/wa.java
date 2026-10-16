package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wa extends com.google.v.du<wa, vw> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final wa DEFAULT_INSTANCE;
    public static final int EXPLAINABILITY_FAILURE_REASON_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<wa> PARSER = null;
    public static final int UI_DISMISS_METHOD_FIELD_NUMBER = 4;
    public static final int VOICE_PLAYED_STATUS_FIELD_NUMBER = 3;
    private String alternativeRouteUuid_ = "";
    private int explainabilityFailureReason_;
    private int uiDismissMethod_;
    private int voicePlayedStatus_;

    static {
        wa waVar = new wa();
        DEFAULT_INSTANCE = waVar;
        com.google.v.du.registerDefaultInstance(wa.class, waVar);
    }

    private wa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplainabilityFailureReason() {
        this.explainabilityFailureReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUiDismissMethod() {
        this.uiDismissMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicePlayedStatus() {
        this.voicePlayedStatus_ = 0;
    }

    public static wa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static vw newBuilder() {
        return (vw) DEFAULT_INSTANCE.createBuilder();
    }

    public static wa parseDelimitedFrom(InputStream inputStream) {
        return (wa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wa parseFrom(com.google.v.v vVar) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wa> parser() {
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
    public void setExplainabilityFailureReason(vx vxVar) {
        this.explainabilityFailureReason_ = vxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplainabilityFailureReasonValue(int i2) {
        this.explainabilityFailureReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiDismissMethod(vy vyVar) {
        this.uiDismissMethod_ = vyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiDismissMethodValue(int i2) {
        this.uiDismissMethod_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePlayedStatus(vz vzVar) {
        this.voicePlayedStatus_ = vzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePlayedStatusValue(int i2) {
        this.voicePlayedStatus_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\f", new Object[]{"alternativeRouteUuid_", "explainabilityFailureReason_", "voicePlayedStatus_", "uiDismissMethod_"});
        }
        if (iOrdinal == 3) {
            return new wa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wa.class) {
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

    public vx getExplainabilityFailureReason() {
        int i2 = this.explainabilityFailureReason_;
        vx vxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : vx.BACKEND_ERROR : vx.CLIENT_ERROR : vx.BACKEND_TIMEOUT : vx.CLIENT_TIMEOUT : vx.EXPLAINABILITY_FAILURE_REASON_UNSPECIFIED;
        return vxVar == null ? vx.UNRECOGNIZED : vxVar;
    }

    public int getExplainabilityFailureReasonValue() {
        return this.explainabilityFailureReason_;
    }

    public vy getUiDismissMethod() {
        int i2 = this.uiDismissMethod_;
        vy vyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : vy.USER : vy.TIMER : vy.UI_DISMISS_METHOD_UNSPECIFIED;
        return vyVar == null ? vy.UNRECOGNIZED : vyVar;
    }

    public int getUiDismissMethodValue() {
        return this.uiDismissMethod_;
    }

    public vz getVoicePlayedStatus() {
        int i2 = this.voicePlayedStatus_;
        vz vzVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : vz.EMPTY_MESSAGE : vz.SUCCESS : vz.VOICE_PLAYED_STATUS_UNSPECIFIED;
        return vzVar == null ? vz.UNRECOGNIZED : vzVar;
    }

    public int getVoicePlayedStatusValue() {
        return this.voicePlayedStatus_;
    }

    public static vw newBuilder(wa waVar) {
        return (vw) DEFAULT_INSTANCE.createBuilder(waVar);
    }

    public static wa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wa parseFrom(com.google.v.z zVar) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wa parseFrom(InputStream inputStream) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wa parseFrom(ByteBuffer byteBuffer) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wa parseFrom(byte[] bArr) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
