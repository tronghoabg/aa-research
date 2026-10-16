package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tzd {
    public tzt a;
    public boolean d;
    public volatile usz f;
    public final qrx g;
    private tzw h;
    private ygr i;
    public final Map b = new HashMap();
    public final Set c = new HashSet();
    private yfy j = ylx.a;
    public boolean e = true;
    private boolean k = false;

    public tzd(qrx qrxVar) {
        this.g = qrxVar;
    }

    public static boolean c(usz uszVar, int i) {
        return uszVar.a.l >= ((float) i);
    }

    private final synchronized yfy e() {
        if (this.e) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                for (tzw tzwVar : (Collection) it.next()) {
                    tzv tzvVar = tzwVar.b;
                    if (tzvVar != null) {
                        tnz tnzVar = tzwVar.c;
                        tob tobVar = tzvVar.b;
                        if (!map.containsKey(tobVar)) {
                            map2.put(tobVar, tzvVar);
                            map.put(tobVar, new toa());
                        }
                        toa toaVar = (toa) map.get(tobVar);
                        tot totVarA = tnzVar.a();
                        tot totVar = toa.a;
                        if (totVarA != totVar) {
                            tot totVar2 = toaVar.c;
                            if (totVar2 == totVar) {
                                toaVar.c = new tot(too.i(totVarA.a), too.i(totVarA.b));
                            } else {
                                too tooVar = totVar2.a;
                                int i = tooVar.a;
                                too tooVar2 = totVarA.a;
                                tooVar.a = Math.min(i, tooVar2.a);
                                tooVar.b = Math.min(tooVar.b, tooVar2.b);
                                too tooVar3 = totVar2.b;
                                int i2 = tooVar3.a;
                                too tooVar4 = totVarA.b;
                                tooVar3.a = Math.max(i2, tooVar4.a);
                                tooVar3.b = Math.max(tooVar3.b, tooVar4.b);
                                totVar2.c = null;
                                totVar2.d = null;
                            }
                            toaVar.b.add(tnzVar);
                        }
                    }
                }
            }
            HashMap map3 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                tob tobVar2 = (tob) entry.getKey();
                map3.put(tobVar2, new tzw((tzv) map2.get(tobVar2), (toa) entry.getValue()));
            }
            yfu yfuVar = new yfu(4);
            yfuVar.h(map3);
            this.j = yfuVar.d(true);
            this.e = false;
            this.k = true;
        }
        return this.j;
    }

    private final synchronized ygr f(usz uszVar, yfy yfyVar) {
        if (uszVar == null) {
            return yly.a;
        }
        ygr ygrVar = this.i;
        if (!this.k && ygrVar != null) {
            return ygrVar;
        }
        ygr ygrVarN = ygr.n(yfyVar.values());
        this.k = false;
        return ygrVarN;
    }

    private final synchronized void g(Collection collection) {
        Set set = this.c;
        set.clear();
        set.addAll(collection);
        HashSet hashSet = new HashSet();
        Map map = this.b;
        for (ukp ukpVar : map.keySet()) {
            if (!collection.contains(ukpVar)) {
                hashSet.add(ukpVar);
            }
        }
        map.keySet().removeAll(hashSet);
        if (!hashSet.isEmpty()) {
            this.e = true;
        }
        ((tzu) this.g.c).t(collection);
    }

    public final synchronized Collection a() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (ukp ukpVar : this.c) {
            if (!this.b.containsKey(ukpVar)) {
                hashSet.add(ukpVar);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(usz uszVar) {
        boolean zEquals;
        tzl tzlVar;
        tzw tzwVar;
        boolean zEquals2;
        tzx tzxVarA;
        psj psjVar;
        usy usyVar;
        toh tohVar;
        yfy yfyVarE = e();
        ygr ygrVarF = f(uszVar, yfyVarE);
        synchronized (this) {
            if (!Objects.equals(ygrVarF, this.i)) {
                this.i = ygrVarF;
                qrx qrxVar = this.g;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                Iterator<E> it = ygrVarF.iterator();
                while (it.hasNext()) {
                    tzv tzvVar = ((tzw) it.next()).b;
                    if (tzvVar != null) {
                        hashSet.add(tzvVar.b);
                        int i = 0;
                        while (true) {
                            yfq yfqVar = tzvVar.c;
                            if (i < ((yls) yfqVar).c) {
                                hashSet2.add(((tzx) yfqVar.get(i)).a());
                                i++;
                            }
                        }
                    }
                }
                ((tzu) ((roa) qrxVar.e).a).t((Collection) hashSet);
                ((tzu) ((roa) qrxVar.b).a).t((Collection) hashSet2);
                tzt tztVar = this.a;
                if (tztVar != null) {
                    synchronized (tztVar) {
                        psj psjVar2 = tztVar.d;
                        if (psjVar2 != null) {
                            psjVar2.c(new tzb());
                        }
                        tzi tziVar = tztVar.a;
                        List list = tziVar.c;
                        zEquals = Objects.equals(list, ygrVarF);
                        if (!zEquals) {
                            list.clear();
                            list.addAll(ygrVarF);
                        }
                        if (!zEquals && (tzlVar = tztVar.b) != null) {
                            tzlVar.b(tziVar);
                        }
                    }
                    if (!zEquals) {
                        yno it2 = tztVar.b().iterator();
                        while (it2.hasNext()) {
                        }
                    }
                }
            }
        }
        if (uszVar == null || !c(uszVar, 18)) {
            tzwVar = tzw.a;
        } else {
            ttn ttnVar = uszVar.a;
            too tooVar = ttnVar.h;
            double d = ttnVar.l;
            int iCos = (int) ((5.36870912E8d / (Math.cos(tooVar.a() * 0.017453292519943295d) * 2.001511821194711E7d)) * (d > 19.0d ? 8.0d / Math.pow(2.0d, d - 19.0d) : 8.0d));
            tot totVar = new tot(new too(tooVar.a - iCos, tooVar.b - iCos), new too(tooVar.a + iCos, tooVar.b + iCos));
            tzw tzwVar2 = tzw.a;
            yno it3 = yfyVarE.values().iterator();
            float f = BitmapDescriptorFactory.HUE_RED;
            tzwVar = tzwVar2;
            while (it3.hasNext()) {
                tzw tzwVar3 = (tzw) it3.next();
                tnz tnzVar = tzwVar3.c;
                if (tnzVar.b(totVar)) {
                    if (tzwVar3.d == null) {
                        tzv tzvVar2 = tzwVar3.b;
                        toh tohVar2 = null;
                        if (tzvVar2 != null && (tohVar = tzvVar2.f) != null) {
                            tohVar2 = tohVar;
                        }
                        if (tohVar2 != null) {
                            tzwVar3.d = new too(tohVar2.a, tohVar2.b, tohVar2.c);
                        } else {
                            tot totVarA = tnzVar.a();
                            too tooVar2 = new too();
                            too tooVar3 = totVarA.a;
                            int i2 = tooVar3.a;
                            too tooVar4 = totVarA.b;
                            tooVar2.r((i2 + tooVar4.a) / 2, (tooVar3.b + tooVar4.b) / 2);
                            tzwVar3.d = tooVar2;
                        }
                    }
                    float fD = tzwVar3.d.d(tooVar);
                    if (tzwVar == tzwVar2 || fD < f) {
                        tzwVar = tzwVar3;
                        f = fD;
                    }
                }
            }
        }
        synchronized (this) {
            tzw tzwVar4 = this.h;
            if (tzwVar4 != null) {
                if (Objects.equals(tzwVar.b, tzwVar4.b)) {
                    return;
                }
            }
            this.h = tzwVar;
            tzt tztVar2 = this.a;
            if (tztVar2 != null) {
                tzv tzvVar3 = tzwVar.b;
                if (tztVar2.g()) {
                    synchronized (tztVar2) {
                        tzi tziVar2 = tztVar2.a;
                        zEquals2 = Objects.equals(tziVar2.a, tzvVar3);
                        tziVar2.a = tzvVar3;
                        tzxVarA = tziVar2.a(tzvVar3);
                    }
                    if (!zEquals2) {
                        synchronized (tztVar2) {
                            tzl tzlVar2 = tztVar2.b;
                            if (tzlVar2 != null) {
                                tzlVar2.b(tztVar2.a);
                            }
                        }
                        tztVar2.f(tzxVarA);
                        yno it4 = tztVar2.b().iterator();
                        while (it4.hasNext()) {
                            Object obj = ((erb) it4.next()).a;
                            synchronized (obj) {
                                if (((zvm) obj).e != null) {
                                    ((zvm) obj).a.execute(new zte(obj, 6));
                                }
                            }
                        }
                        if (tzvVar3 != null) {
                            tztVar2.c(tzxVarA, tzvVar3, tztVar2.f.c());
                        }
                    }
                    synchronized (tztVar2) {
                        if (tzvVar3 != null) {
                            if (!tzvVar3.d && (psjVar = tztVar2.d) != null && (usyVar = tztVar2.e) != null) {
                                usyVar.g();
                                psjVar.c(new tua());
                            }
                        }
                    }
                }
            }
        }
    }

    public final void d(Collection collection, usy usyVar) {
        g(collection);
        b(usyVar != null ? usyVar.p() : null);
    }
}
