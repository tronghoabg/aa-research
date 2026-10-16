package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gjp;
import defpackage.rb;
import defpackage.uc;
import defpackage.uf;
import j$.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0082\u0004J\n\u0010 \u001a\u00020\u0012H\u0096\u0080\u0004J\n\u0010!\u001a\u00020\"H\u0096\u0080\u0004R\u0014\u0010\t\u001a\u00020\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u0012X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0012X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006%"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/CheckoutItem;", "Landroidx/car/app/model/Item;", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/CheckoutItem$Builder;", "(Lcom/android/car/libraries/apphost/external/model/CheckoutItem$Builder;)V", "value", "Landroidx/car/app/model/CarText;", "title", "getTitle", "()Landroidx/car/app/model/CarText;", "subtitle", "getSubtitle", "Landroidx/car/app/model/CarIcon;", "image", "getImage", "()Landroidx/car/app/model/CarIcon;", "", "initialValue", "getInitialValue", "()I", "minValue", "getMinValue", "Landroidx/car/app/model/InputCallbackDelegate;", "onValueChangeListener", "getOnValueChangeListener", "()Landroidx/car/app/model/InputCallbackDelegate;", "equals", "", "other", "", "hashCode", "toString", "", "toBuilder", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class CheckoutItem implements uf {
    private CarIcon image;
    private int initialValue;
    private int minValue;
    private uc onValueChangeListener;
    private CarText subtitle;
    private CarText title;

    private CheckoutItem(gjp gjpVar) {
        this();
        CarText carText = gjpVar.a;
        if (carText == null) {
            affa.d("title");
            carText = null;
        }
        this.title = carText;
        this.subtitle = gjpVar.b;
        this.image = gjpVar.c;
        this.initialValue = gjpVar.d;
        this.minValue = gjpVar.e;
        this.onValueChangeListener = gjpVar.f;
    }

    public boolean equals(Object other) {
        if (!(other instanceof CheckoutItem)) {
            return false;
        }
        CheckoutItem checkoutItem = (CheckoutItem) other;
        return affa.f(getTitle(), checkoutItem.getTitle()) && this.subtitle == checkoutItem.subtitle && affa.f(this.image, checkoutItem.image) && this.initialValue == checkoutItem.initialValue && this.minValue == checkoutItem.minValue && affa.f(this.onValueChangeListener, checkoutItem.onValueChangeListener);
    }

    public final CarIcon getImage() {
        return this.image;
    }

    public final int getInitialValue() {
        return this.initialValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final uc getOnValueChangeListener() {
        return this.onValueChangeListener;
    }

    public final CarText getSubtitle() {
        return this.subtitle;
    }

    public final CarText getTitle() {
        CarText carText = this.title;
        if (carText != null) {
            return carText;
        }
        affa.d("title");
        return null;
    }

    public int hashCode() {
        return Objects.hash(getTitle(), this.subtitle, this.image, Integer.valueOf(this.initialValue), Integer.valueOf(this.minValue), this.onValueChangeListener);
    }

    public final gjp toBuilder() {
        gjp gjpVar = new gjp();
        CarText title = getTitle();
        title.getClass();
        gjpVar.a = title;
        CarText carText = this.subtitle;
        if (carText != null) {
            gjpVar.b = carText;
        }
        CarIcon carIcon = this.image;
        if (carIcon != null) {
            gjpVar.c = carIcon;
        }
        gjpVar.d = this.initialValue;
        gjpVar.e = this.minValue;
        gjpVar.f = this.onValueChangeListener;
        return gjpVar;
    }

    public String toString() {
        return "CheckoutItem() - [title:  " + CarText.toShortString(getTitle()) + ", subtitle: " + CarText.toShortString(this.subtitle) + ", image: " + this.image + ", initialValue: " + this.initialValue + ", minValue: " + this.minValue + ", onValueChangeListener: " + this.onValueChangeListener + "]";
    }

    public /* synthetic */ CheckoutItem(gjp gjpVar, afeu afeuVar) {
        this(gjpVar);
    }

    private CheckoutItem() {
    }
}
