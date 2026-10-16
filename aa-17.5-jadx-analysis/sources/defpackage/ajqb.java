package defpackage;

/* loaded from: classes2.dex */
final class ajqb implements ajqa {
    final /* synthetic */ String a;
    final /* synthetic */ ajqc b;

    public ajqb(ajqc ajqcVar, String str) {
        this.a = str;
        this.b = ajqcVar;
    }

    @Override // defpackage.ajqa
    public final ajpy b(akba akbaVar) {
        ((ajph) akbaVar.v("http.request")).hX();
        return this.b.c(this.a);
    }
}
