package defpackage;

import androidx.car.app.model.Toggle;

/* loaded from: classes3.dex */
public final class tjt extends tjo {
    public afec a;
    public boolean b;
    public boolean c = true;
    private final wd d = new mmj(this, 18);

    public tjt(afec afecVar, boolean z) {
        this.a = afecVar;
        this.b = z;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        wc wcVar = new wc(this.d);
        wcVar.b = this.b;
        wcVar.c = this.c;
        return new Toggle(wcVar);
    }

    @Override // defpackage.tjo
    public final String b() {
        return "Toggle: isChecked " + this.b + ", isEnabled " + this.c;
    }
}
