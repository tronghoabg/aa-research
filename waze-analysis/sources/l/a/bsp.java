package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsp extends com.google.v.du<bsp, bsn> implements com.google.v.fj {
    private static final bsp DEFAULT_INSTANCE;
    public static final int IN_APP_WEB_PAGE_LOAD_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bsp> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bsp bspVar = new bsp();
        DEFAULT_INSTANCE = bspVar;
        com.google.v.du.registerDefaultInstance(bsp.class, bspVar);
    }

    private bsp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInAppWebPageLoad() {
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

    public static bsp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInAppWebPageLoad(abs absVar) {
        Objects.requireNonNull(absVar);
        if (this.statCase_ == 1 && this.stat_ != abs.getDefaultInstance()) {
            abr abrVarNewBuilder = abs.newBuilder((abs) this.stat_);
            abrVarNewBuilder.mergeFrom((abr) absVar);
            absVar = abrVarNewBuilder.buildPartial();
        }
        this.stat_ = absVar;
        this.statCase_ = 1;
    }

    public static bsn newBuilder() {
        return (bsn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsp parseDelimitedFrom(InputStream inputStream) {
        return (bsp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsp parseFrom(com.google.v.v vVar) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInAppWebPageLoad(abs absVar) {
        Objects.requireNonNull(absVar);
        this.stat_ = absVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"stat_", "statCase_", abs.class});
        }
        if (iOrdinal == 3) {
            return new bsp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bsn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public abs getInAppWebPageLoad() {
        return this.statCase_ == 1 ? (abs) this.stat_ : abs.getDefaultInstance();
    }

    public bso getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bso.f54630b;
        }
        if (i2 != 1) {
            return null;
        }
        return bso.f54629a;
    }

    public boolean hasInAppWebPageLoad() {
        return this.statCase_ == 1;
    }

    public static bsn newBuilder(bsp bspVar) {
        return (bsn) DEFAULT_INSTANCE.createBuilder(bspVar);
    }

    public static bsp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsp parseFrom(com.google.v.z zVar) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsp parseFrom(InputStream inputStream) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsp parseFrom(ByteBuffer byteBuffer) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsp parseFrom(byte[] bArr) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
