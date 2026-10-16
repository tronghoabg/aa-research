package io.flutter.plugin.platform;

import android.view.View;
import uc.C4281r;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f37107c;

    public /* synthetic */ k(j jVar, int i5, int i10) {
        this.f37105a = i10;
        this.f37107c = jVar;
        this.f37106b = i5;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f37105a) {
            case 0:
                q qVar = (q) this.f37107c;
                int i5 = this.f37106b;
                if (!z2) {
                    io.flutter.plugin.editing.i iVar = qVar.f37138f;
                    if (iVar != null) {
                        iVar.b(i5);
                        break;
                    }
                } else {
                    C4281r c4281r = (C4281r) qVar.f37139g.f45906a;
                    if (c4281r != null) {
                        c4281r.a("viewFocused", Integer.valueOf(i5), null);
                        break;
                    }
                }
                break;
            default:
                p pVar = (p) this.f37107c;
                int i10 = this.f37106b;
                if (!z2) {
                    io.flutter.plugin.editing.i iVar2 = pVar.f37122f;
                    if (iVar2 != null) {
                        iVar2.b(i10);
                        break;
                    }
                } else {
                    C4281r c4281r2 = (C4281r) pVar.f37123g.f16383b;
                    if (c4281r2 != null) {
                        c4281r2.a("viewFocused", Integer.valueOf(i10), null);
                        break;
                    }
                }
                break;
        }
    }
}
