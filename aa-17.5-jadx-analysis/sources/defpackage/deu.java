package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class deu implements CharSequence {
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    public deu(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                det detVar = (det) list.get(i);
                Object obj = detVar.a;
                if (obj instanceof dfm) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    detVar.getClass();
                    arrayList.add(detVar);
                } else if (obj instanceof dfg) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    detVar.getClass();
                    arrayList2.add(detVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listCc = arrayList2 != null ? woy.cc(arrayList2, new azl(4)) : null;
        if (listCc == null || listCc.isEmpty()) {
            return;
        }
        zf zfVarA = zg.a(((det) woy.bF(listCc)).c);
        int size2 = listCc.size();
        for (int i2 = 1; i2 < size2; i2++) {
            det detVar2 = (det) listCc.get(i2);
            while (true) {
                if (zfVarA.b == 0) {
                    break;
                }
                int iB = zfVarA.b();
                if (detVar2.b >= iB) {
                    zfVarA.f(zfVarA.b - 1);
                } else {
                    int i3 = detVar2.c;
                    if (i3 > iB) {
                        dka.c(a.bo(iB, i3, "Paragraph overlap not allowed, end ", " should be less than or equal to "));
                    }
                }
            }
            zfVarA.e(detVar2.c);
        }
    }

    public final int a() {
        return this.b.length();
    }

    public final deu b(afec afecVar) {
        des desVar = new des(this);
        List list = desVar.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, das.i((det) afecVar.invoke(((der) list.get(i)).a(Integer.MIN_VALUE))));
        }
        return desVar.b();
    }

    public final deu c(deu deuVar) {
        des desVar = new des(this);
        desVar.e(deuVar);
        return desVar.b();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final deu subSequence(int i, int i2) {
        if (i > i2) {
            dka.c(a.bB(i2, i, "start (", ") should be less or equal to end (", ")"));
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String strSubstring = this.b.substring(i, i2);
        strSubstring.getClass();
        List list = this.a;
        deu deuVar = dev.a;
        if (i > i2) {
            dka.c("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                det detVar = (det) list.get(i3);
                int i4 = detVar.b;
                int i5 = detVar.c;
                if ((((i == i2) | (i4 == i5)) & (i == i4)) | ((i4 < i2) & (i < i5))) {
                    arrayList2.add(new det(detVar.a, Math.max(i, i4) - i, Math.min(i2, i5) - i, detVar.d));
                }
                i3++;
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new deu(arrayList, strSubstring);
    }

    public final deu e(long j) {
        long j2 = dfv.a;
        long j3 = 4294967295L & j;
        int i = (int) (j >> 32);
        int i2 = (int) j3;
        return subSequence(Math.min(i, i2), Math.max(i, i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deu)) {
            return false;
        }
        deu deuVar = (deu) obj;
        return affa.f(this.b, deuVar.b) && affa.f(this.a, deuVar.a);
    }

    public final List f() {
        List list = this.c;
        return list == null ? afbe.a : list;
    }

    public final List g(int i) {
        List list = this.a;
        if (list == null) {
            return afbe.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            det detVar = (det) obj;
            if (detVar.a instanceof dez) {
                int i3 = detVar.b;
                int i4 = detVar.c;
                deu deuVar = dev.a;
                if ((((i3 == i4) | (i == 0)) & (i3 == 0)) | ((i4 > 0) & (i3 < i))) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final boolean h(int i) {
        List list = this.a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                det detVar = (det) list.get(i2);
                if (detVar.a instanceof dez) {
                    int i3 = detVar.b;
                    int i4 = detVar.c;
                    deu deuVar = dev.a;
                    if ((((i3 == i4) | (i == 0)) & (i3 == 0)) | ((i4 > 0) & (i3 < i))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ deu(String str) {
        this(str, afbe.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public deu(String str, List list, byte[] bArr) {
        this(true == list.isEmpty() ? null : list, str);
        deu deuVar = dev.a;
    }

    public deu(String str, List list) {
        this(true == list.isEmpty() ? null : list, str);
    }
}
