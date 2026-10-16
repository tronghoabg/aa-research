package androidx.car.app.navigation.model.constraints;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.Template;
import defpackage.n5;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(7)
/* loaded from: classes.dex */
public class ContentTemplateConstraints {
    public static final ContentTemplateConstraints MAP_WITH_CONTENT_TEMPLATE_CONSTRAINTS = new ContentTemplateConstraints(n5.f(new Object[]{GridTemplate.class, MessageTemplate.class, ListTemplate.class, PaneTemplate.class}, 4));
    public static final ContentTemplateConstraints TAB_CONTENTS_CONSTRAINTS = new ContentTemplateConstraints(n5.f(new Object[]{ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class}, 5));
    private n5 mAllowedTemplateTypes;

    private ContentTemplateConstraints(n5 n5Var) {
        this.mAllowedTemplateTypes = n5Var;
    }

    public void validateOrThrow(Template template) {
        if (!this.mAllowedTemplateTypes.contains(template.getClass())) {
            throw new IllegalArgumentException(template.getClass().getSimpleName().concat(" is not allowed as content within the parent template"));
        }
    }
}
