package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ahcw {
    private final String className;
    final /* synthetic */ ahcx this$0;

    public ahcw(ahcx ahcxVar, String str) {
        str.getClass();
        this.this$0 = ahcxVar;
        this.className = str;
    }

    public static /* synthetic */ void function$default(ahcw ahcwVar, String str, String str2, afec afecVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ahcwVar.function(str, str2, afecVar);
    }

    public final void function(String str, String str2, afec<? super ahcv, afak> afecVar) {
        str.getClass();
        afecVar.getClass();
        Map map = this.this$0.signatures;
        ahcv ahcvVar = new ahcv(this, str, str2);
        afecVar.invoke(ahcvVar);
        aezu<String, ahco> aezuVarBuild = ahcvVar.build();
        map.put(aezuVarBuild.a, aezuVarBuild.b);
    }

    public final String getClassName() {
        return this.className;
    }
}
