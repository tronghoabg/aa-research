package com.waze.bg.a;

import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r extends com.google.v.du<r, q> implements fj {
    private static final r DEFAULT_INSTANCE;
    private static volatile fo<r> PARSER = null;
    public static final int REPORTING_SOURCES_FIELD_NUMBER = 1;
    private static final el<p> reportingSources_converter_ = new n(0);
    private ek reportingSources_ = emptyIntList();

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.v.du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReportingSources(Iterable<? extends p> iterable) {
        ensureReportingSourcesIsMutable();
        Iterator<? extends p> it = iterable.iterator();
        while (it.hasNext()) {
            this.reportingSources_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReportingSources(p pVar) {
        Objects.requireNonNull(pVar);
        ensureReportingSourcesIsMutable();
        this.reportingSources_.i(pVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingSources() {
        this.reportingSources_ = emptyIntList();
    }

    private void ensureReportingSourcesIsMutable() {
        ek ekVar = this.reportingSources_;
        if (ekVar.c()) {
            return;
        }
        this.reportingSources_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingSources(int i2, p pVar) {
        Objects.requireNonNull(pVar);
        ensureReportingSourcesIsMutable();
        this.reportingSources_.e(i2, pVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"reportingSources_", o.f16555a});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public p getReportingSources(int i2) {
        p pVarA = p.a(this.reportingSources_.d(i2));
        return pVarA == null ? p.ALERT_REPORTING_SOURCE_UNKNOWN : pVarA;
    }

    public int getReportingSourcesCount() {
        return this.reportingSources_.size();
    }

    public List<p> getReportingSourcesList() {
        return new em(this.reportingSources_, reportingSources_converter_);
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
