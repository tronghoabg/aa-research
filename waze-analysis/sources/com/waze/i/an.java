package com.waze.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an extends du<an, al> implements fj {
    private static final an DEFAULT_INSTANCE;
    private static volatile fo<an> PARSER = null;
    public static final int PASSWORD_CREDENTIAL_FIELD_NUMBER = 2;
    public static final int REFRESH_TOKEN_FIELD_NUMBER = 1;
    private int credentialCase_ = 0;
    private Object credential_;

    static {
        an anVar = new an();
        DEFAULT_INSTANCE = anVar;
        du.registerDefaultInstance(an.class, anVar);
    }

    private an() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredential() {
        this.credentialCase_ = 0;
        this.credential_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPasswordCredential() {
        if (this.credentialCase_ == 2) {
            this.credentialCase_ = 0;
            this.credential_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshToken() {
        if (this.credentialCase_ == 1) {
            this.credentialCase_ = 0;
            this.credential_ = null;
        }
    }

    public static an getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePasswordCredential(ae aeVar) {
        Objects.requireNonNull(aeVar);
        if (this.credentialCase_ == 2 && this.credential_ != ae.getDefaultInstance()) {
            ad adVarNewBuilder = ae.newBuilder((ae) this.credential_);
            adVarNewBuilder.mergeFrom((ad) aeVar);
            aeVar = adVarNewBuilder.buildPartial();
        }
        this.credential_ = aeVar;
        this.credentialCase_ = 2;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static an parseDelimitedFrom(InputStream inputStream) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(com.google.v.v vVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<an> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordCredential(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.credential_ = aeVar;
        this.credentialCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshToken(String str) {
        Objects.requireNonNull(str);
        this.credentialCase_ = 1;
        this.credential_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshTokenBytes(com.google.v.v vVar) {
        this.credential_ = vVar.u();
        this.credentialCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"credential_", "credentialCase_", ae.class});
        }
        if (iOrdinal == 3) {
            return new an();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<an> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (an.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public am getCredentialCase() {
        int i2 = this.credentialCase_;
        if (i2 == 0) {
            return am.f24423c;
        }
        if (i2 == 1) {
            return am.f24421a;
        }
        if (i2 != 2) {
            return null;
        }
        return am.f24422b;
    }

    public ae getPasswordCredential() {
        return this.credentialCase_ == 2 ? (ae) this.credential_ : ae.getDefaultInstance();
    }

    public String getRefreshToken() {
        return this.credentialCase_ == 1 ? (String) this.credential_ : "";
    }

    public com.google.v.v getRefreshTokenBytes() {
        return com.google.v.v.s(this.credentialCase_ == 1 ? (String) this.credential_ : "");
    }

    public boolean hasPasswordCredential() {
        return this.credentialCase_ == 2;
    }

    public boolean hasRefreshToken() {
        return this.credentialCase_ == 1;
    }

    public static al newBuilder(an anVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(anVar);
    }

    public static an parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(com.google.v.v vVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static an parseFrom(com.google.v.z zVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static an parseFrom(com.google.v.z zVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static an parseFrom(InputStream inputStream) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(InputStream inputStream, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(ByteBuffer byteBuffer) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static an parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static an parseFrom(byte[] bArr) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static an parseFrom(byte[] bArr, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
