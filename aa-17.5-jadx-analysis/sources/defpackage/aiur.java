package defpackage;

/* loaded from: classes2.dex */
final class aiur implements aivd {
    public final boolean a;

    public aiur(boolean z) {
        this.a = z;
    }

    @Override // defpackage.aivd
    public final aivs a() {
        return null;
    }

    @Override // defpackage.aivd
    public final boolean hz() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
