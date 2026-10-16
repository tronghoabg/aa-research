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
public final class ar extends du<ar, aq> implements fj {
    private static final ar DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile fo<ar> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.v.v keyValue_ = com.google.v.v.f13054a;
    private int version_;

    static {
        ar arVar = new ar();
        DEFAULT_INSTANCE = arVar;
        du.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static ar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aq newBuilder() {
        return (aq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ar parseDelimitedFrom(InputStream inputStream) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(com.google.v.v vVar) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.keyValue_ = vVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
        }
        if (iOrdinal == 3) {
            return new ar();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ar> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ar.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getKeyValue() {
        return this.keyValue_;
    }

    public int getVersion() {
        return this.version_;
    }

    public static aq newBuilder(ar arVar) {
        return (aq) DEFAULT_INSTANCE.createBuilder(arVar);
    }

    public static ar parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(com.google.v.v vVar, de deVar) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ar parseFrom(com.google.v.z zVar) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ar parseFrom(com.google.v.z zVar, de deVar) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ar parseFrom(InputStream inputStream) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(InputStream inputStream, de deVar) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(ByteBuffer byteBuffer) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ar parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ar parseFrom(byte[] bArr) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ar parseFrom(byte[] bArr, de deVar) {
        return (ar) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
