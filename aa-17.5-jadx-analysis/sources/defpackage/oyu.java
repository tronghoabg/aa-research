package defpackage;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class oyu implements zge {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public oyu(adpb adpbVar, String str, zgp zgpVar, int i) {
        this.d = i;
        this.b = str;
        this.c = zgpVar;
        this.a = adpbVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.zge
    public final void a(Throwable th) {
        switch (this.d) {
            case 0:
                ((ype) ((ype) ((ype) oyw.a.g()).p(th)).ai((char) 6205)).u("SDP query failed.");
                break;
            case 1:
                th.getClass();
                ((ype) ((ype) lda.b.g()).p(th)).u("Could not determine eligible surveys");
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    lnm.M((lbt) it.next(), yzy.FK);
                }
                this.b.invoke(null);
                break;
            case 2:
                rgh.a.h().p(th).ai(8004).u("Error adding car BT address");
                break;
            case 3:
                Log.e("NetworkCallerGrpc", "Failed to record event.", th);
                ((wht) this.c).g();
                break;
            case 4:
                Log.e("NetworkCallerGrpc", "Failed to record event.", th);
                ((wht) this.c).g();
                break;
            case 5:
                Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
                wht whtVar = (wht) this.c;
                whtVar.c(whf.b);
                whtVar.g();
                break;
            case 6:
                Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
                wht whtVar2 = (wht) this.c;
                whtVar2.c(whf.b);
                whtVar2.g();
                break;
            default:
                Object obj = this.c;
                ((ConcurrentHashMap) ((adpb) this.a).b).remove(this.b, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oyo] */
    @Override // defpackage.zge
    public final /* synthetic */ void b(Object obj) {
        Object objInvoke;
        Object next;
        float f;
        int i = 0;
        lbt lbtVar = null;
        abxk abxkVar = null;
        lbtVar = null;
        switch (this.d) {
            case 0:
                oyv oyvVar = (oyv) obj;
                oyq oyqVarC = oyr.c(oyvVar.b);
                BluetoothDevice bluetoothDevice = oyvVar.a;
                Object obj2 = ((Optional) this.b).get();
                ?? r3 = this.a;
                r3.e(bluetoothDevice, (oyq) obj2, oyqVarC);
                oyr.e(r3, (BluetoothDevice) this.c, oyqVarC, false);
                return;
            case 1:
                Set<lbt> set = (Set) obj;
                set.getClass();
                Iterator it = woy.aQ(this.a, set).iterator();
                while (it.hasNext()) {
                    lnm.M((lbt) it.next(), yzy.FG);
                }
                if (!set.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    lbt lbtVar2 = null;
                    for (lbt lbtVar3 : set) {
                        boolean z = lbtVar3.v;
                        if (z) {
                            f = 1.0f;
                        } else {
                            aboh abohVar = acpl.d().b;
                            abohVar.getClass();
                            Iterator<E> it2 = abohVar.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    yzz yzzVarB = yzz.b(((abrd) next).b);
                                    if (yzzVarB == null) {
                                        yzzVarB = yzz.UNKNOWN_CONTEXT;
                                    }
                                    if (yzzVarB == lbtVar3.c()) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            abrd abrdVar = (abrd) next;
                            if (abrdVar == null) {
                                abrdVar = abrd.a;
                                abrdVar.getClass();
                            }
                            f = abrdVar.c;
                        }
                        if (afgs.b.a() < f) {
                            if (z && lbtVar2 == null) {
                                lbtVar2 = lbtVar3;
                            }
                            linkedHashSet.add(lbtVar3);
                        } else {
                            lda.b.l().J("Survey %s: sampled out (sample fraction: %.1f)", lbtVar3.name(), f);
                            lnm.M(lbtVar3, yzy.FH);
                        }
                    }
                    int size = linkedHashSet.size();
                    if (size != 0) {
                        if (size != 1) {
                            if (lbtVar2 == null) {
                                Object obj3 = this.c;
                                if (linkedHashSet.isEmpty()) {
                                    throw new NoSuchElementException("Collection is empty.");
                                }
                                int iC = ((lda) obj3).e.c(linkedHashSet.size());
                                cia ciaVar = new cia(iC, 10);
                                if (iC < 0) {
                                    objInvoke = ciaVar.invoke(Integer.valueOf(iC));
                                } else {
                                    Iterator it3 = linkedHashSet.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Object next2 = it3.next();
                                            int i2 = i + 1;
                                            if (iC == i) {
                                                objInvoke = next2;
                                            } else {
                                                i = i2;
                                            }
                                        } else {
                                            objInvoke = ciaVar.invoke(Integer.valueOf(iC));
                                        }
                                    }
                                }
                                lbtVar = (lbt) objInvoke;
                            } else {
                                lbtVar = lbtVar2;
                            }
                            lda.b.l().M("Selected %s from %s", lbtVar, linkedHashSet);
                            linkedHashSet.remove(lbtVar);
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                lnm.M((lbt) it4.next(), yzy.FI);
                            }
                        } else {
                            lbtVar = (lbt) woy.bM(linkedHashSet);
                        }
                    }
                }
                this.b.invoke(lbtVar);
                return;
            case 2:
                if (((AtomicBoolean) this.b).get()) {
                    ((rgh) this.c).a((String) this.a, 100);
                    return;
                }
                return;
            case 3:
                wht whtVar = (wht) this.c;
                whtVar.g();
                whtVar.j((abxh) this.b, (wic) this.a);
                return;
            case 4:
                acla aclaVar = (acla) obj;
                ((wht) this.c).g();
                try {
                } catch (abon e) {
                    Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey record event response to scone.", e);
                }
                ((wht) this.c).j((abxh) this.b, (wic) this.a);
                return;
            case 5:
                wht whtVar2 = (wht) this.c;
                whtVar2.g();
                whtVar2.b((abxj) this.b, (abxk) obj, (wic) this.a);
                return;
            case 6:
                aclc aclcVar = (aclc) obj;
                ((wht) this.c).g();
                try {
                    abxkVar = (abxk) abnv.y(abxk.a, aclcVar.f(), abnj.a());
                } catch (abon e2) {
                    Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey trigger response to scone.", e2);
                }
                ((wht) this.c).b((abxj) this.b, abxkVar, (wic) this.a);
                return;
            default:
                return;
        }
    }

    public oyu(afec afecVar, lda ldaVar, Set set, int i) {
        this.d = i;
        this.b = afecVar;
        this.c = ldaVar;
        this.a = set;
    }

    public oyu(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj2;
        this.a = obj3;
        this.c = obj;
    }

    public oyu(oyo oyoVar, Optional optional, BluetoothDevice bluetoothDevice, int i) {
        this.d = i;
        this.a = oyoVar;
        this.b = optional;
        this.c = bluetoothDevice;
    }
}
