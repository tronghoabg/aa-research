package defpackage;

import android.content.Context;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.Section;
import androidx.car.app.model.SectionedItemTemplate;
import java.util.List;

/* loaded from: classes2.dex */
public final class gho implements ghq, hem {
    public boolean a;

    @Override // defpackage.ghq
    public final /* bridge */ /* synthetic */ boolean b(wb wbVar, wb wbVar2, int i) {
        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) wbVar;
        SectionedItemTemplate sectionedItemTemplate2 = (SectionedItemTemplate) wbVar2;
        sectionedItemTemplate.getClass();
        sectionedItemTemplate2.getClass();
        if (this.a) {
            this.a = false;
            return true;
        }
        if (sectionedItemTemplate2.isLoading()) {
            return true;
        }
        if (sectionedItemTemplate.isLoading()) {
            return false;
        }
        Header header = sectionedItemTemplate2.getHeader();
        CarText title = header != null ? header.getTitle() : null;
        Header header2 = sectionedItemTemplate.getHeader();
        if (!affa.f(title, header2 != null ? header2.getTitle() : null) || sectionedItemTemplate2.getSections().size() != sectionedItemTemplate.getSections().size()) {
            return false;
        }
        List<Section<?>> sections = sectionedItemTemplate2.getSections();
        sections.getClass();
        List<Section<?>> sections2 = sectionedItemTemplate.getSections();
        sections2.getClass();
        List<aezu> listCi = woy.ci(sections, sections2);
        if (listCi.isEmpty()) {
            return true;
        }
        for (aezu aezuVar : listCi) {
            Section section = (Section) aezuVar.a;
            Section section2 = (Section) aezuVar.b;
            if (!affa.f(section.getTitle(), section2.getTitle()) || !affa.f(section.getSectionHeader(), section2.getSectionHeader())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ghq
    public final /* synthetic */ List c(wb wbVar, wb wbVar2) {
        int i = yfq.d;
        return yls.a;
    }

    @Override // defpackage.ghq
    public final /* synthetic */ void a(Context context, wb wbVar) {
    }
}
