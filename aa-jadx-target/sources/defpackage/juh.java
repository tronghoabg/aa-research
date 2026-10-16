package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class juh implements defpackage.xyp {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ juh(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xyp
    public final boolean a(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                int i = juk.m;
                if (componentName != null) {
                    if (componentName.getPackageName().equals(this.a)) {
                        return true;
                    }
                }
                return false;
            case 1:
                defpackage.yqm yqmVar = defpackage.jmt.a;
                return ((android.bluetooth.BluetoothDevice) this.a).equals((android.bluetooth.BluetoothDevice) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i2 = defpackage.jyx.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i3 = defpackage.jza.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(((android.service.notification.StatusBarNotification) this.a).getPackageName());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return koc.d((android.content.Context) this.a, defpackage.xyn.h((android.bluetooth.BluetoothDevice) obj)).f();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar2 = defpackage.osc.a;
                return ((ozp) this.a).f((android.bluetooth.BluetoothDevice) obj, true);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                int i4 = defpackage.qik.a;
                if (resolveInfo.serviceInfo != null) {
                    java.lang.Object obj2 = this.a;
                    defpackage.rke rkeVar = defpackage.rke.b;
                    defpackage.rke rkeVar2 = (defpackage.rke) obj2;
                    defpackage.ysr.bn(rkeVar2.equals(rkeVar) || rkeVar2.equals(defpackage.rke.c), "Not allowed to filter services for carDisplayType: %s", obj2);
                    if (defpackage.kmv.c(rkeVar2.equals(rkeVar) ? defpackage.acvb.e() : defpackage.acvb.d(), new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name).flattenToString())) {
                        return true;
                    }
                }
                return false;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                abdv abdvVar = (abdv) obj;
                defpackage.aboj abojVar = abci.W;
                abdvVar.j(abojVar);
                defpackage.abon abonVar = abdvVar.w;
                defpackage.abow abowVar = abojVar.d;
                if (!abonVar.m(abowVar) || uxw.b(abdvVar)) {
                    return false;
                }
                abdvVar.j(abojVar);
                java.lang.Object objJ = abdvVar.w.j(abowVar);
                java.util.Iterator<E> it = ((abax) (objJ == null ? abojVar.b : abojVar.c(objJ))).b.iterator();
                while (it.hasNext()) {
                    tpa tpaVarE = tpa.e(((abaw) it.next()).c);
                    if (tpaVarE != null) {
                        if (((defpackage.yhx) this.a).contains(tpaVarE.f())) {
                            return false;
                        }
                    }
                }
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                abdv abdvVar2 = (abdv) obj;
                defpackage.aboj abojVar2 = abci.J;
                abdvVar2.j(abojVar2);
                java.lang.Object objJ2 = abdvVar2.w.j(abojVar2.d);
                long j = ((abyj) (objJ2 == null ? abojVar2.b : abojVar2.c(objJ2))).c;
                if (j != 0) {
                    if (((defpackage.yhx) this.a).contains(java.lang.Long.valueOf(j))) {
                        return true;
                    }
                }
                return false;
            default:
                abdv abdvVar3 = (abdv) obj;
                if ((abdvVar3.b & 8) != 0) {
                    int i5 = abdvVar3.i;
                    if (i5 != 1792 && i5 != 2792) {
                        return true;
                    }
                    abkp abkpVar = (abkp) this.a;
                    if (((abkpVar.b == 2 ? (abiv) abkpVar.c : abiv.a).b & 1) != 0) {
                        long j2 = (abkpVar.b == 2 ? (abiv) abkpVar.c : abiv.a).c;
                        defpackage.aboj abojVar3 = abci.V;
                        abdvVar3.j(abojVar3);
                        java.lang.Object objJ3 = abdvVar3.w.j(abojVar3.d);
                        if (j2 == ((abdg) (objJ3 == null ? abojVar3.b : abojVar3.c(objJ3))).g && abdvVar3.i != 2792) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
