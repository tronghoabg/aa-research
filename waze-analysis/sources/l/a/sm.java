package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sm extends com.google.v.du<sm, sk> implements com.google.v.fj {
    private static final sm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<sm> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        sm smVar = new sm();
        DEFAULT_INSTANCE = smVar;
        com.google.v.du.registerDefaultInstance(sm.class, smVar);
    }

    private sm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static sm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sk newBuilder() {
        return (sk) DEFAULT_INSTANCE.createBuilder();
    }

    public static sm parseDelimitedFrom(InputStream inputStream) {
        return (sm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sm parseFrom(com.google.v.v vVar) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(sl slVar) {
        this.status_ = slVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i2) {
        this.status_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new sm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sl getStatus() {
        sl slVar;
        switch (this.status_) {
            case 0:
                slVar = sl.STATUS_UNSPECIFIED;
                break;
            case 1:
                slVar = sl.NETWORK_ERROR;
                break;
            case 2:
                slVar = sl.NO_MATCH_ERROR;
                break;
            case 3:
                slVar = sl.NO_PERMISSIONS;
                break;
            case 4:
                slVar = sl.SPEECH_TIMEOUT_ERROR;
                break;
            case 5:
                slVar = sl.UNSPECIFIED_ERROR;
                break;
            case 6:
                slVar = sl.SUCCESS;
                break;
            default:
                slVar = null;
                break;
        }
        return slVar == null ? sl.UNRECOGNIZED : slVar;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public static sk newBuilder(sm smVar) {
        return (sk) DEFAULT_INSTANCE.createBuilder(smVar);
    }

    public static sm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sm parseFrom(com.google.v.z zVar) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sm parseFrom(InputStream inputStream) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sm parseFrom(ByteBuffer byteBuffer) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sm parseFrom(byte[] bArr) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
