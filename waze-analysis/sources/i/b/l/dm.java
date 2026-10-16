package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dm extends com.google.v.du<dm, dk> implements com.google.v.fj {
    private static final dm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dm> PARSER = null;
    public static final int PASSWORD_CREDENTIAL_FIELD_NUMBER = 1;
    public static final int TOKEN_CREDENTIAL_FIELD_NUMBER = 2;
    private int credentialCase_ = 0;
    private Object credential_;

    static {
        dm dmVar = new dm();
        DEFAULT_INSTANCE = dmVar;
        com.google.v.du.registerDefaultInstance(dm.class, dmVar);
    }

    private dm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredential() {
        this.credentialCase_ = 0;
        this.credential_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPasswordCredential() {
        if (this.credentialCase_ == 1) {
            this.credentialCase_ = 0;
            this.credential_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTokenCredential() {
        if (this.credentialCase_ == 2) {
            this.credentialCase_ = 0;
            this.credential_ = null;
        }
    }

    public static dm getDefaultInstance() {
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

    public static dk newBuilder() {
        return (dk) DEFAULT_INSTANCE.createBuilder();
    }

    public static dm parseDelimitedFrom(InputStream inputStream) {
        return (dm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dm parseFrom(com.google.v.v vVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordCredential(ep epVar) {
        Objects.requireNonNull(epVar);
        this.credential_ = epVar;
        this.credentialCase_ = 1;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"credential_", "credentialCase_", ep.class, et.class});
        }
        if (iOrdinal == 3) {
            return new dm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dl getCredentialCase() {
        int i2 = this.credentialCase_;
        if (i2 == 0) {
            return dl.f48635c;
        }
        if (i2 == 1) {
            return dl.f48633a;
        }
        if (i2 != 2) {
            return null;
        }
        return dl.f48634b;
    }

    public ep getPasswordCredential() {
        return this.credentialCase_ == 1 ? (ep) this.credential_ : ep.getDefaultInstance();
    }

    public et getTokenCredential() {
        return this.credentialCase_ == 2 ? (et) this.credential_ : et.getDefaultInstance();
    }

    public boolean hasPasswordCredential() {
        return this.credentialCase_ == 1;
    }

    public boolean hasTokenCredential() {
        return this.credentialCase_ == 2;
    }

    public static dk newBuilder(dm dmVar) {
        return (dk) DEFAULT_INSTANCE.createBuilder(dmVar);
    }

    public static dm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dm parseFrom(com.google.v.z zVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dm parseFrom(InputStream inputStream) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dm parseFrom(ByteBuffer byteBuffer) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dm parseFrom(byte[] bArr) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
