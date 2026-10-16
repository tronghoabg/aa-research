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
public final class LoadAutoCompleteVenueRequest extends du<LoadAutoCompleteVenueRequest, Builder> implements LoadAutoCompleteVenueRequestOrBuilder {
    public static final int AUTOCOMPLETE_QUERY_FIELD_NUMBER = 3;
    public static final int AUTOCOMPLETE_RESPONSE_FIELD_NUMBER = 4;
    private static final LoadAutoCompleteVenueRequest DEFAULT_INSTANCE;
    private static volatile fo<LoadAutoCompleteVenueRequest> PARSER = null;
    public static final int VENUE_CONTEXT_FIELD_NUMBER = 2;
    public static final int VENUE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String venueId_ = "";
    private String venueContext_ = "";
    private String autocompleteQuery_ = "";
    private String autocompleteResponse_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.LoadAutoCompleteVenueRequest$1, reason: invalid class name */
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
    public final class Builder extends dm<LoadAutoCompleteVenueRequest, Builder> implements LoadAutoCompleteVenueRequestOrBuilder {
        private Builder() {
            super(LoadAutoCompleteVenueRequest.DEFAULT_INSTANCE);
        }

        public Builder clearAutocompleteQuery() {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).clearAutocompleteQuery();
            return this;
        }

        public Builder clearAutocompleteResponse() {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).clearAutocompleteResponse();
            return this;
        }

        public Builder clearVenueContext() {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).clearVenueContext();
            return this;
        }

        public Builder clearVenueId() {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).clearVenueId();
            return this;
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public String getAutocompleteQuery() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getAutocompleteQuery();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public v getAutocompleteQueryBytes() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getAutocompleteQueryBytes();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public String getAutocompleteResponse() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getAutocompleteResponse();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public v getAutocompleteResponseBytes() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getAutocompleteResponseBytes();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public String getVenueContext() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getVenueContext();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public v getVenueContextBytes() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getVenueContextBytes();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public String getVenueId() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getVenueId();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public v getVenueIdBytes() {
            return ((LoadAutoCompleteVenueRequest) this.instance).getVenueIdBytes();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public boolean hasAutocompleteQuery() {
            return ((LoadAutoCompleteVenueRequest) this.instance).hasAutocompleteQuery();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public boolean hasAutocompleteResponse() {
            return ((LoadAutoCompleteVenueRequest) this.instance).hasAutocompleteResponse();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public boolean hasVenueContext() {
            return ((LoadAutoCompleteVenueRequest) this.instance).hasVenueContext();
        }

        @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
        public boolean hasVenueId() {
            return ((LoadAutoCompleteVenueRequest) this.instance).hasVenueId();
        }

        public Builder setAutocompleteQuery(String str) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setAutocompleteQuery(str);
            return this;
        }

        public Builder setAutocompleteQueryBytes(v vVar) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setAutocompleteQueryBytes(vVar);
            return this;
        }

        public Builder setAutocompleteResponse(String str) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setAutocompleteResponse(str);
            return this;
        }

        public Builder setAutocompleteResponseBytes(v vVar) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setAutocompleteResponseBytes(vVar);
            return this;
        }

        public Builder setVenueContext(String str) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setVenueContext(str);
            return this;
        }

        public Builder setVenueContextBytes(v vVar) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setVenueContextBytes(vVar);
            return this;
        }

        public Builder setVenueId(String str) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setVenueId(str);
            return this;
        }

        public Builder setVenueIdBytes(v vVar) {
            copyOnWrite();
            ((LoadAutoCompleteVenueRequest) this.instance).setVenueIdBytes(vVar);
            return this;
        }
    }

    static {
        LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequest = new LoadAutoCompleteVenueRequest();
        DEFAULT_INSTANCE = loadAutoCompleteVenueRequest;
        du.registerDefaultInstance(LoadAutoCompleteVenueRequest.class, loadAutoCompleteVenueRequest);
    }

    private LoadAutoCompleteVenueRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutocompleteQuery() {
        this.bitField0_ &= -5;
        this.autocompleteQuery_ = getDefaultInstance().getAutocompleteQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutocompleteResponse() {
        this.bitField0_ &= -9;
        this.autocompleteResponse_ = getDefaultInstance().getAutocompleteResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueContext() {
        this.bitField0_ &= -3;
        this.venueContext_ = getDefaultInstance().getVenueContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -2;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static LoadAutoCompleteVenueRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LoadAutoCompleteVenueRequest parseDelimitedFrom(InputStream inputStream) {
        return (LoadAutoCompleteVenueRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(v vVar) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<LoadAutoCompleteVenueRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteQuery(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.autocompleteQuery_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteQueryBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.autocompleteQuery_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteResponse(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.autocompleteResponse_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteResponseBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.autocompleteResponse_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.venueContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueContext_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "venueId_", "venueContext_", "autocompleteQuery_", "autocompleteResponse_"});
        }
        if (iOrdinal == 3) {
            return new LoadAutoCompleteVenueRequest();
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
        fo<LoadAutoCompleteVenueRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (LoadAutoCompleteVenueRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public String getAutocompleteQuery() {
        return this.autocompleteQuery_;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public v getAutocompleteQueryBytes() {
        return v.s(this.autocompleteQuery_);
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public String getAutocompleteResponse() {
        return this.autocompleteResponse_;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public v getAutocompleteResponseBytes() {
        return v.s(this.autocompleteResponse_);
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public String getVenueContext() {
        return this.venueContext_;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public v getVenueContextBytes() {
        return v.s(this.venueContext_);
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public String getVenueId() {
        return this.venueId_;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public v getVenueIdBytes() {
        return v.s(this.venueId_);
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public boolean hasAutocompleteQuery() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public boolean hasAutocompleteResponse() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public boolean hasVenueContext() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.LoadAutoCompleteVenueRequestOrBuilder
    public boolean hasVenueId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(loadAutoCompleteVenueRequest);
    }

    public static LoadAutoCompleteVenueRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (LoadAutoCompleteVenueRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(v vVar, de deVar) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(z zVar) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(z zVar, de deVar) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(InputStream inputStream) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(InputStream inputStream, de deVar) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(ByteBuffer byteBuffer) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(byte[] bArr) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LoadAutoCompleteVenueRequest parseFrom(byte[] bArr, de deVar) {
        return (LoadAutoCompleteVenueRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
