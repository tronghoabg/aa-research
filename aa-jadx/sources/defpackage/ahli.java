package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahli extends defpackage.ahpq implements defpackage.ahqh {
    public static defpackage.ahqi<defpackage.ahli> PARSER = new defpackage.ahlc();
    private static final defpackage.ahli defaultInstance;
    private int bitField0_;
    private int errorCode_;
    private defpackage.ahlf level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final defpackage.ahpa unknownFields;
    private int versionFull_;
    private defpackage.ahlh versionKind_;
    private int version_;

    static {
        defpackage.ahli ahliVar = new defpackage.ahli(true);
        defaultInstance = ahliVar;
        ahliVar.initFields();
    }

    private ahli(defpackage.ahpc ahpcVar, defpackage.ahpg ahpgVar) throws defpackage.ahpu {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        defpackage.ahoz ahozVarNewOutput = defpackage.ahpa.newOutput();
        defpackage.ahpe ahpeVarNewInstance = defpackage.ahpe.newInstance(ahozVarNewOutput, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        try {
                            int tag = ahpcVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.version_ = ahpcVar.readInt32();
                                } else if (tag == 16) {
                                    this.bitField0_ |= 2;
                                    this.versionFull_ = ahpcVar.readInt32();
                                } else if (tag == 24) {
                                    int i = ahpcVar.readEnum();
                                    defpackage.ahlf ahlfVarValueOf = defpackage.ahlf.valueOf(i);
                                    if (ahlfVarValueOf == null) {
                                        ahpeVarNewInstance.writeRawVarint32(tag);
                                        ahpeVarNewInstance.writeRawVarint32(i);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.level_ = ahlfVarValueOf;
                                    }
                                } else if (tag == 32) {
                                    this.bitField0_ |= 8;
                                    this.errorCode_ = ahpcVar.readInt32();
                                } else if (tag == 40) {
                                    this.bitField0_ |= 16;
                                    this.message_ = ahpcVar.readInt32();
                                } else if (tag == 48) {
                                    int i2 = ahpcVar.readEnum();
                                    defpackage.ahlh ahlhVarValueOf = defpackage.ahlh.valueOf(i2);
                                    if (ahlhVarValueOf == null) {
                                        ahpeVarNewInstance.writeRawVarint32(tag);
                                        ahpeVarNewInstance.writeRawVarint32(i2);
                                    } else {
                                        this.bitField0_ |= 32;
                                        this.versionKind_ = ahlhVarValueOf;
                                    }
                                } else if (!parseUnknownField(ahpcVar, ahpeVarNewInstance, ahpgVar, tag)) {
                                }
                            }
                            z = true;
                        } catch (java.io.IOException e) {
                            defpackage.ahpu ahpuVar = new defpackage.ahpu(e.getMessage());
                            ahpuVar.setUnfinishedMessage(this);
                            throw ahpuVar;
                        }
                    } catch (defpackage.ahpu e2) {
                        e2.setUnfinishedMessage(this);
                        throw e2;
                    }
                } catch (java.lang.Throwable th) {
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
        try {
            ahpeVarNewInstance.flush();
        } catch (java.io.IOException unused2) {
        }
        this.unknownFields = ahozVarNewOutput.toByteString();
    }

    public static defpackage.ahli getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.version_ = 0;
        this.versionFull_ = 0;
        this.level_ = defpackage.ahlf.ERROR;
        this.errorCode_ = 0;
        this.message_ = 0;
        this.versionKind_ = defpackage.ahlh.LANGUAGE_VERSION;
    }

    public static defpackage.ahld newBuilder(defpackage.ahli ahliVar) {
        defpackage.ahld ahldVarNewBuilder = newBuilder();
        ahldVarNewBuilder.mergeFrom(ahliVar);
        return ahldVarNewBuilder;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public defpackage.ahlf getLevel() {
        return this.level_;
    }

    public int getMessage() {
        return this.message_;
    }

    @Override // defpackage.ahpq, defpackage.ahqg
    public defpackage.ahqi<defpackage.ahli> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahqg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? defpackage.ahpe.computeInt32Size(1, this.version_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += defpackage.ahpe.computeInt32Size(2, this.versionFull_);
        }
        if ((i2 & 4) == 4) {
            iComputeInt32Size += defpackage.ahpe.computeEnumSize(3, this.level_.getNumber());
        }
        int i3 = this.bitField0_;
        if ((i3 & 8) == 8) {
            iComputeInt32Size += defpackage.ahpe.computeInt32Size(4, this.errorCode_);
        }
        if ((i3 & 16) == 16) {
            iComputeInt32Size += defpackage.ahpe.computeInt32Size(5, this.message_);
        }
        if ((i3 & 32) == 32) {
            iComputeInt32Size += defpackage.ahpe.computeEnumSize(6, this.versionKind_.getNumber());
        }
        int size = iComputeInt32Size + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getVersion() {
        return this.version_;
    }

    public int getVersionFull() {
        return this.versionFull_;
    }

    public defpackage.ahlh getVersionKind() {
        return this.versionKind_;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasVersionFull() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasVersionKind() {
        return (this.bitField0_ & 32) == 32;
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
    public defpackage.ahld newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahqg
    public defpackage.ahld toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahqg
    public void writeTo(defpackage.ahpe ahpeVar) throws java.io.IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahpeVar.writeInt32(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahpeVar.writeInt32(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahpeVar.writeEnum(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            ahpeVar.writeInt32(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahpeVar.writeInt32(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            ahpeVar.writeEnum(6, this.versionKind_.getNumber());
        }
        ahpeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahqh
    public defpackage.ahli getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static defpackage.ahld newBuilder() {
        return defpackage.ahld.create();
    }

    private ahli(defpackage.ahpk ahpkVar) {
        super(ahpkVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahpkVar.getUnknownFields();
    }

    private ahli(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = defpackage.ahpa.EMPTY;
    }
}
