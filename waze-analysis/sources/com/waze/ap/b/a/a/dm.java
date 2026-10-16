package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dm extends com.google.v.du<dm, dl> implements fj {
    private static final dm DEFAULT_INSTANCE;
    public static final int IS_ACTIVE_FIELD_NUMBER = 1;
    private static volatile fo<dm> PARSER;
    private int bitField0_;
    private boolean isActive_;

    static {
        dm dmVar = new dm();
        DEFAULT_INSTANCE = dmVar;
        com.google.v.du.registerDefaultInstance(dm.class, dmVar);
    }

    private dm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsActive() {
        this.bitField0_ &= -2;
        this.isActive_ = false;
    }

    public static dm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dl newBuilder() {
        return (dl) DEFAULT_INSTANCE.createBuilder();
    }

    public static dm parseDelimitedFrom(InputStream inputStream) {
        return (dm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dm parseFrom(com.google.v.v vVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsActive(boolean z) {
        this.bitField0_ |= 1;
        this.isActive_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isActive_"});
        }
        if (iOrdinal == 3) {
            return new dm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsActive() {
        return this.isActive_;
    }

    public boolean hasIsActive() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dl newBuilder(dm dmVar) {
        return (dl) DEFAULT_INSTANCE.createBuilder(dmVar);
    }

    public static dm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dm parseFrom(com.google.v.z zVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dm parseFrom(InputStream inputStream) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dm parseFrom(ByteBuffer byteBuffer) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dm parseFrom(byte[] bArr) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
