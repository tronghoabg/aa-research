package Va;

import A.AbstractC0213f;
import N1.C0764m;
import N1.C0765n;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.protobuf.C1393j;
import androidx.lifecycle.InterfaceC1457v;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class M6 {
    public static void A(StringBuilder sb2, String str, long j8, String str2) {
        sb2.append(str);
        sb2.append(j8);
        sb2.append(str2);
    }

    public static boolean B(int i5, int i10, char c10, int i11, String str) {
        return str.equals(P6.I0(i11, i5 - i10, c10).intern());
    }

    public static int C(int i5, int i10, int i11, int i12) {
        return ((i5 * i10) / i11) + i12;
    }

    public static String D(int i5, int i10, char c10, int i11) {
        return C1203x8.c(i11, i5 - i10, c10).intern();
    }

    public static String E(int i5, int i10, char c10, int i11) {
        return Z9.b(i11, i5 - i10, c10).intern();
    }

    public static /* synthetic */ String F(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String G(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static boolean a(Z.j jVar, tf.l predicate) {
        AbstractC3340k.e(predicate, "predicate");
        return ((Boolean) predicate.invoke(jVar)).booleanValue();
    }

    public static void b(Encoder encoder, KSerializer serializer, Object obj) {
        AbstractC3340k.e(serializer, "serializer");
        if (serializer.getDescriptor().b()) {
            encoder.n(serializer, obj);
        } else if (obj == null) {
            encoder.p();
        } else {
            encoder.n(serializer, obj);
        }
    }

    public static void c(InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
    }

    public static void d(InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
    }

    public static void e(InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
    }

    public static Z.k f(Z.k kVar, Z.k other) {
        AbstractC3340k.e(other, "other");
        return other == Z.i.f16922a ? kVar : new Z.f(kVar, other);
    }

    public static final void g(int i5, View view, ViewGroup container) {
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(container, "container");
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (androidx.fragment.app.e0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iF == 1) {
            if (androidx.fragment.app.e0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (androidx.fragment.app.e0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iF == 2) {
            if (androidx.fragment.app.e0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iF != 3) {
            return;
        }
        if (androidx.fragment.app.e0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int h(int i5, int i10, int i11) {
        return C1393j.y(i5) + i10 + i11;
    }

    public static int i(int i5, int i10, int i11, int i12) {
        return C1393j.z(i5) + i10 + i11 + i12;
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object k(int i5, List list) {
        return list.get(list.size() - i5);
    }

    public static String l(int i5, int i10, char c10, int i11) {
        return C1203x8.c(i11, i5 + i10, c10).intern();
    }

    public static String m(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String n(Class cls, String str) {
        return str + cls;
    }

    public static String o(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String p(String str, androidx.fragment.app.F f10, String str2) {
        return str + f10 + str2;
    }

    public static String q(String str, String str2, String str3, Throwable th) {
        return str + th + str2 + str3;
    }

    public static String r(StringBuilder sb2, int i5, char c10) {
        sb2.append(i5);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, long j8, String str) {
        sb2.append(j8);
        sb2.append(str);
        return sb2.toString();
    }

    public static String t(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder u(long j8, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j8);
        sb2.append(str2);
        return sb2;
    }

    public static Map v() {
        return DesugarCollections.synchronizedMap(new HashMap());
    }

    public static void w(int i5, int i10, int i11, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i5, i10, i11)));
    }

    public static void x(int i5, HashMap map, String str, int i10, String str2) {
        map.put(str, Integer.valueOf(i5));
        map.put(str2, Integer.valueOf(i10));
    }

    public static void y(C0764m c0764m, s2.C c10) {
        c10.c(new C0765n(c0764m));
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }
}
