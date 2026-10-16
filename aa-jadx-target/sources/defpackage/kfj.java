package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kfj extends android.content.AsyncQueryHandler {
    final /* synthetic */ defpackage.kfk a;
    private final kfl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfj(defpackage.kfk kfkVar, android.content.ContentResolver contentResolver, kfl kflVar) {
        super(contentResolver);
        this.a = kfkVar;
        this.b = kflVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // android.content.AsyncQueryHandler
    protected final void onQueryComplete(int i, java.lang.Object obj, android.database.Cursor cursor) throws wfo {
        super.onQueryComplete(i, obj, cursor);
        defpackage.yqm yqmVar = defpackage.kfk.a;
        defpackage.wfp.c();
        this.a.m(this.b.a(cursor));
    }
}
