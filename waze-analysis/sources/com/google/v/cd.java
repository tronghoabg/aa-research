package com.google.v;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd extends dq<cd, cb> implements fj {
    public static final int CC_API_VERSION_FIELD_NUMBER = 2;
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CC_UTF8_VERIFICATION_FIELD_NUMBER = 24;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final cd DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int FEATURES_FIELD_NUMBER = 50;
    public static final int GO_API_FLAG_FIELD_NUMBER = 46;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVASCRIPT_PACKAGE_FIELD_NUMBER = 12;
    public static final int JAVA_ALT_API_PACKAGE_FIELD_NUMBER = 19;
    public static final int JAVA_API_VERSION_FIELD_NUMBER = 5;
    public static final int JAVA_ENABLE_DUAL_GENERATE_MUTABLE_API_FIELD_NUMBER = 26;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_JAVA5_ENUMS_FIELD_NUMBER = 7;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_MULTIPLE_FILES_MUTABLE_PACKAGE_FIELD_NUMBER = 29;
    public static final int JAVA_MUTABLE_API_FIELD_NUMBER = 28;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_OUTER_CLASSNAME_PROTO1_FIELD_NUMBER = 51;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int JAVA_USE_JAVAPROTO2_FIELD_NUMBER = 6;
    public static final int JSPB_USE_CORRECT_PROTO2_SEMANTICS_FIELD_NUMBER = 48;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile fo<cd> PARSER = null;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int PY_LEGACY_STUBBY_SYMBOLS_FIELD_NUMBER = 52;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int SZL_API_VERSION_FIELD_NUMBER = 14;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int USE_JAVA_STUBBY_LIBRARY_FIELD_NUMBER = 47;
    private int bitField0_;
    private int bitField1_;
    private boolean ccGenericServices_;
    private boolean deprecated_;
    private bj features_;
    private boolean javaEnableDualGenerateMutableApi_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private boolean javaStringCheckUtf8_;
    private boolean pyGenericServices_;
    private byte memoizedIsInitialized = 2;
    private int ccApiVersion_ = 2;
    private boolean ccUtf8Verification_ = true;
    private String javaPackage_ = "";
    private int javaApiVersion_ = 2;
    private boolean javaUseJavaproto2_ = true;
    private boolean javaJava5Enums_ = true;
    private String javaAltApiPackage_ = "";
    private String javaOuterClassname_ = "";
    private String javaOuterClassnameProto1_ = "";
    private boolean javaMutableApi_ = true;
    private String javaMultipleFilesMutablePackage_ = "";
    private int optimizeFor_ = 1;
    private String goPackage_ = "";
    private String goApiFlag_ = "";
    private String javascriptPackage_ = "";
    private int szlApiVersion_ = 2;
    private boolean ccEnableArenas_ = true;
    private String objcClassPrefix_ = "";
    private String csharpNamespace_ = "";
    private String swiftPrefix_ = "";
    private String phpClassPrefix_ = "";
    private String phpNamespace_ = "";
    private String phpMetadataNamespace_ = "";
    private String rubyPackage_ = "";
    private boolean useJavaStubbyLibrary_ = true;
    private boolean jspbUseCorrectProto2Semantics_ = true;
    private boolean pyLegacyStubbySymbols_ = true;
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        cd cdVar = new cd();
        DEFAULT_INSTANCE = cdVar;
        du.registerDefaultInstance(cd.class, cdVar);
    }

    private cd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends cx> iterable) {
        ensureUninterpretedOptionIsMutable();
        c.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcApiVersion() {
        this.bitField0_ &= -2;
        this.ccApiVersion_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcEnableArenas() {
        this.bitField0_ &= -8388609;
        this.ccEnableArenas_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcGenericServices() {
        this.bitField0_ &= -524289;
        this.ccGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcUtf8Verification() {
        this.bitField0_ &= -3;
        this.ccUtf8Verification_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCsharpNamespace() {
        this.bitField0_ &= -33554433;
        this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -4194305;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField1_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoApiFlag() {
        this.bitField0_ &= -65537;
        this.goApiFlag_ = getDefaultInstance().getGoApiFlag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoPackage() {
        this.bitField0_ &= -32769;
        this.goPackage_ = getDefaultInstance().getGoPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaAltApiPackage() {
        this.bitField0_ &= -65;
        this.javaAltApiPackage_ = getDefaultInstance().getJavaAltApiPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaApiVersion() {
        this.bitField0_ &= -9;
        this.javaApiVersion_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaEnableDualGenerateMutableApi() {
        this.bitField0_ &= -129;
        this.javaEnableDualGenerateMutableApi_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenericServices() {
        this.bitField0_ &= -1048577;
        this.javaGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaJava5Enums() {
        this.bitField0_ &= -33;
        this.javaJava5Enums_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaMultipleFiles() {
        this.bitField0_ &= -1025;
        this.javaMultipleFiles_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaMultipleFilesMutablePackage() {
        this.bitField0_ &= -8193;
        this.javaMultipleFilesMutablePackage_ = getDefaultInstance().getJavaMultipleFilesMutablePackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaMutableApi() {
        this.bitField0_ &= -4097;
        this.javaMutableApi_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaOuterClassname() {
        this.bitField0_ &= -257;
        this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaOuterClassnameProto1() {
        this.bitField0_ &= -513;
        this.javaOuterClassnameProto1_ = getDefaultInstance().getJavaOuterClassnameProto1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaPackage() {
        this.bitField0_ &= -5;
        this.javaPackage_ = getDefaultInstance().getJavaPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaStringCheckUtf8() {
        this.bitField0_ &= -2049;
        this.javaStringCheckUtf8_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaUseJavaproto2() {
        this.bitField0_ &= -17;
        this.javaUseJavaproto2_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavascriptPackage() {
        this.bitField0_ &= -131073;
        this.javascriptPackage_ = getDefaultInstance().getJavascriptPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJspbUseCorrectProto2Semantics() {
        this.bitField1_ &= -2;
        this.jspbUseCorrectProto2Semantics_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjcClassPrefix() {
        this.bitField0_ &= -16777217;
        this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptimizeFor() {
        this.bitField0_ &= -16385;
        this.optimizeFor_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpClassPrefix() {
        this.bitField0_ &= -134217729;
        this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpMetadataNamespace() {
        this.bitField0_ &= -536870913;
        this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpNamespace() {
        this.bitField0_ &= -268435457;
        this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPyGenericServices() {
        this.bitField0_ &= -2097153;
        this.pyGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPyLegacyStubbySymbols() {
        this.bitField1_ &= -3;
        this.pyLegacyStubbySymbols_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRubyPackage() {
        this.bitField0_ &= -1073741825;
        this.rubyPackage_ = getDefaultInstance().getRubyPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwiftPrefix() {
        this.bitField0_ &= -67108865;
        this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSzlApiVersion() {
        this.bitField0_ &= -262145;
        this.szlApiVersion_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseJavaStubbyLibrary() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.useJavaStubbyLibrary_ = true;
    }

    private void ensureUninterpretedOptionIsMutable() {
        eo<cx> eoVar = this.uninterpretedOption_;
        if (eoVar.c()) {
            return;
        }
        this.uninterpretedOption_ = du.mutableCopy(eoVar);
    }

    public static cd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.features_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            az azVarNewBuilder = bj.newBuilder(bjVar2);
            azVarNewBuilder.mergeFrom((az) bjVar);
            bjVar = azVarNewBuilder.buildPartial();
        }
        this.features_ = bjVar;
        this.bitField1_ |= 4;
    }

    public static cb newBuilder() {
        return (cb) DEFAULT_INSTANCE.createBuilder();
    }

    public static cd parseDelimitedFrom(InputStream inputStream) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(v vVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcApiVersion(int i2) {
        this.bitField0_ |= 1;
        this.ccApiVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcEnableArenas(boolean z) {
        this.bitField0_ |= 8388608;
        this.ccEnableArenas_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcGenericServices(boolean z) {
        this.bitField0_ |= 524288;
        this.ccGenericServices_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcUtf8Verification(boolean z) {
        this.bitField0_ |= 2;
        this.ccUtf8Verification_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespace(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.csharpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespaceBytes(v vVar) {
        this.csharpNamespace_ = vVar.u();
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z) {
        this.bitField0_ |= 4194304;
        this.deprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField1_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoApiFlag(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.goApiFlag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoApiFlagBytes(v vVar) {
        this.goApiFlag_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.goPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackageBytes(v vVar) {
        this.goPackage_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaAltApiPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.javaAltApiPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaAltApiPackageBytes(v vVar) {
        this.javaAltApiPackage_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaApiVersion(int i2) {
        this.bitField0_ |= 8;
        this.javaApiVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaEnableDualGenerateMutableApi(boolean z) {
        this.bitField0_ |= 128;
        this.javaEnableDualGenerateMutableApi_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenericServices(boolean z) {
        this.bitField0_ |= 1048576;
        this.javaGenericServices_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaJava5Enums(boolean z) {
        this.bitField0_ |= 32;
        this.javaJava5Enums_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMultipleFiles(boolean z) {
        this.bitField0_ |= 1024;
        this.javaMultipleFiles_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMultipleFilesMutablePackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.javaMultipleFilesMutablePackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMultipleFilesMutablePackageBytes(v vVar) {
        this.javaMultipleFilesMutablePackage_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMutableApi(boolean z) {
        this.bitField0_ |= 4096;
        this.javaMutableApi_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassname(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.javaOuterClassname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassnameBytes(v vVar) {
        this.javaOuterClassname_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassnameProto1(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.javaOuterClassnameProto1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassnameProto1Bytes(v vVar) {
        this.javaOuterClassnameProto1_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.javaPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackageBytes(v vVar) {
        this.javaPackage_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaStringCheckUtf8(boolean z) {
        this.bitField0_ |= 2048;
        this.javaStringCheckUtf8_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaUseJavaproto2(boolean z) {
        this.bitField0_ |= 16;
        this.javaUseJavaproto2_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavascriptPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.javascriptPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavascriptPackageBytes(v vVar) {
        this.javascriptPackage_ = vVar.u();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJspbUseCorrectProto2Semantics(boolean z) {
        this.bitField1_ |= 1;
        this.jspbUseCorrectProto2Semantics_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16777216;
        this.objcClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefixBytes(v vVar) {
        this.objcClassPrefix_ = vVar.u();
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptimizeFor(cc ccVar) {
        this.optimizeFor_ = ccVar.getNumber();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 134217728;
        this.phpClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefixBytes(v vVar) {
        this.phpClassPrefix_ = vVar.u();
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespace(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 536870912;
        this.phpMetadataNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespaceBytes(v vVar) {
        this.phpMetadataNamespace_ = vVar.u();
        this.bitField0_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespace(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 268435456;
        this.phpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespaceBytes(v vVar) {
        this.phpNamespace_ = vVar.u();
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPyGenericServices(boolean z) {
        this.bitField0_ |= 2097152;
        this.pyGenericServices_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPyLegacyStubbySymbols(boolean z) {
        this.bitField1_ |= 2;
        this.pyLegacyStubbySymbols_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1073741824;
        this.rubyPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackageBytes(v vVar) {
        this.rubyPackage_ = vVar.u();
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 67108864;
        this.swiftPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefixBytes(v vVar) {
        this.swiftPrefix_ = vVar.u();
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSzlApiVersion(int i2) {
        this.bitField0_ |= 262144;
        this.szlApiVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseJavaStubbyLibrary(boolean z) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.useJavaStubbyLibrary_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001$\u0000\u0002\u0001ϧ$\u0000\u0001\u0002\u0001ဈ\u0002\u0002င\u0000\u0005င\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဈ\b\t᠌\u000e\nဇ\n\u000bဈ\u000f\fဈ\u0011\u000eင\u0012\u0010ဇ\u0013\u0011ဇ\u0014\u0012ဇ\u0015\u0013ဈ\u0006\u0017ဇ\u0016\u0018ဇ\u0001\u001aဇ\u0007\u001bဇ\u000b\u001cဇ\f\u001dဈ\r\u001fဇ\u0017$ဈ\u0018%ဈ\u0019'ဈ\u001a(ဈ\u001b)ဈ\u001c,ဈ\u001d-ဈ\u001e.ဈ\u0010/ဇ\u001f0ဇ 2ᐉ\"3ဈ\t4ဇ!ϧЛ", new Object[]{"bitField0_", "bitField1_", "javaPackage_", "ccApiVersion_", "javaApiVersion_", "javaUseJavaproto2_", "javaJava5Enums_", "javaOuterClassname_", "optimizeFor_", ai.r, "javaMultipleFiles_", "goPackage_", "javascriptPackage_", "szlApiVersion_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaAltApiPackage_", "deprecated_", "ccUtf8Verification_", "javaEnableDualGenerateMutableApi_", "javaStringCheckUtf8_", "javaMutableApi_", "javaMultipleFilesMutablePackage_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "goApiFlag_", "useJavaStubbyLibrary_", "jspbUseCorrectProto2Semantics_", "features_", "javaOuterClassnameProto1_", "pyLegacyStubbySymbols_", "uninterpretedOption_", cx.class});
            case 3:
                return new cd();
            case 4:
                return new cb(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<cd> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cd.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public int getCcApiVersion() {
        return this.ccApiVersion_;
    }

    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    public boolean getCcUtf8Verification() {
        return this.ccUtf8Verification_;
    }

    public String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    public v getCsharpNamespaceBytes() {
        return v.s(this.csharpNamespace_);
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public String getGoApiFlag() {
        return this.goApiFlag_;
    }

    public v getGoApiFlagBytes() {
        return v.s(this.goApiFlag_);
    }

    public String getGoPackage() {
        return this.goPackage_;
    }

    public v getGoPackageBytes() {
        return v.s(this.goPackage_);
    }

    public String getJavaAltApiPackage() {
        return this.javaAltApiPackage_;
    }

    public v getJavaAltApiPackageBytes() {
        return v.s(this.javaAltApiPackage_);
    }

    @Deprecated
    public int getJavaApiVersion() {
        return this.javaApiVersion_;
    }

    public boolean getJavaEnableDualGenerateMutableApi() {
        return this.javaEnableDualGenerateMutableApi_;
    }

    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    @Deprecated
    public boolean getJavaJava5Enums() {
        return this.javaJava5Enums_;
    }

    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    public String getJavaMultipleFilesMutablePackage() {
        return this.javaMultipleFilesMutablePackage_;
    }

    public v getJavaMultipleFilesMutablePackageBytes() {
        return v.s(this.javaMultipleFilesMutablePackage_);
    }

    @Deprecated
    public boolean getJavaMutableApi() {
        return this.javaMutableApi_;
    }

    public String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    public v getJavaOuterClassnameBytes() {
        return v.s(this.javaOuterClassname_);
    }

    public String getJavaOuterClassnameProto1() {
        return this.javaOuterClassnameProto1_;
    }

    public v getJavaOuterClassnameProto1Bytes() {
        return v.s(this.javaOuterClassnameProto1_);
    }

    public String getJavaPackage() {
        return this.javaPackage_;
    }

    public v getJavaPackageBytes() {
        return v.s(this.javaPackage_);
    }

    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Deprecated
    public boolean getJavaUseJavaproto2() {
        return this.javaUseJavaproto2_;
    }

    public String getJavascriptPackage() {
        return this.javascriptPackage_;
    }

    public v getJavascriptPackageBytes() {
        return v.s(this.javascriptPackage_);
    }

    public boolean getJspbUseCorrectProto2Semantics() {
        return this.jspbUseCorrectProto2Semantics_;
    }

    public String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    public v getObjcClassPrefixBytes() {
        return v.s(this.objcClassPrefix_);
    }

    public cc getOptimizeFor() {
        cc ccVarA = cc.a(this.optimizeFor_);
        return ccVarA == null ? cc.SPEED : ccVarA;
    }

    public String getPhpClassPrefix() {
        return this.phpClassPrefix_;
    }

    public v getPhpClassPrefixBytes() {
        return v.s(this.phpClassPrefix_);
    }

    public String getPhpMetadataNamespace() {
        return this.phpMetadataNamespace_;
    }

    public v getPhpMetadataNamespaceBytes() {
        return v.s(this.phpMetadataNamespace_);
    }

    public String getPhpNamespace() {
        return this.phpNamespace_;
    }

    public v getPhpNamespaceBytes() {
        return v.s(this.phpNamespace_);
    }

    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    public boolean getPyLegacyStubbySymbols() {
        return this.pyLegacyStubbySymbols_;
    }

    public String getRubyPackage() {
        return this.rubyPackage_;
    }

    public v getRubyPackageBytes() {
        return v.s(this.rubyPackage_);
    }

    public String getSwiftPrefix() {
        return this.swiftPrefix_;
    }

    public v getSwiftPrefixBytes() {
        return v.s(this.swiftPrefix_);
    }

    public int getSzlApiVersion() {
        return this.szlApiVersion_;
    }

    public cx getUninterpretedOption(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List<cx> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public cy getUninterpretedOptionOrBuilder(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public List<? extends cy> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean getUseJavaStubbyLibrary() {
        return this.useJavaStubbyLibrary_;
    }

    public boolean hasCcApiVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCcEnableArenas() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasCcGenericServices() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasCcUtf8Verification() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCsharpNamespace() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasFeatures() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasGoApiFlag() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasGoPackage() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasJavaAltApiPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Deprecated
    public boolean hasJavaApiVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasJavaEnableDualGenerateMutableApi() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasJavaGenericServices() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Deprecated
    public boolean hasJavaJava5Enums() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasJavaMultipleFilesMutablePackage() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Deprecated
    public boolean hasJavaMutableApi() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasJavaOuterClassnameProto1() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasJavaPackage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Deprecated
    public boolean hasJavaUseJavaproto2() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasJavascriptPackage() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasJspbUseCorrectProto2Semantics() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasOptimizeFor() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasPhpClassPrefix() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasPhpMetadataNamespace() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasPhpNamespace() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasPyGenericServices() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasPyLegacyStubbySymbols() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasRubyPackage() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasSwiftPrefix() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasSzlApiVersion() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasUseJavaStubbyLibrary() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public static cb newBuilder(cd cdVar) {
        return (cb) DEFAULT_INSTANCE.createBuilder(cdVar);
    }

    public static cd parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(v vVar, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cd parseFrom(z zVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cd parseFrom(z zVar, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static cd parseFrom(InputStream inputStream) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(InputStream inputStream, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(ByteBuffer byteBuffer) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cd parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cd parseFrom(byte[] bArr) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cd parseFrom(byte[] bArr, de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
