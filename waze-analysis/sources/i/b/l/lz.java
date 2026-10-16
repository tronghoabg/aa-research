package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class lz extends com.google.v.du<lz, ly> implements com.google.v.fj {
    private static final lz DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<lz> PARSER;
    private int bitField0_;
    private String name_ = "no_use_case";

    static {
        lz lzVar = new lz();
        DEFAULT_INSTANCE = lzVar;
        com.google.v.du.registerDefaultInstance(lz.class, lzVar);
    }

    private lz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static lz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ly newBuilder() {
        return (ly) DEFAULT_INSTANCE.createBuilder();
    }

    public static lz parseDelimitedFrom(InputStream inputStream) {
        return (lz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lz parseFrom(com.google.v.v vVar) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "name_"});
        }
        if (iOrdinal == 3) {
            return new lz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ly(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ly newBuilder(lz lzVar) {
        return (ly) DEFAULT_INSTANCE.createBuilder(lzVar);
    }

    public static lz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lz parseFrom(com.google.v.z zVar) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lz parseFrom(InputStream inputStream) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lz parseFrom(ByteBuffer byteBuffer) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lz parseFrom(byte[] bArr) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
