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
public final class bg extends du<bg, bf> implements fj {
    private static final bg DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile fo<bg> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        bg bgVar = new bg();
        DEFAULT_INSTANCE = bgVar;
        du.registerDefaultInstance(bg.class, bgVar);
    }

    private bg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHash() {
        this.hash_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagSize() {
        this.tagSize_ = 0;
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
    public void setHash(ba baVar) {
        this.hash_ = baVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashValue(int i2) {
        this.hash_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagSize(int i2) {
        this.tagSize_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
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

    public ba getHash() {
        ba baVarA = ba.a(this.hash_);
        return baVarA == null ? ba.UNRECOGNIZED : baVarA;
    }

    public int getHashValue() {
        return this.hash_;
    }

    public int getTagSize() {
        return this.tagSize_;
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
