package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ajyv extends ajya {
    static final String[] a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ajyv(String[] strArr, boolean z) {
        ajuh[] ajuhVarArr = new ajuh[7];
        ajuhVarArr[0] = new ajyx();
        ajuhVarArr[1] = new ajyu();
        ajuhVarArr[2] = new ajyy(1);
        ajuhVarArr[3] = new ajyf(0);
        ajuhVarArr[4] = new ajyh();
        ajuhVarArr[5] = new ajyf(1);
        ajuhVarArr[6] = new ajye(strArr != null ? (String[]) strArr.clone() : a);
        super(ajuhVarArr);
        this.b = z;
    }

    protected static final void l(akbh akbhVar, String str, String str2, int i) {
        akbhVar.f(str);
        akbhVar.f("=");
        if (str2 != null) {
            if (i <= 0) {
                akbhVar.f(str2);
                return;
            }
            akbhVar.e('\"');
            akbhVar.f(str2);
            akbhVar.e('\"');
        }
    }

    @Override // defpackage.ajuo
    public int a() {
        return 1;
    }

    @Override // defpackage.ajuo
    public final List b(List list) {
        ahgm.c(list, "List of cookies");
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, ajum.a);
            list = arrayList;
        }
        if (!this.b) {
            ArrayList arrayList2 = new ArrayList(list.size());
            for (ajui ajuiVar : list) {
                int iA = ajuiVar.a();
                akbh akbhVar = new akbh(40);
                akbhVar.f("Cookie: ");
                akbhVar.f("$Version=");
                akbhVar.f(Integer.toString(iA));
                akbhVar.f("; ");
                k(akbhVar, ajuiVar, iA);
                arrayList2.add(new akak(akbhVar));
            }
            return arrayList2;
        }
        int iA2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (ajui ajuiVar2 : list) {
            if (ajuiVar2.a() < iA2) {
                iA2 = ajuiVar2.a();
            }
        }
        akbh akbhVar2 = new akbh(list.size() * 40);
        akbhVar2.f("Cookie");
        akbhVar2.f(": ");
        akbhVar2.f("$Version=");
        akbhVar2.f(Integer.toString(iA2));
        for (ajui ajuiVar3 : list) {
            akbhVar2.f("; ");
            k(akbhVar2, ajuiVar3, iA2);
        }
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(new akak(akbhVar2));
        return arrayList3;
    }

    @Override // defpackage.ajuo
    public List c(ajoy ajoyVar, ajul ajulVar) throws ajut {
        ahgm.e(ajoyVar, "Header");
        if (ajoyVar.b().equalsIgnoreCase("Set-Cookie")) {
            return j(ajoyVar.a(), ajulVar);
        }
        throw new ajut(a.bW(ajoyVar, "Unrecognized cookie header '", "'"));
    }

    @Override // defpackage.ajuo
    public ajoy d() {
        return null;
    }

    @Override // defpackage.ajya, defpackage.ajuo
    public void e(ajui ajuiVar, ajul ajulVar) throws ajut {
        ahgm.e(ajuiVar, "Cookie");
        String strC = ajuiVar.c();
        if (strC.indexOf(32) != -1) {
            throw new ajun("Cookie name may not contain blanks");
        }
        if (strC.startsWith("$")) {
            throw new ajun("Cookie name may not start with $");
        }
        super.e(ajuiVar, ajulVar);
    }

    protected void k(akbh akbhVar, ajui ajuiVar, int i) {
        l(akbhVar, ajuiVar.c(), ajuiVar.e(), i);
        if (ajuiVar.d() != null && (ajuiVar instanceof ajyc) && ((ajyc) ajuiVar).p("path")) {
            akbhVar.f("; ");
            l(akbhVar, "$Path", ajuiVar.d(), i);
        }
        if (ajuiVar.b() != null && (ajuiVar instanceof ajyc) && ((ajyc) ajuiVar).p("domain")) {
            akbhVar.f("; ");
            l(akbhVar, "$Domain", ajuiVar.b(), i);
        }
    }

    public String toString() {
        return "rfc2109";
    }

    protected ajyv(boolean z, ajuh... ajuhVarArr) {
        super(ajuhVarArr);
        this.b = z;
    }
}
