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
public final class m extends du<m, l> implements fj {
    public static final int AUTHENTICATION_TOKEN_FIELD_NUMBER = 1;
    public static final int CLIENT_INFO_FIELD_NUMBER = 2;
    private static final m DEFAULT_INSTANCE;
    private static volatile fo<m> PARSER;
    private String authenticationToken_ = "";
    private int bitField0_;
    private ao clientInfo_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthenticationToken() {
        this.bitField0_ &= -2;
        this.authenticationToken_ = getDefaultInstance().getAuthenticationToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfo_ = null;
        this.bitField0_ &= -3;
    }

    public static m getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthenticationToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.authenticationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthenticationTokenBytes(com.google.v.v vVar) {
        this.authenticationToken_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.clientInfo_ = aoVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "authenticationToken_", "clientInfo_"});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAuthenticationToken() {
        return this.authenticationToken_;
    }

    public com.google.v.v getAuthenticationTokenBytes() {
        return com.google.v.v.s(this.authenticationToken_);
    }

    public ao getClientInfo() {
        ao aoVar = this.clientInfo_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public boolean hasAuthenticationToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClientInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
