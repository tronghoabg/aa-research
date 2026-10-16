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
public final class i extends du<i, h> implements fj {
    public static final int CLIENT_INFO_FIELD_NUMBER = 3;
    private static final i DEFAULT_INSTANCE;
    public static final int GET_TOKEN_REQUEST_FIELD_NUMBER = 2;
    private static volatile fo<i> PARSER = null;
    public static final int QR_AUTHENTICATION_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private ao clientInfo_;
    private s getTokenRequest_;
    private String qrAuthenticationToken_ = "";

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetTokenRequest() {
        this.getTokenRequest_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQrAuthenticationToken() {
        this.bitField0_ &= -2;
        this.qrAuthenticationToken_ = getDefaultInstance().getQrAuthenticationToken();
    }

    public static i getDefaultInstance() {
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
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGetTokenRequest(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.getTokenRequest_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            q qVarNewBuilder = s.newBuilder(sVar2);
            qVarNewBuilder.mergeFrom((q) sVar);
            sVar = qVarNewBuilder.buildPartial();
        }
        this.getTokenRequest_ = sVar;
        this.bitField0_ |= 2;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(com.google.v.v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInfo(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.clientInfo_ = aoVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetTokenRequest(s sVar) {
        Objects.requireNonNull(sVar);
        this.getTokenRequest_ = sVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQrAuthenticationToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.qrAuthenticationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQrAuthenticationTokenBytes(com.google.v.v vVar) {
        this.qrAuthenticationToken_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "qrAuthenticationToken_", "getTokenRequest_", "clientInfo_"});
        }
        if (iOrdinal == 3) {
            return new i();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
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

    public s getGetTokenRequest() {
        s sVar = this.getTokenRequest_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public String getQrAuthenticationToken() {
        return this.qrAuthenticationToken_;
    }

    public com.google.v.v getQrAuthenticationTokenBytes() {
        return com.google.v.v.s(this.qrAuthenticationToken_);
    }

    public boolean hasClientInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGetTokenRequest() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasQrAuthenticationToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static h newBuilder(i iVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(com.google.v.v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(com.google.v.z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(com.google.v.z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
