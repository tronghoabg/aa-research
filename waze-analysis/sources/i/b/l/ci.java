package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ci extends com.google.v.du<ci, ch> implements com.google.v.fj {
    private static final ci DEFAULT_INSTANCE;
    public static final int ON_EVERY_NODE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ci> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean onEveryNode_;
    private int seconds_;

    static {
        ci ciVar = new ci();
        DEFAULT_INSTANCE = ciVar;
        com.google.v.du.registerDefaultInstance(ci.class, ciVar);
    }

    private ci() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnEveryNode() {
        this.bitField0_ &= -3;
        this.onEveryNode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.bitField0_ &= -2;
        this.seconds_ = 0;
    }

    public static ci getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ch newBuilder() {
        return (ch) DEFAULT_INSTANCE.createBuilder();
    }

    public static ci parseDelimitedFrom(InputStream inputStream) {
        return (ci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ci parseFrom(com.google.v.v vVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ci> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnEveryNode(boolean z) {
        this.bitField0_ |= 2;
        this.onEveryNode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(int i2) {
        this.bitField0_ |= 1;
        this.seconds_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "seconds_", "onEveryNode_"});
        }
        if (iOrdinal == 3) {
            return new ci();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ch(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ci> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ci.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getOnEveryNode() {
        return this.onEveryNode_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public boolean hasOnEveryNode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ch newBuilder(ci ciVar) {
        return (ch) DEFAULT_INSTANCE.createBuilder(ciVar);
    }

    public static ci parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ci parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ci parseFrom(com.google.v.z zVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ci parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ci parseFrom(InputStream inputStream) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ci parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ci parseFrom(ByteBuffer byteBuffer) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ci parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ci parseFrom(byte[] bArr) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ci parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
