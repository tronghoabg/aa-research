package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dfc implements dff {
    public final deu a;
    public final List b;
    public final List c;
    private final aezr d = woy.dH(3, new deh(this, 2));
    private final aezr e = woy.dH(3, new deh(this, 3));

    public dfc(deu deuVar, dfw dfwVar, List list, dlg dlgVar, wci wciVar) {
        int i;
        String strSubstring;
        int i2;
        int i3;
        List list2;
        int i4;
        deu deuVar2 = deuVar;
        dfw dfwVar2 = dfwVar;
        this.a = deuVar2;
        this.b = list;
        dfg dfgVar = dfwVar2.c;
        deu deuVar3 = dev.a;
        List list3 = deuVar2.d;
        List listCc = list3 != null ? woy.cc(list3, new azl(5)) : afbe.a;
        ArrayList arrayList = new ArrayList();
        afaz afazVar = new afaz();
        int size = listCc.size();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            det detVar = (det) listCc.get(i6);
            det detVarA = det.a(detVar, dfgVar.a((dfg) detVar.a), i5, 14);
            while (true) {
                i4 = detVarA.b;
                if (i7 >= i4 || afazVar.isEmpty()) {
                    break;
                }
                det detVar2 = (det) afazVar.e();
                int i8 = detVarA.b;
                int i9 = detVar2.c;
                if (i8 < i9) {
                    arrayList.add(new det(detVar2.a, i7, i8, ""));
                    i7 = detVarA.b;
                } else {
                    arrayList.add(new det(detVar2.a, i7, i9, ""));
                    i7 = detVar2.c;
                    while (!afazVar.isEmpty() && i7 == ((det) afazVar.e()).c) {
                        afazVar.removeLast();
                    }
                }
            }
            if (i7 < i4) {
                arrayList.add(new det(dfgVar, i7, i4, ""));
                i7 = detVarA.b;
            }
            det detVar3 = (det) afazVar.f();
            if (detVar3 != null) {
                int i10 = detVar3.b;
                if (i10 == detVarA.b && detVar3.c == detVarA.c) {
                    afazVar.removeLast();
                    afazVar.addLast(new det(((dfg) detVar3.a).a((dfg) detVarA.a), detVarA.b, detVarA.c, ""));
                } else {
                    int i11 = detVar3.c;
                    if (i10 == i11) {
                        arrayList.add(new det(detVar3.a, i10, i11, ""));
                        afazVar.removeLast();
                        afazVar.addLast(new det(detVarA.a, detVarA.b, detVarA.c, ""));
                    } else {
                        if (i11 < detVarA.c) {
                            throw new IllegalArgumentException();
                        }
                        afazVar.addLast(new det(((dfg) detVar3.a).a((dfg) detVarA.a), detVarA.b, detVarA.c, ""));
                    }
                }
            } else {
                afazVar.addLast(new det(detVarA.a, detVarA.b, detVarA.c, ""));
            }
            i6++;
            i5 = 0;
        }
        while (i7 <= deuVar2.b.length() && !afazVar.isEmpty()) {
            det detVar4 = (det) afazVar.e();
            arrayList.add(new det(detVar4.a, i7, detVar4.c, ""));
            i7 = detVar4.c;
            while (!afazVar.isEmpty() && i7 == ((det) afazVar.e()).c) {
                afazVar.removeLast();
            }
        }
        if (i7 < deuVar2.b.length()) {
            arrayList.add(new det(dfgVar, i7, deuVar2.b.length(), ""));
        }
        if (arrayList.isEmpty()) {
            i = 0;
            arrayList.add(new det(dfgVar, 0, 0, ""));
        } else {
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i12 = i;
        while (i12 < size2) {
            det detVar5 = (det) arrayList.get(i12);
            int i13 = detVar5.b;
            int i14 = detVar5.c;
            if (i13 != i14) {
                strSubstring = deuVar2.b.substring(i13, i14);
                strSubstring.getClass();
            } else {
                strSubstring = "";
            }
            List listA = dev.a(deuVar2, i13, i14, new cyo(8));
            deu deuVar4 = new deu(strSubstring, listA == null ? afbe.a : listA);
            dfg dfgVar2 = (dfg) detVar5.a;
            if (dfgVar2.b == 0) {
                i2 = size2;
                i3 = i12;
                dfgVar2 = new dfg(dfgVar2.a, dfgVar.b, dfgVar2.c, dfgVar2.d, dfgVar2.e, dfgVar2.f, dfgVar2.g, dfgVar2.h, dfgVar2.i);
            } else {
                i2 = size2;
                i3 = i12;
            }
            String str = deuVar4.b;
            dfw dfwVar3 = new dfw(dfwVar2.b, dfwVar2.c.a(dfgVar2));
            List list4 = deuVar4.a;
            List list5 = list4 == null ? afbe.a : list4;
            List list6 = this.b;
            int i15 = detVar5.b;
            int i16 = detVar5.c;
            ArrayList arrayList3 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                int i18 = i17;
                det detVar6 = (det) list6.get(i17);
                dfg dfgVar3 = dfgVar;
                int i19 = detVar6.b;
                ArrayList arrayList4 = arrayList;
                int i20 = detVar6.c;
                boolean z = i19 < i16;
                if ((((i15 == i16) | (i19 == i20)) & (i15 == i19)) || ((i15 < i20) & z)) {
                    if (i15 > i19 || i20 > i16) {
                        dka.c("placeholder can not overlap with paragraph.");
                    }
                    list2 = list6;
                    arrayList3.add(new det(detVar6.a, detVar6.b - i15, detVar6.c - i15, ""));
                } else {
                    list2 = list6;
                }
                i17 = i18 + 1;
                list6 = list2;
                dfgVar = dfgVar3;
                arrayList = arrayList4;
            }
            arrayList2.add(new dfe(new dep(str, dfwVar3, list5, arrayList3, wciVar, dlgVar), detVar5.b, detVar5.c));
            i12 = i3 + 1;
            deuVar2 = deuVar;
            dfwVar2 = dfwVar;
            size2 = i2;
            dfgVar = dfgVar;
        }
        this.c = arrayList2;
    }

    @Override // defpackage.dff
    public final float a() {
        return ((Number) this.e.a()).floatValue();
    }

    @Override // defpackage.dff
    public final float b() {
        return ((Number) this.d.a()).floatValue();
    }

    @Override // defpackage.dff
    public final boolean c() {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dfe) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
