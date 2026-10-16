package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pnn implements defpackage.pnm {
    private static final java.lang.String[] a = {"zb", "current_account_id", "current_account_name", "signout_reason", "bk_zb"};
    private final defpackage.pzc b;
    private final java.lang.Object c = new java.lang.Object();

    public pnn(defpackage.pzc pzcVar) {
        this.b = pzcVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0112  */
    /* JADX WARN: Code duplicated, block: B:33:0x0115 A[Catch: all -> 0x0138, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0031, B:8:0x0037, B:10:0x003b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:17:0x0053, B:18:0x0055, B:34:0x0117, B:37:0x011d, B:40:0x0127, B:41:0x012b, B:42:0x012e, B:44:0x0133, B:45:0x0136, B:20:0x009c, B:22:0x00a2, B:24:0x00a8, B:26:0x00b4, B:27:0x00c6, B:29:0x00cc, B:30:0x00de, B:33:0x0115), top: B:50:0x0003 }] */
    @Override // defpackage.pnm
    public final defpackage.abtc a() {
        defpackage.abtc abtcVar;
        android.content.SharedPreferences.Editor editorEdit;
        synchronized (this.c) {
            defpackage.pzc pzcVar = this.b;
            defpackage.pzf pzfVar = defpackage.pzf.U;
            defpackage.abtc abtcVar2 = defpackage.abtc.a;
            abtcVar = (defpackage.abtc) pzcVar.r(pzfVar, defpackage.abox.L(defpackage.abtc.class));
            android.content.SharedPreferences sharedPreferencesA = pzcVar.a();
            java.lang.String string = sharedPreferencesA.getString("zb", "");
            java.lang.String string2 = sharedPreferencesA.getString("current_account_id", "");
            if (string2.equals("*")) {
                string2 = defpackage.pnl.a.c;
            }
            if (abtcVar != null) {
                defpackage.abtb abtbVar = abtcVar.c;
                if (abtbVar == null) {
                    abtbVar = defpackage.abtb.a;
                }
                if (abtbVar.d.isEmpty() && !string.isEmpty()) {
                    defpackage.abor aborVarK = abtcVar.K();
                    defpackage.abtb abtbVar2 = abtcVar.c;
                    if (abtbVar2 == null) {
                        abtbVar2 = defpackage.abtb.a;
                    }
                    defpackage.abor aborVarK2 = abtbVar2.K();
                    aborVarK2.t();
                    defpackage.abtb abtbVar3 = (defpackage.abtb) aborVarK2.b;
                    string.getClass();
                    abtbVar3.b |= 2;
                    abtbVar3.d = string;
                    aborVarK.t();
                    defpackage.abtc abtcVar3 = (defpackage.abtc) aborVarK.b;
                    defpackage.abtb abtbVar4 = (defpackage.abtb) aborVarK2.q();
                    abtbVar4.getClass();
                    abtcVar3.c = abtbVar4;
                    abtcVar3.b |= 1;
                    abtcVar = (defpackage.abtc) aborVarK.q();
                    editorEdit = sharedPreferencesA.edit();
                    editorEdit.putString(pzfVar.toString(), pzcVar.b(abtcVar));
                } else if (abtcVar == null) {
                    editorEdit = null;
                    if (abtcVar == null) {
                        abtcVar = defpackage.abtc.a;
                    }
                } else {
                    editorEdit = null;
                    if (abtcVar == null) {
                        abtcVar = defpackage.abtc.a;
                    }
                }
            } else if (abtcVar == null || (string.isEmpty() && string2.isEmpty())) {
                editorEdit = null;
                if (abtcVar == null) {
                    abtcVar = defpackage.abtc.a;
                }
            } else {
                defpackage.abor aborVarN = defpackage.abtb.a.n();
                if (!string.isEmpty()) {
                    aborVarN.t();
                    defpackage.abtb abtbVar5 = (defpackage.abtb) aborVarN.b;
                    string.getClass();
                    abtbVar5.b |= 2;
                    abtbVar5.d = string;
                }
                if (!string2.isEmpty()) {
                    aborVarN.t();
                    defpackage.abtb abtbVar6 = (defpackage.abtb) aborVarN.b;
                    string2.getClass();
                    abtbVar6.b |= 1;
                    abtbVar6.c = string2;
                }
                defpackage.abor aborVarN2 = defpackage.abtc.a.n();
                aborVarN2.t();
                defpackage.abtc abtcVar4 = (defpackage.abtc) aborVarN2.b;
                defpackage.abtb abtbVar7 = (defpackage.abtb) aborVarN.q();
                abtbVar7.getClass();
                abtcVar4.c = abtbVar7;
                abtcVar4.b |= 1;
                abtcVar = (defpackage.abtc) aborVarN2.q();
                editorEdit = sharedPreferencesA.edit();
                editorEdit.putString(pzfVar.toString(), pzcVar.b(abtcVar));
            }
            java.lang.String[] strArr = a;
            for (int i = 0; i < 5; i++) {
                java.lang.String str = strArr[i];
                if (sharedPreferencesA.contains(str)) {
                    if (editorEdit == null) {
                        editorEdit = sharedPreferencesA.edit();
                    }
                    editorEdit.remove(str);
                }
            }
            if (editorEdit != null) {
                editorEdit.commit();
            }
        }
        return abtcVar;
    }

    @Override // defpackage.pnm
    public final boolean b(defpackage.xyn xynVar, defpackage.abtc abtcVar) {
        synchronized (this.c) {
            defpackage.abtc abtcVarA = a();
            if (!((defpackage.abox) ((defpackage.xys) xynVar).a).equals(abtcVarA)) {
                return false;
            }
            if (abtcVar.equals(abtcVarA)) {
                return true;
            }
            defpackage.pzc pzcVar = this.b;
            pzcVar.n(defpackage.pzf.U, abtcVar);
            return pzcVar.g();
        }
    }
}
