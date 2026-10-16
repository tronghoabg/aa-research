package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class at extends du<at, as> implements fj {
    private static final at DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile fo<at> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        at atVar = new at();
        DEFAULT_INSTANCE = atVar;
        du.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeySize() {
        this.keySize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static at getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static as newBuilder() {
        return (as) DEFAULT_INSTANCE.createBuilder();
    }

    public static at parseDelimitedFrom(InputStream inputStream) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(com.google.v.v vVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<at> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeySize(int i2) {
        this.keySize_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i2) {
        this.version_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
        }
        if (iOrdinal == 3) {
            return new at();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new as(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<at> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (at.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getKeySize() {
        return this.keySize_;
    }

    public int getVersion() {
        return this.version_;
    }

    public static as newBuilder(at atVar) {
        return (as) DEFAULT_INSTANCE.createBuilder(atVar);
    }

    public static at parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(com.google.v.v vVar, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static at parseFrom(com.google.v.z zVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static at parseFrom(com.google.v.z zVar, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static at parseFrom(InputStream inputStream) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(InputStream inputStream, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(ByteBuffer byteBuffer) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static at parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static at parseFrom(byte[] bArr) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static at parseFrom(byte[] bArr, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
