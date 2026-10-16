package defpackage;

import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class oa implements m8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ qa c;

    public /* synthetic */ oa(qa qaVar, String[] strArr, int i) {
        this.a = i;
        this.c = qaVar;
        this.b = strArr;
    }

    @Override // defpackage.m8
    public final void b(int i) {
        switch (this.a) {
            case 0:
                qa qaVar = this.c;
                xc.p(qaVar.a, "hudText", this.b[i]);
                qaVar.d();
                qaVar.c();
                break;
            default:
                qa qaVar2 = this.c;
                MainActivity mainActivity = qaVar2.a;
                xc.p(mainActivity, "vietmapSource", this.b[i]);
                id.b(mainActivity);
                qaVar2.d();
                qaVar2.c();
                break;
        }
    }
}
