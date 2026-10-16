package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tem {
    public final int a;
    public final defpackage.tei b;
    public final int c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    private final int g;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    public tem(java.util.List list) {
        int i = ((char) ((defpackage.tef) list.get(list.size() - 1)).e) + 1;
        this.a = i;
        int i2 = (i * 4) + 16;
        this.g = i2;
        this.b = new defpackage.tei((short) 514, (short) 16, i2);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.afbh(((defpackage.tef) it.next()).e));
        }
        this.d = defpackage.afga.bf(arrayList);
        int i3 = this.a;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = true != this.d.contains(new defpackage.afbh((short) i4)) ? 0 : 1073741824;
        }
        this.e = iArr;
        defpackage.tem temVar = new defpackage.tem(list, this.d, this.a);
        this.f = temVar;
        this.c = this.g + temVar.g;
    }

    public tem(java.util.List list, java.util.Set set, int i) {
        int i2;
        this.c = i;
        byte[] bArr = new byte[64];
        bArr[0] = 64;
        this.f = bArr;
        int[] iArr = new int[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (set.contains(new defpackage.afbh((short) i3))) {
                i2 = i4 + 16;
            } else {
                i2 = i4;
                i4 = -1;
            }
            iArr[i3] = i4;
            i3++;
            i4 = i2;
        }
        this.d = iArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
        int i5 = 0;
        for (java.lang.Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                defpackage.afga.ai();
            }
            arrayList.add(new defpackage.tej(i5, ((defpackage.tef) obj).b));
            i5 = i6;
        }
        defpackage.tej[] tejVarArr = (defpackage.tej[]) arrayList.toArray(new defpackage.tej[0]);
        this.e = tejVarArr;
        int length = (((int[]) this.d).length * 4) + 84;
        this.a = length;
        int length2 = length + (tejVarArr.length * 16);
        this.g = length2;
        this.b = new defpackage.tei((short) 513, (short) 84, length2);
    }
}
