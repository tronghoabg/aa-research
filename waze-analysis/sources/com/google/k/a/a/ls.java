package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ls extends com.google.v.du<ls, lp> implements com.google.v.fj {
    private static final ls DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ls> PARSER = null;
    public static final int SPEED_FIELD_NUMBER = 1;
    public static final int UNIT_FIELD_NUMBER = 2;
    private int bitField0_;
    private float speed_;
    private int unit_;

    static {
        ls lsVar = new ls();
        DEFAULT_INSTANCE = lsVar;
        com.google.v.du.registerDefaultInstance(ls.class, lsVar);
    }

    private ls() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.bitField0_ &= -2;
        this.speed_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.bitField0_ &= -3;
        this.unit_ = 0;
    }

    public static ls getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lp newBuilder() {
        return (lp) DEFAULT_INSTANCE.createBuilder();
    }

    public static ls parseDelimitedFrom(InputStream inputStream) {
        return (ls) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ls parseFrom(com.google.v.v vVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ls> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f2) {
        this.bitField0_ |= 1;
        this.speed_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(lr lrVar) {
        this.unit_ = lrVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "speed_", "unit_", lq.f12088a});
        }
        if (iOrdinal == 3) {
            return new ls();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ls> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ls.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getSpeed() {
        return this.speed_;
    }

    public lr getUnit() {
        lr lrVarA = lr.a(this.unit_);
        return lrVarA == null ? lr.UNIT_UNKNOWN : lrVarA;
    }

    public boolean hasSpeed() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    public static lp newBuilder(ls lsVar) {
        return (lp) DEFAULT_INSTANCE.createBuilder(lsVar);
    }

    public static ls parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ls) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ls parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ls parseFrom(com.google.v.z zVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ls parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ls parseFrom(InputStream inputStream) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ls parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ls parseFrom(ByteBuffer byteBuffer) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ls parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ls parseFrom(byte[] bArr) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ls parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ls) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
