package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dpt extends defpackage.dpo implements java.lang.Iterable {
    @Override // defpackage.dpo, defpackage.dpp
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final defpackage.dpt clone() {
        return (defpackage.dpt) super.clone();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<defpackage.dpq> iterator() {
        return new defpackage.dps(this);
    }
}
