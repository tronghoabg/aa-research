package com.waze.ak;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae extends du<ae, ad> implements fj {
    private static final ae DEFAULT_INSTANCE;
    private static volatile fo<ae> PARSER = null;
    public static final int VENUE_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String venueName_ = "";

    static {
        ae aeVar = new ae();
        DEFAULT_INSTANCE = aeVar;
        du.registerDefaultInstance(ae.class, aeVar);
    }

    private ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueName() {
        this.bitField0_ &= -2;
        this.venueName_ = getDefaultInstance().getVenueName();
    }

    public static ae getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void setVenueName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.venueName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueNameBytes(com.google.v.v vVar) {
        this.venueName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "venueName_"});
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

    public String getVenueName() {
        return this.venueName_;
    }

    public com.google.v.v getVenueNameBytes() {
        return com.google.v.v.s(this.venueName_);
    }

    public boolean hasVenueName() {
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
