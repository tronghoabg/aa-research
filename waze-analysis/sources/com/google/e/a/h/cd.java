package com.google.e.a.h;

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
/* loaded from: classes4.dex */
public final class cd extends du<cd, cc> implements fj {
    private static final cd DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile fo<cd> PARSER;
    private String keyUri_ = "";

    static {
        cd cdVar = new cd();
        DEFAULT_INSTANCE = cdVar;
        du.registerDefaultInstance(cd.class, cdVar);
    }

    private cd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyUri() {
        this.keyUri_ = getDefaultInstance().getKeyUri();
    }

    public static cd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cc newBuilder() {
        return (cc) DEFAULT_INSTANCE.createBuilder();
    }

    public static cd parseDelimitedFrom(InputStream inputStream) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(com.google.v.v vVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyUri(String str) {
        Objects.requireNonNull(str);
        this.keyUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyUriBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.keyUri_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (iOrdinal == 3) {
            return new cd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getKeyUri() {
        return this.keyUri_;
    }

    public com.google.v.v getKeyUriBytes() {
        return com.google.v.v.s(this.keyUri_);
    }

    public static cc newBuilder(cd cdVar) {
        return (cc) DEFAULT_INSTANCE.createBuilder(cdVar);
    }

    public static cd parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(com.google.v.v vVar, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cd parseFrom(com.google.v.z zVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cd parseFrom(com.google.v.z zVar, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cd parseFrom(InputStream inputStream) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(InputStream inputStream, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(ByteBuffer byteBuffer) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cd parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cd parseFrom(byte[] bArr) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cd parseFrom(byte[] bArr, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
