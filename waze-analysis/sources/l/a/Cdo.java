package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* renamed from: l.a.do, reason: invalid class name */
/* loaded from: classes9.dex */
public final class Cdo extends com.google.v.du<Cdo, dn> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final Cdo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<Cdo> PARSER;
    private int action_;

    static {
        Cdo cdo = new Cdo();
        DEFAULT_INSTANCE = cdo;
        com.google.v.du.registerDefaultInstance(Cdo.class, cdo);
    }

    private Cdo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static Cdo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dn newBuilder() {
        return (dn) DEFAULT_INSTANCE.createBuilder();
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(com.google.v.v vVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<Cdo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(dm dmVar) {
        this.action_ = dmVar.getNumber();
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
            return new Cdo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<Cdo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Cdo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dm getAction() {
        int i2 = this.action_;
        dm dmVar = i2 != 0 ? i2 != 1 ? null : dm.OK : dm.ACTION_UNSPECIFIED;
        return dmVar == null ? dm.UNRECOGNIZED : dmVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static dn newBuilder(Cdo cdo) {
        return (dn) DEFAULT_INSTANCE.createBuilder(cdo);
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Cdo parseFrom(InputStream inputStream) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Cdo parseFrom(byte[] bArr) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cdo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
