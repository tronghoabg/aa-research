package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azh<T> implements java.util.Comparator {
    final /* synthetic */ defpackage.sns a;
    private final /* synthetic */ int b;

    public azh(defpackage.sns snsVar, int i) {
        this.b = i;
        this.a = snsVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.b;
        if (i == 0) {
            java.lang.Object obj3 = ((defpackage.axp) obj).e;
            defpackage.sns snsVar = this.a;
            return java.lang.Integer.valueOf(snsVar.b(obj3)).compareTo(java.lang.Integer.valueOf(snsVar.b(((defpackage.axp) obj2).e)));
        }
        if (i == 1) {
            java.lang.Object obj4 = ((defpackage.axp) obj).e;
            defpackage.sns snsVar2 = this.a;
            return java.lang.Integer.valueOf(snsVar2.b(obj4)).compareTo(java.lang.Integer.valueOf(snsVar2.b(((defpackage.axp) obj2).e)));
        }
        if (i != 2) {
            java.lang.Object obj5 = ((defpackage.axp) obj2).e;
            defpackage.sns snsVar3 = this.a;
            return java.lang.Integer.valueOf(snsVar3.b(obj5)).compareTo(java.lang.Integer.valueOf(snsVar3.b(((defpackage.axp) obj).e)));
        }
        java.lang.Object obj6 = ((defpackage.axp) obj2).e;
        defpackage.sns snsVar4 = this.a;
        return java.lang.Integer.valueOf(snsVar4.b(obj6)).compareTo(java.lang.Integer.valueOf(snsVar4.b(((defpackage.axp) obj).e)));
    }
}
