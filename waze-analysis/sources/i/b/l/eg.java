package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class eg extends com.google.v.du<eg, ec> implements com.google.v.fj {
    private static final eg DEFAULT_INSTANCE;
    public static final int EXCLUDED_LOGIN_RESPONSES_FIELD_NUMBER = 5;
    public static final int LOGOUT_OTHER_DEVICES_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<eg> PARSER = null;
    public static final int PASSWORD_CREDENTIAL_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int TOKEN_CREDENTIAL_FIELD_NUMBER = 2;
    private static final com.google.v.el<ee> excludedLoginResponses_converter_ = new ff(1);
    private int bitField0_;
    private Object credential_;
    private int reason_;
    private int credentialCase_ = 0;
    private boolean logoutOtherDevices_ = true;
    private com.google.v.ek excludedLoginResponses_ = emptyIntList();

    static {
        eg egVar = new eg();
        DEFAULT_INSTANCE = egVar;
        com.google.v.du.registerDefaultInstance(eg.class, egVar);
    }

    private eg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExcludedLoginResponses(Iterable<? extends ee> iterable) {
        ensureExcludedLoginResponsesIsMutable();
        Iterator<? extends ee> it = iterable.iterator();
        while (it.hasNext()) {
            this.excludedLoginResponses_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludedLoginResponses(ee eeVar) {
        Objects.requireNonNull(eeVar);
        ensureExcludedLoginResponsesIsMutable();
        this.excludedLoginResponses_.i(eeVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredential() {
        this.credentialCase_ = 0;
        this.credential_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExcludedLoginResponses() {
        this.excludedLoginResponses_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogoutOtherDevices() {
        this.bitField0_ &= -3;
        this.logoutOtherDevices_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPasswordCredential() {
        if (this.credentialCase_ == 1) {
            this.credentialCase_ = 0;
            this.credential_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.bitField0_ &= -2;
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTokenCredential() {
        if (this.credentialCase_ == 2) {
            this.credentialCase_ = 0;
            this.credential_ = null;
        }
    }

    private void ensureExcludedLoginResponsesIsMutable() {
        com.google.v.ek ekVar = this.excludedLoginResponses_;
        if (ekVar.c()) {
            return;
        }
        this.excludedLoginResponses_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static eg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePasswordCredential(ep epVar) {
        Objects.requireNonNull(epVar);
        if (this.credentialCase_ == 1 && this.credential_ != ep.getDefaultInstance()) {
            eo eoVarNewBuilder = ep.newBuilder((ep) this.credential_);
            eoVarNewBuilder.mergeFrom((eo) epVar);
            epVar = eoVarNewBuilder.buildPartial();
        }
        this.credential_ = epVar;
        this.credentialCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTokenCredential(et etVar) {
        Objects.requireNonNull(etVar);
        if (this.credentialCase_ == 2 && this.credential_ != et.getDefaultInstance()) {
            es esVarNewBuilder = et.newBuilder((et) this.credential_);
            esVarNewBuilder.mergeFrom((es) etVar);
            etVar = esVarNewBuilder.buildPartial();
        }
        this.credential_ = etVar;
        this.credentialCase_ = 2;
    }

    public static ec newBuilder() {
        return (ec) DEFAULT_INSTANCE.createBuilder();
    }

    public static eg parseDelimitedFrom(InputStream inputStream) {
        return (eg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eg parseFrom(com.google.v.v vVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExcludedLoginResponses(int i2, ee eeVar) {
        Objects.requireNonNull(eeVar);
        ensureExcludedLoginResponsesIsMutable();
        this.excludedLoginResponses_.e(i2, eeVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoutOtherDevices(boolean z) {
        this.bitField0_ |= 2;
        this.logoutOtherDevices_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordCredential(ep epVar) {
        Objects.requireNonNull(epVar);
        this.credential_ = epVar;
        this.credentialCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(ef efVar) {
        this.reason_ = efVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenCredential(et etVar) {
        Objects.requireNonNull(etVar);
        this.credential_ = etVar;
        this.credentialCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004ဇ\u0001\u0005ࠞ", new Object[]{"credential_", "credentialCase_", "bitField0_", ep.class, et.class, "reason_", e.u, "logoutOtherDevices_", "excludedLoginResponses_", e.t});
        }
        if (iOrdinal == 3) {
            return new eg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ec(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ed getCredentialCase() {
        int i2 = this.credentialCase_;
        if (i2 == 0) {
            return ed.f48680c;
        }
        if (i2 == 1) {
            return ed.f48678a;
        }
        if (i2 != 2) {
            return null;
        }
        return ed.f48679b;
    }

    public ee getExcludedLoginResponses(int i2) {
        ee eeVarA = ee.a(this.excludedLoginResponses_.d(i2));
        return eeVarA == null ? ee.FORMAT_UNSPECIFIED : eeVarA;
    }

    public int getExcludedLoginResponsesCount() {
        return this.excludedLoginResponses_.size();
    }

    public List<ee> getExcludedLoginResponsesList() {
        return new com.google.v.em(this.excludedLoginResponses_, excludedLoginResponses_converter_);
    }

    public boolean getLogoutOtherDevices() {
        return this.logoutOtherDevices_;
    }

    public ep getPasswordCredential() {
        return this.credentialCase_ == 1 ? (ep) this.credential_ : ep.getDefaultInstance();
    }

    public ef getReason() {
        ef efVarA = ef.a(this.reason_);
        return efVarA == null ? ef.NORMAL : efVarA;
    }

    public et getTokenCredential() {
        return this.credentialCase_ == 2 ? (et) this.credential_ : et.getDefaultInstance();
    }

    public boolean hasLogoutOtherDevices() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPasswordCredential() {
        return this.credentialCase_ == 1;
    }

    public boolean hasReason() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTokenCredential() {
        return this.credentialCase_ == 2;
    }

    public static ec newBuilder(eg egVar) {
        return (ec) DEFAULT_INSTANCE.createBuilder(egVar);
    }

    public static eg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eg parseFrom(com.google.v.z zVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eg parseFrom(InputStream inputStream) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eg parseFrom(ByteBuffer byteBuffer) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eg parseFrom(byte[] bArr) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
