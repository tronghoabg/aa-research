package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tj extends com.google.v.du<tj, ti> implements com.google.v.fj {
    private static final tj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<tj> PARSER = null;
    public static final int WALKING_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean walking_;

    static {
        tj tjVar = new tj();
        DEFAULT_INSTANCE = tjVar;
        com.google.v.du.registerDefaultInstance(tj.class, tjVar);
    }

    private tj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalking() {
        this.bitField0_ &= -2;
        this.walking_ = false;
    }

    public static tj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ti newBuilder() {
        return (ti) DEFAULT_INSTANCE.createBuilder();
    }

    public static tj parseDelimitedFrom(InputStream inputStream) {
        return (tj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tj parseFrom(com.google.v.v vVar) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalking(boolean z) {
        this.bitField0_ |= 1;
        this.walking_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "walking_"});
        }
        if (iOrdinal == 3) {
            return new tj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ti(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getWalking() {
        return this.walking_;
    }

    public boolean hasWalking() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ti newBuilder(tj tjVar) {
        return (ti) DEFAULT_INSTANCE.createBuilder(tjVar);
    }

    public static tj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tj parseFrom(com.google.v.z zVar) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tj parseFrom(InputStream inputStream) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tj parseFrom(ByteBuffer byteBuffer) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tj parseFrom(byte[] bArr) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
