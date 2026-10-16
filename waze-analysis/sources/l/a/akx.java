package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class akx extends com.google.v.du<akx, akv> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final akx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<akx> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int action_;
    private int status_;

    static {
        akx akxVar = new akx();
        DEFAULT_INSTANCE = akxVar;
        com.google.v.du.registerDefaultInstance(akx.class, akxVar);
    }

    private akx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static akx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static akv newBuilder() {
        return (akv) DEFAULT_INSTANCE.createBuilder();
    }

    public static akx parseDelimitedFrom(InputStream inputStream) {
        return (akx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akx parseFrom(com.google.v.v vVar) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<akx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aku akuVar) {
        this.action_ = akuVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(akw akwVar) {
        this.status_ = akwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i2) {
        this.status_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"action_", "status_"});
        }
        if (iOrdinal == 3) {
            return new akx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new akv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<akx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (akx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aku getAction() {
        aku akuVar;
        switch (this.action_) {
            case 0:
                akuVar = aku.ACTION_UNSPECIFIED;
                break;
            case 1:
                akuVar = aku.ACCOUNT;
                break;
            case 2:
                akuVar = aku.CLOSE;
                break;
            case 3:
                akuVar = aku.CONTRIBUTION_FEED;
                break;
            case 4:
                akuVar = aku.HOME_WORK;
                break;
            case 5:
                akuVar = aku.ACCOUNT_BOX;
                break;
            case 6:
                akuVar = aku.MOOD;
                break;
            case 7:
                akuVar = aku.REGISTER_TOOLTIP;
                break;
            case 8:
                akuVar = aku.SETTINGS;
                break;
            case 9:
                akuVar = aku.STORES;
                break;
            default:
                akuVar = null;
                break;
        }
        return akuVar == null ? aku.UNRECOGNIZED : akuVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public akw getStatus() {
        int i2 = this.status_;
        akw akwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : akw.WITH_BADGE : akw.REGULAR : akw.STATUS_UNSPECIFIED;
        return akwVar == null ? akw.UNRECOGNIZED : akwVar;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public static akv newBuilder(akx akxVar) {
        return (akv) DEFAULT_INSTANCE.createBuilder(akxVar);
    }

    public static akx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static akx parseFrom(com.google.v.z zVar) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static akx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static akx parseFrom(InputStream inputStream) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akx parseFrom(ByteBuffer byteBuffer) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static akx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static akx parseFrom(byte[] bArr) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static akx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (akx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
