package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahkb extends ahon<ahkb> implements ahph {
    public static ahpi<ahkb> PARSER = new ahjz();
    private static final ahkb defaultInstance;
    private ahgu annotationParameterDefaultValue_;
    private List<ahgx> annotation_;
    private int bitField0_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int typeId_;
    private ahjn type_;
    private final ahoa unknownFields;
    private int varargElementTypeId_;
    private ahjn varargElementType_;

    static {
        ahkb ahkbVar = new ahkb(true);
        defaultInstance = ahkbVar;
        ahkbVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ahkb(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                                this.flags_ = ahocVar.readInt32();
                            } else if (tag != 16) {
                                if (tag == 26) {
                                    ahjm builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                    ahjn ahjnVar = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                    this.type_ = ahjnVar;
                                    if (builder != null) {
                                        builder.mergeFrom(ahjnVar);
                                        this.type_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    ahjm builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                    ahjn ahjnVar2 = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                                    this.varargElementType_ = ahjnVar2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(ahjnVar2);
                                        this.varargElementType_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 16;
                                } else if (tag == 40) {
                                    this.bitField0_ |= 8;
                                    this.typeId_ = ahocVar.readInt32();
                                } else if (tag == 48) {
                                    this.bitField0_ |= 32;
                                    this.varargElementTypeId_ = ahocVar.readInt32();
                                } else if (tag == 58) {
                                    int i = (c == true ? 1 : 0) & '@';
                                    c = c;
                                    if (i != 64) {
                                        this.annotation_ = new ArrayList();
                                        c = '@';
                                    }
                                    this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                                } else if (tag == 66) {
                                    ahgr builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                    ahgu ahguVar = (ahgu) ahocVar.readMessage(ahgu.PARSER, ahogVar);
                                    this.annotationParameterDefaultValue_ = ahguVar;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(ahguVar);
                                        this.annotationParameterDefaultValue_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 64;
                                } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.name_ = ahocVar.readInt32();
                            }
                        }
                        z = true;
                    } catch (ahou e) {
                        e.setUnfinishedMessage(this);
                        throw e;
                    } catch (IOException e2) {
                        ahou ahouVar = new ahou(e2.getMessage());
                        ahouVar.setUnfinishedMessage(this);
                        throw ahouVar;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
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
            } catch (Throwable th2) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th2;
            }
        }
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
        this.unknownFields = ahnzVarNewOutput.toByteString();
        makeExtensionsImmutable();
    }

    public static ahkb getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 0;
        this.name_ = 0;
        this.type_ = ahjn.getDefaultInstance();
        this.typeId_ = 0;
        this.varargElementType_ = ahjn.getDefaultInstance();
        this.varargElementTypeId_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
        this.annotationParameterDefaultValue_ = ahgu.getDefaultInstance();
    }

    public static ahka newBuilder(ahkb ahkbVar) {
        ahka ahkaVarNewBuilder = newBuilder();
        ahkaVarNewBuilder.mergeFrom(ahkbVar);
        return ahkaVarNewBuilder;
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

    public ahgu getAnnotationParameterDefaultValue() {
        return this.annotationParameterDefaultValue_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahkb> getParserForType() {
        return PARSER;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bitField0_;
        int iComputeInt32Size = (i2 & 1) == 1 ? ahoe.computeInt32Size(1, this.flags_) : 0;
        if ((i2 & 2) == 2) {
            iComputeInt32Size += ahoe.computeInt32Size(2, this.name_);
        }
        if ((i2 & 4) == 4) {
            iComputeInt32Size += ahoe.computeMessageSize(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iComputeInt32Size += ahoe.computeMessageSize(4, this.varargElementType_);
        }
        int i3 = this.bitField0_;
        if ((i3 & 8) == 8) {
            iComputeInt32Size += ahoe.computeInt32Size(5, this.typeId_);
        }
        if ((i3 & 32) == 32) {
            iComputeInt32Size += ahoe.computeInt32Size(6, this.varargElementTypeId_);
        }
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            iComputeInt32Size += ahoe.computeMessageSize(7, this.annotation_.get(i4));
        }
        if ((this.bitField0_ & 64) == 64) {
            iComputeInt32Size += ahoe.computeMessageSize(8, this.annotationParameterDefaultValue_);
        }
        int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ahjn getType() {
        return this.type_;
    }

    public int getTypeId() {
        return this.typeId_;
    }

    public ahjn getVarargElementType() {
        return this.varargElementType_;
    }

    public int getVarargElementTypeId() {
        return this.varargElementTypeId_;
    }

    public boolean hasAnnotationParameterDefaultValue() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasVarargElementType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasVarargElementTypeId() {
        return (this.bitField0_ & 32) == 32;
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
        if (hasName() && ((!hasType() || getType().isInitialized()) && (!hasVarargElementType() || getVarargElementType().isInitialized()))) {
            int i = 0;
            while (true) {
                if (i >= getAnnotationCount()) {
                    if ((hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) || !extensionsAreInitialized()) {
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
        } else {
            r1 = 0;
        }
        this.memoizedIsInitialized = r1;
        return r1;
    }

    @Override // defpackage.ahpg
    public ahka newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahka toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeMessage(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeMessage(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeInt32(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            ahoeVar.writeInt32(6, this.varargElementTypeId_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            ahoeVar.writeMessage(7, this.annotation_.get(i));
        }
        if ((this.bitField0_ & 64) == 64) {
            ahoeVar.writeMessage(8, this.annotationParameterDefaultValue_);
        }
        ahomVarNewExtensionWriter.writeUntil(200, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahkb getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahka newBuilder() {
        return ahka.create();
    }

    public /* synthetic */ ahkb(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahkb(ahol<ahkb, ?> aholVar) {
        super(aholVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahkb(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahkb, ?>) aholVar);
    }

    private ahkb(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
