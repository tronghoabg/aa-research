package androidx.datastore.core;

import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DataMigrationInitializer<T> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c4 -> B:24:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c7 -> B:24:0x0097). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object runMigrations(java.util.List<? extends androidx.datastore.core.DataMigration<T>> r7, androidx.datastore.core.InitializerApi<T> r8, h.c.e<? super h.ab> r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations(java.util.List, androidx.datastore.core.InitializerApi, h.c.e):java.lang.Object");
        }

        public final <T> p<InitializerApi<T>, e<? super ab>, Object> getInitializer(List<? extends DataMigration<T>> list) {
            x.f(list, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(list, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
