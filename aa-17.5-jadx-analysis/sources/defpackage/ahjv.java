package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjv extends ahon<ahjv> implements ahph {
    public static ahpi<ahjv> PARSER = new ahjr();
    private static final ahjv defaultInstance;
    private List<ahgx> annotation_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private boolean reified_;
    private final ahoa unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    private List<Integer> upperBoundId_;
    private List<ahjn> upperBound_;
    private ahju variance_;

    static {
        ahjv ahjvVar = new ahjv(true);
        defaultInstance = ahjvVar;
        ahjvVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ahjv(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        try {
                            int tag = ahocVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.id_ = ahocVar.readInt32();
                                } else if (tag == 16) {
                                    this.bitField0_ |= 2;
                                    this.name_ = ahocVar.readInt32();
                                } else if (tag == 24) {
                                    this.bitField0_ |= 4;
                                    this.reified_ = ahocVar.readBool();
                                } else if (tag == 32) {
                                    int i2 = ahocVar.readEnum();
                                    ahju ahjuVarValueOf = ahju.valueOf(i2);
                                    if (ahjuVarValueOf == null) {
                                        ahoeVarNewInstance.writeRawVarint32(tag);
                                        ahoeVarNewInstance.writeRawVarint32(i2);
                                    } else {
                                        this.bitField0_ |= 8;
                                        this.variance_ = ahjuVarValueOf;
                                    }
                                } else if (tag == 42) {
                                    if ((i & 16) != 16) {
                                        this.upperBound_ = new ArrayList();
                                        i |= 16;
                                    }
                                    this.upperBound_.add(ahocVar.readMessage(ahjn.PARSER, ahogVar));
                                } else if (tag == 48) {
                                    if ((i & 32) != 32) {
                                        this.upperBoundId_ = new ArrayList();
                                        i |= 32;
                                    }
                                    this.upperBoundId_.add(Integer.valueOf(ahocVar.readInt32()));
                                } else if (tag == 50) {
                                    int iPushLimit = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                    if ((i & 32) != 32 && ahocVar.getBytesUntilLimit() > 0) {
                                        this.upperBoundId_ = new ArrayList();
                                        i |= 32;
                                    }
                                    while (ahocVar.getBytesUntilLimit() > 0) {
                                        this.upperBoundId_.add(Integer.valueOf(ahocVar.readInt32()));
                                    }
                                    ahocVar.popLimit(iPushLimit);
                                } else if (tag == 802) {
                                    if ((i & 64) != 64) {
                                        this.annotation_ = new ArrayList();
                                        i |= 64;
                                    }
                                    this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            if ((i & 16) == 16) {
                                this.upperBound_ = DesugarCollections.unmodifiableList(this.upperBound_);
                            }
                            if ((i & 32) == 32) {
                                this.upperBoundId_ = DesugarCollections.unmodifiableList(this.upperBoundId_);
                            }
                            if ((i & 64) == 64) {
                                this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                            }
                            try {
                                ahoeVarNewInstance.flush();
                            } catch (IOException unused) {
                            }
                            this.unknownFields = ahnzVarNewOutput.toByteString();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    } catch (IOException e) {
                        ahou ahouVar = new ahou(e.getMessage());
                        ahouVar.setUnfinishedMessage(this);
                        throw ahouVar;
                    }
                } catch (ahou e2) {
                    e2.setUnfinishedMessage(this);
                    throw e2;
                }
            } catch (Throwable th2) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th2;
            }
        }
        if ((i & 16) == 16) {
            this.upperBound_ = DesugarCollections.unmodifiableList(this.upperBound_);
        }
        if ((i & 32) == 32) {
            this.upperBoundId_ = DesugarCollections.unmodifiableList(this.upperBoundId_);
        }
        if ((i & 64) == 64) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
        this.unknownFields = ahnzVarNewOutput.toByteString();
        makeExtensionsImmutable();
    }

    public static ahjv getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        this.variance_ = ahju.INV;
        this.upperBound_ = Collections.EMPTY_LIST;
        this.upperBoundId_ = Collections.EMPTY_LIST;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static ahjs newBuilder(ahjv ahjvVar) {
        ahjs ahjsVarNewBuilder = newBuilder();
        ahjsVarNewBuilder.mergeFrom(ahjvVar);
        return ahjsVarNewBuilder;
    }

    public ahgx getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ahgx> getAnnotationList() {
        return this.annotation_;
    }

    public int getId() {
        return this.id_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahjv> getParserForType() {
        return PARSER;
    }

    public boolean getReified() {
        return this.reified_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.id_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.name_);
        }
        if ((i2 & 4) == 4) {
            iComputeInt32Size += ahoe.computeBoolSize(3, this.reified_);
        }
        if ((i2 & 8) == 8) {
            iComputeInt32Size += ahoe.computeEnumSize(4, this.variance_.getNumber());
        }
        for (int i3 = 0; i3 < this.upperBound_.size(); i3++) {
            iComputeInt32Size += ahoe.computeMessageSize(5, this.upperBound_.get(i3));
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i4 = 0; i4 < this.upperBoundId_.size(); i4++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.upperBoundId_.get(i4).intValue());
        }
        int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
        if (!getUpperBoundIdList().isEmpty()) {
            iComputeMessageSize = iComputeMessageSize + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
        }
        this.upperBoundIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
        for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
            iComputeMessageSize += ahoe.computeMessageSize(100, this.annotation_.get(i5));
        }
        int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ahjn getUpperBound(int i) {
        return this.upperBound_.get(i);
    }

    public int getUpperBoundCount() {
        return this.upperBound_.size();
    }

    public List<Integer> getUpperBoundIdList() {
        return this.upperBoundId_;
    }

    public List<ahjn> getUpperBoundList() {
        return this.upperBound_;
    }

    public ahju getVariance() {
        return this.variance_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasReified() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasVariance() {
        return (this.bitField0_ & 8) == 8;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.ahph
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        ?? r1 = 1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (hasId() && hasName()) {
            int i = 0;
            while (true) {
                if (i >= getUpperBoundCount()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= getAnnotationCount()) {
                            if (!extensionsAreInitialized()) {
                                break;
                            }
                        } else {
                            if (!getAnnotation(i2).isInitialized()) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    if (!getUpperBound(i).isInitialized()) {
                        break;
                    }
                    i++;
                }
            }
            r1 = 0;
        } else {
            r1 = 0;
        }
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahjs newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahjs toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeBool(3, this.reified_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeEnum(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            ahoeVar.writeMessage(5, this.upperBound_.get(i));
        }
        if (getUpperBoundIdList().size() > 0) {
            ahoeVar.writeRawVarint32(50);
            ahoeVar.writeRawVarint32(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            ahoeVar.writeInt32NoTag(this.upperBoundId_.get(i2).intValue());
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            ahoeVar.writeMessage(100, this.annotation_.get(i3));
        }
        ahomVarNewExtensionWriter.writeUntil(1000, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahjv getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahjs newBuilder() {
        return ahjs.create();
    }

    public /* synthetic */ ahjv(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahjv(ahol<ahjv, ?> aholVar) {
        super(aholVar);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahjv(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahjv, ?>) aholVar);
    }

    private ahjv(boolean z) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
