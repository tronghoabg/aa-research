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
public final class f extends du<f, e> implements fj {
    public static final int CLIENT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 5;
    private static final f DEFAULT_INSTANCE;
    private static volatile fo<f> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int STEALTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean stealth_;
    private String clientSessionId_ = "";
    private String sessionId_ = "";
    private String clientVersion_ = "";

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientSessionId() {
        this.bitField0_ &= -2;
        this.clientSessionId_ = getDefaultInstance().getClientSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientVersion() {
        this.bitField0_ &= -9;
        this.clientVersion_ = getDefaultInstance().getClientVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStealth() {
        this.bitField0_ &= -5;
        this.stealth_ = false;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(com.google.v.v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSessionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.clientSessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSessionIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.clientSessionId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.clientVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.clientVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.sessionId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStealth(boolean z) {
        this.bitField0_ |= 4;
        this.stealth_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0003ለ\u0001\u0004ဇ\u0002\u0005ለ\u0003", new Object[]{"bitField0_", "clientSessionId_", "sessionId_", "stealth_", "clientVersion_"});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getClientSessionId() {
        return this.clientSessionId_;
    }

    public com.google.v.v getClientSessionIdBytes() {
        return com.google.v.v.s(this.clientSessionId_);
    }

    public String getClientVersion() {
        return this.clientVersion_;
    }

    public com.google.v.v getClientVersionBytes() {
        return com.google.v.v.s(this.clientVersion_);
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public com.google.v.v getSessionIdBytes() {
        return com.google.v.v.s(this.sessionId_);
    }

    public boolean getStealth() {
        return this.stealth_;
    }

    public boolean hasClientSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClientVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStealth() {
        return (this.bitField0_ & 4) != 0;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(com.google.v.v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(com.google.v.z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(com.google.v.z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
