package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahip extends ahon<ahip> implements ahph {
    public static ahpi<ahip> PARSER = new ahin();
    private static final ahip defaultInstance;
    private int bitField0_;
    private List<ahhc> class__;
    private List<ahgx> fileAnnotation_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ahim package_;
    private ahja qualifiedNames_;
    private ahjf strings_;
    private final ahoa unknownFields;

    static {
        ahip ahipVar = new ahip(true);
        defaultInstance = ahipVar;
        ahipVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    private ahip(ahoc ahocVar, ahog ahogVar) throws ahou {
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
                            if (tag == 10) {
                                ahje builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                                ahjf ahjfVar = (ahjf) ahocVar.readMessage(ahjf.PARSER, ahogVar);
                                this.strings_ = ahjfVar;
                                if (builder != null) {
                                    builder.mergeFrom(ahjfVar);
                                    this.strings_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                ahiu builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                                ahja ahjaVar = (ahja) ahocVar.readMessage(ahja.PARSER, ahogVar);
                                this.qualifiedNames_ = ahjaVar;
                                if (builder2 != null) {
                                    builder2.mergeFrom(ahjaVar);
                                    this.qualifiedNames_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                ahil builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                                ahim ahimVar = (ahim) ahocVar.readMessage(ahim.PARSER, ahogVar);
                                this.package_ = ahimVar;
                                if (builder3 != null) {
                                    builder3.mergeFrom(ahimVar);
                                    this.package_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                int i = (c == true ? 1 : 0) & 8;
                                c = c;
                                if (i != 8) {
                                    this.class__ = new ArrayList();
                                    c = (c == true ? 1 : 0) | '\b';
                                }
                                this.class__.add(ahocVar.readMessage(ahhc.PARSER, ahogVar));
                            } else if (tag == 42) {
                                int i2 = (c == true ? 1 : 0) & 16;
                                c = c;
                                if (i2 != 16) {
                                    this.fileAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 16;
                                }
                                this.fileAnnotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                            } else if (!parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & 8) == 8) {
                            this.class__ = DesugarCollections.unmodifiableList(this.class__);
                        }
                        if (((c == true ? 1 : 0) & 16) == 16) {
                            this.fileAnnotation_ = DesugarCollections.unmodifiableList(this.fileAnnotation_);
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
        if (((c == true ? 1 : 0) & 8) == 8) {
            this.class__ = DesugarCollections.unmodifiableList(this.class__);
        }
        if (((c == true ? 1 : 0) & 16) == 16) {
            this.fileAnnotation_ = DesugarCollections.unmodifiableList(this.fileAnnotation_);
        }
        try {
            ahoeVarNewInstance.flush();
        } catch (IOException unused2) {
        }
        this.unknownFields = ahnzVarNewOutput.toByteString();
        makeExtensionsImmutable();
    }

    public static ahip getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.strings_ = ahjf.getDefaultInstance();
        this.qualifiedNames_ = ahja.getDefaultInstance();
        this.package_ = ahim.getDefaultInstance();
        this.class__ = Collections.EMPTY_LIST;
        this.fileAnnotation_ = Collections.EMPTY_LIST;
    }

    public static ahio newBuilder(ahip ahipVar) {
        ahio ahioVarNewBuilder = newBuilder();
        ahioVarNewBuilder.mergeFrom(ahipVar);
        return ahioVarNewBuilder;
    }

    public static ahip parseFrom(InputStream inputStream, ahog ahogVar) throws IOException {
        return PARSER.parseFrom(inputStream, ahogVar);
    }

    public ahhc getClass_(int i) {
        return this.class__.get(i);
    }

    public int getClass_Count() {
        return this.class__.size();
    }

    public List<ahhc> getClass_List() {
        return this.class__;
    }

    public ahgx getFileAnnotation(int i) {
        return this.fileAnnotation_.get(i);
    }

    public int getFileAnnotationCount() {
        return this.fileAnnotation_.size();
    }

    public ahim getPackage() {
        return this.package_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahip> getParserForType() {
        return PARSER;
    }

    public ahja getQualifiedNames() {
        return this.qualifiedNames_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? ahoe.computeMessageSize(1, this.strings_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iComputeMessageSize += ahoe.computeMessageSize(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iComputeMessageSize += ahoe.computeMessageSize(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            iComputeMessageSize += ahoe.computeMessageSize(4, this.class__.get(i2));
        }
        for (int i3 = 0; i3 < this.fileAnnotation_.size(); i3++) {
            iComputeMessageSize += ahoe.computeMessageSize(5, this.fileAnnotation_.get(i3));
        }
        int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ahjf getStrings() {
        return this.strings_;
    }

    public boolean hasPackage() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasQualifiedNames() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasStrings() {
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
        if ((!hasQualifiedNames() || getQualifiedNames().isInitialized()) && (!hasPackage() || getPackage().isInitialized())) {
            int i = 0;
            while (true) {
                if (i >= getClass_Count()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= getFileAnnotationCount()) {
                            if (!extensionsAreInitialized()) {
                                break;
                            }
                        } else {
                            if (!getFileAnnotation(i2).isInitialized()) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    if (!getClass_(i).isInitialized()) {
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
    public ahio newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahio toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeMessage(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeMessage(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeMessage(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            ahoeVar.writeMessage(4, this.class__.get(i));
        }
        for (int i2 = 0; i2 < this.fileAnnotation_.size(); i2++) {
            ahoeVar.writeMessage(5, this.fileAnnotation_.get(i2));
        }
        ahomVarNewExtensionWriter.writeUntil(200, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahip getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahio newBuilder() {
        return ahio.create();
    }

    public /* synthetic */ ahip(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahip(ahol<ahip, ?> aholVar) {
        super(aholVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahip(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahip, ?>) aholVar);
    }

    private ahip(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
