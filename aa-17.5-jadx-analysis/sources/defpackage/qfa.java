package defpackage;

import android.content.ComponentName;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.gearhead.appdecor.CarUiEntry;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.gearhead.demand.DemandClientService;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class qfa implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qfa(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, qtu] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, xqe] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, xqe] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, mbj] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.IBinder, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        qdf qddVar;
        switch (this.c) {
            case 0:
                throw new qfb((String) this.a, (RuntimeException) this.b);
            case 1:
                qcx qcxVar = ((qcu) this.a).a;
                if (qcxVar.j.isEmpty()) {
                    Log.i("CrossProfileSender", "Connected but no holders. Disconnecting.");
                    qcxVar.l();
                    return;
                }
                ?? r7 = this.b;
                AtomicReference atomicReference = qcxVar.g;
                if (r7 == 0) {
                    qddVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = r7.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileService");
                    qddVar = iInterfaceQueryLocalInterface instanceof qdf ? (qdf) iInterfaceQueryLocalInterface : new qdd(r7);
                }
                atomicReference.set(qddVar);
                qcxVar.k();
                qcxVar.d();
                qcxVar.g();
                return;
            case 2:
                ((qfo) this.b).a.onAppDecorServiceReady(this.a);
                return;
            case 3:
                try {
                    ovr ovrVar = ((qgh) this.b).f;
                    ovrVar.gj(5, ovrVar.gh());
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) qgh.a.g()).p(e)).ai((char) 7134)).u("Error notifying onBackClicked event");
                }
                qgh qghVar = (qgh) this.b;
                qghVar.c();
                qghVar.d.k(gsn.g, yzz.DRAWER);
                Stack stack = qghVar.e;
                stack.pop();
                qghVar.c.d.l(0);
                if (stack.isEmpty()) {
                    qghVar.t();
                } else {
                    qghVar.b.d(((MenuItem) stack.peek()).c);
                }
                ((qgw) this.a).d();
                return;
            case 4:
                Object obj = this.b;
                qgm qgmVar = (qgm) obj;
                qgmVar.h.c(new ArrayList());
                ?? r72 = this.a;
                try {
                    ovu ovuVar = ((qgm) obj).m;
                    Parcel parcelGh = ovuVar.gh();
                    parcelGh.writeString((String) r72);
                    Parcel parcelGi = ovuVar.gi(4, parcelGh);
                    boolean zJ = ijp.j(parcelGi);
                    parcelGi.recycle();
                    if (zJ) {
                        qgmVar.g();
                        return;
                    }
                } catch (RemoteException e2) {
                    ((ype) ((ype) ((ype) qgm.a.g()).p(e2)).ai((char) 7164)).u("Error notifying onSearchSubmitted");
                }
                qgmVar.d.b();
                StatusBarView statusBarView = qgmVar.e;
                statusBarView.e();
                qgmVar.i();
                qgmVar.j = true;
                qgmVar.l = (String) r72;
                statusBarView.d(r72);
                qgy qgyVar = qgmVar.g;
                PagedListView pagedListView = qgyVar.a;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pagedListView.getLayoutParams();
                layoutParams.topMargin = qgyVar.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_drawer_header_height);
                pagedListView.setLayoutParams(layoutParams);
                if (qgmVar.h.a() == 0) {
                    qgmVar.k = true;
                    qgy qgyVar2 = qgmVar.g;
                    qgyVar2.a.setVisibility(8);
                    qgyVar2.b.setVisibility(0);
                    return;
                }
                return;
            case 5:
                ?? r0 = this.b;
                Object obj2 = this.a;
                try {
                    ovu ovuVar2 = ((qgm) obj2).m;
                    Parcel parcelGh2 = ovuVar2.gh();
                    ijp.g(parcelGh2, r0);
                    ovuVar2.gj(5, parcelGh2);
                } catch (RemoteException e3) {
                    ((ype) ((ype) ((ype) qgm.a.g()).p(e3)).ai((char) 7163)).u("Error notifying onSearchItemSelected");
                }
                ((qgm) obj2).g();
                return;
            case 6:
                ((RecyclerView) this.b).au().f();
                Object obj3 = this.a;
                ((qgj) obj3).a = false;
                ((lt) obj3).g();
                return;
            case 7:
                Object obj4 = this.b;
                qgq qgqVar = (qgq) this.a;
                qgqVar.s((MenuItem) obj4);
                ((CarUiEntry) qgqVar.f.b).drawerController.e();
                return;
            case 8:
                ((RecyclerView) this.b).au().f();
                Object obj5 = this.a;
                ((qgq) obj5).e = false;
                ((lt) obj5).g();
                return;
            case 9:
                ((ype) DemandClientService.a.l().ai((char) 7267)).u("openDemandSpace");
                DemandClientService demandClientService = (DemandClientService) this.a;
                if (demandClientService.b.m()) {
                    Object obj6 = this.b;
                    if (obj6 != null) {
                        Bundle bundle = (Bundle) obj6;
                        if (bundle.getBoolean("gmm_transcription_request", false)) {
                            demandClientService.b.l(DemandClientService.b(bundle));
                            return;
                        }
                    }
                    demandClientService.b.k(DemandClientService.b((Bundle) obj6));
                    return;
                }
                return;
            case 10:
                ((ype) DemandClientService.a.l().ai((char) 7270)).u("unregisterCallbacks");
                ?? r02 = this.a;
                qhs qhsVar = (qhs) ((DemandClientService) this.b).d.get(r02.asBinder());
                if (qhsVar != null) {
                    qhsVar.a();
                    return;
                }
                return;
            case 11:
                ((DemandClientService) this.b).a(this.a);
                return;
            case 12:
                Object obj7 = this.a;
                qiv qivVar = ((qis) obj7).a;
                qivVar.f = this.b;
                qivVar.c.b(2);
                qivVar.b.post(new qct(obj7, 19));
                return;
            case 13:
                qiv qivVar2 = ((qis) this.a).a;
                NotificationListenerService.RankingMap rankingMap = (NotificationListenerService.RankingMap) this.b;
                qivVar2.e = rankingMap;
                ajmd.w(rankingMap);
                return;
            case 14:
                Object obj8 = ((qiu) this.a).a;
                NotificationListenerService.RankingMap rankingMap2 = (NotificationListenerService.RankingMap) this.b;
                ((qiv) obj8).e = rankingMap2;
                ajmd.w(rankingMap2);
                return;
            case 15:
                int i = qke.a;
                lwg.a().c((String) this.b, (String) this.a);
                return;
            case 16:
                moa moaVar = ((qkk) this.b).g;
                if (moaVar != null) {
                    ((qkn) ((ykd) this.a).a).e(moaVar);
                    return;
                }
                return;
            case 17:
                qlc qlcVar = (qlc) this.b;
                qlcVar.a.a(qlcVar);
                Iterator it = ((qlk) this.a).c.iterator();
                while (it.hasNext()) {
                    ((qll) it.next()).a();
                }
                spu.aq("deliver should be called from worker thread");
                spu.an(qlcVar.b, "Measurement must be submitted");
                List<qlm> list = qlcVar.h;
                if (list.isEmpty()) {
                    return;
                }
                HashSet hashSet = new HashSet();
                for (qlm qlmVar : list) {
                    Uri uriB = qlmVar.b();
                    if (!hashSet.contains(uriB)) {
                        hashSet.add(uriB);
                        qlmVar.e(qlcVar);
                    }
                }
                return;
            case 18:
                ((qmd) this.b).a.d((qna) this.a);
                return;
            case 19:
                qml qmlVar = ((qmk) this.b).b;
                if (qmlVar.v()) {
                    return;
                }
                qmlVar.p(3, "Connected to service after a timeout", null, null, null);
                Object obj9 = this.a;
                qlk.b();
                qmlVar.c = (qnb) obj9;
                qmlVar.e();
                qmd qmdVarH = qmlVar.h();
                qlk.b();
                qmdVarH.a.w();
                return;
            default:
                ((qmk) this.a).b.d((ComponentName) this.b);
                return;
        }
    }

    public /* synthetic */ qfa(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public qfa(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public qfa(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
