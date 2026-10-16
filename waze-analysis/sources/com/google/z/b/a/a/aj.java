package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj extends du<aj, ai> implements fj {
    public static final int BUG_ID_FIELD_NUMBER = 1;
    private static final aj DEFAULT_INSTANCE;
    private static volatile fo<aj> PARSER;
    private int bitField0_;
    private long bugId_;

    static {
        aj ajVar = new aj();
        DEFAULT_INSTANCE = ajVar;
        du.registerDefaultInstance(aj.class, ajVar);
    }

    private aj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBugId() {
        this.bitField0_ &= -2;
        this.bugId_ = 0L;
    }

    public static aj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ai newBuilder() {
        return (ai) DEFAULT_INSTANCE.createBuilder();
    }

    public static aj parseDelimitedFrom(InputStream inputStream) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(com.google.v.v vVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBugId(long j2) {
        this.bitField0_ |= 1;
        this.bugId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"bitField0_", "bugId_"});
        }
        if (iOrdinal == 3) {
            return new aj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ai(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBugId() {
        return this.bugId_;
    }

    public boolean hasBugId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ai newBuilder(aj ajVar) {
        return (ai) DEFAULT_INSTANCE.createBuilder(ajVar);
    }

    public static aj parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(com.google.v.v vVar, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aj parseFrom(com.google.v.z zVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aj parseFrom(com.google.v.z zVar, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aj parseFrom(InputStream inputStream) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(InputStream inputStream, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(ByteBuffer byteBuffer) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aj parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aj parseFrom(byte[] bArr) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aj parseFrom(byte[] bArr, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
