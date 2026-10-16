package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jg extends com.google.v.du<jg, jf> implements com.google.v.fj {
    private static final jg DEFAULT_INSTANCE;
    public static final int MOBILE_OPEN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jg> PARSER;
    private int bitField0_;
    private boolean mobileOpen_;

    static {
        jg jgVar = new jg();
        DEFAULT_INSTANCE = jgVar;
        com.google.v.du.registerDefaultInstance(jg.class, jgVar);
    }

    private jg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileOpen() {
        this.bitField0_ &= -2;
        this.mobileOpen_ = false;
    }

    public static jg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jf newBuilder() {
        return (jf) DEFAULT_INSTANCE.createBuilder();
    }

    public static jg parseDelimitedFrom(InputStream inputStream) {
        return (jg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jg parseFrom(com.google.v.v vVar) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileOpen(boolean z) {
        this.bitField0_ |= 1;
        this.mobileOpen_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "mobileOpen_"});
        }
        if (iOrdinal == 3) {
            return new jg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getMobileOpen() {
        return this.mobileOpen_;
    }

    public boolean hasMobileOpen() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jf newBuilder(jg jgVar) {
        return (jf) DEFAULT_INSTANCE.createBuilder(jgVar);
    }

    public static jg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jg parseFrom(com.google.v.z zVar) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jg parseFrom(InputStream inputStream) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jg parseFrom(ByteBuffer byteBuffer) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jg parseFrom(byte[] bArr) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
