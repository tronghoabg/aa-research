package com.android.car.libraries.apphost.external.model.widgets;

import androidx.car.app.model.Action;
import androidx.car.app.model.Badge;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.afbe;
import defpackage.afeu;
import defpackage.affa;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0082\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u0096\u0080\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/android/car/libraries/apphost/external/model/widgets/PaneWidget;", "Landroidx/car/app/model/Template;", "headerIcon", "Landroidx/car/app/model/CarIcon;", "headerText", "Landroidx/car/app/model/CarText;", "headerAction", "Landroidx/car/app/model/Action;", "paneText", "actions", "", "headerIconBadge", "Landroidx/car/app/model/Badge;", "<init>", "(Landroidx/car/app/model/CarIcon;Landroidx/car/app/model/CarText;Landroidx/car/app/model/Action;Landroidx/car/app/model/CarText;Ljava/util/List;Landroidx/car/app/model/Badge;)V", "getHeaderIcon", "()Landroidx/car/app/model/CarIcon;", "getHeaderText", "()Landroidx/car/app/model/CarText;", "getHeaderAction", "()Landroidx/car/app/model/Action;", "getPaneText", "getActions", "()Ljava/util/List;", "getHeaderIconBadge", "()Landroidx/car/app/model/Badge;", "equals", "", "other", "", "hashCode", "", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model.widgets_widgets"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class PaneWidget implements wb {
    private final List<Action> actions;
    private final Action headerAction;
    private final CarIcon headerIcon;
    private final Badge headerIconBadge;
    private final CarText headerText;
    private final CarText paneText;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaneWidget(CarIcon carIcon, CarText carText, Action action, CarText carText2, List list, Badge badge, int i, afeu afeuVar) {
        List list2 = (i & 16) != 0 ? afbe.a : list;
        int i2 = i & 4;
        int i3 = i & 2;
        int i4 = i & 1;
        CarText carText3 = (i & 8) != 0 ? null : carText2;
        Action action2 = i2 != 0 ? null : action;
        this(1 == i4 ? null : carIcon, i3 != 0 ? null : carText, action2, carText3, list2, (i & 32) != 0 ? null : badge);
    }

    public boolean equals(Object other) {
        if (!(other instanceof PaneWidget)) {
            return false;
        }
        PaneWidget paneWidget = (PaneWidget) other;
        return affa.f(this.headerIcon, paneWidget.headerIcon) && affa.f(this.headerIconBadge, paneWidget.headerIconBadge) && affa.f(this.headerText, paneWidget.headerText) && affa.f(this.headerAction, paneWidget.headerAction) && affa.f(this.paneText, paneWidget.paneText) && affa.f(this.actions, paneWidget.actions);
    }

    public final List<Action> getActions() {
        return this.actions;
    }

    public final Action getHeaderAction() {
        return this.headerAction;
    }

    public final CarIcon getHeaderIcon() {
        return this.headerIcon;
    }

    public final Badge getHeaderIconBadge() {
        return this.headerIconBadge;
    }

    public final CarText getHeaderText() {
        return this.headerText;
    }

    public final CarText getPaneText() {
        return this.paneText;
    }

    public int hashCode() {
        return Objects.hash(this.headerIcon, this.headerIconBadge, this.headerText, this.paneText, this.actions);
    }

    public PaneWidget(CarIcon carIcon, CarText carText, Action action, CarText carText2, List<Action> list, Badge badge) {
        list.getClass();
        this.headerIcon = carIcon;
        this.headerText = carText;
        this.headerAction = action;
        this.paneText = carText2;
        this.actions = list;
        this.headerIconBadge = badge;
        if (carIcon == null && badge != null) {
            throw new IllegalArgumentException("headerIconBadge cannot be set if headerIcon is null. Badge requires an associated icon.");
        }
    }

    public PaneWidget() {
        this(null, null, null, null, null, null, 63, null);
    }
}
