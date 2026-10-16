package defpackage;

import android.os.IBinder;
import com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zvk extends IIndoorBuildingDelegate.Stub {
    private final zys a;
    private final sm b;
    private final sm c;

    public zvk(sm smVar, sm smVar2, zys zysVar) {
        zkt.n(smVar, "indoorState");
        this.b = smVar;
        this.c = smVar2;
        zkt.n(zysVar, "log");
        this.a = zysVar;
    }

    private final String a() {
        return ((toc) this.c.F()).f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zvk) {
            return this.c.F().equals(((zvk) obj).c.F());
        }
        return false;
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
    public final boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
        return equals(iIndoorBuildingDelegate);
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
    public final int getActiveLevelIndex() {
        this.a.b(aahu.INDOOR_GET_ACTIVE_LEVEL);
        return this.b.I(this.c);
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
    public final int getDefaultLevelIndex() {
        this.a.b(aahu.INDOOR_GET_DEFAULT_LEVEL);
        return this.c.D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
    public final List<IBinder> getLevels() {
        yfq yfqVarE = this.c.E();
        ArrayList arrayList = new ArrayList(yfqVarE.size());
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new zvl(this.b, (erb) yfqVarE.get(i), this.a));
        }
        return arrayList;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    @Override // com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate
    public final boolean isUnderground() {
        this.a.b(aahu.INDOOR_IS_UNDERGROUND);
        return this.c.G();
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("id", a());
        zsaVarA.e("number of level: ", this.c.E().size());
        return zsaVarA.toString();
    }
}
