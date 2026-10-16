package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class la implements m8, n8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ la(qa qaVar, int i) {
        this.a = i;
        this.b = qaVar;
    }

    @Override // defpackage.n8
    public void a(boolean z) {
        qa qaVar = this.b;
        xc.m(qaVar.a, "restoreLayout", z);
        qaVar.e(z);
        qaVar.d();
    }

    @Override // defpackage.m8
    public void b(int i) {
        switch (this.a) {
            case 0:
                qa qaVar = this.b;
                xc.p(qaVar.a, "playerStyle", k1.e[i].a);
                qaVar.d();
                qaVar.c();
                break;
            case 1:
                qa qaVar2 = this.b;
                xc.p(qaVar2.a, "toolbarMode", qa.m[i]);
                qaVar2.d();
                qaVar2.c();
                break;
            default:
                qa qaVar3 = this.b;
                xc.p(qaVar3.a, "speedStyle", w1.d[i].a);
                qaVar3.d();
                qaVar3.c();
                break;
        }
    }

    public /* synthetic */ la(qa qaVar, Object[] objArr, int i) {
        this.a = i;
        this.b = qaVar;
    }
}
