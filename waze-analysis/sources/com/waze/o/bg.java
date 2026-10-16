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
public final class bg extends du<bg, bf> implements fj {
    private static final bg DEFAULT_INSTANCE;
    public static final int IS_SUCCESSFUL_FIELD_NUMBER = 1;
    private static volatile fo<bg> PARSER;
    private int bitField0_;
    private boolean isSuccessful_;

    static {
        bg bgVar = new bg();
        DEFAULT_INSTANCE = bgVar;
        du.registerDefaultInstance(bg.class, bgVar);
    }

    private bg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSuccessful() {
        this.bitField0_ &= -2;
        this.isSuccessful_ = false;
    }

    public static bg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bf newBuilder() {
        return (bf) DEFAULT_INSTANCE.createBuilder();
    }

    public static bg parseDelimitedFrom(InputStream inputStream) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(com.google.v.v vVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bg> parser() {
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
            return new bg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bg.class) {
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

    public static bf newBuilder(bg bgVar) {
        return (bf) DEFAULT_INSTANCE.createBuilder(bgVar);
    }

    public static bg parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(com.google.v.v vVar, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bg parseFrom(com.google.v.z zVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bg parseFrom(com.google.v.z zVar, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bg parseFrom(InputStream inputStream) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(InputStream inputStream, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(ByteBuffer byteBuffer) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bg parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bg parseFrom(byte[] bArr) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bg parseFrom(byte[] bArr, de deVar) {
        return (bg) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
