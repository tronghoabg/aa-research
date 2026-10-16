package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahmg extends ahoq implements ahph {
    public static ahpi<ahmg> PARSER = new ahlz();
    private static final ahmg defaultInstance;
    private int localNameMemoizedSerializedSize;
    private List<Integer> localName_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ahmf> record_;
    private final ahoa unknownFields;

    static {
        ahmg ahmgVar = new ahmg(true);
        defaultInstance = ahmgVar;
        ahmgVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ahmg(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.localNameMemoizedSerializedSize = -1;
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
                        int tag = ahocVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if ((i & 1) != 1) {
                                    this.record_ = new ArrayList();
                                    i |= 1;
                                }
                                this.record_.add(ahocVar.readMessage(ahmf.PARSER, ahogVar));
                            } else if (tag == 40) {
                                if ((i & 2) != 2) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                this.localName_.add(Integer.valueOf(ahocVar.readInt32()));
                            } else if (tag == 42) {
                                int iPushLimit = ahocVar.pushLimit(ahocVar.readRawVarint32());
                                if ((i & 2) != 2 && ahocVar.getBytesUntilLimit() > 0) {
                                    this.localName_ = new ArrayList();
                                    i |= 2;
                                }
                                while (ahocVar.getBytesUntilLimit() > 0) {
                                    this.localName_.add(Integer.valueOf(ahocVar.readInt32()));
                                }
                                ahocVar.popLimit(iPushLimit);
                            } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 1) == 1) {
                            this.record_ = DesugarCollections.unmodifiableList(this.record_);
                        }
                        if ((i & 2) == 2) {
                            this.localName_ = DesugarCollections.unmodifiableList(this.localName_);
                        }
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
        if ((i & 1) == 1) {
            this.record_ = DesugarCollections.unmodifiableList(this.record_);
        }
        if ((i & 2) == 2) {
            this.localName_ = DesugarCollections.unmodifiableList(this.localName_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
    }

    public static ahmg getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.record_ = Collections.EMPTY_LIST;
        this.localName_ = Collections.EMPTY_LIST;
    }

    public static ahma newBuilder(ahmg ahmgVar) {
        ahma ahmaVarNewBuilder = newBuilder();
        ahmaVarNewBuilder.mergeFrom(ahmgVar);
        return ahmaVarNewBuilder;
    }

    public static ahmg parseDelimitedFrom(InputStream inputStream, ahog ahogVar) throws IOException {
        return PARSER.parseDelimitedFrom(inputStream, ahogVar);
    }

    public List<Integer> getLocalNameList() {
        return this.localName_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahmg> getParserForType() {
        return PARSER;
    }

    public List<ahmf> getRecordList() {
        return this.record_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.record_.size(); i2++) {
            iComputeMessageSize += ahoe.computeMessageSize(1, this.record_.get(i2));
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < this.localName_.size(); i3++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.localName_.get(i3).intValue());
        }
        int iComputeInt32SizeNoTag2 = iComputeMessageSize + iComputeInt32SizeNoTag;
        if (!getLocalNameList().isEmpty()) {
            iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
        }
        this.localNameMemoizedSerializedSize = iComputeInt32SizeNoTag;
        int size = iComputeInt32SizeNoTag2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
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
    public ahma newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahma toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.record_.size(); i++) {
            ahoeVar.writeMessage(1, this.record_.get(i));
        }
        if (getLocalNameList().size() > 0) {
            ahoeVar.writeRawVarint32(42);
            ahoeVar.writeRawVarint32(this.localNameMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.localName_.size(); i2++) {
            ahoeVar.writeInt32NoTag(this.localName_.get(i2).intValue());
        }
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahmg getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahma newBuilder() {
        return ahma.create();
    }

    private ahmg(ahok ahokVar) {
        super(ahokVar);
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahokVar.getUnknownFields();
    }

    private ahmg(boolean z) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
