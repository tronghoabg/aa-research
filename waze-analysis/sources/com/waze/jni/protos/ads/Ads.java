package com.waze.jni.protos.ads;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Ads extends du<Ads, Builder> implements AdsOrBuilder {
    private static final Ads DEFAULT_INSTANCE;
    private static volatile fo<Ads> PARSER;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.ads.Ads$1, reason: invalid class name */
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
    public final class Builder extends dm<Ads, Builder> implements AdsOrBuilder {
        private Builder() {
            super(Ads.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WazeSource */
    public interface DialogOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public enum ErrorOnDisplay implements eg {
        NONE(0),
        AD_ERROR_LOADING(1),
        UNRECOGNIZED(-1);

        public static final int AD_ERROR_LOADING_VALUE = 1;
        public static final int NONE_VALUE = 0;
        private static final eh<ErrorOnDisplay> internalValueMap = new eh<ErrorOnDisplay>() { // from class: com.waze.jni.protos.ads.Ads.ErrorOnDisplay.1
            @Override // com.google.v.eh
            public ErrorOnDisplay findValueByNumber(int i2) {
                return ErrorOnDisplay.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ErrorOnDisplayVerifier implements ei {
            static final ei INSTANCE = new ErrorOnDisplayVerifier();

            private ErrorOnDisplayVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return ErrorOnDisplay.forNumber(i2) != null;
            }
        }

        ErrorOnDisplay(int i2) {
            this.value = i2;
        }

        public static ErrorOnDisplay forNumber(int i2) {
            if (i2 == 0) {
                return NONE;
            }
            if (i2 != 1) {
                return null;
            }
            return AD_ERROR_LOADING;
        }

        public static eh<ErrorOnDisplay> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ErrorOnDisplayVerifier.INSTANCE;
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
    public interface NotificationOrBuilder extends fj {
    }

    /* compiled from: WazeSource */
    public enum ReportTimeType implements eg {
        REPORT_TIME_TYPE_STARTED(0),
        REPORT_TIME_TYPE_ON_SCREEN_THRESHOLD_ELAPSED(1),
        REPORT_TIME_TYPE_STOPPED(2),
        UNRECOGNIZED(-1);

        public static final int REPORT_TIME_TYPE_ON_SCREEN_THRESHOLD_ELAPSED_VALUE = 1;
        public static final int REPORT_TIME_TYPE_STARTED_VALUE = 0;
        public static final int REPORT_TIME_TYPE_STOPPED_VALUE = 2;
        private static final eh<ReportTimeType> internalValueMap = new eh<ReportTimeType>() { // from class: com.waze.jni.protos.ads.Ads.ReportTimeType.1
            @Override // com.google.v.eh
            public ReportTimeType findValueByNumber(int i2) {
                return ReportTimeType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ReportTimeTypeVerifier implements ei {
            static final ei INSTANCE = new ReportTimeTypeVerifier();

            private ReportTimeTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return ReportTimeType.forNumber(i2) != null;
            }
        }

        ReportTimeType(int i2) {
            this.value = i2;
        }

        public static ReportTimeType forNumber(int i2) {
            if (i2 == 0) {
                return REPORT_TIME_TYPE_STARTED;
            }
            if (i2 == 1) {
                return REPORT_TIME_TYPE_ON_SCREEN_THRESHOLD_ELAPSED;
            }
            if (i2 != 2) {
                return null;
            }
            return REPORT_TIME_TYPE_STOPPED;
        }

        public static eh<ReportTimeType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ReportTimeTypeVerifier.INSTANCE;
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
        Ads ads = new Ads();
        DEFAULT_INSTANCE = ads;
        du.registerDefaultInstance(Ads.class, ads);
    }

    private Ads() {
    }

    public static Ads getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Ads parseDelimitedFrom(InputStream inputStream) {
        return (Ads) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ads parseFrom(v vVar) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Ads> parser() {
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
            return new Ads();
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
        fo<Ads> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Ads.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    /* compiled from: WazeSource */
    public final class Dialog extends du<Dialog, Builder> implements DialogOrBuilder {
        private static final Dialog DEFAULT_INSTANCE;
        private static volatile fo<Dialog> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Dialog, Builder> implements DialogOrBuilder {
            private Builder() {
                super(Dialog.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: WazeSource */
        public enum DialogCloseReason implements eg {
            UNKNOWN(0),
            CANNOT_DISPLAY(1),
            USER_CLICKED_YES(2),
            USER_CLICKED_NO(3),
            USER_CANCELLED(4),
            TIMEOUT_CLOSED_ON_YES(5),
            TIMEOUT_CLOSED_ON_NO(6),
            UNRECOGNIZED(-1);

            public static final int CANNOT_DISPLAY_VALUE = 1;
            public static final int TIMEOUT_CLOSED_ON_NO_VALUE = 6;
            public static final int TIMEOUT_CLOSED_ON_YES_VALUE = 5;
            public static final int UNKNOWN_VALUE = 0;
            public static final int USER_CANCELLED_VALUE = 4;
            public static final int USER_CLICKED_NO_VALUE = 3;
            public static final int USER_CLICKED_YES_VALUE = 2;
            private static final eh<DialogCloseReason> internalValueMap = new eh<DialogCloseReason>() { // from class: com.waze.jni.protos.ads.Ads.Dialog.DialogCloseReason.1
                @Override // com.google.v.eh
                public DialogCloseReason findValueByNumber(int i2) {
                    return DialogCloseReason.forNumber(i2);
                }
            };
            private final int value;

            /* compiled from: WazeSource */
            final class DialogCloseReasonVerifier implements ei {
                static final ei INSTANCE = new DialogCloseReasonVerifier();

                private DialogCloseReasonVerifier() {
                }

                @Override // com.google.v.ei
                public boolean isInRange(int i2) {
                    return DialogCloseReason.forNumber(i2) != null;
                }
            }

            DialogCloseReason(int i2) {
                this.value = i2;
            }

            public static DialogCloseReason forNumber(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return CANNOT_DISPLAY;
                    case 2:
                        return USER_CLICKED_YES;
                    case 3:
                        return USER_CLICKED_NO;
                    case 4:
                        return USER_CANCELLED;
                    case 5:
                        return TIMEOUT_CLOSED_ON_YES;
                    case 6:
                        return TIMEOUT_CLOSED_ON_NO;
                    default:
                        return null;
                }
            }

            public static eh<DialogCloseReason> internalGetValueMap() {
                return internalValueMap;
            }

            public static ei internalGetVerifier() {
                return DialogCloseReasonVerifier.INSTANCE;
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
            Dialog dialog = new Dialog();
            DEFAULT_INSTANCE = dialog;
            du.registerDefaultInstance(Dialog.class, dialog);
        }

        private Dialog() {
        }

        public static Dialog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream) {
            return (Dialog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(v vVar) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Dialog> parser() {
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
                return new Dialog();
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
            fo<Dialog> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Dialog.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        public static Builder newBuilder(Dialog dialog) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dialog);
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Dialog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Dialog parseFrom(v vVar, de deVar) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Dialog parseFrom(z zVar) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Dialog parseFrom(z zVar, de deVar) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Dialog parseFrom(InputStream inputStream) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(InputStream inputStream, de deVar) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Dialog parseFrom(ByteBuffer byteBuffer) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Dialog parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Dialog parseFrom(byte[] bArr) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dialog parseFrom(byte[] bArr, de deVar) {
            return (Dialog) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Notification extends du<Notification, Builder> implements NotificationOrBuilder {
        private static final Notification DEFAULT_INSTANCE;
        private static volatile fo<Notification> PARSER;

        /* compiled from: WazeSource */
        public final class Builder extends dm<Notification, Builder> implements NotificationOrBuilder {
            private Builder() {
                super(Notification.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: WazeSource */
        public enum NotificationCloseReason implements eg {
            UNKNOWN(0),
            CANNOT_DISPLAY(1),
            USER_CLICKED(2),
            USER_CLOSED(3),
            TIMEOUT_CLOSED(4),
            OTHER_NOTIFICATION_SHOWN(5),
            OTHER_POPUP_SHOWN(6),
            NOT_RELEVANT(7),
            UNRECOGNIZED(-1);

            public static final int CANNOT_DISPLAY_VALUE = 1;
            public static final int NOT_RELEVANT_VALUE = 7;
            public static final int OTHER_NOTIFICATION_SHOWN_VALUE = 5;
            public static final int OTHER_POPUP_SHOWN_VALUE = 6;
            public static final int TIMEOUT_CLOSED_VALUE = 4;
            public static final int UNKNOWN_VALUE = 0;
            public static final int USER_CLICKED_VALUE = 2;
            public static final int USER_CLOSED_VALUE = 3;
            private static final eh<NotificationCloseReason> internalValueMap = new eh<NotificationCloseReason>() { // from class: com.waze.jni.protos.ads.Ads.Notification.NotificationCloseReason.1
                @Override // com.google.v.eh
                public NotificationCloseReason findValueByNumber(int i2) {
                    return NotificationCloseReason.forNumber(i2);
                }
            };
            private final int value;

            /* compiled from: WazeSource */
            final class NotificationCloseReasonVerifier implements ei {
                static final ei INSTANCE = new NotificationCloseReasonVerifier();

                private NotificationCloseReasonVerifier() {
                }

                @Override // com.google.v.ei
                public boolean isInRange(int i2) {
                    return NotificationCloseReason.forNumber(i2) != null;
                }
            }

            NotificationCloseReason(int i2) {
                this.value = i2;
            }

            public static NotificationCloseReason forNumber(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return CANNOT_DISPLAY;
                    case 2:
                        return USER_CLICKED;
                    case 3:
                        return USER_CLOSED;
                    case 4:
                        return TIMEOUT_CLOSED;
                    case 5:
                        return OTHER_NOTIFICATION_SHOWN;
                    case 6:
                        return OTHER_POPUP_SHOWN;
                    case 7:
                        return NOT_RELEVANT;
                    default:
                        return null;
                }
            }

            public static eh<NotificationCloseReason> internalGetValueMap() {
                return internalValueMap;
            }

            public static ei internalGetVerifier() {
                return NotificationCloseReasonVerifier.INSTANCE;
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

        public static Notification getDefaultInstance() {
            return DEFAULT_INSTANCE;
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

        public static Notification parseFrom(byte[] bArr) {
            return (Notification) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Notification parseFrom(byte[] bArr, de deVar) {
            return (Notification) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(Ads ads) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ads);
    }

    public static Ads parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Ads) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Ads parseFrom(v vVar, de deVar) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Ads parseFrom(z zVar) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Ads parseFrom(z zVar, de deVar) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Ads parseFrom(InputStream inputStream) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ads parseFrom(InputStream inputStream, de deVar) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Ads parseFrom(ByteBuffer byteBuffer) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Ads parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Ads parseFrom(byte[] bArr) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ads parseFrom(byte[] bArr, de deVar) {
        return (Ads) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
