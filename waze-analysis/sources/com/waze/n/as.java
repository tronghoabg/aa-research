package com.waze.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class as extends du<as, ar> implements fj {
    private static final as DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile fo<as> PARSER;
    private int bitField0_;
    private eo<am> events_ = emptyProtobufList();
    private x metadata_;

    static {
        as asVar = new as();
        DEFAULT_INSTANCE = asVar;
        du.registerDefaultInstance(as.class, asVar);
    }

    private as() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends am> iterable) {
        ensureEventsIsMutable();
        com.google.v.c.addAll(iterable, this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i2, am amVar) {
        Objects.requireNonNull(amVar);
        ensureEventsIsMutable();
        this.events_.add(i2, amVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureEventsIsMutable() {
        eo<am> eoVar = this.events_;
        if (eoVar.c()) {
            return;
        }
        this.events_ = du.mutableCopy(eoVar);
    }

    public static as getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(x xVar) {
        Objects.requireNonNull(xVar);
        x xVar2 = this.metadata_;
        if (xVar2 != null && xVar2 != x.getDefaultInstance()) {
            w wVarNewBuilder = x.newBuilder(xVar2);
            wVarNewBuilder.mergeFrom((w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.metadata_ = xVar;
        this.bitField0_ |= 1;
    }

    public static ar newBuilder() {
        return (ar) DEFAULT_INSTANCE.createBuilder();
    }

    public static as parseDelimitedFrom(InputStream inputStream) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(com.google.v.v vVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<as> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i2) {
        ensureEventsIsMutable();
        this.events_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i2, am amVar) {
        Objects.requireNonNull(amVar);
        ensureEventsIsMutable();
        this.events_.set(i2, amVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(x xVar) {
        Objects.requireNonNull(xVar);
        this.metadata_ = xVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "events_", am.class, "metadata_"});
        }
        if (iOrdinal == 3) {
            return new as();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ar(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<as> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (as.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public am getEvents(int i2) {
        return this.events_.get(i2);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<am> getEventsList() {
        return this.events_;
    }

    public an getEventsOrBuilder(int i2) {
        return this.events_.get(i2);
    }

    public List<? extends an> getEventsOrBuilderList() {
        return this.events_;
    }

    public x getMetadata() {
        x xVar = this.metadata_;
        return xVar == null ? x.getDefaultInstance() : xVar;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ar newBuilder(as asVar) {
        return (ar) DEFAULT_INSTANCE.createBuilder(asVar);
    }

    public static as parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(com.google.v.v vVar, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static as parseFrom(com.google.v.z zVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static as parseFrom(com.google.v.z zVar, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(am amVar) {
        Objects.requireNonNull(amVar);
        ensureEventsIsMutable();
        this.events_.add(amVar);
    }

    public static as parseFrom(InputStream inputStream) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(InputStream inputStream, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(ByteBuffer byteBuffer) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static as parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static as parseFrom(byte[] bArr) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static as parseFrom(byte[] bArr, de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
