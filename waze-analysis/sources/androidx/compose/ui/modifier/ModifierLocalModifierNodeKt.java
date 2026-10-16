package androidx.compose.ui.modifier;

import h.a.c;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ModifierLocalModifierNodeKt {
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length == 1) {
            return new SingleLocalMap((ModifierLocal) c.M(modifierLocalArr));
        }
        k kVar = new k(c.M(modifierLocalArr), null);
        List listQ = c.Q(modifierLocalArr, 1);
        ArrayList arrayList = new ArrayList(listQ.size());
        int size = listQ.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new k((ModifierLocal) listQ.get(i2), null));
        }
        k[] kVarArr = (k[]) arrayList.toArray(new k[0]);
        return new MultiLocalMap(kVar, (k[]) Arrays.copyOf(kVarArr, kVarArr.length));
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?> modifierLocal, ModifierLocal<?> modifierLocal2, ModifierLocal<?>... modifierLocalArr) {
        k kVar = new k(modifierLocal, null);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new k(modifierLocal2, null));
        ArrayList arrayList2 = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList2.add(new k(modifierLocal3, null));
        }
        x.q(arrayList2.toArray(new k[0]), arrayList);
        return new MultiLocalMap(kVar, (k[]) arrayList.toArray(new k[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ModifierLocalMap modifierLocalMapOf(k<? extends ModifierLocal<T>, ? extends T> kVar) {
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) kVar.c());
        singleLocalMap.mo9902set$ui((ModifierLocal) kVar.c(), kVar.d());
        return singleLocalMap;
    }

    public static final ModifierLocalMap modifierLocalMapOf(k<? extends ModifierLocal<?>, ? extends Object> kVar, k<? extends ModifierLocal<?>, ? extends Object> kVar2, k<? extends ModifierLocal<?>, ? extends Object>... kVarArr) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(kVar2);
        x.q(kVarArr, arrayList);
        return new MultiLocalMap(kVar, (k[]) arrayList.toArray(new k[arrayList.size()]));
    }

    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(k... kVarArr) {
        int length = kVarArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            k kVar = (k) c.M(kVarArr);
            k[] kVarArr2 = (k[]) c.Q(kVarArr, 1).toArray(new k[0]);
            return new MultiLocalMap(kVar, (k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        }
        return new MultiLocalMap((k) c.M(kVarArr), new k[0]);
    }
}
