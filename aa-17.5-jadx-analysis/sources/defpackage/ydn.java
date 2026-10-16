package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class ydn implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b = "";

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ydn ydnVar) {
        if (ydnVar == ydm.a) {
            return 1;
        }
        if (ydnVar == ydk.a) {
            return -1;
        }
        Comparable comparable = ydnVar.b;
        ylp ylpVar = ylp.a;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof ydl, ydnVar instanceof ydl);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ydn) {
            try {
                if (compareTo((ydn) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
