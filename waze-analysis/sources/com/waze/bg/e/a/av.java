package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class av extends com.google.v.du<av, au> implements com.google.v.fj {
    public static final int ALERTS_FIELD_NUMBER = 1;
    private static final av DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<av> PARSER;
    private com.google.v.eo<ie> alerts_ = emptyProtobufList();

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        com.google.v.du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerts(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureAlertsIsMutable();
        this.alerts_.add(i2, ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlerts(Iterable<? extends ie> iterable) {
        ensureAlertsIsMutable();
        com.google.v.c.addAll(iterable, this.alerts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerts() {
        this.alerts_ = emptyProtobufList();
    }

    private void ensureAlertsIsMutable() {
        com.google.v.eo<ie> eoVar = this.alerts_;
        if (eoVar.c()) {
            return;
        }
        this.alerts_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlerts(int i2) {
        ensureAlertsIsMutable();
        this.alerts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerts(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureAlertsIsMutable();
        this.alerts_.set(i2, ieVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alerts_", ie.class});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ie getAlerts(int i2) {
        return this.alerts_.get(i2);
    }

    public int getAlertsCount() {
        return this.alerts_.size();
    }

    public List<ie> getAlertsList() {
        return this.alerts_;
    }

    public Cif getAlertsOrBuilder(int i2) {
        return this.alerts_.get(i2);
    }

    public List<? extends Cif> getAlertsOrBuilderList() {
        return this.alerts_;
    }

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerts(ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureAlertsIsMutable();
        this.alerts_.add(ieVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
