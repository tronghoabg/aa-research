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
public final class g extends du<g, f> implements fj {
    private static final g DEFAULT_INSTANCE;
    private static volatile fo<g> PARSER = null;
    public static final int QR_AUTHENTICATION_TOKEN_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String qrAuthenticationToken_ = "";
    private i.b.ah status_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQrAuthenticationToken() {
        this.bitField0_ &= -2;
        this.qrAuthenticationToken_ = getDefaultInstance().getQrAuthenticationToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -3;
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        i.b.ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != i.b.ah.getDefaultInstance()) {
            i.b.af afVarNewBuilder = i.b.ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((i.b.af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 2;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(com.google.v.v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "qrAuthenticationToken_", "status_"});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getQrAuthenticationToken() {
        return this.qrAuthenticationToken_;
    }

    public com.google.v.v getQrAuthenticationTokenBytes() {
        return com.google.v.v.s(this.qrAuthenticationToken_);
    }

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public boolean hasQrAuthenticationToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(com.google.v.v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(com.google.v.z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(com.google.v.z zVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
