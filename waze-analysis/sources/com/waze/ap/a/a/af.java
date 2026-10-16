package com.waze.ap.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af extends du<af, ae> implements fj {
    private static final af DEFAULT_INSTANCE;
    public static final int INSIGHT_ID_FIELD_NUMBER = 1;
    public static final int INSIGHT_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<af> PARSER;
    private String insightId_ = "";
    private int insightType_;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightId() {
        this.insightId_ = getDefaultInstance().getInsightId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightType() {
        this.insightType_ = 0;
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightId(String str) {
        Objects.requireNonNull(str);
        this.insightId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.insightId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightType(aj ajVar) {
        this.insightType_ = ajVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightTypeValue(int i2) {
        this.insightType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"insightId_", "insightType_"});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<af> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (af.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getInsightId() {
        return this.insightId_;
    }

    public com.google.v.v getInsightIdBytes() {
        return com.google.v.v.s(this.insightId_);
    }

    public aj getInsightType() {
        int i2 = this.insightType_;
        aj ajVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aj.QUESTIONABLE_INSIGHT_TYPE_HAZARD_SHOULDER_VEHICLE_STOPPED : aj.QUESTIONABLE_INSIGHT_TYPE_HAZARD_CONSTRUCTION : aj.QUESTIONABLE_INSIGHT_TYPE_HAZARD_DEFAULT : aj.QUESTIONABLE_INSIGHT_TYPE_UNSPECIFIED;
        return ajVar == null ? aj.UNRECOGNIZED : ajVar;
    }

    public int getInsightTypeValue() {
        return this.insightType_;
    }

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
