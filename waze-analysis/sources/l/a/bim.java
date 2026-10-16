package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bim extends com.google.v.du<bim, bil> implements bin {
    public static final int ALERT_TYPE_FIELD_NUMBER = 3;
    private static final bim DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bim> PARSER = null;
    public static final int TIMELINE_RELATIVE_POSITION_FIELD_NUMBER = 2;
    private int alertType_;
    private int bitField0_;
    private float timelineRelativePosition_;

    static {
        bim bimVar = new bim();
        DEFAULT_INSTANCE = bimVar;
        com.google.v.du.registerDefaultInstance(bim.class, bimVar);
    }

    private bim() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.alertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelineRelativePosition() {
        this.bitField0_ &= -2;
        this.timelineRelativePosition_ = 0.0f;
    }

    public static bim getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bil newBuilder() {
        return (bil) DEFAULT_INSTANCE.createBuilder();
    }

    public static bim parseDelimitedFrom(InputStream inputStream) {
        return (bim) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bim parseFrom(com.google.v.v vVar) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bim> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(de deVar) {
        this.alertType_ = deVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertTypeValue(int i2) {
        this.alertType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelineRelativePosition(float f2) {
        this.bitField0_ |= 1;
        this.timelineRelativePosition_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ခ\u0000\u0003\f", new Object[]{"bitField0_", "timelineRelativePosition_", "alertType_"});
        }
        if (iOrdinal == 3) {
            return new bim();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bil(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bim> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bim.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public de getAlertType() {
        de deVarA = de.a(this.alertType_);
        return deVarA == null ? de.UNRECOGNIZED : deVarA;
    }

    public int getAlertTypeValue() {
        return this.alertType_;
    }

    public float getTimelineRelativePosition() {
        return this.timelineRelativePosition_;
    }

    public boolean hasTimelineRelativePosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bil newBuilder(bim bimVar) {
        return (bil) DEFAULT_INSTANCE.createBuilder(bimVar);
    }

    public static bim parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bim) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bim parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bim parseFrom(com.google.v.z zVar) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bim parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bim parseFrom(InputStream inputStream) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bim parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bim parseFrom(ByteBuffer byteBuffer) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bim parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bim parseFrom(byte[] bArr) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bim parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bim) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
