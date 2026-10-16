package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anm extends com.google.v.du<anm, anl> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    private static final anm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<anm> PARSER;
    private ck alerterInfo_;
    private int bitField0_;

    static {
        anm anmVar = new anm();
        DEFAULT_INSTANCE = anmVar;
        com.google.v.du.registerDefaultInstance(anm.class, anmVar);
    }

    private anm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static anm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ck ckVar2 = this.alerterInfo_;
        if (ckVar2 != null && ckVar2 != ck.getDefaultInstance()) {
            cj cjVarNewBuilder = ck.newBuilder(ckVar2);
            cjVarNewBuilder.mergeFrom((cj) ckVar);
            ckVar = cjVarNewBuilder.buildPartial();
        }
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    public static anl newBuilder() {
        return (anl) DEFAULT_INSTANCE.createBuilder();
    }

    public static anm parseDelimitedFrom(InputStream inputStream) {
        return (anm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anm parseFrom(com.google.v.v vVar) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<anm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "alerterInfo_"});
        }
        if (iOrdinal == 3) {
            return new anm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new anl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<anm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (anm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static anl newBuilder(anm anmVar) {
        return (anl) DEFAULT_INSTANCE.createBuilder(anmVar);
    }

    public static anm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static anm parseFrom(com.google.v.z zVar) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static anm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static anm parseFrom(InputStream inputStream) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anm parseFrom(ByteBuffer byteBuffer) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static anm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static anm parseFrom(byte[] bArr) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static anm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (anm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
