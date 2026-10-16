package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.TabContentsConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes2.dex */
public class TabContents implements Content {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final Template mTemplate;

    /* compiled from: WazeSource */
    public final class Builder {
        Template mTemplate;

        public Builder(Template template) {
            TabContentsConstraints.API_8.validateOrThrow((Template) Objects.requireNonNull(template));
            this.mTemplate = template;
        }

        public TabContents build() {
            return new TabContents(this);
        }
    }

    TabContents(Builder builder) {
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
        return (Template) Objects.requireNonNull(this.mTemplate);
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
