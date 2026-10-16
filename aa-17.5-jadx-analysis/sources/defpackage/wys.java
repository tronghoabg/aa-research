package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.companion.AndroidAutoActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class wys implements eaj {
    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        yph yphVar = AndroidAutoActivity.m;
        dve dveVarF = ecyVar.f(519);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = dveVarF.c;
        view.setLayoutParams(marginLayoutParams);
        return ecy.a;
    }
}
