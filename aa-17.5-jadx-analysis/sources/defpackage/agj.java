package defpackage;

import android.view.ActionMode;

/* loaded from: classes.dex */
public final class agj implements bvn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public agj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [bwq, java.lang.Object] */
    @Override // defpackage.bvn
    public final void a() {
        switch (this.b) {
            case 0:
                ((agg) this.a).i();
                break;
            case 1:
                ((agg) this.a).i();
                break;
            case 2:
                ((azf) this.a).d = null;
                break;
            case 3:
                azt aztVar = (azt) this.a;
                sji sjiVar = aztVar.f;
                if (sjiVar != null) {
                    sjiVar.b = false;
                }
                aztVar.f = null;
                break;
            case 4:
                azp azpVar = (azp) this.a;
                azpVar.d = true;
                azpVar.c = 0;
                azpVar.b();
                break;
            case 5:
                ((blr) this.a).l();
                break;
            case 6:
                ?? r3 = this.a;
                if (((asi) r3.a()) != null) {
                    r3.b(null);
                    break;
                }
                break;
            case 7:
                bgg bggVar = (bgg) this.a;
                ces cesVar = bggVar.c;
                cesVar.d();
                cesVar.a();
                ActionMode actionMode = bggVar.f;
                if (actionMode != null) {
                    actionMode.finish();
                }
                bggVar.f = null;
                break;
            default:
                bhk bhkVarA = ((bhl) this.a).a();
                if (bhkVarA != null) {
                    bhkVarA.a();
                    break;
                }
                break;
        }
    }
}
