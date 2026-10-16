package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bcw extends com.google.v.du<bcw, bcu> implements bcx {
    public static final int ACCOUNT_STATE_FIELD_NUMBER = 2;
    private static final bcw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bcw> PARSER = null;
    public static final int PARTICIPANT_TYPE_FIELD_NUMBER = 1;
    private int accountState_;
    private int participantType_;

    static {
        bcw bcwVar = new bcw();
        DEFAULT_INSTANCE = bcwVar;
        com.google.v.du.registerDefaultInstance(bcw.class, bcwVar);
    }

    private bcw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountState() {
        this.accountState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantType() {
        this.participantType_ = 0;
    }

    public static bcw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bcu newBuilder() {
        return (bcu) DEFAULT_INSTANCE.createBuilder();
    }

    public static bcw parseDelimitedFrom(InputStream inputStream) {
        return (bcw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcw parseFrom(com.google.v.v vVar) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bcw> parser() {
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
    public void setParticipantType(bcv bcvVar) {
        this.participantType_ = bcvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantTypeValue(int i2) {
        this.participantType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"participantType_", "accountState_"});
        }
        if (iOrdinal == 3) {
            return new bcw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bcu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bcw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bcw.class) {
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

    public bcv getParticipantType() {
        int i2 = this.participantType_;
        bcv bcvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bcv.VIEWER_SHARING_LOCATION : bcv.VIEWER : bcv.DRIVER : bcv.PARTICIPANT_TYPE_UNSPECIFIED;
        return bcvVar == null ? bcv.UNRECOGNIZED : bcvVar;
    }

    public int getParticipantTypeValue() {
        return this.participantType_;
    }

    public static bcu newBuilder(bcw bcwVar) {
        return (bcu) DEFAULT_INSTANCE.createBuilder(bcwVar);
    }

    public static bcw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bcw parseFrom(com.google.v.z zVar) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bcw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bcw parseFrom(InputStream inputStream) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcw parseFrom(ByteBuffer byteBuffer) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bcw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bcw parseFrom(byte[] bArr) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bcw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bcw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
