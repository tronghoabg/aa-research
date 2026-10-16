package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmv extends defpackage.ahpq implements defpackage.ahqh {
    public static defpackage.ahqi<defpackage.ahmv> PARSER = new defpackage.ahmt();
    private static final defpackage.ahmv defaultInstance;
    private int bitField0_;
    private int desc_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final defpackage.ahpa unknownFields;

    static {
        defpackage.ahmv ahmvVar = new defpackage.ahmv(true);
        defaultInstance = ahmvVar;
        ahmvVar.initFields();
    }

    private ahmv(defpackage.ahpc ahpcVar, defpackage.ahpg ahpgVar) throws defpackage.ahpu {
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
                        int tag = ahpcVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = ahpcVar.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = ahpcVar.readInt32();
                            } else if (!parseUnknownField(ahpcVar, ahpeVarNewInstance, ahpgVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th) {
                        try {
                            ahpeVarNewInstance.flush();
                        } catch (java.io.IOException unused) {
                        }
                        this.unknownFields = ahozVarNewOutput.toByteString();
                        throw th;
                    }
                } catch (defpackage.ahpu e) {
                    e.setUnfinishedMessage(this);
                    throw e;
                } catch (java.io.IOException e2) {
                    defpackage.ahpu ahpuVar = new defpackage.ahpu(e2.getMessage());
                    ahpuVar.setUnfinishedMessage(this);
                    throw ahpuVar;
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

    public static defpackage.ahmv getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.name_ = 0;
        this.desc_ = 0;
    }

    public static defpackage.ahmu newBuilder(defpackage.ahmv ahmvVar) {
        defpackage.ahmu ahmuVarNewBuilder = newBuilder();
        ahmuVarNewBuilder.mergeFrom(ahmvVar);
        return ahmuVarNewBuilder;
    }

    public int getDesc() {
        return this.desc_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // defpackage.ahpq, defpackage.ahqg
    public defpackage.ahqi<defpackage.ahmv> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahqg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? defpackage.ahpe.computeInt32Size(1, this.name_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += defpackage.ahpe.computeInt32Size(2, this.desc_);
        }
        int size = iComputeInt32Size + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasDesc() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) == 1;
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
    public defpackage.ahmu newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahqg
    public defpackage.ahmu toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahqg
    public void writeTo(defpackage.ahpe ahpeVar) throws java.io.IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahpeVar.writeInt32(1, this.name_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahpeVar.writeInt32(2, this.desc_);
        }
        ahpeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahqh
    public defpackage.ahmv getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static defpackage.ahmu newBuilder() {
        return defpackage.ahmu.create();
    }

    private ahmv(defpackage.ahpk ahpkVar) {
        super(ahpkVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahpkVar.getUnknownFields();
    }

    private ahmv(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = defpackage.ahpa.EMPTY;
    }
}
