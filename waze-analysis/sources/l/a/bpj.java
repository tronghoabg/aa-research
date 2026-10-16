package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpj extends com.google.v.du<bpj, bph> implements com.google.v.fj {
    public static final int CONVERSION_VALUE_SENT_FIELD_NUMBER = 1;
    private static final bpj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bpj> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bpj bpjVar = new bpj();
        DEFAULT_INSTANCE = bpjVar;
        com.google.v.du.registerDefaultInstance(bpj.class, bpjVar);
    }

    private bpj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversionValueSent() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static bpj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversionValueSent(ov ovVar) {
        Objects.requireNonNull(ovVar);
        if (this.statCase_ == 1 && this.stat_ != ov.getDefaultInstance()) {
            ot otVarNewBuilder = ov.newBuilder((ov) this.stat_);
            otVarNewBuilder.mergeFrom((ot) ovVar);
            ovVar = otVarNewBuilder.buildPartial();
        }
        this.stat_ = ovVar;
        this.statCase_ = 1;
    }

    public static bph newBuilder() {
        return (bph) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpj parseDelimitedFrom(InputStream inputStream) {
        return (bpj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpj parseFrom(com.google.v.v vVar) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversionValueSent(ov ovVar) {
        Objects.requireNonNull(ovVar);
        this.stat_ = ovVar;
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"stat_", "statCase_", ov.class});
        }
        if (iOrdinal == 3) {
            return new bpj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bph(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ov getConversionValueSent() {
        return this.statCase_ == 1 ? (ov) this.stat_ : ov.getDefaultInstance();
    }

    public bpi getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bpi.f54460b;
        }
        if (i2 != 1) {
            return null;
        }
        return bpi.f54459a;
    }

    public boolean hasConversionValueSent() {
        return this.statCase_ == 1;
    }

    public static bph newBuilder(bpj bpjVar) {
        return (bph) DEFAULT_INSTANCE.createBuilder(bpjVar);
    }

    public static bpj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpj parseFrom(com.google.v.z zVar) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpj parseFrom(InputStream inputStream) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpj parseFrom(ByteBuffer byteBuffer) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpj parseFrom(byte[] bArr) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
