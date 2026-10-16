package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class som {
    public final android.accounts.Account a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final java.util.Map d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final defpackage.swe g;
    public java.lang.Integer h;

    public som(android.accounts.Account account, java.util.Set set, java.lang.String str, java.lang.String str2, defpackage.swe sweVar) {
        this.a = account;
        java.util.Set setUnmodifiableSet = set == null ? java.util.Collections.EMPTY_SET : j$.util.DesugarCollections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = sweVar;
        java.util.HashSet hashSet = new java.util.HashSet(setUnmodifiableSet);
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.erh) it.next()).a;
            hashSet.addAll(null);
        }
        this.c = j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }
}
