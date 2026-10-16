package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbf extends com.google.v.du<bbf, bbd> implements com.google.v.fj {
    private static final bbf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bbf> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;

    static {
        bbf bbfVar = new bbf();
        DEFAULT_INSTANCE = bbfVar;
        com.google.v.du.registerDefaultInstance(bbf.class, bbfVar);
    }

    private bbf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static bbf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bbd newBuilder() {
        return (bbd) DEFAULT_INSTANCE.createBuilder();
    }

    public static bbf parseDelimitedFrom(InputStream inputStream) {
        return (bbf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbf parseFrom(com.google.v.v vVar) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bbf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(bbe bbeVar) {
        this.reason_ = bbeVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"reason_"});
        }
        if (iOrdinal == 3) {
            return new bbf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bbf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bbf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bbe getReason() {
        bbe bbeVar;
        switch (this.reason_) {
            case 0:
                bbeVar = bbe.REASON_UNSPECIFIED;
                break;
            case 1:
                bbeVar = bbe.APP_LAUNCH;
                break;
            case 2:
                bbeVar = bbe.DESTINATIONS_DATA_CHANGED;
                break;
            case 3:
                bbeVar = bbe.END_OF_DRIVE;
                break;
            case 4:
                bbeVar = bbe.LOCATION_CHANGED;
                break;
            case 5:
                bbeVar = bbe.SETTINGS_CHANGED;
                break;
            case 6:
                bbeVar = bbe.USER_CHANGED;
                break;
            default:
                bbeVar = null;
                break;
        }
        return bbeVar == null ? bbe.UNRECOGNIZED : bbeVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public static bbd newBuilder(bbf bbfVar) {
        return (bbd) DEFAULT_INSTANCE.createBuilder(bbfVar);
    }

    public static bbf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bbf parseFrom(com.google.v.z zVar) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bbf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bbf parseFrom(InputStream inputStream) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbf parseFrom(ByteBuffer byteBuffer) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bbf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bbf parseFrom(byte[] bArr) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bbf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bbf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
