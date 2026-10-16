package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class euy implements Comparable {
    public final euz a;
    public final Bundle b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final int f;

    public euy(euz euzVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = euzVar;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(euy euyVar) {
        euyVar.getClass();
        if (this.c) {
            if (!euyVar.c) {
                return 1;
            }
        } else if (euyVar.c) {
            return -1;
        }
        int i = this.d - euyVar.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = this.b;
        if (bundle != null && euyVar.b == null) {
            return 1;
        }
        if (bundle == null && euyVar.b != null) {
            return -1;
        }
        if (bundle != null) {
            Bundle bundle2 = euyVar.b;
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
            if (!euyVar.e) {
                return 1;
            }
        } else if (euyVar.e) {
            return -1;
        }
        return this.f - euyVar.f;
    }
}
