package com.waze.ba;

import android.content.Context;
import android.content.Intent;
import androidx.autofill.HintConstants;
import com.waze.CalendarApprovedActivity;
import com.waze.reports.AddPlaceFlowActivity;
import com.waze.shared_infra.i.e;
import com.waze.sharedui.utils.h;
import com.waze.sharedui.utils.i;
import com.waze.sharedui.utils.j;
import com.waze.sharedui.utils.k;
import com.waze.sharedui.utils.l;
import com.waze.sharedui.utils.m;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    private final e f16184a;

    public a(e eVar) {
        x.f(eVar, "logger");
        this.f16184a = eVar;
    }

    @Override // com.waze.sharedui.utils.k
    public final Intent a(m mVar, Context context) {
        x.f(mVar, "action");
        Objects.toString(mVar);
        this.f16184a.a("providing intent for ".concat(mVar.toString()));
        if (mVar instanceof j) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", ((j) mVar).a());
            return intent;
        }
        if (mVar instanceof l) {
            return new Intent("android.intent.action.PICK", ((l) mVar).a());
        }
        if (!(mVar instanceof h)) {
            if (!(mVar instanceof i)) {
                throw new h.i();
            }
            Intent intent2 = new Intent(context, (Class<?>) CalendarApprovedActivity.class);
            int i2 = CalendarApprovedActivity.f13546f;
            i iVar = (i) mVar;
            intent2.putExtra("callback", iVar.a());
            intent2.putExtra("context", iVar.b());
            intent2.putExtra("granted", iVar.c());
            return intent2;
        }
        Intent intent3 = new Intent(context, (Class<?>) AddPlaceFlowActivity.class);
        h hVar = (h) mVar;
        String strD = hVar.d();
        if (strD != null) {
            intent3.putExtra(HintConstants.AUTOFILL_HINT_NAME, strD);
        }
        String strF = hVar.f();
        if (strF != null) {
            intent3.putExtra("street", strF);
        }
        String strC = hVar.c();
        if (strC != null) {
            intent3.putExtra("city", strC);
        }
        Integer numA = hVar.a();
        if (numA != null) {
            intent3.putExtra("x", numA.intValue());
        }
        Integer numB = hVar.b();
        if (numB != null) {
            intent3.putExtra("y", numB.intValue());
        }
        intent3.putExtra("destination_venue_id", hVar.g());
        intent3.putExtra("QuestionID", hVar.e());
        return intent3;
    }
}
