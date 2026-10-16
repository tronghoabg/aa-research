package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ags extends com.google.v.du<ags, agr> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final ags DEFAULT_INSTANCE;
    public static final int DONT_SHOW_AGAIN_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ags> PARSER = null;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private boolean dontShowAgain_;
    private int requestType_;

    static {
        ags agsVar = new ags();
        DEFAULT_INSTANCE = agsVar;
        com.google.v.du.registerDefaultInstance(ags.class, agsVar);
    }

    private ags() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDontShowAgain() {
        this.bitField0_ &= -2;
        this.dontShowAgain_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestType() {
        this.requestType_ = 0;
    }

    public static ags getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static agr newBuilder() {
        return (agr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ags parseDelimitedFrom(InputStream inputStream) {
        return (ags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ags parseFrom(com.google.v.v vVar) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ags> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(agq agqVar) {
        this.action_ = agqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDontShowAgain(boolean z) {
        this.bitField0_ |= 1;
        this.dontShowAgain_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestType(agv agvVar) {
        this.requestType_ = agvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeValue(int i2) {
        this.requestType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000", new Object[]{"bitField0_", "requestType_", "action_", "dontShowAgain_"});
        }
        if (iOrdinal == 3) {
            return new ags();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new agr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ags> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ags.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public agq getAction() {
        int i2 = this.action_;
        agq agqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : agq.TAP_OUTSIDE : agq.ALLOW : agq.CLOSE : agq.OS_SETTINGS : agq.ACTION_UNSPECIFIED;
        return agqVar == null ? agq.UNRECOGNIZED : agqVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getDontShowAgain() {
        return this.dontShowAgain_;
    }

    public agv getRequestType() {
        agv agvVarA = agv.a(this.requestType_);
        return agvVarA == null ? agv.UNRECOGNIZED : agvVarA;
    }

    public int getRequestTypeValue() {
        return this.requestType_;
    }

    public boolean hasDontShowAgain() {
        return (this.bitField0_ & 1) != 0;
    }

    public static agr newBuilder(ags agsVar) {
        return (agr) DEFAULT_INSTANCE.createBuilder(agsVar);
    }

    public static ags parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ags) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ags parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ags parseFrom(com.google.v.z zVar) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ags parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ags parseFrom(InputStream inputStream) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ags parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ags parseFrom(ByteBuffer byteBuffer) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ags parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ags parseFrom(byte[] bArr) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ags parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ags) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
