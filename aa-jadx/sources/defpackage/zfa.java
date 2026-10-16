package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zfa extends defpackage.zfc {
    @Override // defpackage.zfc
    public final /* bridge */ /* synthetic */ java.lang.Class a(java.lang.Object obj) {
        return (java.lang.Class) obj;
    }

    @Override // defpackage.zfc
    public final /* bridge */ /* synthetic */ java.lang.Iterable b(java.lang.Object obj) {
        return java.util.Arrays.asList(((java.lang.Class) obj).getInterfaces());
    }

    @Override // defpackage.zfc
    public final /* synthetic */ java.lang.Object c(java.lang.Object obj) {
        return ((java.lang.Class) obj).getSuperclass();
    }
}
