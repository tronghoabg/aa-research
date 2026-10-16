package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.auto.components.coolwalk.card.CoolwalkCardView;
import com.google.android.apps.auto.components.system.dashboard.design.DashboardCardView;
import com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mzu extends mvr {
    static final /* synthetic */ afia[] a = {new affn(mzu.class, "parent", "getParent()Lcom/google/android/apps/auto/components/system/dashboard/media/MediaPlayerFragment$Holder;", 0)};
    public static final /* synthetic */ int b = 0;
    private final afgl e;
    private final aezr f;

    public mzu() {
        super(R.layout.frag_dash_media_loading);
        getLifecycle().c(new mzq(this, 2));
        this.e = new mzr(this, 2);
        this.f = woy.dG(new mzp(new mvg(this, 16), esa.a, this, 2));
    }

    private static final void c(eqj eqjVar, mzu mzuVar, afec afecVar) {
        eqjVar.fE(mzuVar.getViewLifecycleOwner(), new med(afecVar, 10));
    }

    public final mzi a() {
        return (mzi) this.e.getValue(this, a[0]);
    }

    public final mzt b() {
        return (mzt) this.f.a();
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
        View viewFindViewById = view.findViewById(R.id.primary_target);
        viewFindViewById.getClass();
        viewFindViewById.setFocusedByDefault(true);
        int i = 14;
        b().d.fE(getViewLifecycleOwner(), new med(new lyb(viewFindViewById, this, i, null), 10));
        CoolwalkCardView coolwalkCardView = ((DashboardCardView) view.findViewById(R.id.dash_media_card)).a;
        ImageView imageView = (ImageView) view.findViewById(R.id.source_badge);
        ColorStateList colorStateListE = coolwalkCardView.e();
        colorStateListE.getClass();
        b().f.fE(getViewLifecycleOwner(), new med(new hgf(colorStateListE, coolwalkCardView, playPauseStopCoolwalkButton, 20, (int[]) null), 10));
        c(b().e, this, new mzg(imageView, 13));
        c(b().b(), this, new mzg(imageView, i));
    }
}
