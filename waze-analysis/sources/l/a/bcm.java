package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bcm extends com.google.v.du<bcm, bcl> implements com.google.v.fj {
    public static final int ACCOUNT_STATE_FIELD_NUMBER = 1;
    public static final int ALREADY_SHARING_FIELD_NUMBER = 2;
    private static final bcm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bcm> PARSER;
    private int accountState_;
    private boolean alreadySharing_;
    private int bitField0_;

    static {
        bcm bcmVar = new bcm();
        DEFAULT_INSTANCE = bcmVar;
        com.google.v.du.registerDefaultInstance(bcm.class, bcmVar);
    }

    private bcm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountState() {
        this.accountState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlreadySharing() {
        this.bitField0_ &= -2;
        this.alreadySharing_ = false;
    }

    public static bcm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bcl newBuilder() {
        return (bcl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bcm parseDelimitedFrom(InputStream inputStream) {
        return (bcm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcm parseFrom(com.google.v.v vVar) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bcm> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlreadySharing(boolean z) {
        this.bitField0_ |= 1;
        this.alreadySharing_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000", new Object[]{"bitField0_", "accountState_", "alreadySharing_"});
        }
        if (iOrdinal == 3) {
            return new bcm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bcm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bcm.class) {
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

    public boolean getAlreadySharing() {
        return this.alreadySharing_;
    }

    public boolean hasAlreadySharing() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bcl newBuilder(bcm bcmVar) {
        return (bcl) DEFAULT_INSTANCE.createBuilder(bcmVar);
    }

    public static bcm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bcm parseFrom(com.google.v.z zVar) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bcm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bcm parseFrom(InputStream inputStream) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcm parseFrom(ByteBuffer byteBuffer) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bcm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bcm parseFrom(byte[] bArr) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bcm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bcm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
