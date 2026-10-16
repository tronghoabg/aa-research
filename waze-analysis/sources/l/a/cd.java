package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class cd extends com.google.v.du<cd, cc> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    private static final cd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cd> PARSER;
    private ck alerterInfo_;
    private int bitField0_;

    static {
        cd cdVar = new cd();
        DEFAULT_INSTANCE = cdVar;
        com.google.v.du.registerDefaultInstance(cd.class, cdVar);
    }

    private cd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static cd getDefaultInstance() {
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

    public static cc newBuilder() {
        return (cc) DEFAULT_INSTANCE.createBuilder();
    }

    public static cd parseDelimitedFrom(InputStream inputStream) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(com.google.v.v vVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cd> parser() {
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
            return new cd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cd.class) {
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

    public static cc newBuilder(cd cdVar) {
        return (cc) DEFAULT_INSTANCE.createBuilder(cdVar);
    }

    public static cd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cd parseFrom(com.google.v.z zVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cd parseFrom(InputStream inputStream) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(ByteBuffer byteBuffer) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cd parseFrom(byte[] bArr) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
