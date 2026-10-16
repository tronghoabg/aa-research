package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahll extends defpackage.ahpq implements defpackage.ahqh {
    public static defpackage.ahqi<defpackage.ahll> PARSER = new defpackage.ahlj();
    private static final defpackage.ahll defaultInstance;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private java.util.List<defpackage.ahli> requirement_;
    private final defpackage.ahpa unknownFields;

    static {
        defpackage.ahll ahllVar = new defpackage.ahll(true);
        defaultInstance = ahllVar;
        ahllVar.initFields();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    private ahll(defpackage.ahpc ahpcVar, defpackage.ahpg ahpgVar) throws java.lang.Throwable {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        defpackage.ahoz ahozVarNewOutput = defpackage.ahpa.newOutput();
        defpackage.ahpe ahpeVarNewInstance = defpackage.ahpe.newInstance(ahozVarNewOutput, 1);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                try {
                    int tag = ahpcVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            if (!z3) {
                                try {
                                    try {
                                        this.requirement_ = new java.util.ArrayList();
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        if (z) {
                                            this.requirement_ = j$.util.DesugarCollections.unmodifiableList(this.requirement_);
                                        }
                                        try {
                                            ahpeVarNewInstance.flush();
                                        } catch (java.io.IOException unused) {
                                        }
                                        this.unknownFields = ahozVarNewOutput.toByteString();
                                        throw th;
                                    }
                                } catch (defpackage.ahpu e) {
                                    e = e;
                                    e.setUnfinishedMessage(this);
                                    throw e;
                                } catch (java.io.IOException e2) {
                                    e = e2;
                                    defpackage.ahpu ahpuVar = new defpackage.ahpu(e.getMessage());
                                    ahpuVar.setUnfinishedMessage(this);
                                    throw ahpuVar;
                                }
                            }
                            try {
                                this.requirement_.add((defpackage.ahli) ahpcVar.readMessage(defpackage.ahli.PARSER, ahpgVar));
                                z3 = true;
                            } catch (defpackage.ahpu e3) {
                                e = e3;
                                e.setUnfinishedMessage(this);
                                throw e;
                            } catch (java.io.IOException e4) {
                                e = e4;
                                defpackage.ahpu ahpuVar2 = new defpackage.ahpu(e.getMessage());
                                ahpuVar2.setUnfinishedMessage(this);
                                throw ahpuVar2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                z = true;
                                if (z) {
                                    this.requirement_ = j$.util.DesugarCollections.unmodifiableList(this.requirement_);
                                }
                                ahpeVarNewInstance.flush();
                                this.unknownFields = ahozVarNewOutput.toByteString();
                                throw th;
                            }
                        } else if (!parseUnknownField(ahpcVar, ahpeVarNewInstance, ahpgVar, tag)) {
                        }
                    }
                    z2 = true;
                } catch (defpackage.ahpu e5) {
                    e = e5;
                } catch (java.io.IOException e6) {
                    e = e6;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    z = z3;
                }
            } catch (java.lang.Throwable th4) {
                this.unknownFields = ahozVarNewOutput.toByteString();
                throw th4;
            }
        }
        if (z3) {
            this.requirement_ = j$.util.DesugarCollections.unmodifiableList(this.requirement_);
        }
        try {
            ahpeVarNewInstance.flush();
        } catch (java.io.IOException unused2) {
        }
        this.unknownFields = ahozVarNewOutput.toByteString();
    }

    public static defpackage.ahll getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.requirement_ = java.util.Collections.EMPTY_LIST;
    }

    public static defpackage.ahlk newBuilder(defpackage.ahll ahllVar) {
        defpackage.ahlk ahlkVarNewBuilder = newBuilder();
        ahlkVarNewBuilder.mergeFrom(ahllVar);
        return ahlkVarNewBuilder;
    }

    @Override // defpackage.ahpq, defpackage.ahqg
    public defpackage.ahqi<defpackage.ahll> getParserForType() {
        return PARSER;
    }

    public int getRequirementCount() {
        return this.requirement_.size();
    }

    public java.util.List<defpackage.ahli> getRequirementList() {
        return this.requirement_;
    }

    @Override // defpackage.ahqg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
            iComputeMessageSize += defpackage.ahpe.computeMessageSize(1, this.requirement_.get(i2));
        }
        int size = iComputeMessageSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
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
    public defpackage.ahlk newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahqg
    public defpackage.ahlk toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahqg
    public void writeTo(defpackage.ahpe ahpeVar) throws java.io.IOException {
        getSerializedSize();
        for (int i = 0; i < this.requirement_.size(); i++) {
            ahpeVar.writeMessage(1, this.requirement_.get(i));
        }
        ahpeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahqh
    public defpackage.ahll getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static defpackage.ahlk newBuilder() {
        return defpackage.ahlk.create();
    }

    private ahll(defpackage.ahpk ahpkVar) {
        super(ahpkVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahpkVar.getUnknownFields();
    }

    private ahll(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = defpackage.ahpa.EMPTY;
    }
}
