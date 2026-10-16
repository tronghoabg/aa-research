package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahjl extends ahoq implements ahph {
    public static ahpi<ahjl> PARSER = new ahjh();
    private static final ahjl defaultInstance;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ahjk projection_;
    private int typeId_;
    private ahjn type_;
    private final ahoa unknownFields;

    static {
        ahjl ahjlVar = new ahjl(true);
        defaultInstance = ahjlVar;
        ahjlVar.initFields();
    }

    private ahjl(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                        int tag = ahocVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i = ahocVar.readEnum();
                                ahjk ahjkVarValueOf = ahjk.valueOf(i);
                                if (ahjkVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.projection_ = ahjkVarValueOf;
                                }
                            } else if (tag == 18) {
                                ahjm builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                ahjn ahjnVar = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                this.type_ = ahjnVar;
                                if (builder != null) {
                                    builder.mergeFrom(ahjnVar);
                                    this.type_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.bitField0_ |= 4;
                                this.typeId_ = ahocVar.readInt32();
                            } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            ahoeVarNewInstance.flush();
                        } catch (IOException unused) {
                        }
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
            } finally {
                this.unknownFields = ahnzVarNewOutput.toByteString();
            }
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
    }

    public static ahjl getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.projection_ = ahjk.INV;
        this.type_ = ahjn.getDefaultInstance();
        this.typeId_ = 0;
    }

    public static ahji newBuilder(ahjl ahjlVar) {
        ahji ahjiVarNewBuilder = newBuilder();
        ahjiVarNewBuilder.mergeFrom(ahjlVar);
        return ahjiVarNewBuilder;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahjl> getParserForType() {
        return PARSER;
    }

    public ahjk getProjection() {
        return this.projection_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? ahoe.computeEnumSize(1, this.projection_.getNumber()) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iComputeEnumSize += ahoe.computeMessageSize(2, this.type_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iComputeEnumSize += ahoe.computeInt32Size(3, this.typeId_);
        }
        int size = iComputeEnumSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public ahjn getType() {
        return this.type_;
    }

    public int getTypeId() {
        return this.typeId_;
    }

    public boolean hasProjection() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 4) == 4;
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
        if (!hasType() || getType().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ahpg
    public ahji newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahji toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeEnum(1, this.projection_.getNumber());
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeMessage(2, this.type_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeInt32(3, this.typeId_);
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahjl getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahji newBuilder() {
        return ahji.create();
    }

    public /* synthetic */ ahjl(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahjl(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahjl(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahjl(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
