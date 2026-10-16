package com.android.car.libraries.apphost.external.model.widgets;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.afeu;
import defpackage.affa;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/widgets/VoicePlateWidget;", "Landroidx/car/app/model/Template;", "action", "Landroidx/car/app/model/Action;", "icon", "Landroidx/car/app/model/CarIcon;", "placeholderText", "Landroidx/car/app/model/CarText;", "<init>", "(Landroidx/car/app/model/Action;Landroidx/car/app/model/CarIcon;Landroidx/car/app/model/CarText;)V", "getAction", "()Landroidx/car/app/model/Action;", "getIcon", "()Landroidx/car/app/model/CarIcon;", "getPlaceholderText", "()Landroidx/car/app/model/CarText;", "equals", "", "other", "", "hashCode", "", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model.widgets_widgets"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class VoicePlateWidget implements wb {
    private final Action action;
    private final CarIcon icon;
    private final CarText placeholderText;

    public /* synthetic */ VoicePlateWidget(Action action, CarIcon carIcon, CarText carText, int i, afeu afeuVar) {
        this(1 == (i & 1) ? null : action, (i & 2) != 0 ? null : carIcon, (i & 4) != 0 ? null : carText);
    }

    public boolean equals(Object other) {
        if (!(other instanceof VoicePlateWidget)) {
            return false;
        }
        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) other;
        return affa.f(this.action, voicePlateWidget.action) && affa.f(this.icon, voicePlateWidget.icon) && affa.f(this.placeholderText, voicePlateWidget.placeholderText);
    }

    public final Action getAction() {
        return this.action;
    }

    public final CarIcon getIcon() {
        return this.icon;
    }

    public final CarText getPlaceholderText() {
        return this.placeholderText;
    }

    public int hashCode() {
        return Objects.hash(this.action, this.icon, this.placeholderText);
    }

    public VoicePlateWidget(Action action, CarIcon carIcon, CarText carText) {
        this.action = action;
        this.icon = carIcon;
        this.placeholderText = carText;
    }

    public VoicePlateWidget() {
        this(null, null, null, 7, null);
    }
}
