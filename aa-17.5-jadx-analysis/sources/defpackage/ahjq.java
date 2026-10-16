package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjq extends ahon<ahjq> implements ahph {
    public static ahpi<ahjq> PARSER = new ahjo();
    private static final ahjq defaultInstance;
    private List<ahgx> annotation_;
    private int bitField0_;
    private List<ahhf> compilerPluginData_;
    private int expandedTypeId_;
    private ahjn expandedType_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private List<ahjv> typeParameter_;
    private int underlyingTypeId_;
    private ahjn underlyingType_;
    private final ahoa unknownFields;
    private List<Integer> versionRequirement_;

    static {
        ahjq ahjqVar = new ahjq(true);
        defaultInstance = ahjqVar;
        ahjqVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private ahjq(ahoc ahocVar, ahog ahogVar) throws ahou {
        ahjm builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? unknownField = 512;
            try {
                if (z) {
                    if ((i & 4) == 4) {
                        this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 128) == 128) {
                        this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                    }
                    if ((i & 256) == 256) {
                        this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                        this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
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
                                z = true;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = ahocVar.readInt32();
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = ahocVar.readInt32();
                            case 26:
                                if ((i & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 4;
                                }
                                this.typeParameter_.add(ahocVar.readMessage(ahjv.PARSER, ahogVar));
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                ahjn ahjnVar = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                this.underlyingType_ = ahjnVar;
                                if (builder != null) {
                                    builder.mergeFrom(ahjnVar);
                                    this.underlyingType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = ahocVar.readInt32();
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                ahjn ahjnVar2 = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                this.expandedType_ = ahjnVar2;
                                if (builder != null) {
                                    builder.mergeFrom(ahjnVar2);
                                    this.expandedType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 16;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = ahocVar.readInt32();
                            case 66:
                                if ((i & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i |= 128;
                                }
                                this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                            case 248:
                                if ((i & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                            case 250:
                                int iPushLimit = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                if ((i & 256) != 256 && ahocVar.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                while (ahocVar.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                                }
                                ahocVar.popLimit(iPushLimit);
                                break;
                            case 258:
                                if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                                }
                                this.compilerPluginData_.add(ahocVar.readMessage(ahhf.PARSER, ahogVar));
                            default:
                                unknownField = parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag);
                                if (unknownField == 0) {
                                    z = true;
                                }
                        }
                    } catch (ahou e) {
                        e.setUnfinishedMessage(this);
                        throw e;
                    } catch (IOException e2) {
                        ahou ahouVar = new ahou(e2.getMessage());
                        ahouVar.setUnfinishedMessage(this);
                        throw ahouVar;
                    }
                } catch (Throwable th) {
                    if ((i & 4) == 4) {
                        this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 128) == 128) {
                        this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                    }
                    if ((i & 256) == 256) {
                        this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == unknownField) {
                        this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
                    }
                    try {
                        ahoeVarNewInstance.flush();
                    } catch (IOException unused2) {
                    }
                    this.unknownFields = ahnzVarNewOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            } catch (Throwable th2) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th2;
            }
        }
    }

    public static ahjq getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.name_ = 0;
        this.typeParameter_ = Collections.EMPTY_LIST;
        this.underlyingType_ = ahjn.getDefaultInstance();
        this.underlyingTypeId_ = 0;
        this.expandedType_ = ahjn.getDefaultInstance();
        this.expandedTypeId_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
        this.versionRequirement_ = Collections.EMPTY_LIST;
        this.compilerPluginData_ = Collections.EMPTY_LIST;
    }

    public static ahjp newBuilder(ahjq ahjqVar) {
        ahjp ahjpVarNewBuilder = newBuilder();
        ahjpVarNewBuilder.mergeFrom(ahjqVar);
        return ahjpVarNewBuilder;
    }

    public static ahjq parseDelimitedFrom(InputStream inputStream, ahog ahogVar) throws IOException {
        return PARSER.parseDelimitedFrom(inputStream, ahogVar);
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

    public ahhf getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public List<ahhf> getCompilerPluginDataList() {
        return this.compilerPluginData_;
    }

    public ahjn getExpandedType() {
        return this.expandedType_;
    }

    public int getExpandedTypeId() {
        return this.expandedTypeId_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahjq> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.flags_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.name_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            iComputeInt32Size += ahoe.computeMessageSize(3, this.typeParameter_.get(i3));
        }
        if ((this.bitField0_ & 4) == 4) {
            iComputeInt32Size += ahoe.computeMessageSize(4, this.underlyingType_);
        }
        int i4 = this.bitField0_;
        if ((i4 & 8) == 8) {
            iComputeInt32Size += ahoe.computeInt32Size(5, this.underlyingTypeId_);
        }
        if ((i4 & 16) == 16) {
            iComputeInt32Size += ahoe.computeMessageSize(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iComputeInt32Size += ahoe.computeInt32Size(7, this.expandedTypeId_);
        }
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            iComputeInt32Size += ahoe.computeMessageSize(8, this.annotation_.get(i5));
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i6 = 0; i6 < this.versionRequirement_.size(); i6++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.versionRequirement_.get(i6).intValue());
        }
        int size = getVersionRequirementList().size();
        int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag + size + size;
        for (int i7 = 0; i7 < this.compilerPluginData_.size(); i7++) {
            iComputeMessageSize += ahoe.computeMessageSize(32, this.compilerPluginData_.get(i7));
        }
        int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
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

    public ahjn getUnderlyingType() {
        return this.underlyingType_;
    }

    public int getUnderlyingTypeId() {
        return this.underlyingTypeId_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasExpandedType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasExpandedTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasUnderlyingType() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasUnderlyingTypeId() {
        return (this.bitField0_ & 8) == 8;
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
        if (hasName()) {
            int i = 0;
            while (true) {
                if (i >= getTypeParameterCount()) {
                    if ((!hasUnderlyingType() || getUnderlyingType().isInitialized()) && (!hasExpandedType() || getExpandedType().isInitialized())) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= getAnnotationCount()) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= getCompilerPluginDataCount()) {
                                        if (!extensionsAreInitialized()) {
                                            break;
                                        }
                                    } else {
                                        if (!getCompilerPluginData(i3).isInitialized()) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                if (!getAnnotation(i2).isInitialized()) {
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
    public ahjp newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahjp toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.name_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            ahoeVar.writeMessage(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeMessage(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeInt32(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeMessage(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            ahoeVar.writeInt32(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            ahoeVar.writeMessage(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            ahoeVar.writeInt32(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            ahoeVar.writeMessage(32, this.compilerPluginData_.get(i4));
        }
        ahomVarNewExtensionWriter.writeUntil(200, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahjq getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahjp newBuilder() {
        return ahjp.create();
    }

    public /* synthetic */ ahjq(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahjq(ahol<ahjq, ?> aholVar) {
        super(aholVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahjq(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahjq, ?>) aholVar);
    }

    private ahjq(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
