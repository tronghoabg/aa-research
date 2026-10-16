package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class key extends llu {
    final /* synthetic */ kez a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public key(kez kezVar) {
        super((byte[]) null);
        this.a = kezVar;
    }

    @Override // defpackage.llu
    public final void a() {
        kez kezVar = this.a;
        kezVar.b(true != kezVar.b.n().getBoolean("android.media.browse.SEARCH_SUPPORTED", false) ? 2 : 3, kezVar.a.getString(R.string.no_data));
    }

    @Override // defpackage.llu
    public final void b() {
        kez kezVar = this.a;
        kezVar.b(1, kezVar.a.getString(R.string.connection_failed_warning));
    }
}
