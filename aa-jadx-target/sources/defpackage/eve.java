package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eve implements java.lang.Comparable {
    public final defpackage.evf a;
    public final android.os.Bundle b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final int f;

    public eve(defpackage.evf evfVar, android.os.Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = evfVar;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.eve eveVar) {
        eveVar.getClass();
        if (this.c) {
            if (!eveVar.c) {
                return 1;
            }
        } else if (eveVar.c) {
            return -1;
        }
        int i = this.d - eveVar.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        android.os.Bundle bundle = this.b;
        if (bundle != null && eveVar.b == null) {
            return 1;
        }
        if (bundle == null && eveVar.b != null) {
            return -1;
        }
        if (bundle != null) {
            android.os.Bundle bundle2 = eveVar.b;
            int size = bundle.size();
            bundle2.getClass();
            int size2 = size - bundle2.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        if (this.e) {
            if (!eveVar.e) {
                return 1;
            }
        } else if (eveVar.e) {
            return -1;
        }
        return this.f - eveVar.f;
    }
}
