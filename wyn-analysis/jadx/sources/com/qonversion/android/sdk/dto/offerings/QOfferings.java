package com.qonversion.android.sdk.dto.offerings;

import com.qonversion.android.sdk.internal.ExtensionsKt;
import ff.v;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "", "main", "Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "availableOfferings", "", "(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V", "getAvailableOfferings", "()Ljava/util/List;", "getMain", "()Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "offeringForID", "id", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QOfferings {

    @NotNull
    private final List<QOffering> availableOfferings;

    @Nullable
    private final QOffering main;

    public QOfferings(@Nullable QOffering qOffering, @NotNull List<QOffering> availableOfferings) {
        AbstractC3340k.e(availableOfferings, "availableOfferings");
        this.main = qOffering;
        this.availableOfferings = availableOfferings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QOfferings copy$default(QOfferings qOfferings, QOffering qOffering, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qOffering = qOfferings.main;
        }
        if ((i5 & 2) != 0) {
            list = qOfferings.availableOfferings;
        }
        return qOfferings.copy(qOffering, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final QOffering getMain() {
        return this.main;
    }

    @NotNull
    public final List<QOffering> component2() {
        return this.availableOfferings;
    }

    @NotNull
    public final QOfferings copy(@Nullable QOffering main, @NotNull List<QOffering> availableOfferings) {
        AbstractC3340k.e(availableOfferings, "availableOfferings");
        return new QOfferings(main, availableOfferings);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof QOfferings)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        QOfferings qOfferings = (QOfferings) other;
        return AbstractC3340k.a(this.main, qOfferings.main) && ExtensionsKt.equalsIgnoreOrder(this.availableOfferings, qOfferings.availableOfferings);
    }

    @NotNull
    public final List<QOffering> getAvailableOfferings() {
        return this.availableOfferings;
    }

    @Nullable
    public final QOffering getMain() {
        return this.main;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Nullable
    public final QOffering offeringForID(@NotNull String id2) {
        Object next;
        AbstractC3340k.e(id2, "id");
        Iterator<T> it = this.availableOfferings.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC3340k.a(((QOffering) next).getOfferingID(), id2)) {
                break;
            }
        }
        return (QOffering) next;
    }

    @NotNull
    public String toString() {
        return "QOfferings(main=" + this.main + ", availableOfferings=" + this.availableOfferings + ")";
    }

    public /* synthetic */ QOfferings(QOffering qOffering, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(qOffering, (i5 & 2) != 0 ? v.f35432a : list);
    }
}
