package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class ygy extends yfx {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public ygy(ygz ygzVar) {
        super(ygzVar);
        this.a = ygzVar.comparator();
    }

    @Override // defpackage.yfx
    public final /* bridge */ /* synthetic */ yfu a(int i) {
        return new ygv(this.a);
    }
}
