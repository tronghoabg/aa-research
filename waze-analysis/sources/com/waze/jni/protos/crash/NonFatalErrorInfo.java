package com.waze.jni.protos.crash;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NonFatalErrorInfo extends du<NonFatalErrorInfo, Builder> implements NonFatalErrorInfoOrBuilder {
    public static final int ARGUMENTS_FORMATTED_FIELD_NUMBER = 4;
    private static final NonFatalErrorInfo DEFAULT_INSTANCE;
    public static final int FUNCTION_NAME_FIELD_NUMBER = 3;
    public static final int LINE_FIELD_NUMBER = 2;
    private static volatile fo<NonFatalErrorInfo> PARSER = null;
    public static final int SOURCE_FILE_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int line_;
    private String sourceFileName_ = "";
    private String functionName_ = "";
    private String argumentsFormatted_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.crash.NonFatalErrorInfo$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NonFatalErrorInfo, Builder> implements NonFatalErrorInfoOrBuilder {
        private Builder() {
            super(NonFatalErrorInfo.DEFAULT_INSTANCE);
        }

        public Builder clearArgumentsFormatted() {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).clearArgumentsFormatted();
            return this;
        }

        public Builder clearFunctionName() {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).clearFunctionName();
            return this;
        }

        public Builder clearLine() {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).clearLine();
            return this;
        }

        public Builder clearSourceFileName() {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).clearSourceFileName();
            return this;
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public String getArgumentsFormatted() {
            return ((NonFatalErrorInfo) this.instance).getArgumentsFormatted();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public v getArgumentsFormattedBytes() {
            return ((NonFatalErrorInfo) this.instance).getArgumentsFormattedBytes();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public String getFunctionName() {
            return ((NonFatalErrorInfo) this.instance).getFunctionName();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public v getFunctionNameBytes() {
            return ((NonFatalErrorInfo) this.instance).getFunctionNameBytes();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public int getLine() {
            return ((NonFatalErrorInfo) this.instance).getLine();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public String getSourceFileName() {
            return ((NonFatalErrorInfo) this.instance).getSourceFileName();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public v getSourceFileNameBytes() {
            return ((NonFatalErrorInfo) this.instance).getSourceFileNameBytes();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public boolean hasArgumentsFormatted() {
            return ((NonFatalErrorInfo) this.instance).hasArgumentsFormatted();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public boolean hasFunctionName() {
            return ((NonFatalErrorInfo) this.instance).hasFunctionName();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public boolean hasLine() {
            return ((NonFatalErrorInfo) this.instance).hasLine();
        }

        @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
        public boolean hasSourceFileName() {
            return ((NonFatalErrorInfo) this.instance).hasSourceFileName();
        }

        public Builder setArgumentsFormatted(String str) {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).setArgumentsFormatted(str);
            return this;
        }

        public Builder setArgumentsFormattedBytes(v vVar) {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).setArgumentsFormattedBytes(vVar);
            return this;
        }

        public Builder setFunctionName(String str) {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).setFunctionName(str);
            return this;
        }

        public Builder setFunctionNameBytes(v vVar) {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).setFunctionNameBytes(vVar);
            return this;
        }

        public Builder setLine(int i2) {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).setLine(i2);
            return this;
        }

        public Builder setSourceFileName(String str) {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).setSourceFileName(str);
            return this;
        }

        public Builder setSourceFileNameBytes(v vVar) {
            copyOnWrite();
            ((NonFatalErrorInfo) this.instance).setSourceFileNameBytes(vVar);
            return this;
        }
    }

    static {
        NonFatalErrorInfo nonFatalErrorInfo = new NonFatalErrorInfo();
        DEFAULT_INSTANCE = nonFatalErrorInfo;
        du.registerDefaultInstance(NonFatalErrorInfo.class, nonFatalErrorInfo);
    }

    private NonFatalErrorInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArgumentsFormatted() {
        this.bitField0_ &= -9;
        this.argumentsFormatted_ = getDefaultInstance().getArgumentsFormatted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionName() {
        this.bitField0_ &= -5;
        this.functionName_ = getDefaultInstance().getFunctionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLine() {
        this.bitField0_ &= -3;
        this.line_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceFileName() {
        this.bitField0_ &= -2;
        this.sourceFileName_ = getDefaultInstance().getSourceFileName();
    }

    public static NonFatalErrorInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NonFatalErrorInfo parseDelimitedFrom(InputStream inputStream) {
        return (NonFatalErrorInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NonFatalErrorInfo parseFrom(v vVar) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NonFatalErrorInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgumentsFormatted(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.argumentsFormatted_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArgumentsFormattedBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.argumentsFormatted_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.functionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.functionName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLine(int i2) {
        this.bitField0_ |= 2;
        this.line_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceFileName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.sourceFileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceFileNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.sourceFileName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "sourceFileName_", "line_", "functionName_", "argumentsFormatted_"});
        }
        if (iOrdinal == 3) {
            return new NonFatalErrorInfo();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<NonFatalErrorInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NonFatalErrorInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public String getArgumentsFormatted() {
        return this.argumentsFormatted_;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public v getArgumentsFormattedBytes() {
        return v.s(this.argumentsFormatted_);
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public String getFunctionName() {
        return this.functionName_;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public v getFunctionNameBytes() {
        return v.s(this.functionName_);
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public int getLine() {
        return this.line_;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public String getSourceFileName() {
        return this.sourceFileName_;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public v getSourceFileNameBytes() {
        return v.s(this.sourceFileName_);
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public boolean hasArgumentsFormatted() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public boolean hasFunctionName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public boolean hasLine() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.crash.NonFatalErrorInfoOrBuilder
    public boolean hasSourceFileName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NonFatalErrorInfo nonFatalErrorInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nonFatalErrorInfo);
    }

    public static NonFatalErrorInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NonFatalErrorInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NonFatalErrorInfo parseFrom(v vVar, de deVar) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NonFatalErrorInfo parseFrom(z zVar) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NonFatalErrorInfo parseFrom(z zVar, de deVar) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NonFatalErrorInfo parseFrom(InputStream inputStream) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NonFatalErrorInfo parseFrom(InputStream inputStream, de deVar) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NonFatalErrorInfo parseFrom(ByteBuffer byteBuffer) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NonFatalErrorInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NonFatalErrorInfo parseFrom(byte[] bArr) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NonFatalErrorInfo parseFrom(byte[] bArr, de deVar) {
        return (NonFatalErrorInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
