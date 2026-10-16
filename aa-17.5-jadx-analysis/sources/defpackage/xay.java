package defpackage;

import androidx.preference.ListPreference;
import j$.util.Optional;

/* loaded from: classes3.dex */
public final /* synthetic */ class xay implements eqn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xay(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((xaz) this.a).b((jez) obj);
            return;
        }
        if (i == 1) {
            ((xau) this.a).b((nfp) obj);
            return;
        }
        if (i == 2) {
            ((xbo) this.a).z("key_settings_messaging_visual_preview_enabled", ((Boolean) obj).booleanValue());
            return;
        }
        if (i == 3) {
            mma mmaVar = (mma) obj;
            yph yphVar = xbo.f;
            ListPreference listPreference = (ListPreference) this.a;
            ((ype) xbo.f.l().ai((char) 10031)).M("updating driver aligned dashboard preference: %s -> %s", mma.a(listPreference.i), mmaVar);
            listPreference.o(mmaVar.name());
            return;
        }
        if (i == 4) {
            jey jeyVar = (jey) obj;
            yph yphVar2 = xbo.f;
            ListPreference listPreference2 = (ListPreference) this.a;
            ((ype) xbo.f.l().ai((char) 10032)).M("updating driver position preference: %s -> %s", jey.a(listPreference2.i), jeyVar);
            listPreference2.o(jeyVar.name());
            return;
        }
        Optional optional = (Optional) obj;
        qat qatVar = new qat(this.a, 6);
        if (true != optional.isPresent()) {
            return;
        }
        Object obj2 = optional.get();
        xbo xboVar = (xbo) qatVar.a;
        xboVar.u(new xbi(xboVar, ((okx) obj2).d));
    }
}
