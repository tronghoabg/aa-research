package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.CarText;
import androidx.car.app.serialization.ListDelegateImpl;
import defpackage.afbe;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gke;
import defpackage.gkf;
import defpackage.gkg;
import defpackage.rb;
import defpackage.uf;
import defpackage.uw;
import defpackage.uy;
import defpackage.xs;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u00101\u001a\u00020\u0015H\u0096\u0080\u0004J\n\u00102\u001a\u000203H\u0096\u0080\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u0015X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010&\u001a\u0004\u0018\u00010%X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00067"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/MenuSection;", "", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/MenuSection$Builder;", "(Lcom/android/car/libraries/apphost/external/model/MenuSection$Builder;)V", "value", "", "Landroidx/car/app/model/Item;", "items", "getItems", "()Ljava/util/List;", "Landroidx/car/app/serialization/ListDelegate;", "itemsDelegate", "getItemsDelegate", "()Landroidx/car/app/serialization/ListDelegate;", "", "noItemsMessage", "getNoItemsMessage", "()Ljava/lang/CharSequence;", "", "selectedIndex", "getSelectedIndex", "()I", "Landroidx/car/app/model/OnSelectedDelegate;", "onSelectedListener", "getOnSelectedListener", "()Landroidx/car/app/model/OnSelectedDelegate;", "Landroidx/car/app/model/OnItemVisibilityChangedDelegate;", "onItemVisibilityChangedListener", "getOnItemVisibilityChangedListener", "()Landroidx/car/app/model/OnItemVisibilityChangedDelegate;", "Lcom/android/car/libraries/apphost/external/model/MenuSection$ItemSize;", "itemSize", "getItemSize", "()Lcom/android/car/libraries/apphost/external/model/MenuSection$ItemSize;", "Landroidx/car/app/model/CarText;", "header", "getHeader", "()Landroidx/car/app/model/CarText;", "Lcom/android/car/libraries/apphost/external/model/MenuSection$TextAlign;", "textAlign", "getTextAlign", "()Lcom/android/car/libraries/apphost/external/model/MenuSection$TextAlign;", "toBuilder", "equals", "", "other", "hashCode", "toString", "", "ItemSize", "TextAlign", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class MenuSection {
    private CarText header;
    private gkf itemSize;
    private List<? extends uf> items;
    private xs<? extends uf> itemsDelegate;
    private CharSequence noItemsMessage;
    private uw onItemVisibilityChangedListener;
    private uy onSelectedListener;
    private int selectedIndex;
    private gkg textAlign;

    private MenuSection(gke gkeVar) {
        this();
        this.items = gkeVar.i ? afbe.a : gkeVar.a;
        xs<? extends uf> xsVar = gkeVar.b;
        this.itemsDelegate = xsVar == null ? new ListDelegateImpl<>(gkeVar.a) : xsVar;
        this.noItemsMessage = gkeVar.c;
        this.selectedIndex = gkeVar.d;
        this.onSelectedListener = gkeVar.e;
        this.onItemVisibilityChangedListener = gkeVar.f;
        this.itemSize = gkeVar.g;
        this.header = gkeVar.h;
        this.textAlign = gkeVar.j;
    }

    public boolean equals(Object other) {
        if (!(other instanceof MenuSection)) {
            return false;
        }
        MenuSection menuSection = (MenuSection) other;
        return affa.f(getItems(), menuSection.getItems()) && affa.f(this.noItemsMessage, menuSection.noItemsMessage) && this.selectedIndex == menuSection.selectedIndex && affa.f(this.onSelectedListener, menuSection.onSelectedListener) && affa.f(this.onItemVisibilityChangedListener, menuSection.onItemVisibilityChangedListener) && getItemSize() == menuSection.getItemSize() && affa.f(this.header, menuSection.header) && this.textAlign == menuSection.textAlign;
    }

    public final CarText getHeader() {
        return this.header;
    }

    public final gkf getItemSize() {
        gkf gkfVar = this.itemSize;
        if (gkfVar != null) {
            return gkfVar;
        }
        affa.d("itemSize");
        return null;
    }

    public final List<uf> getItems() {
        List list = this.items;
        if (list != null) {
            return list;
        }
        affa.d("items");
        return null;
    }

    public final xs<uf> getItemsDelegate() {
        xs xsVar = this.itemsDelegate;
        if (xsVar != null) {
            return xsVar;
        }
        affa.d("itemsDelegate");
        return null;
    }

    public final CharSequence getNoItemsMessage() {
        return this.noItemsMessage;
    }

    public final uw getOnItemVisibilityChangedListener() {
        return this.onItemVisibilityChangedListener;
    }

    public final uy getOnSelectedListener() {
        return this.onSelectedListener;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final gkg getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        return Objects.hash(getItems(), this.noItemsMessage, Integer.valueOf(this.selectedIndex), this.onSelectedListener, this.onItemVisibilityChangedListener, getItemSize(), this.header, this.textAlign);
    }

    public final gke toBuilder() {
        gke gkeVar = new gke(getItems());
        gkeVar.c = this.noItemsMessage;
        gkeVar.b = getItemsDelegate();
        gkeVar.d = this.selectedIndex;
        gkeVar.e = this.onSelectedListener;
        gkeVar.f = this.onItemVisibilityChangedListener;
        gkeVar.a(getItemSize());
        gkeVar.h = this.header;
        gkeVar.b(this.textAlign);
        return gkeVar;
    }

    public String toString() {
        int size = getItems().size();
        CharSequence charSequence = this.noItemsMessage;
        return "MenuSection([" + size + " items], " + ((Object) charSequence) + ", " + this.selectedIndex + ", " + this.onSelectedListener + ", " + this.onItemVisibilityChangedListener + ", " + getItemSize() + ", " + this.header + ", " + this.textAlign + ")";
    }

    public /* synthetic */ MenuSection(gke gkeVar, afeu afeuVar) {
        this(gkeVar);
    }

    private MenuSection() {
        this.textAlign = gkg.a;
    }
}
