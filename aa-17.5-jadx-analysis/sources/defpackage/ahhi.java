package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhi extends ahon<ahhi> implements ahph {
    public static ahpi<ahhi> PARSER = new ahhg();
    private static final ahhi defaultInstance;
    private List<ahgx> annotation_;
    private int bitField0_;
    private List<ahhf> compilerPluginData_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final ahoa unknownFields;
    private List<ahkb> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        ahhi ahhiVar = new ahhi(true);
        defaultInstance = ahhiVar;
        ahhiVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ahhi(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int tag = ahocVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = ahocVar.readInt32();
                            } else if (tag == 18) {
                                if ((i & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i |= 2;
                                }
                                this.valueParameter_.add(ahocVar.readMessage(ahkb.PARSER, ahogVar));
                            } else if (tag == 26) {
                                if ((i & 16) != 16) {
                                    this.annotation_ = new ArrayList();
                                    i |= 16;
                                }
                                this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                            } else if (tag == 248) {
                                if ((i & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                            } else if (tag == 250) {
                                int iPushLimit = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                if ((i & 4) != 4 && ahocVar.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                while (ahocVar.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                                }
                                ahocVar.popLimit(iPushLimit);
                            } else if (tag == 258) {
                                if ((i & 8) != 8) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 8;
                                }
                                this.compilerPluginData_.add(ahocVar.readMessage(ahhf.PARSER, ahogVar));
                            } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 2) == 2) {
                            this.valueParameter_ = DesugarCollections.unmodifiableList(this.valueParameter_);
                        }
                        if ((i & 16) == 16) {
                            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                        }
                        if ((i & 4) == 4) {
                            this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
                        }
                        if ((i & 8) == 8) {
                            this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
                        }
                        try {
                            ahoeVarNewInstance.flush();
                        } catch (IOException unused) {
                        }
                        this.unknownFields = ahnzVarNewOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (ahou e) {
                    e.setUnfinishedMessage(this);
                    throw e;
                } catch (IOException e2) {
                    ahou ahouVar = new ahou(e2.getMessage());
                    ahouVar.setUnfinishedMessage(this);
                    throw ahouVar;
                }
            } catch (Throwable th2) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th2;
            }
        }
        if ((i & 2) == 2) {
            this.valueParameter_ = DesugarCollections.unmodifiableList(this.valueParameter_);
        }
        if ((i & 16) == 16) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
        }
        if ((i & 4) == 4) {
            this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
        }
        if ((i & 8) == 8) {
            this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
        this.unknownFields = ahnzVarNewOutput.toByteString();
        makeExtensionsImmutable();
    }

    public static ahhi getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.valueParameter_ = Collections.EMPTY_LIST;
        this.versionRequirement_ = Collections.EMPTY_LIST;
        this.compilerPluginData_ = Collections.EMPTY_LIST;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static ahhh newBuilder(ahhi ahhiVar) {
        ahhh ahhhVarNewBuilder = newBuilder();
        ahhhVarNewBuilder.mergeFrom(ahhiVar);
        return ahhhVarNewBuilder;
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

    public int getFlags() {
        return this.flags_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahhi> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? ahoe.computeInt32Size(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            iComputeInt32Size += ahoe.computeMessageSize(2, this.valueParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iComputeInt32Size += ahoe.computeMessageSize(3, this.annotation_.get(i3));
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.versionRequirement_.get(i4).intValue());
        }
        int size = getVersionRequirementList().size();
        int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag + size + size;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            iComputeMessageSize += ahoe.computeMessageSize(32, this.compilerPluginData_.get(i5));
        }
        int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ahkb getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    public List<ahkb> getValueParameterList() {
        return this.valueParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
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
            if (i >= getValueParameterCount()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= getCompilerPluginDataCount()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= getAnnotationCount()) {
                                if (!extensionsAreInitialized()) {
                                    break;
                                }
                            } else {
                                if (!getAnnotation(i3).isInitialized()) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        if (!getCompilerPluginData(i2).isInitialized()) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                if (!getValueParameter(i).isInitialized()) {
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
    public ahhh newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahhh toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.flags_);
        }
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            ahoeVar.writeMessage(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            ahoeVar.writeMessage(3, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            ahoeVar.writeInt32(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            ahoeVar.writeMessage(32, this.compilerPluginData_.get(i4));
        }
        ahomVarNewExtensionWriter.writeUntil(19000, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahhi getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahhh newBuilder() {
        return ahhh.create();
    }

    public /* synthetic */ ahhi(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahhi(ahol<ahhi, ?> aholVar) {
        super(aholVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahhi(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahhi, ?>) aholVar);
    }

    private ahhi(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
