package com.waze.jni.protos.planned_drive;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ek;
import com.google.v.en;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadPlannedDriveOptionsResponse extends du<LoadPlannedDriveOptionsResponse, Builder> implements LoadPlannedDriveOptionsResponseOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final LoadPlannedDriveOptionsResponse DEFAULT_INSTANCE;
    public static final int ETAS_FIELD_NUMBER = 2;
    public static final int IS_TOO_LATE_FIELD_NUMBER = 4;
    private static volatile fo<LoadPlannedDriveOptionsResponse> PARSER = null;
    public static final int TIMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int code_;
    private boolean isTooLate_;
    private int etasMemoizedSerializedSize = -1;
    private int timesMemoizedSerializedSize = -1;
    private ek etas_ = emptyIntList();
    private en times_ = emptyLongList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse$1, reason: invalid class name */
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
    public final class Builder extends dm<LoadPlannedDriveOptionsResponse, Builder> implements LoadPlannedDriveOptionsResponseOrBuilder {
        private Builder() {
            super(LoadPlannedDriveOptionsResponse.DEFAULT_INSTANCE);
        }

        public Builder addAllEtas(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).addAllEtas(iterable);
            return this;
        }

        public Builder addAllTimes(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).addAllTimes(iterable);
            return this;
        }

        public Builder addEtas(int i2) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).addEtas(i2);
            return this;
        }

        public Builder addTimes(long j2) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).addTimes(j2);
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).clearCode();
            return this;
        }

        public Builder clearEtas() {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).clearEtas();
            return this;
        }

        public Builder clearIsTooLate() {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).clearIsTooLate();
            return this;
        }

        public Builder clearTimes() {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).clearTimes();
            return this;
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public ResponseCode getCode() {
            return ((LoadPlannedDriveOptionsResponse) this.instance).getCode();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public int getCodeValue() {
            return ((LoadPlannedDriveOptionsResponse) this.instance).getCodeValue();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public int getEtas(int i2) {
            return ((LoadPlannedDriveOptionsResponse) this.instance).getEtas(i2);
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public int getEtasCount() {
            return ((LoadPlannedDriveOptionsResponse) this.instance).getEtasCount();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public List<Integer> getEtasList() {
            return DesugarCollections.unmodifiableList(((LoadPlannedDriveOptionsResponse) this.instance).getEtasList());
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public boolean getIsTooLate() {
            return ((LoadPlannedDriveOptionsResponse) this.instance).getIsTooLate();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public long getTimes(int i2) {
            return ((LoadPlannedDriveOptionsResponse) this.instance).getTimes(i2);
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public int getTimesCount() {
            return ((LoadPlannedDriveOptionsResponse) this.instance).getTimesCount();
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public List<Long> getTimesList() {
            return DesugarCollections.unmodifiableList(((LoadPlannedDriveOptionsResponse) this.instance).getTimesList());
        }

        @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
        public boolean hasIsTooLate() {
            return ((LoadPlannedDriveOptionsResponse) this.instance).hasIsTooLate();
        }

        public Builder setCode(ResponseCode responseCode) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).setCode(responseCode);
            return this;
        }

        public Builder setCodeValue(int i2) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).setCodeValue(i2);
            return this;
        }

        public Builder setEtas(int i2, int i3) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).setEtas(i2, i3);
            return this;
        }

        public Builder setIsTooLate(boolean z) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).setIsTooLate(z);
            return this;
        }

        public Builder setTimes(int i2, long j2) {
            copyOnWrite();
            ((LoadPlannedDriveOptionsResponse) this.instance).setTimes(i2, j2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum ResponseCode implements eg {
        OK(0),
        GENERAL_ERROR(1),
        NETWORK_ERROR(2),
        ROUTE_TOO_LONG(3),
        QUOTA_EXCEEDED(4),
        NO_CURRENT_LOCATION(5),
        UNRECOGNIZED(-1);

        public static final int GENERAL_ERROR_VALUE = 1;
        public static final int NETWORK_ERROR_VALUE = 2;
        public static final int NO_CURRENT_LOCATION_VALUE = 5;
        public static final int OK_VALUE = 0;
        public static final int QUOTA_EXCEEDED_VALUE = 4;
        public static final int ROUTE_TOO_LONG_VALUE = 3;
        private static final eh<ResponseCode> internalValueMap = new eh<ResponseCode>() { // from class: com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse.ResponseCode.1
            @Override // com.google.v.eh
            public ResponseCode findValueByNumber(int i2) {
                return ResponseCode.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class ResponseCodeVerifier implements ei {
            static final ei INSTANCE = new ResponseCodeVerifier();

            private ResponseCodeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return ResponseCode.forNumber(i2) != null;
            }
        }

        ResponseCode(int i2) {
            this.value = i2;
        }

        public static ResponseCode forNumber(int i2) {
            if (i2 == 0) {
                return OK;
            }
            if (i2 == 1) {
                return GENERAL_ERROR;
            }
            if (i2 == 2) {
                return NETWORK_ERROR;
            }
            if (i2 == 3) {
                return ROUTE_TOO_LONG;
            }
            if (i2 == 4) {
                return QUOTA_EXCEEDED;
            }
            if (i2 != 5) {
                return null;
            }
            return NO_CURRENT_LOCATION;
        }

        public static eh<ResponseCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return ResponseCodeVerifier.INSTANCE;
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
        LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse = new LoadPlannedDriveOptionsResponse();
        DEFAULT_INSTANCE = loadPlannedDriveOptionsResponse;
        du.registerDefaultInstance(LoadPlannedDriveOptionsResponse.class, loadPlannedDriveOptionsResponse);
    }

    private LoadPlannedDriveOptionsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEtas(Iterable<? extends Integer> iterable) {
        ensureEtasIsMutable();
        c.addAll(iterable, this.etas_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimes(Iterable<? extends Long> iterable) {
        ensureTimesIsMutable();
        c.addAll(iterable, this.times_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEtas(int i2) {
        ensureEtasIsMutable();
        this.etas_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimes(long j2) {
        ensureTimesIsMutable();
        this.times_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtas() {
        this.etas_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTooLate() {
        this.bitField0_ &= -2;
        this.isTooLate_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimes() {
        this.times_ = emptyLongList();
    }

    private void ensureEtasIsMutable() {
        ek ekVar = this.etas_;
        if (ekVar.c()) {
            return;
        }
        this.etas_ = du.mutableCopy(ekVar);
    }

    private void ensureTimesIsMutable() {
        en enVar = this.times_;
        if (enVar.c()) {
            return;
        }
        this.times_ = du.mutableCopy(enVar);
    }

    public static LoadPlannedDriveOptionsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LoadPlannedDriveOptionsResponse parseDelimitedFrom(InputStream inputStream) {
        return (LoadPlannedDriveOptionsResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(v vVar) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<LoadPlannedDriveOptionsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(ResponseCode responseCode) {
        this.code_ = responseCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeValue(int i2) {
        this.code_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtas(int i2, int i3) {
        ensureEtasIsMutable();
        this.etas_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTooLate(boolean z) {
        this.bitField0_ |= 1;
        this.isTooLate_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimes(int i2, long j2) {
        ensureTimesIsMutable();
        this.times_.d(i2, j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0002'\u0003%\u0004ဇ\u0000", new Object[]{"bitField0_", "code_", "etas_", "times_", "isTooLate_"});
        }
        if (iOrdinal == 3) {
            return new LoadPlannedDriveOptionsResponse();
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
        fo<LoadPlannedDriveOptionsResponse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (LoadPlannedDriveOptionsResponse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public ResponseCode getCode() {
        ResponseCode responseCodeForNumber = ResponseCode.forNumber(this.code_);
        return responseCodeForNumber == null ? ResponseCode.UNRECOGNIZED : responseCodeForNumber;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public int getCodeValue() {
        return this.code_;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public int getEtas(int i2) {
        return this.etas_.d(i2);
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public int getEtasCount() {
        return this.etas_.size();
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public List<Integer> getEtasList() {
        return this.etas_;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public boolean getIsTooLate() {
        return this.isTooLate_;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public long getTimes(int i2) {
        return this.times_.a(i2);
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public int getTimesCount() {
        return this.times_.size();
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public List<Long> getTimesList() {
        return this.times_;
    }

    @Override // com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseOrBuilder
    public boolean hasIsTooLate() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(loadPlannedDriveOptionsResponse);
    }

    public static LoadPlannedDriveOptionsResponse parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (LoadPlannedDriveOptionsResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(v vVar, de deVar) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(z zVar) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(z zVar, de deVar) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(InputStream inputStream) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(InputStream inputStream, de deVar) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(ByteBuffer byteBuffer) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(byte[] bArr) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LoadPlannedDriveOptionsResponse parseFrom(byte[] bArr, de deVar) {
        return (LoadPlannedDriveOptionsResponse) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
