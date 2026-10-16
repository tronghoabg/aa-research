package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fl extends com.google.v.du<fl, fj> implements com.google.v.fj {
    private static final fl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fl> PARSER = null;
    public static final int SIGNAL_FIELD_NUMBER = 13;
    public static final int SIGNAL_MIXER_TYPE_FIELD_NUMBER = 16;
    private int bitField0_;
    private int signalMixerType_;
    private com.google.v.eo<fo> signal_ = emptyProtobufList();

    static {
        fl flVar = new fl();
        DEFAULT_INSTANCE = flVar;
        com.google.v.du.registerDefaultInstance(fl.class, flVar);
    }

    private fl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSignal(Iterable<? extends fo> iterable) {
        ensureSignalIsMutable();
        com.google.v.c.addAll(iterable, this.signal_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSignal(int i2, fo foVar) {
        Objects.requireNonNull(foVar);
        ensureSignalIsMutable();
        this.signal_.add(i2, foVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignal() {
        this.signal_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignalMixerType() {
        this.bitField0_ &= -2;
        this.signalMixerType_ = 0;
    }

    private void ensureSignalIsMutable() {
        com.google.v.eo<fo> eoVar = this.signal_;
        if (eoVar.c()) {
            return;
        }
        this.signal_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fj newBuilder() {
        return (fj) DEFAULT_INSTANCE.createBuilder();
    }

    public static fl parseDelimitedFrom(InputStream inputStream) {
        return (fl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fl parseFrom(com.google.v.v vVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSignal(int i2) {
        ensureSignalIsMutable();
        this.signal_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignal(int i2, fo foVar) {
        Objects.requireNonNull(foVar);
        ensureSignalIsMutable();
        this.signal_.set(i2, foVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignalMixerType(fk fkVar) {
        this.signalMixerType_ = fkVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\r\u0010\u0002\u0000\u0001\u0000\r\u001b\u0010᠌\u0000", new Object[]{"bitField0_", "signal_", fo.class, "signalMixerType_", dq.f11274f});
        }
        if (iOrdinal == 3) {
            return new fl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fo getSignal(int i2) {
        return this.signal_.get(i2);
    }

    public int getSignalCount() {
        return this.signal_.size();
    }

    public List<fo> getSignalList() {
        return this.signal_;
    }

    public fk getSignalMixerType() {
        fk fkVarA = fk.a(this.signalMixerType_);
        return fkVarA == null ? fk.MIXER_INVALID : fkVarA;
    }

    public fp getSignalOrBuilder(int i2) {
        return this.signal_.get(i2);
    }

    public List<? extends fp> getSignalOrBuilderList() {
        return this.signal_;
    }

    public boolean hasSignalMixerType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fj newBuilder(fl flVar) {
        return (fj) DEFAULT_INSTANCE.createBuilder(flVar);
    }

    public static fl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fl parseFrom(com.google.v.z zVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSignal(fo foVar) {
        Objects.requireNonNull(foVar);
        ensureSignalIsMutable();
        this.signal_.add(foVar);
    }

    public static fl parseFrom(InputStream inputStream) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fl parseFrom(ByteBuffer byteBuffer) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fl parseFrom(byte[] bArr) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
