package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class wfd extends android.content.BroadcastReceiver {
    private volatile defpackage.khb a;

    protected abstract void b(defpackage.wfa wfaVar);

    protected abstract void c(android.content.Intent intent);

    protected defpackage.sqs d(android.content.Context context) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.Object obj;
        android.content.Intent intent2 = intent;
        defpackage.khb khbVar = this.a;
        if (khbVar == null) {
            synchronized (this) {
                khbVar = this.a;
                if (khbVar == null) {
                    defpackage.wfa wfaVar = new defpackage.wfa(getClass().getName());
                    b(wfaVar);
                    java.lang.String str = wfaVar.a;
                    wfaVar.b.d(true);
                    defpackage.abpu abpuVar = new defpackage.abpu(str, wfaVar.c, wfaVar.d, wfaVar.e);
                    if (d(context) == null) {
                        throw new java.lang.NullPointerException("Null resultLogger");
                    }
                    defpackage.khb khbVar2 = new defpackage.khb(abpuVar, (byte[]) null);
                    this.a = khbVar2;
                    khbVar = khbVar2;
                }
            }
        }
        if (!khbVar.d()) {
            khbVar.e();
        } else if (intent2 != null) {
            defpackage.xzg xzgVar = new defpackage.xzg(defpackage.xxd.a);
            xzgVar.e();
            android.os.Bundle extras = intent2.getExtras();
            java.util.Collection collectionN = extras != null ? defpackage.yhx.n(extras.keySet()) : defpackage.ynd.a;
            java.lang.Object obj2 = khbVar.a;
            if (!khbVar.d()) {
                khbVar.e();
            }
            wfz wfzVar = new wfz();
            wfzVar.b(defpackage.ynd.a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.String action = intent2.getAction();
            defpackage.abpu abpuVar2 = (defpackage.abpu) obj2;
            defpackage.wfb wfbVar = (defpackage.wfb) abpuVar2.c;
            defpackage.khb khbVar3 = (defpackage.khb) wfbVar.b.getOrDefault(action, wfbVar.c);
            android.content.Intent intent3 = new android.content.Intent(intent2);
            if (intent2.getData() != null) {
                vvb.Q("_DATA", arrayList, hashSet);
                intent3.setData(null);
            }
            if (intent2.getClipData() != null) {
                vvb.Q("_CLIP_DATA", arrayList, hashSet);
                intent3.setClipData(null);
            }
            android.os.Bundle extras2 = intent2.getExtras();
            if (extras2 != null) {
                java.lang.Object obj3 = khbVar3.a;
                android.os.Bundle bundle = new android.os.Bundle();
                defpackage.wez wezVar = (defpackage.wez) obj3;
                defpackage.yhx yhxVar = wezVar.c;
                if (!yhxVar.isEmpty()) {
                    bundle.putAll(extras2);
                    for (java.lang.String str2 : extras2.keySet()) {
                        if (!yhxVar.contains(str2)) {
                            bundle.remove(str2);
                        }
                    }
                }
                defpackage.yot yotVarC = defpackage.ysr.p(extras2.keySet(), yhxVar).c();
                while (yotVarC.hasNext()) {
                    java.lang.String str3 = (java.lang.String) yotVarC.next();
                    wey weyVar = (wey) wezVar.b.get(str3);
                    if (weyVar == null) {
                        vvb.Q(str3, arrayList, hashSet);
                    } else {
                        arrayList.add(str3);
                        weyVar.a();
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
                intent3.replaceExtras(bundle);
            }
            if (intent2.getSelector() != null) {
                vvb.Q("_SELECTOR", arrayList, hashSet);
                intent3.setSelector(null);
            }
            wfzVar.b = intent3;
            wfzVar.b(defpackage.yhx.n(hashSet));
            java.lang.Object obj4 = wfzVar.b;
            if (obj4 == null || (obj = wfzVar.a) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (wfzVar.b == null) {
                    sb.append(" intent");
                }
                if (wfzVar.a == null) {
                    sb.append(" removedExtras");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            wfc wfcVar = new wfc((android.content.Intent) obj4, (defpackage.yhx) obj);
            java.lang.Object obj5 = abpuVar2.d;
            defpackage.yhx yhxVarN = defpackage.yhx.n(collectionN);
            j$.time.Duration durationC = xzgVar.c();
            if (durationC == null) {
                throw new java.lang.NullPointerException("Null sanitizationTime");
            }
            wew wewVar = wew.d;
            if (yhxVarN == null) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(" originalExtras"));
            }
            wex wexVar = new wex(wfcVar, (java.lang.String) obj5, yhxVarN, durationC, wewVar);
            khbVar.e();
            intent2 = wexVar.a.a;
        }
        c(intent2);
    }
}
