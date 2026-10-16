package com.waze.n;

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
public final class i extends du<i, h> implements fj {
    public static final int APP_FIELD_NUMBER = 1;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 2;
    private static final i DEFAULT_INSTANCE;
    private static volatile fo<i> PARSER;
    private int app_;
    private int bitField0_;
    private String clientVersion_ = "";

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApp() {
        this.bitField0_ &= -2;
        this.app_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientVersion() {
        this.bitField0_ &= -3;
        this.clientVersion_ = getDefaultInstance().getClientVersion();
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void setApp(g gVar) {
        this.app_ = gVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppValue(int i2) {
        this.bitField0_ |= 1;
        this.app_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.clientVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.clientVersion_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "app_", "clientVersion_"});
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

    public g getApp() {
        int i2 = this.app_;
        g gVar = i2 != 0 ? i2 != 1 ? i2 != 3 ? null : g.WAZE_AAOS : g.WAZE : g.APP_UNSPECIFIED;
        return gVar == null ? g.UNRECOGNIZED : gVar;
    }

    public int getAppValue() {
        return this.app_;
    }

    public String getClientVersion() {
        return this.clientVersion_;
    }

    public com.google.v.v getClientVersionBytes() {
        return com.google.v.v.s(this.clientVersion_);
    }

    public boolean hasApp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClientVersion() {
        return (this.bitField0_ & 2) != 0;
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
