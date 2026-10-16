package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aidc {
    public static final aidb Companion = new aidb(null);
    private static final aidc DEFAULT_VISIBLE = new aidc(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    private final boolean isInvisible;
    private final List<String> poisoningFeatures;

    public aidc(boolean z, List<String> list) {
        list.getClass();
        this.isInvisible = z;
        this.poisoningFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aidc)) {
            return false;
        }
        aidc aidcVar = (aidc) obj;
        return this.isInvisible == aidcVar.isInvisible && affa.f(this.poisoningFeatures, aidcVar.poisoningFeatures);
    }

    public int hashCode() {
        return (aida.m(this.isInvisible) * 31) + this.poisoningFeatures.hashCode();
    }

    public String toString() {
        return "PreReleaseInfo(isInvisible=" + this.isInvisible + ", poisoningFeatures=" + this.poisoningFeatures + ')';
    }

    public /* synthetic */ aidc(boolean z, List list, int i, afeu afeuVar) {
        this(z, (i & 2) != 0 ? afbe.a : list);
    }
}
