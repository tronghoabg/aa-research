package com.waze.jni.protos.favorites;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class IsHomeWorkSetResult extends du<IsHomeWorkSetResult, Builder> implements IsHomeWorkSetResultOrBuilder {
    private static final IsHomeWorkSetResult DEFAULT_INSTANCE;
    public static final int IS_HOME_SET_FIELD_NUMBER = 1;
    public static final int IS_WORK_SET_FIELD_NUMBER = 2;
    private static volatile fo<IsHomeWorkSetResult> PARSER;
    private boolean isHomeSet_;
    private boolean isWorkSet_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.favorites.IsHomeWorkSetResult$1, reason: invalid class name */
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
    public final class Builder extends dm<IsHomeWorkSetResult, Builder> implements IsHomeWorkSetResultOrBuilder {
        private Builder() {
            super(IsHomeWorkSetResult.DEFAULT_INSTANCE);
        }

        public Builder clearIsHomeSet() {
            copyOnWrite();
            ((IsHomeWorkSetResult) this.instance).clearIsHomeSet();
            return this;
        }

        public Builder clearIsWorkSet() {
            copyOnWrite();
            ((IsHomeWorkSetResult) this.instance).clearIsWorkSet();
            return this;
        }

        @Override // com.waze.jni.protos.favorites.IsHomeWorkSetResultOrBuilder
        public boolean getIsHomeSet() {
            return ((IsHomeWorkSetResult) this.instance).getIsHomeSet();
        }

        @Override // com.waze.jni.protos.favorites.IsHomeWorkSetResultOrBuilder
        public boolean getIsWorkSet() {
            return ((IsHomeWorkSetResult) this.instance).getIsWorkSet();
        }

        public Builder setIsHomeSet(boolean z) {
            copyOnWrite();
            ((IsHomeWorkSetResult) this.instance).setIsHomeSet(z);
            return this;
        }

        public Builder setIsWorkSet(boolean z) {
            copyOnWrite();
            ((IsHomeWorkSetResult) this.instance).setIsWorkSet(z);
            return this;
        }
    }

    static {
        IsHomeWorkSetResult isHomeWorkSetResult = new IsHomeWorkSetResult();
        DEFAULT_INSTANCE = isHomeWorkSetResult;
        du.registerDefaultInstance(IsHomeWorkSetResult.class, isHomeWorkSetResult);
    }

    private IsHomeWorkSetResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHomeSet() {
        this.isHomeSet_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsWorkSet() {
        this.isWorkSet_ = false;
    }

    public static IsHomeWorkSetResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static IsHomeWorkSetResult parseDelimitedFrom(InputStream inputStream) {
        return (IsHomeWorkSetResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IsHomeWorkSetResult parseFrom(v vVar) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<IsHomeWorkSetResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHomeSet(boolean z) {
        this.isHomeSet_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsWorkSet(boolean z) {
        this.isWorkSet_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"isHomeSet_", "isWorkSet_"});
        }
        if (iOrdinal == 3) {
            return new IsHomeWorkSetResult();
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
        fo<IsHomeWorkSetResult> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (IsHomeWorkSetResult.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.favorites.IsHomeWorkSetResultOrBuilder
    public boolean getIsHomeSet() {
        return this.isHomeSet_;
    }

    @Override // com.waze.jni.protos.favorites.IsHomeWorkSetResultOrBuilder
    public boolean getIsWorkSet() {
        return this.isWorkSet_;
    }

    public static Builder newBuilder(IsHomeWorkSetResult isHomeWorkSetResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(isHomeWorkSetResult);
    }

    public static IsHomeWorkSetResult parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (IsHomeWorkSetResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static IsHomeWorkSetResult parseFrom(v vVar, de deVar) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static IsHomeWorkSetResult parseFrom(z zVar) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static IsHomeWorkSetResult parseFrom(z zVar, de deVar) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static IsHomeWorkSetResult parseFrom(InputStream inputStream) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IsHomeWorkSetResult parseFrom(InputStream inputStream, de deVar) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static IsHomeWorkSetResult parseFrom(ByteBuffer byteBuffer) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static IsHomeWorkSetResult parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static IsHomeWorkSetResult parseFrom(byte[] bArr) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IsHomeWorkSetResult parseFrom(byte[] bArr, de deVar) {
        return (IsHomeWorkSetResult) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
