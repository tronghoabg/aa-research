package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class h2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                ((j2) this.b).b.post(new f(this, 12));
                break;
            case 1:
                ((v3) this.b).r = i;
                break;
            case 2:
                ((za) this.b).b.post(new d3(i, this, 4));
                break;
            default:
                ((lb) this.b).b.post(new t7(this, 10));
                break;
        }
    }
}
