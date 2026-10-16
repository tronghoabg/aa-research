package com.waze.o;

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
public final class au extends du<au, at> implements fj {
    private static final au DEFAULT_INSTANCE;
    public static final int IS_SUCCESSFUL_FIELD_NUMBER = 1;
    private static volatile fo<au> PARSER;
    private int bitField0_;
    private boolean isSuccessful_;

    static {
        au auVar = new au();
        DEFAULT_INSTANCE = auVar;
        du.registerDefaultInstance(au.class, auVar);
    }

    private au() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSuccessful() {
        this.bitField0_ &= -2;
        this.isSuccessful_ = false;
    }

    public static au getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static at newBuilder() {
        return (at) DEFAULT_INSTANCE.createBuilder();
    }

    public static au parseDelimitedFrom(InputStream inputStream) {
        return (au) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static au parseFrom(com.google.v.v vVar) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<au> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSuccessful(boolean z) {
        this.bitField0_ |= 1;
        this.isSuccessful_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isSuccessful_"});
        }
        if (iOrdinal == 3) {
            return new au();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new at(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<au> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (au.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsSuccessful() {
        return this.isSuccessful_;
    }

    public boolean hasIsSuccessful() {
        return (this.bitField0_ & 1) != 0;
    }

    public static at newBuilder(au auVar) {
        return (at) DEFAULT_INSTANCE.createBuilder(auVar);
    }

    public static au parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (au) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static au parseFrom(com.google.v.v vVar, de deVar) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static au parseFrom(com.google.v.z zVar) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static au parseFrom(com.google.v.z zVar, de deVar) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static au parseFrom(InputStream inputStream) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static au parseFrom(InputStream inputStream, de deVar) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static au parseFrom(ByteBuffer byteBuffer) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static au parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static au parseFrom(byte[] bArr) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static au parseFrom(byte[] bArr, de deVar) {
        return (au) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
