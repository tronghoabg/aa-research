package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class zte implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zte(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 1;
        switch (this.b) {
            case 0:
                ((ztf) this.a).a.e(epr.ON_PAUSE);
                return;
            case 1:
                ((ztf) this.a).a.e(epr.ON_RESUME);
                return;
            case 2:
                ((ztv) this.a).b();
                return;
            case 3:
                ((zwq) this.a).d();
                return;
            case 4:
                zuv zuvVar = (zuv) this.a;
                if (zuvVar.a()) {
                    for (zwa zwaVar : zuvVar.b) {
                        zwaVar.b = zwaVar.h(zwaVar.d);
                        zwaVar.d();
                    }
                    return;
                }
                return;
            case 5:
                ((zva) this.a).a();
                return;
            case 6:
                zvm zvmVar = (zvm) this.a;
                vfu vfuVar = zvmVar.d;
                if (vfuVar != null) {
                    try {
                        vfuVar.e();
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
                zvs zvsVar = zvmVar.c;
                if (zvsVar != null) {
                    zvsVar.a();
                    return;
                }
                return;
            case 7:
                aabc aabcVar = (aabc) this.a;
                xyc xycVar = ((zuq) aabcVar.i).b;
                int i2 = zvp.a;
                ((zqy) aabcVar.d).b(new aaar(xycVar, i));
                return;
            case 8:
                zvs zvsVar2 = (zvs) this.a;
                sm smVar = zvsVar2.b;
                if (smVar != null) {
                    sm smVarJ = smVar.J();
                    int I = smVarJ != null ? smVar.I(smVarJ) : -1;
                    if (zrn.e("INDOOR", 3)) {
                        Log.d("INDOOR", "onIndoorBuildingFocused: " + String.valueOf(smVarJ) + ", " + I);
                    }
                    zvsVar2.e(smVarJ, I);
                    return;
                }
                return;
            case 9:
                ((zvs) this.a).b();
                return;
            case 10:
                Object obj = this.a;
                synchronized (obj) {
                    if (((zwk) obj).b && (((zwk) obj).d != null || ((zwk) obj).c != null)) {
                        ArrayList arrayList = new ArrayList(2);
                        vgp vgpVar = ((zwk) obj).d;
                        if (vgpVar != null) {
                            arrayList.add(vgpVar);
                            ((zwk) obj).d = null;
                        }
                        vgp vgpVar2 = ((zwk) obj).c;
                        if (vgpVar2 != null) {
                            arrayList.add(vgpVar2);
                            ((zwk) obj).c = null;
                        }
                        String str = zwk.a;
                        if (zrn.e(str, 2)) {
                            Log.v(str, "onMapLoaded");
                        }
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            try {
                                ((vgp) arrayList.get(i3)).a();
                            } catch (RemoteException e2) {
                                throw new RuntimeRemoteException(e2);
                            }
                        }
                        return;
                    }
                    return;
                }
            case 11:
                int i4 = zwn.f;
                ((zre) this.a).b();
                return;
            case 12:
                ((zwq) this.a).d();
                return;
            case 13:
                Object obj2 = this.a;
                synchronized (((zxh) obj2).i) {
                    if (((zxh) obj2).o == 1) {
                        ((zxh) obj2).j = ((zxh) obj2).g;
                        SharedPreferences sharedPreferences = ((zxh) obj2).b.getSharedPreferences("com.google.maps.api.android.lib6.ul.PREFERENCES_FILE", 0);
                        if (sharedPreferences.getBoolean("isCachedStartupMarker", false)) {
                            ((zxh) obj2).o = 2;
                        } else {
                            ((zxh) obj2).o = 3;
                            sharedPreferences.edit().putBoolean("isCachedStartupMarker", true).commit();
                        }
                    }
                }
                return;
            case 14:
                String[] strArr = zyb.b;
                int length = strArr.length;
                String str2 = strArr[0];
                Context context = ((zyb) this.a).r;
                context.deleteFile(str2 + "." + context.getPackageName());
                return;
            case 15:
                Object obj3 = this.a;
                if (addm.f() || ((zyb) obj3).d == null) {
                    if (addm.f()) {
                        synchronized (obj3) {
                            if (((zyb) obj3).p) {
                                return;
                            }
                            ((zyb) obj3).w = ((zyb) obj3).c();
                            acbu acbuVar = ((zyb) obj3).w;
                            if (acbuVar == null) {
                                return;
                            }
                            Iterator<E> it = acbuVar.c.iterator();
                            while (it.hasNext()) {
                                ((zyb) obj3).j((aceg) it.next());
                            }
                            Iterator it2 = ((zyb) obj3).e.iterator();
                            while (it2.hasNext()) {
                                ((zyb) obj3).k((aceg) it2.next());
                            }
                            ((zyb) obj3).q = true;
                        }
                    } else {
                        zyb zybVar = (zyb) obj3;
                        zybVar.d = zyb.l();
                        zybVar.f = new HashMap();
                        zybVar.w = zybVar.c();
                        if (zybVar.w == null) {
                            return;
                        }
                        synchronized (obj3) {
                            Iterator<E> it3 = ((zyb) obj3).w.c.iterator();
                            while (it3.hasNext()) {
                                ((zyb) obj3).j((aceg) it3.next());
                            }
                            Iterator it4 = ((zyb) obj3).d.iterator();
                            while (it4.hasNext()) {
                                ((zyb) obj3).k((aceg) it4.next());
                            }
                            ((zyb) obj3).q = true;
                        }
                    }
                    ((zyb) obj3).f();
                    return;
                }
                return;
            case 16:
                ((zya) this.a).b.h();
                return;
            case 17:
                ((zyu) this.a).c();
                return;
            case 18:
                sio sioVar = ((tng) this.a).a;
                sioVar.d.writeLock().lock();
                try {
                    sioVar.e = true;
                    return;
                } finally {
                    sioVar.d.writeLock().unlock();
                }
            case 19:
                zzz zzzVar = (zzz) this.a;
                String str3 = zzzVar.n;
                if (str3 != null) {
                    zzzVar.d.setText(str3);
                    return;
                } else {
                    zzzVar.d.setText("");
                    return;
                }
            default:
                aaco aacoVar = ((aabg) this.a).b;
                if (!aacoVar.h) {
                    aacoVar.k();
                }
                aacoVar.h = false;
                return;
        }
    }
}
