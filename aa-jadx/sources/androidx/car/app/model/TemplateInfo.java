package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class TemplateInfo {
    private final java.lang.Class<? extends defpackage.wi> mTemplateClass;
    private final java.lang.String mTemplateId;

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.TemplateInfo)) {
            return false;
        }
        androidx.car.app.model.TemplateInfo templateInfo = (androidx.car.app.model.TemplateInfo) obj;
        return j$.util.Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && j$.util.Objects.equals(this.mTemplateId, templateInfo.mTemplateId);
    }

    public java.lang.Class<? extends defpackage.wi> getTemplateClass() {
        java.lang.Class<? extends defpackage.wi> cls = this.mTemplateClass;
        cls.getClass();
        return cls;
    }

    public java.lang.String getTemplateId() {
        java.lang.String str = this.mTemplateId;
        str.getClass();
        return str;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTemplateClass, this.mTemplateId);
    }

    public TemplateInfo(java.lang.Class<? extends defpackage.wi> cls, java.lang.String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
