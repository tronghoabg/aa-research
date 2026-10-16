package com.waze.jni.protos;

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
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class JniProtoConstants extends du<JniProtoConstants, Builder> implements JniProtoConstantsOrBuilder {
    private static final JniProtoConstants DEFAULT_INSTANCE;
    private static volatile fo<JniProtoConstants> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.JniProtoConstants$1, reason: invalid class name */
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
    public enum AddressItemCategory implements eg {
        ADDRESS_ITEM_CATEGORY_UNSPECIFIED(0),
        FAVORITE_AND_HISTORY(150),
        UNRECOGNIZED(-1);

        public static final int ADDRESS_ITEM_CATEGORY_UNSPECIFIED_VALUE = 0;
        public static final int FAVORITE_AND_HISTORY_VALUE = 150;
        private static final eh<AddressItemCategory> internalValueMap = new eh<AddressItemCategory>() { // from class: com.waze.jni.protos.JniProtoConstants.AddressItemCategory.1
            @Override // com.google.v.eh
            public AddressItemCategory findValueByNumber(int i2) {
                return AddressItemCategory.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AddressItemCategoryVerifier implements ei {
            static final ei INSTANCE = new AddressItemCategoryVerifier();

            private AddressItemCategoryVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AddressItemCategory.forNumber(i2) != null;
            }
        }

        AddressItemCategory(int i2) {
            this.value = i2;
        }

        public static AddressItemCategory forNumber(int i2) {
            if (i2 == 0) {
                return ADDRESS_ITEM_CATEGORY_UNSPECIFIED;
            }
            if (i2 != 150) {
                return null;
            }
            return FAVORITE_AND_HISTORY;
        }

        public static eh<AddressItemCategory> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AddressItemCategoryVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public final class Builder extends dm<JniProtoConstants, Builder> implements JniProtoConstantsOrBuilder {
        private Builder() {
            super(JniProtoConstants.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public enum DriveSharingType implements eg {
        NOT_SHARING(0),
        ETA_ONLY(1),
        ROUTE_AND_ETA(2),
        ETA_AND_LOCATION(3),
        UNKNOWN(4),
        UNRECOGNIZED(-1);

        public static final int ETA_AND_LOCATION_VALUE = 3;
        public static final int ETA_ONLY_VALUE = 1;
        public static final int NOT_SHARING_VALUE = 0;
        public static final int ROUTE_AND_ETA_VALUE = 2;
        public static final int UNKNOWN_VALUE = 4;
        private static final eh<DriveSharingType> internalValueMap = new eh<DriveSharingType>() { // from class: com.waze.jni.protos.JniProtoConstants.DriveSharingType.1
            @Override // com.google.v.eh
            public DriveSharingType findValueByNumber(int i2) {
                return DriveSharingType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class DriveSharingTypeVerifier implements ei {
            static final ei INSTANCE = new DriveSharingTypeVerifier();

            private DriveSharingTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return DriveSharingType.forNumber(i2) != null;
            }
        }

        DriveSharingType(int i2) {
            this.value = i2;
        }

        public static DriveSharingType forNumber(int i2) {
            if (i2 == 0) {
                return NOT_SHARING;
            }
            if (i2 == 1) {
                return ETA_ONLY;
            }
            if (i2 == 2) {
                return ROUTE_AND_ETA;
            }
            if (i2 == 3) {
                return ETA_AND_LOCATION;
            }
            if (i2 != 4) {
                return null;
            }
            return UNKNOWN;
        }

        public static eh<DriveSharingType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return DriveSharingTypeVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public enum LogLevel implements eg {
        LOG_LEVEL_UNSPECIFIED(0),
        DEBUG(1),
        INFO(2),
        WARNING(3),
        ERROR(4),
        FATAL(5),
        UNRECOGNIZED(-1);

        public static final int DEBUG_VALUE = 1;
        public static final int ERROR_VALUE = 4;
        public static final int FATAL_VALUE = 5;
        public static final int INFO_VALUE = 2;
        public static final int LOG_LEVEL_UNSPECIFIED_VALUE = 0;
        public static final int WARNING_VALUE = 3;
        private static final eh<LogLevel> internalValueMap = new eh<LogLevel>() { // from class: com.waze.jni.protos.JniProtoConstants.LogLevel.1
            @Override // com.google.v.eh
            public LogLevel findValueByNumber(int i2) {
                return LogLevel.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class LogLevelVerifier implements ei {
            static final ei INSTANCE = new LogLevelVerifier();

            private LogLevelVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return LogLevel.forNumber(i2) != null;
            }
        }

        LogLevel(int i2) {
            this.value = i2;
        }

        public static LogLevel forNumber(int i2) {
            if (i2 == 0) {
                return LOG_LEVEL_UNSPECIFIED;
            }
            if (i2 == 1) {
                return DEBUG;
            }
            if (i2 == 2) {
                return INFO;
            }
            if (i2 == 3) {
                return WARNING;
            }
            if (i2 == 4) {
                return ERROR;
            }
            if (i2 != 5) {
                return null;
            }
            return FATAL;
        }

        public static eh<LogLevel> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return LogLevelVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public enum ParkedRemoveReason implements eg {
        PARKED_REMOVE_REASON_DEBUG(0),
        PARKED_REMOVE_REASON_EDIT(1),
        PARKED_REMOVE_REASON_WRONG(2),
        PARKED_REMOVE_REASON_NEW(3),
        PARKED_REMOVE_REASON_OBSOLETE(4),
        PARKED_REMOVE_REASON_SPEED(5),
        UNRECOGNIZED(-1);

        public static final int PARKED_REMOVE_REASON_DEBUG_VALUE = 0;
        public static final int PARKED_REMOVE_REASON_EDIT_VALUE = 1;
        public static final int PARKED_REMOVE_REASON_NEW_VALUE = 3;
        public static final int PARKED_REMOVE_REASON_OBSOLETE_VALUE = 4;
        public static final int PARKED_REMOVE_REASON_SPEED_VALUE = 5;
        public static final int PARKED_REMOVE_REASON_WRONG_VALUE = 2;
        private static final eh<ParkedRemoveReason> internalValueMap = new eh<ParkedRemoveReason>() { // from class: com.waze.jni.protos.JniProtoConstants.ParkedRemoveReason.1
            @Override // com.google.v.eh
            public ParkedRemoveReason findValueByNumber(int i2) {
                return ParkedRemoveReason.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ParkedRemoveReasonVerifier implements ei {
            static final ei INSTANCE = new ParkedRemoveReasonVerifier();

            private ParkedRemoveReasonVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return ParkedRemoveReason.forNumber(i2) != null;
            }
        }

        ParkedRemoveReason(int i2) {
            this.value = i2;
        }

        public static ParkedRemoveReason forNumber(int i2) {
            if (i2 == 0) {
                return PARKED_REMOVE_REASON_DEBUG;
            }
            if (i2 == 1) {
                return PARKED_REMOVE_REASON_EDIT;
            }
            if (i2 == 2) {
                return PARKED_REMOVE_REASON_WRONG;
            }
            if (i2 == 3) {
                return PARKED_REMOVE_REASON_NEW;
            }
            if (i2 == 4) {
                return PARKED_REMOVE_REASON_OBSOLETE;
            }
            if (i2 != 5) {
                return null;
            }
            return PARKED_REMOVE_REASON_SPEED;
        }

        public static eh<ParkedRemoveReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ParkedRemoveReasonVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public enum PlaceType implements eg {
        NONE(0),
        FAVORITE(1),
        RECENT(2),
        EVENT(3),
        SHARED(4),
        UNRECOGNIZED(-1);

        public static final int EVENT_VALUE = 3;
        public static final int FAVORITE_VALUE = 1;
        public static final int NONE_VALUE = 0;
        public static final int RECENT_VALUE = 2;
        public static final int SHARED_VALUE = 4;
        private static final eh<PlaceType> internalValueMap = new eh<PlaceType>() { // from class: com.waze.jni.protos.JniProtoConstants.PlaceType.1
            @Override // com.google.v.eh
            public PlaceType findValueByNumber(int i2) {
                return PlaceType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class PlaceTypeVerifier implements ei {
            static final ei INSTANCE = new PlaceTypeVerifier();

            private PlaceTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return PlaceType.forNumber(i2) != null;
            }
        }

        PlaceType(int i2) {
            this.value = i2;
        }

        public static PlaceType forNumber(int i2) {
            if (i2 == 0) {
                return NONE;
            }
            if (i2 == 1) {
                return FAVORITE;
            }
            if (i2 == 2) {
                return RECENT;
            }
            if (i2 == 3) {
                return EVENT;
            }
            if (i2 != 4) {
                return null;
            }
            return SHARED;
        }

        public static eh<PlaceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return PlaceTypeVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public enum SearchType implements eg {
        CATEGORY(0),
        BRAND(1),
        KEYWORD(2),
        UNRECOGNIZED(-1);

        public static final int BRAND_VALUE = 1;
        public static final int CATEGORY_VALUE = 0;
        public static final int KEYWORD_VALUE = 2;
        private static final eh<SearchType> internalValueMap = new eh<SearchType>() { // from class: com.waze.jni.protos.JniProtoConstants.SearchType.1
            @Override // com.google.v.eh
            public SearchType findValueByNumber(int i2) {
                return SearchType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class SearchTypeVerifier implements ei {
            static final ei INSTANCE = new SearchTypeVerifier();

            private SearchTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return SearchType.forNumber(i2) != null;
            }
        }

        SearchType(int i2) {
            this.value = i2;
        }

        public static SearchType forNumber(int i2) {
            if (i2 == 0) {
                return CATEGORY;
            }
            if (i2 == 1) {
                return BRAND;
            }
            if (i2 != 2) {
                return null;
            }
            return KEYWORD;
        }

        public static eh<SearchType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return SearchTypeVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public enum TrafficNotificationResponse implements eg {
        TRAFFIC_VALUE_NO(0),
        TRAFFIC_VALUE_YES(1),
        TRAFFIC_VALUE_NO_ANSWER(2),
        UNRECOGNIZED(-1);

        public static final int TRAFFIC_VALUE_NO_ANSWER_VALUE = 2;
        public static final int TRAFFIC_VALUE_NO_VALUE = 0;
        public static final int TRAFFIC_VALUE_YES_VALUE = 1;
        private static final eh<TrafficNotificationResponse> internalValueMap = new eh<TrafficNotificationResponse>() { // from class: com.waze.jni.protos.JniProtoConstants.TrafficNotificationResponse.1
            @Override // com.google.v.eh
            public TrafficNotificationResponse findValueByNumber(int i2) {
                return TrafficNotificationResponse.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TrafficNotificationResponseVerifier implements ei {
            static final ei INSTANCE = new TrafficNotificationResponseVerifier();

            private TrafficNotificationResponseVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return TrafficNotificationResponse.forNumber(i2) != null;
            }
        }

        TrafficNotificationResponse(int i2) {
            this.value = i2;
        }

        public static TrafficNotificationResponse forNumber(int i2) {
            if (i2 == 0) {
                return TRAFFIC_VALUE_NO;
            }
            if (i2 == 1) {
                return TRAFFIC_VALUE_YES;
            }
            if (i2 != 2) {
                return null;
            }
            return TRAFFIC_VALUE_NO_ANSWER;
        }

        public static eh<TrafficNotificationResponse> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TrafficNotificationResponseVerifier.INSTANCE;
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

    /* compiled from: WazeSource */
    public enum WazeEditBoxFlags implements eg {
        FLAG_UNSPECIFIED(0),
        FLAG_PASSWORD(1),
        FLAG_SPEECH_TO_TEXT(2),
        UNRECOGNIZED(-1);

        public static final int FLAG_PASSWORD_VALUE = 1;
        public static final int FLAG_SPEECH_TO_TEXT_VALUE = 2;
        public static final int FLAG_UNSPECIFIED_VALUE = 0;
        private static final eh<WazeEditBoxFlags> internalValueMap = new eh<WazeEditBoxFlags>() { // from class: com.waze.jni.protos.JniProtoConstants.WazeEditBoxFlags.1
            @Override // com.google.v.eh
            public WazeEditBoxFlags findValueByNumber(int i2) {
                return WazeEditBoxFlags.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class WazeEditBoxFlagsVerifier implements ei {
            static final ei INSTANCE = new WazeEditBoxFlagsVerifier();

            private WazeEditBoxFlagsVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return WazeEditBoxFlags.forNumber(i2) != null;
            }
        }

        WazeEditBoxFlags(int i2) {
            this.value = i2;
        }

        public static WazeEditBoxFlags forNumber(int i2) {
            if (i2 == 0) {
                return FLAG_UNSPECIFIED;
            }
            if (i2 == 1) {
                return FLAG_PASSWORD;
            }
            if (i2 != 2) {
                return null;
            }
            return FLAG_SPEECH_TO_TEXT;
        }

        public static eh<WazeEditBoxFlags> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return WazeEditBoxFlagsVerifier.INSTANCE;
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
        JniProtoConstants jniProtoConstants = new JniProtoConstants();
        DEFAULT_INSTANCE = jniProtoConstants;
        du.registerDefaultInstance(JniProtoConstants.class, jniProtoConstants);
    }

    private JniProtoConstants() {
    }

    public static JniProtoConstants getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static JniProtoConstants parseDelimitedFrom(InputStream inputStream) {
        return (JniProtoConstants) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JniProtoConstants parseFrom(v vVar) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<JniProtoConstants> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new JniProtoConstants();
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
        fo<JniProtoConstants> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (JniProtoConstants.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static Builder newBuilder(JniProtoConstants jniProtoConstants) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(jniProtoConstants);
    }

    public static JniProtoConstants parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (JniProtoConstants) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static JniProtoConstants parseFrom(v vVar, de deVar) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static JniProtoConstants parseFrom(z zVar) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static JniProtoConstants parseFrom(z zVar, de deVar) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static JniProtoConstants parseFrom(InputStream inputStream) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JniProtoConstants parseFrom(InputStream inputStream, de deVar) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static JniProtoConstants parseFrom(ByteBuffer byteBuffer) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static JniProtoConstants parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static JniProtoConstants parseFrom(byte[] bArr) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JniProtoConstants parseFrom(byte[] bArr, de deVar) {
        return (JniProtoConstants) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
