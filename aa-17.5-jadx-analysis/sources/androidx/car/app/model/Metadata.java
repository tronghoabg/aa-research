package androidx.car.app.model;

import defpackage.rb;
import defpackage.un;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Metadata(new un());
    private final Place mPlace;

    public Metadata(un unVar) {
        this.mPlace = (Place) unVar.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metadata) {
            return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
        }
        return false;
    }

    public Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
