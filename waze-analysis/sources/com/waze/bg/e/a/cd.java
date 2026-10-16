package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd extends com.google.v.du<cd, cc> implements com.google.v.fj {
    private static final cd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cd> PARSER = null;
    public static final int TRAFFIC_JAMS_FIELD_NUMBER = 1;
    private com.google.v.eo<ik> trafficJams_ = emptyProtobufList();

    static {
        cd cdVar = new cd();
        DEFAULT_INSTANCE = cdVar;
        com.google.v.du.registerDefaultInstance(cd.class, cdVar);
    }

    private cd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrafficJams(Iterable<? extends ik> iterable) {
        ensureTrafficJamsIsMutable();
        com.google.v.c.addAll(iterable, this.trafficJams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficJams(int i2, ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.add(i2, ikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficJams() {
        this.trafficJams_ = emptyProtobufList();
    }

    private void ensureTrafficJamsIsMutable() {
        com.google.v.eo<ik> eoVar = this.trafficJams_;
        if (eoVar.c()) {
            return;
        }
        this.trafficJams_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cc newBuilder() {
        return (cc) DEFAULT_INSTANCE.createBuilder();
    }

    public static cd parseDelimitedFrom(InputStream inputStream) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(com.google.v.v vVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrafficJams(int i2) {
        ensureTrafficJamsIsMutable();
        this.trafficJams_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficJams(int i2, ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.set(i2, ikVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"trafficJams_", ik.class});
        }
        if (iOrdinal == 3) {
            return new cd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ik getTrafficJams(int i2) {
        return this.trafficJams_.get(i2);
    }

    public int getTrafficJamsCount() {
        return this.trafficJams_.size();
    }

    public List<ik> getTrafficJamsList() {
        return this.trafficJams_;
    }

    public il getTrafficJamsOrBuilder(int i2) {
        return this.trafficJams_.get(i2);
    }

    public List<? extends il> getTrafficJamsOrBuilderList() {
        return this.trafficJams_;
    }

    public static cc newBuilder(cd cdVar) {
        return (cc) DEFAULT_INSTANCE.createBuilder(cdVar);
    }

    public static cd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cd parseFrom(com.google.v.z zVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficJams(ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.add(ikVar);
    }

    public static cd parseFrom(InputStream inputStream) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(ByteBuffer byteBuffer) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cd parseFrom(byte[] bArr) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
