package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsh extends com.google.v.du<bsh, bsg> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bsh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bsh> PARSER;
    private int action_;

    static {
        bsh bshVar = new bsh();
        DEFAULT_INSTANCE = bshVar;
        com.google.v.du.registerDefaultInstance(bsh.class, bshVar);
    }

    private bsh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static bsh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bsg newBuilder() {
        return (bsg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsh parseDelimitedFrom(InputStream inputStream) {
        return (bsh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsh parseFrom(com.google.v.v vVar) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bsf bsfVar) {
        this.action_ = bsfVar.getNumber();
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
            return new bsh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bsg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bsf getAction() {
        int i2 = this.action_;
        bsf bsfVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bsf.CONFIRM : bsf.CANCEL : bsf.ACTION_UNSPECIFIED;
        return bsfVar == null ? bsf.UNRECOGNIZED : bsfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static bsg newBuilder(bsh bshVar) {
        return (bsg) DEFAULT_INSTANCE.createBuilder(bshVar);
    }

    public static bsh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsh parseFrom(com.google.v.z zVar) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsh parseFrom(InputStream inputStream) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsh parseFrom(ByteBuffer byteBuffer) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsh parseFrom(byte[] bArr) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
