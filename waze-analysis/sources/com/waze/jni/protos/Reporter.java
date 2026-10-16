package com.waze.jni.protos;

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
public final class Reporter extends du<Reporter, Builder> implements ReporterOrBuilder {
    private static final Reporter DEFAULT_INSTANCE;
    public static final int MOOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<Reporter> PARSER;
    private int bitField0_;
    private String name_ = "";
    private String mood_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.Reporter$1, reason: invalid class name */
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
    public final class Builder extends dm<Reporter, Builder> implements ReporterOrBuilder {
        private Builder() {
            super(Reporter.DEFAULT_INSTANCE);
        }

        public Builder clearMood() {
            copyOnWrite();
            ((Reporter) this.instance).clearMood();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Reporter) this.instance).clearName();
            return this;
        }

        @Override // com.waze.jni.protos.ReporterOrBuilder
        public String getMood() {
            return ((Reporter) this.instance).getMood();
        }

        @Override // com.waze.jni.protos.ReporterOrBuilder
        public v getMoodBytes() {
            return ((Reporter) this.instance).getMoodBytes();
        }

        @Override // com.waze.jni.protos.ReporterOrBuilder
        public String getName() {
            return ((Reporter) this.instance).getName();
        }

        @Override // com.waze.jni.protos.ReporterOrBuilder
        public v getNameBytes() {
            return ((Reporter) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.ReporterOrBuilder
        public boolean hasMood() {
            return ((Reporter) this.instance).hasMood();
        }

        @Override // com.waze.jni.protos.ReporterOrBuilder
        public boolean hasName() {
            return ((Reporter) this.instance).hasName();
        }

        public Builder setMood(String str) {
            copyOnWrite();
            ((Reporter) this.instance).setMood(str);
            return this;
        }

        public Builder setMoodBytes(v vVar) {
            copyOnWrite();
            ((Reporter) this.instance).setMoodBytes(vVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Reporter) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((Reporter) this.instance).setNameBytes(vVar);
            return this;
        }
    }

    static {
        Reporter reporter = new Reporter();
        DEFAULT_INSTANCE = reporter;
        du.registerDefaultInstance(Reporter.class, reporter);
    }

    private Reporter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMood() {
        this.bitField0_ &= -3;
        this.mood_ = getDefaultInstance().getMood();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static Reporter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Reporter parseDelimitedFrom(InputStream inputStream) {
        return (Reporter) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reporter parseFrom(v vVar) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Reporter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMood(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.mood_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.mood_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "name_", "mood_"});
        }
        if (iOrdinal == 3) {
            return new Reporter();
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
        fo<Reporter> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Reporter.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.ReporterOrBuilder
    public String getMood() {
        return this.mood_;
    }

    @Override // com.waze.jni.protos.ReporterOrBuilder
    public v getMoodBytes() {
        return v.s(this.mood_);
    }

    @Override // com.waze.jni.protos.ReporterOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.ReporterOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.ReporterOrBuilder
    public boolean hasMood() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.ReporterOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Reporter reporter) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(reporter);
    }

    public static Reporter parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Reporter) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Reporter parseFrom(v vVar, de deVar) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Reporter parseFrom(z zVar) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Reporter parseFrom(z zVar, de deVar) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Reporter parseFrom(InputStream inputStream) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reporter parseFrom(InputStream inputStream, de deVar) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Reporter parseFrom(ByteBuffer byteBuffer) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Reporter parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Reporter parseFrom(byte[] bArr) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Reporter parseFrom(byte[] bArr, de deVar) {
        return (Reporter) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
