package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class teg {
    public final defpackage.teh a;
    public final defpackage.tel b;
    public final defpackage.tel c;
    public final defpackage.tem d;
    public final int e;
    public final defpackage.tei f;

    public teg(defpackage.teh tehVar, java.util.List list) {
        tehVar.getClass();
        list.getClass();
        this.a = tehVar;
        this.b = new defpackage.tel(false, "?1", "?2", "?3", "?4", "?5", "color");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.tef) it.next()).a);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        defpackage.tel telVar = new defpackage.tel(true, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        this.c = telVar;
        defpackage.tem temVar = new defpackage.tem(list);
        this.d = temVar;
        int i = this.b.a + 288 + telVar.a + temVar.c;
        this.e = i;
        this.f = new defpackage.tei((short) 512, (short) 288, i);
    }
}
