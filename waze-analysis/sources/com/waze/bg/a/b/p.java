package com.waze.bg.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends du<p, n> implements fj {
    public static final int ALERT_REPORTED_DETAILS_FIELD_NUMBER = 1;
    private static final p DEFAULT_INSTANCE;
    private static volatile fo<p> PARSER;
    private int fulfillmentDetailsCase_ = 0;
    private Object fulfillmentDetails_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertReportedDetails() {
        if (this.fulfillmentDetailsCase_ == 1) {
            this.fulfillmentDetailsCase_ = 0;
            this.fulfillmentDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFulfillmentDetails() {
        this.fulfillmentDetailsCase_ = 0;
        this.fulfillmentDetails_ = null;
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertReportedDetails(com.waze.bg.a.b.a.b bVar) {
        Objects.requireNonNull(bVar);
        if (this.fulfillmentDetailsCase_ == 1 && this.fulfillmentDetails_ != com.waze.bg.a.b.a.b.getDefaultInstance()) {
            com.waze.bg.a.b.a.a aVarNewBuilder = com.waze.bg.a.b.a.b.newBuilder((com.waze.bg.a.b.a.b) this.fulfillmentDetails_);
            aVarNewBuilder.mergeFrom((com.waze.bg.a.b.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.fulfillmentDetails_ = bVar;
        this.fulfillmentDetailsCase_ = 1;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertReportedDetails(com.waze.bg.a.b.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.fulfillmentDetails_ = bVar;
        this.fulfillmentDetailsCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"fulfillmentDetails_", "fulfillmentDetailsCase_", com.waze.bg.a.b.a.b.class});
        }
        if (iOrdinal == 3) {
            return new p();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<p> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (p.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.b.a.b getAlertReportedDetails() {
        return this.fulfillmentDetailsCase_ == 1 ? (com.waze.bg.a.b.a.b) this.fulfillmentDetails_ : com.waze.bg.a.b.a.b.getDefaultInstance();
    }

    public o getFulfillmentDetailsCase() {
        int i2 = this.fulfillmentDetailsCase_;
        if (i2 == 0) {
            return o.f16356b;
        }
        if (i2 != 1) {
            return null;
        }
        return o.f16355a;
    }

    public boolean hasAlertReportedDetails() {
        return this.fulfillmentDetailsCase_ == 1;
    }

    public static n newBuilder(p pVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(z zVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
