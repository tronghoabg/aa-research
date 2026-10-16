package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Background;
import androidx.car.app.model.Banner;
import androidx.car.app.model.BannerElement;
import androidx.car.app.model.BannerStyle;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class had extends haw {
    public final List a;
    public final hat b;
    private final xs c;

    public had(List list, xs xsVar, hat hatVar) {
        this.a = list;
        this.c = xsVar;
        this.b = hatVar;
    }

    @Override // defpackage.haw
    public final xs a() {
        return this.c;
    }

    @Override // defpackage.haw
    public final /* bridge */ /* synthetic */ ham b(uf ufVar, geu geuVar) {
        hae haeVar;
        Banner banner = (Banner) ufVar;
        banner.getClass();
        geuVar.getClass();
        CarText title = banner.getTitle();
        if (title == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (banner.getTrailingElements().size() > 2) {
            throw new IllegalArgumentException("Banner cannot have more than 2 trailing elements.");
        }
        if (banner.getBelowActions().size() > 3) {
            throw new IllegalArgumentException("Banner cannot have more than 3 below actions.");
        }
        CarText subtitle = banner.getSubtitle();
        uq onClickDelegate = banner.getOnClickDelegate();
        fwc fwcVar = onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 10) : null;
        BannerElement leadingElement = banner.getLeadingElement();
        hab habVarE = leadingElement != null ? gzw.e(leadingElement, geuVar) : null;
        List<BannerElement> trailingElements = banner.getTrailingElements();
        trailingElements.getClass();
        ArrayList arrayList = new ArrayList();
        for (BannerElement bannerElement : trailingElements) {
            bannerElement.getClass();
            hab habVarE2 = gzw.e(bannerElement, geuVar);
            if (habVarE2 != null) {
                arrayList.add(habVarE2);
            }
        }
        List<Action> belowActions = banner.getBelowActions();
        belowActions.getClass();
        ArrayList arrayList2 = new ArrayList(woy.bp(belowActions, 10));
        for (Action action : belowActions) {
            action.getClass();
            arrayList2.add(fvr.e(action, geuVar, null));
        }
        BannerStyle style = banner.getStyle();
        if (style != null) {
            Background background = style.getBackground();
            haeVar = new hae(background != null ? fyh.b(background, geuVar) : null, style.getShape());
        } else {
            haeVar = null;
        }
        return new hac(title, subtitle, fwcVar, habVarE, arrayList, arrayList2, haeVar);
    }

    @Override // defpackage.haw
    public final /* bridge */ /* synthetic */ haw c(List list) {
        if (list.size() <= 1) {
            return new had(list, this.c, this.b);
        }
        throw new IllegalArgumentException("BannerSection cannot have more than 1 Banner");
    }

    @Override // defpackage.haw
    public final List d() {
        return this.a;
    }

    @Override // defpackage.haw
    public final boolean e() {
        return (this.a.isEmpty() && this.b == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof had)) {
            return false;
        }
        had hadVar = (had) obj;
        return affa.f(this.a, hadVar.a) && affa.f(this.c, hadVar.c) && affa.f(this.b, hadVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xs xsVar = this.c;
        int iHashCode2 = (iHashCode + (xsVar == null ? 0 : xsVar.hashCode())) * 31;
        hat hatVar = this.b;
        return iHashCode2 + (hatVar != null ? hatVar.hashCode() : 0);
    }

    public final String toString() {
        return "BannerSectionInternal(loadedItems=" + this.a + ", itemDelegate=" + this.c + ", sectionHeaderInternal=" + this.b + ")";
    }

    public had() {
        this(afbe.a, null, null);
    }
}
