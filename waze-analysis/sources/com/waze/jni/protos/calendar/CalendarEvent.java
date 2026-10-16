package com.waze.jni.protos.calendar;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CalendarEvent extends du<CalendarEvent, Builder> implements CalendarEventOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 1;
    private static final CalendarEvent DEFAULT_INSTANCE;
    private static volatile fo<CalendarEvent> PARSER = null;
    public static final int RECURRING_FIELD_NUMBER = 2;
    private String address_ = "";
    private int bitField0_;
    private boolean recurring_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.calendar.CalendarEvent$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<CalendarEvent, Builder> implements CalendarEventOrBuilder {
        private Builder() {
            super(CalendarEvent.DEFAULT_INSTANCE);
        }

        public Builder clearAddress() {
            copyOnWrite();
            ((CalendarEvent) this.instance).clearAddress();
            return this;
        }

        public Builder clearRecurring() {
            copyOnWrite();
            ((CalendarEvent) this.instance).clearRecurring();
            return this;
        }

        @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
        public String getAddress() {
            return ((CalendarEvent) this.instance).getAddress();
        }

        @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
        public v getAddressBytes() {
            return ((CalendarEvent) this.instance).getAddressBytes();
        }

        @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
        public boolean getRecurring() {
            return ((CalendarEvent) this.instance).getRecurring();
        }

        @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
        public boolean hasAddress() {
            return ((CalendarEvent) this.instance).hasAddress();
        }

        @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
        public boolean hasRecurring() {
            return ((CalendarEvent) this.instance).hasRecurring();
        }

        public Builder setAddress(String str) {
            copyOnWrite();
            ((CalendarEvent) this.instance).setAddress(str);
            return this;
        }

        public Builder setAddressBytes(v vVar) {
            copyOnWrite();
            ((CalendarEvent) this.instance).setAddressBytes(vVar);
            return this;
        }

        public Builder setRecurring(boolean z) {
            copyOnWrite();
            ((CalendarEvent) this.instance).setRecurring(z);
            return this;
        }
    }

    static {
        CalendarEvent calendarEvent = new CalendarEvent();
        DEFAULT_INSTANCE = calendarEvent;
        du.registerDefaultInstance(CalendarEvent.class, calendarEvent);
    }

    private CalendarEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.bitField0_ &= -2;
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecurring() {
        this.bitField0_ &= -3;
        this.recurring_ = false;
    }

    public static CalendarEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CalendarEvent parseDelimitedFrom(InputStream inputStream) {
        return (CalendarEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CalendarEvent parseFrom(v vVar) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CalendarEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.address_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecurring(boolean z) {
        this.bitField0_ |= 2;
        this.recurring_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "address_", "recurring_"});
        }
        if (iOrdinal == 3) {
            return new CalendarEvent();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<CalendarEvent> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CalendarEvent.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
    public String getAddress() {
        return this.address_;
    }

    @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
    public v getAddressBytes() {
        return v.s(this.address_);
    }

    @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
    public boolean getRecurring() {
        return this.recurring_;
    }

    @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
    public boolean hasAddress() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.calendar.CalendarEventOrBuilder
    public boolean hasRecurring() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(CalendarEvent calendarEvent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(calendarEvent);
    }

    public static CalendarEvent parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CalendarEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CalendarEvent parseFrom(v vVar, de deVar) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CalendarEvent parseFrom(z zVar) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CalendarEvent parseFrom(z zVar, de deVar) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CalendarEvent parseFrom(InputStream inputStream) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CalendarEvent parseFrom(InputStream inputStream, de deVar) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CalendarEvent parseFrom(ByteBuffer byteBuffer) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CalendarEvent parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static CalendarEvent parseFrom(byte[] bArr) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CalendarEvent parseFrom(byte[] bArr, de deVar) {
        return (CalendarEvent) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
