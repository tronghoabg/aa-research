package defpackage;

import android.content.ComponentName;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.MediaPlaybackTemplate;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialTitleHeaderView;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class kca extends hlf implements lyy {
    private final lju A;
    public final ViewGroup a;
    public final ImageView b;
    public final CarTextView c;
    public final MediaPlaybackView d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final hmb h;
    public ComponentName p;
    public final ljn q;
    public final eqm r;
    public final yph s;
    private final ViewGroup t;
    private final ViewGroup u;
    private final MaterialTitleHeaderView v;
    private final MaterialTitleHeaderView w;
    private final gqb x;
    private final eqj y;
    private final eqj z;

    static {
        new omu();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kca(geu geuVar, TemplateWrapper templateWrapper) {
        super(geuVar, templateWrapper, gzc.a);
        geuVar.getClass();
        hem hemVarL = geuVar.l(gqb.class);
        if (hemVarL == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        gqb gqbVar = (gqb) hemVarL;
        this.x = gqbVar;
        eqj eqjVar = ((ltn) gqbVar.d().g).a;
        this.y = eqjVar;
        ljn ljnVarA = lnm.z().a();
        this.q = ljnVarA;
        ljnVarA.a();
        afco afcoVar = tby.a;
        eqm eqmVar = new eqm(null);
        this.r = eqmVar;
        Duration durationOfMillis = Duration.ofMillis(5000L);
        durationOfMillis.getClass();
        eqj eqjVarR = tby.r(eqmVar, durationOfMillis);
        this.z = eqjVarR;
        yph yphVarC = yph.c("CarApp.H.Tem");
        this.s = yphVarC;
        View viewInflate = LayoutInflater.from(geuVar).inflate(R.layout.material_mediaplayback_template_layout, (ViewGroup) null);
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.t = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.playback_view);
        viewFindViewById.getClass();
        MediaPlaybackView mediaPlaybackView = (MediaPlaybackView) viewFindViewById;
        this.d = mediaPlaybackView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.header_container);
        viewFindViewById2.getClass();
        this.u = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.back_action_header_view);
        viewFindViewById3.getClass();
        this.v = (MaterialTitleHeaderView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.primary_header_view);
        viewFindViewById4.getClass();
        this.w = (MaterialTitleHeaderView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.message_container);
        viewFindViewById5.getClass();
        this.a = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.error_message_icon);
        viewFindViewById6.getClass();
        this.b = (ImageView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.playback_message_text);
        viewFindViewById7.getClass();
        CarTextView carTextView = (CarTextView) viewFindViewById7;
        this.c = carTextView;
        View viewFindViewById8 = viewGroup.findViewById(R.id.progress_container);
        viewFindViewById8.getClass();
        this.e = (ViewGroup) viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.metadata_time_container);
        viewFindViewById9.getClass();
        this.f = (ViewGroup) viewFindViewById9;
        this.g = (ViewGroup) viewGroup.findViewById(R.id.media_seekbar);
        mediaPlaybackView.d = ljnVarA;
        mediaPlaybackView.g.f = this;
        krt krtVarB = jtu.b(hiu.a);
        krr krrVar = krr.w;
        mediaPlaybackView.d(krr.g(krrVar, geuVar, krtVarB), krr.g(krr.D, geuVar, krtVarB), krr.g(krr.q, geuVar, krtVarB), krr.g(krr.s, geuVar, krtVarB), krr.g(krr.v, geuVar, krtVarB), krr.g(krrVar, geuVar, krtVarB), krr.g(krr.o, geuVar, krtVarB));
        if (leh.a.a().b()) {
            carTextView.setTextColor(krr.g(krr.C, geuVar, krtVarB));
        }
        TypedArray typedArrayObtainStyledAttributes = geuVar.obtainStyledAttributes(new int[]{R.attr.templateMessageDefaultIconTint});
        typedArrayObtainStyledAttributes.getClass();
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        this.h = new hmb(color, false, false, ghw.b, null, false, 0);
        this.A = new lme(this, 1);
        r();
        wb template = templateWrapper.getTemplate();
        MediaPlaybackTemplate mediaPlaybackTemplate = template instanceof MediaPlaybackTemplate ? (MediaPlaybackTemplate) template : null;
        ComponentName playbackComponentName = mediaPlaybackTemplate != null ? mediaPlaybackTemplate.getPlaybackComponentName() : null;
        ComponentName componentName = template instanceof androidx.car.app.media.model.MediaPlaybackTemplate ? ((gmh) geuVar.d()).a : null;
        if (playbackComponentName != null) {
            this.p = playbackComponentName;
            ((lmu) ljnVarA).l(playbackComponentName);
            ((ype) yphVarC.f()).u("Connecting to service using playbackComponentName");
        } else if (componentName != null) {
            this.p = componentName;
            ((lmu) ljnVarA).l(componentName);
            ((ype) yphVarC.f()).u("Connecting to service using calComponentName");
        } else {
            tby.t(eqjVar).fE(this, new ewg(new kaa(this, 2), 9));
            ((ype) yphVarC.f()).u("Connecting to service using mediaAppData, as both playbackComponent and calComponent are null.");
        }
        eqjVarR.fE(this, new ewg(new kaa(this, 3), 9));
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void A() {
        super.A();
        this.d.o.b(false);
        this.q.e(this.A);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void B() {
        super.B();
        ljn ljnVar = this.q;
        lju ljuVar = this.A;
        ljnVar.d(ljuVar);
        if (ljnVar.h()) {
            ljuVar.b();
        }
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void F() {
        super.F();
        this.q.f();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        super.b();
        this.q.g();
    }

    @Override // defpackage.hlf
    public final void d() {
        r();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.t;
    }

    @Override // defpackage.lyy
    public final void f() {
        this.d.f();
        this.q.a();
        r();
    }

    @Override // defpackage.lyy
    public final void h(Bitmap bitmap) {
        this.d.h(bitmap);
        mki.a.d.execute(new kbs(this, 7));
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        boolean zJ;
        keyEvent.getClass();
        if (i != 19) {
            if (i == 20) {
                zJ = hlf.J(woy.bg(this.u), woy.bi(this.d, this.a), false);
            }
        }
        zJ = hlf.J(woy.bi(this.d, this.a), woy.bg(this.u), false);
        return zJ;
    }

    @Override // defpackage.lyy
    public final void m() {
        this.d.m();
        this.q.a();
        r();
    }

    public final void p() {
        this.d.setVisibility(8);
        Object[] objArr = {this.q.a().c};
        geu geuVar = this.i;
        String string = geuVar.getString(R.string.cannot_connect_to_app, objArr);
        string.getClass();
        CarText carTextCreate = CarText.create(string);
        CarTextView carTextView = this.c;
        carTextView.a(geuVar, carTextCreate);
        this.a.setVisibility(0);
        carTextView.setVisibility(0);
        this.e.setVisibility(8);
    }

    public final void r() {
        Header header;
        wb template = this.k.getTemplate();
        if (template instanceof MediaPlaybackTemplate) {
            header = ((MediaPlaybackTemplate) template).getHeader();
        } else if (!(template instanceof androidx.car.app.media.model.MediaPlaybackTemplate)) {
            return;
        } else {
            header = ((androidx.car.app.media.model.MediaPlaybackTemplate) template).getHeader();
        }
        MaterialTitleHeaderView materialTitleHeaderView = this.v;
        geu geuVar = this.i;
        geuVar.getClass();
        materialTitleHeaderView.b(geuVar, null, Action.BACK, null, true, null);
        materialTitleHeaderView.setPadding(materialTitleHeaderView.getPaddingLeft(), materialTitleHeaderView.getPaddingTop(), 0, materialTitleHeaderView.getPaddingBottom());
        MaterialTitleHeaderView materialTitleHeaderView2 = this.w;
        geuVar.getClass();
        materialTitleHeaderView2.b(geuVar, header != null ? header.getTitle() : null, header != null ? header.getStartHeaderAction() : null, header != null ? header.getEndHeaderActions() : null, true, acsx.N() ? ksa.a.a().c() : null);
        materialTitleHeaderView2.setPadding(0, materialTitleHeaderView2.getPaddingTop(), materialTitleHeaderView2.getPaddingRight(), materialTitleHeaderView2.getPaddingBottom());
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        super.z(windowInsets, 0);
    }
}
