package androidx.savedstate.serialization.serializers;

import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import h.f;
import h.g.b.x;
import java.util.List;
import kotlinx.b.a;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.e;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements ak<SparseArraySerializer.SparseArraySurrogate<T>> {
    private final q descriptor;
    private final /* synthetic */ b<?> typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        br brVar = new br("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        brVar.l("keys", false);
        brVar.l("values", false);
        this.descriptor = brVar;
    }

    private final /* synthetic */ b getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{SparseArraySerializer.SparseArraySurrogate.$childSerializers[0].getValue(), new e(this.typeSerial0)};
    }

    @Override // kotlinx.b.a
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(kotlinx.b.b.e eVar) {
        List list;
        List list2;
        int i2;
        x.f(eVar, "decoder");
        q qVar = this.descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        if (cVarBeginStructure.decodeSequentially()) {
            list2 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), null);
            list = (List) cVarBeginStructure.decodeSerializableElement(qVar, 1, new e(this.typeSerial0), null);
            i2 = 3;
        } else {
            boolean z = true;
            List list3 = null;
            List list4 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list4 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 0, (a) fVarArr[0].getValue(), list4);
                    i3 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new r(iDecodeElementIndex);
                    }
                    list3 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 1, new e(this.typeSerial0), list3);
                    i3 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new SparseArraySerializer.SparseArraySurrogate<>(i2, list2, list, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, SparseArraySerializer.SparseArraySurrogate<T> sparseArraySurrogate) {
        x.f(fVar, "encoder");
        x.f(sparseArraySurrogate, "value");
        q qVar = this.descriptor;
        b<?> bVar = this.typeSerial0;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate(sparseArraySurrogate, dVarBeginStructure, qVar, bVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public final b<?>[] typeParametersSerializers() {
        return new b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(b<T> bVar) {
        this();
        x.f(bVar, "typeSerial0");
        this.typeSerial0 = bVar;
    }
}
