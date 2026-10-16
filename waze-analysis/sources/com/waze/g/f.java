package com.waze.g;

import android.content.Context;
import android.support.v7.app.o;
import android.widget.EditText;
import android.widget.ViewAnimator;
import com.waze.R;
import com.waze.mg;
import com.waze.reports.AddPlaceFlowActivity;
import com.waze.reports.ClosureMap;
import com.waze.reports.EditPlaceFlowActivity;
import com.waze.reports.GasPriceReportActivity;
import com.waze.reports.ax;
import com.waze.reports.eb;
import com.waze.reports_v2.presentation.ap;
import com.waze.sdk.ae;
import com.waze.sdk.au;
import com.waze.sdk.bd;
import com.waze.ui.x.u;
import com.waze.view.text.WazeEditText;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23997a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23998b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f23998b = i2;
        this.f23997a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23998b) {
            case 0:
                h.b((h) this.f23997a);
                break;
            case 1:
                AddPlaceFlowActivity.w((AddPlaceFlowActivity) this.f23997a);
                break;
            case 2:
                ((ClosureMap) this.f23997a).q.v(false, -1);
                break;
            case 3:
                ((ClosureMap) this.f23997a).q.v(true, ClosureMap.f33536h);
                break;
            case 4:
                EditPlaceFlowActivity editPlaceFlowActivity = (EditPlaceFlowActivity) this.f23997a;
                editPlaceFlowActivity.setResult(3);
                editPlaceFlowActivity.finish();
                break;
            case 5:
                ax.o((ax) this.f23997a);
                break;
            case 6:
                GasPriceReportActivity.r((GasPriceReportActivity) this.f23997a);
                break;
            case 7:
                int i2 = GasPriceReportActivity.f33545f;
                WazeEditText wazeEditText = (WazeEditText) this.f23997a;
                wazeEditText.setSelection(wazeEditText.getText().length());
                wazeEditText.setCursorVisible(true);
                wazeEditText.requestFocus();
                break;
            case 8:
                ((ViewAnimator) this.f23997a).showPrevious();
                break;
            case 9:
                eb.j((eb) this.f23997a);
                break;
            case 10:
                ((eb) this.f23997a).C();
                break;
            case 11:
                ((ap) this.f23997a).D();
                break;
            case 12:
                ((ap) this.f23997a).f34812h = false;
                break;
            case 13:
                ((ap) this.f23997a).setVisibility(8);
                break;
            case 14:
                ((ap) this.f23997a).f34812h = false;
                break;
            case 15:
                ap.i((ap) this.f23997a);
                break;
            case 16:
                Object obj = this.f23997a;
                EditText editText = (EditText) ((o) obj).findViewById(R.id.rtalerts_comments_comment_text);
                editText.requestFocus();
                u.l((Context) obj, editText);
                break;
            case 17:
                ((ae) this.f23997a).ah.a();
                break;
            case 18:
                ae.s((ae) this.f23997a);
                break;
            case 19:
                ((au) this.f23997a).h(mg.a());
                break;
            default:
                bd.l((bd) this.f23997a);
                break;
        }
    }
}
