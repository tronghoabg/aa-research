package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhc extends ahon<ahhc> implements ahph {
    public static ahpi<ahhc> PARSER = new ahgy();
    private static final ahhc defaultInstance;
    private List<ahgx> annotation_;
    private int bitField0_;
    private int companionObjectName_;
    private List<ahhf> compilerPluginData_;
    private List<ahhi> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<ahjn> contextReceiverType_;
    private List<ahhx> enumEntry_;
    private int flags_;
    private int fqName_;
    private List<ahif> function_;
    private int inlineClassUnderlyingPropertyName_;
    private int inlineClassUnderlyingTypeId_;
    private ahjn inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int nestedClassNameMemoizedSerializedSize;
    private List<Integer> nestedClassName_;
    private List<ahis> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    private List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    private List<Integer> supertypeId_;
    private List<ahjn> supertype_;
    private List<ahjq> typeAlias_;
    private List<ahjv> typeParameter_;
    private ahjy typeTable_;
    private final ahoa unknownFields;
    private ahkl versionRequirementTable_;
    private List<Integer> versionRequirement_;

    static {
        ahhc ahhcVar = new ahhc(true);
        defaultInstance = ahhcVar;
        ahhcVar.initFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private ahhc(ahoc ahocVar, ahog ahogVar) throws Throwable {
        char c;
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        ahnz ahnzVarNewOutput = ahoa.newOutput();
        boolean z = true;
        ahoe ahoeVarNewInstance = ahoe.newInstance(ahnzVarNewOutput, 1);
        boolean z2 = false;
        char c2 = 0;
        while (true) {
            boolean z3 = z;
            try {
                if (z2) {
                    if (((c2 == true ? 1 : 0) & 32) == 32) {
                        this.supertypeId_ = DesugarCollections.unmodifiableList(this.supertypeId_);
                    }
                    if (((c2 == true ? 1 : 0) & 8) == 8) {
                        this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
                    }
                    if (((c2 == true ? 1 : 0) & 16) == 16) {
                        this.supertype_ = DesugarCollections.unmodifiableList(this.supertype_);
                    }
                    if (((c2 == true ? 1 : 0) & 64) == 64) {
                        this.nestedClassName_ = DesugarCollections.unmodifiableList(this.nestedClassName_);
                    }
                    if (((c2 == true ? 1 : 0) & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                        this.constructor_ = DesugarCollections.unmodifiableList(this.constructor_);
                    }
                    if (((c2 == true ? 1 : 0) & 1024) == 1024) {
                        this.function_ = DesugarCollections.unmodifiableList(this.function_);
                    }
                    if (((c2 == true ? 1 : 0) & 2048) == 2048) {
                        this.property_ = DesugarCollections.unmodifiableList(this.property_);
                    }
                    if (((c2 == true ? 1 : 0) & 4096) == 4096) {
                        this.typeAlias_ = DesugarCollections.unmodifiableList(this.typeAlias_);
                    }
                    if (((c2 == true ? 1 : 0) & 8192) == 8192) {
                        this.enumEntry_ = DesugarCollections.unmodifiableList(this.enumEntry_);
                    }
                    if (((c2 == true ? 1 : 0) & 16384) == 16384) {
                        this.sealedSubclassFqName_ = DesugarCollections.unmodifiableList(this.sealedSubclassFqName_);
                    }
                    if (((c2 == true ? 1 : 0) & 128) == 128) {
                        this.contextReceiverType_ = DesugarCollections.unmodifiableList(this.contextReceiverType_);
                    }
                    if (((c2 == true ? 1 : 0) & 256) == 256) {
                        this.contextReceiverTypeId_ = DesugarCollections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if (((c2 == true ? 1 : 0) & 262144) == 262144) {
                        this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                    }
                    if (((c2 == true ? 1 : 0) & 1048576) == 1048576) {
                        this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
                    }
                    if (((c2 == true ? 1 : 0) & 4194304) == 4194304) {
                        this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
                    }
                    try {
                        ahoeVarNewInstance.flush();
                    } catch (IOException unused) {
                    }
                    this.unknownFields = ahnzVarNewOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    int tag = ahocVar.readTag();
                    switch (tag) {
                        case 0:
                            z = z3;
                            z2 = z;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = ahocVar.readInt32();
                            z = z3;
                        case 16:
                            int i = (c2 == true ? 1 : 0) & 32;
                            c2 = c2;
                            if (i != 32) {
                                this.supertypeId_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | ' ';
                            }
                            this.supertypeId_.add(Integer.valueOf(ahocVar.readInt32()));
                            z = z3;
                        case 18:
                            int iPushLimit = ahocVar.pushLimit(ahocVar.readRawVarint32());
                            int i2 = (c2 == true ? 1 : 0) & 32;
                            c2 = c2;
                            if (i2 != 32) {
                                c2 = c2;
                                if (ahocVar.getBytesUntilLimit() > 0) {
                                    this.supertypeId_ = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | ' ';
                                }
                            }
                            while (ahocVar.getBytesUntilLimit() > 0) {
                                this.supertypeId_.add(Integer.valueOf(ahocVar.readInt32()));
                            }
                            ahocVar.popLimit(iPushLimit);
                            z = z3;
                        case 24:
                            this.bitField0_ |= 2;
                            this.fqName_ = ahocVar.readInt32();
                            z = z3;
                        case 32:
                            this.bitField0_ |= 4;
                            this.companionObjectName_ = ahocVar.readInt32();
                            z = z3;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            int i3 = (c2 == true ? 1 : 0) & 8;
                            c2 = c2;
                            if (i3 != 8) {
                                this.typeParameter_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | '\b';
                            }
                            this.typeParameter_.add(ahocVar.readMessage(ahjv.PARSER, ahogVar));
                            z = z3;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            int i4 = (c2 == true ? 1 : 0) & 16;
                            c2 = c2;
                            if (i4 != 16) {
                                this.supertype_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 16;
                            }
                            this.supertype_.add(ahocVar.readMessage(ahjn.PARSER, ahogVar));
                            z = z3;
                        case 56:
                            int i5 = (c2 == true ? 1 : 0) & 64;
                            c2 = c2;
                            if (i5 != 64) {
                                this.nestedClassName_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | '@';
                            }
                            this.nestedClassName_.add(Integer.valueOf(ahocVar.readInt32()));
                            z = z3;
                        case 58:
                            int iPushLimit2 = ahocVar.pushLimit(ahocVar.readRawVarint32());
                            int i6 = (c2 == true ? 1 : 0) & 64;
                            c2 = c2;
                            if (i6 != 64) {
                                c2 = c2;
                                if (ahocVar.getBytesUntilLimit() > 0) {
                                    this.nestedClassName_ = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | '@';
                                }
                            }
                            while (ahocVar.getBytesUntilLimit() > 0) {
                                this.nestedClassName_.add(Integer.valueOf(ahocVar.readInt32()));
                            }
                            ahocVar.popLimit(iPushLimit2);
                            z = z3;
                        case 66:
                            int i7 = (c2 == true ? 1 : 0) & sk.AUDIO_CONTENT_BUFFER_SIZE;
                            c2 = c2;
                            if (i7 != 512) {
                                this.constructor_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 512;
                            }
                            this.constructor_.add(ahocVar.readMessage(ahhi.PARSER, ahogVar));
                            z = z3;
                        case 74:
                            int i8 = (c2 == true ? 1 : 0) & 1024;
                            c2 = c2;
                            if (i8 != 1024) {
                                this.function_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 1024;
                            }
                            this.function_.add(ahocVar.readMessage(ahif.PARSER, ahogVar));
                            z = z3;
                        case 82:
                            int i9 = (c2 == true ? 1 : 0) & 2048;
                            c2 = c2;
                            if (i9 != 2048) {
                                this.property_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 2048;
                            }
                            this.property_.add(ahocVar.readMessage(ahis.PARSER, ahogVar));
                            z = z3;
                        case 90:
                            int i10 = (c2 == true ? 1 : 0) & 4096;
                            c2 = c2;
                            if (i10 != 4096) {
                                this.typeAlias_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 4096;
                            }
                            this.typeAlias_.add(ahocVar.readMessage(ahjq.PARSER, ahogVar));
                            z = z3;
                        case 106:
                            int i11 = (c2 == true ? 1 : 0) & 8192;
                            c2 = c2;
                            if (i11 != 8192) {
                                this.enumEntry_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 8192;
                            }
                            this.enumEntry_.add(ahocVar.readMessage(ahhx.PARSER, ahogVar));
                            z = z3;
                        case 128:
                            int i12 = (c2 == true ? 1 : 0) & 16384;
                            c2 = c2;
                            if (i12 != 16384) {
                                this.sealedSubclassFqName_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 16384;
                            }
                            this.sealedSubclassFqName_.add(Integer.valueOf(ahocVar.readInt32()));
                            z = z3;
                        case 130:
                            int iPushLimit3 = ahocVar.pushLimit(ahocVar.readRawVarint32());
                            int i13 = (c2 == true ? 1 : 0) & 16384;
                            c2 = c2;
                            if (i13 != 16384) {
                                c2 = c2;
                                if (ahocVar.getBytesUntilLimit() > 0) {
                                    this.sealedSubclassFqName_ = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 16384;
                                }
                            }
                            while (ahocVar.getBytesUntilLimit() > 0) {
                                this.sealedSubclassFqName_.add(Integer.valueOf(ahocVar.readInt32()));
                            }
                            ahocVar.popLimit(iPushLimit3);
                            z = z3;
                        case 136:
                            this.bitField0_ |= 8;
                            this.inlineClassUnderlyingPropertyName_ = ahocVar.readInt32();
                            z = z3;
                        case 146:
                            ahjm builder = (this.bitField0_ & 16) == 16 ? this.inlineClassUnderlyingType_.toBuilder() : null;
                            ahjn ahjnVar = (ahjn) ahocVar.readMessage(ahjn.PARSER, ahogVar);
                            this.inlineClassUnderlyingType_ = ahjnVar;
                            if (builder != null) {
                                builder.mergeFrom(ahjnVar);
                                this.inlineClassUnderlyingType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 16;
                            z = z3;
                        case 152:
                            this.bitField0_ |= 32;
                            this.inlineClassUnderlyingTypeId_ = ahocVar.readInt32();
                            z = z3;
                        case 162:
                            int i14 = (c2 == true ? 1 : 0) & 128;
                            c2 = c2;
                            if (i14 != 128) {
                                this.contextReceiverType_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 128;
                            }
                            this.contextReceiverType_.add(ahocVar.readMessage(ahjn.PARSER, ahogVar));
                            z = z3;
                        case 168:
                            int i15 = (c2 == true ? 1 : 0) & 256;
                            c2 = c2;
                            if (i15 != 256) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 256;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(ahocVar.readInt32()));
                            z = z3;
                        case 170:
                            int iPushLimit4 = ahocVar.pushLimit(ahocVar.readRawVarint32());
                            int i16 = (c2 == true ? 1 : 0) & 256;
                            c2 = c2;
                            if (i16 != 256) {
                                c2 = c2;
                                if (ahocVar.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 256;
                                }
                            }
                            while (ahocVar.getBytesUntilLimit() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(ahocVar.readInt32()));
                            }
                            ahocVar.popLimit(iPushLimit4);
                            z = z3;
                        case 202:
                            int i17 = (c2 == true ? 1 : 0) & 262144;
                            c2 = c2;
                            if (i17 != 262144) {
                                this.annotation_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 0;
                            }
                            this.annotation_.add(ahocVar.readMessage(ahgx.PARSER, ahogVar));
                            z = z3;
                        case 242:
                            ahjx builder2 = (this.bitField0_ & 64) == 64 ? this.typeTable_.toBuilder() : null;
                            ahjy ahjyVar = (ahjy) ahocVar.readMessage(ahjy.PARSER, ahogVar);
                            this.typeTable_ = ahjyVar;
                            if (builder2 != null) {
                                builder2.mergeFrom(ahjyVar);
                                this.typeTable_ = builder2.buildPartial();
                            }
                            this.bitField0_ |= 64;
                            z = z3;
                        case 248:
                            int i18 = (c2 == true ? 1 : 0) & 1048576;
                            c2 = c2;
                            if (i18 != 1048576) {
                                this.versionRequirement_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 0;
                            }
                            this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                            z = z3;
                        case 250:
                            int iPushLimit5 = ahocVar.pushLimit(ahocVar.readRawVarint32());
                            int i19 = (c2 == true ? 1 : 0) & 1048576;
                            c2 = c2;
                            if (i19 != 1048576) {
                                c2 = c2;
                                if (ahocVar.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 0;
                                }
                            }
                            while (ahocVar.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(ahocVar.readInt32()));
                            }
                            ahocVar.popLimit(iPushLimit5);
                            z = z3;
                        case 258:
                            ahkk builder3 = (this.bitField0_ & 128) == 128 ? this.versionRequirementTable_.toBuilder() : null;
                            ahkl ahklVar = (ahkl) ahocVar.readMessage(ahkl.PARSER, ahogVar);
                            this.versionRequirementTable_ = ahklVar;
                            if (builder3 != null) {
                                builder3.mergeFrom(ahklVar);
                                this.versionRequirementTable_ = builder3.buildPartial();
                            }
                            this.bitField0_ |= 128;
                            z = z3;
                        case 266:
                            int i20 = (c2 == true ? 1 : 0) & 4194304;
                            c2 = c2;
                            if (i20 != 4194304) {
                                this.compilerPluginData_ = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 0;
                            }
                            this.compilerPluginData_.add(ahocVar.readMessage(ahhf.PARSER, ahogVar));
                            z = z3;
                        default:
                            c = 0;
                            try {
                                try {
                                    if (parseUnknownField(ahocVar, ahoeVarNewInstance, ahogVar, tag)) {
                                        z = z3;
                                    } else {
                                        z = z3;
                                        z2 = z;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (((c2 == true ? 1 : 0) & 32) == 32) {
                                        this.supertypeId_ = DesugarCollections.unmodifiableList(this.supertypeId_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 8) == 8) {
                                        this.typeParameter_ = DesugarCollections.unmodifiableList(this.typeParameter_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 16) == 16) {
                                        this.supertype_ = DesugarCollections.unmodifiableList(this.supertype_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 64) == 64) {
                                        this.nestedClassName_ = DesugarCollections.unmodifiableList(this.nestedClassName_);
                                    }
                                    if (((c2 == true ? 1 : 0) & sk.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                                        this.constructor_ = DesugarCollections.unmodifiableList(this.constructor_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 1024) == 1024) {
                                        this.function_ = DesugarCollections.unmodifiableList(this.function_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 2048) == 2048) {
                                        this.property_ = DesugarCollections.unmodifiableList(this.property_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 4096) == 4096) {
                                        this.typeAlias_ = DesugarCollections.unmodifiableList(this.typeAlias_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 8192) == 8192) {
                                        this.enumEntry_ = DesugarCollections.unmodifiableList(this.enumEntry_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 16384) == 16384) {
                                        this.sealedSubclassFqName_ = DesugarCollections.unmodifiableList(this.sealedSubclassFqName_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 128) == 128) {
                                        this.contextReceiverType_ = DesugarCollections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 256) == 256) {
                                        this.contextReceiverTypeId_ = DesugarCollections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 262144) == 262144) {
                                        this.annotation_ = DesugarCollections.unmodifiableList(this.annotation_);
                                    }
                                    if (((c2 == true ? 1 : 0) & 1048576) == 1048576) {
                                        this.versionRequirement_ = DesugarCollections.unmodifiableList(this.versionRequirement_);
                                    }
                                    if (((c2 == true ? 1 : 0) & c) == c) {
                                        this.compilerPluginData_ = DesugarCollections.unmodifiableList(this.compilerPluginData_);
                                    }
                                    try {
                                        ahoeVarNewInstance.flush();
                                    } catch (IOException unused2) {
                                    }
                                    this.unknownFields = ahnzVarNewOutput.toByteString();
                                    makeExtensionsImmutable();
                                    throw th;
                                }
                            } catch (ahou e) {
                                e = e;
                                e.setUnfinishedMessage(this);
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                ahou ahouVar = new ahou(e.getMessage());
                                ahouVar.setUnfinishedMessage(this);
                                throw ahouVar;
                            }
                    }
                } catch (ahou e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    c = 0;
                }
            } catch (Throwable th3) {
                this.unknownFields = ahnzVarNewOutput.toByteString();
                throw th3;
            }
        }
    }

    public static ahhc getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        this.typeParameter_ = Collections.EMPTY_LIST;
        this.supertype_ = Collections.EMPTY_LIST;
        this.supertypeId_ = Collections.EMPTY_LIST;
        this.nestedClassName_ = Collections.EMPTY_LIST;
        this.contextReceiverType_ = Collections.EMPTY_LIST;
        this.contextReceiverTypeId_ = Collections.EMPTY_LIST;
        this.constructor_ = Collections.EMPTY_LIST;
        this.function_ = Collections.EMPTY_LIST;
        this.property_ = Collections.EMPTY_LIST;
        this.typeAlias_ = Collections.EMPTY_LIST;
        this.enumEntry_ = Collections.EMPTY_LIST;
        this.sealedSubclassFqName_ = Collections.EMPTY_LIST;
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = ahjn.getDefaultInstance();
        this.inlineClassUnderlyingTypeId_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
        this.typeTable_ = ahjy.getDefaultInstance();
        this.versionRequirement_ = Collections.EMPTY_LIST;
        this.versionRequirementTable_ = ahkl.getDefaultInstance();
        this.compilerPluginData_ = Collections.EMPTY_LIST;
    }

    public static ahgz newBuilder(ahhc ahhcVar) {
        ahgz ahgzVarNewBuilder = newBuilder();
        ahgzVarNewBuilder.mergeFrom(ahhcVar);
        return ahgzVarNewBuilder;
    }

    public static ahhc parseFrom(InputStream inputStream, ahog ahogVar) throws IOException {
        return PARSER.parseFrom(inputStream, ahogVar);
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

    public int getCompanionObjectName() {
        return this.companionObjectName_;
    }

    public ahhf getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public List<ahhf> getCompilerPluginDataList() {
        return this.compilerPluginData_;
    }

    public ahhi getConstructor(int i) {
        return this.constructor_.get(i);
    }

    public int getConstructorCount() {
        return this.constructor_.size();
    }

    public List<ahhi> getConstructorList() {
        return this.constructor_;
    }

    public ahjn getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    public List<Integer> getContextReceiverTypeIdList() {
        return this.contextReceiverTypeId_;
    }

    public List<ahjn> getContextReceiverTypeList() {
        return this.contextReceiverType_;
    }

    public ahhx getEnumEntry(int i) {
        return this.enumEntry_.get(i);
    }

    public int getEnumEntryCount() {
        return this.enumEntry_.size();
    }

    public List<ahhx> getEnumEntryList() {
        return this.enumEntry_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFqName() {
        return this.fqName_;
    }

    public ahif getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public List<ahif> getFunctionList() {
        return this.function_;
    }

    public int getInlineClassUnderlyingPropertyName() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    public ahjn getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType_;
    }

    public int getInlineClassUnderlyingTypeId() {
        return this.inlineClassUnderlyingTypeId_;
    }

    public List<Integer> getNestedClassNameList() {
        return this.nestedClassName_;
    }

    @Override // defpackage.ahoq, defpackage.ahpg
    public ahpi<ahhc> getParserForType() {
        return PARSER;
    }

    public ahis getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public List<ahis> getPropertyList() {
        return this.property_;
    }

    public List<Integer> getSealedSubclassFqNameList() {
        return this.sealedSubclassFqName_;
    }

    @Override // defpackage.ahpg
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? ahoe.computeInt32Size(1, this.flags_) : 0;
        int iComputeInt32SizeNoTag = 0;
        for (int i2 = 0; i2 < this.supertypeId_.size(); i2++) {
            iComputeInt32SizeNoTag += ahoe.computeInt32SizeNoTag(this.supertypeId_.get(i2).intValue());
        }
        int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
        if (!getSupertypeIdList().isEmpty()) {
            iComputeMessageSize = iComputeMessageSize + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
        }
        this.supertypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag;
        int i3 = this.bitField0_;
        if ((i3 & 2) == 2) {
            iComputeMessageSize += ahoe.computeInt32Size(3, this.fqName_);
        }
        if ((i3 & 4) == 4) {
            iComputeMessageSize += ahoe.computeInt32Size(4, this.companionObjectName_);
        }
        for (int i4 = 0; i4 < this.typeParameter_.size(); i4++) {
            iComputeMessageSize += ahoe.computeMessageSize(5, this.typeParameter_.get(i4));
        }
        for (int i5 = 0; i5 < this.supertype_.size(); i5++) {
            iComputeMessageSize += ahoe.computeMessageSize(6, this.supertype_.get(i5));
        }
        int iComputeInt32SizeNoTag2 = 0;
        for (int i6 = 0; i6 < this.nestedClassName_.size(); i6++) {
            iComputeInt32SizeNoTag2 += ahoe.computeInt32SizeNoTag(this.nestedClassName_.get(i6).intValue());
        }
        int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
        if (!getNestedClassNameList().isEmpty()) {
            iComputeMessageSize2 = iComputeMessageSize2 + 1 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
        }
        this.nestedClassNameMemoizedSerializedSize = iComputeInt32SizeNoTag2;
        for (int i7 = 0; i7 < this.constructor_.size(); i7++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(8, this.constructor_.get(i7));
        }
        for (int i8 = 0; i8 < this.function_.size(); i8++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(9, this.function_.get(i8));
        }
        for (int i9 = 0; i9 < this.property_.size(); i9++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(10, this.property_.get(i9));
        }
        for (int i10 = 0; i10 < this.typeAlias_.size(); i10++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(11, this.typeAlias_.get(i10));
        }
        for (int i11 = 0; i11 < this.enumEntry_.size(); i11++) {
            iComputeMessageSize2 += ahoe.computeMessageSize(13, this.enumEntry_.get(i11));
        }
        int iComputeInt32SizeNoTag3 = 0;
        for (int i12 = 0; i12 < this.sealedSubclassFqName_.size(); i12++) {
            iComputeInt32SizeNoTag3 += ahoe.computeInt32SizeNoTag(this.sealedSubclassFqName_.get(i12).intValue());
        }
        int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
        if (!getSealedSubclassFqNameList().isEmpty()) {
            iComputeMessageSize3 = iComputeMessageSize3 + 2 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = iComputeInt32SizeNoTag3;
        int i13 = this.bitField0_;
        if ((i13 & 8) == 8) {
            iComputeMessageSize3 += ahoe.computeInt32Size(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((i13 & 16) == 16) {
            iComputeMessageSize3 += ahoe.computeMessageSize(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iComputeMessageSize3 += ahoe.computeInt32Size(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i14 = 0; i14 < this.contextReceiverType_.size(); i14++) {
            iComputeMessageSize3 += ahoe.computeMessageSize(20, this.contextReceiverType_.get(i14));
        }
        int iComputeInt32SizeNoTag4 = 0;
        for (int i15 = 0; i15 < this.contextReceiverTypeId_.size(); i15++) {
            iComputeInt32SizeNoTag4 += ahoe.computeInt32SizeNoTag(this.contextReceiverTypeId_.get(i15).intValue());
        }
        int iComputeMessageSize4 = iComputeMessageSize3 + iComputeInt32SizeNoTag4;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            iComputeMessageSize4 = iComputeMessageSize4 + 2 + ahoe.computeInt32SizeNoTag(iComputeInt32SizeNoTag4);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iComputeInt32SizeNoTag4;
        for (int i16 = 0; i16 < this.annotation_.size(); i16++) {
            iComputeMessageSize4 += ahoe.computeMessageSize(25, this.annotation_.get(i16));
        }
        if ((this.bitField0_ & 64) == 64) {
            iComputeMessageSize4 += ahoe.computeMessageSize(30, this.typeTable_);
        }
        int iComputeInt32SizeNoTag5 = 0;
        for (int i17 = 0; i17 < this.versionRequirement_.size(); i17++) {
            iComputeInt32SizeNoTag5 += ahoe.computeInt32SizeNoTag(this.versionRequirement_.get(i17).intValue());
        }
        int size = getVersionRequirementList().size();
        int iComputeMessageSize5 = iComputeMessageSize4 + iComputeInt32SizeNoTag5 + size + size;
        if ((this.bitField0_ & 128) == 128) {
            iComputeMessageSize5 += ahoe.computeMessageSize(32, this.versionRequirementTable_);
        }
        for (int i18 = 0; i18 < this.compilerPluginData_.size(); i18++) {
            iComputeMessageSize5 += ahoe.computeMessageSize(33, this.compilerPluginData_.get(i18));
        }
        int iExtensionsSerializedSize = iComputeMessageSize5 + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = iExtensionsSerializedSize;
        return iExtensionsSerializedSize;
    }

    public ahjn getSupertype(int i) {
        return this.supertype_.get(i);
    }

    public int getSupertypeCount() {
        return this.supertype_.size();
    }

    public List<Integer> getSupertypeIdList() {
        return this.supertypeId_;
    }

    public List<ahjn> getSupertypeList() {
        return this.supertype_;
    }

    public ahjq getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public List<ahjq> getTypeAliasList() {
        return this.typeAlias_;
    }

    public ahjv getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public List<ahjv> getTypeParameterList() {
        return this.typeParameter_;
    }

    public ahjy getTypeTable() {
        return this.typeTable_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public ahkl getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasCompanionObjectName() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasFqName() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasInlineClassUnderlyingPropertyName() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasInlineClassUnderlyingType() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasInlineClassUnderlyingTypeId() {
        return (this.bitField0_ & 32) == 32;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 64) == 64;
    }

    public boolean hasVersionRequirementTable() {
        return (this.bitField0_ & 128) == 128;
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
        if (hasFqName()) {
            int i = 0;
            while (true) {
                if (i >= getTypeParameterCount()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= getSupertypeCount()) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= getContextReceiverTypeCount()) {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= getConstructorCount()) {
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= getFunctionCount()) {
                                                    int i6 = 0;
                                                    while (true) {
                                                        if (i6 >= getPropertyCount()) {
                                                            int i7 = 0;
                                                            while (true) {
                                                                if (i7 >= getTypeAliasCount()) {
                                                                    int i8 = 0;
                                                                    while (true) {
                                                                        if (i8 >= getEnumEntryCount()) {
                                                                            if (!hasInlineClassUnderlyingType() || getInlineClassUnderlyingType().isInitialized()) {
                                                                                int i9 = 0;
                                                                                while (true) {
                                                                                    if (i9 >= getAnnotationCount()) {
                                                                                        if (!hasTypeTable() || getTypeTable().isInitialized()) {
                                                                                            int i10 = 0;
                                                                                            while (true) {
                                                                                                if (i10 >= getCompilerPluginDataCount()) {
                                                                                                    if (!extensionsAreInitialized()) {
                                                                                                        break;
                                                                                                    }
                                                                                                } else {
                                                                                                    if (!getCompilerPluginData(i10).isInitialized()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i10++;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (!getAnnotation(i9).isInitialized()) {
                                                                                            break;
                                                                                        }
                                                                                        i9++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (!getEnumEntry(i8).isInitialized()) {
                                                                                break;
                                                                            }
                                                                            i8++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (!getTypeAlias(i7).isInitialized()) {
                                                                        break;
                                                                    }
                                                                    i7++;
                                                                }
                                                            }
                                                        } else {
                                                            if (!getProperty(i6).isInitialized()) {
                                                                break;
                                                            }
                                                            i6++;
                                                        }
                                                    }
                                                } else {
                                                    if (!getFunction(i5).isInitialized()) {
                                                        break;
                                                    }
                                                    i5++;
                                                }
                                            }
                                        } else {
                                            if (!getConstructor(i4).isInitialized()) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else {
                                    if (!getContextReceiverType(i3).isInitialized()) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        } else {
                            if (!getSupertype(i2).isInitialized()) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    if (!getTypeParameter(i).isInitialized()) {
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
    public ahgz newBuilderForType() {
        return newBuilder();
    }

    @Override // defpackage.ahpg
    public ahgz toBuilder() {
        return newBuilder(this);
    }

    @Override // defpackage.ahpg
    public void writeTo(ahoe ahoeVar) throws IOException {
        getSerializedSize();
        ahom ahomVarNewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            ahoeVar.writeInt32(1, this.flags_);
        }
        if (getSupertypeIdList().size() > 0) {
            ahoeVar.writeRawVarint32(18);
            ahoeVar.writeRawVarint32(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            ahoeVar.writeInt32NoTag(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            ahoeVar.writeInt32(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            ahoeVar.writeInt32(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            ahoeVar.writeMessage(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            ahoeVar.writeMessage(6, this.supertype_.get(i3));
        }
        if (getNestedClassNameList().size() > 0) {
            ahoeVar.writeRawVarint32(58);
            ahoeVar.writeRawVarint32(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            ahoeVar.writeInt32NoTag(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            ahoeVar.writeMessage(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            ahoeVar.writeMessage(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            ahoeVar.writeMessage(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            ahoeVar.writeMessage(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            ahoeVar.writeMessage(13, this.enumEntry_.get(i9));
        }
        if (getSealedSubclassFqNameList().size() > 0) {
            ahoeVar.writeRawVarint32(130);
            ahoeVar.writeRawVarint32(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            ahoeVar.writeInt32NoTag(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            ahoeVar.writeInt32(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            ahoeVar.writeMessage(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            ahoeVar.writeInt32(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            ahoeVar.writeMessage(20, this.contextReceiverType_.get(i11));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            ahoeVar.writeRawVarint32(170);
            ahoeVar.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            ahoeVar.writeInt32NoTag(this.contextReceiverTypeId_.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
            ahoeVar.writeMessage(25, this.annotation_.get(i13));
        }
        if ((this.bitField0_ & 64) == 64) {
            ahoeVar.writeMessage(30, this.typeTable_);
        }
        for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
            ahoeVar.writeInt32(31, this.versionRequirement_.get(i14).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            ahoeVar.writeMessage(32, this.versionRequirementTable_);
        }
        for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
            ahoeVar.writeMessage(33, this.compilerPluginData_.get(i15));
        }
        ahomVarNewExtensionWriter.writeUntil(19000, ahoeVar);
        ahoeVar.writeRawBytes(this.unknownFields);
    }

    @Override // defpackage.ahph
    public ahhc getDefaultInstanceForType() {
        return defaultInstance;
    }

    public static ahgz newBuilder() {
        return ahgz.create();
    }

    public /* synthetic */ ahhc(ahoc ahocVar, ahog ahogVar, ahgm ahgmVar) throws ahou {
        this(ahocVar, ahogVar);
    }

    private ahhc(ahol<ahhc, ?> aholVar) {
        super(aholVar);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = aholVar.getUnknownFields();
    }

    public /* synthetic */ ahhc(ahol aholVar, ahgm ahgmVar) {
        this((ahol<ahhc, ?>) aholVar);
    }

    private ahhc(boolean z) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ahoa.EMPTY;
    }
}
