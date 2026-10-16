package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class wef extends BroadcastReceiver {
    private volatile kgx a;

    protected abstract void b(wec wecVar);

    protected abstract void c(Intent intent);

    protected spu d(Context context) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        Intent intent2 = intent;
        kgx kgxVar = this.a;
        if (kgxVar == null) {
            synchronized (this) {
                kgxVar = this.a;
                if (kgxVar == null) {
                    wec wecVar = new wec(getClass().getName());
                    b(wecVar);
                    String str = wecVar.a;
                    wecVar.b.d(true);
                    abos abosVar = new abos(str, wecVar.c, wecVar.d, wecVar.e);
                    if (d(context) == null) {
                        throw new NullPointerException("Null resultLogger");
                    }
                    kgx kgxVar2 = new kgx(abosVar, (byte[]) null);
                    this.a = kgxVar2;
                    kgxVar = kgxVar2;
                }
            }
        }
        if (!kgxVar.g()) {
            kgxVar.h();
        } else if (intent2 != null) {
            xya xyaVar = new xya(xvx.a);
            xyaVar.e();
            Bundle extras = intent2.getExtras();
            Collection collectionN = extras != null ? ygr.n(extras.keySet()) : yly.a;
            Object obj2 = kgxVar.a;
            if (!kgxVar.g()) {
                kgxVar.h();
            }
            zhe zheVar = new zhe(null);
            zheVar.f(yly.a);
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String action = intent2.getAction();
            abos abosVar2 = (abos) obj2;
            wed wedVar = (wed) abosVar2.c;
            kgx kgxVar3 = (kgx) wedVar.b.getOrDefault(action, wedVar.c);
            Intent intent3 = new Intent(intent2);
            if (intent2.getData() != null) {
                vuf.R("_DATA", arrayList, hashSet);
                intent3.setData(null);
            }
            if (intent2.getClipData() != null) {
                vuf.R("_CLIP_DATA", arrayList, hashSet);
                intent3.setClipData(null);
            }
            Bundle extras2 = intent2.getExtras();
            if (extras2 != null) {
                Object obj3 = kgxVar3.a;
                Bundle bundle = new Bundle();
                web webVar = (web) obj3;
                ygr ygrVar = webVar.c;
                if (!ygrVar.isEmpty()) {
                    bundle.putAll(extras2);
                    for (String str2 : extras2.keySet()) {
                        if (!ygrVar.contains(str2)) {
                            bundle.remove(str2);
                        }
                    }
                }
                yno it = ((yml) yrm.p(extras2.keySet(), ygrVar)).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    wea weaVar = (wea) webVar.b.get(str3);
                    if (weaVar == null) {
                        vuf.R(str3, arrayList, hashSet);
                    } else {
                        arrayList.add(str3);
                        weaVar.a();
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
                intent3.replaceExtras(bundle);
            }
            if (intent2.getSelector() != null) {
                vuf.R("_SELECTOR", arrayList, hashSet);
                intent3.setSelector(null);
            }
            zheVar.b = intent3;
            zheVar.f(ygr.n(hashSet));
            Object obj4 = zheVar.b;
            if (obj4 == null || (obj = zheVar.a) == null) {
                StringBuilder sb = new StringBuilder();
                if (zheVar.b == null) {
                    sb.append(" intent");
                }
                if (zheVar.a == null) {
                    sb.append(" removedExtras");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            wee weeVar = new wee((Intent) obj4, (ygr) obj);
            Object obj5 = abosVar2.d;
            ygr ygrVarN = ygr.n(collectionN);
            Duration durationC = xyaVar.c();
            if (durationC == null) {
                throw new NullPointerException("Null sanitizationTime");
            }
            wdy wdyVar = wdy.d;
            if (ygrVarN == null) {
                throw new IllegalStateException("Missing required properties:".concat(" originalExtras"));
            }
            wdz wdzVar = new wdz(weeVar, (String) obj5, ygrVarN, durationC, wdyVar);
            kgxVar.h();
            intent2 = wdzVar.a.a;
        }
        c(intent2);
    }
}
