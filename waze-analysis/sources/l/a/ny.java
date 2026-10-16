package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ny extends com.google.v.du<ny, nx> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ny DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ny> PARSER;
    private int action_;

    static {
        ny nyVar = new ny();
        DEFAULT_INSTANCE = nyVar;
        com.google.v.du.registerDefaultInstance(ny.class, nyVar);
    }

    private ny() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static ny getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nx newBuilder() {
        return (nx) DEFAULT_INSTANCE.createBuilder();
    }

    public static ny parseDelimitedFrom(InputStream inputStream) {
        return (ny) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ny parseFrom(com.google.v.v vVar) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ny> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(nw nwVar) {
        this.action_ = nwVar.getNumber();
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
            return new ny();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ny> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ny.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public nw getAction() {
        int i2 = this.action_;
        nw nwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : nw.TAP_OUTSIDE : nw.BACK : nw.CLOSE : nw.TURN_ON : nw.ACTION_UNSPECIFIED;
        return nwVar == null ? nw.UNRECOGNIZED : nwVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static nx newBuilder(ny nyVar) {
        return (nx) DEFAULT_INSTANCE.createBuilder(nyVar);
    }

    public static ny parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ny) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ny parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ny parseFrom(com.google.v.z zVar) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ny parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ny parseFrom(InputStream inputStream) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ny parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ny parseFrom(ByteBuffer byteBuffer) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ny parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ny parseFrom(byte[] bArr) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ny parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ny) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
