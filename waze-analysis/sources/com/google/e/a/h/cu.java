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
public final class cu extends du<cu, ct> implements fj {
    private static final cu DEFAULT_INSTANCE;
    private static volatile fo<cu> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        cu cuVar = new cu();
        DEFAULT_INSTANCE = cuVar;
        du.registerDefaultInstance(cu.class, cuVar);
    }

    private cu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static cu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ct newBuilder() {
        return (ct) DEFAULT_INSTANCE.createBuilder();
    }

    public static cu parseDelimitedFrom(InputStream inputStream) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(com.google.v.v vVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
        }
        if (iOrdinal == 3) {
            return new cu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ct(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getVersion() {
        return this.version_;
    }

    public static ct newBuilder(cu cuVar) {
        return (ct) DEFAULT_INSTANCE.createBuilder(cuVar);
    }

    public static cu parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(com.google.v.v vVar, de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cu parseFrom(com.google.v.z zVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cu parseFrom(com.google.v.z zVar, de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cu parseFrom(InputStream inputStream) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(InputStream inputStream, de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(ByteBuffer byteBuffer) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cu parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cu parseFrom(byte[] bArr) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cu parseFrom(byte[] bArr, de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
