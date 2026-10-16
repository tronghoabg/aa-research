package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aob extends com.google.v.du<aob, aoa> implements com.google.v.fj {
    private static final aob DEFAULT_INSTANCE;
    public static final int LOGGED_IN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aob> PARSER;
    private int bitField0_;
    private boolean loggedIn_;

    static {
        aob aobVar = new aob();
        DEFAULT_INSTANCE = aobVar;
        com.google.v.du.registerDefaultInstance(aob.class, aobVar);
    }

    private aob() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggedIn() {
        this.bitField0_ &= -2;
        this.loggedIn_ = false;
    }

    public static aob getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aoa newBuilder() {
        return (aoa) DEFAULT_INSTANCE.createBuilder();
    }

    public static aob parseDelimitedFrom(InputStream inputStream) {
        return (aob) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aob parseFrom(com.google.v.v vVar) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aob> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggedIn(boolean z) {
        this.bitField0_ |= 1;
        this.loggedIn_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "loggedIn_"});
        }
        if (iOrdinal == 3) {
            return new aob();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aoa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aob> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aob.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getLoggedIn() {
        return this.loggedIn_;
    }

    public boolean hasLoggedIn() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aoa newBuilder(aob aobVar) {
        return (aoa) DEFAULT_INSTANCE.createBuilder(aobVar);
    }

    public static aob parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aob) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aob parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aob parseFrom(com.google.v.z zVar) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aob parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aob parseFrom(InputStream inputStream) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aob parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aob parseFrom(ByteBuffer byteBuffer) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aob parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aob parseFrom(byte[] bArr) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aob parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
