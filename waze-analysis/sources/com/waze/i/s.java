package com.waze.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import i.b.l.ao;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends du<s, q> implements fj {
    public static final int CLIENT_INFO_FIELD_NUMBER = 3;
    private static final s DEFAULT_INSTANCE;
    private static volatile fo<s> PARSER = null;
    public static final int PASSWORD_CREDENTIAL_FIELD_NUMBER = 2;
    public static final int REFRESH_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private ao clientInfo_;
    private int credentialCase_ = 0;
    private Object credential_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfo_ = null;
        this.bitField0_ &= -2;
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

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.clientInfo_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            i.b.l.aj ajVarNewBuilder = ao.newBuilder(aoVar2);
            ajVarNewBuilder.mergeFrom((i.b.l.aj) aoVar);
            aoVar = ajVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = aoVar;
        this.bitField0_ |= 1;
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

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.clientInfo_ = aoVar;
        this.bitField0_ |= 1;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{"credential_", "credentialCase_", "bitField0_", ae.class, "clientInfo_"});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ao getClientInfo() {
        ao aoVar = this.clientInfo_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public r getCredentialCase() {
        int i2 = this.credentialCase_;
        if (i2 == 0) {
            return r.f24440c;
        }
        if (i2 == 1) {
            return r.f24438a;
        }
        if (i2 != 2) {
            return null;
        }
        return r.f24439b;
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

    public boolean hasClientInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPasswordCredential() {
        return this.credentialCase_ == 2;
    }

    public boolean hasRefreshToken() {
        return this.credentialCase_ == 1;
    }

    public static q newBuilder(s sVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
