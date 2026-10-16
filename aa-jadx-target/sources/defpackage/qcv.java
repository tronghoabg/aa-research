package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qcv implements defpackage.xzi {
    private final /* synthetic */ int a;

    public qcv(int i) {
        this.a = i;
    }

    @Override // defpackage.xzi
    public final /* synthetic */ java.lang.Object fF() {
        int i = this.a;
        if (i == 0) {
            return new sbk((byte[]) null, 1);
        }
        if (i != 1) {
            return i != 2 ? java.net.ProxySelector.getDefault() : new defpackage.xzg();
        }
        int i2 = pod.b;
        vbn.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.you youVarListIterator = defpackage.ygw.r(aceu.c, aceu.d).listIterator(0);
        while (youVarListIterator.hasNext()) {
            aceu aceuVar = (aceu) youVarListIterator.next();
            pod.b(arrayList, aceuVar, false, false, 14.5f, 15.0f, 15.75f, 18.5f, 15.75f, 15.75f);
            pod.b(arrayList, aceuVar, true, false, 15.5f, 16.0f, 16.75f, 16.75f, 15.75f, 16.75f);
            pod.b(arrayList, aceuVar, false, true, 14.75f, 16.0f, 16.0f, 16.0f, 17.75f, 16.0f);
            pod.b(arrayList, aceuVar, true, true, 15.5f, 16.25f, 17.5f, 17.5f, 17.75f, 17.5f);
        }
        aceu aceuVar2 = aceu.b;
        pod.b(arrayList, aceuVar2, false, false, 15.0f, 16.25f, 17.25f, 18.5f, 17.25f, 17.25f);
        pod.b(arrayList, aceuVar2, true, false, 15.0f, 16.5f, 17.75f, 17.75f, 17.25f, 17.75f);
        pod.b(arrayList, aceuVar2, false, true, 15.0f, 17.75f, 17.75f, 17.75f, 17.75f, 17.75f);
        pod.b(arrayList, aceuVar2, true, true, 15.0f, 18.0f, 18.0f, 18.0f, 17.75f, 18.0f);
        return arrayList;
    }
}
