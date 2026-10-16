package defpackage;

import android.database.ContentObserver;

/* loaded from: classes.dex */
final class sxj extends ContentObserver {
    final /* synthetic */ sxl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxj(sxl sxlVar) {
        super(null);
        this.a = sxlVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.f = (byte) 1;
    }
}
