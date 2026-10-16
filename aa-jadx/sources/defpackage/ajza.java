package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajza implements defpackage.ajvo {
    private final java.util.Map a;

    protected ajza(defpackage.ajvh... ajvhVarArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap(ajvhVarArr.length);
        for (defpackage.ajvh ajvhVar : ajvhVarArr) {
            this.a.put(ajvhVar.a(), ajvhVar);
        }
    }

    protected static java.lang.String i(defpackage.ajvl ajvlVar) {
        java.lang.String str = ajvlVar.c;
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return str;
        }
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return str.substring(0, iLastIndexOf);
    }

    @Override // defpackage.ajvo
    public void e(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        defpackage.aguw.e(ajviVar, "Cookie");
        java.util.Iterator it = g().iterator();
        while (it.hasNext()) {
            ((defpackage.ajvj) it.next()).c(ajviVar, ajvlVar);
        }
    }

    @Override // defpackage.ajvo
    public boolean f(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) {
        defpackage.aguw.e(ajviVar, "Cookie");
        java.util.Iterator it = g().iterator();
        while (it.hasNext()) {
            if (!((defpackage.ajvj) it.next()).d(ajviVar, ajvlVar)) {
                return false;
            }
        }
        return true;
    }

    protected final java.util.Collection g() {
        return this.a.values();
    }

    protected final defpackage.ajvj h(java.lang.String str) {
        return (defpackage.ajvj) this.a.get(str);
    }

    protected java.util.List j(defpackage.akay[] akayVarArr, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        java.util.ArrayList arrayList = new java.util.ArrayList(akayVarArr.length);
        for (defpackage.akay akayVar : akayVarArr) {
            java.lang.String str = akayVar.a;
            java.lang.String str2 = akayVar.b;
            if (!str.isEmpty()) {
                defpackage.ajzc ajzcVar = new defpackage.ajzc(str, str2);
                ajzcVar.d = i(ajvlVar);
                ajzcVar.j(ajvlVar.a);
                defpackage.ajqp[] ajqpVarArrD = akayVar.d();
                int length = ajqpVarArrD.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    defpackage.ajqp ajqpVar = ajqpVarArrD[length];
                    java.lang.String lowerCase = ajqpVar.b().toLowerCase(java.util.Locale.ROOT);
                    ajzcVar.o(lowerCase, ajqpVar.c());
                    defpackage.ajvj ajvjVarH = h(lowerCase);
                    if (ajvjVarH != null) {
                        ajvjVarH.b(ajzcVar, ajqpVar.c());
                    }
                }
                arrayList.add(ajzcVar);
            }
        }
        return arrayList;
    }

    public ajza() {
        this.a = new j$.util.concurrent.ConcurrentHashMap(10);
    }
}
