package com.google.o.a.a;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.media3.datasource.cache.ContentMetadata;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements c {
    public static final int BASE_FIELD_NUMBER = 16;
    public static final int BLOB_FIELD_NUMBER = 17;
    public static final int BLOB_VALUE_FIELD_NUMBER = 37;
    public static final int COTYPE_FIELD_NUMBER = 32;
    public static final int CREATE_DEFAULT_VALUE_TRIPLE_FIELD_NUMBER = 47;
    public static final int CUSTOM_FIELD_NUMBER = 10;
    public static final int CUSTOM_PROTO_FIELD_NUMBER = 38;
    private static final b DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 8;
    public static final int EXPECTED_TYPE_FIELD_NUMBER = 7;
    public static final int EXTEND_TYPE_FIELD_NUMBER = 46;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INTERNAL_CUSTOM_PROTO_PRIMITIVE_FIELD_NUMBER = 42;
    public static final int INTERNAL_EXTENDED_BY_FIELD_NUMBER = 39;
    public static final int INTERNAL_FULL_PROTO_NAME_FIELD_NUMBER = 24;
    public static final int INTERNAL_LINE_FIELD_NUMBER = 27;
    public static final int INTERNAL_PROTOFIER_FUNCTION_FIELD_NUMBER = 25;
    public static final int KEY_FIELD_NUMBER = 23;
    public static final int LEGACY_FIELD_NUMBER = 19;
    public static final int MEDIATOR_TYPE_FIELD_NUMBER = 30;
    public static final int MID_FIELD_NUMBER = 11;
    public static final int NAMESPACE_PRED_FIELD_NUMBER = 36;
    public static final int NAME_FIELD_NUMBER = 21;
    public static final int ORDINAL_FIELD_NUMBER = 31;
    private static volatile fo<b> PARSER = null;
    public static final int PQ_EXPRESSION_FIELD_NUMBER = 45;
    public static final int PRED_ENUM_FIELD_FIELD_NUMBER = 43;
    public static final int PRED_FIELD_NUMBER = 22;
    public static final int PROTO_ONLY_FIELD_NUMBER = 20;
    public static final int RANK_FIELD_NUMBER = 14;
    public static final int SPLICE_FIELD_NUMBER = 15;
    public static final int SUPPRESS_PROTOFICATION_FIELD_NUMBER = 35;
    public static final int SUPPRESS_TRIPLIFICATION_FIELD_NUMBER = 34;
    public static final int TEXT_LANG_FIELD_FIELD_NUMBER = 40;
    public static final int TEXT_LANG_FIELD_NUMBER = 33;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean blobValue_;
    private boolean cotype_;
    private boolean createDefaultValueTriple_;
    private boolean internalCustomProtoPrimitive_;
    private int internalLine_;
    private boolean protoOnly_;
    private boolean suppressProtofication_;
    private boolean suppressTriplification_;
    private String id_ = "";
    private String name_ = "";
    private String pred_ = "";
    private String key_ = "";
    private String mid_ = "";
    private String base_ = "";
    private String type_ = "";
    private String expectedType_ = "";
    private String description_ = "";
    private String custom_ = "";
    private String customProto_ = "";
    private String rank_ = "";
    private String mediatorType_ = "";
    private String ordinal_ = "";
    private String splice_ = "";
    private String blob_ = "";
    private eo<b> legacy_ = emptyProtobufList();
    private String textLang_ = "";
    private String namespacePred_ = "";
    private String textLangField_ = "";
    private String predEnumField_ = "";
    private String pqExpression_ = "";
    private String extendType_ = "";
    private String internalFullProtoName_ = "";
    private String internalProtofierFunction_ = "";
    private eo<String> internalExtendedBy_ = emptyProtobufList();

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInternalExtendedBy(Iterable<String> iterable) {
        ensureInternalExtendedByIsMutable();
        com.google.v.c.addAll(iterable, this.internalExtendedBy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLegacy(Iterable<? extends b> iterable) {
        ensureLegacyIsMutable();
        com.google.v.c.addAll(iterable, this.legacy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInternalExtendedBy(String str) {
        Objects.requireNonNull(str);
        ensureInternalExtendedByIsMutable();
        this.internalExtendedBy_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInternalExtendedByBytes(v vVar) {
        ensureInternalExtendedByIsMutable();
        this.internalExtendedBy_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegacy(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureLegacyIsMutable();
        this.legacy_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.bitField0_ &= -33;
        this.base_ = getDefaultInstance().getBase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlob() {
        this.bitField0_ &= -32769;
        this.blob_ = getDefaultInstance().getBlob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlobValue() {
        this.bitField0_ &= -4194305;
        this.blobValue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCotype() {
        this.bitField0_ &= -131073;
        this.cotype_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateDefaultValueTriple() {
        this.bitField0_ &= -134217729;
        this.createDefaultValueTriple_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustom() {
        this.bitField0_ &= -513;
        this.custom_ = getDefaultInstance().getCustom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomProto() {
        this.bitField0_ &= -1025;
        this.customProto_ = getDefaultInstance().getCustomProto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -257;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpectedType() {
        this.bitField0_ &= -129;
        this.expectedType_ = getDefaultInstance().getExpectedType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendType() {
        this.bitField0_ &= -67108865;
        this.extendType_ = getDefaultInstance().getExtendType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalCustomProtoPrimitive() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.internalCustomProtoPrimitive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalExtendedBy() {
        this.internalExtendedBy_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalFullProtoName() {
        this.bitField0_ &= -268435457;
        this.internalFullProtoName_ = getDefaultInstance().getInternalFullProtoName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalLine() {
        this.bitField0_ &= -1073741825;
        this.internalLine_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalProtofierFunction() {
        this.bitField0_ &= -536870913;
        this.internalProtofierFunction_ = getDefaultInstance().getInternalProtofierFunction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -9;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacy() {
        this.legacy_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediatorType() {
        this.bitField0_ &= -4097;
        this.mediatorType_ = getDefaultInstance().getMediatorType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.bitField0_ &= -17;
        this.mid_ = getDefaultInstance().getMid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNamespacePred() {
        this.bitField0_ &= -2097153;
        this.namespacePred_ = getDefaultInstance().getNamespacePred();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrdinal() {
        this.bitField0_ &= -8193;
        this.ordinal_ = getDefaultInstance().getOrdinal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPqExpression() {
        this.bitField0_ &= -33554433;
        this.pqExpression_ = getDefaultInstance().getPqExpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPred() {
        this.bitField0_ &= -5;
        this.pred_ = getDefaultInstance().getPred();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredEnumField() {
        this.bitField0_ &= -16777217;
        this.predEnumField_ = getDefaultInstance().getPredEnumField();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtoOnly() {
        this.bitField0_ &= -65537;
        this.protoOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.bitField0_ &= -2049;
        this.rank_ = getDefaultInstance().getRank();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSplice() {
        this.bitField0_ &= -16385;
        this.splice_ = getDefaultInstance().getSplice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuppressProtofication() {
        this.bitField0_ &= -1048577;
        this.suppressProtofication_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuppressTriplification() {
        this.bitField0_ &= -524289;
        this.suppressTriplification_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextLang() {
        this.bitField0_ &= -262145;
        this.textLang_ = getDefaultInstance().getTextLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextLangField() {
        this.bitField0_ &= -8388609;
        this.textLangField_ = getDefaultInstance().getTextLangField();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -65;
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureInternalExtendedByIsMutable() {
        eo<String> eoVar = this.internalExtendedBy_;
        if (eoVar.c()) {
            return;
        }
        this.internalExtendedBy_ = du.mutableCopy(eoVar);
    }

    private void ensureLegacyIsMutable() {
        eo<b> eoVar = this.legacy_;
        if (eoVar.c()) {
            return;
        }
        this.legacy_ = du.mutableCopy(eoVar);
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLegacy(int i2) {
        ensureLegacyIsMutable();
        this.legacy_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.base_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseBytes(v vVar) {
        this.base_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlob(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.blob_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlobBytes(v vVar) {
        this.blob_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlobValue(boolean z) {
        this.bitField0_ |= 4194304;
        this.blobValue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCotype(boolean z) {
        this.bitField0_ |= 131072;
        this.cotype_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateDefaultValueTriple(boolean z) {
        this.bitField0_ |= 134217728;
        this.createDefaultValueTriple_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustom(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.custom_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomBytes(v vVar) {
        this.custom_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomProto(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.customProto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomProtoBytes(v vVar) {
        this.customProto_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.expectedType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedTypeBytes(v vVar) {
        this.expectedType_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 67108864;
        this.extendType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendTypeBytes(v vVar) {
        this.extendType_ = vVar.u();
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalCustomProtoPrimitive(boolean z) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.internalCustomProtoPrimitive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalExtendedBy(int i2, String str) {
        Objects.requireNonNull(str);
        ensureInternalExtendedByIsMutable();
        this.internalExtendedBy_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalFullProtoName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 268435456;
        this.internalFullProtoName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalFullProtoNameBytes(v vVar) {
        this.internalFullProtoName_ = vVar.u();
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalLine(int i2) {
        this.bitField0_ |= 1073741824;
        this.internalLine_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalProtofierFunction(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 536870912;
        this.internalProtofierFunction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalProtofierFunctionBytes(v vVar) {
        this.internalProtofierFunction_ = vVar.u();
        this.bitField0_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(v vVar) {
        this.key_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacy(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureLegacyIsMutable();
        this.legacy_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediatorType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.mediatorType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediatorTypeBytes(v vVar) {
        this.mediatorType_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.mid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMidBytes(v vVar) {
        this.mid_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamespacePred(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2097152;
        this.namespacePred_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamespacePredBytes(v vVar) {
        this.namespacePred_ = vVar.u();
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrdinal(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.ordinal_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrdinalBytes(v vVar) {
        this.ordinal_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPqExpression(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.pqExpression_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPqExpressionBytes(v vVar) {
        this.pqExpression_ = vVar.u();
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPred(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.pred_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredBytes(v vVar) {
        this.pred_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredEnumField(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16777216;
        this.predEnumField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredEnumFieldBytes(v vVar) {
        this.predEnumField_ = vVar.u();
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtoOnly(boolean z) {
        this.bitField0_ |= 65536;
        this.protoOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.rank_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankBytes(v vVar) {
        this.rank_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSplice(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.splice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpliceBytes(v vVar) {
        this.splice_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuppressProtofication(boolean z) {
        this.bitField0_ |= 1048576;
        this.suppressProtofication_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuppressTriplification(boolean z) {
        this.bitField0_ |= 524288;
        this.suppressTriplification_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 262144;
        this.textLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextLangBytes(v vVar) {
        this.textLang_ = vVar.u();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextLangField(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8388608;
        this.textLangField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextLangFieldBytes(v vVar) {
        this.textLangField_ = vVar.u();
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(v vVar) {
        this.type_ = vVar.u();
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\"\u0000\u0001\u0001/\"\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0006\u0007ဈ\u0007\bဈ\b\nဈ\t\u000bဈ\u0004\u000eဈ\u000b\u000fဈ\u000e\u0010ဈ\u0005\u0011ဈ\u000f\u0013\u001b\u0014ဇ\u0010\u0015ဈ\u0001\u0016ဈ\u0002\u0017ဈ\u0003\u0018ဈ\u001c\u0019ဈ\u001d\u001bင\u001e\u001eဈ\f\u001fဈ\r ဇ\u0011!ဈ\u0012\"ဇ\u0013#ဇ\u0014$ဈ\u0015%ဇ\u0016&ဈ\n'\u001a(ဈ\u0017*ဇ\u001f+ဈ\u0018-ဈ\u0019.ဈ\u001a/ဇ\u001b", new Object[]{"bitField0_", "id_", "type_", "expectedType_", "description_", ContentMetadata.KEY_CUSTOM_PREFIX, "mid_", "rank_", "splice_", "base_", "blob_", "legacy_", b.class, "protoOnly_", "name_", "pred_", "key_", "internalFullProtoName_", "internalProtofierFunction_", "internalLine_", "mediatorType_", "ordinal_", "cotype_", "textLang_", "suppressTriplification_", "suppressProtofication_", "namespacePred_", "blobValue_", "customProto_", "internalExtendedBy_", "textLangField_", "internalCustomProtoPrimitive_", "predEnumField_", "pqExpression_", "extendType_", "createDefaultValueTriple_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBase() {
        return this.base_;
    }

    public v getBaseBytes() {
        return v.s(this.base_);
    }

    public String getBlob() {
        return this.blob_;
    }

    public v getBlobBytes() {
        return v.s(this.blob_);
    }

    public boolean getBlobValue() {
        return this.blobValue_;
    }

    public boolean getCotype() {
        return this.cotype_;
    }

    public boolean getCreateDefaultValueTriple() {
        return this.createDefaultValueTriple_;
    }

    public String getCustom() {
        return this.custom_;
    }

    public v getCustomBytes() {
        return v.s(this.custom_);
    }

    public String getCustomProto() {
        return this.customProto_;
    }

    public v getCustomProtoBytes() {
        return v.s(this.customProto_);
    }

    public String getDescription() {
        return this.description_;
    }

    public v getDescriptionBytes() {
        return v.s(this.description_);
    }

    public String getExpectedType() {
        return this.expectedType_;
    }

    public v getExpectedTypeBytes() {
        return v.s(this.expectedType_);
    }

    public String getExtendType() {
        return this.extendType_;
    }

    public v getExtendTypeBytes() {
        return v.s(this.extendType_);
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public boolean getInternalCustomProtoPrimitive() {
        return this.internalCustomProtoPrimitive_;
    }

    public String getInternalExtendedBy(int i2) {
        return this.internalExtendedBy_.get(i2);
    }

    public v getInternalExtendedByBytes(int i2) {
        return v.s(this.internalExtendedBy_.get(i2));
    }

    public int getInternalExtendedByCount() {
        return this.internalExtendedBy_.size();
    }

    public List<String> getInternalExtendedByList() {
        return this.internalExtendedBy_;
    }

    public String getInternalFullProtoName() {
        return this.internalFullProtoName_;
    }

    public v getInternalFullProtoNameBytes() {
        return v.s(this.internalFullProtoName_);
    }

    public int getInternalLine() {
        return this.internalLine_;
    }

    public String getInternalProtofierFunction() {
        return this.internalProtofierFunction_;
    }

    public v getInternalProtofierFunctionBytes() {
        return v.s(this.internalProtofierFunction_);
    }

    public String getKey() {
        return this.key_;
    }

    public v getKeyBytes() {
        return v.s(this.key_);
    }

    public b getLegacy(int i2) {
        return this.legacy_.get(i2);
    }

    public int getLegacyCount() {
        return this.legacy_.size();
    }

    public List<b> getLegacyList() {
        return this.legacy_;
    }

    public c getLegacyOrBuilder(int i2) {
        return this.legacy_.get(i2);
    }

    public List<? extends c> getLegacyOrBuilderList() {
        return this.legacy_;
    }

    public String getMediatorType() {
        return this.mediatorType_;
    }

    public v getMediatorTypeBytes() {
        return v.s(this.mediatorType_);
    }

    public String getMid() {
        return this.mid_;
    }

    public v getMidBytes() {
        return v.s(this.mid_);
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public String getNamespacePred() {
        return this.namespacePred_;
    }

    public v getNamespacePredBytes() {
        return v.s(this.namespacePred_);
    }

    public String getOrdinal() {
        return this.ordinal_;
    }

    public v getOrdinalBytes() {
        return v.s(this.ordinal_);
    }

    public String getPqExpression() {
        return this.pqExpression_;
    }

    public v getPqExpressionBytes() {
        return v.s(this.pqExpression_);
    }

    public String getPred() {
        return this.pred_;
    }

    public v getPredBytes() {
        return v.s(this.pred_);
    }

    public String getPredEnumField() {
        return this.predEnumField_;
    }

    public v getPredEnumFieldBytes() {
        return v.s(this.predEnumField_);
    }

    public boolean getProtoOnly() {
        return this.protoOnly_;
    }

    public String getRank() {
        return this.rank_;
    }

    public v getRankBytes() {
        return v.s(this.rank_);
    }

    public String getSplice() {
        return this.splice_;
    }

    public v getSpliceBytes() {
        return v.s(this.splice_);
    }

    public boolean getSuppressProtofication() {
        return this.suppressProtofication_;
    }

    public boolean getSuppressTriplification() {
        return this.suppressTriplification_;
    }

    public String getTextLang() {
        return this.textLang_;
    }

    public v getTextLangBytes() {
        return v.s(this.textLang_);
    }

    public String getTextLangField() {
        return this.textLangField_;
    }

    public v getTextLangFieldBytes() {
        return v.s(this.textLangField_);
    }

    public String getType() {
        return this.type_;
    }

    public v getTypeBytes() {
        return v.s(this.type_);
    }

    public boolean hasBase() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBlob() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasBlobValue() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasCotype() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasCreateDefaultValueTriple() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasCustom() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCustomProto() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasExpectedType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasExtendType() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInternalCustomProtoPrimitive() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasInternalFullProtoName() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasInternalLine() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasInternalProtofierFunction() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMediatorType() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasMid() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNamespacePred() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasOrdinal() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasPqExpression() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasPred() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPredEnumField() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasProtoOnly() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasRank() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSplice() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasSuppressProtofication() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasSuppressTriplification() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasTextLang() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasTextLangField() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 64) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegacy(b bVar) {
        Objects.requireNonNull(bVar);
        ensureLegacyIsMutable();
        this.legacy_.add(bVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
