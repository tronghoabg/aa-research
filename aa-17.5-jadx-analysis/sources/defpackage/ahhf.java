package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahhf extends ahoq implements ahph {
    public static ahpi<ahhf> PARSER = new ahhd();
    private static final ahhf defaultInstance;
    private int bitField0_;
    private ahoa data_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int pluginId_;
    private final ahoa unknownFields;

    static {
        ahhf ahhfVar = new ahhf(true);
        defaultInstance = ahhfVar;
        ahhfVar.initFields();
    }

    private ahhf(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                                this.pluginId_ = ahocVar.readInt32();
                            } else if (tag == 18) {
                                this.bitField0_ |= 2;
                                this.data_ = ahocVar.readBytes();
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

    public static ahhf getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.pluginId_ = 0;
        this.data_ = ahoa.EMPTY;
    }

    public static ahhe newBuilder(ahhf ahhfVar) {
        ahhe ahheVarNewBuilder = newBuilder();
        ahheVarNewBuilder.mergeFrom(ahhfVar);
        return ahheVarNewBuilder;
    }

    public ahoa getData() {
        return this.data_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahhf> getParserForType() {
        return PARSER;
    }

    public int getPluginId() {
        return this.pluginId_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.pluginId_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeBytesSize(2, this.data_);
        }
        int size = iComputeInt32Size + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasData() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasPluginId() {
        return (this.bitField0_ & 1) == 1;
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
        ?? r1 = (hasPluginId() && hasData()) ? 1 : 0;
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahhe newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahhe toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.pluginId_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeBytes(2, this.data_);
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahhf getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahhe newBuilder() {
        return ahhe.create();
    }

    public /* synthetic */ ahhf(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahhf(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    public /* synthetic */ ahhf(ahok ahokVar, ahgm ahgmVar) {
        this(ahokVar);
    }

    private ahhf(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
