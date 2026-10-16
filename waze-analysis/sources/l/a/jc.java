package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jc extends com.google.v.du<jc, ja> implements com.google.v.fj {
    private static final jc DEFAULT_INSTANCE;
    public static final int FOREGROUND_MODE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jc> PARSER;
    private int foregroundMode_;

    static {
        jc jcVar = new jc();
        DEFAULT_INSTANCE = jcVar;
        com.google.v.du.registerDefaultInstance(jc.class, jcVar);
    }

    private jc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForegroundMode() {
        this.foregroundMode_ = 0;
    }

    public static jc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ja newBuilder() {
        return (ja) DEFAULT_INSTANCE.createBuilder();
    }

    public static jc parseDelimitedFrom(InputStream inputStream) {
        return (jc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jc parseFrom(com.google.v.v vVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForegroundMode(jb jbVar) {
        this.foregroundMode_ = jbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForegroundModeValue(int i2) {
        this.foregroundMode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"foregroundMode_"});
        }
        if (iOrdinal == 3) {
            return new jc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ja(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public jb getForegroundMode() {
        int i2 = this.foregroundMode_;
        jb jbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : jb.CARPLAY_NEW_MODE_FULL_SCREEN : jb.CARPLAY_NEW_MODE_DASHBOARD : jb.CARPLAY_NEW_MODE_UNSPECIFIED;
        return jbVar == null ? jb.UNRECOGNIZED : jbVar;
    }

    public int getForegroundModeValue() {
        return this.foregroundMode_;
    }

    public static ja newBuilder(jc jcVar) {
        return (ja) DEFAULT_INSTANCE.createBuilder(jcVar);
    }

    public static jc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jc parseFrom(com.google.v.z zVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jc parseFrom(InputStream inputStream) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jc parseFrom(ByteBuffer byteBuffer) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jc parseFrom(byte[] bArr) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
