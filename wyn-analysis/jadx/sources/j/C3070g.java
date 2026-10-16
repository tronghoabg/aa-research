package j;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ff.AbstractC2640A;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;
import n3.InterfaceC3591c;
import r7.AbstractC3935e;
import u0.Q;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3070g implements InterfaceC3591c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38461a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38462b;

    public /* synthetic */ C3070g(Object obj, int i5) {
        this.f38461a = i5;
        this.f38462b = obj;
    }

    @Override // n3.InterfaceC3591c
    public final Bundle a() {
        Object obj = this.f38462b;
        switch (this.f38461a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) obj).C().getClass();
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
            default:
                W.d dVar = (W.d) obj;
                LinkedHashMap linkedHashMapA0 = AbstractC2640A.a0(dVar.f14928a);
                for (Map.Entry entry : dVar.f14929b.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() == 1) {
                        Object objInvoke = ((tf.a) list.get(0)).invoke();
                        if (objInvoke == null) {
                            continue;
                        } else {
                            if (!Q.c(objInvoke)) {
                                throw new IllegalStateException(gc.b.s(objInvoke).toString());
                            }
                            linkedHashMapA0.put(str, AbstractC3935e.i(objInvoke));
                        }
                    } else {
                        int size = list.size();
                        ArrayList arrayList = new ArrayList(size);
                        for (int i5 = 0; i5 < size; i5++) {
                            Object objInvoke2 = ((tf.a) list.get(i5)).invoke();
                            if (objInvoke2 != null && !Q.c(objInvoke2)) {
                                throw new IllegalStateException(gc.b.s(objInvoke2).toString());
                            }
                            arrayList.add(objInvoke2);
                        }
                        linkedHashMapA0.put(str, arrayList);
                    }
                }
                Bundle bundle3 = new Bundle();
                for (Map.Entry entry2 : linkedHashMapA0.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    bundle3.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                }
                return bundle3;
        }
    }

    public C3070g(C3592d registry) {
        this.f38461a = 1;
        AbstractC3340k.e(registry, "registry");
        this.f38462b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }
}
