package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqo extends com.google.v.du<aqo, aqn> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final aqo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aqo> PARSER = null;
    public static final int PIN_TYPE_FIELD_NUMBER = 2;
    private int action_;
    private int pinType_;

    static {
        aqo aqoVar = new aqo();
        DEFAULT_INSTANCE = aqoVar;
        com.google.v.du.registerDefaultInstance(aqo.class, aqoVar);
    }

    private aqo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinType() {
        this.pinType_ = 0;
    }

    public static aqo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aqn newBuilder() {
        return (aqn) DEFAULT_INSTANCE.createBuilder();
    }

    public static aqo parseDelimitedFrom(InputStream inputStream) {
        return (aqo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqo parseFrom(com.google.v.v vVar) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aqo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aqm aqmVar) {
        this.action_ = aqmVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinType(aqp aqpVar) {
        this.pinType_ = aqpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinTypeValue(int i2) {
        this.pinType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"action_", "pinType_"});
        }
        if (iOrdinal == 3) {
            return new aqo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aqo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aqo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aqm getAction() {
        aqm aqmVar;
        switch (this.action_) {
            case 0:
                aqmVar = aqm.ACTION_UNSPECIFIED;
                break;
            case 1:
                aqmVar = aqm.CLOSE;
                break;
            case 2:
                aqmVar = aqm.PRIMARY;
                break;
            case 3:
                aqmVar = aqm.SECONDARY;
                break;
            case 4:
                aqmVar = aqm.INFO;
                break;
            case 5:
                aqmVar = aqm.NEXT;
                break;
            case 6:
                aqmVar = aqm.PHOTO;
                break;
            case 7:
                aqmVar = aqm.MORE;
                break;
            default:
                aqmVar = null;
                break;
        }
        return aqmVar == null ? aqm.UNRECOGNIZED : aqmVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public aqp getPinType() {
        aqp aqpVarA = aqp.a(this.pinType_);
        return aqpVarA == null ? aqp.UNRECOGNIZED : aqpVarA;
    }

    public int getPinTypeValue() {
        return this.pinType_;
    }

    public static aqn newBuilder(aqo aqoVar) {
        return (aqn) DEFAULT_INSTANCE.createBuilder(aqoVar);
    }

    public static aqo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aqo parseFrom(com.google.v.z zVar) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aqo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aqo parseFrom(InputStream inputStream) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqo parseFrom(ByteBuffer byteBuffer) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aqo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aqo parseFrom(byte[] bArr) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aqo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aqo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
