package com.android.car.libraries.apphost.external.model.widgets;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import defpackage.afbe;
import defpackage.afeu;
import defpackage.affa;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/widgets/ItemWidget;", "Landroidx/car/app/model/Template;", "items", "", "Landroidx/car/app/model/GridItem;", "title", "Landroidx/car/app/model/CarText;", "action", "Landroidx/car/app/model/Action;", "headerAction", "<init>", "(Ljava/util/List;Landroidx/car/app/model/CarText;Landroidx/car/app/model/Action;Landroidx/car/app/model/Action;)V", "getItems", "()Ljava/util/List;", "getTitle", "()Landroidx/car/app/model/CarText;", "getAction", "()Landroidx/car/app/model/Action;", "getHeaderAction", "equals", "", "other", "", "hashCode", "", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model.widgets_widgets"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class ItemWidget implements wb {
    private final Action action;
    private final Action headerAction;
    private final List<GridItem> items;
    private final CarText title;

    public ItemWidget(List<GridItem> list, CarText carText, Action action, Action action2) {
        list.getClass();
        this.items = list;
        this.title = carText;
        this.action = action;
        this.headerAction = action2;
        if (list.size() > 3) {
            throw new IllegalArgumentException("ItemWidget must have 1 to 3 items");
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof ItemWidget)) {
            return false;
        }
        ItemWidget itemWidget = (ItemWidget) other;
        return affa.f(this.title, itemWidget.title) && affa.f(this.items, itemWidget.items) && affa.f(this.action, itemWidget.action) && affa.f(this.headerAction, itemWidget.headerAction);
    }

    public final Action getAction() {
        return this.action;
    }

    public final Action getHeaderAction() {
        return this.headerAction;
    }

    public final List<GridItem> getItems() {
        return this.items;
    }

    public final CarText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Objects.hash(this.title, this.items, this.action, this.headerAction);
    }

    public ItemWidget() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ItemWidget(List list, CarText carText, Action action, Action action2, int i, afeu afeuVar) {
        this((i & 1) != 0 ? afbe.a : list, (i & 2) != 0 ? null : carText, (i & 4) != 0 ? null : action, (i & 8) != 0 ? null : action2);
    }
}
