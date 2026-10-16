package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.TabContentsConstraints;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes.dex */
public class TabContents implements Content {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final Template mTemplate;

    public TabContents(Builder builder) {
        this.mTemplate = builder.mTemplate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    @Override // androidx.car.app.model.Content
    public String getContentId() {
        return CONTENT_ID;
    }

    public Template getTemplate() {
        Template template = this.mTemplate;
        Objects.requireNonNull(template);
        return template;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Template mTemplate;

        public Builder(Template template) {
            TabContentsConstraints tabContentsConstraints = TabContentsConstraints.API_7;
            Objects.requireNonNull(template);
            tabContentsConstraints.validateOrThrow(template);
            this.mTemplate = template;
        }

        public TabContents build() {
            return new TabContents(this);
        }

        public Builder(Template template, boolean z) {
            if (z) {
                TabContentsConstraints tabContentsConstraints = TabContentsConstraints.API_8;
                Objects.requireNonNull(template);
                tabContentsConstraints.validateOrThrow(template);
            } else {
                TabContentsConstraints tabContentsConstraints2 = TabContentsConstraints.API_7;
                Objects.requireNonNull(template);
                tabContentsConstraints2.validateOrThrow(template);
            }
            this.mTemplate = template;
        }
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
