package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wdo {
    private volatile defpackage.wdi a;
    private defpackage.wdn b;

    public wdo(defpackage.wdi wdiVar) {
        this.a = wdiVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final defpackage.wdn a(defpackage.wba wbaVar) {
        defpackage.wdi wdiVar = this.a;
        defpackage.wdi wdiVar2 = defpackage.wdn.b;
        if (wdiVar != wdiVar2) {
            android.content.Context context = wbaVar.c;
            defpackage.wdm wdmVar = defpackage.wdn.a;
            boolean[] zArr = new boolean[1];
            defpackage.sjr sjrVar = (defpackage.sjr) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent((java.util.concurrent.ConcurrentMap) wdmVar.b, wdiVar.a(context), new defpackage.wdl(wbaVar, wdiVar, zArr, 0));
            if (zArr[0]) {
                defpackage.wem wemVar = wbaVar.f;
                boolean z = wdiVar.a;
                defpackage.zir zirVar = defpackage.zir.FILE;
                if (defpackage.way.c()) {
                    defpackage.web.a(context, null, new defpackage.wyz(wdmVar));
                } else if (z) {
                    wch wchVarB = wemVar.b();
                    if (wchVarB.e && new defpackage.abph(wchVarB.i, wch.a).contains(zirVar) && wchVarB.n) {
                        defpackage.web.a(context, null, new defpackage.wyz(wdmVar));
                    } else {
                        defpackage.web.a(context, new defpackage.wyz(wdmVar), new defpackage.wyz(wdmVar));
                    }
                } else {
                    defpackage.wcf wcfVarA = wemVar.a();
                    if (wcfVarA.e && new defpackage.abph(wcfVarA.j, defpackage.wcf.a).contains(zirVar) && wcfVarA.o) {
                        defpackage.web.a(context, null, new defpackage.wyz(wdmVar));
                    } else {
                        defpackage.web.a(context, new defpackage.wyz(wdmVar), new defpackage.wyz(wdmVar));
                    }
                }
                boolean z2 = wdiVar.c;
            }
            this.b = (defpackage.wdn) sjrVar.a;
            this.a = wdiVar2;
        }
        return this.b;
    }
}
