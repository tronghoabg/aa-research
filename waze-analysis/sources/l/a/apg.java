package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apg extends com.google.v.du<apg, apf> implements com.google.v.fj {
    private static final apg DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<apg> PARSER;
    private int bitField0_;
    private long errorCode_;

    static {
        apg apgVar = new apg();
        DEFAULT_INSTANCE = apgVar;
        com.google.v.du.registerDefaultInstance(apg.class, apgVar);
    }

    private apg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -2;
        this.errorCode_ = 0L;
    }

    public static apg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static apf newBuilder() {
        return (apf) DEFAULT_INSTANCE.createBuilder();
    }

    public static apg parseDelimitedFrom(InputStream inputStream) {
        return (apg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apg parseFrom(com.google.v.v vVar) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 1;
        this.errorCode_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "errorCode_"});
        }
        if (iOrdinal == 3) {
            return new apg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new apf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static apf newBuilder(apg apgVar) {
        return (apf) DEFAULT_INSTANCE.createBuilder(apgVar);
    }

    public static apg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apg parseFrom(com.google.v.z zVar) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apg parseFrom(InputStream inputStream) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apg parseFrom(ByteBuffer byteBuffer) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apg parseFrom(byte[] bArr) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
