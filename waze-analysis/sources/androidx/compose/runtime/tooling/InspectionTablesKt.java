package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InspectionTablesKt {
    private static final ProvidableCompositionLocal<Set<CompositionData>> LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.runtime.tooling.InspectionTablesKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            int i2 = InspectionTablesKt.f1671a;
            return null;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1671a = 0;

    static final Set LocalInspectionTables$lambda$0() {
        return null;
    }

    public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() {
        return LocalInspectionTables;
    }
}
