package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;

/* loaded from: classes.dex */
public final class wce {
    public final ExperimentTokens a;
    public final String b;

    public wce(ExperimentTokens experimentTokens, String str) {
        str.getClass();
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wce)) {
            return false;
        }
        wce wceVar = (wce) obj;
        return affa.f(this.a, wceVar.a) && affa.f(this.b, wceVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
