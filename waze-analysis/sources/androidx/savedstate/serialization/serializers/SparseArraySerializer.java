package androidx.savedstate.serialization.serializers;

import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.o.c;
import java.util.ArrayList;
import java.util.List;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.b.c.as;
import kotlinx.b.c.br;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SparseArraySerializer<T> implements b<SparseArray<T>> {
    private final q descriptor;
    private final b<SparseArraySurrogate<T>> surrogateSerializer;

    public SparseArraySerializer(b<T> bVar) {
        x.f(bVar, "elementSerializer");
        b<SparseArraySurrogate<T>> bVarSerializer = SparseArraySurrogate.Companion.serializer(bVar);
        this.surrogateSerializer = bVarSerializer;
        this.descriptor = bVarSerializer.getDescriptor();
    }

    @Override // kotlinx.b.a
    public SparseArray<T> deserialize(e eVar) {
        x.f(eVar, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) eVar.decodeSerializableValue(this.surrogateSerializer);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray<T> sparseArray = new SparseArray<>(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.append(sparseArraySurrogate.getKeys().get(i2).intValue(), sparseArraySurrogate.getValues().get(i2));
        }
        return sparseArray;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, SparseArray<T> sparseArray) {
        x.f(fVar, "encoder");
        x.f(sparseArray, "value");
        int size = sparseArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
        }
        ArrayList arrayList2 = arrayList;
        int size2 = sparseArray.size();
        ArrayList arrayList3 = new ArrayList(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList3.add(sparseArray.valueAt(i3));
        }
        fVar.encodeSerializableValue(this.surrogateSerializer, new SparseArraySurrogate(arrayList2, arrayList3));
    }

    /* compiled from: WazeSource */
    @j
    final class SparseArraySurrogate<T> {
        private static final q $cachedDescriptor;
        private final List<Integer> keys;
        private final List<T> values;
        public static final Companion Companion = new Companion(null);
        private static final h.f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SparseArraySerializer.SparseArraySurrogate._childSerializers$_anonymous_();
            }
        }), null};

        static {
            br brVar = new br("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            brVar.l("keys", false);
            brVar.l("values", false);
            $cachedDescriptor = brVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(List<Integer> list, List<? extends T> list2) {
            x.f(list, "keys");
            x.f(list2, "values");
            this.keys = list;
            this.values = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ b _childSerializers$_anonymous_() {
            return new kotlinx.b.c.e(as.f50970a);
        }

        public static final /* synthetic */ void write$Self$savedstate(SparseArraySurrogate sparseArraySurrogate, d dVar, q qVar, b bVar) {
            dVar.encodeSerializableElement(qVar, 0, $childSerializers[0].getValue(), sparseArraySurrogate.keys);
            dVar.encodeSerializableElement(qVar, 1, new kotlinx.b.c.e(bVar), sparseArraySurrogate.values);
        }

        public final List<Integer> getKeys() {
            return this.keys;
        }

        public final List<T> getValues() {
            return this.values;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final <T> b<SparseArraySurrogate<T>> serializer(b<T> bVar) {
                x.f(bVar, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(bVar);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ SparseArraySurrogate(int i2, List list, List list2, ca caVar) {
            if ((i2 & 3) != 3) {
                c.m(i2, 3, $cachedDescriptor);
            }
            this.keys = list;
            this.values = list2;
        }
    }
}
