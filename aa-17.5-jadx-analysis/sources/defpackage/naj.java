package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridItemView;
import com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.projection.gearhead.sdk.CheckboxWrapperView;

/* loaded from: classes2.dex */
public final /* synthetic */ class naj implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ naj(hin hinVar, kdi kdiVar, geu geuVar, int i) {
        this.d = i;
        this.a = hinVar;
        this.c = kdiVar;
        this.b = geuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                nao naoVarB = ((MediaSuggestionFragment) this.a).b();
                Context context = ((View) this.b).getContext();
                context.getClass();
                naoVarB.e(context, this.c);
                break;
            case 1:
                hlv hlvVar = GridItemView.a;
                int i = ((kdi) this.c).b;
                hin hinVar = (hin) this.a;
                if (hinVar.b != i) {
                    hinVar.b(i);
                }
                Object obj = this.b;
                ((geu) obj).t().q(hinVar.a, hinVar.a(i));
                break;
            case 2:
                CheckboxWrapperView checkboxWrapperView = ((qfq) this.a).s;
                checkboxWrapperView.toggle();
                Bundle bundle = new Bundle();
                ((MenuItem) this.b).d(bundle);
                MenuItem menuItem = new MenuItem();
                menuItem.b(bundle);
                menuItem.m = checkboxWrapperView.isChecked();
                osq.A(menuItem);
                ((qgq) this.c).t(menuItem);
                break;
            case 3:
                Bundle bundle2 = new Bundle();
                ((MenuItem) this.b).d(bundle2);
                MenuItem menuItem2 = new MenuItem();
                menuItem2.b(bundle2);
                menuItem2.m = ((qfq) this.a).s.isChecked();
                osq.A(menuItem2);
                ((qgq) this.c).t(menuItem2);
                break;
            case 4:
                wic wicVar = new wic();
                ((wjt) this.a).a = null;
                wjb wjbVar = (wjb) this.b;
                wjbVar.j(wjbVar.d, wjbVar.j, wjbVar.h, wid.l(wjbVar.f));
                wjbVar.b.dismissAllowingStateLoss();
                vuf.C(wicVar, wjbVar.d, (String) this.c);
                break;
            case 5:
                wic wicVar2 = new wic();
                ((wjk) this.a).a = null;
                wjb wjbVar2 = (wjb) this.b;
                wjbVar2.j(wjbVar2.d, wjbVar2.j, wjbVar2.h, wid.l(wjbVar2.f));
                wjbVar2.b.dismissAllowingStateLoss();
                vuf.C(wicVar2, wjbVar2.d, (String) this.c);
                break;
            case 6:
                wic wicVar3 = new wic();
                this.b.onClick(view);
                vuf.D(wicVar3, ((wjb) this.a).d, (String) this.c);
                break;
            default:
                wic wicVar4 = new wic();
                ((wio) this.b).c = null;
                wjb wjbVar3 = (wjb) this.a;
                wjbVar3.j(wjbVar3.d, wjbVar3.j, wjbVar3.h, wid.l(wjbVar3.f));
                wjbVar3.b.dismissAllowingStateLoss();
                vuf.C(wicVar4, wjbVar3.d, (String) this.c);
                break;
        }
    }

    public /* synthetic */ naj(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public naj(qfq qfqVar, MenuItem menuItem, qgq qgqVar, int i) {
        this.d = i;
        this.b = menuItem;
        this.c = qgqVar;
        this.a = qfqVar;
    }

    public /* synthetic */ naj(wjb wjbVar, LinearLayout linearLayout, String str, int i) {
        this.d = i;
        this.b = wjbVar;
        this.a = linearLayout;
        this.c = str;
    }
}
