package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ajya implements ajuo {
    private final Map a;

    protected ajya(ajuh... ajuhVarArr) {
        this.a = new ConcurrentHashMap(ajuhVarArr.length);
        for (ajuh ajuhVar : ajuhVarArr) {
            this.a.put(ajuhVar.a(), ajuhVar);
        }
    }

    protected static String i(ajul ajulVar) {
        String str = ajulVar.c;
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return str;
        }
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return str.substring(0, iLastIndexOf);
    }

    @Override // defpackage.ajuo
    public void e(ajui ajuiVar, ajul ajulVar) throws ajut {
        ahgm.e(ajuiVar, "Cookie");
        Iterator it = g().iterator();
        while (it.hasNext()) {
            ((ajuj) it.next()).c(ajuiVar, ajulVar);
        }
    }

    @Override // defpackage.ajuo
    public boolean f(ajui ajuiVar, ajul ajulVar) {
        ahgm.e(ajuiVar, "Cookie");
        Iterator it = g().iterator();
        while (it.hasNext()) {
            if (!((ajuj) it.next()).d(ajuiVar, ajulVar)) {
                return false;
            }
        }
        return true;
    }

    protected final Collection g() {
        return this.a.values();
    }

    protected final ajuj h(String str) {
        return (ajuj) this.a.get(str);
    }

    protected List j(ajzy[] ajzyVarArr, ajul ajulVar) throws ajut {
        ArrayList arrayList = new ArrayList(ajzyVarArr.length);
        for (ajzy ajzyVar : ajzyVarArr) {
            String str = ajzyVar.a;
            String str2 = ajzyVar.b;
            if (!str.isEmpty()) {
                ajyc ajycVar = new ajyc(str, str2);
                ajycVar.d = i(ajulVar);
                ajycVar.j(ajulVar.a);
                ajpp[] ajppVarArrD = ajzyVar.d();
                int length = ajppVarArrD.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    ajpp ajppVar = ajppVarArrD[length];
                    String lowerCase = ajppVar.b().toLowerCase(Locale.ROOT);
                    ajycVar.o(lowerCase, ajppVar.c());
                    ajuj ajujVarH = h(lowerCase);
                    if (ajujVarH != null) {
                        ajujVarH.b(ajycVar, ajppVar.c());
                    }
                }
                arrayList.add(ajycVar);
            }
        }
        return arrayList;
    }

    public ajya() {
        this.a = new ConcurrentHashMap(10);
    }
}
