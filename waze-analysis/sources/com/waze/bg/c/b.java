package com.waze.bg.c;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends du<b, a> implements fj {
    public static final int ADDRESS_IS_VALIDATED_FIELD_NUMBER = 3;
    private static final b DEFAULT_INSTANCE;
    public static final int IS_INSTANCE_OF_RECURRENT_EVENT_FIELD_NUMBER = 2;
    private static volatile fo<b> PARSER = null;
    public static final int RECURRING_EVENT_ID_FIELD_NUMBER = 1;
    private boolean addressIsValidated_;
    private int bitField0_;
    private boolean isInstanceOfRecurrentEvent_;
    private String recurringEventId_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressIsValidated() {
        this.bitField0_ &= -5;
        this.addressIsValidated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInstanceOfRecurrentEvent() {
        this.bitField0_ &= -3;
        this.isInstanceOfRecurrentEvent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecurringEventId() {
        this.bitField0_ &= -2;
        this.recurringEventId_ = getDefaultInstance().getRecurringEventId();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressIsValidated(boolean z) {
        this.bitField0_ |= 4;
        this.addressIsValidated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInstanceOfRecurrentEvent(boolean z) {
        this.bitField0_ |= 2;
        this.isInstanceOfRecurrentEvent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecurringEventId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.recurringEventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecurringEventIdBytes(v vVar) {
        this.recurringEventId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "recurringEventId_", "isInstanceOfRecurrentEvent_", "addressIsValidated_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAddressIsValidated() {
        return this.addressIsValidated_;
    }

    public boolean getIsInstanceOfRecurrentEvent() {
        return this.isInstanceOfRecurrentEvent_;
    }

    public String getRecurringEventId() {
        return this.recurringEventId_;
    }

    public v getRecurringEventIdBytes() {
        return v.s(this.recurringEventId_);
    }

    public boolean hasAddressIsValidated() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsInstanceOfRecurrentEvent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRecurringEventId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
