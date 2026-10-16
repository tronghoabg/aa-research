package defpackage;

import android.media.ToneGenerator;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.car.app.model.Header;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kab extends hlf {
    public final MaterialStandardDialpadView a;
    private final ViewGroup b;
    private final ViewGroup c;
    private final kds d;
    private final Space e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kab(geu geuVar, TemplateWrapper templateWrapper) {
        super(geuVar, templateWrapper, gzc.a);
        geuVar.getClass();
        View viewInflate = LayoutInflater.from(geuVar).inflate(R.layout.cal_material_dialpad, (ViewGroup) null);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.b = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.header_container);
        viewFindViewById.getClass();
        this.c = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.header_view);
        viewFindViewById2.getClass();
        this.d = (kds) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.call);
        viewFindViewById3.getClass();
        View viewFindViewById4 = viewGroup.findViewById(R.id.touch_dialpad_view);
        viewFindViewById4.getClass();
        this.a = (MaterialStandardDialpadView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.header_space);
        viewFindViewById5.getClass();
        this.e = (Space) viewFindViewById5;
    }

    private final void h() {
        DialpadTemplate dialpadTemplate = (DialpadTemplate) C();
        String phoneNumber = dialpadTemplate.getPhoneNumber();
        if (phoneNumber == null) {
            phoneNumber = "";
        }
        this.a.d(phoneNumber);
        if (dialpadTemplate.getHeader() == null) {
            f();
        } else {
            this.c.setVisibility(0);
            this.e.setVisibility(8);
            kds kdsVar = this.d;
            geu geuVar = this.i;
            geuVar.getClass();
            Header header = dialpadTemplate.getHeader();
            if (header == null) {
                kdsVar.setVisibility(8);
            } else {
                kdsVar.setVisibility(0);
                kdsVar.a(geuVar, header.getTitle(), header.getStartHeaderAction(), header.getEndHeaderActions());
            }
        }
        ksa.a.a().e.fE(this, new ewg(new kaa(this, 0), 8));
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void F() {
        super.F();
        MaterialStandardDialpadView materialStandardDialpadView = this.a;
        materialStandardDialpadView.h = this.i;
        lbh.c().i(materialStandardDialpadView);
        materialStandardDialpadView.setVisibility(0);
        h();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        liu liuVarC = lbh.c();
        MaterialStandardDialpadView materialStandardDialpadView = this.a;
        liuVarC.n(materialStandardDialpadView);
        materialStandardDialpadView.setVisibility(8);
        materialStandardDialpadView.d("");
        ToneGenerator toneGenerator = materialStandardDialpadView.e;
        if (toneGenerator != null) {
            toneGenerator.release();
            materialStandardDialpadView.e = null;
        }
        materialStandardDialpadView.c.removeCallbacksAndMessages(null);
        materialStandardDialpadView.d.abandonAudioFocus(null);
        super.b();
    }

    @Override // defpackage.hlf
    public final void d() {
        h();
    }

    @Override // defpackage.hlo
    public final /* synthetic */ View e() {
        return this.b;
    }

    public final void f() {
        this.c.setVisibility(8);
        this.e.setVisibility(0);
        ViewGroup viewGroup = this.b;
        viewGroup.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        h hVar = new h();
        hVar.e(constraintLayout);
        hVar.g(R.id.touch_dialpad_view, 3, R.id.header_space);
        hVar.b(constraintLayout);
    }
}
