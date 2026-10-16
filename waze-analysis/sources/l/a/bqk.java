package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqk extends com.google.v.du<bqk, bqi> implements com.google.v.fj {
    public static final int CHANGED_TO_TYPE_FIELD_NUMBER = 1;
    private static final bqk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bqk> PARSER;
    private int changedToType_;

    static {
        bqk bqkVar = new bqk();
        DEFAULT_INSTANCE = bqkVar;
        com.google.v.du.registerDefaultInstance(bqk.class, bqkVar);
    }

    private bqk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedToType() {
        this.changedToType_ = 0;
    }

    public static bqk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqi newBuilder() {
        return (bqi) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqk parseDelimitedFrom(InputStream inputStream) {
        return (bqk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqk parseFrom(com.google.v.v vVar) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToType(bqj bqjVar) {
        this.changedToType_ = bqjVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedToTypeValue(int i2) {
        this.changedToType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"changedToType_"});
        }
        if (iOrdinal == 3) {
            return new bqk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bqj getChangedToType() {
        int i2 = this.changedToType_;
        bqj bqjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bqj.PROMPT : bqj.TTS : bqj.VOICE_TYPE_UNSPECIFIED;
        return bqjVar == null ? bqj.UNRECOGNIZED : bqjVar;
    }

    public int getChangedToTypeValue() {
        return this.changedToType_;
    }

    public static bqi newBuilder(bqk bqkVar) {
        return (bqi) DEFAULT_INSTANCE.createBuilder(bqkVar);
    }

    public static bqk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqk parseFrom(com.google.v.z zVar) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqk parseFrom(InputStream inputStream) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqk parseFrom(ByteBuffer byteBuffer) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqk parseFrom(byte[] bArr) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
