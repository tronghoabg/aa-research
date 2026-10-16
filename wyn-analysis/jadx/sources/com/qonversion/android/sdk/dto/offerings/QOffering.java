package com.qonversion.android.sdk.dto.offerings;

import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import ff.v;
import hb.InterfaceC2812o;
import hb.s;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "", "offeringID", "", "tag", "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "products", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;Ljava/util/List;)V", "getOfferingID", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "getTag", "()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "equals", "", "other", "hashCode", "", "productForID", "id", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QOffering {

    @NotNull
    private final String offeringID;

    @NotNull
    private final List<QProduct> products;

    @NotNull
    private final QOfferingTag tag;

    public QOffering(@InterfaceC2812o(name = "id") @NotNull String offeringID, @InterfaceC2812o(name = "tag") @NotNull QOfferingTag tag, @InterfaceC2812o(name = "products") @NotNull List<QProduct> products) {
        AbstractC3340k.e(offeringID, "offeringID");
        AbstractC3340k.e(tag, "tag");
        AbstractC3340k.e(products, "products");
        this.offeringID = offeringID;
        this.tag = tag;
        this.products = products;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof QOffering)) {
            return false;
        }
        QOffering qOffering = (QOffering) other;
        return AbstractC3340k.a(qOffering.offeringID, this.offeringID) && qOffering.tag == this.tag && ExtensionsKt.equalsIgnoreOrder(qOffering.products, this.products);
    }

    @NotNull
    public final String getOfferingID() {
        return this.offeringID;
    }

    @NotNull
    public final List<QProduct> getProducts() {
        return this.products;
    }

    @NotNull
    public final QOfferingTag getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.offeringID.hashCode();
    }

    @Nullable
    public final QProduct productForID(@NotNull String id2) {
        Object next;
        AbstractC3340k.e(id2, "id");
        Iterator<T> it = this.products.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC3340k.a(((QProduct) next).getQonversionID(), id2)) {
                break;
            }
        }
        return (QProduct) next;
    }

    @NotNull
    public String toString() {
        return "QOffering(offeringID=" + this.offeringID + ", tag=" + this.tag + ", products=" + this.products + ")";
    }

    public /* synthetic */ QOffering(String str, QOfferingTag qOfferingTag, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, qOfferingTag, (i5 & 4) != 0 ? v.f35432a : list);
    }
}
