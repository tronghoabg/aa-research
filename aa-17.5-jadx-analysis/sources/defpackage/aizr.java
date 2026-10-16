package defpackage;

/* loaded from: classes2.dex */
public final class aizr extends ajaj {
    public long a = -1;
    public afck b;

    @Override // defpackage.ajaj
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        aizp aizpVar = (aizp) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = aizpVar.b;
        if (j < aizpVar.c) {
            aizpVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.ajaj
    public final /* bridge */ /* synthetic */ afck[] b(Object obj) {
        boolean z = aitz.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((aizp) obj).l(j);
    }
}
