package defpackage;

import com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zvl extends IIndoorLevelDelegate.Stub {
    private final zys a;
    private final sm b;
    private final erb c;

    public zvl(sm smVar, erb erbVar, zys zysVar) {
        zkt.n(smVar, "indoorState");
        this.b = smVar;
        zkt.n(erbVar, "indoorLevel");
        this.c = erbVar;
        erbVar.ad();
        zkt.n(zysVar, "log");
        this.a = zysVar;
    }

    private final String a() {
        return ((toc) this.c.ad()).f();
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
    public final void activate() {
        this.a.b(aahu.INDOOR_ACTIVATE_LEVEL);
        this.b.C(this.c.ad());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zvl) {
            return this.c.ad().equals(((zvl) obj).c.ad());
        }
        return false;
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
    public final boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) {
        return equals(iIndoorLevelDelegate);
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
    public final String getName() {
        return ((tzx) this.c.a).d;
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
    public final String getShortName() {
        return this.c.ae();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("id", a());
        zsaVarA.b("name", getName());
        zsaVarA.b("shortName", getShortName());
        return zsaVarA.toString();
    }
}
