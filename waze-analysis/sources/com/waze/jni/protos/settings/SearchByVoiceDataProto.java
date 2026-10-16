package com.waze.jni.protos.settings;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fe;
import com.google.v.ff;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.v;
import com.google.v.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SearchByVoiceDataProto extends du<SearchByVoiceDataProto, Builder> implements SearchByVoiceDataProtoOrBuilder {
    private static final SearchByVoiceDataProto DEFAULT_INSTANCE;
    private static volatile fo<SearchByVoiceDataProto> PARSER = null;
    public static final int SEARCH_VOICES_BY_KEY_FIELD_NUMBER = 1;
    private ff<String, String> searchVoicesByKey_ = ff.a();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.settings.SearchByVoiceDataProto$1, reason: invalid class name */
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
    public final class Builder extends dm<SearchByVoiceDataProto, Builder> implements SearchByVoiceDataProtoOrBuilder {
        private Builder() {
            super(SearchByVoiceDataProto.DEFAULT_INSTANCE);
        }

        public Builder clearSearchVoicesByKey() {
            copyOnWrite();
            ((SearchByVoiceDataProto) this.instance).getMutableSearchVoicesByKeyMap().clear();
            return this;
        }

        @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
        public boolean containsSearchVoicesByKey(String str) {
            Objects.requireNonNull(str);
            return ((SearchByVoiceDataProto) this.instance).getSearchVoicesByKeyMap().containsKey(str);
        }

        @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
        public int getSearchVoicesByKeyCount() {
            return ((SearchByVoiceDataProto) this.instance).getSearchVoicesByKeyMap().size();
        }

        @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
        public Map<String, String> getSearchVoicesByKeyMap() {
            return DesugarCollections.unmodifiableMap(((SearchByVoiceDataProto) this.instance).getSearchVoicesByKeyMap());
        }

        @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
        public String getSearchVoicesByKeyOrDefault(String str, String str2) {
            Objects.requireNonNull(str);
            Map<String, String> searchVoicesByKeyMap = ((SearchByVoiceDataProto) this.instance).getSearchVoicesByKeyMap();
            return searchVoicesByKeyMap.containsKey(str) ? searchVoicesByKeyMap.get(str) : str2;
        }

        @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
        public String getSearchVoicesByKeyOrThrow(String str) {
            Objects.requireNonNull(str);
            Map<String, String> searchVoicesByKeyMap = ((SearchByVoiceDataProto) this.instance).getSearchVoicesByKeyMap();
            if (searchVoicesByKeyMap.containsKey(str)) {
                return searchVoicesByKeyMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllSearchVoicesByKey(Map<String, String> map) {
            copyOnWrite();
            ((SearchByVoiceDataProto) this.instance).getMutableSearchVoicesByKeyMap().putAll(map);
            return this;
        }

        public Builder putSearchVoicesByKey(String str, String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            copyOnWrite();
            ((SearchByVoiceDataProto) this.instance).getMutableSearchVoicesByKeyMap().put(str, str2);
            return this;
        }

        public Builder removeSearchVoicesByKey(String str) {
            Objects.requireNonNull(str);
            copyOnWrite();
            ((SearchByVoiceDataProto) this.instance).getMutableSearchVoicesByKeyMap().remove(str);
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class SearchVoicesByKeyDefaultEntryHolder {
        static final fe<String, String> defaultEntry;

        static {
            gm gmVar = gm.STRING;
            defaultEntry = fe.d(gmVar, "", gmVar, "");
        }

        private SearchVoicesByKeyDefaultEntryHolder() {
        }
    }

    static {
        SearchByVoiceDataProto searchByVoiceDataProto = new SearchByVoiceDataProto();
        DEFAULT_INSTANCE = searchByVoiceDataProto;
        du.registerDefaultInstance(SearchByVoiceDataProto.class, searchByVoiceDataProto);
    }

    private SearchByVoiceDataProto() {
    }

    public static SearchByVoiceDataProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableSearchVoicesByKeyMap() {
        return internalGetMutableSearchVoicesByKey();
    }

    private ff<String, String> internalGetMutableSearchVoicesByKey() {
        if (!this.searchVoicesByKey_.e()) {
            this.searchVoicesByKey_ = this.searchVoicesByKey_.b();
        }
        return this.searchVoicesByKey_;
    }

    private ff<String, String> internalGetSearchVoicesByKey() {
        return this.searchVoicesByKey_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchByVoiceDataProto parseDelimitedFrom(InputStream inputStream) {
        return (SearchByVoiceDataProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchByVoiceDataProto parseFrom(v vVar) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SearchByVoiceDataProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
    public boolean containsSearchVoicesByKey(String str) {
        Objects.requireNonNull(str);
        return internalGetSearchVoicesByKey().containsKey(str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"searchVoicesByKey_", SearchVoicesByKeyDefaultEntryHolder.defaultEntry});
        }
        if (iOrdinal == 3) {
            return new SearchByVoiceDataProto();
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
        fo<SearchByVoiceDataProto> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SearchByVoiceDataProto.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
    public int getSearchVoicesByKeyCount() {
        return internalGetSearchVoicesByKey().size();
    }

    @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
    public Map<String, String> getSearchVoicesByKeyMap() {
        return DesugarCollections.unmodifiableMap(internalGetSearchVoicesByKey());
    }

    @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
    public String getSearchVoicesByKeyOrDefault(String str, String str2) {
        Objects.requireNonNull(str);
        String str3 = internalGetSearchVoicesByKey().get(str);
        return str3 != null ? str3 : str2;
    }

    @Override // com.waze.jni.protos.settings.SearchByVoiceDataProtoOrBuilder
    public String getSearchVoicesByKeyOrThrow(String str) {
        Objects.requireNonNull(str);
        String str2 = internalGetSearchVoicesByKey().get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(SearchByVoiceDataProto searchByVoiceDataProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(searchByVoiceDataProto);
    }

    public static SearchByVoiceDataProto parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SearchByVoiceDataProto) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SearchByVoiceDataProto parseFrom(v vVar, de deVar) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SearchByVoiceDataProto parseFrom(z zVar) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SearchByVoiceDataProto parseFrom(z zVar, de deVar) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static SearchByVoiceDataProto parseFrom(InputStream inputStream) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchByVoiceDataProto parseFrom(InputStream inputStream, de deVar) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SearchByVoiceDataProto parseFrom(ByteBuffer byteBuffer) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SearchByVoiceDataProto parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static SearchByVoiceDataProto parseFrom(byte[] bArr) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchByVoiceDataProto parseFrom(byte[] bArr, de deVar) {
        return (SearchByVoiceDataProto) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
