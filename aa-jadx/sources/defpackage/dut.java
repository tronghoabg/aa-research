package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dut {
    public final java.lang.String a;
    public final java.lang.CharSequence b;
    public final java.lang.CharSequence[] c;
    public final boolean d;
    public final int e;
    public final android.os.Bundle f;
    public final java.util.Set g;

    public dut(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence[] charSequenceArr, boolean z, int i, android.os.Bundle bundle, java.util.Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = set;
        if (i == 2 && !z) {
            throw new java.lang.IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static android.app.RemoteInput[] a(defpackage.dut[] dutVarArr) {
        android.app.RemoteInput[] remoteInputArr = new android.app.RemoteInput[dutVarArr.length];
        for (int i = 0; i < dutVarArr.length; i++) {
            defpackage.dut dutVar = dutVarArr[i];
            android.app.RemoteInput.Builder builderAddExtras = new android.app.RemoteInput.Builder(dutVar.a).setLabel(dutVar.b).setChoices(dutVar.c).setAllowFreeFormInput(dutVar.d).addExtras(dutVar.f);
            java.util.Set set = dutVar.g;
            if (set != null) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    builderAddExtras.setAllowDataType((java.lang.String) it.next(), true);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                builderAddExtras.setEditChoicesBeforeSending(dutVar.e);
            }
            remoteInputArr[i] = builderAddExtras.build();
        }
        return remoteInputArr;
    }
}
