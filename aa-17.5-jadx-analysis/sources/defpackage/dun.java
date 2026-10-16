package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dun {
    public static final void a(fbg fbgVar, ere ereVar) {
        ereVar.getClass();
        ept lifecycle = fbgVar.getLifecycle();
        eps epsVarA = lifecycle.a();
        if (epsVarA == eps.b || epsVarA.a(eps.d)) {
            fbgVar.getSavedStateRegistry().d(eqo.class);
        } else {
            lifecycle.c(new erc(fbgVar, 2));
        }
    }

    public static final ere b(fbg fbgVar) {
        fbd fbdVarB = fbgVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (fbdVarB == null) {
            return null;
        }
        if (fbdVarB instanceof ere) {
            return (ere) fbdVarB;
        }
        throw new IllegalStateException("The registered SavedStateProvider under SAVED_STATE_KEY is not of type SavedStateHandleController");
    }

    public static final ere c(fbg fbgVar, eru eruVar) {
        affv affvVar = new affv();
        affvVar.a = b(fbgVar);
        if (affvVar.a == null) {
            affvVar.a = new ere(fbgVar, eruVar);
            fbgVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", (fbd) affvVar.a);
            if (fbgVar.getLifecycle().a().a(eps.c)) {
                ((ere) affvVar.a).c();
            } else {
                fbgVar.getLifecycle().c(new erc(affvVar, 0));
            }
        }
        return (ere) affvVar.a;
    }

    public static Typeface d(Context context, List list, int i, boolean z, int i2, Handler handler, dsg dsgVar) {
        rz rzVar = new rz(dsgVar, new dwn(handler, 0));
        Object obj = null;
        if (!z) {
            String strA = dwk.a(list, i);
            Typeface typeface = (Typeface) dwk.a.b(strA);
            if (typeface != null) {
                rzVar.r(new acjs(typeface));
                obj = typeface;
            } else {
                dwj dwjVar = new dwj(rzVar, 1);
                synchronized (dwk.c) {
                    aat aatVar = dwk.d;
                    ArrayList arrayList = (ArrayList) aatVar.get(strA);
                    if (arrayList != null) {
                        arrayList.add(dwjVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(dwjVar);
                        aatVar.put(strA, arrayList2);
                        dwi dwiVar = new dwi(strA, context, list, i);
                        dwk.b.execute(new hql(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), dwiVar, new dwj(strA, 0), 1));
                    }
                }
            }
        } else {
            if (list.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            dwg dwgVar = (dwg) list.get(0);
            zu zuVar = dwk.a;
            String strA2 = dwk.a(rz.m(new Object[]{dwgVar}), i);
            Typeface typeface2 = (Typeface) dwk.a.b(strA2);
            if (typeface2 != null) {
                rzVar.r(new acjs(typeface2));
                obj = typeface2;
            } else if (i2 == -1) {
                acjs acjsVarB = dwk.b(strA2, context, rz.m(new Object[]{dwgVar}), i);
                rzVar.r(acjsVarB);
                obj = acjsVarB.b;
            } else {
                try {
                    acjs acjsVar = (acjs) dsq.c(dwk.b, new dwh(strA2, context, dwgVar, i), i2);
                    rzVar.r(acjsVar);
                    obj = acjsVar.b;
                } catch (InterruptedException unused) {
                    rzVar.r(new acjs(-3, null, null));
                }
            }
        }
        return (Typeface) obj;
    }
}
