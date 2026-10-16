package com.google.w.g;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends du<g, f> implements h {
    private static final g DEFAULT_INSTANCE;
    public static final int OPERATOR_ID_FIELD_NUMBER = 1;
    private static volatile fo<g> PARSER = null;
    public static final int UID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String operatorId_ = "";
    private String uid_ = "";

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperatorId() {
        this.bitField0_ &= -2;
        this.operatorId_ = getDefaultInstance().getOperatorId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.bitField0_ &= -3;
        this.uid_ = getDefaultInstance().getUid();
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperatorId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.operatorId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperatorIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.operatorId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.uid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUidBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.uid_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "operatorId_", "uid_"});
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

    public String getOperatorId() {
        return this.operatorId_;
    }

    public v getOperatorIdBytes() {
        return v.s(this.operatorId_);
    }

    public String getUid() {
        return this.uid_;
    }

    public v getUidBytes() {
        return v.s(this.uid_);
    }

    public boolean hasOperatorId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUid() {
        return (this.bitField0_ & 2) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(z zVar, de deVar) {
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
