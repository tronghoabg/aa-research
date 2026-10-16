package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajxh implements defpackage.ajts {
    @Override // defpackage.ajts
    public final long getKeepAliveDuration(defpackage.ajqj ajqjVar, defpackage.akca akcaVar) {
        defpackage.akaz akazVar = new defpackage.akaz(ajqjVar.o("Keep-Alive"));
        while (akazVar.hasNext()) {
            defpackage.akay akayVarA = akazVar.a();
            java.lang.String str = akayVarA.a;
            java.lang.String str2 = akayVarA.b;
            if (str2 != null && str.equalsIgnoreCase("timeout")) {
                try {
                    return java.lang.Long.parseLong(str2) * 1000;
                } catch (java.lang.NumberFormatException unused) {
                    continue;
                }
            }
        }
        return -1L;
    }
}
