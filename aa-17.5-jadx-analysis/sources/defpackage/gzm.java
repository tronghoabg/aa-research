package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.apps.auto.client.activity.ghost.GhostActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class gzm implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gzm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.companion.virtual.VirtualDeviceManager$ActivityListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v42, types: [afec, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        int i = 0;
        switch (this.b) {
            case 0:
                ((gzp) this.a).e.b();
                return afak.a;
            case 1:
                ((gzp) this.a).e.a();
                return afak.a;
            case 2:
                ((gzp) this.a).e.b();
                return afak.a;
            case 3:
                ((gzp) this.a).e.a();
                return afak.a;
            case 4:
                return ((axr) this.a).l().j;
            case 5:
                List list = ((axr) this.a).l().j;
                ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((axk) it.next()).a));
                }
                return arrayList;
            case 6:
                return Boolean.valueOf(((axr) this.a).i());
            case 7:
                axr axrVar = (axr) this.a;
                return new aezu(Integer.valueOf(axrVar.b()), Integer.valueOf(axrVar.c()));
            case 8:
                return Boolean.valueOf(((axr) this.a).i());
            case 9:
                afdr afdrVar = ((hah) this.a).e;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                return afak.a;
            case 10:
                this.a.invoke(hmi.b);
                return afak.a;
            case 11:
                hmw hmwVar = (hmw) this.a;
                hmwVar.d.d(hmwVar.c);
                return afak.a;
            case 12:
                return new ijj(this.a, 0);
            case 13:
                return new Surface(((usw) this.a).f());
            case 14:
                Object obj = this.a;
                usw uswVar = (usw) obj;
                Object objInvoke = uswVar.h.invoke();
                iph iphVar = (iph) objInvoke;
                iphVar.l(0);
                zfq zfqVar = zfq.a;
                iphVar.d(uswVar.e, new zhb(zfqVar));
                yop yopVarL = ipd.a.l();
                ?? r6 = uswVar.d;
                yopVarL.y("Adding intent interceptors for %s", r6);
                for (IntentFilter intentFilter : r6) {
                    ipc ipcVar = new ipc(obj, i);
                    iphVar.f(intentFilter, new zhb(zfqVar), ipcVar);
                    uswVar.b.add(ipcVar);
                }
                return objInvoke;
            case 15:
                ipf ipfVar = (ipf) this.a;
                return ipfVar.e.invoke(ipfVar.g);
            case 16:
                return ((ntn) this.a).a;
            case 17:
                GhostActivity ghostActivity = (GhostActivity) this.a;
                Parcelable parcelableExtra = ghostActivity.getIntent().getParcelableExtra("CarActivityServiceComponentName");
                if (parcelableExtra != null) {
                    return (ComponentName) parcelableExtra;
                }
                Bundle extras = ghostActivity.getIntent().getExtras();
                Objects.toString(extras);
                throw new IllegalArgumentException("Corresponding CarActivityService not specified in Intent! ".concat(String.valueOf(extras)));
            case 18:
                afdr afdrVar2 = ((fxl) this.a).c;
                if (afdrVar2 != null) {
                    afdrVar2.invoke();
                }
                return afak.a;
            case 19:
                afdr afdrVar3 = ((fxl) this.a).c;
                if (afdrVar3 != null) {
                    afdrVar3.invoke();
                }
                return afak.a;
            default:
                afdr afdrVar4 = ((fxn) this.a).b;
                if (afdrVar4 != null) {
                    afdrVar4.invoke();
                }
                return afak.a;
        }
    }
}
