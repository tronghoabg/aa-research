package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.apps.auto.components.widgets.EarthPickerActivity;
import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ooq implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ooq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [bwq, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.a.b(Boolean.valueOf(false));
                return afak.a;
            case 1:
                ((axr) this.a).j(0, 0);
                return afak.a;
            case 2:
                Object obj = this.a;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    activity.finish();
                }
                return afak.a;
            case 3:
                this.a.b(Boolean.valueOf(false));
                return afak.a;
            case 4:
                this.a.b(Boolean.valueOf(false));
                return afak.a;
            case 5:
                ((EarthPickerActivity) this.a).finish();
                return afak.a;
            case 6:
                Application application = ((EarthPickerActivity) this.a).getApplication();
                application.getClass();
                return new opw(application, 0);
            case 7:
                this.a.invoke(opj.a);
                return afak.a;
            case 8:
                this.a.invoke(opj.b);
                return afak.a;
            case 9:
                this.a.invoke();
                return afak.a;
            case 10:
                this.a.b(Boolean.valueOf(false));
                return afak.a;
            case 11:
                this.a.b(Float.valueOf(1.0f));
                return afak.a;
            case 12:
                return ((opr) this.a).d.getSharedPreferences("widget_stack_prefs", 0);
            case 13:
                return ((PowerManager) ((pdy) this.a).d.getSystemService(PowerManager.class)).newWakeLock(1, "com.google.android.projection.gearhead:WPP-RFCOMM");
            case 14:
                Object obj2 = this.a;
                int i = pho.c;
                return Boolean.valueOf(Objects.equals(Looper.myLooper(), obj2));
            case 15:
                return Boolean.valueOf(lws.Q(((GmmAccount) this.a).getC()));
            case 16:
                tcs tcsVar = (tcs) this.a;
                return new tcu(tcsVar, tcsVar.a.keySet());
            case 17:
                tcs tcsVar2 = (tcs) this.a;
                return new tck(tcsVar2, tcsVar2.a.values());
            case 18:
                tcs tcsVar3 = (tcs) this.a;
                Set setEntrySet = tcsVar3.a.entrySet();
                ArrayList arrayList = new ArrayList(woy.bp(setEntrySet, 10));
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(new tcp(tcsVar3, (Map.Entry) it.next()));
                }
                return new tcr(woy.ck(arrayList), setEntrySet, tcsVar3);
            case 19:
                ((ajab) ((ncp) this.a).c).d(true);
                return afak.a;
            default:
                return new tjj(((thw) this.a).b);
        }
    }
}
