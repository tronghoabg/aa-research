package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aoo extends com.google.v.du<aoo, aon> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final aoo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aoo> PARSER;
    private int action_;

    static {
        aoo aooVar = new aoo();
        DEFAULT_INSTANCE = aooVar;
        com.google.v.du.registerDefaultInstance(aoo.class, aooVar);
    }

    private aoo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static aoo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aon newBuilder() {
        return (aon) DEFAULT_INSTANCE.createBuilder();
    }

    public static aoo parseDelimitedFrom(InputStream inputStream) {
        return (aoo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aoo parseFrom(com.google.v.v vVar) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aoo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aom aomVar) {
        this.action_ = aomVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"action_"});
        }
        if (iOrdinal == 3) {
            return new aoo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aon(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aoo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aoo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aom getAction() {
        int i2 = this.action_;
        aom aomVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aom.NEW_DRIVE_TIMEOUT : aom.NEW_DRIVE : aom.CANCEL : aom.ACTION_UNSPECIFIED;
        return aomVar == null ? aom.UNRECOGNIZED : aomVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static aon newBuilder(aoo aooVar) {
        return (aon) DEFAULT_INSTANCE.createBuilder(aooVar);
    }

    public static aoo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aoo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aoo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aoo parseFrom(com.google.v.z zVar) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aoo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aoo parseFrom(InputStream inputStream) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aoo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aoo parseFrom(ByteBuffer byteBuffer) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aoo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aoo parseFrom(byte[] bArr) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aoo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aoo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
