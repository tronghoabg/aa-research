package androidx.car.app.navigation.model.constraints;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.Template;
import com.google.d.d.ci;

/* compiled from: WazeSource */
@RequiresCarApi(7)
/* loaded from: classes2.dex */
public class ContentTemplateConstraints {
    public static final ContentTemplateConstraints MAP_WITH_CONTENT_TEMPLATE_CONSTRAINTS = new ContentTemplateConstraints(ci.s(GridTemplate.class, MessageTemplate.class, ListTemplate.class, PaneTemplate.class));
    public static final ContentTemplateConstraints MAP_WITH_CONTENT_TEMPLATE_CONSTRAINTS_API_8 = new ContentTemplateConstraints(ci.t(GridTemplate.class, MessageTemplate.class, ListTemplate.class, PaneTemplate.class, SectionedItemTemplate.class));
    public static final ContentTemplateConstraints TAB_CONTENTS_CONSTRAINTS = new ContentTemplateConstraints(ci.t(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class));
    private ci<Class<? extends Template>> mAllowedTemplateTypes;

    private ContentTemplateConstraints(ci<Class<? extends Template>> ciVar) {
        this.mAllowedTemplateTypes = ciVar;
    }

    public void validateOrThrow(Template template) {
        if (!this.mAllowedTemplateTypes.contains(template.getClass())) {
            throw new IllegalArgumentException(String.valueOf(template.getClass().getSimpleName()).concat(" is not allowed as content within the parent template"));
        }
    }
}
