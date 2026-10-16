package androidx.car.app.model.constraints;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(6)
/* loaded from: classes.dex */
public class TabContentsConstraints {
    private HashSet<Class<? extends Template>> mAllowedTemplateTypes;
    public static final TabContentsConstraints DEFAULT = new TabContentsConstraints(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class));
    public static final TabContentsConstraints API_7 = new TabContentsConstraints(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class));
    public static final TabContentsConstraints API_8 = new TabContentsConstraints(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class, SectionedItemTemplate.class));

    private TabContentsConstraints(List<Class<? extends Template>> list) {
        this.mAllowedTemplateTypes = new HashSet<>(list);
    }

    public void validateOrThrow(Template template) {
        if (!this.mAllowedTemplateTypes.contains(template.getClass())) {
            throw new IllegalArgumentException("Type is not allowed in tabs: ".concat(template.getClass().getSimpleName()));
        }
    }
}
