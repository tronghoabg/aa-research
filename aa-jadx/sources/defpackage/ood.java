package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ood implements defpackage.oob {
    final /* synthetic */ com.google.android.apps.auto.components.ui.widget.Button a;
    private final /* synthetic */ int b;

    public ood(com.google.android.apps.auto.components.ui.widget.Button button, int i) {
        this.b = i;
        this.a = button;
    }

    @Override // defpackage.oob
    public final int a() {
        int i = this.b;
        com.google.android.apps.auto.components.ui.widget.Button button = this.a;
        return i != 0 ? button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.medium_button_visible_height) : button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.small_button_visible_height);
    }

    @Override // defpackage.oob
    public final int b() {
        int i = this.b;
        com.google.android.apps.auto.components.ui.widget.Button button = this.a;
        return i != 0 ? button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.medium_button_icon_only_margin) : button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.small_button_icon_only_margin);
    }

    @Override // defpackage.oob
    public final int c() {
        int i = this.b;
        com.google.android.apps.auto.components.ui.widget.Button button = this.a;
        return i != 0 ? button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.medium_button_text_to_end_with_icon) : button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.small_button_text_to_end_with_icon);
    }

    @Override // defpackage.oob
    public final int d() {
        int i = this.b;
        com.google.android.apps.auto.components.ui.widget.Button button = this.a;
        return i != 0 ? button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.medium_button_edge_to_icon_start) : button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.small_button_edge_to_icon_start);
    }

    @Override // defpackage.oob
    public final int e() {
        int i = this.b;
        com.google.android.apps.auto.components.ui.widget.Button button = this.a;
        return i != 0 ? button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.medium_button_text_only_margin) : button.getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.small_button_text_only_margin);
    }
}
