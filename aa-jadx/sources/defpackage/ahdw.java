package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahdw {
    private final java.lang.String className;
    final /* synthetic */ defpackage.ahdx this$0;

    public ahdw(defpackage.ahdx ahdxVar, java.lang.String str) {
        str.getClass();
        this.this$0 = ahdxVar;
        this.className = str;
    }

    public static /* synthetic */ void function$default(defpackage.ahdw ahdwVar, java.lang.String str, java.lang.String str2, defpackage.affc affcVar, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ahdwVar.function(str, str2, affcVar);
    }

    public final void function(java.lang.String str, java.lang.String str2, defpackage.affc<? super defpackage.ahdv, defpackage.afbk> affcVar) {
        str.getClass();
        affcVar.getClass();
        java.util.Map map = this.this$0.signatures;
        defpackage.ahdv ahdvVar = new defpackage.ahdv(this, str, str2);
        affcVar.invoke(ahdvVar);
        defpackage.afau<java.lang.String, defpackage.ahdo> afauVarBuild = ahdvVar.build();
        map.put(afauVarBuild.a, afauVarBuild.b);
    }

    public final java.lang.String getClassName() {
        return this.className;
    }
}
