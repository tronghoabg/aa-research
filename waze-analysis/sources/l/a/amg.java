package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class amg extends com.google.v.du<amg, amf> implements com.google.v.fj {
    private static final amg DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int MODE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<amg> PARSER;
    private int bitField0_;
    private long index_;
    private int mode_;

    static {
        amg amgVar = new amg();
        DEFAULT_INSTANCE = amgVar;
        com.google.v.du.registerDefaultInstance(amg.class, amgVar);
    }

    private amg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    public static amg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static amf newBuilder() {
        return (amf) DEFAULT_INSTANCE.createBuilder();
    }

    public static amg parseDelimitedFrom(InputStream inputStream) {
        return (amg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amg parseFrom(com.google.v.v vVar) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<amg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.bitField0_ |= 1;
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(amc amcVar) {
        this.mode_ = amcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002\f", new Object[]{"bitField0_", "index_", "mode_"});
        }
        if (iOrdinal == 3) {
            return new amg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<amg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (amg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getIndex() {
        return this.index_;
    }

    public amc getMode() {
        amc amcVarA = amc.a(this.mode_);
        return amcVarA == null ? amc.UNRECOGNIZED : amcVarA;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static amf newBuilder(amg amgVar) {
        return (amf) DEFAULT_INSTANCE.createBuilder(amgVar);
    }

    public static amg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static amg parseFrom(com.google.v.z zVar) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static amg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static amg parseFrom(InputStream inputStream) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amg parseFrom(ByteBuffer byteBuffer) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static amg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static amg parseFrom(byte[] bArr) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static amg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (amg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
