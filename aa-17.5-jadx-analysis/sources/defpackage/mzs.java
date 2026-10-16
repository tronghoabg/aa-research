package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.coolwalk.card.CoolwalkCardView;
import com.google.android.apps.auto.components.system.dashboard.design.DashboardCardView;
import com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mzs extends mvr {
    static final /* synthetic */ afia[] a = {new affn(mzs.class, "parent", "getParent()Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragment$Holder;", 0)};
    public static final /* synthetic */ int b = 0;
    private final afgl e;
    private final aezr f;

    public mzs() {
        super(R.layout.frag_dash_media);
        getLifecycle().c(new mzq(this, 0));
        this.e = new mzr(this, 0);
        this.f = woy.dG(new mzp(new mvg(this, 15), esa.a, this, 0));
    }

    private static final void c(eqj eqjVar, mzs mzsVar, afec afecVar) {
        eqjVar.fE(mzsVar.getViewLifecycleOwner(), new med(afecVar, 9));
    }

    public final mzi a() {
        return (mzi) this.e.getValue(this, a[0]);
    }

    public final mzo b() {
        return (mzo) this.f.a();
    }

    @Override // defpackage.tef
    public final void e(View view) {
        view.getClass();
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.action_left);
        materialButton.j(2131233155);
        materialButton.setEnabled(false);
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.action_right);
        materialButton2.j(2131233154);
        materialButton2.setEnabled(false);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) view.findViewById(R.id.progress);
        linearProgressIndicator.k();
        linearProgressIndicator.setEnabled(false);
        PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton = (PlayPauseStopCoolwalkButton) view.findViewById(R.id.play_pause);
        playPauseStopCoolwalkButton.setEnabled(false);
        playPauseStopCoolwalkButton.setFocusedByDefault(false);
        View viewFindViewById = view.findViewById(R.id.source_badge);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        viewFindViewById2.getClass();
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.primary_target);
        viewFindViewById4.getClass();
        View viewFindViewById5 = view.findViewById(R.id.text_container_wrapper);
        viewFindViewById5.getClass();
        viewFindViewById5.setFocusedByDefault(true);
        b().d.fE(getViewLifecycleOwner(), new med(new nck(viewFindViewById4, viewFindViewById5, textView, this, 1), 9));
        b().g.fE(getViewLifecycleOwner(), new med(new mzg(textView, 9), 9));
        b().f.fE(getViewLifecycleOwner(), new med(new mzg((TextView) viewFindViewById2, 10), 9));
        CoolwalkCardView coolwalkCardView = ((DashboardCardView) view.findViewById(R.id.dash_media_card)).a;
        ColorStateList colorStateListE = coolwalkCardView.e();
        colorStateListE.getClass();
        b().i.fE(getViewLifecycleOwner(), new med(new hgf(colorStateListE, coolwalkCardView, playPauseStopCoolwalkButton, 19, (int[]) null), 9));
        c(b().e, this, new mzg(imageView, 11));
        c(b().b(), this, new mzg(imageView, 12));
    }
}
