package com.android.car.libraries.apphost.external.model.widgets;

import androidx.car.app.model.Action;
import androidx.car.app.model.Badge;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.affa;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000BS\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0082\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u0096\u0080\u0004R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/android/car/libraries/apphost/external/model/widgets/ActionsWidget;", "Landroidx/car/app/model/Template;", "actions", "", "Landroidx/car/app/model/Action;", "headerAction", "titlePrimary", "Landroidx/car/app/model/CarText;", "titleSecondary", "titleIcon", "Landroidx/car/app/model/CarIcon;", "badge", "Landroidx/car/app/model/Badge;", "<init>", "(Ljava/util/List;Landroidx/car/app/model/Action;Landroidx/car/app/model/CarText;Landroidx/car/app/model/CarText;Landroidx/car/app/model/CarIcon;Landroidx/car/app/model/Badge;)V", "getActions", "()Ljava/util/List;", "getHeaderAction", "()Landroidx/car/app/model/Action;", "getTitlePrimary", "()Landroidx/car/app/model/CarText;", "getTitleSecondary", "getTitleIcon", "()Landroidx/car/app/model/CarIcon;", "getBadge", "()Landroidx/car/app/model/Badge;", "equals", "", "other", "", "hashCode", "", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model.widgets_widgets"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class ActionsWidget implements wb {
    private final List<Action> actions;
    private final Badge badge;
    private final Action headerAction;
    private final CarIcon titleIcon;
    private final CarText titlePrimary;
    private final CarText titleSecondary;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ActionsWidget(java.util.List r2, androidx.car.app.model.Action r3, androidx.car.app.model.CarText r4, androidx.car.app.model.CarText r5, androidx.car.app.model.CarIcon r6, androidx.car.app.model.Badge r7, int r8, defpackage.afeu r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            afbe r2 = defpackage.afbe.a
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.car.libraries.apphost.external.model.widgets.ActionsWidget.<init>(java.util.List, androidx.car.app.model.Action, androidx.car.app.model.CarText, androidx.car.app.model.CarText, androidx.car.app.model.CarIcon, androidx.car.app.model.Badge, int, afeu):void");
    }

    public boolean equals(Object other) {
        if (!(other instanceof ActionsWidget)) {
            return false;
        }
        ActionsWidget actionsWidget = (ActionsWidget) other;
        return affa.f(this.actions, actionsWidget.actions) && affa.f(this.headerAction, actionsWidget.headerAction) && affa.f(this.titlePrimary, actionsWidget.titlePrimary) && affa.f(this.titleSecondary, actionsWidget.titleSecondary) && affa.f(this.titleIcon, actionsWidget.titleIcon) && affa.f(this.badge, actionsWidget.badge);
    }

    public final List<Action> getActions() {
        return this.actions;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final Action getHeaderAction() {
        return this.headerAction;
    }

    public final CarIcon getTitleIcon() {
        return this.titleIcon;
    }

    public final CarText getTitlePrimary() {
        return this.titlePrimary;
    }

    public final CarText getTitleSecondary() {
        return this.titleSecondary;
    }

    public int hashCode() {
        return Objects.hash(this.actions, this.headerAction, this.titlePrimary, this.titleSecondary, this.titleIcon, this.badge);
    }

    public ActionsWidget(List<Action> list, Action action, CarText carText, CarText carText2, CarIcon carIcon, Badge badge) {
        list.getClass();
        this.actions = list;
        this.headerAction = action;
        this.titlePrimary = carText;
        this.titleSecondary = carText2;
        this.titleIcon = carIcon;
        this.badge = badge;
    }

    public ActionsWidget() {
        this(null, null, null, null, null, null, 63, null);
    }
}
