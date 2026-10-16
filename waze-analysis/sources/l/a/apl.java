package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apl extends com.google.v.du<apl, apk> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final apl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<apl> PARSER;
    private int action_;

    static {
        apl aplVar = new apl();
        DEFAULT_INSTANCE = aplVar;
        com.google.v.du.registerDefaultInstance(apl.class, aplVar);
    }

    private apl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static apl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static apk newBuilder() {
        return (apk) DEFAULT_INSTANCE.createBuilder();
    }

    public static apl parseDelimitedFrom(InputStream inputStream) {
        return (apl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apl parseFrom(com.google.v.v vVar) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(apj apjVar) {
        this.action_ = apjVar.getNumber();
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
            return new apl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new apk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public apj getAction() {
        int i2 = this.action_;
        apj apjVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : apj.MARK_PARKING : apj.FIND_PARKING : apj.CLOSE : apj.ACTION_UNSPECIFIED;
        return apjVar == null ? apj.UNRECOGNIZED : apjVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static apk newBuilder(apl aplVar) {
        return (apk) DEFAULT_INSTANCE.createBuilder(aplVar);
    }

    public static apl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apl parseFrom(com.google.v.z zVar) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apl parseFrom(InputStream inputStream) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apl parseFrom(ByteBuffer byteBuffer) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apl parseFrom(byte[] bArr) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
