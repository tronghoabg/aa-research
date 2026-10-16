package com.waze.jni.protos.insights_infra;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.insights_infra.NotificationId;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Notification extends du<Notification, Builder> implements NotificationOrBuilder {
    public static final int BODY_FIELD_NUMBER = 3;
    private static final Notification DEFAULT_INSTANCE;
    public static final int ICON_NAME_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<Notification> PARSER = null;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private NotificationId id_;
    private long timeoutMs_;
    private String title_ = "";
    private String body_ = "";
    private String iconName_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.insights_infra.Notification$1, reason: invalid class name */
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
    public enum Event implements eg {
        EVENT_UNSPECIFIED(0),
        EVENT_SHOWN(1),
        EVENT_TIMEOUT(2),
        EVENT_MAP_TAPPED(3),
        EVENT_BACKGROUND_TAPPED(4),
        EVENT_CLOSE_CLICKED(5),
        EVENT_TRAILING_BUTTON_CLICKED(6),
        EVENT_LEADING_BUTTON_CLICKED(7),
        EVENT_IN_CAR_CLOSED(8),
        EVENT_APP_CLOSED(9),
        EVENT_SILENTLY_DISMISSED(10),
        EVENT_DISMISSED(11),
        UNRECOGNIZED(-1);

        public static final int EVENT_APP_CLOSED_VALUE = 9;
        public static final int EVENT_BACKGROUND_TAPPED_VALUE = 4;
        public static final int EVENT_CLOSE_CLICKED_VALUE = 5;
        public static final int EVENT_DISMISSED_VALUE = 11;
        public static final int EVENT_IN_CAR_CLOSED_VALUE = 8;
        public static final int EVENT_LEADING_BUTTON_CLICKED_VALUE = 7;
        public static final int EVENT_MAP_TAPPED_VALUE = 3;
        public static final int EVENT_SHOWN_VALUE = 1;
        public static final int EVENT_SILENTLY_DISMISSED_VALUE = 10;
        public static final int EVENT_TIMEOUT_VALUE = 2;
        public static final int EVENT_TRAILING_BUTTON_CLICKED_VALUE = 6;
        public static final int EVENT_UNSPECIFIED_VALUE = 0;
        private static final eh<Event> internalValueMap = new eh<Event>() { // from class: com.waze.jni.protos.insights_infra.Notification.Event.1
            @Override // com.google.v.eh
            public Event findValueByNumber(int i2) {
                return Event.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class EventVerifier implements ei {
            static final ei INSTANCE = new EventVerifier();

            private EventVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Event.forNumber(i2) != null;
            }
        }

        Event(int i2) {
            this.value = i2;
        }

        public static Event forNumber(int i2) {
            switch (i2) {
                case 0:
                    return EVENT_UNSPECIFIED;
                case 1:
                    return EVENT_SHOWN;
                case 2:
                    return EVENT_TIMEOUT;
                case 3:
                    return EVENT_MAP_TAPPED;
                case 4:
                    return EVENT_BACKGROUND_TAPPED;
                case 5:
                    return EVENT_CLOSE_CLICKED;
                case 6:
                    return EVENT_TRAILING_BUTTON_CLICKED;
                case 7:
                    return EVENT_LEADING_BUTTON_CLICKED;
                case 8:
                    return EVENT_IN_CAR_CLOSED;
                case 9:
                    return EVENT_APP_CLOSED;
                case 10:
                    return EVENT_SILENTLY_DISMISSED;
                case 11:
                    return EVENT_DISMISSED;
                default:
                    return null;
            }
        }

        public static eh<Event> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return EventVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        Notification notification = new Notification();
        DEFAULT_INSTANCE = notification;
        du.registerDefaultInstance(Notification.class, notification);
    }

    private Notification() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconName() {
        this.iconName_ = getDefaultInstance().getIconName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutMs() {
        this.bitField0_ &= -3;
        this.timeoutMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Notification getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeId(NotificationId notificationId) {
        Objects.requireNonNull(notificationId);
        NotificationId notificationId2 = this.id_;
        if (notificationId2 != null && notificationId2 != NotificationId.getDefaultInstance()) {
            NotificationId.Builder builderNewBuilder = NotificationId.newBuilder(notificationId2);
            builderNewBuilder.mergeFrom((NotificationId.Builder) notificationId);
            notificationId = builderNewBuilder.buildPartial();
        }
        this.id_ = notificationId;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Notification parseDelimitedFrom(InputStream inputStream) {
        return (Notification) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notification parseFrom(v vVar) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Notification> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(String str) {
        Objects.requireNonNull(str);
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.body_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconName(String str) {
        Objects.requireNonNull(str);
        this.iconName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.iconName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(NotificationId notificationId) {
        Objects.requireNonNull(notificationId);
        this.id_ = notificationId;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutMs(long j2) {
        this.bitField0_ |= 2;
        this.timeoutMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဂ\u0001", new Object[]{"bitField0_", "id_", "title_", "body_", "iconName_", "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new Notification();
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
        fo<Notification> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Notification.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public String getBody() {
        return this.body_;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public v getBodyBytes() {
        return v.s(this.body_);
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public String getIconName() {
        return this.iconName_;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public v getIconNameBytes() {
        return v.s(this.iconName_);
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public NotificationId getId() {
        NotificationId notificationId = this.id_;
        return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public long getTimeoutMs() {
        return this.timeoutMs_;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
    public boolean hasTimeoutMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(Notification notification) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(notification);
    }

    public static Notification parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Notification) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Notification parseFrom(v vVar, de deVar) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Notification parseFrom(z zVar) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Notification parseFrom(z zVar, de deVar) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Notification parseFrom(InputStream inputStream) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notification parseFrom(InputStream inputStream, de deVar) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Notification parseFrom(ByteBuffer byteBuffer) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Notification parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Notification, Builder> implements NotificationOrBuilder {
        private Builder() {
            super(Notification.DEFAULT_INSTANCE);
        }

        public Builder clearBody() {
            copyOnWrite();
            ((Notification) this.instance).clearBody();
            return this;
        }

        public Builder clearIconName() {
            copyOnWrite();
            ((Notification) this.instance).clearIconName();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Notification) this.instance).clearId();
            return this;
        }

        public Builder clearTimeoutMs() {
            copyOnWrite();
            ((Notification) this.instance).clearTimeoutMs();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Notification) this.instance).clearTitle();
            return this;
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public String getBody() {
            return ((Notification) this.instance).getBody();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public v getBodyBytes() {
            return ((Notification) this.instance).getBodyBytes();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public String getIconName() {
            return ((Notification) this.instance).getIconName();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public v getIconNameBytes() {
            return ((Notification) this.instance).getIconNameBytes();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public NotificationId getId() {
            return ((Notification) this.instance).getId();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public long getTimeoutMs() {
            return ((Notification) this.instance).getTimeoutMs();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public String getTitle() {
            return ((Notification) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public v getTitleBytes() {
            return ((Notification) this.instance).getTitleBytes();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public boolean hasId() {
            return ((Notification) this.instance).hasId();
        }

        @Override // com.waze.jni.protos.insights_infra.NotificationOrBuilder
        public boolean hasTimeoutMs() {
            return ((Notification) this.instance).hasTimeoutMs();
        }

        public Builder mergeId(NotificationId notificationId) {
            copyOnWrite();
            ((Notification) this.instance).mergeId(notificationId);
            return this;
        }

        public Builder setBody(String str) {
            copyOnWrite();
            ((Notification) this.instance).setBody(str);
            return this;
        }

        public Builder setBodyBytes(v vVar) {
            copyOnWrite();
            ((Notification) this.instance).setBodyBytes(vVar);
            return this;
        }

        public Builder setIconName(String str) {
            copyOnWrite();
            ((Notification) this.instance).setIconName(str);
            return this;
        }

        public Builder setIconNameBytes(v vVar) {
            copyOnWrite();
            ((Notification) this.instance).setIconNameBytes(vVar);
            return this;
        }

        public Builder setId(NotificationId.Builder builder) {
            copyOnWrite();
            ((Notification) this.instance).setId(builder.build());
            return this;
        }

        public Builder setTimeoutMs(long j2) {
            copyOnWrite();
            ((Notification) this.instance).setTimeoutMs(j2);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Notification) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((Notification) this.instance).setTitleBytes(vVar);
            return this;
        }

        public Builder setId(NotificationId notificationId) {
            copyOnWrite();
            ((Notification) this.instance).setId(notificationId);
            return this;
        }
    }

    public static Notification parseFrom(byte[] bArr) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Notification parseFrom(byte[] bArr, de deVar) {
        return (Notification) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
