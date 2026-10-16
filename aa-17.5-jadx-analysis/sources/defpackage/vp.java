package defpackage;

import androidx.car.app.model.BannerSection;
import androidx.car.app.model.ChipSection;
import androidx.car.app.model.CondensedSection;
import androidx.car.app.model.GridSection;
import androidx.car.app.model.Header;
import androidx.car.app.model.RowSection;
import androidx.car.app.model.Section;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.SpotlightSection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class vp {
    public List a = new ArrayList();
    public final List b = new ArrayList();
    public Header c = null;
    public boolean d = false;
    public boolean e = false;
    public int f = 0;
    public int g = 1;

    public final SectionedItemTemplate a() {
        if (this.d && !this.a.isEmpty()) {
            throw new IllegalArgumentException("A template cannot both be in a loading state and have sections added");
        }
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            Section section = (Section) this.a.get(i);
            if (section instanceof ChipSection) {
                if (z) {
                    throw new IllegalArgumentException("Only one ChipSection is allowed in SectionedItemTemplate.");
                }
                if (i != 0) {
                    throw new IllegalArgumentException("ChipSection must be the first section in SectionedItemTemplate.");
                }
                z = true;
            } else if (!(section instanceof RowSection) && !(section instanceof GridSection) && !(section instanceof CondensedSection) && !(section instanceof SpotlightSection) && !(section instanceof BannerSection)) {
                throw new IllegalArgumentException("Only ChipSections, RowSections, GridSections, CondensedSections, SpotlightSections, and BannerSections are allowed in SectionedItemTemplate.");
            }
        }
        return new SectionedItemTemplate(this, null);
    }

    public final void b() {
        this.f = 1;
        this.e = true;
    }

    public final void c() {
        this.d = true;
    }

    public final void d() {
        this.g = 1;
    }
}
