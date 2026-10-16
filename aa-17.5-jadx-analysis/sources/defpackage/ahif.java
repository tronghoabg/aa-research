package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahif extends ahon<ahif> implements ahph {
    public static ahpi<ahif> PARSER = new ahid();
    private static final ahif defaultInstance;
    private List<ahgx> annotation_;
    private int bitField0_;
    private List<ahhf> compilerPluginData_;
    private List<ahkb> contextParameter_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ahjn> contextReceiverType_;
    private ahhl contract_;
    private List<ahgx> extensionReceiverAnnotation_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private ahjn receiverType_;
    private int returnTypeId_;
    private ahjn returnType_;
    private List<ahjv> typeParameter_;
    private ahjy typeTable_;
    private final ahoa unknownFields;
    private List<ahkb> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        ahif ahifVar = new ahif(true);
        defaultInstance = ahifVar;
        ahifVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0398  */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ahif(defpackage.ahoc r22, defpackage.ahog r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahif.<init>(ahoc, ahog):void");
    }

    public static ahif getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
        this.name_ = 0;
        this.returnType_ = ahjn.getDefaultInstance();
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.EMPTY_LIST;
        this.receiverType_ = ahjn.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = Collections.EMPTY_LIST;
        this.contextReceiverTypeId_ = Collections.EMPTY_LIST;
        this.contextParameter_ = Collections.EMPTY_LIST;
        this.valueParameter_ = Collections.EMPTY_LIST;
        this.typeTable_ = ahjy.getDefaultInstance();
        this.versionRequirement_ = Collections.EMPTY_LIST;
        this.contract_ = ahhl.getDefaultInstance();
        this.compilerPluginData_ = Collections.EMPTY_LIST;
        this.annotation_ = Collections.EMPTY_LIST;
        this.extensionReceiverAnnotation_ = Collections.EMPTY_LIST;
    }

    public static ahie newBuilder(ahif ahifVar) {
        ahie ahieVarNewBuilder = newBuilder();
        ahieVarNewBuilder.mergeFrom(ahifVar);
        return ahieVarNewBuilder;
    }

    public static ahif parseFrom(InputStream inputStream, ahog ahogVar) throws IOException {
        return PARSER.parseFrom(inputStream, ahogVar);
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

    public ahhl getContract() {
        return this.contract_;
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

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahif> getParserForType() {
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
        for (int i4 = 0; i4 < this.valueParameter_.size(); i4++) {
            iComputeInt32Size += ahoe.computeMessageSize(6, this.valueParameter_.get(i4));
        }
        int i5 = this.bitField0_;
        if ((i5 & 16) == 16) {
            iComputeInt32Size += ahoe.computeInt32Size(7, this.returnTypeId_);
        }
        if ((i5 & 64) == 64) {
            iComputeInt32Size += ahoe.computeInt32Size(8, this.receiverTypeId_);
        }
        if ((i5 & 1) == 1) {
            iComputeInt32Size += ahoe.computeInt32Size(9, this.flags_);
        }
        for (int i6 = 0; i6 < this.contextReceiverType_.size(); i6++) {
            iComputeInt32Size += ahoe.computeMessageSize(10, this.contextReceiverType_.get(i6));
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i7 = 0; i7 < this.contextReceiverTypeId_.size(); i7++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.contextReceiverTypeId_.get(i7).intValue());
        }
        int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iComputeMessageSize = iComputeMessageSize + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
        for (int i8 = 0; i8 < this.annotation_.size(); i8++) {
            iComputeMessageSize += ahoe.computeMessageSize(12, this.annotation_.get(i8));
        }
        for (int i9 = 0; i9 < this.contextParameter_.size(); i9++) {
            iComputeMessageSize += ahoe.computeMessageSize(13, this.contextParameter_.get(i9));
        }
        if ((this.bitField0_ & 128) == 128) {
            iComputeMessageSize += ahoe.computeMessageSize(30, this.typeTable_);
        }
        int iComputeInt32SizeNoTag2 = 0;
        for (int i10 = 0; i10 < this.versionRequirement_.size(); i10++) {
            iComputeInt32SizeNoTag2 += ahoe.computeInt32SizeNoTag(this.versionRequirement_.get(i10).intValue());
        }
        int size = getVersionRequirementList().size();
        int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2 + size + size;
        if ((this.bitField0_ & 256) == 256) {
            iComputeMessageSize2 += ahoe.computeMessageSize(32, this.contract_);
        }
        for (int i11 = 0; i11 < this.compilerPluginData_.size(); i11++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(33, this.compilerPluginData_.get(i11));
        }
        for (int i12 = 0; i12 < this.extensionReceiverAnnotation_.size(); i12++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(34, this.extensionReceiverAnnotation_.get(i12));
        }
        int iExtensionsSerializedSize = iComputeMessageSize2 + extensionsSerializedSize() + this.unknownFields.size();
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

    public ahjy getTypeTable() {
        return this.typeTable_;
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

    public boolean hasContract() {
        return (this.bitField0_ & 256) == 256;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
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

    public boolean hasTypeTable() {
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
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= getValueParameterCount()) {
                                                if ((!hasTypeTable() || getTypeTable().isInitialized()) && (!hasContract() || getContract().isInitialized())) {
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i5 >= getCompilerPluginDataCount()) {
                                                            int i6 = 0;
                                                            while (true) {
                                                                if (i6 >= getAnnotationCount()) {
                                                                    int i7 = 0;
                                                                    while (true) {
                                                                        if (i7 >= getExtensionReceiverAnnotationCount()) {
                                                                            if (!extensionsAreInitialized()) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
                                                                                break;
                                                                            }
                                                                            i7++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (!getAnnotation(i6).isInitialized()) {
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            }
                                                        } else {
                                                            if (!getCompilerPluginData(i5).isInitialized()) {
                                                                break;
                                                            }
                                                            i5++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (!getValueParameter(i4).isInitialized()) {
                                                    break;
                                                }
                                                i4++;
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
    public ahie newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahie toBuilder() {
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            ahoeVar.writeMessage(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeInt32(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            ahoeVar.writeInt32(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            ahoeVar.writeMessage(10, this.contextReceiverType_.get(i3));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            ahoeVar.writeRawVarint32(90);
            ahoeVar.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            ahoeVar.writeInt32NoTag(this.contextReceiverTypeId_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            ahoeVar.writeMessage(12, this.annotation_.get(i5));
        }
        for (int i6 = 0; i6 < this.contextParameter_.size(); i6++) {
            ahoeVar.writeMessage(13, this.contextParameter_.get(i6));
        }
        if ((this.bitField0_ & 128) == 128) {
            ahoeVar.writeMessage(30, this.typeTable_);
        }
        for (int i7 = 0; i7 < this.versionRequirement_.size(); i7++) {
            ahoeVar.writeInt32(31, this.versionRequirement_.get(i7).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            ahoeVar.writeMessage(32, this.contract_);
        }
        for (int i8 = 0; i8 < this.compilerPluginData_.size(); i8++) {
            ahoeVar.writeMessage(33, this.compilerPluginData_.get(i8));
        }
        for (int i9 = 0; i9 < this.extensionReceiverAnnotation_.size(); i9++) {
            ahoeVar.writeMessage(34, this.extensionReceiverAnnotation_.get(i9));
        }
        ahomVarNewExtensionWriter.writeUntil(19000, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahif getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahie newBuilder() {
        return ahie.create();
    }

    public /* synthetic */ ahif(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahif(ahol<ahif, ?> aholVar) {
        super(aholVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahif(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahif, ?>) aholVar);
    }

    private ahif(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
