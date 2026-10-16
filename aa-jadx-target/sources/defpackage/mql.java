package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mql implements java.util.Comparator {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public mql(java.util.Comparator comparator, java.util.Comparator comparator2, int i) {
        this.c = i;
        this.a = comparator;
        this.b = comparator2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Comparator] */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        if (this.c != 0) {
            int iCompare = this.a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : this.b.compare(((defpackage.dec) obj).a, ((defpackage.dec) obj2).a);
        }
        mrd mrdVar = (mrd) obj;
        mrd mrdVar2 = (mrd) obj2;
        defpackage.nsn nsnVar = (defpackage.nsn) this.a;
        if (nsnVar.j()) {
            int iA = nsnVar.a(mrdVar.c.a());
            int iA2 = nsnVar.a(mrdVar2.c.a());
            if (iA != Integer.MAX_VALUE || iA2 != Integer.MAX_VALUE) {
                return java.lang.Integer.compare(iA, iA2);
            }
        }
        defpackage.mqj mqjVar = mrdVar.c;
        android.content.ComponentName componentName = defpackage.mkt.e;
        if (componentName.equals(mqjVar.a())) {
            return -1;
        }
        if (componentName.equals(mrdVar2.c.a())) {
            return 1;
        }
        mrd mrdVar3 = (mrd) this.b;
        if (mrdVar3.equals(mrdVar)) {
            return 1;
        }
        if (mrdVar3.equals(mrdVar2)) {
            return -1;
        }
        return mrdVar.f(mrdVar2);
    }

    public /* synthetic */ mql(defpackage.nsn nsnVar, mrd mrdVar, int i) {
        this.c = i;
        this.a = nsnVar;
        this.b = mrdVar;
    }
}
