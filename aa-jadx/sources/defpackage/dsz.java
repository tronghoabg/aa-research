package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dsz {
    public int a;
    public boolean b;
    private final androidx.core.graphics.drawable.IconCompat c;
    private final java.lang.CharSequence d;
    private final android.app.PendingIntent e;
    private boolean f;
    private final android.os.Bundle g;
    private java.util.ArrayList h;
    private boolean i;

    private dsz(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle) {
        this.f = true;
        this.i = true;
        this.c = iconCompat;
        this.d = defpackage.dte.c(charSequence);
        this.e = pendingIntent;
        this.g = bundle;
        this.h = null;
        this.f = true;
        this.a = 0;
        this.i = true;
        this.b = false;
    }

    public final defpackage.dta a() {
        java.lang.CharSequence[] charSequenceArr;
        java.util.Set set;
        if (this.b && this.e == null) {
            throw new java.lang.NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                defpackage.dut dutVar = (defpackage.dut) arrayList3.get(i);
                if (dutVar.d || (!((charSequenceArr = dutVar.c) == null || charSequenceArr.length == 0) || (set = dutVar.g) == null || set.isEmpty())) {
                    arrayList2.add(dutVar);
                } else {
                    arrayList.add(dutVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new defpackage.dta(this.c, this.d, this.e, this.g, arrayList2.isEmpty() ? null : (defpackage.dut[]) arrayList2.toArray(new defpackage.dut[arrayList2.size()]), this.f, this.a, this.i, this.b, 0, 0, false);
    }

    public final void b(defpackage.dut dutVar) {
        java.util.ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.h = arrayList;
        }
        arrayList.add(dutVar);
    }

    public final void c() {
        this.i = false;
    }

    public dsz(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new android.os.Bundle());
    }

    public dsz(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(i != 0 ? androidx.core.graphics.drawable.IconCompat.n(null, "", i) : null, charSequence, pendingIntent, new android.os.Bundle());
    }
}
