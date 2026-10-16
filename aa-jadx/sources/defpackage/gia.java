package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gia {
    public static final defpackage.gia a;
    public static final defpackage.gia b;
    public static final defpackage.gia c;
    public static final defpackage.gia d;
    private static final defpackage.gia i;
    public final int e;
    public final int f;
    public final java.util.Set g;
    public final java.util.Set h;

    static {
        defpackage.ghz ghzVar = new defpackage.ghz();
        ghzVar.a = 2;
        defpackage.gia giaVar = new defpackage.gia(ghzVar);
        i = giaVar;
        defpackage.ghz ghzVar2 = new defpackage.ghz();
        ghzVar2.a = 1;
        new defpackage.gia(ghzVar2);
        defpackage.ghz ghzVar3 = new defpackage.ghz(giaVar);
        ghzVar3.b = 1;
        a = new defpackage.gia(ghzVar3);
        defpackage.ghz ghzVar4 = new defpackage.ghz(giaVar);
        ghzVar4.a = 4;
        ghzVar4.b = 4;
        b = new defpackage.gia(ghzVar4);
        defpackage.ghz ghzVar5 = new defpackage.ghz(giaVar);
        ghzVar5.a = 4;
        c = new defpackage.gia(ghzVar5);
        defpackage.ghz ghzVar6 = new defpackage.ghz(giaVar);
        ghzVar6.a = 2;
        d = new defpackage.gia(ghzVar6);
    }

    private gia(defpackage.ghz ghzVar) {
        int i2 = ghzVar.a;
        this.e = i2;
        this.f = ghzVar.b;
        java.util.HashSet hashSet = new java.util.HashSet(ghzVar.c);
        this.g = hashSet;
        if (!ghzVar.d.isEmpty()) {
            java.util.HashSet hashSet2 = new java.util.HashSet(ghzVar.d);
            hashSet2.retainAll(hashSet);
            if (!hashSet2.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Disallowed action types cannot also be in the required set.");
            }
        }
        this.h = new java.util.HashSet(ghzVar.d);
        if (hashSet.size() > i2) {
            throw new java.lang.IllegalArgumentException("Required action types exceeded max allowed actions.");
        }
    }
}
