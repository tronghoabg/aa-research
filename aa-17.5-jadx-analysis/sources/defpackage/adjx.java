package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class adjx extends adlo {
    protected adjx() {
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aeaf, java.lang.Object] */
    @Override // defpackage.adlo
    public adlm a() {
        adiz adizVar;
        adlo adloVarB = b();
        adwb adwbVar = (adwb) adloVarB;
        adsm adsmVarA = adwbVar.z.a();
        aebg aebgVarE = adjw.a ? adwb.e(adwbVar.k, adwbVar.i) : adwb.d(adwbVar.k, adwbVar.i);
        Collection collectionB = adsmVarA.b();
        char c = 2;
        if (collectionB != null && !collectionB.containsAll(((adms) aebgVarE.b).e())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", ((adms) aebgVarE.b).c(), aebgVarE.a));
        }
        ?? r4 = aebgVarE.a;
        Object obj = aebgVarE.b;
        adzs adzsVar = new adzs(adue.o, 0);
        xyc xycVar = adue.q;
        r4.toString();
        List list = adwbVar.h;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            adiz adizVar2 = null;
            if (!it.hasNext()) {
                char c2 = c;
                adqs.w();
                boolean z = adwbVar.t;
                Method method = adwb.e;
                if (method != null) {
                    try {
                        boolean z2 = ((adwb) adloVarB).u;
                        boolean z3 = ((adwb) adloVarB).v;
                        boolean z4 = ((adwb) adloVarB).w;
                        Object[] objArr = new Object[4];
                        objArr[0] = true;
                        objArr[1] = true;
                        objArr[c2] = false;
                        objArr[3] = true;
                        adizVar = (adiz) method.invoke(null, objArr);
                    } catch (IllegalAccessException e) {
                        adwb.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                    } catch (InvocationTargetException e2) {
                        adwb.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                    }
                } else {
                    adizVar = null;
                }
                if (adizVar != null) {
                    arrayList.add(0, adizVar);
                }
                boolean z5 = adwbVar.x;
                try {
                    adizVar2 = (adiz) Class.forName("adqu").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e3) {
                    adwb.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                } catch (IllegalAccessException e4) {
                    adwb.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                } catch (NoSuchMethodException e5) {
                    adwb.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                } catch (InvocationTargetException e6) {
                    adwb.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                }
                if (adizVar2 != null) {
                    arrayList.add(0, adizVar2);
                }
                return new adwd(new advv(adwbVar, adsmVarA, r4, (adms) obj, adzsVar, xycVar, arrayList, aeaa.a));
            }
            adiz adizVar3 = (adiz) it.next();
            char c3 = c;
            if (adizVar3 instanceof adwa) {
                adln adlnVar = ((adwa) adizVar3).a;
                throw null;
            }
            arrayList.add(adizVar3);
            c = c3;
        }
    }

    protected abstract adlo b();

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", b());
        return xxgVarAo.toString();
    }
}
