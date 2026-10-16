package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Chip;
import androidx.car.app.model.ChipStyle;
import java.util.List;

/* loaded from: classes2.dex */
public final class hai extends haw {
    public final CarText a;
    public final haj b;
    public final afeg c;
    public final List d;
    public final hat e;
    private final xs f;

    public hai(CarText carText, haj hajVar, afeg afegVar, List list, xs xsVar, hat hatVar) {
        this.a = carText;
        this.b = hajVar;
        this.c = afegVar;
        this.d = list;
        this.f = xsVar;
        this.e = hatVar;
    }

    @Override // defpackage.haw
    public final xs a() {
        return this.f;
    }

    @Override // defpackage.haw
    public final /* bridge */ /* synthetic */ ham b(uf ufVar, geu geuVar) {
        geu geuVar2;
        gag gagVarA;
        Chip chip = (Chip) ufVar;
        chip.getClass();
        geuVar.getClass();
        CarText title = chip.getTitle();
        CarIcon startIcon = chip.getStartIcon();
        if (startIcon != null) {
            geuVar2 = geuVar;
            gagVarA = gai.a(startIcon, geuVar2, null, null, null, 14);
        } else {
            geuVar2 = geuVar;
            gagVarA = null;
        }
        CarIcon endIcon = chip.getEndIcon();
        gag gagVarA2 = endIcon != null ? gai.a(endIcon, geuVar2, null, null, null, 14) : null;
        boolean zIsSelected = chip.isSelected();
        fwc fwcVar = new fwc(geuVar2, chip, 12);
        ChipStyle style = chip.getStyle();
        return new hah(title, gagVarA, gagVarA2, zIsSelected, fwcVar, style != null ? gnz.d(style) : null);
    }

    @Override // defpackage.haw
    public final /* synthetic */ haw c(List list) {
        return new hai(this.a, this.b, this.c, list, this.f, this.e);
    }

    @Override // defpackage.haw
    public final List d() {
        return this.d;
    }

    @Override // defpackage.haw
    public final boolean e() {
        return (this.d.isEmpty() && this.a == null && this.e == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hai)) {
            return false;
        }
        hai haiVar = (hai) obj;
        return affa.f(this.a, haiVar.a) && affa.f(this.b, haiVar.b) && affa.f(this.c, haiVar.c) && affa.f(this.d, haiVar.d) && affa.f(this.f, haiVar.f) && affa.f(this.e, haiVar.e);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        haj hajVar = this.b;
        int iHashCode2 = hajVar == null ? 0 : hajVar.hashCode();
        int i = iHashCode * 31;
        afeg afegVar = this.c;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (afegVar == null ? 0 : afegVar.hashCode())) * 31) + this.d.hashCode()) * 31;
        xs xsVar = this.f;
        int iHashCode4 = (iHashCode3 + (xsVar == null ? 0 : xsVar.hashCode())) * 31;
        hat hatVar = this.e;
        return iHashCode4 + (hatVar != null ? hatVar.hashCode() : 0);
    }

    public final String toString() {
        return "FilterChipSectionInternal(sectionTitle=" + this.a + ", sectionStyle=" + this.b + ", onItemVisibilityChanged=" + this.c + ", loadedItems=" + this.d + ", itemDelegate=" + this.f + ", sectionHeaderInternal=" + this.e + ")";
    }

    public hai() {
        this(null, null, null, afbe.a, null, null);
    }
}
