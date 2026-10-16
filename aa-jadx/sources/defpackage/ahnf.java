package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahnf extends defpackage.ahpq implements defpackage.ahqh {
    public static defpackage.ahqi<defpackage.ahnf> PARSER = new defpackage.ahnb();
    private static final defpackage.ahnf defaultInstance;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private defpackage.ahne operation_;
    private int predefinedIndex_;
    private int range_;
    private int replaceCharMemoizedSerializedSize;
    private java.util.List<java.lang.Integer> replaceChar_;
    private java.lang.Object string_;
    private int substringIndexMemoizedSerializedSize;
    private java.util.List<java.lang.Integer> substringIndex_;
    private final defpackage.ahpa unknownFields;

    static {
        defpackage.ahnf ahnfVar = new defpackage.ahnf(true);
        defaultInstance = ahnfVar;
        ahnfVar.initFields();
    }

    private ahnf(defpackage.ahpc ahpcVar, defpackage.ahpg ahpgVar) throws defpackage.ahpu {
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        defpackage.ahoz ahozVarNewOutput = defpackage.ahpa.newOutput();
        defpackage.ahpe ahpeVarNewInstance = defpackage.ahpe.newInstance(ahozVarNewOutput, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int tag = ahpcVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.range_ = ahpcVar.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = ahpcVar.readInt32();
                            } else if (tag == 24) {
                                int i2 = ahpcVar.readEnum();
                                defpackage.ahne ahneVarValueOf = defpackage.ahne.valueOf(i2);
                                if (ahneVarValueOf == null) {
                                    ahpeVarNewInstance.writeRawVarint32(tag);
                                    ahpeVarNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = ahneVarValueOf;
                                }
                            } else if (tag == 32) {
                                if ((i & 16) != 16) {
                                    this.substringIndex_ = new java.util.ArrayList();
                                    i |= 16;
                                }
                                this.substringIndex_.add(java.lang.Integer.valueOf(ahpcVar.readInt32()));
                            } else if (tag == 34) {
                                int iPushLimit = ahpcVar.pushLimit(ahpcVar.readRawVarint32());
                                if ((i & 16) != 16 && ahpcVar.getBytesUntilLimit() > 0) {
                                    this.substringIndex_ = new java.util.ArrayList();
                                    i |= 16;
                                }
                                while (ahpcVar.getBytesUntilLimit() > 0) {
                                    this.substringIndex_.add(java.lang.Integer.valueOf(ahpcVar.readInt32()));
                                }
                                ahpcVar.popLimit(iPushLimit);
                            } else if (tag == 40) {
                                if ((i & 32) != 32) {
                                    this.replaceChar_ = new java.util.ArrayList();
                                    i |= 32;
                                }
                                this.replaceChar_.add(java.lang.Integer.valueOf(ahpcVar.readInt32()));
                            } else if (tag == 42) {
                                int iPushLimit2 = ahpcVar.pushLimit(ahpcVar.readRawVarint32());
                                if ((i & 32) != 32 && ahpcVar.getBytesUntilLimit() > 0) {
                                    this.replaceChar_ = new java.util.ArrayList();
                                    i |= 32;
                                }
                                while (ahpcVar.getBytesUntilLimit() > 0) {
                                    this.replaceChar_.add(java.lang.Integer.valueOf(ahpcVar.readInt32()));
                                }
                                ahpcVar.popLimit(iPushLimit2);
                            } else if (tag == 50) {
                                defpackage.ahpa bytes = ahpcVar.readBytes();
                                this.bitField0_ |= 4;
                                this.string_ = bytes;
                            } else if (!parseUnknownField(ahpcVar, ahpeVarNewInstance, ahpgVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (defpackage.ahpu e) {
                        e.setUnfinishedMessage(this);
                        throw e;
                    } catch (java.io.IOException e2) {
                        defpackage.ahpu ahpuVar = new defpackage.ahpu(e2.getMessage());
                        ahpuVar.setUnfinishedMessage(this);
                        throw ahpuVar;
                    }
                } catch (java.lang.Throwable th) {
                    if ((i & 16) == 16) {
                        this.substringIndex_ = j$.util.DesugarCollections.unmodifiableList(this.substringIndex_);
                    }
                    if ((i & 32) == 32) {
                        this.replaceChar_ = j$.util.DesugarCollections.unmodifiableList(this.replaceChar_);
                    }
                    try {
                        ahpeVarNewInstance.flush();
                    } catch (java.io.IOException unused) {
                    }
                    this.unknownFields = ahozVarNewOutput.toByteString();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                this.unknownFields = ahozVarNewOutput.toByteString();
                throw th2;
            }
        }
        if ((i & 16) == 16) {
            this.substringIndex_ = j$.util.DesugarCollections.unmodifiableList(this.substringIndex_);
        }
        if ((i & 32) == 32) {
            this.replaceChar_ = j$.util.DesugarCollections.unmodifiableList(this.replaceChar_);
        }
        try {
            ahpeVarNewInstance.flush();
        } catch (java.io.IOException unused2) {
        }
        this.unknownFields = ahozVarNewOutput.toByteString();
    }

    public static defpackage.ahnf getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.range_ = 1;
        this.predefinedIndex_ = 0;
        this.string_ = "";
        this.operation_ = defpackage.ahne.NONE;
        this.substringIndex_ = java.util.Collections.EMPTY_LIST;
        this.replaceChar_ = java.util.Collections.EMPTY_LIST;
    }

    public static defpackage.ahnc newBuilder(defpackage.ahnf ahnfVar) {
        defpackage.ahnc ahncVarNewBuilder = newBuilder();
        ahncVarNewBuilder.mergeFrom(ahnfVar);
        return ahncVarNewBuilder;
    }

    public defpackage.ahne getOperation() {
        return this.operation_;
    }

    @Override // defpackage.ahpq, defpackage.ahqg
    public defpackage.ahqi<defpackage.ahnf> getParserForType() {
        return PARSER;
    }

    public int getPredefinedIndex() {
        return this.predefinedIndex_;
    }

    public int getRange() {
        return this.range_;
    }

    public int getReplaceCharCount() {
        return this.replaceChar_.size();
    }

    public java.util.List<java.lang.Integer> getReplaceCharList() {
        return this.replaceChar_;
    }

    @Override // defpackage.ahqg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? defpackage.ahpe.computeInt32Size(1, this.range_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += defpackage.ahpe.computeInt32Size(2, this.predefinedIndex_);
        }
        if ((i2 & 8) == 8) {
            iComputeInt32Size += defpackage.ahpe.computeEnumSize(3, this.operation_.getNumber());
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < this.substringIndex_.size(); i3++) {
            iComputeInt32SizeNoTag += defpackage.ahpe.computeInt32SizeNoTag(this.substringIndex_.get(i3).intValue());
        }
        int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
        if (!getSubstringIndexList().isEmpty()) {
            iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + defpackage.ahpe.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
        }
        this.substringIndexMemoizedSerializedSize = iComputeInt32SizeNoTag;
        int iComputeInt32SizeNoTag3 = 0;
        for (int i4 = 0; i4 < this.replaceChar_.size(); i4++) {
            iComputeInt32SizeNoTag3 += defpackage.ahpe.computeInt32SizeNoTag(this.replaceChar_.get(i4).intValue());
        }
        int iComputeBytesSize = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
        if (!getReplaceCharList().isEmpty()) {
            iComputeBytesSize = iComputeBytesSize + 1 + defpackage.ahpe.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
        }
        this.replaceCharMemoizedSerializedSize = iComputeInt32SizeNoTag3;
        if ((this.bitField0_ & 4) == 4) {
            iComputeBytesSize += defpackage.ahpe.computeBytesSize(6, getStringBytes());
        }
        int size = iComputeBytesSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public java.lang.String getString() {
        java.lang.Object obj = this.string_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        defpackage.ahpa ahpaVar = (defpackage.ahpa) obj;
        java.lang.String stringUtf8 = ahpaVar.toStringUtf8();
        if (ahpaVar.isValidUtf8()) {
            this.string_ = stringUtf8;
        }
        return stringUtf8;
    }

    public defpackage.ahpa getStringBytes() {
        java.lang.Object obj = this.string_;
        if (!(obj instanceof java.lang.String)) {
            return (defpackage.ahpa) obj;
        }
        defpackage.ahpa ahpaVarCopyFromUtf8 = defpackage.ahpa.copyFromUtf8((java.lang.String) obj);
        this.string_ = ahpaVarCopyFromUtf8;
        return ahpaVarCopyFromUtf8;
    }

    public int getSubstringIndexCount() {
        return this.substringIndex_.size();
    }

    public java.util.List<java.lang.Integer> getSubstringIndexList() {
        return this.substringIndex_;
    }

    public boolean hasOperation() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasPredefinedIndex() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasRange() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasString() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // defpackage.ahqh
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ahqg
    public defpackage.ahnc newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahqg
    public defpackage.ahnc toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahqg
    public void writeTo(defpackage.ahpe ahpeVar) throws java.io.IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahpeVar.writeInt32(1, this.range_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahpeVar.writeInt32(2, this.predefinedIndex_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahpeVar.writeEnum(3, this.operation_.getNumber());
        }
        if (getSubstringIndexList().size() > 0) {
            ahpeVar.writeRawVarint32(34);
            ahpeVar.writeRawVarint32(this.substringIndexMemoizedSerializedSize);
        }
        for (int i = 0; i < this.substringIndex_.size(); i++) {
            ahpeVar.writeInt32NoTag(this.substringIndex_.get(i).intValue());
        }
        if (getReplaceCharList().size() > 0) {
            ahpeVar.writeRawVarint32(42);
            ahpeVar.writeRawVarint32(this.replaceCharMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
            ahpeVar.writeInt32NoTag(this.replaceChar_.get(i2).intValue());
        }
        if ((this.bitField0_ & 4) == 4) {
            ahpeVar.writeBytes(6, getStringBytes());
        }
        ahpeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahqh
    public defpackage.ahnf getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static defpackage.ahnc newBuilder() {
        return defpackage.ahnc.create();
    }

    private ahnf(defpackage.ahpk ahpkVar) {
        super(ahpkVar);
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahpkVar.getUnknownFields();
    }

    private ahnf(boolean z) {
        this.substringIndexMemoizedSerializedSize = -1;
        this.replaceCharMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = defpackage.ahpa.EMPTY;
    }
}
