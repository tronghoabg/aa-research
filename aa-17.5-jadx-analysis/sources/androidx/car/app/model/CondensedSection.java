package androidx.car.app.model;

import defpackage.rb;
import defpackage.tu;
import defpackage.tv;

@rb
/* loaded from: classes2.dex */
public final class CondensedSection extends Section<CondensedItem> {
    /* synthetic */ CondensedSection(tu tuVar, tv tvVar) {
        this(tuVar);
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CondensedSection) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "CondensedSection { " + super.toString() + " }";
    }

    private CondensedSection() {
    }

    private CondensedSection(tu tuVar) {
        super(tuVar);
    }
}
