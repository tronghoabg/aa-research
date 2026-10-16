package defpackage;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;

/* loaded from: classes.dex */
final class kfh extends AsyncQueryHandler {
    final /* synthetic */ kfi a;
    private final kfj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfh(kfi kfiVar, ContentResolver contentResolver, kfj kfjVar) {
        super(contentResolver);
        this.a = kfiVar;
        this.b = kfjVar;
    }

    @Override // android.content.AsyncQueryHandler
    protected final void onQueryComplete(int i, Object obj, Cursor cursor) {
        super.onQueryComplete(i, obj, cursor);
        yph yphVar = kfi.a;
        wer.c();
        this.a.m(this.b.a(cursor));
    }
}
