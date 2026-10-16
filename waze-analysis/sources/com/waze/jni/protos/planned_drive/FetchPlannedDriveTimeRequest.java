package com.waze.jni.protos.planned_drive;

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
public final class FetchPlannedDriveTimeRequest extends du<FetchPlannedDriveTimeRequest, Builder> implements FetchPlannedDriveTimeRequestOrBuilder {
    private static final FetchPlannedDriveTimeRequest DEFAULT_INSTANCE;
    public static final int MEETING_ID_FIELD_NUMBER = 1;
    private static volatile fo<FetchPlannedDriveTimeRequest> PARSER;
    private String meetingId_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequest$1, reason: invalid class name */
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
    public final class Builder extends dm<FetchPlannedDriveTimeRequest, Builder> implements FetchPlannedDriveTimeRequestOrBuilder {
        private Builder() {
            super(FetchPlannedDriveTimeRequest.DEFAULT_INSTANCE);
        }

        public Builder clearMeetingId() {
            copyOnWrite();
            ((FetchPlannedDriveTimeRequest) this.instance).clearMeetingId();
            return this;
        }

        @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequestOrBuilder
        public String getMeetingId() {
            return ((FetchPlannedDriveTimeRequest) this.instance).getMeetingId();
        }

        @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequestOrBuilder
        public v getMeetingIdBytes() {
            return ((FetchPlannedDriveTimeRequest) this.instance).getMeetingIdBytes();
        }

        public Builder setMeetingId(String str) {
            copyOnWrite();
            ((FetchPlannedDriveTimeRequest) this.instance).setMeetingId(str);
            return this;
        }

        public Builder setMeetingIdBytes(v vVar) {
            copyOnWrite();
            ((FetchPlannedDriveTimeRequest) this.instance).setMeetingIdBytes(vVar);
            return this;
        }
    }

    static {
        FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest = new FetchPlannedDriveTimeRequest();
        DEFAULT_INSTANCE = fetchPlannedDriveTimeRequest;
        du.registerDefaultInstance(FetchPlannedDriveTimeRequest.class, fetchPlannedDriveTimeRequest);
    }

    private FetchPlannedDriveTimeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingId() {
        this.meetingId_ = getDefaultInstance().getMeetingId();
    }

    public static FetchPlannedDriveTimeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FetchPlannedDriveTimeRequest parseDelimitedFrom(InputStream inputStream) {
        return (FetchPlannedDriveTimeRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(v vVar) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<FetchPlannedDriveTimeRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingId(String str) {
        Objects.requireNonNull(str);
        this.meetingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.meetingId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"meetingId_"});
        }
        if (iOrdinal == 3) {
            return new FetchPlannedDriveTimeRequest();
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
        fo<FetchPlannedDriveTimeRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (FetchPlannedDriveTimeRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequestOrBuilder
    public String getMeetingId() {
        return this.meetingId_;
    }

    @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequestOrBuilder
    public v getMeetingIdBytes() {
        return v.s(this.meetingId_);
    }

    public static Builder newBuilder(FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fetchPlannedDriveTimeRequest);
    }

    public static FetchPlannedDriveTimeRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (FetchPlannedDriveTimeRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(v vVar, de deVar) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(z zVar) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(z zVar, de deVar) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(InputStream inputStream) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(InputStream inputStream, de deVar) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(ByteBuffer byteBuffer) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(byte[] bArr) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FetchPlannedDriveTimeRequest parseFrom(byte[] bArr, de deVar) {
        return (FetchPlannedDriveTimeRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
