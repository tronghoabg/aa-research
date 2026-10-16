package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdk extends com.google.v.du<bdk, bdj> implements com.google.v.fj {
    public static final int ACCOUNT_STATE_FIELD_NUMBER = 1;
    private static final bdk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bdk> PARSER;
    private int accountState_;

    static {
        bdk bdkVar = new bdk();
        DEFAULT_INSTANCE = bdkVar;
        com.google.v.du.registerDefaultInstance(bdk.class, bdkVar);
    }

    private bdk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountState() {
        this.accountState_ = 0;
    }

    public static bdk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bdj newBuilder() {
        return (bdj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bdk parseDelimitedFrom(InputStream inputStream) {
        return (bdk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdk parseFrom(com.google.v.v vVar) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bdk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountState(p pVar) {
        this.accountState_ = pVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountStateValue(int i2) {
        this.accountState_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"accountState_"});
        }
        if (iOrdinal == 3) {
            return new bdk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bdj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bdk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bdk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public p getAccountState() {
        p pVarA = p.a(this.accountState_);
        return pVarA == null ? p.UNRECOGNIZED : pVarA;
    }

    public int getAccountStateValue() {
        return this.accountState_;
    }

    public static bdj newBuilder(bdk bdkVar) {
        return (bdj) DEFAULT_INSTANCE.createBuilder(bdkVar);
    }

    public static bdk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bdk parseFrom(com.google.v.z zVar) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bdk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bdk parseFrom(InputStream inputStream) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdk parseFrom(ByteBuffer byteBuffer) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bdk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bdk parseFrom(byte[] bArr) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bdk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bdk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
