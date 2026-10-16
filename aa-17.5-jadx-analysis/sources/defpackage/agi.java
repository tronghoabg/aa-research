package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class agi implements bvn {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public agi(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [eqn, java.lang.Object] */
    @Override // defpackage.bvn
    public final void a() {
        switch (this.c) {
            case 0:
                ((agg) this.a).f.remove(this.b);
                break;
            case 1:
                ((afh) this.b).a.m(this.a);
                break;
            case 2:
                aga agaVarA = ((agb) this.a).a();
                if (agaVarA != null) {
                    ((agg) this.b).m(agaVarA.a);
                    break;
                }
                break;
            case 3:
                ((agg) this.b).m((age) this.a);
                break;
            case 4:
                ((awp) this.b).a((View) this.a);
                break;
            case 5:
                ((bab) this.a).a.h(this.b);
                break;
            case 6:
                ((bfh) this.a).c.remove(this.b);
                break;
            case 7:
                ((eqj) this.a).k(this.b);
                break;
            default:
                ((Context) this.a).unregisterReceiver((BroadcastReceiver) this.b);
                break;
        }
    }

    public agi(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
