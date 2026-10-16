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
public final class FetchPlannedDriveTimeResponse extends du<FetchPlannedDriveTimeResponse, Builder> implements FetchPlannedDriveTimeResponseOrBuilder {
    private static final FetchPlannedDriveTimeResponse DEFAULT_INSTANCE;
    public static final int DRIVE_TIME_SEC_FIELD_NUMBER = 2;
    public static final int MEETING_ID_FIELD_NUMBER = 1;
    private static volatile fo<FetchPlannedDriveTimeResponse> PARSER;
    private int driveTimeSec_;
    private String meetingId_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse$1, reason: invalid class name */
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
    public final class Builder extends dm<FetchPlannedDriveTimeResponse, Builder> implements FetchPlannedDriveTimeResponseOrBuilder {
        private Builder() {
            super(FetchPlannedDriveTimeResponse.DEFAULT_INSTANCE);
        }

        public Builder clearDriveTimeSec() {
            copyOnWrite();
            ((FetchPlannedDriveTimeResponse) this.instance).clearDriveTimeSec();
            return this;
        }

        public Builder clearMeetingId() {
            copyOnWrite();
            ((FetchPlannedDriveTimeResponse) this.instance).clearMeetingId();
            return this;
        }

        @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponseOrBuilder
        public int getDriveTimeSec() {
            return ((FetchPlannedDriveTimeResponse) this.instance).getDriveTimeSec();
        }

        @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponseOrBuilder
        public String getMeetingId() {
            return ((FetchPlannedDriveTimeResponse) this.instance).getMeetingId();
        }

        @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponseOrBuilder
        public v getMeetingIdBytes() {
            return ((FetchPlannedDriveTimeResponse) this.instance).getMeetingIdBytes();
        }

        public Builder setDriveTimeSec(int i2) {
            copyOnWrite();
            ((FetchPlannedDriveTimeResponse) this.instance).setDriveTimeSec(i2);
            return this;
        }

        public Builder setMeetingId(String str) {
            copyOnWrite();
            ((FetchPlannedDriveTimeResponse) this.instance).setMeetingId(str);
            return this;
        }

        public Builder setMeetingIdBytes(v vVar) {
            copyOnWrite();
            ((FetchPlannedDriveTimeResponse) this.instance).setMeetingIdBytes(vVar);
            return this;
        }
    }

    static {
        FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse = new FetchPlannedDriveTimeResponse();
        DEFAULT_INSTANCE = fetchPlannedDriveTimeResponse;
        du.registerDefaultInstance(FetchPlannedDriveTimeResponse.class, fetchPlannedDriveTimeResponse);
    }

    private FetchPlannedDriveTimeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveTimeSec() {
        this.driveTimeSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingId() {
        this.meetingId_ = getDefaultInstance().getMeetingId();
    }

    public static FetchPlannedDriveTimeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FetchPlannedDriveTimeResponse parseDelimitedFrom(InputStream inputStream) {
        return (FetchPlannedDriveTimeResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(v vVar) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<FetchPlannedDriveTimeResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveTimeSec(int i2) {
        this.driveTimeSec_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"meetingId_", "driveTimeSec_"});
        }
        if (iOrdinal == 3) {
            return new FetchPlannedDriveTimeResponse();
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
        fo<FetchPlannedDriveTimeResponse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (FetchPlannedDriveTimeResponse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponseOrBuilder
    public int getDriveTimeSec() {
        return this.driveTimeSec_;
    }

    @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponseOrBuilder
    public String getMeetingId() {
        return this.meetingId_;
    }

    @Override // com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponseOrBuilder
    public v getMeetingIdBytes() {
        return v.s(this.meetingId_);
    }

    public static Builder newBuilder(FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fetchPlannedDriveTimeResponse);
    }

    public static FetchPlannedDriveTimeResponse parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (FetchPlannedDriveTimeResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(v vVar, de deVar) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(z zVar) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(z zVar, de deVar) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(InputStream inputStream) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(InputStream inputStream, de deVar) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(ByteBuffer byteBuffer) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(byte[] bArr) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FetchPlannedDriveTimeResponse parseFrom(byte[] bArr, de deVar) {
        return (FetchPlannedDriveTimeResponse) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
