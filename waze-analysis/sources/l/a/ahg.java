package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahg extends com.google.v.du<ahg, ahf> implements com.google.v.fj {
    private static final ahg DEFAULT_INSTANCE;
    public static final int FIRST_ATTEMPT_IN_SESSION_FIELD_NUMBER = 1;
    public static final int LOGIN_SESSION_IN_BACKGROUND_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ahg> PARSER;
    private int bitField0_;
    private boolean firstAttemptInSession_;
    private boolean loginSessionInBackground_;

    static {
        ahg ahgVar = new ahg();
        DEFAULT_INSTANCE = ahgVar;
        com.google.v.du.registerDefaultInstance(ahg.class, ahgVar);
    }

    private ahg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstAttemptInSession() {
        this.bitField0_ &= -2;
        this.firstAttemptInSession_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginSessionInBackground() {
        this.bitField0_ &= -3;
        this.loginSessionInBackground_ = false;
    }

    public static ahg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ahf newBuilder() {
        return (ahf) DEFAULT_INSTANCE.createBuilder();
    }

    public static ahg parseDelimitedFrom(InputStream inputStream) {
        return (ahg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahg parseFrom(com.google.v.v vVar) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ahg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstAttemptInSession(boolean z) {
        this.bitField0_ |= 1;
        this.firstAttemptInSession_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginSessionInBackground(boolean z) {
        this.bitField0_ |= 2;
        this.loginSessionInBackground_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "firstAttemptInSession_", "loginSessionInBackground_"});
        }
        if (iOrdinal == 3) {
            return new ahg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ahf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ahg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ahg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public boolean getFirstAttemptInSession() {
        return this.firstAttemptInSession_;
    }

    public boolean getLoginSessionInBackground() {
        return this.loginSessionInBackground_;
    }

    @Deprecated
    public boolean hasFirstAttemptInSession() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLoginSessionInBackground() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ahf newBuilder(ahg ahgVar) {
        return (ahf) DEFAULT_INSTANCE.createBuilder(ahgVar);
    }

    public static ahg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ahg parseFrom(com.google.v.z zVar) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ahg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ahg parseFrom(InputStream inputStream) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahg parseFrom(ByteBuffer byteBuffer) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ahg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ahg parseFrom(byte[] bArr) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ahg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ahg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
