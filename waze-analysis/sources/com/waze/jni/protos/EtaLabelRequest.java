package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.EtaLabelData;
import com.waze.jni.protos.EtaLabelDefinitions;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelRequest extends du<EtaLabelRequest, Builder> implements EtaLabelRequestOrBuilder {
    private static final EtaLabelRequest DEFAULT_INSTANCE;
    public static final int LABEL_DATA_FIELD_NUMBER = 2;
    private static volatile fo<EtaLabelRequest> PARSER = null;
    public static final int PIN_ALIGNMENTS_TO_GENERATE_FIELD_NUMBER = 3;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private static final el<EtaLabelDefinitions.PinAlignment> pinAlignmentsToGenerate_converter_ = new el<EtaLabelDefinitions.PinAlignment>() { // from class: com.waze.jni.protos.EtaLabelRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.v.el
        public EtaLabelDefinitions.PinAlignment convert(int i2) {
            EtaLabelDefinitions.PinAlignment pinAlignmentForNumber = EtaLabelDefinitions.PinAlignment.forNumber(i2);
            return pinAlignmentForNumber == null ? EtaLabelDefinitions.PinAlignment.UNRECOGNIZED : pinAlignmentForNumber;
        }
    };
    private int bitField0_;
    private EtaLabelData labelData_;
    private int pinAlignmentsToGenerateMemoizedSerializedSize;
    private ek pinAlignmentsToGenerate_ = emptyIntList();
    private int requestId_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.EtaLabelRequest$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 {
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
        EtaLabelRequest etaLabelRequest = new EtaLabelRequest();
        DEFAULT_INSTANCE = etaLabelRequest;
        du.registerDefaultInstance(EtaLabelRequest.class, etaLabelRequest);
    }

    private EtaLabelRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPinAlignmentsToGenerate(Iterable<? extends EtaLabelDefinitions.PinAlignment> iterable) {
        ensurePinAlignmentsToGenerateIsMutable();
        Iterator<? extends EtaLabelDefinitions.PinAlignment> it = iterable.iterator();
        while (it.hasNext()) {
            this.pinAlignmentsToGenerate_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPinAlignmentsToGenerateValue(Iterable<Integer> iterable) {
        ensurePinAlignmentsToGenerateIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.pinAlignmentsToGenerate_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPinAlignmentsToGenerate(EtaLabelDefinitions.PinAlignment pinAlignment) {
        Objects.requireNonNull(pinAlignment);
        ensurePinAlignmentsToGenerateIsMutable();
        this.pinAlignmentsToGenerate_.i(pinAlignment.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPinAlignmentsToGenerateValue(int i2) {
        ensurePinAlignmentsToGenerateIsMutable();
        this.pinAlignmentsToGenerate_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelData() {
        this.labelData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinAlignmentsToGenerate() {
        this.pinAlignmentsToGenerate_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = 0;
    }

    private void ensurePinAlignmentsToGenerateIsMutable() {
        ek ekVar = this.pinAlignmentsToGenerate_;
        if (ekVar.c()) {
            return;
        }
        this.pinAlignmentsToGenerate_ = du.mutableCopy(ekVar);
    }

    public static EtaLabelRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabelData(EtaLabelData etaLabelData) {
        Objects.requireNonNull(etaLabelData);
        EtaLabelData etaLabelData2 = this.labelData_;
        if (etaLabelData2 != null && etaLabelData2 != EtaLabelData.getDefaultInstance()) {
            EtaLabelData.Builder builderNewBuilder = EtaLabelData.newBuilder(etaLabelData2);
            builderNewBuilder.mergeFrom((EtaLabelData.Builder) etaLabelData);
            etaLabelData = builderNewBuilder.buildPartial();
        }
        this.labelData_ = etaLabelData;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EtaLabelRequest parseDelimitedFrom(InputStream inputStream) {
        return (EtaLabelRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelRequest parseFrom(v vVar) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EtaLabelRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelData(EtaLabelData etaLabelData) {
        Objects.requireNonNull(etaLabelData);
        this.labelData_ = etaLabelData;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinAlignmentsToGenerate(int i2, EtaLabelDefinitions.PinAlignment pinAlignment) {
        Objects.requireNonNull(pinAlignment);
        ensurePinAlignmentsToGenerateIsMutable();
        this.pinAlignmentsToGenerate_.e(i2, pinAlignment.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinAlignmentsToGenerateValue(int i2, int i3) {
        ensurePinAlignmentsToGenerateIsMutable();
        this.pinAlignmentsToGenerate_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(int i2) {
        this.requestId_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002ဉ\u0000\u0003,", new Object[]{"bitField0_", "requestId_", "labelData_", "pinAlignmentsToGenerate_"});
        }
        if (iOrdinal == 3) {
            return new EtaLabelRequest();
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
        fo<EtaLabelRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EtaLabelRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public EtaLabelData getLabelData() {
        EtaLabelData etaLabelData = this.labelData_;
        return etaLabelData == null ? EtaLabelData.getDefaultInstance() : etaLabelData;
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public EtaLabelDefinitions.PinAlignment getPinAlignmentsToGenerate(int i2) {
        EtaLabelDefinitions.PinAlignment pinAlignmentForNumber = EtaLabelDefinitions.PinAlignment.forNumber(this.pinAlignmentsToGenerate_.d(i2));
        return pinAlignmentForNumber == null ? EtaLabelDefinitions.PinAlignment.UNRECOGNIZED : pinAlignmentForNumber;
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public int getPinAlignmentsToGenerateCount() {
        return this.pinAlignmentsToGenerate_.size();
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public List<EtaLabelDefinitions.PinAlignment> getPinAlignmentsToGenerateList() {
        return new em(this.pinAlignmentsToGenerate_, pinAlignmentsToGenerate_converter_);
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public int getPinAlignmentsToGenerateValue(int i2) {
        return this.pinAlignmentsToGenerate_.d(i2);
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public List<Integer> getPinAlignmentsToGenerateValueList() {
        return this.pinAlignmentsToGenerate_;
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public int getRequestId() {
        return this.requestId_;
    }

    @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
    public boolean hasLabelData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(EtaLabelRequest etaLabelRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(etaLabelRequest);
    }

    public static EtaLabelRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EtaLabelRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelRequest parseFrom(v vVar, de deVar) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EtaLabelRequest parseFrom(z zVar) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EtaLabelRequest parseFrom(z zVar, de deVar) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static EtaLabelRequest parseFrom(InputStream inputStream) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelRequest parseFrom(InputStream inputStream, de deVar) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelRequest parseFrom(ByteBuffer byteBuffer) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EtaLabelRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<EtaLabelRequest, Builder> implements EtaLabelRequestOrBuilder {
        private Builder() {
            super(EtaLabelRequest.DEFAULT_INSTANCE);
        }

        public Builder addAllPinAlignmentsToGenerate(Iterable<? extends EtaLabelDefinitions.PinAlignment> iterable) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).addAllPinAlignmentsToGenerate(iterable);
            return this;
        }

        public Builder addAllPinAlignmentsToGenerateValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).addAllPinAlignmentsToGenerateValue(iterable);
            return this;
        }

        public Builder addPinAlignmentsToGenerate(EtaLabelDefinitions.PinAlignment pinAlignment) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).addPinAlignmentsToGenerate(pinAlignment);
            return this;
        }

        public Builder addPinAlignmentsToGenerateValue(int i2) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).addPinAlignmentsToGenerateValue(i2);
            return this;
        }

        public Builder clearLabelData() {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).clearLabelData();
            return this;
        }

        public Builder clearPinAlignmentsToGenerate() {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).clearPinAlignmentsToGenerate();
            return this;
        }

        public Builder clearRequestId() {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).clearRequestId();
            return this;
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public EtaLabelData getLabelData() {
            return ((EtaLabelRequest) this.instance).getLabelData();
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public EtaLabelDefinitions.PinAlignment getPinAlignmentsToGenerate(int i2) {
            return ((EtaLabelRequest) this.instance).getPinAlignmentsToGenerate(i2);
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public int getPinAlignmentsToGenerateCount() {
            return ((EtaLabelRequest) this.instance).getPinAlignmentsToGenerateCount();
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public List<EtaLabelDefinitions.PinAlignment> getPinAlignmentsToGenerateList() {
            return ((EtaLabelRequest) this.instance).getPinAlignmentsToGenerateList();
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public int getPinAlignmentsToGenerateValue(int i2) {
            return ((EtaLabelRequest) this.instance).getPinAlignmentsToGenerateValue(i2);
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public List<Integer> getPinAlignmentsToGenerateValueList() {
            return DesugarCollections.unmodifiableList(((EtaLabelRequest) this.instance).getPinAlignmentsToGenerateValueList());
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public int getRequestId() {
            return ((EtaLabelRequest) this.instance).getRequestId();
        }

        @Override // com.waze.jni.protos.EtaLabelRequestOrBuilder
        public boolean hasLabelData() {
            return ((EtaLabelRequest) this.instance).hasLabelData();
        }

        public Builder mergeLabelData(EtaLabelData etaLabelData) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).mergeLabelData(etaLabelData);
            return this;
        }

        public Builder setLabelData(EtaLabelData.Builder builder) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).setLabelData(builder.build());
            return this;
        }

        public Builder setPinAlignmentsToGenerate(int i2, EtaLabelDefinitions.PinAlignment pinAlignment) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).setPinAlignmentsToGenerate(i2, pinAlignment);
            return this;
        }

        public Builder setPinAlignmentsToGenerateValue(int i2, int i3) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).setPinAlignmentsToGenerateValue(i2, i3);
            return this;
        }

        public Builder setRequestId(int i2) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).setRequestId(i2);
            return this;
        }

        public Builder setLabelData(EtaLabelData etaLabelData) {
            copyOnWrite();
            ((EtaLabelRequest) this.instance).setLabelData(etaLabelData);
            return this;
        }
    }

    public static EtaLabelRequest parseFrom(byte[] bArr) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EtaLabelRequest parseFrom(byte[] bArr, de deVar) {
        return (EtaLabelRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
