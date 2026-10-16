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
public final class UpdatePlannedDriveRequest extends du<UpdatePlannedDriveRequest, Builder> implements UpdatePlannedDriveRequestOrBuilder {
    private static final UpdatePlannedDriveRequest DEFAULT_INSTANCE;
    public static final int MEETING_ID_FIELD_NUMBER = 1;
    public static final int NEW_START_TIME_SEC_FIELD_NUMBER = 2;
    private static volatile fo<UpdatePlannedDriveRequest> PARSER;
    private String meetingId_ = "";
    private long newStartTimeSec_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequest$1, reason: invalid class name */
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
    public final class Builder extends dm<UpdatePlannedDriveRequest, Builder> implements UpdatePlannedDriveRequestOrBuilder {
        private Builder() {
            super(UpdatePlannedDriveRequest.DEFAULT_INSTANCE);
        }

        public Builder clearMeetingId() {
            copyOnWrite();
            ((UpdatePlannedDriveRequest) this.instance).clearMeetingId();
            return this;
        }

        public Builder clearNewStartTimeSec() {
            copyOnWrite();
            ((UpdatePlannedDriveRequest) this.instance).clearNewStartTimeSec();
            return this;
        }

        @Override // com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequestOrBuilder
        public String getMeetingId() {
            return ((UpdatePlannedDriveRequest) this.instance).getMeetingId();
        }

        @Override // com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequestOrBuilder
        public v getMeetingIdBytes() {
            return ((UpdatePlannedDriveRequest) this.instance).getMeetingIdBytes();
        }

        @Override // com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequestOrBuilder
        public long getNewStartTimeSec() {
            return ((UpdatePlannedDriveRequest) this.instance).getNewStartTimeSec();
        }

        public Builder setMeetingId(String str) {
            copyOnWrite();
            ((UpdatePlannedDriveRequest) this.instance).setMeetingId(str);
            return this;
        }

        public Builder setMeetingIdBytes(v vVar) {
            copyOnWrite();
            ((UpdatePlannedDriveRequest) this.instance).setMeetingIdBytes(vVar);
            return this;
        }

        public Builder setNewStartTimeSec(long j2) {
            copyOnWrite();
            ((UpdatePlannedDriveRequest) this.instance).setNewStartTimeSec(j2);
            return this;
        }
    }

    static {
        UpdatePlannedDriveRequest updatePlannedDriveRequest = new UpdatePlannedDriveRequest();
        DEFAULT_INSTANCE = updatePlannedDriveRequest;
        du.registerDefaultInstance(UpdatePlannedDriveRequest.class, updatePlannedDriveRequest);
    }

    private UpdatePlannedDriveRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingId() {
        this.meetingId_ = getDefaultInstance().getMeetingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewStartTimeSec() {
        this.newStartTimeSec_ = 0L;
    }

    public static UpdatePlannedDriveRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UpdatePlannedDriveRequest parseDelimitedFrom(InputStream inputStream) {
        return (UpdatePlannedDriveRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpdatePlannedDriveRequest parseFrom(v vVar) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<UpdatePlannedDriveRequest> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewStartTimeSec(long j2) {
        this.newStartTimeSec_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"meetingId_", "newStartTimeSec_"});
        }
        if (iOrdinal == 3) {
            return new UpdatePlannedDriveRequest();
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
        fo<UpdatePlannedDriveRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (UpdatePlannedDriveRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequestOrBuilder
    public String getMeetingId() {
        return this.meetingId_;
    }

    @Override // com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequestOrBuilder
    public v getMeetingIdBytes() {
        return v.s(this.meetingId_);
    }

    @Override // com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequestOrBuilder
    public long getNewStartTimeSec() {
        return this.newStartTimeSec_;
    }

    public static Builder newBuilder(UpdatePlannedDriveRequest updatePlannedDriveRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(updatePlannedDriveRequest);
    }

    public static UpdatePlannedDriveRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (UpdatePlannedDriveRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static UpdatePlannedDriveRequest parseFrom(v vVar, de deVar) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static UpdatePlannedDriveRequest parseFrom(z zVar) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static UpdatePlannedDriveRequest parseFrom(z zVar, de deVar) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static UpdatePlannedDriveRequest parseFrom(InputStream inputStream) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpdatePlannedDriveRequest parseFrom(InputStream inputStream, de deVar) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static UpdatePlannedDriveRequest parseFrom(ByteBuffer byteBuffer) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static UpdatePlannedDriveRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static UpdatePlannedDriveRequest parseFrom(byte[] bArr) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpdatePlannedDriveRequest parseFrom(byte[] bArr, de deVar) {
        return (UpdatePlannedDriveRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
