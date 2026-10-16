package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yll extends defpackage.yor {
    final /* synthetic */ defpackage.xyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yll(java.util.Iterator it, defpackage.xyd xydVar) {
        super(it);
        this.a = xydVar;
    }

    @Override // defpackage.yor
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, this.a.a(obj));
    }
}
