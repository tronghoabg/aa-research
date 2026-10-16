package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class kfd extends llu {
    final /* synthetic */ kff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfd(kff kffVar) {
        super((byte[]) null);
        this.a = kffVar;
    }

    @Override // defpackage.llu
    public final void a() {
        kff kffVar = this.a;
        kffVar.b(kffVar.e.o(), 0);
    }

    @Override // defpackage.llu
    public final void b() {
        kff kffVar = this.a;
        kffVar.c(1, kffVar.a.getString(R.string.connection_failed_warning));
    }

    @Override // defpackage.llu
    public final void c() {
        kff kffVar = this.a;
        kffVar.c(1, kffVar.a.getString(R.string.connection_suspended_warning));
    }
}
