package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.TemplateWrapper;
import com.google.android.apps.auto.components.apphost.signin.MaterialCarRestrictedEditText;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialSearchHeaderView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class kbu extends hlf implements gkt {
    public final gku a;
    public final MaterialSearchHeaderView b;
    public final ContentView c;
    public final Handler d;
    public boolean e;
    public boolean f;
    private final ViewGroup g;
    private final kbt h;
    private boolean p;
    private final View.OnClickListener q;
    private final View.OnClickListener r;

    static {
        yph.c("CarApp.H.Tem");
    }

    public kbu(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        Handler handler = new Handler(Looper.getMainLooper(), new gly(this, 4));
        this.d = handler;
        this.e = false;
        this.p = false;
        this.a = geuVar.j();
        byte[] bArr = null;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.material_search_template_layout, (ViewGroup) null);
        this.g = viewGroup;
        MaterialSearchHeaderView materialSearchHeaderView = (MaterialSearchHeaderView) viewGroup.findViewById(R.id.search_header);
        this.b = materialSearchHeaderView;
        this.c = (ContentView) viewGroup.findViewById(R.id.content_view);
        hjr hjrVar = (hjr) geuVar.l(hjr.class);
        hjrVar.getClass();
        if (hjrVar.b()) {
            this.h = (geuVar.x().a() || geuVar.x().b()) ? kbt.VOICE_TRANSCRIPTION : kbt.VOICE_TRANSCRIPTION_ROTARY;
        } else {
            this.h = kbt.SEARCH_NOT_PERMITTED;
        }
        jmq jmqVar = new jmq(this, hjrVar, 3, bArr);
        this.q = jmqVar;
        ie ieVar = new ie(this, 15, bArr);
        this.r = ieVar;
        materialSearchHeaderView.a.setOnClickListener(ieVar);
        SearchTemplate searchTemplate = (SearchTemplate) templateWrapper.getTemplate();
        if (searchTemplate.getInitialSearchText() != null) {
            String initialSearchText = searchTemplate.getInitialSearchText();
            initialSearchText.getClass();
            materialSearchHeaderView.g.setText(initialSearchText);
            materialSearchHeaderView.g.setSelection(materialSearchHeaderView.b().length());
        }
        materialSearchHeaderView.g.setOnEditorActionListener(new lbf(this, 1, bArr));
        materialSearchHeaderView.g.addTextChangedListener(new lbe(this, 1));
        if (hjrVar.b()) {
            materialSearchHeaderView.f.setVisibility(0);
            materialSearchHeaderView.f.setOnClickListener(jmqVar);
            materialSearchHeaderView.setOnClickListener(jmqVar);
        }
        if (searchTemplate.isShowKeyboardByDefault() && geuVar.w().b) {
            handler.sendMessageDelayed(handler.obtainMessage(2), 200L);
        }
    }

    private final void m(boolean z) {
        hjr hjrVar = (hjr) this.i.l(hjr.class);
        hjrVar.getClass();
        if (hjrVar.b()) {
            MaterialSearchHeaderView materialSearchHeaderView = this.b;
            if (z) {
                materialSearchHeaderView.e.setFocusable(false);
                View.OnClickListener onClickListener = this.r;
                LinearLayout linearLayout = materialSearchHeaderView.a;
                linearLayout.setOnClickListener(onClickListener);
                linearLayout.setFocusable(true);
                materialSearchHeaderView.f.setFocusable(true);
            } else {
                LinearLayout linearLayout2 = materialSearchHeaderView.e;
                linearLayout2.setFocusable(true);
                View.OnClickListener onClickListener2 = this.q;
                LinearLayout linearLayout3 = materialSearchHeaderView.a;
                linearLayout3.setOnClickListener(onClickListener2);
                linearLayout2.setOnClickListener(onClickListener2);
                linearLayout3.setFocusable(false);
                materialSearchHeaderView.f.setFocusable(false);
            }
        } else {
            this.b.setEnabled(z);
        }
        p(z);
    }

    private final void p(boolean z) {
        kbt kbtVar = z ? kbt.KEYBOARD : this.h;
        String searchHint = ((SearchTemplate) C()).getSearchHint();
        MaterialSearchHeaderView materialSearchHeaderView = this.b;
        geu geuVar = this.i;
        if (!kbtVar.e || searchHint == null) {
            searchHint = geuVar.getString(kbtVar.f);
        }
        MaterialCarRestrictedEditText materialCarRestrictedEditText = materialSearchHeaderView.g;
        materialCarRestrictedEditText.setHint(searchHint);
        LinearLayout linearLayout = materialSearchHeaderView.a;
        float f = kbtVar == kbt.SEARCH_NOT_PERMITTED ? 0.38f : 1.0f;
        linearLayout.setAlpha(f);
        materialSearchHeaderView.f.setAlpha(f);
        materialSearchHeaderView.e.getBackground().setAlpha(255);
        materialCarRestrictedEditText.setHint(materialCarRestrictedEditText.getHint());
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void A() {
        gku gkuVar = this.a;
        if (gkuVar.c()) {
            gkuVar.b();
        }
        this.p = false;
        this.d.removeMessages(1);
        super.A();
    }

    @Override // defpackage.hlf
    protected final View a() {
        MaterialSearchHeaderView materialSearchHeaderView = this.b;
        LinearLayout linearLayout = materialSearchHeaderView.a;
        if (linearLayout.isEnabled()) {
            return linearLayout;
        }
        ContentView contentView = this.c;
        return contentView.getVisibility() == 0 ? contentView : materialSearchHeaderView.getVisibility() == 0 ? materialSearchHeaderView : this.g;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void c() {
        super.c();
        geu geuVar = this.i;
        gjv gjvVarB = geuVar.B();
        gjvVarB.b(this, 5, new kbs(this, 0));
        gjvVarB.b(this, 4, new kbs(this, 2));
        gjvVarB.b(this, 6, new kbs(this, 3));
        geuVar.w();
        boolean zB = jwl.b();
        this.e = zB;
        f(!zB);
    }

    @Override // defpackage.hlf
    public final void d() {
        h();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.g;
    }

    public final void f(boolean z) {
        Handler handler = this.d;
        handler.removeMessages(1);
        if (z) {
            m(true);
            if (this.p) {
                this.b.a.requestFocus();
                this.a.a(this);
            }
            this.p = false;
            return;
        }
        MaterialSearchHeaderView materialSearchHeaderView = this.b;
        hlf.J(yfq.q(materialSearchHeaderView.a), yfq.r(this.c, materialSearchHeaderView), false);
        m(false);
        if (this.a.c()) {
            this.p = true;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    @Override // defpackage.hlf
    public final void g(hlf hlfVar, View view) {
        this.b.setVisibility(8);
        super.g(hlfVar, view);
    }

    public final void h() {
        List<Action> actions;
        boolean z;
        SearchTemplate searchTemplate = (SearchTemplate) C();
        p(!this.e);
        if (searchTemplate.getActionStrip() != null) {
            ActionStrip actionStrip = searchTemplate.getActionStrip();
            actionStrip.getClass();
            actions = actionStrip.getActions();
        } else {
            int i = yfq.d;
            actions = yls.a;
        }
        geu geuVar = this.i;
        hlf hlfVar = this.m;
        MaterialSearchHeaderView materialSearchHeaderView = this.b;
        if (hlfVar != null) {
            materialSearchHeaderView.setVisibility(8);
        } else {
            Action headerAction = searchTemplate.getHeaderAction();
            geuVar.getClass();
            kds.e(materialSearchHeaderView, geuVar, headerAction, actions, 8);
        }
        ItemList itemList = searchTemplate.getItemList();
        if (itemList == null || itemList.getItems().isEmpty()) {
            CarText noItemsMessage = itemList != null ? itemList.getNoItemsMessage() : null;
            CharSequence string = noItemsMessage == null ? geuVar.getString(R.string.template_list_no_items) : noItemsMessage.toCharSequence();
            ug ugVar = new ug();
            vf vfVar = new vf();
            vfVar.i(string);
            ugVar.b(vfVar.a());
            itemList = ugVar.a();
            z = true;
        } else {
            z = false;
        }
        hih hihVarD = guo.d(geuVar, itemList);
        hihVarD.i = searchTemplate.isLoading();
        hihVarD.a();
        hihVarD.f = ghz.c;
        hihVarD.j = this.k.isRefresh();
        if (z) {
            hihVarD.e = 32;
            hihVarD.p = true;
        }
        this.c.b(geuVar, new hii(hihVarD));
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        if (i == 19) {
            ContentView contentView = this.c;
            MaterialSearchHeaderView materialSearchHeaderView = this.b;
            if (hlf.J(yfq.q(contentView), yfq.r(materialSearchHeaderView.a, materialSearchHeaderView.b), false)) {
                return true;
            }
        } else if (i == 20) {
            MaterialSearchHeaderView materialSearchHeaderView2 = this.b;
            if (hlf.J(yfq.s(materialSearchHeaderView2.b, materialSearchHeaderView2.a, materialSearchHeaderView2.c), yfq.q(this.c), false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void n() {
        gjv gjvVarB = this.i.B();
        gjvVarB.c(this, 5);
        gjvVarB.c(this, 4);
        gjvVarB.c(this, 6);
        super.n();
    }

    @Override // defpackage.gkt, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.b.onCreateInputConnection(editorInfo);
    }

    @Override // defpackage.gkt
    public final void fs(gms gmsVar) {
    }
}
