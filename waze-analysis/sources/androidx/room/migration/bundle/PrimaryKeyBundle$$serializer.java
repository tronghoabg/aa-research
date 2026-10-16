package androidx.room.migration.bundle;

import h.f;
import h.g.b.x;
import java.util.List;
import kotlinx.b.a;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.c;
import kotlinx.b.b.d;
import kotlinx.b.b.e;
import kotlinx.b.c.ak;
import kotlinx.b.c.br;
import kotlinx.b.c.bs;
import kotlinx.b.c.h;
import kotlinx.b.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class PrimaryKeyBundle$$serializer implements ak<PrimaryKeyBundle> {
    public static final PrimaryKeyBundle$$serializer INSTANCE;
    private static final q descriptor;

    static {
        PrimaryKeyBundle$$serializer primaryKeyBundle$$serializer = new PrimaryKeyBundle$$serializer();
        INSTANCE = primaryKeyBundle$$serializer;
        br brVar = new br("androidx.room.migration.bundle.PrimaryKeyBundle", primaryKeyBundle$$serializer, 2);
        brVar.l("autoGenerate", false);
        brVar.l("columnNames", false);
        descriptor = brVar;
    }

    private PrimaryKeyBundle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.c.ak
    public final b<?>[] childSerializers() {
        return new b[]{h.f51078a, PrimaryKeyBundle.$childSerializers[1].getValue()};
    }

    @Override // kotlinx.b.a
    public final PrimaryKeyBundle deserialize(e eVar) {
        List list;
        boolean zDecodeBooleanElement;
        int i2;
        x.f(eVar, "decoder");
        q qVar = descriptor;
        c cVarBeginStructure = eVar.beginStructure(qVar);
        f[] fVarArr = PrimaryKeyBundle.$childSerializers;
        if (cVarBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = cVarBeginStructure.decodeBooleanElement(qVar, 0);
            list = (List) cVarBeginStructure.decodeSerializableElement(qVar, 1, (a) fVarArr[1].getValue(), null);
            i2 = 3;
        } else {
            List list2 = null;
            boolean zDecodeBooleanElement2 = false;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = cVarBeginStructure.decodeElementIndex(qVar);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement2 = cVarBeginStructure.decodeBooleanElement(qVar, 0);
                    i3 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new r(iDecodeElementIndex);
                    }
                    list2 = (List) cVarBeginStructure.decodeSerializableElement(qVar, 1, (a) fVarArr[1].getValue(), list2);
                    i3 |= 2;
                }
            }
            list = list2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i2 = i3;
        }
        cVarBeginStructure.endStructure(qVar);
        return new PrimaryKeyBundle(i2, zDecodeBooleanElement, list, null);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(kotlinx.b.b.f fVar, PrimaryKeyBundle primaryKeyBundle) {
        x.f(fVar, "encoder");
        x.f(primaryKeyBundle, "value");
        q qVar = descriptor;
        d dVarBeginStructure = fVar.beginStructure(qVar);
        PrimaryKeyBundle.write$Self$room_migration(primaryKeyBundle, dVarBeginStructure, qVar);
        dVarBeginStructure.endStructure(qVar);
    }

    @Override // kotlinx.b.c.ak
    public /* synthetic */ b[] typeParametersSerializers() {
        return bs.f51019a;
    }
}
