package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjn extends ahon<ahjn> implements ahph {
    public static ahpi<ahjn> PARSER = new ahjg();
    private static final ahjn defaultInstance;
    private int abbreviatedTypeId_;
    private ahjn abbreviatedType_;
    private List<ahgx> annotation_;
    private List<ahjl> argument_;
    private int bitField0_;
    private int className_;
    private int flags_;
    private int flexibleTypeCapabilitiesId_;
    private int flexibleUpperBoundId_;
    private ahjn flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private boolean nullable_;
    private int outerTypeId_;
    private ahjn outerType_;
    private int typeAliasName_;
    private int typeParameterName_;
    private int typeParameter_;
    private final ahoa unknownFields;

    static {
        ahjn ahjnVar = new ahjn(true);
        defaultInstance = ahjnVar;
        ahjnVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private ahjn(ahoc ahocVar, ahog ahogVar) throws ahou {
        ahjm builder;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? unknownField = 16384;
            try {
                if (z) {
                    if ((i & 1) == 1) {
                        this.argument_ = DesugarCollections.unmodifiableList(this.argument_);
                    }
                    if ((i & 16384) == 16384) {
                        this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
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
                        try {
                            int tag = ahocVar.readTag();
                            switch (tag) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.bitField0_ |= 4096;
                                    this.flags_ = ahocVar.readInt32();
                                case 18:
                                    if ((i & 1) != 1) {
                                        this.argument_ = new ArrayList();
                                        i |= 1;
                                    }
                                    this.argument_.add(ahocVar.readMessage(ahjl.PARSER, ahogVar));
                                case 24:
                                    this.bitField0_ |= 1;
                                    this.nullable_ = ahocVar.readBool();
                                case 32:
                                    this.bitField0_ |= 2;
                                    this.flexibleTypeCapabilitiesId_ = ahocVar.readInt32();
                                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                    builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                    ahjn ahjnVar = (ahjn) ahocVar.readMessage(PARSER, ahogVar);
                                    this.flexibleUpperBound_ = ahjnVar;
                                    if (builder != null) {
                                        builder.mergeFrom(ahjnVar);
                                        this.flexibleUpperBound_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                case 48:
                                    this.bitField0_ |= 16;
                                    this.className_ = ahocVar.readInt32();
                                case 56:
                                    this.bitField0_ |= 32;
                                    this.typeParameter_ = ahocVar.readInt32();
                                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                    this.bitField0_ |= 8;
                                    this.flexibleUpperBoundId_ = ahocVar.readInt32();
                                case 72:
                                    this.bitField0_ |= 64;
                                    this.typeParameterName_ = ahocVar.readInt32();
                                case 82:
                                    builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                    ahjn ahjnVar2 = (ahjn) ahocVar.readMessage(PARSER, ahogVar);
                                    this.outerType_ = ahjnVar2;
                                    if (builder != null) {
                                        builder.mergeFrom(ahjnVar2);
                                        this.outerType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 256;
                                case 88:
                                    this.bitField0_ |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                                    this.outerTypeId_ = ahocVar.readInt32();
                                case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                                    this.bitField0_ |= 128;
                                    this.typeAliasName_ = ahocVar.readInt32();
                                case 106:
                                    builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                    ahjn ahjnVar3 = (ahjn) ahocVar.readMessage(PARSER, ahogVar);
                                    this.abbreviatedType_ = ahjnVar3;
                                    if (builder != null) {
                                        builder.mergeFrom(ahjnVar3);
                                        this.abbreviatedType_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 1024;
                                case 112:
                                    this.bitField0_ |= 2048;
                                    this.abbreviatedTypeId_ = ahocVar.readInt32();
                                case 802:
                                    if ((i & 16384) != 16384) {
                                        this.annotation_ = new ArrayList();
                                        i |= 16384;
                                    }
                                    this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                default:
                                    unknownField = parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag);
                                    if (unknownField == 0) {
                                        z = true;
                                    }
                            }
                        } catch (Throwable th) {
                            if ((i & 1) == 1) {
                                this.argument_ = DesugarCollections.unmodifiableList(this.argument_);
                            }
                            if ((i & 16384) == unknownField) {
                                this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                            }
                            try {
                                ahoeVarNewInstance.flush();
                            } catch (IOException unused2) {
                            }
                            this.unknownFields = ahnzVarNewOutput.toByteString();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    } catch (IOException e) {
                        ahou ahouVar = new ahou(e.getMessage());
                        ahouVar.setUnfinishedMessage(this);
                        throw ahouVar;
                    }
                } catch (ahou e2) {
                    e2.setUnfinishedMessage(this);
                    throw e2;
                }
            } catch (Throwable th2) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th2;
            }
        }
    }

    public static ahjn getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.argument_ = Collections.EMPTY_LIST;
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        this.flexibleUpperBound_ = getDefaultInstance();
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = getDefaultInstance();
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = getDefaultInstance();
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static ahjm newBuilder(ahjn ahjnVar) {
        ahjm ahjmVarNewBuilder = newBuilder();
        ahjmVarNewBuilder.mergeFrom(ahjnVar);
        return ahjmVarNewBuilder;
    }

    public ahjn getAbbreviatedType() {
        return this.abbreviatedType_;
    }

    public int getAbbreviatedTypeId() {
        return this.abbreviatedTypeId_;
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

    public ahjl getArgument(int i) {
        return this.argument_.get(i);
    }

    public int getArgumentCount() {
        return this.argument_.size();
    }

    public List<ahjl> getArgumentList() {
        return this.argument_;
    }

    public int getClassName() {
        return this.className_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFlexibleTypeCapabilitiesId() {
        return this.flexibleTypeCapabilitiesId_;
    }

    public ahjn getFlexibleUpperBound() {
        return this.flexibleUpperBound_;
    }

    public int getFlexibleUpperBoundId() {
        return this.flexibleUpperBoundId_;
    }

    public boolean getNullable() {
        return this.nullable_;
    }

    public ahjn getOuterType() {
        return this.outerType_;
    }

    public int getOuterTypeId() {
        return this.outerTypeId_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahjn> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt32Size = (this.bitField0_ & 4096) == 4096 ? ahoe.computeInt32Size(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iComputeInt32Size += ahoe.computeMessageSize(2, this.argument_.get(i2));
        }
        int i3 = this.bitField0_;
        if ((i3 & 1) == 1) {
            iComputeInt32Size += ahoe.computeBoolSize(3, this.nullable_);
        }
        if ((i3 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((i3 & 4) == 4) {
            iComputeInt32Size += ahoe.computeMessageSize(5, this.flexibleUpperBound_);
        }
        int i4 = this.bitField0_;
        if ((i4 & 16) == 16) {
            iComputeInt32Size += ahoe.computeInt32Size(6, this.className_);
        }
        if ((i4 & 32) == 32) {
            iComputeInt32Size += ahoe.computeInt32Size(7, this.typeParameter_);
        }
        if ((i4 & 8) == 8) {
            iComputeInt32Size += ahoe.computeInt32Size(8, this.flexibleUpperBoundId_);
        }
        if ((i4 & 64) == 64) {
            iComputeInt32Size += ahoe.computeInt32Size(9, this.typeParameterName_);
        }
        if ((i4 & 256) == 256) {
            iComputeInt32Size += ahoe.computeMessageSize(10, this.outerType_);
        }
        int i5 = this.bitField0_;
        if ((i5 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            iComputeInt32Size += ahoe.computeInt32Size(11, this.outerTypeId_);
        }
        if ((i5 & 128) == 128) {
            iComputeInt32Size += ahoe.computeInt32Size(12, this.typeAliasName_);
        }
        if ((i5 & 1024) == 1024) {
            iComputeInt32Size += ahoe.computeMessageSize(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            iComputeInt32Size += ahoe.computeInt32Size(14, this.abbreviatedTypeId_);
        }
        for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
            iComputeInt32Size += ahoe.computeMessageSize(100, this.annotation_.get(i6));
        }
        int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public int getTypeAliasName() {
        return this.typeAliasName_;
    }

    public int getTypeParameter() {
        return this.typeParameter_;
    }

    public int getTypeParameterName() {
        return this.typeParameterName_;
    }

    public boolean hasAbbreviatedType() {
        return (this.bitField0_ & 1024) == 1024;
    }

    public boolean hasAbbreviatedTypeId() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public boolean hasClassName() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 4096) == 4096;
    }

    public boolean hasFlexibleTypeCapabilitiesId() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasFlexibleUpperBound() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlexibleUpperBoundId() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasNullable() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasOuterType() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasOuterTypeId() {
        return (this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512;
    }

    public boolean hasTypeAliasName() {
        return (this.bitField0_ & 128) == 128;
    }

    public boolean hasTypeParameter() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasTypeParameterName() {
        return (this.bitField0_ & 64) == 64;
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
        int i = 0;
        while (true) {
            if (i >= getArgumentCount()) {
                if ((!hasFlexibleUpperBound() || getFlexibleUpperBound().isInitialized()) && ((!hasOuterType() || getOuterType().isInitialized()) && (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()))) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= getAnnotationCount()) {
                            if (!extensionsAreInitialized()) {
                                break;
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
                if (!getArgument(i).isInitialized()) {
                    break;
                }
                i++;
            }
        }
        r1 = 0;
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahjm newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahjm toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 4096) == 4096) {
            ahoeVar.writeInt32(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            ahoeVar.writeMessage(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeBool(3, this.nullable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeMessage(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeInt32(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            ahoeVar.writeInt32(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeInt32(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            ahoeVar.writeInt32(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            ahoeVar.writeMessage(10, this.outerType_);
        }
        if ((this.bitField0_ & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            ahoeVar.writeInt32(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            ahoeVar.writeInt32(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            ahoeVar.writeMessage(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            ahoeVar.writeInt32(14, this.abbreviatedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            ahoeVar.writeMessage(100, this.annotation_.get(i2));
        }
        ahomVarNewExtensionWriter.writeUntil(200, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahjn getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahjm newBuilder() {
        return ahjm.create();
    }

    public /* synthetic */ ahjn(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahjn(ahol<ahjn, ?> aholVar) {
        super(aholVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahjn(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahjn, ?>) aholVar);
    }

    private ahjn(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
