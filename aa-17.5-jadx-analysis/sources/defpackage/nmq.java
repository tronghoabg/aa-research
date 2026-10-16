package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;

/* loaded from: classes2.dex */
public final class nmq extends ieq {
    final /* synthetic */ RailHotseatItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmq(RailHotseatItemView railHotseatItemView) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = railHotseatItemView;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        ype ypeVar = (ype) RailHotseatItemView.a.f();
        RailHotseatItemView railHotseatItemView = this.a;
        ypeVar.y("%s icon cleared, setting empty", railHotseatItemView.f);
        railHotseatItemView.b(railHotseatItemView.c, new GhIcon(8), false);
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        ype ypeVar = (ype) RailHotseatItemView.a.h();
        RailHotseatItemView railHotseatItemView = this.a;
        ypeVar.y("%s icon failed to load", railHotseatItemView.f);
        railHotseatItemView.b.setVisibility(8);
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        Drawable drawable = (Drawable) obj;
        yop yopVarL = RailHotseatItemView.a.l();
        RailHotseatItemView railHotseatItemView = this.a;
        nmj nmjVar = railHotseatItemView.e;
        nmj nmjVar2 = null;
        if (nmjVar == null) {
            affa.d("currentHotseatItem");
            nmjVar = null;
        }
        yopVarL.M("%s icon successfully loaded, setting to %s", railHotseatItemView.f, nmjVar);
        railHotseatItemView.c.setImageDrawable(drawable);
        nmj nmjVar3 = railHotseatItemView.e;
        if (nmjVar3 == null) {
            affa.d("currentHotseatItem");
        } else {
            nmjVar2 = nmjVar3;
        }
        GhIcon ghIcon = nmjVar2.c;
        if (ghIcon == null) {
            railHotseatItemView.b.setVisibility(8);
            return;
        }
        ImageView imageView = railHotseatItemView.b;
        lgi.d(imageView, ghIcon, true, true, false);
        imageView.setVisibility(0);
    }
}
