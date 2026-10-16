package com.waze.jni.protos.map;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import i.b.l.re;
import i.b.l.rf;
import i.b.l.rg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventsOnRoute extends du<EventsOnRoute, Builder> implements EventsOnRouteOrBuilder {
    private static final EventsOnRoute DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int EVENT_ON_ROUTE_ANIMATION_PARAMS_FIELD_NUMBER = 3;
    public static final int IS_SELECTED_FIELD_NUMBER = 2;
    private static volatile fo<EventsOnRoute> PARSER;
    private int bitField0_;
    private EventOnRouteAnimationParams eventOnRouteAnimationParams_;
    private eo<rf> event_ = emptyProtobufList();
    private boolean isSelected_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.EventsOnRoute$1, reason: invalid class name */
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
    public interface EventOnRouteAnimationParamsOrBuilder extends fj {
        long getAnimationStartTimeMs();
    }

    static {
        EventsOnRoute eventsOnRoute = new EventsOnRoute();
        DEFAULT_INSTANCE = eventsOnRoute;
        du.registerDefaultInstance(EventsOnRoute.class, eventsOnRoute);
    }

    private EventsOnRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvent(Iterable<? extends rf> iterable) {
        ensureEventIsMutable();
        c.addAll(iterable, this.event_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvent(int i2, rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventIsMutable();
        this.event_.add(i2, rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventOnRouteAnimationParams() {
        this.eventOnRouteAnimationParams_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSelected() {
        this.isSelected_ = false;
    }

    private void ensureEventIsMutable() {
        eo<rf> eoVar = this.event_;
        if (eoVar.c()) {
            return;
        }
        this.event_ = du.mutableCopy(eoVar);
    }

    public static EventsOnRoute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventOnRouteAnimationParams(EventOnRouteAnimationParams eventOnRouteAnimationParams) {
        Objects.requireNonNull(eventOnRouteAnimationParams);
        EventOnRouteAnimationParams eventOnRouteAnimationParams2 = this.eventOnRouteAnimationParams_;
        if (eventOnRouteAnimationParams2 != null && eventOnRouteAnimationParams2 != EventOnRouteAnimationParams.getDefaultInstance()) {
            EventOnRouteAnimationParams.Builder builderNewBuilder = EventOnRouteAnimationParams.newBuilder(eventOnRouteAnimationParams2);
            builderNewBuilder.mergeFrom((EventOnRouteAnimationParams.Builder) eventOnRouteAnimationParams);
            eventOnRouteAnimationParams = builderNewBuilder.buildPartial();
        }
        this.eventOnRouteAnimationParams_ = eventOnRouteAnimationParams;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventsOnRoute parseDelimitedFrom(InputStream inputStream) {
        return (EventsOnRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventsOnRoute parseFrom(v vVar) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EventsOnRoute> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvent(int i2) {
        ensureEventIsMutable();
        this.event_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(int i2, rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventIsMutable();
        this.event_.set(i2, rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventOnRouteAnimationParams(EventOnRouteAnimationParams eventOnRouteAnimationParams) {
        Objects.requireNonNull(eventOnRouteAnimationParams);
        this.eventOnRouteAnimationParams_ = eventOnRouteAnimationParams;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSelected(boolean z) {
        this.isSelected_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003ဉ\u0000", new Object[]{"bitField0_", "event_", rf.class, "isSelected_", "eventOnRouteAnimationParams_"});
        }
        if (iOrdinal == 3) {
            return new EventsOnRoute();
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
        fo<EventsOnRoute> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EventsOnRoute.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
    public rf getEvent(int i2) {
        return this.event_.get(i2);
    }

    @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
    public List<rf> getEventList() {
        return this.event_;
    }

    @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
    public EventOnRouteAnimationParams getEventOnRouteAnimationParams() {
        EventOnRouteAnimationParams eventOnRouteAnimationParams = this.eventOnRouteAnimationParams_;
        return eventOnRouteAnimationParams == null ? EventOnRouteAnimationParams.getDefaultInstance() : eventOnRouteAnimationParams;
    }

    public rg getEventOrBuilder(int i2) {
        return this.event_.get(i2);
    }

    public List<? extends rg> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
    public boolean getIsSelected() {
        return this.isSelected_;
    }

    @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
    public boolean hasEventOnRouteAnimationParams() {
        return (this.bitField0_ & 1) != 0;
    }

    /* compiled from: WazeSource */
    public final class EventOnRouteAnimationParams extends du<EventOnRouteAnimationParams, Builder> implements EventOnRouteAnimationParamsOrBuilder {
        public static final int ANIMATION_START_TIME_MS_FIELD_NUMBER = 1;
        private static final EventOnRouteAnimationParams DEFAULT_INSTANCE;
        private static volatile fo<EventOnRouteAnimationParams> PARSER;
        private long animationStartTimeMs_;

        /* compiled from: WazeSource */
        public final class Builder extends dm<EventOnRouteAnimationParams, Builder> implements EventOnRouteAnimationParamsOrBuilder {
            private Builder() {
                super(EventOnRouteAnimationParams.DEFAULT_INSTANCE);
            }

            public Builder clearAnimationStartTimeMs() {
                copyOnWrite();
                ((EventOnRouteAnimationParams) this.instance).clearAnimationStartTimeMs();
                return this;
            }

            @Override // com.waze.jni.protos.map.EventsOnRoute.EventOnRouteAnimationParamsOrBuilder
            public long getAnimationStartTimeMs() {
                return ((EventOnRouteAnimationParams) this.instance).getAnimationStartTimeMs();
            }

            public Builder setAnimationStartTimeMs(long j2) {
                copyOnWrite();
                ((EventOnRouteAnimationParams) this.instance).setAnimationStartTimeMs(j2);
                return this;
            }
        }

        static {
            EventOnRouteAnimationParams eventOnRouteAnimationParams = new EventOnRouteAnimationParams();
            DEFAULT_INSTANCE = eventOnRouteAnimationParams;
            du.registerDefaultInstance(EventOnRouteAnimationParams.class, eventOnRouteAnimationParams);
        }

        private EventOnRouteAnimationParams() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnimationStartTimeMs() {
            this.animationStartTimeMs_ = 0L;
        }

        public static EventOnRouteAnimationParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EventOnRouteAnimationParams parseDelimitedFrom(InputStream inputStream) {
            return (EventOnRouteAnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventOnRouteAnimationParams parseFrom(v vVar) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<EventOnRouteAnimationParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnimationStartTimeMs(long j2) {
            this.animationStartTimeMs_ = j2;
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"animationStartTimeMs_"});
            }
            if (iOrdinal == 3) {
                return new EventOnRouteAnimationParams();
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
            fo<EventOnRouteAnimationParams> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (EventOnRouteAnimationParams.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.map.EventsOnRoute.EventOnRouteAnimationParamsOrBuilder
        public long getAnimationStartTimeMs() {
            return this.animationStartTimeMs_;
        }

        public static Builder newBuilder(EventOnRouteAnimationParams eventOnRouteAnimationParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(eventOnRouteAnimationParams);
        }

        public static EventOnRouteAnimationParams parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (EventOnRouteAnimationParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static EventOnRouteAnimationParams parseFrom(v vVar, de deVar) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static EventOnRouteAnimationParams parseFrom(z zVar) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static EventOnRouteAnimationParams parseFrom(z zVar, de deVar) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static EventOnRouteAnimationParams parseFrom(InputStream inputStream) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventOnRouteAnimationParams parseFrom(InputStream inputStream, de deVar) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static EventOnRouteAnimationParams parseFrom(ByteBuffer byteBuffer) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static EventOnRouteAnimationParams parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static EventOnRouteAnimationParams parseFrom(byte[] bArr) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EventOnRouteAnimationParams parseFrom(byte[] bArr, de deVar) {
            return (EventOnRouteAnimationParams) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(EventsOnRoute eventsOnRoute) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eventsOnRoute);
    }

    public static EventsOnRoute parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EventsOnRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EventsOnRoute parseFrom(v vVar, de deVar) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EventsOnRoute parseFrom(z zVar) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EventsOnRoute parseFrom(z zVar, de deVar) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvent(rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventIsMutable();
        this.event_.add(rfVar);
    }

    public static EventsOnRoute parseFrom(InputStream inputStream) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventsOnRoute parseFrom(InputStream inputStream, de deVar) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EventsOnRoute parseFrom(ByteBuffer byteBuffer) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EventsOnRoute parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<EventsOnRoute, Builder> implements EventsOnRouteOrBuilder {
        private Builder() {
            super(EventsOnRoute.DEFAULT_INSTANCE);
        }

        public Builder addAllEvent(Iterable<? extends rf> iterable) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).addAllEvent(iterable);
            return this;
        }

        public Builder addEvent(int i2, re reVar) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).addEvent(i2, reVar.build());
            return this;
        }

        public Builder clearEvent() {
            copyOnWrite();
            ((EventsOnRoute) this.instance).clearEvent();
            return this;
        }

        public Builder clearEventOnRouteAnimationParams() {
            copyOnWrite();
            ((EventsOnRoute) this.instance).clearEventOnRouteAnimationParams();
            return this;
        }

        public Builder clearIsSelected() {
            copyOnWrite();
            ((EventsOnRoute) this.instance).clearIsSelected();
            return this;
        }

        @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
        public rf getEvent(int i2) {
            return ((EventsOnRoute) this.instance).getEvent(i2);
        }

        @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
        public int getEventCount() {
            return ((EventsOnRoute) this.instance).getEventCount();
        }

        @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
        public List<rf> getEventList() {
            return DesugarCollections.unmodifiableList(((EventsOnRoute) this.instance).getEventList());
        }

        @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
        public EventOnRouteAnimationParams getEventOnRouteAnimationParams() {
            return ((EventsOnRoute) this.instance).getEventOnRouteAnimationParams();
        }

        @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
        public boolean getIsSelected() {
            return ((EventsOnRoute) this.instance).getIsSelected();
        }

        @Override // com.waze.jni.protos.map.EventsOnRouteOrBuilder
        public boolean hasEventOnRouteAnimationParams() {
            return ((EventsOnRoute) this.instance).hasEventOnRouteAnimationParams();
        }

        public Builder mergeEventOnRouteAnimationParams(EventOnRouteAnimationParams eventOnRouteAnimationParams) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).mergeEventOnRouteAnimationParams(eventOnRouteAnimationParams);
            return this;
        }

        public Builder removeEvent(int i2) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).removeEvent(i2);
            return this;
        }

        public Builder setEvent(int i2, re reVar) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).setEvent(i2, reVar.build());
            return this;
        }

        public Builder setEventOnRouteAnimationParams(EventOnRouteAnimationParams.Builder builder) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).setEventOnRouteAnimationParams(builder.build());
            return this;
        }

        public Builder setIsSelected(boolean z) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).setIsSelected(z);
            return this;
        }

        public Builder addEvent(int i2, rf rfVar) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).addEvent(i2, rfVar);
            return this;
        }

        public Builder setEvent(int i2, rf rfVar) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).setEvent(i2, rfVar);
            return this;
        }

        public Builder setEventOnRouteAnimationParams(EventOnRouteAnimationParams eventOnRouteAnimationParams) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).setEventOnRouteAnimationParams(eventOnRouteAnimationParams);
            return this;
        }

        public Builder addEvent(re reVar) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).addEvent(reVar.build());
            return this;
        }

        public Builder addEvent(rf rfVar) {
            copyOnWrite();
            ((EventsOnRoute) this.instance).addEvent(rfVar);
            return this;
        }
    }

    public static EventsOnRoute parseFrom(byte[] bArr) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EventsOnRoute parseFrom(byte[] bArr, de deVar) {
        return (EventsOnRoute) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
