package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fp extends com.google.v.du<fp, fo> implements fq {
    private static final fp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fp> PARSER = null;
    public static final int PERMITID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String permitId_ = "";

    static {
        fp fpVar = new fp();
        DEFAULT_INSTANCE = fpVar;
        com.google.v.du.registerDefaultInstance(fp.class, fpVar);
    }

    private fp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermitId() {
        this.bitField0_ &= -2;
        this.permitId_ = getDefaultInstance().getPermitId();
    }

    public static fp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fo newBuilder() {
        return (fo) DEFAULT_INSTANCE.createBuilder();
    }

    public static fp parseDelimitedFrom(InputStream inputStream) {
        return (fp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fp parseFrom(com.google.v.v vVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermitId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.permitId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermitIdBytes(com.google.v.v vVar) {
        this.permitId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "permitId_"});
        }
        if (iOrdinal == 3) {
            return new fp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPermitId() {
        return this.permitId_;
    }

    public com.google.v.v getPermitIdBytes() {
        return com.google.v.v.s(this.permitId_);
    }

    public boolean hasPermitId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fo newBuilder(fp fpVar) {
        return (fo) DEFAULT_INSTANCE.createBuilder(fpVar);
    }

    public static fp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fp parseFrom(com.google.v.z zVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fp parseFrom(InputStream inputStream) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fp parseFrom(ByteBuffer byteBuffer) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fp parseFrom(byte[] bArr) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
