package com.waze.jni.protos.favorites;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.favorites.Favorite;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Favorites extends du<Favorites, Builder> implements FavoritesOrBuilder {
    private static final Favorites DEFAULT_INSTANCE;
    public static final int FAVORITES_FIELD_NUMBER = 1;
    private static volatile fo<Favorites> PARSER;
    private eo<Favorite> favorites_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.favorites.Favorites$1, reason: invalid class name */
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

    static {
        Favorites favorites = new Favorites();
        DEFAULT_INSTANCE = favorites;
        du.registerDefaultInstance(Favorites.class, favorites);
    }

    private Favorites() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFavorites(Iterable<? extends Favorite> iterable) {
        ensureFavoritesIsMutable();
        c.addAll(iterable, this.favorites_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavorites(int i2, Favorite favorite) {
        Objects.requireNonNull(favorite);
        ensureFavoritesIsMutable();
        this.favorites_.add(i2, favorite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavorites() {
        this.favorites_ = emptyProtobufList();
    }

    private void ensureFavoritesIsMutable() {
        eo<Favorite> eoVar = this.favorites_;
        if (eoVar.c()) {
            return;
        }
        this.favorites_ = du.mutableCopy(eoVar);
    }

    public static Favorites getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Favorites parseDelimitedFrom(InputStream inputStream) {
        return (Favorites) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Favorites parseFrom(v vVar) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Favorites> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFavorites(int i2) {
        ensureFavoritesIsMutable();
        this.favorites_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavorites(int i2, Favorite favorite) {
        Objects.requireNonNull(favorite);
        ensureFavoritesIsMutable();
        this.favorites_.set(i2, favorite);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"favorites_", Favorite.class});
        }
        if (iOrdinal == 3) {
            return new Favorites();
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
        fo<Favorites> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Favorites.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.favorites.FavoritesOrBuilder
    public Favorite getFavorites(int i2) {
        return this.favorites_.get(i2);
    }

    @Override // com.waze.jni.protos.favorites.FavoritesOrBuilder
    public int getFavoritesCount() {
        return this.favorites_.size();
    }

    @Override // com.waze.jni.protos.favorites.FavoritesOrBuilder
    public List<Favorite> getFavoritesList() {
        return this.favorites_;
    }

    public FavoriteOrBuilder getFavoritesOrBuilder(int i2) {
        return this.favorites_.get(i2);
    }

    public List<? extends FavoriteOrBuilder> getFavoritesOrBuilderList() {
        return this.favorites_;
    }

    public static Builder newBuilder(Favorites favorites) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(favorites);
    }

    public static Favorites parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Favorites) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Favorites parseFrom(v vVar, de deVar) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Favorites parseFrom(z zVar) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Favorites parseFrom(z zVar, de deVar) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavorites(Favorite favorite) {
        Objects.requireNonNull(favorite);
        ensureFavoritesIsMutable();
        this.favorites_.add(favorite);
    }

    public static Favorites parseFrom(InputStream inputStream) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Favorites parseFrom(InputStream inputStream, de deVar) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Favorites parseFrom(ByteBuffer byteBuffer) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Favorites parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Favorites, Builder> implements FavoritesOrBuilder {
        private Builder() {
            super(Favorites.DEFAULT_INSTANCE);
        }

        public Builder addAllFavorites(Iterable<? extends Favorite> iterable) {
            copyOnWrite();
            ((Favorites) this.instance).addAllFavorites(iterable);
            return this;
        }

        public Builder addFavorites(int i2, Favorite.Builder builder) {
            copyOnWrite();
            ((Favorites) this.instance).addFavorites(i2, builder.build());
            return this;
        }

        public Builder clearFavorites() {
            copyOnWrite();
            ((Favorites) this.instance).clearFavorites();
            return this;
        }

        @Override // com.waze.jni.protos.favorites.FavoritesOrBuilder
        public Favorite getFavorites(int i2) {
            return ((Favorites) this.instance).getFavorites(i2);
        }

        @Override // com.waze.jni.protos.favorites.FavoritesOrBuilder
        public int getFavoritesCount() {
            return ((Favorites) this.instance).getFavoritesCount();
        }

        @Override // com.waze.jni.protos.favorites.FavoritesOrBuilder
        public List<Favorite> getFavoritesList() {
            return DesugarCollections.unmodifiableList(((Favorites) this.instance).getFavoritesList());
        }

        public Builder removeFavorites(int i2) {
            copyOnWrite();
            ((Favorites) this.instance).removeFavorites(i2);
            return this;
        }

        public Builder setFavorites(int i2, Favorite.Builder builder) {
            copyOnWrite();
            ((Favorites) this.instance).setFavorites(i2, builder.build());
            return this;
        }

        public Builder addFavorites(int i2, Favorite favorite) {
            copyOnWrite();
            ((Favorites) this.instance).addFavorites(i2, favorite);
            return this;
        }

        public Builder setFavorites(int i2, Favorite favorite) {
            copyOnWrite();
            ((Favorites) this.instance).setFavorites(i2, favorite);
            return this;
        }

        public Builder addFavorites(Favorite.Builder builder) {
            copyOnWrite();
            ((Favorites) this.instance).addFavorites(builder.build());
            return this;
        }

        public Builder addFavorites(Favorite favorite) {
            copyOnWrite();
            ((Favorites) this.instance).addFavorites(favorite);
            return this;
        }
    }

    public static Favorites parseFrom(byte[] bArr) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Favorites parseFrom(byte[] bArr, de deVar) {
        return (Favorites) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
