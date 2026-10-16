package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class uhv extends uhx {
    public final tzy a;

    public uhv(uju ujuVar, int i, tzy tzyVar) {
        super(ujuVar, i);
        this.a = tzyVar;
    }

    @Override // defpackage.uhx
    public final boolean equals(Object obj) {
        uhv uhvVar;
        return (obj instanceof uhv) && (uhvVar = (uhv) obj) != null && Objects.equals(this.b, uhvVar.b) && Objects.equals(this.a, uhvVar.a);
    }

    @Override // defpackage.uhx
    public final int hashCode() {
        return Objects.hash(this.b, this.a, Integer.valueOf(this.c));
    }
}
