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
public final class PlannedDriveResponse extends du<PlannedDriveResponse, Builder> implements PlannedDriveResponseOrBuilder {
    private static final PlannedDriveResponse DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int ERROR_TITLE_FIELD_NUMBER = 2;
    private static volatile fo<PlannedDriveResponse> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean success_;
    private String errorTitle_ = "";
    private String errorMessage_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.planned_drive.PlannedDriveResponse$1, reason: invalid class name */
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
    public final class Builder extends dm<PlannedDriveResponse, Builder> implements PlannedDriveResponseOrBuilder {
        private Builder() {
            super(PlannedDriveResponse.DEFAULT_INSTANCE);
        }

        public Builder clearErrorMessage() {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).clearErrorMessage();
            return this;
        }

        public Builder clearErrorTitle() {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).clearErrorTitle();
            return this;
        }

        public Builder clearSuccess() {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).clearSuccess();
            return this;
        }

        @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
        public String getErrorMessage() {
            return ((PlannedDriveResponse) this.instance).getErrorMessage();
        }

        @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
        public v getErrorMessageBytes() {
            return ((PlannedDriveResponse) this.instance).getErrorMessageBytes();
        }

        @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
        public String getErrorTitle() {
            return ((PlannedDriveResponse) this.instance).getErrorTitle();
        }

        @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
        public v getErrorTitleBytes() {
            return ((PlannedDriveResponse) this.instance).getErrorTitleBytes();
        }

        @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
        public boolean getSuccess() {
            return ((PlannedDriveResponse) this.instance).getSuccess();
        }

        @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
        public boolean hasErrorMessage() {
            return ((PlannedDriveResponse) this.instance).hasErrorMessage();
        }

        @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
        public boolean hasErrorTitle() {
            return ((PlannedDriveResponse) this.instance).hasErrorTitle();
        }

        public Builder setErrorMessage(String str) {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).setErrorMessage(str);
            return this;
        }

        public Builder setErrorMessageBytes(v vVar) {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).setErrorMessageBytes(vVar);
            return this;
        }

        public Builder setErrorTitle(String str) {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).setErrorTitle(str);
            return this;
        }

        public Builder setErrorTitleBytes(v vVar) {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).setErrorTitleBytes(vVar);
            return this;
        }

        public Builder setSuccess(boolean z) {
            copyOnWrite();
            ((PlannedDriveResponse) this.instance).setSuccess(z);
            return this;
        }
    }

    static {
        PlannedDriveResponse plannedDriveResponse = new PlannedDriveResponse();
        DEFAULT_INSTANCE = plannedDriveResponse;
        du.registerDefaultInstance(PlannedDriveResponse.class, plannedDriveResponse);
    }

    private PlannedDriveResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.bitField0_ &= -3;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorTitle() {
        this.bitField0_ &= -2;
        this.errorTitle_ = getDefaultInstance().getErrorTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.success_ = false;
    }

    public static PlannedDriveResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlannedDriveResponse parseDelimitedFrom(InputStream inputStream) {
        return (PlannedDriveResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlannedDriveResponse parseFrom(v vVar) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PlannedDriveResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorMessage_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.errorTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.errorTitle_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.success_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "success_", "errorTitle_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new PlannedDriveResponse();
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
        fo<PlannedDriveResponse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PlannedDriveResponse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
    public String getErrorMessage() {
        return this.errorMessage_;
    }

    @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
    public v getErrorMessageBytes() {
        return v.s(this.errorMessage_);
    }

    @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
    public String getErrorTitle() {
        return this.errorTitle_;
    }

    @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
    public v getErrorTitleBytes() {
        return v.s(this.errorTitle_);
    }

    @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
    public boolean getSuccess() {
        return this.success_;
    }

    @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
    public boolean hasErrorMessage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.planned_drive.PlannedDriveResponseOrBuilder
    public boolean hasErrorTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(PlannedDriveResponse plannedDriveResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(plannedDriveResponse);
    }

    public static PlannedDriveResponse parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PlannedDriveResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PlannedDriveResponse parseFrom(v vVar, de deVar) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PlannedDriveResponse parseFrom(z zVar) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PlannedDriveResponse parseFrom(z zVar, de deVar) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static PlannedDriveResponse parseFrom(InputStream inputStream) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlannedDriveResponse parseFrom(InputStream inputStream, de deVar) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PlannedDriveResponse parseFrom(ByteBuffer byteBuffer) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PlannedDriveResponse parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static PlannedDriveResponse parseFrom(byte[] bArr) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlannedDriveResponse parseFrom(byte[] bArr, de deVar) {
        return (PlannedDriveResponse) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
