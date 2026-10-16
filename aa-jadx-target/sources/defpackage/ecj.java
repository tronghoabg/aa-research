package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ecj extends android.view.WindowInsetsAnimation.Callback {
    private final defpackage.ece a;
    private java.util.List b;
    private java.util.ArrayList c;
    private final java.util.HashMap d;

    public ecj(defpackage.ece eceVar) {
        super(eceVar.f);
        this.d = new java.util.HashMap();
        this.a = eceVar;
    }

    private final defpackage.kwv a(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        java.util.HashMap map = this.d;
        defpackage.kwv kwvVar = (defpackage.kwv) map.get(windowInsetsAnimation);
        if (kwvVar != null) {
            return kwvVar;
        }
        defpackage.kwv kwvVar2 = new defpackage.kwv(windowInsetsAnimation);
        map.put(windowInsetsAnimation, kwvVar2);
        return kwvVar2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
        java.util.ArrayList arrayList = this.c;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            this.c = arrayList2;
            this.b = j$.util.DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.a.b(defpackage.edf.q(windowInsets, null), this.b).e();
            }
            android.view.WindowInsetsAnimation windowInsetsAnimationM = bgp$.ExternalSyntheticApiModelOutline0.m(list.get(size));
            defpackage.kwv kwvVarA = a(windowInsetsAnimationM);
            kwvVarA.H(bgp$.ExternalSyntheticApiModelOutline0.m(windowInsetsAnimationM));
            this.c.add(kwvVarA);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
        ecd ecdVarC = this.a.c(a(windowInsetsAnimation), new ecd(bounds));
        return new android.view.WindowInsetsAnimation.Bounds(ecdVarC.a.a(), ecdVarC.b.a());
    }
}
