package com.waze.car_lib;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.waze.lm;
import com.waze.view.text.InstantAutoComplete;
import e.a.el;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class be implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19178a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19179b;

    public /* synthetic */ be(Object obj, int i2) {
        this.f19179b = i2;
        this.f19178a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19179b) {
            case 0:
                bh.c((bh) this.f19178a);
                break;
            case 1:
                bh.b((bh) this.f19178a);
                break;
            case 2:
                WazeCarAppService.a((WazeCarAppService) this.f19178a);
                break;
            case 3:
                bl.b((bl) this.f19178a);
                break;
            case 4:
                com.waze.view.navbar.p.j((com.waze.view.navbar.p) this.f19178a);
                break;
            case 5:
                com.waze.view.popups.o.v((com.waze.view.popups.o) this.f19178a);
                break;
            case 6:
                ((com.waze.view.popups.t) this.f19178a).k();
                break;
            case 7:
                ((com.waze.view.popups.a.h) this.f19178a).S();
                break;
            case 8:
                com.waze.view.popups.a.ag.a((com.waze.view.popups.a.ag) this.f19178a);
                break;
            case 9:
                ((com.waze.view.popups.a.ag) this.f19178a).n();
                break;
            case 10:
                com.waze.view.popups.a.ag.c((com.waze.view.popups.a.ag) this.f19178a);
                break;
            case 11:
                ((com.waze.view.popups.a.ag) this.f19178a).m();
                break;
            case 12:
                ((com.waze.view.popups.a.ag) this.f19178a).m();
                break;
            case 13:
                ((com.waze.view.popups.a.ag) this.f19178a).f(true);
                break;
            case 14:
                Object obj = this.f19178a;
                if (ViewCompat.isAttachedToWindow((View) obj)) {
                    InstantAutoComplete instantAutoComplete = (InstantAutoComplete) obj;
                    instantAutoComplete.showDropDown();
                    instantAutoComplete.a();
                    instantAutoComplete.setCursorVisible(true);
                    break;
                }
                break;
            case 15:
                Object obj2 = this.f19178a;
                Objects.toString(obj2);
                com.waze.shared_infra.i.h.a("openSearchActivity, searchQuery=".concat(String.valueOf(obj2)));
                com.waze.sharedui.a.e eVarE = lm.d().e();
                if (eVarE != null) {
                    com.waze.search.t tVar = new com.waze.search.t();
                    com.waze.search.bm bmVar = (com.waze.search.bm) obj2;
                    tVar.j(bmVar.a());
                    tVar.g(bmVar.b());
                    if (bmVar.c()) {
                        tVar.e(5);
                    }
                    tVar.h(eVarE, 1);
                    break;
                }
                break;
            case 16:
                ((e.a.b.a.e) this.f19178a).O();
                break;
            case 17:
                ((e.a.b.a.e) this.f19178a).P();
                break;
            default:
                ((el) this.f19178a).b();
                break;
        }
    }
}
