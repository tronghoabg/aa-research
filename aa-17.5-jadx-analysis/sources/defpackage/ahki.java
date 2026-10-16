package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahki extends ahoq implements ahph {
    public static ahpi<ahki> PARSER = new ahkc();
    private static final ahki defaultInstance;
    private int bitField0_;
    private int errorCode_;
    private ahkf level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final ahoa unknownFields;
    private int versionFull_;
    private ahkh versionKind_;
    private int version_;

    static {
        ahki ahkiVar = new ahki(true);
        defaultInstance = ahkiVar;
        ahkiVar.initFields();
    }

    private ahki(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        try {
                            int tag = ahocVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.version_ = ahocVar.readInt32();
                                } else if (tag == 16) {
                                    this.bitField0_ |= 2;
                                    this.versionFull_ = ahocVar.readInt32();
                                } else if (tag == 24) {
                                    int i = ahocVar.readEnum();
                                    ahkf ahkfVarValueOf = ahkf.valueOf(i);
                                    if (ahkfVarValueOf == null) {
                                        ahoeVarNewInstance.writeRawVarint32(tag);
                                        ahoeVarNewInstance.writeRawVarint32(i);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.level_ = ahkfVarValueOf;
                                    }
                                } else if (tag == 32) {
                                    this.bitField0_ |= 8;
                                    this.errorCode_ = ahocVar.readInt32();
                                } else if (tag == 40) {
                                    this.bitField0_ |= 16;
                                    this.message_ = ahocVar.readInt32();
                                } else if (tag == 48) {
                                    int i2 = ahocVar.readEnum();
                                    ahkh ahkhVarValueOf = ahkh.valueOf(i2);
                                    if (ahkhVarValueOf == null) {
                                        ahoeVarNewInstance.writeRawVarint32(tag);
                                        ahoeVarNewInstance.writeRawVarint32(i2);
                                    } else {
                                        this.bitField0_ |= 32;
                                        this.versionKind_ = ahkhVarValueOf;
                                    }
                                } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            ahou ahouVar = new ahou(e.getMessage());
                            ahouVar.setUnfinishedMessage(this);
                            throw ahouVar;
                        }
                    } catch (ahou e2) {
                        e2.setUnfinishedMessage(this);
                        throw e2;
                    }
                } catch (Throwable th) {
                    try {
                        ahoeVarNewInstance.flush();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } finally {
                this.unknownFields = ahnzVarNewOutput.toByteString();
            }
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
    }

    public static ahki getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.version_ = 0;
        this.versionFull_ = 0;
        this.level_ = ahkf.ERROR;
        this.errorCode_ = 0;
        this.message_ = 0;
        this.versionKind_ = ahkh.LANGUAGE_VERSION;
    }

    public static ahkd newBuilder(ahki ahkiVar) {
        ahkd ahkdVarNewBuilder = newBuilder();
        ahkdVarNewBuilder.mergeFrom(ahkiVar);
        return ahkdVarNewBuilder;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public ahkf getLevel() {
        return this.level_;
    }

    public int getMessage() {
        return this.message_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahki> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.version_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.versionFull_);
        }
        if ((i2 & 4) == 4) {
            iComputeInt32Size += ahoe.computeEnumSize(3, this.level_.getNumber());
        }
        int i3 = this.bitField0_;
        if ((i3 & 8) == 8) {
            iComputeInt32Size += ahoe.computeInt32Size(4, this.errorCode_);
        }
        if ((i3 & 16) == 16) {
            iComputeInt32Size += ahoe.computeInt32Size(5, this.message_);
        }
        if ((i3 & 32) == 32) {
            iComputeInt32Size += ahoe.computeEnumSize(6, this.versionKind_.getNumber());
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

    public ahkh getVersionKind() {
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

    @Override // defpackage.ahph
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

    @Override // defpackage.ahpg
    public ahkd newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahkd toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeEnum(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeInt32(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeInt32(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            ahoeVar.writeEnum(6, this.versionKind_.getNumber());
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahki getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahkd newBuilder() {
        return ahkd.create();
    }

    public /* synthetic */ ahki(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahki(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahki(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahki(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
