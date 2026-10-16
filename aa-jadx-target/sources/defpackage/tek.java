package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tek {
    public final int a;
    public final defpackage.tel b = new defpackage.tel(false, new java.lang.String[0]);
    public final java.util.List c;
    public final defpackage.tei d;

    public tek(java.util.Map map) {
        this.a = map.size();
        int i = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.teh tehVar = (defpackage.teh) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.size() > 1) {
                defpackage.afga.am(list, new defpackage.azq(10));
            }
            arrayList.add(new defpackage.teg(tehVar, list));
        }
        this.c = arrayList;
        int i2 = this.b.a + 12;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i += ((defpackage.teg) it.next()).e;
        }
        this.d = new defpackage.tei((short) 2, (short) 12, i2 + i);
    }
}
