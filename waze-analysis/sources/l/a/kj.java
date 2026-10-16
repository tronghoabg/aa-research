package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kj extends com.google.v.du<kj, kh> implements com.google.v.fj {
    public static final int CLIENT_TEMPORARY_DYNAMIC_EVENT_FIELD_NUMBER = 1;
    private static final kj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kj> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        kj kjVar = new kj();
        DEFAULT_INSTANCE = kjVar;
        com.google.v.du.registerDefaultInstance(kj.class, kjVar);
    }

    private kj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTemporaryDynamicEvent() {
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

    public static kj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientTemporaryDynamicEvent(ko koVar) {
        Objects.requireNonNull(koVar);
        if (this.statCase_ == 1 && this.stat_ != ko.getDefaultInstance()) {
            kk kkVarNewBuilder = ko.newBuilder((ko) this.stat_);
            kkVarNewBuilder.mergeFrom((kk) koVar);
            koVar = kkVarNewBuilder.buildPartial();
        }
        this.stat_ = koVar;
        this.statCase_ = 1;
    }

    public static kh newBuilder() {
        return (kh) DEFAULT_INSTANCE.createBuilder();
    }

    public static kj parseDelimitedFrom(InputStream inputStream) {
        return (kj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kj parseFrom(com.google.v.v vVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTemporaryDynamicEvent(ko koVar) {
        Objects.requireNonNull(koVar);
        this.stat_ = koVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"stat_", "statCase_", ko.class});
        }
        if (iOrdinal == 3) {
            return new kj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ko getClientTemporaryDynamicEvent() {
        return this.statCase_ == 1 ? (ko) this.stat_ : ko.getDefaultInstance();
    }

    public ki getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return ki.f55013b;
        }
        if (i2 != 1) {
            return null;
        }
        return ki.f55012a;
    }

    public boolean hasClientTemporaryDynamicEvent() {
        return this.statCase_ == 1;
    }

    public static kh newBuilder(kj kjVar) {
        return (kh) DEFAULT_INSTANCE.createBuilder(kjVar);
    }

    public static kj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kj parseFrom(com.google.v.z zVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kj parseFrom(InputStream inputStream) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kj parseFrom(ByteBuffer byteBuffer) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kj parseFrom(byte[] bArr) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
