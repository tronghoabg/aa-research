package androidx.room.migration.bundle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import kotlinx.b.d.a;
import kotlinx.b.d.b;
import kotlinx.b.d.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SchemaBundleKt {
    public static final int SCHEMA_LATEST_FORMAT_VERSION = 1;
    private static final b json;

    static {
        l lVar = new l() { // from class: androidx.room.migration.bundle.SchemaBundleKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SchemaBundleKt.json$lambda$2((f) obj);
            }
        };
        b bVar = b.f51195a;
        x.f(bVar, TypedValues.TransitionType.S_FROM);
        x.f(lVar, "builderAction");
        f fVar = new f(bVar);
        lVar.invoke(fVar);
        json = new b(fVar.a(), fVar.b(), null);
    }

    public static final b getJson() {
        return json;
    }

    public static /* synthetic */ void getJson$annotations() {
    }

    static final ab json$lambda$2(f fVar) {
        x.f(fVar, "$this$Json");
        fVar.e();
        fVar.f();
        fVar.c(a.f51104a);
        kotlinx.b.e.f fVar2 = new kotlinx.b.e.f();
        int i2 = ar.f48106a;
        fVar2.d(new m(BaseEntityBundle.class), new l() { // from class: androidx.room.migration.bundle.SchemaBundleKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return EntitySerializer.INSTANCE;
            }
        });
        fVar.d(fVar2.f());
        return ab.f48028a;
    }
}
