package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tox implements Comparable {
    public final String a;
    public final String b;
    public final abgl c;
    public final boolean d;

    public tox(String str, abgl abglVar) {
        this(str + "." + abglVar.name(), str, abglVar, true);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((tox) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tox) {
            return Objects.equals(this.b, ((tox) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    public tox(String str, String str2, abgl abglVar, boolean z) {
        this.b = str;
        this.a = str2;
        this.c = abglVar;
        this.d = z;
    }
}
