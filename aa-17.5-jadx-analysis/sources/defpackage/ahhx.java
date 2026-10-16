package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhx extends ahon<ahhx> implements ahph {
    public static ahpi<ahhx> PARSER = new ahhv();
    private static final ahhx defaultInstance;
    private List<ahgx> annotation_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final ahoa unknownFields;

    static {
        ahhx ahhxVar = new ahhx(true);
        defaultInstance = ahhxVar;
        ahhxVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ahhx(ahoc ahocVar, ahog ahogVar) throws ahou {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int tag = ahocVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = ahocVar.readInt32();
                            } else if (tag == 18) {
                                if ((c & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c = 2;
                                }
                                this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                            } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
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
                } catch (ahou e) {
                    e.setUnfinishedMessage(this);
                    throw e;
                } catch (IOException e2) {
                    ahou ahouVar = new ahou(e2.getMessage());
                    ahouVar.setUnfinishedMessage(this);
                    throw ahouVar;
                }
            } catch (Throwable th2) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th2;
            }
        }
        if ((c & 2) == 2) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
        this.unknownFields = ahnzVarNewOutput.toByteString();
        makeExtensionsImmutable();
    }

    public static ahhx getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.name_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
    }

    public static ahhw newBuilder(ahhx ahhxVar) {
        ahhw ahhwVarNewBuilder = newBuilder();
        ahhwVarNewBuilder.mergeFrom(ahhxVar);
        return ahhwVarNewBuilder;
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

    public int getName() {
        return this.name_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahhx> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? ahoe.computeInt32Size(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iComputeInt32Size += ahoe.computeMessageSize(2, this.annotation_.get(i2));
        }
        int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) == 1;
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
        int i = 0;
        while (true) {
            if (i >= getAnnotationCount()) {
                if (!extensionsAreInitialized()) {
                    break;
                }
            } else {
                if (!getAnnotation(i).isInitialized()) {
                    break;
                }
                i++;
            }
        }
        r1 = 0;
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahhw newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahhw toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.name_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            ahoeVar.writeMessage(2, this.annotation_.get(i));
        }
        ahomVarNewExtensionWriter.writeUntil(200, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahhx getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahhw newBuilder() {
        return ahhw.create();
    }

    public /* synthetic */ ahhx(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahhx(ahol<ahhx, ?> aholVar) {
        super(aholVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahhx(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahhx, ?>) aholVar);
    }

    private ahhx(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
