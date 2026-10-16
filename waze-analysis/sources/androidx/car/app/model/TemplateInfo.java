package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class TemplateInfo {
    private final Class<? extends Template> mTemplateClass;
    private final String mTemplateId;

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && Objects.equals(this.mTemplateId, templateInfo.mTemplateId);
    }

    public Class<? extends Template> getTemplateClass() {
        return (Class) Objects.requireNonNull(this.mTemplateClass);
    }

    public String getTemplateId() {
        return (String) Objects.requireNonNull(this.mTemplateId);
    }

    public int hashCode() {
        return Objects.hash(this.mTemplateClass, this.mTemplateId);
    }

    public TemplateInfo(Class<? extends Template> cls, String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
