package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahiz extends ahoq implements ahph {
    public static ahpi<ahiz> PARSER = new ahiv();
    private static final ahiz defaultInstance;
    private int bitField0_;
    private ahiy kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int parentQualifiedName_;
    private int shortName_;
    private final ahoa unknownFields;

    static {
        ahiz ahizVar = new ahiz(true);
        defaultInstance = ahizVar;
        ahizVar.initFields();
    }

    private ahiz(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                                this.bitField0_ |= 1;
                                this.parentQualifiedName_ = ahocVar.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.shortName_ = ahocVar.readInt32();
                            } else if (tag == 24) {
                                int i = ahocVar.readEnum();
                                ahiy ahiyVarValueOf = ahiy.valueOf(i);
                                if (ahiyVarValueOf == null) {
                                    ahoeVarNewInstance.writeRawVarint32(tag);
                                    ahoeVarNewInstance.writeRawVarint32(i);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = ahiyVarValueOf;
                                }
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

    public static ahiz getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.parentQualifiedName_ = -1;
        this.shortName_ = 0;
        this.kind_ = ahiy.PACKAGE;
    }

    public static ahiw newBuilder(ahiz ahizVar) {
        ahiw ahiwVarNewBuilder = newBuilder();
        ahiwVarNewBuilder.mergeFrom(ahizVar);
        return ahiwVarNewBuilder;
    }

    public ahiy getKind() {
        return this.kind_;
    }

    public int getParentQualifiedName() {
        return this.parentQualifiedName_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahiz> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.parentQualifiedName_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.shortName_);
        }
        if ((i2 & 4) == 4) {
            iComputeInt32Size += ahoe.computeEnumSize(3, this.kind_.getNumber());
        }
        int size = iComputeInt32Size + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getShortName() {
        return this.shortName_;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasParentQualifiedName() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasShortName() {
        return (this.bitField0_ & 2) == 2;
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
        boolean zHasShortName = hasShortName();
        this.memoizedIsInitialized = zHasShortName ? (byte) 1 : (byte) 0;
        return zHasShortName;
    }

    @Override // defpackage.ahpg
    public ahiw newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahiw toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.parentQualifiedName_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.shortName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeEnum(3, this.kind_.getNumber());
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahiz getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahiw newBuilder() {
        return ahiw.create();
    }

    public /* synthetic */ ahiz(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahiz(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahiz(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahiz(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
