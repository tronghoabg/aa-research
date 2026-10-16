package defpackage;

import androidx.car.app.model.CarText;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gzf extends gwc {
    public static final yob a = yob.c("com/android/car/libraries/apphost/search/SearchTemplateInternalUiModelEmitter");
    public final geu b;
    public final hjr d;
    public hjq e;
    public String f;
    public final ieb g;
    private boolean i;
    private final aiyk j;
    private final aiyk k;
    private final aiyk l;
    private final aiyk m;
    public final gzr c = new gzr();
    private final aizk h = aizq.e(0, 1, 2, 1);

    public gzf(geu geuVar) {
        this.b = geuVar;
        this.d = (hjr) geuVar.F(hjr.class);
        ieb iebVar = new ieb((char[]) null, (byte[]) null);
        this.g = iebVar;
        hcg hcgVar = new hcg(new fuu(iebVar.a, this, 17), new dxp(this, (afck) null, 5), 16);
        this.j = hcgVar;
        jyc jycVar = new jyc(this.n, geuVar.w().g, new gze(null), 5);
        this.k = jycVar;
        fmn fmnVar = new fmn(hcgVar, 16);
        this.l = fmnVar;
        this.m = new fuu(aizc.b(jycVar, fmnVar), this, 18);
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.m;
    }

    @Override // defpackage.gwc
    public final Object b() {
        String str = this.f;
        boolean z = this.i;
        gzr gzrVar = this.c;
        return new gzd(str, z, gzrVar.a, gzrVar.b);
    }

    @Override // defpackage.gwc
    public final void c(Object obj) {
        gzd gzdVar = obj instanceof gzd ? (gzd) obj : null;
        if (gzdVar == null) {
            return;
        }
        this.f = gzdVar.a;
        this.i = gzdVar.b;
        this.c.a(gzdVar.c, gzdVar.d, false);
    }

    public final hju d(gzi gziVar, boolean z, hjq hjqVar) {
        boolean z2;
        boolean z3;
        if (gziVar == null || gziVar.a) {
            return new fvm(null);
        }
        if (this.f == null) {
            String str = gziVar.d;
            if (str == null) {
                str = "";
            }
            this.f = str;
        }
        fvu fvuVar = gziVar.b;
        List listBg = fvuVar != null ? woy.bg(fvr.h(fvuVar, this.b, fwx.d, false, fwh.a, null, null, false, 0, 244)) : null;
        hjr hjrVar = this.d;
        gbz gbzVar = hjrVar.b() ? new gbz(this, 20) : null;
        boolean z4 = !this.i && hjqVar == null && gziVar.f;
        if (z4) {
            this.i = true;
        }
        String string = gziVar.e;
        if (!z && hjrVar.b()) {
            geu geuVar = this.b;
            if (geuVar.x().a() || geuVar.x().b()) {
                geuVar.u();
                string = geuVar.getString(R.string.search_hint_transcription);
                string.getClass();
            } else {
                geuVar.u();
                string = geuVar.getString(R.string.search_hint_transcription_rotary);
                string.getClass();
            }
        } else if (string == null) {
            geu geuVar2 = this.b;
            geuVar2.u();
            string = geuVar2.getString(R.string.search_hint);
            string.getClass();
        }
        geu geuVar3 = this.b;
        gbg gbgVarC = gax.c(geuVar3, R.drawable.gs_search_vd_24, null);
        String str2 = this.f;
        gcq gcqVarA = gcr.a(string);
        grn grnVar = new grn(this, gziVar, 4);
        grn grnVar2 = new grn(this, gziVar, 5);
        if (z) {
            z2 = true;
            z3 = true;
        } else {
            z2 = hjrVar.b();
            z3 = false;
        }
        gbv gbvVar = new gbv(str2, gcqVarA, z4, gbgVarC, grnVar, grnVar2, gbzVar, z2, !z3);
        har harVar = gziVar.c;
        if (harVar == null) {
            geuVar3.u();
            harVar = new har(null, CarText.create(geuVar3.getString(R.string.template_list_no_items)), null, 0, null, 123);
        }
        List listBg2 = woy.bg(hej.d(harVar, geuVar3, true, null, 4));
        gzr gzrVar = this.c;
        hcl hclVar = new hcl(listBg2, null, gzrVar.a, gzrVar.b, new guq(this, 7), this.h, 18);
        if (listBg == null) {
            listBg = afbe.a;
        }
        List list = gziVar.i;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fvr.h((fvu) it.next(), geuVar3, fwx.c, false, fwh.b, null, null, false, 0, 244));
        }
        fzi fziVar = new fzi(gbvVar, listBg, arrayList);
        return ((ggk) geuVar3.F(ggk.class)).F() ? new hcm(fziVar, hclVar, null, null, 1.0f, true) : new hkt(fziVar, hclVar, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 1.0f, false);
    }

    @Override // defpackage.gwc
    public final void f() {
        this.h.c(afak.a);
    }
}
