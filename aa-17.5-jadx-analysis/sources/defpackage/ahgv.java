package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahgv extends ahoq implements ahph {
    public static ahpi<ahgv> PARSER = new ahgo();
    private static final ahgv defaultInstance;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int nameId_;
    private final ahoa unknownFields;
    private ahgu value_;

    static {
        ahgv ahgvVar = new ahgv(true);
        defaultInstance = ahgvVar;
        ahgvVar.initFields();
    }

    private ahgv(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                                    this.nameId_ = ahocVar.readInt32();
                                } else if (tag == 18) {
                                    ahgr builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                    ahgu ahguVar = (ahgu) ahocVar.readMessage(ahgu.PARSER, ahogVar);
                                    this.value_ = ahguVar;
                                    if (builder != null) {
                                        builder.mergeFrom(ahguVar);
                                        this.value_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            ahou ahouVar = new ahou(e.getMessage());
                            ahouVar.setUnfinishedMessage(this);
                            throw ahouVar;
                        }
                    } catch (Throwable th) {
                        try {
                            ahoeVarNewInstance.flush();
                        } catch (IOException unused) {
                        }
                        throw th;
                    }
                } catch (ahou e2) {
                    e2.setUnfinishedMessage(this);
                    throw e2;
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

    public static ahgv getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.nameId_ = 0;
        this.value_ = ahgu.getDefaultInstance();
    }

    public static ahgp newBuilder(ahgv ahgvVar) {
        ahgp ahgpVarNewBuilder = newBuilder();
        ahgpVarNewBuilder.mergeFrom(ahgvVar);
        return ahgpVarNewBuilder;
    }

    public int getNameId() {
        return this.nameId_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahgv> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.nameId_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeMessageSize(2, this.value_);
        }
        int size = iComputeInt32Size + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public ahgu getValue() {
        return this.value_;
    }

    public boolean hasNameId() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) == 2;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.ahph
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        ?? r1 = (hasNameId() && hasValue() && getValue().isInitialized()) ? 1 : 0;
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahgp newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahgp toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.nameId_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeMessage(2, this.value_);
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahgv getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahgp newBuilder() {
        return ahgp.create();
    }

    public /* synthetic */ ahgv(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahgv(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahgv(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahgv(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
