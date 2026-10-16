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
public final class ae extends du<ae, ad> implements fj {
    private static final ae DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile fo<ae> PARSER;
    private int bitField0_;
    private eo<z> events_ = emptyProtobufList();
    private d metadata_;

    static {
        ae aeVar = new ae();
        DEFAULT_INSTANCE = aeVar;
        du.registerDefaultInstance(ae.class, aeVar);
    }

    private ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends z> iterable) {
        ensureEventsIsMutable();
        com.google.v.c.addAll(iterable, this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i2, z zVar) {
        Objects.requireNonNull(zVar);
        ensureEventsIsMutable();
        this.events_.add(i2, zVar);
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
        eo<z> eoVar = this.events_;
        if (eoVar.c()) {
            return;
        }
        this.events_ = du.mutableCopy(eoVar);
    }

    public static ae getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.metadata_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.metadata_ = dVar;
        this.bitField0_ |= 1;
    }

    public static ad newBuilder() {
        return (ad) DEFAULT_INSTANCE.createBuilder();
    }

    public static ae parseDelimitedFrom(InputStream inputStream) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(com.google.v.v vVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ae> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i2) {
        ensureEventsIsMutable();
        this.events_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i2, z zVar) {
        Objects.requireNonNull(zVar);
        ensureEventsIsMutable();
        this.events_.set(i2, zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(d dVar) {
        Objects.requireNonNull(dVar);
        this.metadata_ = dVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "events_", z.class, "metadata_"});
        }
        if (iOrdinal == 3) {
            return new ae();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ad(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ae> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ae.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public z getEvents(int i2) {
        return this.events_.get(i2);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<z> getEventsList() {
        return this.events_;
    }

    public aa getEventsOrBuilder(int i2) {
        return this.events_.get(i2);
    }

    public List<? extends aa> getEventsOrBuilderList() {
        return this.events_;
    }

    public d getMetadata() {
        d dVar = this.metadata_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ad newBuilder(ae aeVar) {
        return (ad) DEFAULT_INSTANCE.createBuilder(aeVar);
    }

    public static ae parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(com.google.v.v vVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ae parseFrom(com.google.v.z zVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ae parseFrom(com.google.v.z zVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(z zVar) {
        Objects.requireNonNull(zVar);
        ensureEventsIsMutable();
        this.events_.add(zVar);
    }

    public static ae parseFrom(InputStream inputStream) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(InputStream inputStream, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(ByteBuffer byteBuffer) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ae parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ae parseFrom(byte[] bArr) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ae parseFrom(byte[] bArr, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
