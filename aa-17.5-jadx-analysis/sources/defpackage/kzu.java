package defpackage;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class kzu implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kzu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, lzh] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56, types: [dzg, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        int i2 = 0;
        Handler handler = null;
        switch (this.c) {
            case 0:
                osj osjVar = ((orz) this.b).e;
                if (osjVar == null) {
                    osjVar = osj.a;
                }
                rzj rzjVar = (rzj) this.a;
                rzjVar.f("RenderingMetadata", new kyv(rzjVar, (abnv) osjVar, i));
                return;
            case 1:
                rzj rzjVar2 = (rzj) this.a;
                rzjVar2.l();
                Object obj = this.b;
                osb osbVar = (osb) obj;
                if ((1 & osbVar.b) != 0) {
                    abpt abptVar = osbVar.c;
                    if (abptVar == null) {
                        abptVar = abpt.a;
                    }
                    rzjVar2.a("timestamp", abqu.f(abptVar));
                }
                if ((osbVar.b & 2) != 0) {
                    rzjVar2.b("navigation_signal", new kyv(rzjVar2, (abnv) obj, 17));
                }
                if ((4 & osbVar.b) != 0) {
                    rzjVar2.b("media_signal", new kyv(rzjVar2, (abnv) obj, 18));
                }
                if ((osbVar.b & 16) != 0) {
                    osf osfVar = osbVar.f;
                    if (osfVar == null) {
                        osfVar = osf.a;
                    }
                    rzjVar2.a("media_rec_request_signal", osfVar);
                    return;
                }
                return;
            case 2:
                osl oslVar = ((orz) this.b).f;
                if (oslVar == null) {
                    oslVar = osl.a;
                }
                rzj rzjVar3 = (rzj) this.a;
                rzjVar3.f("UpdateMetadata", new kyv(rzjVar3, (abnv) oslVar, 10));
                return;
            case 3:
                lcz lczVar = lda.a;
                lbt lbtVarValueOf = lbt.valueOf(acpl.f());
                ?? r1 = this.b;
                if (r1.contains(lbtVarValueOf)) {
                    ((ype) lda.b.f()).y("In proof mode for survey %s. Bypassing rate-limiting and sampling.", lbtVarValueOf.name());
                    handler = lbtVarValueOf;
                } else {
                    ((ype) lda.b.h()).y("In proof mode for survey %s, but it was not triggered. Skipping all CSAT surveys for this session.", lbtVarValueOf.name());
                }
                lda.b.l().y("Proof mode survey: %s", handler);
                for (lbt lbtVar : r1) {
                    if (lbtVar != handler) {
                        lnm.M(lbtVar, yzy.FI);
                    }
                }
                this.a.invoke(handler);
                return;
            case 4:
                ((ajmd) this.a).x((Drawable) ((lgc) this.b).b.obj);
                return;
            case 5:
                Object obj2 = this.a;
                lin linVar = (lin) this.b;
                linVar.h = (lir) obj2;
                linVar.a();
                return;
            case 6:
                dq dqVar = (dq) ((llu) this.a).b;
                Set set = dqVar.b;
                Object obj3 = this.b;
                if (!set.remove(obj3)) {
                    Log.w("MediaControllerCompat", "the callback has never been registered");
                    return;
                }
                try {
                    ajdr ajdrVar = dqVar.c;
                    ((MediaController) ajdrVar.e).unregisterCallback(((dl) obj3).a);
                    synchronized (ajdrVar.d) {
                        Object obj4 = ajdrVar.a;
                        if (((MediaSessionCompat.Token) obj4).a() != null) {
                            try {
                                dm dmVar = (dm) ((HashMap) ajdrVar.c).remove(obj3);
                                if (dmVar != null) {
                                    ((dl) obj3).c = null;
                                    ((MediaSessionCompat.Token) obj4).a().c(dmVar);
                                }
                            } catch (RemoteException e) {
                                Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                            }
                        }
                        ajdrVar.b.remove(obj3);
                    }
                    return;
                } finally {
                    ((dl) obj3).h(null);
                }
            case 7:
                dq dqVar2 = (dq) ((llu) this.a).b;
                Set set2 = dqVar2.b;
                Object obj5 = this.b;
                if (!set2.add(obj5)) {
                    Log.w("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                Handler handler2 = new Handler();
                dl dlVar = (dl) obj5;
                dlVar.h(handler2);
                ajdr ajdrVar2 = dqVar2.c;
                ((MediaController) ajdrVar2.e).registerCallback(dlVar.a, handler2);
                synchronized (ajdrVar2.d) {
                    Object obj6 = ajdrVar2.a;
                    if (((MediaSessionCompat.Token) obj6).a() != null) {
                        dm dmVar2 = new dm((dl) obj5);
                        ((HashMap) ajdrVar2.c).put(obj5, dmVar2);
                        ((dl) obj5).c = dmVar2;
                        try {
                            ((MediaSessionCompat.Token) obj6).a().b(dmVar2);
                            ((dl) obj5).g(13, null, null);
                        } catch (RemoteException e2) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                        }
                    } else {
                        ((dl) obj5).c = null;
                        ajdrVar2.b.add(obj5);
                    }
                }
                return;
            case 8:
                lwg.a().c((String) this.b, (String) this.a);
                return;
            case 9:
                nuo nuoVar = ogb.k() ? nuo.h : null;
                Object obj7 = this.a;
                mcb.b().a((String) this.b).b(nuoVar);
                lwg.a().b((String) obj7);
                return;
            case 10:
                lvi lviVar = (lvi) this.b;
                wer.c();
                Long lValueOf = Long.valueOf(lviVar.e);
                lvo lvoVar = (lvo) this.a;
                Map map = lvoVar.c;
                lvg lvgVar = (lvg) map.get(lValueOf);
                if ((lvgVar instanceof lvi) && ((lvi) lvgVar).l(lviVar)) {
                    return;
                }
                lviVar.a = false;
                lvo.l(lviVar.g, lviVar.o);
                map.put(lValueOf, lviVar);
                lvoVar.e(lviVar);
                return;
            case 11:
                Object lvkVar = this.b;
                Long lValueOf2 = Long.valueOf(((lvg) lvkVar).e);
                lvo lvoVar2 = (lvo) this.a;
                Map map2 = lvoVar2.c;
                lvg lvgVar2 = (lvg) map2.get(lValueOf2);
                if (lvgVar2 instanceof lvk) {
                    lvk lvkVar2 = (lvk) lvgVar2;
                    ((ype) lvo.a.l().ai((char) 4297)).u("Updating existing SMS conversation");
                    yfq yfqVarO = yfq.o(((lvk) lvkVar).n);
                    ArrayList arrayList = new ArrayList(lvkVar2.n);
                    arrayList.addAll(yfqVarO);
                    lvj lvjVar = new lvj();
                    lvjVar.b(lvkVar2);
                    oit.a();
                    Instant.now().toEpochMilli();
                    lvjVar.l = arrayList;
                    lvjVar.m = lvkVar2.m;
                    lvjVar.n = lvkVar2.o;
                    oit.a();
                    lvjVar.o = Instant.now().toEpochMilli();
                    lvjVar.g = lvkVar2.f;
                    lvjVar.p = lvkVar2.p;
                    lvjVar.q = lvkVar2.q;
                    lvkVar = new lvk(lvjVar);
                }
                lvg lvgVar3 = (lvg) lvkVar;
                map2.put(Long.valueOf(lvgVar3.e), lvkVar);
                lvgVar3.a = lvgVar3.p() && ((lvk) lvkVar).a() > 0;
                lvoVar2.e(lvgVar3);
                return;
            case 12:
                yph yphVar = lvt.a;
                lwg.a().c((String) this.b, (String) this.a);
                return;
            case 13:
                yph yphVar2 = lwl.a;
                lwg.a().c((String) this.b, (String) this.a);
                return;
            case 14:
                lwl.e((yzy) this.b, (String) this.a);
                return;
            case 15:
                yph yphVar3 = lwl.a;
                moa moaVarA = mlq.e().a((yzr) this.a, ((Intent) this.b).getLongExtra("EXTRA_STREAM_ITEM_ID", 0L));
                yph yphVar4 = lwl.a;
                if (yphVar4.l().Z()) {
                    ((ype) yphVar4.l().ai((char) 4413)).y("Muting conversation %s", Objects.toString(moaVarA));
                }
                lnm.k().f((lue) moaVarA, true);
                return;
            case 16:
                lwm.e((yzy) this.b, (String) this.a);
                return;
            case 17:
                wer.c();
                ?? r12 = this.b;
                ((ype) lzw.a.l().ai((char) 4554)).y("onClientHandleReady(%s)", r12);
                lzx lzxVar = ((lzy) this.a).e;
                lzw lzwVar = (lzw) lzxVar;
                lzwVar.f.removeCallbacks(lzwVar.h);
                synchronized (lzwVar.d) {
                    lzs lzsVar = ((lzw) lzxVar).c;
                    wer.c();
                    ((lzp) lzsVar).o(r12);
                    eqm eqmVar = ((lzp) lzsVar).f;
                    ajnt ajntVar = new ajnt((char[]) null);
                    ComponentName componentName = ((lzv) r12).b;
                    ajntVar.k(componentName);
                    ajntVar.a = 3;
                    eqmVar.m(ajntVar.j());
                    ((lzp) lzsVar).j(lzo.a(componentName, "Successfully connected"));
                    ((lzw) lzxVar).g = 0;
                }
                return;
            case 18:
                mal malVar = (mal) ((mak) this.a).a.get();
                if (malVar == null) {
                    return;
                }
                Object obj8 = this.b;
                if (obj8 != maj.e || malVar.e == maj.d) {
                    malVar.e((maj) obj8);
                    return;
                }
                return;
            case 19:
                int i3 = mas.a;
                while (true) {
                    ?? r0 = this.a;
                    if (i2 >= ((yls) r0).c) {
                        return;
                    }
                    ((NotificationManager) this.b).deleteNotificationChannel((String) r0.get(i2));
                    i2++;
                }
            default:
                Object obj9 = this.a;
                Object obj10 = ((mbs) obj9).b;
                ?? r8 = this.b;
                synchronized (obj10) {
                    Iterator it = ((mbs) obj9).e.iterator();
                    while (it.hasNext()) {
                        r8.a((lxr) it.next());
                    }
                }
                return;
        }
    }

    public /* synthetic */ kzu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public kzu(lgc lgcVar, ajmd ajmdVar, int i) {
        this.c = i;
        this.a = ajmdVar;
        this.b = lgcVar;
    }
}
