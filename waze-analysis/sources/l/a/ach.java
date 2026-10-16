package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ach extends com.google.v.du<ach, acg> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ach DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ach> PARSER;
    private int action_;

    static {
        ach achVar = new ach();
        DEFAULT_INSTANCE = achVar;
        com.google.v.du.registerDefaultInstance(ach.class, achVar);
    }

    private ach() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static ach getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static acg newBuilder() {
        return (acg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ach parseDelimitedFrom(InputStream inputStream) {
        return (ach) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ach parseFrom(com.google.v.v vVar) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ach> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(acf acfVar) {
        this.action_ = acfVar.getNumber();
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
            return new ach();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new acg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ach> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ach.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public acf getAction() {
        int i2 = this.action_;
        acf acfVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : acf.CLOSE : acf.MORE_DETAILS : acf.BACK : acf.CANCEL : acf.CONFIRM : acf.ACTION_UNSPECIFIED;
        return acfVar == null ? acf.UNRECOGNIZED : acfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static acg newBuilder(ach achVar) {
        return (acg) DEFAULT_INSTANCE.createBuilder(achVar);
    }

    public static ach parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ach) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ach parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ach parseFrom(com.google.v.z zVar) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ach parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ach parseFrom(InputStream inputStream) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ach parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ach parseFrom(ByteBuffer byteBuffer) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ach parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ach parseFrom(byte[] bArr) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ach parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ach) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
