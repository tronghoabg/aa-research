package com.waze.ak;

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
public final class ar extends du<ar, ap> implements fj {
    private static final ar DEFAULT_INSTANCE;
    public static final int DETACHED_FROM_ACTUAL_TURN_FIELD_NUMBER = 2;
    public static final int GUIDANCE_INSTRUCTION_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<ar> PARSER;
    private int bitField0_;
    private boolean detachedFromActualTurn_;
    private int guidanceInstruction_;
    private long id_;

    static {
        ar arVar = new ar();
        DEFAULT_INSTANCE = arVar;
        du.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetachedFromActualTurn() {
        this.bitField0_ &= -3;
        this.detachedFromActualTurn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidanceInstruction() {
        this.bitField0_ &= -5;
        this.guidanceInstruction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    public static ar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
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
    public void setDetachedFromActualTurn(boolean z) {
        this.bitField0_ |= 2;
        this.detachedFromActualTurn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceInstruction(aq aqVar) {
        this.guidanceInstruction_ = aqVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceInstructionValue(int i2) {
        this.bitField0_ |= 4;
        this.guidanceInstruction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "id_", "detachedFromActualTurn_", "guidanceInstruction_"});
        }
        if (iOrdinal == 3) {
            return new ar();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ap(bArr);
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

    public boolean getDetachedFromActualTurn() {
        return this.detachedFromActualTurn_;
    }

    public aq getGuidanceInstruction() {
        int i2 = this.guidanceInstruction_;
        aq aqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aq.AFTER : aq.AT : aq.NONE : aq.GUIDANCE_INSTRUCTION_UNSPECIFIED;
        return aqVar == null ? aq.UNRECOGNIZED : aqVar;
    }

    public int getGuidanceInstructionValue() {
        return this.guidanceInstruction_;
    }

    public long getId() {
        return this.id_;
    }

    public boolean hasDetachedFromActualTurn() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGuidanceInstruction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ap newBuilder(ar arVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(arVar);
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
