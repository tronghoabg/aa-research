package defpackage;

import com.google.android.apps.auto.components.apphost.tab.MaterialTabHeaderView;

/* loaded from: classes2.dex */
public final class jzp implements wwc {
    final /* synthetic */ afec a;

    public jzp(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.wwc
    public final void a(wwg wwgVar) {
        wwgVar.getClass();
    }

    @Override // defpackage.wwc
    public final void b(wwg wwgVar) {
        wwi wwiVar = wwgVar.g;
        wwiVar.getClass();
        MaterialTabHeaderView.b(wwiVar, true);
        Object obj = wwgVar.a;
        obj.getClass();
        this.a.invoke(obj);
    }

    @Override // defpackage.wwc
    public final void c(wwg wwgVar) {
        wwi wwiVar = wwgVar.g;
        wwiVar.getClass();
        MaterialTabHeaderView.b(wwiVar, false);
    }
}
