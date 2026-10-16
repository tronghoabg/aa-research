package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    public static /* synthetic */ void SavedState$annotations() {
    }

    public static final Bundle savedState(Map<String, ? extends Object> map, l<? super SavedStateWriter, ab> lVar) {
        k[] kVarArr;
        x.f(map, "initialState");
        x.f(lVar, "builderAction");
        if (map.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(new k(entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        lVar.invoke(SavedStateWriter.m13353boximpl(bundleBundleOf));
        return bundleBundleOf;
    }

    public static /* synthetic */ Bundle savedState$default(Map map, l lVar, int i2, Object obj) {
        k[] kVarArr;
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        if ((i2 & 2) != 0) {
            lVar = new l<SavedStateWriter, ab>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(SavedStateWriter savedStateWriter) {
                    m13266invokexApjlu4(savedStateWriter.m13393unboximpl());
                    return ab.f48028a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m13266invokexApjlu4(Bundle bundle) {
                    x.f(bundle, "<this>");
                }
            };
        }
        x.f(map, "initialState");
        x.f(lVar, "builderAction");
        if (map.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        lVar.invoke(SavedStateWriter.m13353boximpl(bundleBundleOf));
        return bundleBundleOf;
    }

    public static final Bundle savedState(Bundle bundle, l<? super SavedStateWriter, ab> lVar) {
        x.f(bundle, "initialState");
        x.f(lVar, "builderAction");
        Bundle bundle2 = new Bundle(bundle);
        SavedStateWriter.m13355constructorimpl(bundle2);
        lVar.invoke(SavedStateWriter.m13353boximpl(bundle2));
        return bundle2;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle bundle, l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = new l<SavedStateWriter, ab>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.3
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(SavedStateWriter savedStateWriter) {
                    m13267invokexApjlu4(savedStateWriter.m13393unboximpl());
                    return ab.f48028a;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m13267invokexApjlu4(Bundle bundle2) {
                    x.f(bundle2, "<this>");
                }
            };
        }
        x.f(bundle, "initialState");
        x.f(lVar, "builderAction");
        Bundle bundle2 = new Bundle(bundle);
        SavedStateWriter.m13355constructorimpl(bundle2);
        lVar.invoke(SavedStateWriter.m13353boximpl(bundle2));
        return bundle2;
    }
}
