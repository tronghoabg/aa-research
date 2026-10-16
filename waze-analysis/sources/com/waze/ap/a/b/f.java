package com.waze.ap.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends du<f, d> implements g {
    private static final f DEFAULT_INSTANCE;
    public static final int EVENT_TIMESTAMP_SECS_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MATCH_CLOCK_FIELD_NUMBER = 2;
    private static volatile fo<f> PARSER = null;
    public static final int SOCCER_FIELD_NUMBER = 10;
    private Object eventDetails_;
    private long eventTimestampSecs_;
    private int eventDetailsCase_ = 0;
    private String id_ = "";
    private String matchClock_ = "";

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventDetails() {
        this.eventDetailsCase_ = 0;
        this.eventDetails_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventTimestampSecs() {
        this.eventTimestampSecs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatchClock() {
        this.matchClock_ = getDefaultInstance().getMatchClock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoccer() {
        if (this.eventDetailsCase_ == 10) {
            this.eventDetailsCase_ = 0;
            this.eventDetails_ = null;
        }
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoccer(l lVar) {
        Objects.requireNonNull(lVar);
        if (this.eventDetailsCase_ == 10 && this.eventDetails_ != l.getDefaultInstance()) {
            j jVarNewBuilder = l.newBuilder((l) this.eventDetails_);
            jVarNewBuilder.mergeFrom((j) lVar);
            lVar = jVarNewBuilder.buildPartial();
        }
        this.eventDetails_ = lVar;
        this.eventDetailsCase_ = 10;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(com.google.v.v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventTimestampSecs(long j2) {
        this.eventTimestampSecs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchClock(String str) {
        Objects.requireNonNull(str);
        this.matchClock_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchClockBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.matchClock_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoccer(l lVar) {
        Objects.requireNonNull(lVar);
        this.eventDetails_ = lVar;
        this.eventDetailsCase_ = 10;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\n\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\n<\u0000", new Object[]{"eventDetails_", "eventDetailsCase_", "id_", "matchClock_", "eventTimestampSecs_", l.class});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public e getEventDetailsCase() {
        int i2 = this.eventDetailsCase_;
        if (i2 == 0) {
            return e.f14982b;
        }
        if (i2 != 10) {
            return null;
        }
        return e.f14981a;
    }

    public long getEventTimestampSecs() {
        return this.eventTimestampSecs_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getMatchClock() {
        return this.matchClock_;
    }

    public com.google.v.v getMatchClockBytes() {
        return com.google.v.v.s(this.matchClock_);
    }

    public l getSoccer() {
        return this.eventDetailsCase_ == 10 ? (l) this.eventDetails_ : l.getDefaultInstance();
    }

    public boolean hasSoccer() {
        return this.eventDetailsCase_ == 10;
    }

    public static d newBuilder(f fVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(com.google.v.v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
