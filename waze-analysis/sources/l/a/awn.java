package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awn extends com.google.v.du<awn, awm> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final awn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<awn> PARSER;
    private int action_;

    static {
        awn awnVar = new awn();
        DEFAULT_INSTANCE = awnVar;
        com.google.v.du.registerDefaultInstance(awn.class, awnVar);
    }

    private awn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static awn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static awm newBuilder() {
        return (awm) DEFAULT_INSTANCE.createBuilder();
    }

    public static awn parseDelimitedFrom(InputStream inputStream) {
        return (awn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awn parseFrom(com.google.v.v vVar) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<awn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(awl awlVar) {
        this.action_ = awlVar.getNumber();
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
            return new awn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<awn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (awn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public awl getAction() {
        int i2 = this.action_;
        awl awlVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : awl.GO_ANYWAY : awl.CLOSE : awl.ACTION_UNSPECIFIED;
        return awlVar == null ? awl.UNRECOGNIZED : awlVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static awm newBuilder(awn awnVar) {
        return (awm) DEFAULT_INSTANCE.createBuilder(awnVar);
    }

    public static awn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static awn parseFrom(com.google.v.z zVar) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static awn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static awn parseFrom(InputStream inputStream) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awn parseFrom(ByteBuffer byteBuffer) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static awn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static awn parseFrom(byte[] bArr) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static awn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (awn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
