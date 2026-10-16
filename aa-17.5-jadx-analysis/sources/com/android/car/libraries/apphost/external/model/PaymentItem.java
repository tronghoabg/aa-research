package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gki;
import defpackage.rb;
import defpackage.uf;
import defpackage.uq;
import j$.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0082\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u0096\u0080\u0004J\n\u0010\u001c\u001a\u00020\u001dH\u0096\u0080\u0004R\u0014\u0010\t\u001a\u00020\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/android/car/libraries/apphost/external/model/PaymentItem;", "Landroidx/car/app/model/Item;", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/PaymentItem$Builder;", "(Lcom/android/car/libraries/apphost/external/model/PaymentItem$Builder;)V", "value", "Landroidx/car/app/model/CarText;", "title", "getTitle", "()Landroidx/car/app/model/CarText;", "subtitle", "getSubtitle", "Landroidx/car/app/model/CarIcon;", "image", "getImage", "()Landroidx/car/app/model/CarIcon;", "Landroidx/car/app/model/OnClickDelegate;", "onClickDelegate", "getOnClickDelegate", "()Landroidx/car/app/model/OnClickDelegate;", "equals", "", "other", "", "hashCode", "", "toString", "", "toBuilder", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class PaymentItem implements uf {
    private CarIcon image;
    private uq onClickDelegate;
    private CarText subtitle;
    private CarText title;

    private PaymentItem(gki gkiVar) {
        this();
        CarText carText = gkiVar.a;
        if (carText == null) {
            affa.d("title");
            carText = null;
        }
        this.title = carText;
        CarText carText2 = gkiVar.b;
        if (carText2 == null) {
            affa.d("subtitle");
            carText2 = null;
        }
        this.subtitle = carText2;
        this.image = gkiVar.c;
        this.onClickDelegate = null;
    }

    public boolean equals(Object other) {
        if (!(other instanceof PaymentItem)) {
            return false;
        }
        PaymentItem paymentItem = (PaymentItem) other;
        return affa.f(getTitle(), paymentItem.getTitle()) && affa.f(getSubtitle(), paymentItem.getSubtitle()) && affa.f(this.image, paymentItem.image) && affa.f(this.onClickDelegate, paymentItem.onClickDelegate);
    }

    public final CarIcon getImage() {
        return this.image;
    }

    public final uq getOnClickDelegate() {
        return this.onClickDelegate;
    }

    public final CarText getSubtitle() {
        CarText carText = this.subtitle;
        if (carText != null) {
            return carText;
        }
        affa.d("subtitle");
        return null;
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
        return Objects.hash(getTitle(), getSubtitle(), this.image, this.onClickDelegate);
    }

    public final gki toBuilder() {
        gki gkiVar = new gki();
        CarText title = getTitle();
        title.getClass();
        gkiVar.a = title;
        CarText subtitle = getSubtitle();
        subtitle.getClass();
        gkiVar.b = subtitle;
        CarIcon carIcon = this.image;
        if (carIcon != null) {
            gkiVar.c = carIcon;
        }
        return gkiVar;
    }

    public String toString() {
        return "PaymentItem() - [title: " + CarText.toShortString(getTitle()) + ", subtitle: " + CarText.toShortString(getSubtitle()) + ", image: " + this.image + "]";
    }

    public /* synthetic */ PaymentItem(gki gkiVar, afeu afeuVar) {
        this(gkiVar);
    }

    private PaymentItem() {
    }
}
