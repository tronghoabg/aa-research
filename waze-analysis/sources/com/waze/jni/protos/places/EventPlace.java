package com.waze.jni.protos.places;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.places.Place;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventPlace extends du<EventPlace, Builder> implements EventPlaceOrBuilder {
    public static final int ALL_DAY_FIELD_NUMBER = 7;
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final EventPlace DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 6;
    public static final int EVENT_ID_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int ORIGIN_PLACE_FIELD_NUMBER = 14;
    private static volatile fo<EventPlace> PARSER = null;
    public static final int RECURRING_CALENDAR_EVENT_FIELD_NUMBER = 13;
    public static final int REF_EVENT_ID_FIELD_NUMBER = 11;
    public static final int START_TIME_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int VALIDATED_FIELD_NUMBER = 8;
    public static final int VALIDATE_ONLY_FIELD_NUMBER = 9;
    private boolean allDay_;
    private int bitField0_;
    private int count_;
    private long endTime_;
    private int id_;
    private Place originPlace_;
    private boolean recurringCalendarEvent_;
    private long startTime_;
    private int type_;
    private boolean validateOnly_;
    private boolean validated_;
    private String eventId_ = "";
    private String name_ = "";
    private String refEventId_ = "";
    private String imageUrl_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.places.EventPlace$1, reason: invalid class name */
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

    static {
        EventPlace eventPlace = new EventPlace();
        DEFAULT_INSTANCE = eventPlace;
        du.registerDefaultInstance(EventPlace.class, eventPlace);
    }

    private EventPlace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllDay() {
        this.allDay_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginPlace() {
        this.originPlace_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecurringCalendarEvent() {
        this.recurringCalendarEvent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefEventId() {
        this.refEventId_ = getDefaultInstance().getRefEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidateOnly() {
        this.validateOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidated() {
        this.validated_ = false;
    }

    public static EventPlace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOriginPlace(Place place) {
        Objects.requireNonNull(place);
        Place place2 = this.originPlace_;
        if (place2 != null && place2 != Place.getDefaultInstance()) {
            Place.Builder builderNewBuilder = Place.newBuilder(place2);
            builderNewBuilder.mergeFrom((Place.Builder) place);
            place = builderNewBuilder.buildPartial();
        }
        this.originPlace_ = place;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventPlace parseDelimitedFrom(InputStream inputStream) {
        return (EventPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventPlace parseFrom(v vVar) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EventPlace> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllDay(boolean z) {
        this.allDay_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i2) {
        this.count_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(long j2) {
        this.endTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        Objects.requireNonNull(str);
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.eventId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginPlace(Place place) {
        Objects.requireNonNull(place);
        this.originPlace_ = place;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecurringCalendarEvent(boolean z) {
        this.recurringCalendarEvent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefEventId(String str) {
        Objects.requireNonNull(str);
        this.refEventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefEventIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.refEventId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j2) {
        this.startTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EventPlaceType eventPlaceType) {
        this.type_ = eventPlaceType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidateOnly(boolean z) {
        this.validateOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidated(boolean z) {
        this.validated_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006\u0002\u0007\u0007\b\u0007\t\u0007\n\f\u000bȈ\fȈ\r\u0007\u000eဉ\u0000", new Object[]{"bitField0_", "id_", "count_", "eventId_", "name_", "startTime_", "endTime_", "allDay_", "validated_", "validateOnly_", "type_", "refEventId_", "imageUrl_", "recurringCalendarEvent_", "originPlace_"});
        }
        if (iOrdinal == 3) {
            return new EventPlace();
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
        fo<EventPlace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EventPlace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public boolean getAllDay() {
        return this.allDay_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public int getCount() {
        return this.count_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public long getEndTime() {
        return this.endTime_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public v getEventIdBytes() {
        return v.s(this.eventId_);
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public v getImageUrlBytes() {
        return v.s(this.imageUrl_);
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public Place getOriginPlace() {
        Place place = this.originPlace_;
        return place == null ? Place.getDefaultInstance() : place;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public boolean getRecurringCalendarEvent() {
        return this.recurringCalendarEvent_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public String getRefEventId() {
        return this.refEventId_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public v getRefEventIdBytes() {
        return v.s(this.refEventId_);
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public long getStartTime() {
        return this.startTime_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public EventPlaceType getType() {
        EventPlaceType eventPlaceTypeForNumber = EventPlaceType.forNumber(this.type_);
        return eventPlaceTypeForNumber == null ? EventPlaceType.UNRECOGNIZED : eventPlaceTypeForNumber;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public boolean getValidateOnly() {
        return this.validateOnly_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public boolean getValidated() {
        return this.validated_;
    }

    @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
    public boolean hasOriginPlace() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(EventPlace eventPlace) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eventPlace);
    }

    public static EventPlace parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EventPlace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EventPlace parseFrom(v vVar, de deVar) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EventPlace parseFrom(z zVar) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EventPlace parseFrom(z zVar, de deVar) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static EventPlace parseFrom(InputStream inputStream) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventPlace parseFrom(InputStream inputStream, de deVar) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EventPlace parseFrom(ByteBuffer byteBuffer) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EventPlace parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<EventPlace, Builder> implements EventPlaceOrBuilder {
        private Builder() {
            super(EventPlace.DEFAULT_INSTANCE);
        }

        public Builder clearAllDay() {
            copyOnWrite();
            ((EventPlace) this.instance).clearAllDay();
            return this;
        }

        public Builder clearCount() {
            copyOnWrite();
            ((EventPlace) this.instance).clearCount();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((EventPlace) this.instance).clearEndTime();
            return this;
        }

        public Builder clearEventId() {
            copyOnWrite();
            ((EventPlace) this.instance).clearEventId();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((EventPlace) this.instance).clearId();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((EventPlace) this.instance).clearImageUrl();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EventPlace) this.instance).clearName();
            return this;
        }

        public Builder clearOriginPlace() {
            copyOnWrite();
            ((EventPlace) this.instance).clearOriginPlace();
            return this;
        }

        public Builder clearRecurringCalendarEvent() {
            copyOnWrite();
            ((EventPlace) this.instance).clearRecurringCalendarEvent();
            return this;
        }

        public Builder clearRefEventId() {
            copyOnWrite();
            ((EventPlace) this.instance).clearRefEventId();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((EventPlace) this.instance).clearStartTime();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EventPlace) this.instance).clearType();
            return this;
        }

        public Builder clearValidateOnly() {
            copyOnWrite();
            ((EventPlace) this.instance).clearValidateOnly();
            return this;
        }

        public Builder clearValidated() {
            copyOnWrite();
            ((EventPlace) this.instance).clearValidated();
            return this;
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public boolean getAllDay() {
            return ((EventPlace) this.instance).getAllDay();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public int getCount() {
            return ((EventPlace) this.instance).getCount();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public long getEndTime() {
            return ((EventPlace) this.instance).getEndTime();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public String getEventId() {
            return ((EventPlace) this.instance).getEventId();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public v getEventIdBytes() {
            return ((EventPlace) this.instance).getEventIdBytes();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public int getId() {
            return ((EventPlace) this.instance).getId();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public String getImageUrl() {
            return ((EventPlace) this.instance).getImageUrl();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public v getImageUrlBytes() {
            return ((EventPlace) this.instance).getImageUrlBytes();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public String getName() {
            return ((EventPlace) this.instance).getName();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public v getNameBytes() {
            return ((EventPlace) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public Place getOriginPlace() {
            return ((EventPlace) this.instance).getOriginPlace();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public boolean getRecurringCalendarEvent() {
            return ((EventPlace) this.instance).getRecurringCalendarEvent();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public String getRefEventId() {
            return ((EventPlace) this.instance).getRefEventId();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public v getRefEventIdBytes() {
            return ((EventPlace) this.instance).getRefEventIdBytes();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public long getStartTime() {
            return ((EventPlace) this.instance).getStartTime();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public EventPlaceType getType() {
            return ((EventPlace) this.instance).getType();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public int getTypeValue() {
            return ((EventPlace) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public boolean getValidateOnly() {
            return ((EventPlace) this.instance).getValidateOnly();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public boolean getValidated() {
            return ((EventPlace) this.instance).getValidated();
        }

        @Override // com.waze.jni.protos.places.EventPlaceOrBuilder
        public boolean hasOriginPlace() {
            return ((EventPlace) this.instance).hasOriginPlace();
        }

        public Builder mergeOriginPlace(Place place) {
            copyOnWrite();
            ((EventPlace) this.instance).mergeOriginPlace(place);
            return this;
        }

        public Builder setAllDay(boolean z) {
            copyOnWrite();
            ((EventPlace) this.instance).setAllDay(z);
            return this;
        }

        public Builder setCount(int i2) {
            copyOnWrite();
            ((EventPlace) this.instance).setCount(i2);
            return this;
        }

        public Builder setEndTime(long j2) {
            copyOnWrite();
            ((EventPlace) this.instance).setEndTime(j2);
            return this;
        }

        public Builder setEventId(String str) {
            copyOnWrite();
            ((EventPlace) this.instance).setEventId(str);
            return this;
        }

        public Builder setEventIdBytes(v vVar) {
            copyOnWrite();
            ((EventPlace) this.instance).setEventIdBytes(vVar);
            return this;
        }

        public Builder setId(int i2) {
            copyOnWrite();
            ((EventPlace) this.instance).setId(i2);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((EventPlace) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(v vVar) {
            copyOnWrite();
            ((EventPlace) this.instance).setImageUrlBytes(vVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((EventPlace) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((EventPlace) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setOriginPlace(Place.Builder builder) {
            copyOnWrite();
            ((EventPlace) this.instance).setOriginPlace(builder.build());
            return this;
        }

        public Builder setRecurringCalendarEvent(boolean z) {
            copyOnWrite();
            ((EventPlace) this.instance).setRecurringCalendarEvent(z);
            return this;
        }

        public Builder setRefEventId(String str) {
            copyOnWrite();
            ((EventPlace) this.instance).setRefEventId(str);
            return this;
        }

        public Builder setRefEventIdBytes(v vVar) {
            copyOnWrite();
            ((EventPlace) this.instance).setRefEventIdBytes(vVar);
            return this;
        }

        public Builder setStartTime(long j2) {
            copyOnWrite();
            ((EventPlace) this.instance).setStartTime(j2);
            return this;
        }

        public Builder setType(EventPlaceType eventPlaceType) {
            copyOnWrite();
            ((EventPlace) this.instance).setType(eventPlaceType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((EventPlace) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setValidateOnly(boolean z) {
            copyOnWrite();
            ((EventPlace) this.instance).setValidateOnly(z);
            return this;
        }

        public Builder setValidated(boolean z) {
            copyOnWrite();
            ((EventPlace) this.instance).setValidated(z);
            return this;
        }

        public Builder setOriginPlace(Place place) {
            copyOnWrite();
            ((EventPlace) this.instance).setOriginPlace(place);
            return this;
        }
    }

    public static EventPlace parseFrom(byte[] bArr) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EventPlace parseFrom(byte[] bArr, de deVar) {
        return (EventPlace) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
