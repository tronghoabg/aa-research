package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.libraries.geo.mapcore.geoxp.jni.logging.NativeCountersLoggingTransport;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class shd implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ shd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, syp] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = 0;
        switch (this.b) {
            case 0:
                sat satVar = (sat) this.a;
                satVar.c.post(satVar.b);
                return;
            case 1:
                Object obj = this.a;
                shi shiVar = (shi) obj;
                shh shhVar = shiVar.i;
                if (shhVar.a) {
                    rwv rwvVar = shhVar.f;
                    if (rwvVar != null) {
                        try {
                            rwvVar.m(((shi) obj).c);
                        } catch (RemoteException e) {
                            shi.a.f().p(e).ai(8962).y("Couldn't stop %s, but it could be fine.", shiVar.i.e);
                        }
                    }
                    shiVar.b.unbindService(shiVar.h);
                    shiVar.i.a = false;
                    return;
                }
                return;
            case 2:
                sjl sjlVar = (sjl) this.a;
                if (sjlVar.a.getAndSet(true)) {
                    return;
                }
                String str = sjlVar.d;
                sji.a(str, 1030);
                sjlVar.e.a(sjlVar.c, str);
                return;
            case 3:
                skv skvVar = ((sme) ((ykd) this.a).a).b;
                skvVar.o(String.valueOf(skvVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 4:
                ((smz) this.a).f.b(new ConnectionResult(1, 4, null, null, null));
                return;
            case 5:
                Object obj2 = this.a;
                synchronized (((svq) obj2).a) {
                    ((svq) obj2).b.b();
                }
                return;
            case 6:
                try {
                    Thread.sleep(Math.max(0L, 600000L));
                } catch (InterruptedException e2) {
                    Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e2);
                    Thread.currentThread().interrupt();
                }
                syc.a((Context) this.a);
                syc.b();
                return;
            case 7:
                this.a.b();
                return;
            case 8:
                yob yobVar = tes.a;
                ((ynz) ((ynz) yobVar.h()).ai((char) 8993)).u("Lockscreen timeout expired");
                ynz ynzVar = (ynz) ((ynz) yobVar.e()).ai(8991);
                tes tesVar = (tes) this.a;
                List list = tesVar.b;
                ynzVar.w("Notifying %d external onTimeout listeners", list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                tesVar.a();
                return;
            case 9:
                tng tngVar = (tng) this.a;
                SharedPreferences.Editor editorEdit = tngVar.e.edit();
                editorEdit.putLong("InitializedEventPreviousEventMsPrefKey", tngVar.f);
                editorEdit.apply();
                return;
            case 10:
                vaq.d();
                qau qauVar = ((tnl) this.a).k;
                vo voVar = new vo((char[]) null);
                voVar.b(yvi.s);
                qauVar.g(voVar.a());
                return;
            case 11:
                Object obj3 = this.a;
                try {
                    return;
                } catch (abon e3) {
                    ((ynz) ((ynz) ((ynz) NativeCountersLoggingTransport.a.h()).p(e3)).ai((char) 9112)).u("Failed to parse counterfactual event");
                    return;
                }
            case 12:
                ((gms) this.a).a.run();
                return;
            case 13:
                vaq.d();
                qau qauVar2 = ((ttq) this.a).a;
                vo voVar2 = new vo((char[]) null);
                voVar2.b(yvi.s);
                qauVar2.g(voVar2.a());
                return;
            case 14:
                ((AtomicInteger) ((ncp) this.a).c).set(0);
                return;
            case 15:
                break;
            case 16:
                HashSet hashSet = new HashSet();
                Object obj4 = this.a;
                synchronized (obj4) {
                    Object obj5 = ((gjt) obj4).c;
                    if (obj5 != null) {
                        hashSet.addAll(obj5);
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ttk) it2.next()).a();
                }
                ((gjt) obj4).h();
                return;
            case 17:
                Object obj6 = this.a;
                synchronized (obj6) {
                    ((tvr) obj6).h = true;
                }
                return;
            case 18:
                ((tvl) this.a).m();
                return;
            case 19:
                ((ajju) this.a).i();
                return;
            default:
                ((tvl) this.a).m();
                return;
        }
        while (true) {
            ?? r0 = this.a;
            if (i >= ((yls) r0).c) {
                return;
            }
            ((Runnable) r0.get(i)).run();
            i++;
        }
    }

    public shd(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
