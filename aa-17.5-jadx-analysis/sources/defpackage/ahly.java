package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahly extends ahoq implements ahph {
    public static ahpi<ahly> PARSER = new ahlw();
    private static final ahly defaultInstance;
    private int bitField0_;
    private ahlv delegateMethod_;
    private ahls field_;
    private ahlv getter_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ahlv setter_;
    private ahlv syntheticMethod_;
    private final ahoa unknownFields;

    static {
        ahly ahlyVar = new ahly(true);
        defaultInstance = ahlyVar;
        ahlyVar.initFields();
    }

    private ahly(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                                if (tag == 10) {
                                    ahlr builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                                    ahls ahlsVar = (ahls) ahocVar.readMessage(ahls.PARSER, ahogVar);
                                    this.field_ = ahlsVar;
                                    if (builder != null) {
                                        builder.mergeFrom(ahlsVar);
                                        this.field_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    ahlu builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                                    ahlv ahlvVar = (ahlv) ahocVar.readMessage(ahlv.PARSER, ahogVar);
                                    this.syntheticMethod_ = ahlvVar;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(ahlvVar);
                                        this.syntheticMethod_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    ahlu builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                                    ahlv ahlvVar2 = (ahlv) ahocVar.readMessage(ahlv.PARSER, ahogVar);
                                    this.getter_ = ahlvVar2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(ahlvVar2);
                                        this.getter_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    ahlu builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                                    ahlv ahlvVar3 = (ahlv) ahocVar.readMessage(ahlv.PARSER, ahogVar);
                                    this.setter_ = ahlvVar3;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(ahlvVar3);
                                        this.setter_ = builder4.buildPartial();
                                    }
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    ahlu builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                                    ahlv ahlvVar4 = (ahlv) ahocVar.readMessage(ahlv.PARSER, ahogVar);
                                    this.delegateMethod_ = ahlvVar4;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(ahlvVar4);
                                        this.delegateMethod_ = builder5.buildPartial();
                                    }
                                    this.bitField0_ |= 16;
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

    public static ahly getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.field_ = ahls.getDefaultInstance();
        this.syntheticMethod_ = ahlv.getDefaultInstance();
        this.getter_ = ahlv.getDefaultInstance();
        this.setter_ = ahlv.getDefaultInstance();
        this.delegateMethod_ = ahlv.getDefaultInstance();
    }

    public static ahlx newBuilder(ahly ahlyVar) {
        ahlx ahlxVarNewBuilder = newBuilder();
        ahlxVarNewBuilder.mergeFrom(ahlyVar);
        return ahlxVarNewBuilder;
    }

    public ahlv getDelegateMethod() {
        return this.delegateMethod_;
    }

    public ahls getField() {
        return this.field_;
    }

    public ahlv getGetter() {
        return this.getter_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahly> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? ahoe.computeMessageSize(1, this.field_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iComputeMessageSize += ahoe.computeMessageSize(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iComputeMessageSize += ahoe.computeMessageSize(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iComputeMessageSize += ahoe.computeMessageSize(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iComputeMessageSize += ahoe.computeMessageSize(5, this.delegateMethod_);
        }
        int size = iComputeMessageSize + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public ahlv getSetter() {
        return this.setter_;
    }

    public ahlv getSyntheticMethod() {
        return this.syntheticMethod_;
    }

    public boolean hasDelegateMethod() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasField() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasGetter() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasSetter() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasSyntheticMethod() {
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ahpg
    public ahlx newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahlx toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeMessage(1, this.field_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeMessage(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeMessage(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeMessage(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeMessage(5, this.delegateMethod_);
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahly getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahlx newBuilder() {
        return ahlx.create();
    }

    private ahly(ahok ahokVar) {
        super(ahokVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    private ahly(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
