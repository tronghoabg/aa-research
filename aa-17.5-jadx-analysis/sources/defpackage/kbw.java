package defpackage;

import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.TemplateWrapper;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentModerationWrapperLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.HeaderView;
import com.google.android.gms.car.CarInfo;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kbw extends hlf {
    public final ViewGroup a;
    public final ViewGroup b;
    private final ViewGroup c;
    private final ViewGroup d;
    private final HeaderView e;
    private final ViewGroup f;
    private final CarTextView g;
    private final TextView h;
    private final ImageView p;
    private final ActionButtonListView q;
    private final hmb r;
    private final float s;
    private final boolean t;
    private final Switch u;
    private final ActionStripView v;
    private final ViewGroup w;
    private final boolean x;
    private final View y;

    public kbw(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        boolean zA = gzcVar.a();
        this.x = zA;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(true != zA ? R.layout.message_template_layout : R.layout.message_template_map_content_screen_layout, (ViewGroup) null);
        this.c = viewGroup;
        this.f = (ViewGroup) viewGroup.findViewById(R.id.progress_container);
        this.g = (CarTextView) viewGroup.findViewById(R.id.message_text);
        this.a = (ViewGroup) viewGroup.findViewById(R.id.stack_trace_container);
        this.h = (TextView) viewGroup.findViewById(R.id.stack_trace);
        this.p = (ImageView) viewGroup.findViewById(R.id.message_icon);
        this.e = (HeaderView) viewGroup.findViewById(R.id.header_view);
        this.v = (ActionStripView) viewGroup.findViewById(R.id.action_strip);
        this.d = (ViewGroup) viewGroup.findViewById(R.id.header_container);
        this.u = (Switch) viewGroup.findViewById(R.id.debug_toggle);
        this.w = (ViewGroup) viewGroup.findViewById(R.id.debug_toggle_container);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content_container);
        this.b = viewGroup2;
        this.y = viewGroup.findViewById(R.id.row_action_list_divider);
        int[] iArr = {R.attr.templateMessageDefaultIconTint, R.attr.templateAdaptiveWidthFraction};
        int i = this.i.getResources().getConfiguration().screenHeightDp;
        int i2 = R.id.action_button_list_view;
        if (zA && i > 370) {
            i2 = R.id.action_button_list_view_stacked;
        }
        this.q = (ActionButtonListView) viewGroup.findViewById(i2);
        TypedArray typedArrayObtainStyledAttributes = geuVar.obtainStyledAttributes(iArr);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(1, BitmapDescriptorFactory.HUE_RED);
        this.s = f;
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        this.r = new hmb(color, false, false, ghw.b, null, false, 0);
        CarInfo carInfoB = juw.b().b();
        this.t = carInfoB != null && woy.at("google", woy.al(carInfoB.a));
        if (!zA) {
            int iC = jtq.c(this.i, f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup2.getLayoutParams();
            layoutParams.setMarginStart(iC);
            layoutParams.setMarginEnd(iC);
            viewGroup2.setLayoutParams(layoutParams);
        }
        ((ContentModerationWrapperLayout) viewGroup2.findViewById(R.id.park_only_container)).a(geuVar, this.k);
    }

    @Override // defpackage.hlf
    protected final View a() {
        ActionButtonListView actionButtonListView = this.q;
        if (actionButtonListView.getVisibility() == 0) {
            return actionButtonListView;
        }
        HeaderView headerView = this.e;
        return headerView.getVisibility() == 0 ? headerView : this.c;
    }

    @Override // defpackage.hlf
    public final void d() throws kdb {
        f();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.c;
    }

    public final void f() throws kdb {
        ActionStrip actionStripA;
        ActionStrip actionStrip;
        MessageTemplate messageTemplate = (MessageTemplate) C();
        CarText message = messageTemplate.getMessage();
        boolean zIsLoading = messageTemplate.isLoading();
        CarText debugMessage = messageTemplate.getDebugMessage();
        List<Action> actions = messageTemplate.getActions();
        CarIcon icon = messageTemplate.getIcon();
        Header header = messageTemplate.getHeader();
        List<Action> endHeaderActions = (header == null || header.getEndHeaderActions().isEmpty()) ? null : header.getEndHeaderActions();
        if (endHeaderActions == null) {
            actionStripA = null;
        } else {
            sx sxVar = new sx();
            Iterator<Action> it = endHeaderActions.iterator();
            while (it.hasNext()) {
                sxVar.b(it.next());
            }
            actionStripA = sxVar.a();
        }
        boolean z = this.x;
        if (z) {
            CharSequence charSequenceC = hlb.c(messageTemplate.getMessage());
            message = charSequenceC != null ? CarText.create(charSequenceC) : null;
            actionStrip = null;
        } else {
            actionStrip = actionStripA;
            endHeaderActions = null;
        }
        if (this.m != null || header == null) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.e.a(this.i, header.getTitle(), header.getStartHeaderAction(), endHeaderActions);
        }
        geu geuVar = this.i;
        boolean zIsNullOrEmpty = CarText.isNullOrEmpty(message);
        CarTextView carTextView = this.g;
        if (zIsNullOrEmpty) {
            carTextView.setVisibility(8);
        } else {
            carTextView.a(geuVar, message);
            carTextView.setVisibility(0);
            carTextView.setFocusable(messageTemplate.getActions().isEmpty());
        }
        ViewGroup viewGroup = this.f;
        if (zIsLoading) {
            viewGroup.setVisibility(0);
            this.p.setVisibility(8);
        } else {
            viewGroup.setVisibility(8);
            boolean zJ = icon != null;
            if (zJ) {
                zJ = hbz.j(geuVar, icon, this.p, this.r);
            }
            this.p.setVisibility(true != zJ ? 8 : 0);
        }
        if (actions.isEmpty()) {
            this.q.setVisibility(8);
        } else {
            if (z) {
                this.y.setVisibility(0);
            }
            ActionButtonListView actionButtonListView = this.q;
            actionButtonListView.a(geuVar, actions, 2);
            actionButtonListView.setVisibility(0);
        }
        this.v.b(geuVar, actionStrip, ghu.a, false, false);
        if (!this.t || CarText.isNullOrEmpty(debugMessage) || z) {
            this.w.setVisibility(8);
            this.a.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        this.w.setVisibility(0);
        this.u.setOnCheckedChangeListener(new eyj(this, 3, null));
        this.h.setText(hlb.d(geuVar, debugMessage));
        this.a.setVisibility(0);
    }

    @Override // defpackage.hlf
    public final void g(hlf hlfVar, View view) {
        this.d.setVisibility(8);
        super.g(hlfVar, view);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        if (i == 19) {
            if (hlf.J(yfq.r(this.q, this.a), yfq.q(this.e), false)) {
                return true;
            }
        } else if (i == 20) {
            if (hlf.J(yfq.q(this.e), yfq.q(this.q), false)) {
                return true;
            }
        }
        return false;
    }
}
