package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax extends com.google.v.du<ax, aw> implements com.google.v.fj {
    public static final int CROSS_TIMES_SECONDS_FIELD_NUMBER = 2;
    private static final ax DEFAULT_INSTANCE;
    public static final int FIRST_SEGMENT_INDEX_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ax> PARSER;
    private int bitField0_;
    private com.google.v.ek crossTimesSeconds_ = emptyIntList();
    private int firstSegmentIndex_;

    static {
        ax axVar = new ax();
        DEFAULT_INSTANCE = axVar;
        com.google.v.du.registerDefaultInstance(ax.class, axVar);
    }

    private ax() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCrossTimesSeconds(Iterable<? extends Integer> iterable) {
        ensureCrossTimesSecondsIsMutable();
        com.google.v.c.addAll(iterable, this.crossTimesSeconds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrossTimesSeconds(int i2) {
        ensureCrossTimesSecondsIsMutable();
        this.crossTimesSeconds_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossTimesSeconds() {
        this.crossTimesSeconds_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstSegmentIndex() {
        this.bitField0_ &= -2;
        this.firstSegmentIndex_ = 0;
    }

    private void ensureCrossTimesSecondsIsMutable() {
        com.google.v.ek ekVar = this.crossTimesSeconds_;
        if (ekVar.c()) {
            return;
        }
        this.crossTimesSeconds_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static ax getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aw newBuilder() {
        return (aw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ax parseDelimitedFrom(InputStream inputStream) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(com.google.v.v vVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ax> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossTimesSeconds(int i2, int i3) {
        ensureCrossTimesSecondsIsMutable();
        this.crossTimesSeconds_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSegmentIndex(int i2) {
        this.bitField0_ |= 1;
        this.firstSegmentIndex_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0016", new Object[]{"bitField0_", "firstSegmentIndex_", "crossTimesSeconds_"});
        }
        if (iOrdinal == 3) {
            return new ax();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ax> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ax.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCrossTimesSeconds(int i2) {
        return this.crossTimesSeconds_.d(i2);
    }

    public int getCrossTimesSecondsCount() {
        return this.crossTimesSeconds_.size();
    }

    public List<Integer> getCrossTimesSecondsList() {
        return this.crossTimesSeconds_;
    }

    public int getFirstSegmentIndex() {
        return this.firstSegmentIndex_;
    }

    public boolean hasFirstSegmentIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aw newBuilder(ax axVar) {
        return (aw) DEFAULT_INSTANCE.createBuilder(axVar);
    }

    public static ax parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ax parseFrom(com.google.v.z zVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ax parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ax parseFrom(InputStream inputStream) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(ByteBuffer byteBuffer) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ax parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ax parseFrom(byte[] bArr) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ax parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
