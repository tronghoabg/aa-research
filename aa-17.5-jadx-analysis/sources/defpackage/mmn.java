package defpackage;

import android.content.Intent;
import com.google.android.apps.auto.components.settings.ui.CarSettingsService;

/* loaded from: classes2.dex */
public final class mmn extends qz {
    final /* synthetic */ CarSettingsService c;

    public mmn(CarSettingsService carSettingsService) {
        this.c = carSettingsService;
    }

    @Override // defpackage.qz
    public final qw b(Intent intent) {
        intent.getClass();
        return new mmm(this.c, a());
    }
}
