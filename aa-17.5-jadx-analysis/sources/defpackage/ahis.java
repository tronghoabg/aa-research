package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahis extends ahon<ahis> implements ahph {
    public static ahpi<ahis> PARSER = new ahiq();
    private static final ahis defaultInstance;
    private List<ahgx> annotation_;
    private List<ahgx> backingFieldAnnotation_;
    private int bitField0_;
    private List<ahhf> compilerPluginData_;
    private List<ahkb> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ahjn> contextReceiverType_;
    private List<ahgx> delegateFieldAnnotation_;
    private List<ahgx> extensionReceiverAnnotation_;
    private int flags_;
    private List<ahgx> getterAnnotation_;
    private ahhl getterContract_;
    private int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ahjn receiverType_;
    private int returnTypeId_;
    private ahjn returnType_;
    private List<ahgx> setterAnnotation_;
    private ahhl setterContract_;
    private int setterFlags_;
    private ahkb setterValueParameter_;
    private List<ahjv> typeParameter_;
    private final ahoa unknownFields;
    private List<Integer> versionRequirement_;

    static {
        ahis ahisVar = new ahis(true);
        defaultInstance = ahisVar;
        ahisVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private ahis(ahoc ahocVar, ahog ahogVar) throws Throwable {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        boolean z = true;
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z2 = false;
        char c = 0;
        while (true) {
            boolean z3 = z;
            try {
                if (z2) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.contextReceiverType_ = DesugarCollections.unmodifiableList(this.contextReceiverType_);
                    }
                    if (((c == true ? 1 : 0) & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                        this.contextReceiverTypeId_ = DesugarCollections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if (((c == true ? 1 : 0) & 65536) == 65536) {
                        this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                    }
                    if (((c == true ? 1 : 0) & 131072) == 131072) {
                        this.getterAnnotation_ = DesugarCollections.unmodifiableList(this.getterAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                        this.setterAnnotation_ = DesugarCollections.unmodifiableList(this.setterAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.contextParameter_ = DesugarCollections.unmodifiableList(this.contextParameter_);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
                    }
                    if (((c == true ? 1 : 0) & 32768) == 32768) {
                        this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
                    }
                    if (((c == true ? 1 : 0) & 524288) == 524288) {
                        this.extensionReceiverAnnotation_ = DesugarCollections.unmodifiableList(this.extensionReceiverAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                        this.backingFieldAnnotation_ = DesugarCollections.unmodifiableList(this.backingFieldAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & 2097152) == 2097152) {
                        this.delegateFieldAnnotation_ = DesugarCollections.unmodifiableList(this.delegateFieldAnnotation_);
                    }
                    try {
                        ahoeVarNewInstance.flush();
                    } catch (IOException unused) {
                    }
                    this.unknownFields = ahnzVarNewOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        int tag = ahocVar.readTag();
                        switch (tag) {
                            case 0:
                                z = z3;
                                z2 = z;
                            case 8:
                                this.bitField0_ |= 2;
                                this.oldFlags_ = ahocVar.readInt32();
                                z = z3;
                            case 16:
                                this.bitField0_ |= 4;
                                this.name_ = ahocVar.readInt32();
                                z = z3;
                            case 26:
                                ahjm builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                ahjn ahjnVar = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                this.returnType_ = ahjnVar;
                                if (builder != null) {
                                    builder.mergeFrom(ahjnVar);
                                    this.returnType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                                z = z3;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.typeParameter_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.typeParameter_.add(ahocVar.readMessage(ahjv.PARSER, ahogVar));
                                z = z3;
                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                ahjm builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                ahjn ahjnVar2 = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                this.receiverType_ = ahjnVar2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(ahjnVar2);
                                    this.receiverType_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 32;
                                z = z3;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                ahka builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                                ahkb ahkbVar = (ahkb) ahocVar.readMessage(ahkb.PARSER, ahogVar);
                                this.setterValueParameter_ = ahkbVar;
                                if (builder3 != null) {
                                    builder3.mergeFrom(ahkbVar);
                                    this.setterValueParameter_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= 128;
                                z = z3;
                            case 56:
                                this.bitField0_ |= 256;
                                this.getterFlags_ = ahocVar.readInt32();
                                z = z3;
                            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                                this.setterFlags_ = ahocVar.readInt32();
                                z = z3;
                            case 72:
                                this.bitField0_ |= 16;
                                this.returnTypeId_ = ahocVar.readInt32();
                                z = z3;
                            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                this.bitField0_ |= 64;
                                this.receiverTypeId_ = ahocVar.readInt32();
                                z = z3;
                            case 88:
                                this.bitField0_ |= 1;
                                this.flags_ = ahocVar.readInt32();
                                z = z3;
                            case 98:
                                int i2 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i2 != 256) {
                                    this.contextReceiverType_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.contextReceiverType_.add(ahocVar.readMessage(ahjn.PARSER, ahogVar));
                                z = z3;
                            case 104:
                                int i3 = (c == true ? 1 : 0) & sk.AUDIO_CONTENT_BUFFER_SIZE;
                                c = c;
                                if (i3 != 512) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.contextReceiverTypeId_.add(Integer.valueOf(ahocVar.readInt32()));
                                z = z3;
                            case 106:
                                int iPushLimit = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                int i4 = (c == true ? 1 : 0) & sk.AUDIO_CONTENT_BUFFER_SIZE;
                                c = c;
                                if (i4 != 512) {
                                    c = c;
                                    if (ahocVar.getBytesUntilLimit() > 0) {
                                        this.contextReceiverTypeId_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (ahocVar.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_.add(Integer.valueOf(ahocVar.readInt32()));
                                }
                                ahocVar.popLimit(iPushLimit);
                                z = z3;
                            case 114:
                                int i5 = (c == true ? 1 : 0) & 65536;
                                c = c;
                                if (i5 != 65536) {
                                    this.annotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                z = z3;
                            case 122:
                                int i6 = (c == true ? 1 : 0) & 131072;
                                c = c;
                                if (i6 != 131072) {
                                    this.getterAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getterAnnotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                z = z3;
                            case 130:
                                int i7 = (c == true ? 1 : 0) & 262144;
                                c = c;
                                if (i7 != 262144) {
                                    this.setterAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.setterAnnotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                z = z3;
                            case 138:
                                int i8 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i8 != 1024) {
                                    this.contextParameter_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.contextParameter_.add(ahocVar.readMessage(ahkb.PARSER, ahogVar));
                                z = z3;
                            case 248:
                                int i9 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i9 != 16384) {
                                    this.versionRequirement_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 16384;
                                }
                                this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                                z = z3;
                            case 250:
                                int iPushLimit2 = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                int i10 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i10 != 16384) {
                                    c = c;
                                    if (ahocVar.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (ahocVar.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                                }
                                ahocVar.popLimit(iPushLimit2);
                                z = z3;
                            case 258:
                                int i11 = (c == true ? 1 : 0) & 32768;
                                c = c;
                                if (i11 != 32768) {
                                    this.compilerPluginData_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 32768;
                                }
                                this.compilerPluginData_.add(ahocVar.readMessage(ahhf.PARSER, ahogVar));
                                z = z3;
                            case 266:
                                int i12 = (c == true ? 1 : 0) & 524288;
                                c = c;
                                if (i12 != 524288) {
                                    this.extensionReceiverAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.extensionReceiverAnnotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                z = z3;
                            case 274:
                                int i13 = (c == true ? 1 : 0) & 1048576;
                                c = c;
                                if (i13 != 1048576) {
                                    this.backingFieldAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.backingFieldAnnotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                z = z3;
                            case 282:
                                int i14 = (c == true ? 1 : 0) & 2097152;
                                c = c;
                                if (i14 != 2097152) {
                                    this.delegateFieldAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.delegateFieldAnnotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                z = z3;
                            case 322:
                                ahhk builder4 = (this.bitField0_ & 1024) == 1024 ? this.getterContract_.toBuilder() : null;
                                ahhl ahhlVar = (ahhl) ahocVar.readMessage(ahhl.PARSER, ahogVar);
                                this.getterContract_ = ahhlVar;
                                if (builder4 != null) {
                                    builder4.mergeFrom(ahhlVar);
                                    this.getterContract_ = builder4.buildPartial();
                                }
                                this.bitField0_ |= 1024;
                                z = z3;
                            case 330:
                                try {
                                    ahhk builder5 = (this.bitField0_ & 2048) == 2048 ? this.setterContract_.toBuilder() : null;
                                    ahhl ahhlVar2 = (ahhl) ahocVar.readMessage(ahhl.PARSER, ahogVar);
                                    this.setterContract_ = ahhlVar2;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(ahhlVar2);
                                        this.setterContract_ = builder5.buildPartial();
                                    }
                                    this.bitField0_ |= 2048;
                                    z = z3;
                                } catch (ahou e) {
                                    e = e;
                                    e.setUnfinishedMessage(this);
                                    throw e;
                                } catch (IOException e2) {
                                    e = e2;
                                    ahou ahouVar = new ahou(e.getMessage());
                                    ahouVar.setUnfinishedMessage(this);
                                    throw ahouVar;
                                } catch (Throwable th) {
                                    th = th;
                                    if (((c == true ? 1 : 0) & 32) == 32) {
                                        this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
                                    }
                                    if (((c == true ? 1 : 0) & 256) == 256) {
                                        this.contextReceiverType_ = DesugarCollections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if (((c == true ? 1 : 0) & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                                        this.contextReceiverTypeId_ = DesugarCollections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if (((c == true ? 1 : 0) & 65536) == 65536) {
                                        this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                                    }
                                    if (((c == true ? 1 : 0) & 131072) == 131072) {
                                        this.getterAnnotation_ = DesugarCollections.unmodifiableList(this.getterAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & 262144) == 262144) {
                                        this.setterAnnotation_ = DesugarCollections.unmodifiableList(this.setterAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                                        this.contextParameter_ = DesugarCollections.unmodifiableList(this.contextParameter_);
                                    }
                                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                                        this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
                                    }
                                    if (((c == true ? 1 : 0) & 32768) == 32768) {
                                        this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
                                    }
                                    if (((c == true ? 1 : 0) & 524288) == 524288) {
                                        this.extensionReceiverAnnotation_ = DesugarCollections.unmodifiableList(this.extensionReceiverAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & 1048576) == 1048576) {
                                        this.backingFieldAnnotation_ = DesugarCollections.unmodifiableList(this.backingFieldAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & 2097152) == 2097152) {
                                        this.delegateFieldAnnotation_ = DesugarCollections.unmodifiableList(this.delegateFieldAnnotation_);
                                    }
                                    try {
                                        ahoeVarNewInstance.flush();
                                    } catch (IOException unused2) {
                                    }
                                    this.unknownFields = ahnzVarNewOutput.toByteString();
                                    makeExtensionsImmutable();
                                    throw th;
                                }
                            default:
                                if (parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                                    z = z3;
                                } else {
                                    z = z3;
                                    z2 = z;
                                }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (ahou e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th3) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th3;
            }
        }
    }

    public static ahis getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        this.returnType_ = ahjn.getDefaultInstance();
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.EMPTY_LIST;
        this.receiverType_ = ahjn.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = Collections.EMPTY_LIST;
        this.contextReceiverTypeId_ = Collections.EMPTY_LIST;
        this.contextParameter_ = Collections.EMPTY_LIST;
        this.setterValueParameter_ = ahkb.getDefaultInstance();
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = Collections.EMPTY_LIST;
        this.compilerPluginData_ = Collections.EMPTY_LIST;
        this.annotation_ = Collections.EMPTY_LIST;
        this.getterAnnotation_ = Collections.EMPTY_LIST;
        this.setterAnnotation_ = Collections.EMPTY_LIST;
        this.extensionReceiverAnnotation_ = Collections.EMPTY_LIST;
        this.backingFieldAnnotation_ = Collections.EMPTY_LIST;
        this.delegateFieldAnnotation_ = Collections.EMPTY_LIST;
        this.getterContract_ = ahhl.getDefaultInstance();
        this.setterContract_ = ahhl.getDefaultInstance();
    }

    public static ahir newBuilder(ahis ahisVar) {
        ahir ahirVarNewBuilder = newBuilder();
        ahirVarNewBuilder.mergeFrom(ahisVar);
        return ahirVarNewBuilder;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ahgx> getAnnotationList() {
        return this.annotation_;
    }

    public ahgx getBackingFieldAnnotation(int i) {
        return this.backingFieldAnnotation_.get(i);
    }

    public int getBackingFieldAnnotationCount() {
        return this.backingFieldAnnotation_.size();
    }

    public List<ahgx> getBackingFieldAnnotationList() {
        return this.backingFieldAnnotation_;
    }

    public ahhf getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public List<ahhf> getCompilerPluginDataList() {
        return this.compilerPluginData_;
    }

    public ahkb getContextParameter(int i) {
        return this.contextParameter_.get(i);
    }

    public int getContextParameterCount() {
        return this.contextParameter_.size();
    }

    public List<ahkb> getContextParameterList() {
        return this.contextParameter_;
    }

    public ahjn getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    public List<Integer> getContextReceiverTypeIdList() {
        return this.contextReceiverTypeId_;
    }

    public List<ahjn> getContextReceiverTypeList() {
        return this.contextReceiverType_;
    }

    public ahgx getDelegateFieldAnnotation(int i) {
        return this.delegateFieldAnnotation_.get(i);
    }

    public int getDelegateFieldAnnotationCount() {
        return this.delegateFieldAnnotation_.size();
    }

    public List<ahgx> getDelegateFieldAnnotationList() {
        return this.delegateFieldAnnotation_;
    }

    public ahgx getExtensionReceiverAnnotation(int i) {
        return this.extensionReceiverAnnotation_.get(i);
    }

    public int getExtensionReceiverAnnotationCount() {
        return this.extensionReceiverAnnotation_.size();
    }

    public List<ahgx> getExtensionReceiverAnnotationList() {
        return this.extensionReceiverAnnotation_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public ahgx getGetterAnnotation(int i) {
        return this.getterAnnotation_.get(i);
    }

    public int getGetterAnnotationCount() {
        return this.getterAnnotation_.size();
    }

    public List<ahgx> getGetterAnnotationList() {
        return this.getterAnnotation_;
    }

    public ahhl getGetterContract() {
        return this.getterContract_;
    }

    public int getGetterFlags() {
        return this.getterFlags_;
    }

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahis> getParserForType() {
        return PARSER;
    }

    public ahjn getReceiverType() {
        return this.receiverType_;
    }

    public int getReceiverTypeId() {
        return this.receiverTypeId_;
    }

    public ahjn getReturnType() {
        return this.returnType_;
    }

    public int getReturnTypeId() {
        return this.returnTypeId_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 2) == 2 ? ahoe.computeInt32Size(1, this.oldFlags_) : 0;
        if ((i2 & 4) == 4) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.name_);
        }
        if ((i2 & 8) == 8) {
            iComputeInt32Size += ahoe.computeMessageSize(3, this.returnType_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            iComputeInt32Size += ahoe.computeMessageSize(4, this.typeParameter_.get(i3));
        }
        if ((this.bitField0_ & 32) == 32) {
            iComputeInt32Size += ahoe.computeMessageSize(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            iComputeInt32Size += ahoe.computeMessageSize(6, this.setterValueParameter_);
        }
        int i4 = this.bitField0_;
        if ((i4 & 256) == 256) {
            iComputeInt32Size += ahoe.computeInt32Size(7, this.getterFlags_);
        }
        if ((i4 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            iComputeInt32Size += ahoe.computeInt32Size(8, this.setterFlags_);
        }
        if ((i4 & 16) == 16) {
            iComputeInt32Size += ahoe.computeInt32Size(9, this.returnTypeId_);
        }
        if ((i4 & 64) == 64) {
            iComputeInt32Size += ahoe.computeInt32Size(10, this.receiverTypeId_);
        }
        if ((i4 & 1) == 1) {
            iComputeInt32Size += ahoe.computeInt32Size(11, this.flags_);
        }
        for (int i5 = 0; i5 < this.contextReceiverType_.size(); i5++) {
            iComputeInt32Size += ahoe.computeMessageSize(12, this.contextReceiverType_.get(i5));
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i6 = 0; i6 < this.contextReceiverTypeId_.size(); i6++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.contextReceiverTypeId_.get(i6).intValue());
        }
        int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iComputeMessageSize = iComputeMessageSize + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
        for (int i7 = 0; i7 < this.annotation_.size(); i7++) {
            iComputeMessageSize += ahoe.computeMessageSize(14, this.annotation_.get(i7));
        }
        for (int i8 = 0; i8 < this.getterAnnotation_.size(); i8++) {
            iComputeMessageSize += ahoe.computeMessageSize(15, this.getterAnnotation_.get(i8));
        }
        for (int i9 = 0; i9 < this.setterAnnotation_.size(); i9++) {
            iComputeMessageSize += ahoe.computeMessageSize(16, this.setterAnnotation_.get(i9));
        }
        for (int i10 = 0; i10 < this.contextParameter_.size(); i10++) {
            iComputeMessageSize += ahoe.computeMessageSize(17, this.contextParameter_.get(i10));
        }
        int iComputeInt32SizeNoTag2 = 0;
        for (int i11 = 0; i11 < this.versionRequirement_.size(); i11++) {
            iComputeInt32SizeNoTag2 += ahoe.computeInt32SizeNoTag(this.versionRequirement_.get(i11).intValue());
        }
        int size = getVersionRequirementList().size();
        int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2 + size + size;
        for (int i12 = 0; i12 < this.compilerPluginData_.size(); i12++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(32, this.compilerPluginData_.get(i12));
        }
        for (int i13 = 0; i13 < this.extensionReceiverAnnotation_.size(); i13++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(33, this.extensionReceiverAnnotation_.get(i13));
        }
        for (int i14 = 0; i14 < this.backingFieldAnnotation_.size(); i14++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(34, this.backingFieldAnnotation_.get(i14));
        }
        for (int i15 = 0; i15 < this.delegateFieldAnnotation_.size(); i15++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(35, this.delegateFieldAnnotation_.get(i15));
        }
        if ((this.bitField0_ & 1024) == 1024) {
            iComputeMessageSize2 += ahoe.computeMessageSize(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            iComputeMessageSize2 += ahoe.computeMessageSize(41, this.setterContract_);
        }
        int iExtensionsSerializedSize = iComputeMessageSize2 + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ahgx getSetterAnnotation(int i) {
        return this.setterAnnotation_.get(i);
    }

    public int getSetterAnnotationCount() {
        return this.setterAnnotation_.size();
    }

    public List<ahgx> getSetterAnnotationList() {
        return this.setterAnnotation_;
    }

    public ahhl getSetterContract() {
        return this.setterContract_;
    }

    public int getSetterFlags() {
        return this.setterFlags_;
    }

    public ahkb getSetterValueParameter() {
        return this.setterValueParameter_;
    }

    public ahjv getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public List<ahjv> getTypeParameterList() {
        return this.typeParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasGetterContract() {
        return (this.bitField0_ & 1024) == 1024;
    }

    public boolean hasGetterFlags() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasOldFlags() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasReceiverType() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasReceiverTypeId() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasReturnType() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasReturnTypeId() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasSetterContract() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public boolean hasSetterFlags() {
        return (this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512;
    }

    public boolean hasSetterValueParameter() {
        return (this.bitField0_ & 128) == 128;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.ahph
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        ?? r1 = 1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (hasName() && (!hasReturnType() || getReturnType().isInitialized())) {
            int i = 0;
            while (true) {
                if (i >= getTypeParameterCount()) {
                    if (!hasReceiverType() || getReceiverType().isInitialized()) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= getContextReceiverTypeCount()) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= getContextParameterCount()) {
                                        if (!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) {
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 >= getCompilerPluginDataCount()) {
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i5 >= getAnnotationCount()) {
                                                            int i6 = 0;
                                                            while (true) {
                                                                if (i6 >= getGetterAnnotationCount()) {
                                                                    int i7 = 0;
                                                                    while (true) {
                                                                        if (i7 >= getSetterAnnotationCount()) {
                                                                            int i8 = 0;
                                                                            while (true) {
                                                                                if (i8 >= getExtensionReceiverAnnotationCount()) {
                                                                                    int i9 = 0;
                                                                                    while (true) {
                                                                                        if (i9 >= getBackingFieldAnnotationCount()) {
                                                                                            int i10 = 0;
                                                                                            while (true) {
                                                                                                if (i10 >= getDelegateFieldAnnotationCount()) {
                                                                                                    if ((hasGetterContract() && !getGetterContract().isInitialized()) || ((hasSetterContract() && !getSetterContract().isInitialized()) || !extensionsAreInitialized())) {
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i10++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (!getBackingFieldAnnotation(i9).isInitialized()) {
                                                                                                break;
                                                                                            }
                                                                                            i9++;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                                                                                        break;
                                                                                    }
                                                                                    i8++;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (!getSetterAnnotation(i7).isInitialized()) {
                                                                                break;
                                                                            }
                                                                            i7++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (!getGetterAnnotation(i6).isInitialized()) {
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            }
                                                        } else {
                                                            if (!getAnnotation(i5).isInitialized()) {
                                                                break;
                                                            }
                                                            i5++;
                                                        }
                                                    }
                                                } else {
                                                    if (!getCompilerPluginData(i4).isInitialized()) {
                                                        break;
                                                    }
                                                    i4++;
                                                }
                                            }
                                        }
                                    } else {
                                        if (!getContextParameter(i3).isInitialized()) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                if (!getContextReceiverType(i2).isInitialized()) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                } else {
                    if (!getTypeParameter(i).isInitialized()) {
                        break;
                    }
                    i++;
                }
            }
            r1 = 0;
        } else {
            r1 = 0;
        }
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahir newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahir toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeInt32(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeMessage(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            ahoeVar.writeMessage(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            ahoeVar.writeMessage(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            ahoeVar.writeMessage(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            ahoeVar.writeInt32(7, this.getterFlags_);
        }
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            ahoeVar.writeInt32(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeInt32(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            ahoeVar.writeInt32(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            ahoeVar.writeMessage(12, this.contextReceiverType_.get(i2));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            ahoeVar.writeRawVarint32(106);
            ahoeVar.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            ahoeVar.writeInt32NoTag(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            ahoeVar.writeMessage(14, this.annotation_.get(i4));
        }
        for (int i5 = 0; i5 < this.getterAnnotation_.size(); i5++) {
            ahoeVar.writeMessage(15, this.getterAnnotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.setterAnnotation_.size(); i6++) {
            ahoeVar.writeMessage(16, this.setterAnnotation_.get(i6));
        }
        for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
            ahoeVar.writeMessage(17, this.contextParameter_.get(i7));
        }
        for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
            ahoeVar.writeInt32(31, this.versionRequirement_.get(i8).intValue());
        }
        for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
            ahoeVar.writeMessage(32, this.compilerPluginData_.get(i9));
        }
        for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
            ahoeVar.writeMessage(33, this.extensionReceiverAnnotation_.get(i10));
        }
        for (int i11 = 0; i11 < this.backingFieldAnnotation_.size(); i11++) {
            ahoeVar.writeMessage(34, this.backingFieldAnnotation_.get(i11));
        }
        for (int i12 = 0; i12 < this.delegateFieldAnnotation_.size(); i12++) {
            ahoeVar.writeMessage(35, this.delegateFieldAnnotation_.get(i12));
        }
        if ((this.bitField0_ & 1024) == 1024) {
            ahoeVar.writeMessage(40, this.getterContract_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            ahoeVar.writeMessage(41, this.setterContract_);
        }
        ahomVarNewExtensionWriter.writeUntil(19000, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahis getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahir newBuilder() {
        return ahir.create();
    }

    public /* synthetic */ ahis(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahis(ahol<ahis, ?> aholVar) {
        super(aholVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahis(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahis, ?>) aholVar);
    }

    private ahis(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
