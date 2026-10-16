package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.LookupCache;
import com.fasterxml.jackson.databind.util.TypeKey;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ReadOnlyClassToSerializerMap {
    private final Bucket[] _buckets;
    private final int _mask;
    private final int _size;

    public ReadOnlyClassToSerializerMap(LookupCache<TypeKey, JsonSerializer<Object>> lookupCache) {
        int iFindSize = findSize(lookupCache.size());
        this._size = iFindSize;
        this._mask = iFindSize - 1;
        final Bucket[] bucketArr = new Bucket[iFindSize];
        lookupCache.contents(new BiConsumer() { // from class: com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f$0.lambda$new$0(bucketArr, (TypeKey) obj, (JsonSerializer) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this._buckets = bucketArr;
    }

    private static final int findSize(int i2) {
        int i3 = 8;
        while (i3 < (i2 <= 64 ? i2 + i2 : i2 + (i2 >> 2))) {
            i3 += i3;
        }
        return i3;
    }

    public static ReadOnlyClassToSerializerMap from(LookupCache<TypeKey, JsonSerializer<Object>> lookupCache) {
        return new ReadOnlyClassToSerializerMap(lookupCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Bucket[] bucketArr, TypeKey typeKey, JsonSerializer jsonSerializer) {
        int iHashCode = this._mask & typeKey.hashCode();
        bucketArr[iHashCode] = new Bucket(bucketArr[iHashCode], typeKey, jsonSerializer);
    }

    public int size() {
        return this._size;
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        Bucket bucket = this._buckets[TypeKey.typedHash(javaType) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (!bucket.matchesTyped(javaType)) {
            do {
                bucket = bucket.next;
                if (bucket == null) {
                    return null;
                }
            } while (!bucket.matchesTyped(javaType));
        }
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        Bucket bucket = this._buckets[TypeKey.untypedHash(javaType) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (!bucket.matchesUntyped(javaType)) {
            do {
                bucket = bucket.next;
                if (bucket == null) {
                    return null;
                }
            } while (!bucket.matchesUntyped(javaType));
        }
        return bucket.value;
    }

    /* compiled from: WazeSource */
    final class Bucket {
        protected final Class<?> _class;
        protected final boolean _isTyped;
        protected final JavaType _type;
        public final Bucket next;
        public final JsonSerializer<Object> value;

        public Bucket(Bucket bucket, TypeKey typeKey, JsonSerializer<Object> jsonSerializer) {
            this.next = bucket;
            this.value = jsonSerializer;
            this._isTyped = typeKey.isTyped();
            this._class = typeKey.getRawType();
            this._type = typeKey.getType();
        }

        public boolean matchesTyped(JavaType javaType) {
            return this._isTyped && javaType.equals(this._type);
        }

        public boolean matchesUntyped(JavaType javaType) {
            return !this._isTyped && javaType.equals(this._type);
        }

        public boolean matchesTyped(Class<?> cls) {
            return this._class == cls && this._isTyped;
        }

        public boolean matchesUntyped(Class<?> cls) {
            return this._class == cls && !this._isTyped;
        }
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        Bucket bucket = this._buckets[TypeKey.typedHash(cls) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (!bucket.matchesTyped(cls)) {
            do {
                bucket = bucket.next;
                if (bucket == null) {
                    return null;
                }
            } while (!bucket.matchesTyped(cls));
        }
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        Bucket bucket = this._buckets[TypeKey.untypedHash(cls) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (!bucket.matchesUntyped(cls)) {
            do {
                bucket = bucket.next;
                if (bucket == null) {
                    return null;
                }
            } while (!bucket.matchesUntyped(cls));
        }
        return bucket.value;
    }
}
