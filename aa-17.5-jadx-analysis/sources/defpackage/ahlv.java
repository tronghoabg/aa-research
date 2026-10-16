package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahlv extends ahoq implements ahph {
    public static ahpi<ahlv> PARSER = new ahlt();
    private static final ahlv defaultInstance;
    private int bitField0_;
    private int desc_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final ahoa unknownFields;

    static {
        ahlv ahlvVar = new ahlv(true);
        defaultInstance = ahlvVar;
        ahlvVar.initFields();
    }

    private ahlv(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                                this.name_ = ahocVar.readInt32();
                            } else if (tag == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = ahocVar.readInt32();
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

    public static ahlv getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.name_ = 0;
        this.desc_ = 0;
    }

    public static ahlu newBuilder(ahlv ahlvVar) {
        ahlu ahluVarNewBuilder = newBuilder();
        ahluVarNewBuilder.mergeFrom(ahlvVar);
        return ahluVarNewBuilder;
    }

    public int getDesc() {
        return this.desc_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahlv> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.name_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.desc_);
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
    public ahlu newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahlu toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.name_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.desc_);
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahlv getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahlu newBuilder() {
        return ahlu.create();
    }

    private ahlv(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    private ahlv(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
